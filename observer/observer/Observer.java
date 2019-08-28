package com.observer;

/**
 * @author yuan
 */
public abstract class Observer {
    protected Subject sub;
    abstract void update();
}
