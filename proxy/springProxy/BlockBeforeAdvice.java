package com.demo.proxy.springProxy;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan
 */
public class BlockBeforeAdvice implements MethodBeforeAdvice {
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("google.com");
        bannedSites.add("twitter.com");
        bannedSites.add("youtube.com");
    }

    @Override
    public void before(Method m, Object[] args, Object target) throws Throwable {
        if(bannedSites.contains(args[0].toString())){
            throw new Exception("Access Denied");
        }
    }
}
