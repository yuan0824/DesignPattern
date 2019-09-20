package com.demo.mediator;

/**
 * @author yuan
 */
public class Defense extends Department{
    public Defense(Mediator mediator){
        super(mediator);
    }
    public void fight(){
        System.out.println("战斗");
        mediator.notify("需要拨款",this);
    }
    //获得消息
    public void GetMessage(String message)
    {
        System.out.println("防务部获得消息：" + message);
    }
}
