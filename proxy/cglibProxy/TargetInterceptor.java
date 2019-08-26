package com.cglibProxy;

import com.javaProxy.Handler;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan
 */
public class TargetInterceptor implements MethodInterceptor {
    private static List<String> bannedSites;

    public static Object newInstance(Class clazz) {
        TargetInterceptor targetInterceptor = new TargetInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(targetInterceptor);
        return enhancer.create();
    }

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("google.com");
        bannedSites.add("twitter.com");
        bannedSites.add("youtube.com");
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if(bannedSites.contains(objects[0].toString())){
            throw new Exception("Access Denied");
        }
        methodProxy.invokeSuper(o , objects);
        return null;
    }
}
