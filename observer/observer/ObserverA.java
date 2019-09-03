package com.demo.observer.observer;

/**
 * @author yuan
 */
public class ObserverA extends Observer{
    public ObserverA(Subject sub){
        this.sub = sub;
        this.sub.attach(this);
    }
    @Override
    public void update() {
        System.out.println("AA你好，番剧xx第"+ sub.getState() +"话已更新");
    }
}
