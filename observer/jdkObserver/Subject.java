package com.jdkObserver;

import com.observer.Observer;

import java.util.ArrayList;
import java.util.List;
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
