package com.demo.strategy.ifElse.refactor;

/**
 * @author yuan
 */
public class Context {
    public String doOperation(String policy){
        Strategy strategy = new StrategyFactory().creator(policy).orElse(new OtherStrategy());
        return strategy.doOperation(policy);
    }
}