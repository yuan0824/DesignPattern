package com.abstractFactory;

/**
 * @author yuan
 */
public class FactoryForHome implements AbstractFactory{
    @Override
    public Chair createChair() {
        return new HomeChair();
    }

    @Override
    public Desk createDesk() {
        return new HomeDesk();
    }
}
