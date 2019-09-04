package com.demo.decorator;

/**
 * @author yuan
 */
public abstract class Accessory implements Weapon {
    private Weapon weapon;
    public Accessory(Weapon weapon){
        this.weapon = weapon;
    }
    @Override
    public String fire() {
        return weapon.fire();
    }
}
