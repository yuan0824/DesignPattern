package com.demo.command;

/**
 * @author yuan
 */
public class SwitchOnCommand implements Command{
    private Light light;
    public SwitchOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }
}
