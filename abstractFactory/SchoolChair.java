package com.abstractFactory;

/**
 * @author yuan
 */
public class SchoolChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("chair of school");
    }
}
