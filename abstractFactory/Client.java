package com.abstractFactory;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new FactoryForHome();
        Chair chair = factory.createChair();
        chair.sitOn();
    }
}