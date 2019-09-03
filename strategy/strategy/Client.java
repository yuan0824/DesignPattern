package com.demo.strategy.strategy;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(7, 2));
        context = new Context(new OperationSubstract());
        System.out.println(context.executeStrategy(7, 2));
    }
}
