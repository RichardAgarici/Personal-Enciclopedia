package org.example.solid.interfaceSegregation;

public class BearKeeperExample1 implements BearCleaner, BearFeeder {
    @Override
    public void washTheBear() {
        System.out.println("Washing the bear.");
    }

    @Override
    public void feedTheBear() {
        System.out.println("Feed the bear.");
    }
}
