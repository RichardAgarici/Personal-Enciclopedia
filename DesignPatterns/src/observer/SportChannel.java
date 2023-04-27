package observer;

public class SportChannel implements Channel{

    private String sportsNews;

    @Override
    public void update(String news) {
        this.sportsNews = news;
    }

    public String getSportsNews() {
        return sportsNews;
    }

    public void setSportsNews(String sportsNews) {
        this.sportsNews = sportsNews;
    }
}
