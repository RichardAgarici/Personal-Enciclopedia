package org.example.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.create("CIRCLE");
        shape1.draw();
        Shape shape2 = factory.create("RECTANGLE");
        shape2.draw();
        Shape shape3 = factory.create("SQUARE");
        shape3.draw();

    }
}
