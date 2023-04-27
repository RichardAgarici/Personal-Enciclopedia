package org.example.adapter;

public class Main {
    public static void main(String[] args) {
        Movable usCar = new USCar();
        MovableAdapter adapter = new MovableAdapterImpl(usCar);
        System.out.println(adapter.getSpeed());
    }
}
