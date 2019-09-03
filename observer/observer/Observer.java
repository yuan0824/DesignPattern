package com.demo.observer.observer;

/**
 * @author yuan
 */
public abstract class Observer {
    Subject sub;
    abstract void update();
}
