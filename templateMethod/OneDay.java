package com.Template;

import sun.awt.geom.AreaOp;

/**
 * @author yuan
 */
public abstract class OneDay {
    public final void execute(){
        weakUp();
        doSomething();
        sleep();
    }

    public void weakUp(){
        System.out.println("睡醒");
    }

    public abstract void doSomething();

    public void sleep(){
        System.out.println("睡觉");
    }
}
