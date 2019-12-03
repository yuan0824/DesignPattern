package com.demo.iterator;

/**
 * @author yuan
 */
public interface Aggregate<T> {
    Iterator<T> iterator();
}
