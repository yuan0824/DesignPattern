package com.demo.strategy.ifElse.Refactor;

/**
 * @author yuan
 */
public class Context {
    public String doOperation(String policy){
        Strategy strategy = new StrategyFactory().creator(policy).orElse(new OtherStrategy());
        return strategy.doOperation(policy);
    }
}