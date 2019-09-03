package com.demo.factoryMethod;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new CircleFactory();
        Shape shape = shapeFactory.CreateShape();
        shape.draw();
    }
}
