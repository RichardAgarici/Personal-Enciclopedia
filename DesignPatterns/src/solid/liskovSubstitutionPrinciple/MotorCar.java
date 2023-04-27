package solid.liskovSubstitutionPrinciple;

public class MotorCar implements Car {

    private Engine engine;

    public MotorCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void turnOnEngine() {
        engine.on();
    }

    @Override
    public void accelerate() {
        engine.powerOn(1000);
    }
}
