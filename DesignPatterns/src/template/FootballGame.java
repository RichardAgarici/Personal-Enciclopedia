package template;

public class FootballGame extends Game{
    @Override
    void initialize() {
        System.out.println("Football Game Initialized.");
    }

    @Override
    void startPlay() {
        System.out.println("Football game Started.");
    }

    @Override
    void endPlay() {
        System.out.println("Football game Ended.");
    }

}
