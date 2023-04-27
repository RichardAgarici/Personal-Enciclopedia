package org.example.template;

public class HandballGame extends Game{
    @Override
    void initialize() {
        System.out.println("Handball Game Initialized.");
    }

    @Override
    void startPlay() {
        System.out.println("Handball Game Started");
    }

    @Override
    void endPlay() {
        System.out.println("Handball Game Ended.");
    }

}
