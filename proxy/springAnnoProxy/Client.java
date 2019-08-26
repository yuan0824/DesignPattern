package com.springAnnoProxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args){
        ApplicationContext application = new AnnotationConfigApplicationContext(Config.class);
        Internet internet = (Internet) application.getBean("internet");
        try {
            internet.connect("twitch.tv");
            internet.connect("youtube.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
