package com.demo.state;

/**
 * @author yuan
 */
public class TVContext {
    private State state;
    public void setState(State state){
        this.state = state;
    }
    public void request(){
        state.handle(this);
    }
}
