package com.observer;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        Subject sub = new Subject();
        ObserverA observerA = new ObserverA(sub);
        new ObserverB(sub);
        sub.setState(7);
        sub.detach(observerA);
        sub.setState(8);
    }
}
