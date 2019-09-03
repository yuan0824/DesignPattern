package com.demo.singleton.DCL;

/**
 * @author yuan
 */
public class Singleton {
    private static volatile Singleton INSTANCE = null;

    private Singleton() {};

    public static  Singleton getInstance() {
        if(INSTANCE == null){
            synchronized(Singleton.class){
                if(INSTANCE == null){
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}