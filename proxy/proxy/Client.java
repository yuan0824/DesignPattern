package com.proxy;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try{
            internet.connect("twitch.tv");
            internet.connect("youtube.com");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
