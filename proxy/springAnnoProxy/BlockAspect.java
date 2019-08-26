package com.springAnnoProxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan
 */
@Aspect
@Component
public class BlockAspect {
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("google.com");
        bannedSites.add("twitter.com");
        bannedSites.add("youtube.com");
    }

    @Pointcut("execution(* com.springAnnoProxy.Internet.*(..))")
    public void block(){}

    @Before("block()")
    public void doBlock(JoinPoint joinPoint) {
        if(bannedSites.contains(joinPoint.getArgs()[0].toString())){
            throw new RuntimeException("Access Denied");
        }
    }
}
