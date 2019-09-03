package com.demo.observer.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    int getState() {
        return state;
    }

    void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    void attach(Observer observer){
        observers.add(observer);
    }

    void detach(Observer observer){
        observers.remove(observer);
    }

    void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
