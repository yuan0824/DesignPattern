package com.demo.facade;

/**
 * @author yuan
 */
class Computer {
    public void startComputer() {
        CPU cpu = new CPU();
        cpu.freeze();
        new Memory().load();
        new Displayer().display();
        cpu.execute();
    }
}