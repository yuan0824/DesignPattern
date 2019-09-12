package com.demo.strategy.ifElse.refactor;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        String s = new Context().doOperation("q");
        System.out.println(s);
    }
}
