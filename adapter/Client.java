package com.demo.adapter;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        Yuan yuan = new Adapter(new Dollar(5));
        yuan.useInChina();
    }
}