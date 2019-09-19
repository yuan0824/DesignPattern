package com.demo.memento;

/**
 * 备忘录
 * @author yuan
 */
public class Memento {
    private String state;
    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
