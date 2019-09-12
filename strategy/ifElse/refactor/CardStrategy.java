package com.demo.strategy.ifElse.refactor;

/**
 * @author yuan
 */
public class CardStrategy implements Strategy{
    @Override
    public String doOperation(String policy) {
        return "银行卡";
    }
}
