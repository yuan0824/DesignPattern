package com.abstractFactory;

/**
 * @author yuan
 */
public class HomeChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("chair of home");
    }
}
