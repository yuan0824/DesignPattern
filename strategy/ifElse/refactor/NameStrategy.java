package com.demo.strategy.ifElse.refactor;

/**
 * @author yuan
 */
public class NameStrategy implements Strategy{
    @Override
    public String doOperation(String policy) {
        return "姓名";
    }
}
