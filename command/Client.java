package com.demo.command;

/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Command onCommand = new SwitchOnCommand(light);
        Command offCommand = new SwitchOffCommand(light);
        Switch mySwitch = new Switch();
        mySwitch.setOnCommand(onCommand);
        mySwitch.setOffCommand(offCommand);

        mySwitch.on();
        mySwitch.off();
    }
}
