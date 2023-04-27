package solid.liskovSubstitutionPrinciple;

public class Engine {
    private String name;
    private String type;
    private int power;

    public Engine(String name, String type, int power) {
        this.name = name;
        this.type = type;
        this.power = power;
    }

    public void on(){
        System.out.println("Engine on ");
    }

    public void powerOn(int acceleration) {
        System.out.println("Acceleration " + acceleration);
    }
}
