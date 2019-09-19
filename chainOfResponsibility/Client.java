package com.demo.chainOfResponsibility;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        Chain c1 = new NegativeProcessor();
        Chain c2 = new PositiveProcessor();
        Chain c3 = new ZeroProcessor();
        c1.setNext(c2);
        c2.setNext(c3);

        c1.process(7);
        c1.process(0);
        c1.process(-3);
    }
}
