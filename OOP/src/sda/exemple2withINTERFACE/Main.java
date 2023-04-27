package sda.exemple2withINTERFACE;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a MoveDirection class with fields double x, double y as well as getters, setters and constructor.
 * Create a Movable interface with the move(MoveDirection moveDirection) method.
 * Implement the interface in the classes from the previous task (Point2D and Circle).
 * When the move(MoveDirection moveDirection) method is called, the objects are to change their position based on the provided direction (MoveDirection).
 * Validate the offset by calling the other Circle methods.
 * <p>
 * Create a Resizable interface with the resize(double resizeFactor) method.
 * Implement the interface in the class from the previous task (Circle). When calling the resize(double resizeFactor) method,
 * the circle should change its size by a given factor (1.5, 0.5, 10.0, etc.).
 * Validate the resizing by calling the other Circle methods.
 */

public class Main {

    public static void main(String[] args) {

        Point2D point1 = new Point2D(10, 15);
        Point2D point2 = new Point2D(5, 10);

        Circle circle = new Circle(point1, point2);

        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
        System.out.println("Perimeter is: " + circle.getPerimeter());

        circle.move(new MoveDirection(2, 3));

        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
        System.out.println("Perimeter is: " + circle.getPerimeter());

        System.out.println("--------------------");
        point1.move(new MoveDirection(3, 5));
        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
        System.out.println("Perimeter is: " + circle.getPerimeter());

        circle.resize(5);
        System.out.println("--------------------");
        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
        System.out.println("Perimeter is: " + circle.getPerimeter());

        Point2D x =new Point2D(3,3);
        Point2D y =new Point2D(3,6);
        Point2D k =new Point2D(9,3);
        Point2D z =new Point2D(9,6);

        List<Shape> shapeList = new ArrayList<>();
        Rectangle rectangle = new Rectangle(x, y, z, k);

        System.out.println("--------------------");
        System.out.println("Area is: " + rectangle.getArea());
        System.out.println("Perimeter is: " + rectangle.getPerimeter());

        shapeList.add(rectangle);
        shapeList.add(circle);

        shapeList.stream()
                .forEach(shape -> shape.move(new MoveDirection(2, 3))); //final operation

        shapeList.stream()
                .forEach(shape -> {
                    System.out.println(shape.getArea());
                    System.out.println("------------");
                    System.out.println(shape.getPerimeter());
                });

    }
}