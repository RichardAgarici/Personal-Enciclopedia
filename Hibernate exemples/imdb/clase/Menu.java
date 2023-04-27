package org.example;

import org.example.imdb.service.GenericService;
import org.example.imdb.service.GenreService;
import org.example.imdb.service.MovieService;
import org.example.imdb.service.ReviewService;

import java.util.Scanner;

public class Menu {

    private static Scanner keyboard = new Scanner(System.in);

    public static void enterGeneralMenu(GenreService genreService, MovieService movieService, ReviewService reviewService) {
        String userInput = null;
        boolean exitCommand = false;

        while (!exitCommand) {
            System.out.println();
            System.out.println("========================== MENIU PRINCIPAL ==========================");
            System.out.println("Alegeți una dintre optiuni sau tastați exit pentru a părăsi meniul:");
            System.out.println("\t1. Genuri");
            System.out.println("\t2. Filme");
            System.out.println("\t3. Review");

            userInput = keyboard.nextLine();

            switch (userInput) {
                case ("1"):
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~ GENURI CINEMATOGRAFIICE ~~~~~~~~~~~~~~~~~~~~~~");
                    displaySpecificMenu(genreService);
                    break;
                case ("2"):
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ FILME ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    displaySpecificMenu(movieService);
                    break;
                case ("3"):
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ REVIEW-uri ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    displaySpecificMenu(reviewService);
                    break;
                case ("exit"):
                    exitCommand = true;
                    break;
                default:
                    System.out.println("Optiune invalida, tastați exit pentru a parasi meniul.");
            }
        }
    }

    public static int displaySpecificMenu(GenericService service) {
        String userInput = null;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Alegeți una dintre optiuni:");
            System.out.println("\t1. Adaugati");
            System.out.println("\t2. Vizualizati");
            System.out.println("\t3. Modificati");
            System.out.println("\t4. Stergeti");

            userInput = keyboard.nextLine();

            switch (userInput) {
                case ("1"):
                    validInput = true;
                    // add()
                    service.add();
                    break;
                case ("2"):
                    validInput = true;
                    service.displayAll();
                    break;
                case ("3"):
                    validInput = true;
                    break;
                case ("4"):
                    validInput = true;
                    break;
                default:
                    System.out.println("Optiune invalida.");
            }
        }
        return Integer.valueOf(userInput);
    }
}
