package com.demo.observer.observer;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        Subject sub = new Subject();
        Observer observer = new ObserverA(sub);
        new ObserverB(sub);
        sub.setState(7);
        sub.detach(observer);
        sub.setState(8);
    }
}