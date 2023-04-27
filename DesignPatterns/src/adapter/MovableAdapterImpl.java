package org.example.adapter;

public class MovableAdapterImpl implements MovableAdapter{
    private Movable usCars;

    public MovableAdapterImpl(Movable usCars) {
        this.usCars = usCars;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(usCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.6;
    }
}
