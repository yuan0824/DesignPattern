package com.demo.state;

/**
 * @author yuan
 */
public class Client {

    public static void main(String[] args) {
        TVContext context = new TVContext();
        context.setState(new TVStartState());
        context.request();
    }
}