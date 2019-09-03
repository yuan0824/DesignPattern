package com.demo.proxy.javaProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan
 */
public class Handler implements InvocationHandler {
    private Object delegate;
    private static List<String> bannedSites;

    private Handler(Object delegate){
        this.delegate = delegate;
    }

    public static Object newInstance(Object obj) {
        return Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new Handler(obj));
    }

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("google.com");
        bannedSites.add("twitter.com");
        bannedSites.add("youtube.com");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(bannedSites.contains(args[0].toString())){
            throw new Exception("Access Denied");
        }
        method.invoke(delegate, args);
        return null;
    }
}