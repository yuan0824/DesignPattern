package com.demo.iterator;

/**
 * @author yuan
 */
public class StoreIterator implements Iterator<String>{
    private String[] books;
    private int position = 0;

    StoreIterator(String[] books){
        this.books = books;
    }

    @Override
    public String next() {
        return books[position++];
    }

    @Override
    public boolean hasNext() {
        return position != books.length;
    }
}
