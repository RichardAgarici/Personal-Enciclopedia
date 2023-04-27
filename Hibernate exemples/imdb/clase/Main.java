package org.example;

import org.example.imdb.config.HibernateConfig;
import org.example.imdb.entity.*;
import org.example.imdb.repository.*;
import org.example.imdb.service.GenreService;
import org.example.imdb.service.MovieService;
import org.example.imdb.service.ReviewService;
import org.example.imdb.service.impl.GenreServiceConsoleImpl;
import org.example.imdb.service.impl.MovieServiceConsoleImpl;
import org.example.imdb.service.impl.ReviewServiceConsoleImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.Date;

public class Main {

    private static final AppUserRepository appUserRepository = new AppUserRepository(HibernateConfig.getHibernateSessionFactory());
    private static final GenreRepository genreRepository = new GenreRepository(HibernateConfig.getHibernateSessionFactory());
    private static final MovieRepository movieRepository = new MovieRepository(HibernateConfig.getHibernateSessionFactory());
    private static final ReviewRepository reviewRepository = new ReviewRepository(HibernateConfig.getHibernateSessionFactory());
    private static final ActorRepository actorRepository = new ActorRepository(HibernateConfig.getHibernateSessionFactory());
    private static final CastingRepository castingRepository = new CastingRepository(HibernateConfig.getHibernateSessionFactory());



    private static final GenreService genreService = new GenreServiceConsoleImpl(genreRepository);
    private static final MovieService movieService = new MovieServiceConsoleImpl(movieRepository, genreRepository);
    private static final ReviewService reviewService = new ReviewServiceConsoleImpl(reviewRepository, appUserRepository, movieRepository);

    public static void main(String[] args) {
        try {
            initializeDatabase();
            Menu.enterGeneralMenu(genreService, movieService, reviewService);
//            verifyMovieTag(sessionFactory);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateConfig.closeHibernateSessionFactory();
        }
    }

    private static void verifyMovieTag(SessionFactory sessionFactory) {
        Genre horror = new Genre("Horror", "Scary movie that terrifies the audience");
        genreRepository.create(horror);
        System.out.println(horror);


        Movie sleepyHollow = new Movie("Sleepy Hollow", Date.valueOf("1999-05-12"), horror);
        Tag parentAdvisory = new Tag("parent advisory");
        Tag imdbTop100 = new Tag("imdb top 100");
        Tag horrorTag = new Tag("horror-movie");

        sleepyHollow.addTag(parentAdvisory);
        sleepyHollow.addTag(imdbTop100);
        sleepyHollow.addTag(horrorTag);

        sleepyHollow = movieRepository.create(sleepyHollow);
        System.out.println(sleepyHollow);

        Movie residentEvil = new Movie("Residen Evil", Date.valueOf("2002-04-13"), horror);
        residentEvil.addTag(imdbTop100);
        movieRepository.create(residentEvil);

        System.out.println(movieRepository.findAll());
//
//        sleepyHollow.removeTag(imdbTop100);
//        sleepyHollow = movieRepository.update(sleepyHollow);
//        System.out.println(movieRepository.findAll());
//
//        movieRepository.remove(sleepyHollow.getId());
//        System.out.println(movieRepository.findAll());

        Session session = sessionFactory.openSession();
        Transaction t = session.beginTransaction();
        Actor johnyDepp = new Actor("Johnny", "Depp", Date.valueOf("1963-12-23"));
        Actor christinaRicci = new Actor("Christina", "Ricci", Date.valueOf("1980-02-12"));

        session.persist(johnyDepp);
        session.persist(christinaRicci);

//        Casting shCasting = new Casting(new CastingId(sleepyHollow.getId(), johnyDepp.getId()), sleepyHollow, johnyDepp, 1000);
//        Casting shCasting2 = new Casting(new CastingId(sleepyHollow.getId(), christinaRicci.getId()), sleepyHollow, christinaRicci, 500);

//        Casting shCasting = new Casting(sleepyHollow.getId(), johnyDepp.getId(), 1000);
//        Casting shCasting2 = new Casting(sleepyHollow.getId(), christinaRicci.getId(), 500);

        Casting shCasting = new Casting(new CastingId(sleepyHollow.getId(), johnyDepp.getId()), 1000);
        Casting shCasting2 = new Casting(new CastingId(sleepyHollow.getId(), christinaRicci.getId()), 1500);


        session.merge(shCasting);
        session.merge(shCasting2);
        t.commit();
        session.close();
        System.out.println(movieRepository.findAll());


    }

    public static void method1(SessionFactory hibernateSessionFactory) {
        Session session = hibernateSessionFactory.openSession();
        Transaction t = session.beginTransaction();
        Genre horror = new Genre("Horror", "Scary movie that terrifies the audience");
        Movie sleepyHollow = new Movie("Sleepy Hollow", Date.valueOf("1999-05-12"), horror);

        session.persist(horror);
        horror.setName("horror2");
        session.persist(sleepyHollow);

        t.commit();
        session.close();
    }

