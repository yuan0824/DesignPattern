package com.springObserver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        CustomSpringEventPublisher customSpringEventPublisher = (CustomSpringEventPublisher)applicationContext.getBean("customSpringEventPublisher");
        customSpringEventPublisher.doStuffAndPublishAnEvent(123);
    }
}
