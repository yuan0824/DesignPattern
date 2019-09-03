package com.demo.adapter;

/**
 * @author yuan
 */
public class Adapter implements Yuan {
    private Dollar dollar;

    public Adapter(Dollar dollar){
        this.dollar = dollar;
    }

    @Override
    public void useInChina() {
        System.out.println("能在中国消费" + dollar.getValue()*7);
    }
}
