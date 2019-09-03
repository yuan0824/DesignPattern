package com.demo.strategy.springStrategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yuan
 */
@Component
public class Context {
    @Autowired
    private Strategy strategy;

    private int num1;
    private int num2;

    void setNum(int num1 ,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    int executeStrategy() {
        return strategy.doOperation(num1, num2);
    }
}
