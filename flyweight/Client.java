package com.demo.flyweight;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        BookOrderFactory factory = new BookOrderFactory();
        factory.getBookOrder("三国").print();
        factory.getBookOrder("水浒").print();
        factory.getBookOrder("三国").print();
        factory.getBookOrder("水浒").print();
        factory.getBookOrder("水浒").print();
        factory.getBookOrder("三国").print();

    }
}
