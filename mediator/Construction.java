package com.demo.mediator;

/**
 * @author yuan
 */
public class Construction extends Department{
    public Construction(Mediator mediator){
        super(mediator);
    }
    public void buildPalace(){
        System.out.println("建造房屋");
        mediator.notify("需要拨款",this);
    }
    //获得消息
    public void GetMessage(String message)
    {
        System.out.println("建造部获得消息：" + message);
    }
}
