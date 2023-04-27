package org.example.observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel channel1 = new NewsChannel();
        SportChannel channel2 = new SportChannel();

        observable.addObserver(channel1);
        observable.addObserver(channel2);
        observable.setNews("Noua stire");
        System.out.println("Channel 1: " + channel1.getNews());
        System.out.println("Channel 2: " + channel2.getSportsNews());
    }
}
