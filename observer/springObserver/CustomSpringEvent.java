package com.demo.observer.springObserver;

import org.springframework.context.ApplicationEvent;


/**
 * 事件
 * @author yuan
 */
public class CustomSpringEvent extends ApplicationEvent {
    private int state;
    public CustomSpringEvent(Object source, int state) {
        super(source);
        this.state = state;
    }
    public int getState(){
        return state;
    }
}
