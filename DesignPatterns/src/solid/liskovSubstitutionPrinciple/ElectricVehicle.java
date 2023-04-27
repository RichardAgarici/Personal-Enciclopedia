package org.example.solid.liskovSubstitutionPrinciple;

public class ElectricVehicle implements Car {

    @Override
    public void turnOnEngine() {
        System.out.println("No engine");
    }

    @Override
    public void accelerate() {
        System.out.println("No engine");
    }
}
