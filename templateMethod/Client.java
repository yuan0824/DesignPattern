package com.demo.templateMethod;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        OneDay oneDay = new StudentOneDay();
        oneDay.execute();
    }
}