package com.demo.prototype;

/**
 * @author yuan
 */
public class Cookie implements Cloneable{
    protected String category;

    public void showCategory(){
        System.out.println(category);
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}