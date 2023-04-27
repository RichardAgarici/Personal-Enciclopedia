package org.example.template;

public class Main {
    private boolean valid;
    private int index;

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static void main(String[] args) {
        Game game = new FootballGame();
        game.play();
        Game game2 = new HandballGame();
        game2.play();

        int measureTimeElapsedInSeconds;
        boolean valid;
    }
}
