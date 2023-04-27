package sda.advanced._7_interfaces.part_1;

public class Circle implements Shape{
  
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }


  @Override
  public void draw() {
    System.out.println("Drawing circle");
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  public double getRadius() {
    return radius;
  }
}
