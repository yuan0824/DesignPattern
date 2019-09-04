package com.demo.flyweight;

/**
 * @author yuan
 */
public class BookOrder {
    private String name;
    BookOrder(String name){
        this.name = name;
    }
    public void print(){
        System.out.println("卖了一本书，书名为" + name);
    }
}
