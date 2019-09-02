package com.abstractFactory;

/**
 * @author yuan
 */
public class FactoryForSchool implements AbstractFactory{
    @Override
    public Chair createChair() {
        return new SchoolChair();
    }

    @Override
    public Desk createDesk() {
        return new SchoolDesk();
    }
}
