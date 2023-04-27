package sda.advanced._17_generics;

public class SecondExample {
  public static void main(String[] args) {

    Garage<Audi> garage = new Garage<>();

    garage.putInside(new Audi());

    Garage<Bmw> garage1 = new Garage<>();

    garage1.putInside(new Bmw());
    
    Garage<Car> garage2 = new Garage<>();
    
    garage2.putInside(new Car("suzuki", 20000, "red"));
    
  }
}

class Garage<T extends Car> {
  private T car;

  public void putInside(T car) {
    this.car = car;
  }

  public T getOut() {
    return car;
  }
}

class Car {
  String model;
  double price;
  String color;

  public Car(String model, double price, String color) {
    this.model = model;
    this.price = price;
    this.color = color;
  }
}

class Audi extends Car {
  public Audi() {
    super("Audi", 50000, "silver");
  }
}

class Bmw extends Car {
  public Bmw() {
    super("Bmw", 40000, "blue");
  }
}