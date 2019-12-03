package com.demo.iterator;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        String[] books = new String[3];
        books[0] = "三国";
        books[1] = "水浒";
        books[2] = "西游记";
        Aggregate<String> aggregate = new ConcreteAggregate(books);
        Iterator<String> iterable = aggregate.iterator();
        while(iterable.hasNext()){
            System.out.println(iterable.next());
        }
    }
}