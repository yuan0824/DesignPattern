package com.javaProxy;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        Internet internet = (Internet)Handler.newInstance(new RealInternet());
        try{
            internet.connect("twitch.tv");
            internet.connect("youtube.com");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