    private static void eachWithDifferentSession(SessionFactory hibernateSessionFactory) {
        GenreRepository genreRepository = new GenreRepository(hibernateSessionFactory);
        MovieRepository movieRepository = new MovieRepository(hibernateSessionFactory);
        Genre horror = new Genre("Horror", "Scary movie that terrifies the audience");
        Movie sleepyHollow = new Movie("Sleepy Hollow", Date.valueOf("1999-05-12"), horror);
        genreRepository.create(horror);
        horror.setName("horror2");
        movieRepository.create(sleepyHollow);
        System.out.println();
    }

    private static void allInOneSession(SessionFactory hibernateSessionFactory) {
        Session session = hibernateSessionFactory.openSession();
        Transaction t = session.beginTransaction();
        AppUser iulia = new AppUser("iulia@gmail.com", "123");
        session.persist(iulia);

        Genre horror = new Genre("Horror", "Scary movie that terrifies the audience");
        session.persist(horror);

        Actor johnyDepp = new Actor("Johnny", "Depp", Date.valueOf("1963-12-23"));
        Actor christinaRicci = new Actor("Christina", "Ricci", Date.valueOf("1980-02-12"));
        Movie sleepyHollow = new Movie("Sleepy Hollow", Date.valueOf("1999-05-12"), horror);
//        sleepyHollow.addActor(johnyDepp);
//        sleepyHollow.addActor(christinaRicci);


//        Review goodReview = new Review(iulia, 8, Date.valueOf("2020-10-15"), "A good film", sleepyHollow);
//        Review badReview = new Review(iulia, 2, Date.valueOf("2002-10-15"), "Crap", sleepyHollow);
//        session.persist(goodReview);
//        session.persist(badReview);

        session.persist(sleepyHollow);


        System.out.println(horror);
        System.out.println(sleepyHollow);
        System.out.println(johnyDepp);
        System.out.println(christinaRicci);

        t.commit();
        session.close();


        Session session2 = hibernateSessionFactory.openSession();


        session2.beginTransaction();
        System.out.println(session2.createQuery("from Movie", Movie.class).getResultList());
        session2.close();
    }

    private static void initializeDatabase() {

        AppUser iulia = new AppUser("iulia@gmail.com", "123");
        AppUser mihai = new AppUser("mihai@gmail.com", "456");
        iulia = appUserRepository.create(iulia);
        mihai = appUserRepository.create(mihai);


        Genre horror = new Genre("Horror", "Scary movie that terrifies the audience");
        Genre fantasy = new Genre("Fantasy", "A world beyond imagination");
        Genre action = new Genre("Action", "Fast paced with lots of bam boom bing");
        horror = genreRepository.create(horror);
        fantasy = genreRepository.create(fantasy);
        action = genreRepository.create(action);

        Movie sleepyHollow = new Movie("Sleepy Hollow", Date.valueOf("1999-05-12"), horror);
        Movie residentEvil = new Movie("Resident Evil", Date.valueOf("2005-10-13"), horror);
        Movie chocolateFactory = new Movie("Charlie and the chocolate factory", Date.valueOf("2000-07-12"), fantasy);

        Tag parentAdvisory = new Tag("parent advisory");
        Tag imdbTop100 = new Tag("imdb top 100");
        Tag horrorTag = new Tag("horror-movie");

        sleepyHollow.addTag(parentAdvisory);
        sleepyHollow.addTag(imdbTop100);
        sleepyHollow.addTag(horrorTag);

        residentEvil.addTag(parentAdvisory);
        residentEvil.addTag(horrorTag);

        sleepyHollow = movieRepository.create(sleepyHollow);
        residentEvil = movieRepository.create(residentEvil);
        chocolateFactory = movieRepository.create(chocolateFactory);

        Review goodReview = new Review(iulia, 8, Date.valueOf("2020-10-15"), "A good film", sleepyHollow);
        Review badReview = new Review(mihai, 4, Date.valueOf("2020-12-11"), "A bad film", sleepyHollow);

        goodReview = reviewRepository.create(goodReview);
        badReview = reviewRepository.create(badReview);

        Actor johnyDepp = new Actor("Johnny", "Depp", Date.valueOf("1963-12-23"));
        Actor christinaRicci = new Actor("Christina", "Ricci", Date.valueOf("1980-02-12"));

        johnyDepp = actorRepository.create(johnyDepp);
        christinaRicci = actorRepository.create(christinaRicci);

        Casting jdCasting1 = new Casting(new CastingId(sleepyHollow.getId(), johnyDepp.getId()), 1000);
        Casting jdCasting2 = new Casting(new CastingId(chocolateFactory.getId(), johnyDepp.getId()), 2000);
        Casting crCasting1 = new Casting(new CastingId(sleepyHollow.getId(), christinaRicci.getId()), 1200);

        castingRepository.create(jdCasting1);
        castingRepository.create(jdCasting2);
        castingRepository.create(crCasting1);

        System.out.println("Johny Depp played in: " + castingRepository.getMoviesOfActor(johnyDepp.getId()));

        Movie movieWithActors = movieRepository.getMovieWithActors(sleepyHollow.getId());
        System.out.println(movieWithActors + " " + movieWithActors.getActors());
        System.out.println("Finished initializing");
    }
}