package com.springObserver;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 监听器
 * @author yuan
 */
@Component
public class CustomSpringEventListener implements ApplicationListener<CustomSpringEvent> {
    @Override
    public void onApplicationEvent(CustomSpringEvent event) {
        System.out.println("AA你好，番剧xx第"+ event.getState() +"话已更新");
    }
}