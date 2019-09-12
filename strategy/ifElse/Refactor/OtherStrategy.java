package com.demo.strategy.ifElse.refactor;

/**
 * @author yuan
 */
public class OtherStrategy implements Strategy {
    @Override
    public String doOperation(String policy) {
        return "其他";
    }
}
