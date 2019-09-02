package com.factoryMethod;

/**
 * @author yuan
 */
public class RectangleFactory implements ShapeFactory{
    @Override
    public Shape CreateShape() {
        return new Rectangle();
    }
}
