package com.demo.proxy.springProxy;

import com.demo.proxy.springAnnoProxy.Internet;
import com.demo.proxy.springAnnoProxy.RealInternet;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory(new RealInternet());
        factory.addInterface(Internet.class);
        factory.addAdvice(new BlockBeforeAdvice());
        Internet internet = (Internet) factory.getProxy();
        try {
            internet.connect("twitch.tv");
            internet.connect("youtube.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
