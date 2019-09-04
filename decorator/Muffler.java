package com.demo.decorator;

/**
 * @author yuan
 */
public class Muffler extends Accessory{
    public Muffler(Weapon weapon){
        super(weapon);
    }
    public String fire(){
        return super.fire() + " with silently";
    }
}
