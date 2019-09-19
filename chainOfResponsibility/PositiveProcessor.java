package com.demo.chainOfResponsibility;

/**
 * @author yuan
 */
public class PositiveProcessor implements Chain{
    private Chain nextInChain;
    @Override
    public void setNext(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void process(int request) {
        if(request > 0){
            System.out.println("正数" + request);
        }
        else {
            nextInChain.process(request);
        }
    }
}
