package com.demo.prototype;

/**
 * @author yuan
 */
public class CoconutCookie extends Cookie {

    public CoconutCookie(){
        category = "coconut";
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
