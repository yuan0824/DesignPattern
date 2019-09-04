package com.demo.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        BookOrderFactory factory = new BookOrderFactory();
        List<BookOrder> list = new ArrayList<>();
        list.add(factory.getBookOrder("三国"));
        list.add(factory.getBookOrder("水浒"));
        list.add(factory.getBookOrder("三国"));
        list.add(factory.getBookOrder("水浒"));
        list.add(factory.getBookOrder("水浒"));
        list.add(factory.getBookOrder("三国"));
        for(BookOrder order : list){
            order.print();
        }
    }
}
