package com.jdkObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @author yuan
 */
public class ObserverB implements Observer {
    public ObserverB(Observable ob){
        ob.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        Subject sub = (Subject) o;
        System.out.println("BB你好，番剧xx第"+ sub.getState() +"话已更新");
    }
}
