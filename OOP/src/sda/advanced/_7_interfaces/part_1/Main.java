package sda.advanced._7_interfaces.part_1;

public class Main {
  
  public static void main(String[] args) {
    
    Shape circle = new Circle(10);
    
    circle.draw();

    System.out.println("Area = " + circle.getArea());
    
    Shape rectangle = new Rectangle(10, 10);
    
    rectangle.draw();

    System.out.println("Area = " + rectangle.getArea());
    
  }
}
