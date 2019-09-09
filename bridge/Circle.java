package com.demo.bridge;

/**
 * RefinedAbstraction
 * @author yuan
 */
public class Circle extends Shape{
     public Circle(Color color){
        super(color);
    }
    @Override
    public void draw() {
        color.printColor();
        System.out.println(" Circle");
    }
}
