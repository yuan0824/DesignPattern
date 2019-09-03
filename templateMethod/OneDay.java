package com.demo.templateMethod;

/**
 * 抽象类
 * @author yuan
 */
public abstract class OneDay {
    final void execute(){
        weakUp();
        doSomething();
        sleep();
    }

    private void weakUp(){
        System.out.println("睡醒");
    }

    abstract void doSomething();

    private void sleep(){
        System.out.println("睡觉");
    }
}
