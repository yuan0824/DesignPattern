package com.demo.strategy.ifElse.old;

/**
 * @author yuan
 */
public class DataConver {
    String execute(String policy){
        if("i".equals(policy)){
            return "身份证";
        }
        if("n".equals(policy)){
            return "姓名";
        }
        if("c".equals(policy)){
            return "银行卡";
        }
        if("m".equals(policy)){
            return "手机号";
        }
        return "其他";
    }
}
