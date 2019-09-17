package com.demo.state;

/**
 * @author yuan
 */
public class TVStartState implements State{
    @Override
    public void handle(TVContext context) {
        System.out.println("TV is turned ON");
    }
}
