package com.demo.bridge;

/**
 * RefinedAbstraction
 * @author yuan
 */
public class Rectangle extends Shape{
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        color.printColor();
        System.out.print(" Rectangle");
    }
}
