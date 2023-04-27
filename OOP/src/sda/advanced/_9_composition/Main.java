package sda.advanced._9_composition;

public class Main {


  public static void main(String[] args) {


    Engine engine = new Engine("diesel", 300, 8);

    Car car = new Car("Audi", "Silver", "A4", engine);

    System.out.println("Engine variable is: " + engine);

    System.out.println("Engine from car is: " + car.getEngine());

    System.out.println(engine.getHorsePower());
    System.out.println(engine.getNumberOfCylinders());
    
    engine.setHorsePower(0);
    engine.setNumberOfCylinders(0);
    
    System.out.println(engine.getHorsePower());
    System.out.println(engine.getNumberOfCylinders());


    Car otherCar = new Car("Honda", "Red", "Civic", new Engine("gas", 200, 6));
    
    Engine otherEngine = otherCar.getEngine();
    
    otherEngine.setFuelType("electric");
    
    
    
    Car car2 = new Car("Volksvagen", "Black", "Golf", "gas", 150, 6);


  }
}
