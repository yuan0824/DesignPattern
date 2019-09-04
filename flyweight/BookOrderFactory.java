package com.demo.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuan
 */
public class BookOrderFactory {
    private Map<String, BookOrder> pool;
    public BookOrderFactory(){
        this.pool = new HashMap<>();
    }
    public BookOrder getBookOrder(String bookname){
        BookOrder bookOrder = pool.get(bookname);
        if(bookOrder == null){
            bookOrder = new BookOrder(bookname);
            pool.put(bookname, bookOrder);
        }
        return bookOrder;
    }
}
