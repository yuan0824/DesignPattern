package com.demo.bridge;

/**
 * Abstraction
 * @author yuan
 */
abstract class Shape {
    protected Color color;

    protected Shape(Color color){
        this.color = color;
    }
    public abstract void draw();
}
