package com.jdkStrategy;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context((int num1, int num2) -> num1 + num2);
        System.out.println(context.executeStrategy(7, 2));
        context = new Context((int num1, int num2) -> num1 - num2);
        System.out.println(context.executeStrategy(7, 2));
    }
}
