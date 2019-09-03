package com.demo.observer.jdkObserver;


import java.util.Observable;
import java.util.Observer;

/**
 * @author yuan
 */
public class ObserverA implements Observer {
    public ObserverA(Observable ob){
        ob.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        Subject sub = (Subject) o;
        System.out.println("AA你好，番剧xx第"+ sub.getState() +"话已更新");
    }
}
