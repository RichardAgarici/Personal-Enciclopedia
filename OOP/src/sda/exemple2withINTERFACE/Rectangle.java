package sda.exemple2withINTERFACE;

public class Rectangle implements Shape {

    private Point2D x;
    private Point2D y;
    private Point2D z;
    private Point2D k;

    public Rectangle(Point2D x, Point2D y, Point2D z, Point2D k) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.k = k;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        x.move(moveDirection);
        y.move(moveDirection);
        z.move(moveDirection);
        k.move(moveDirection);
    }

    @Override
    public void resize(double resizeFactor) {
        y.move(new MoveDirection(y.getX() * resizeFactor, y.getY() * resizeFactor));
        z.move(new MoveDirection(z.getX() * resizeFactor, z.getY() * resizeFactor));
    }

    @Override
    public double getPerimeter() {
        return 2 * (x.getDistanceFrom(y) + y.getDistanceFrom(z));
    }

    @Override
    public double getArea() {
        return x.getDistanceFrom(y) * y.getDistanceFrom(z);
    }

    public Point2D getX() {
        return x;
    }

    public void setX(Point2D x) {
        this.x = x;
    }

    public Point2D getY() {
        return y;
    }

    public void setY(Point2D y) {
        this.y = y;
    }

    public Point2D getZ() {
        return z;
    }

    public void setZ(Point2D z) {
        this.z = z;
    }

    public Point2D getK() {
        return k;
    }

    public void setK(Point2D k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", k=" + k +
                '}';
    }
}