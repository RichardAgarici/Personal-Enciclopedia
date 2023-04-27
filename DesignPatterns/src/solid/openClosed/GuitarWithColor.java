package org.example.solid.openClosed;

public class GuitarWithColor extends Guitar {

    private String color;

    public GuitarWithColor(String make, String model, int volume, String color) {
        super(make, model, volume);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
