package com.demo.observer.jdkObserver;

import java.util.Observable;

/**
 * @author yuan
 */
public class Subject extends Observable {
    private int state;
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        setChanged();
        notifyObservers();
    }
}
