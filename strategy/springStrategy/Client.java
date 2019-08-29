package com.springStrategy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author yuan
 */

public class Client {
    public static void main (String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Context context = (Context)applicationContext.getBean("context");
        context.setNum(7,2);
        System.out.println(context.executeStrategy());
    }
}