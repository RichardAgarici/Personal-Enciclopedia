package observer;

public class NewsChannel implements Channel{

    private String news;

    @Override
    public void update(String news) {
        this.news = news;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
