package com.demo.strategy.ifElse.refactor;

/**
 * @author yuan
 */
public class MobileStrategy implements Strategy{
    @Override
    public String doOperation(String policy) {
        return "手机号";
    }
}
