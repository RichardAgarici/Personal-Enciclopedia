package sda.advanced._9_composition;

public class Car {
  
  private String brandName;
  private String color;
  private String model;
  private Engine engine;

  public Car(String brandName, String color, String model, Engine engine) {
    this.brandName = brandName;
    this.color = color;
    this.model = model;
    this.engine = engine;
  }

  public Car(String brandName, String color, String model, String fuelType, int horsePower, int numberOfCylinders) {
    this.brandName = brandName;
    this.color = color;
    this.model = model;
    this.engine = new Engine(fuelType, horsePower, numberOfCylinders);
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }
}
