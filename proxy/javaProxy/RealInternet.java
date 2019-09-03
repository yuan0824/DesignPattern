package com.demo.proxy.javaProxy;

/**
 * @author yuan
 */
public class RealInternet implements Internet{
    @Override
    public void connect(String domain) {
        System.out.println("Connecting to "+ domain);
    }
}