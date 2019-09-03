package com.demo.observer.observer;

/**
 * @author yuan
 */
public class ObserverB extends Observer{
    public ObserverB(Subject sub){
        this.sub = sub;
        this.sub.attach(this);
    }
    @Override
    public void update() {
        System.out.println("BB你好，番剧xx第"+ sub.getState() +"话已更新");
    }
}
