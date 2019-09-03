package com.demo.strategy.ifElse.Refactor;

/**
 * @author yuan
 */
public class IdcardStrategy implements Strategy{
    @Override
    public String doOperation(String policy) {
        return "身份证";
    }
}
