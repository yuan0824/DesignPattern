package com.factoryMethod;

/**
 * @author yuan
 */
public class CircleFactory implements ShapeFactory{
    @Override
    public Shape CreateShape() {
        return new Circle();
    }
}
