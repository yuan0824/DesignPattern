package com.demo.mediator;

/**
 * @author yuan
 */
public class Finance extends Department{
    public Finance(Mediator mediator){
        super(mediator);
    }
    void grant(){
        System.out.println("财政部拨款");
        mediator.notify("需要重建房屋",this);
    }
    //获得消息
    void GetMessage(String message)
    {
        System.out.println("财政部获得消息：" + message);
    }
}
