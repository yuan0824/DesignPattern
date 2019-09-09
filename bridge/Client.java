package com.demo.bridge;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        Shape blueRectangle = new Rectangle(new Blue());
        redCircle.draw();
        blueRectangle.draw();
    }
}
