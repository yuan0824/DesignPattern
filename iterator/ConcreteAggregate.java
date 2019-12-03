package com.demo.iterator;

/**
 * @author yuan
 */
public class ConcreteAggregate implements Aggregate<String> {
    private String[] books;
    ConcreteAggregate(String[] books) {
        this.books = books;
    }
    @Override
    public Iterator iterator() {
        return new StoreIterator(books);
    }
}
