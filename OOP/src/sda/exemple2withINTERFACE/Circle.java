package sda.exemple2withINTERFACE;

/**
 * * Circle(Point2D center, Point2D point)
 * *  The first parameter specifies the center of the circle, the second is any point on the circle. Based on these points,
 * *  the Circle class is to determine:
 * * • circle radius when calling double getRadius() method
 * * • circle circumference when calling double getPerimeter() method
 * * • circle area when calling double getArea() method
 * <p>
 * * Implement the interface in the class from the previous task (Circle). When calling the resize(double resizeFactor) method,
 * * the circle should change its size by a given factor (1.5, 0.5, 10.0, etc.).
 * * Validate the resizing by calling the other Circle methods.
 */

public class Circle implements Shape {

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);
    }

    @Override
    public void resize(double resizeFactor) {
        point.move(new MoveDirection(point.getX() * resizeFactor, point.getY() * resizeFactor));
    }

    public double getRadius() {

        return center.getDistanceFrom(point);
    }

    @Override
    public double getPerimeter() {
        return 2 * getRadius() * Math.PI;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

}
