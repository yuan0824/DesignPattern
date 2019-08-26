package com.cglibProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        RealInternet realInternet = (RealInternet)TargetInterceptor.newInstance(RealInternet.class);
        try{
            realInternet.connect("twitch.tv");
            realInternet.connect("youtube.com");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
