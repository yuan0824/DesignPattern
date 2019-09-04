package com.demo.decorator;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        Weapon weapon = new Muffler(new M4());
        System.out.println(weapon.fire());
    }
}
