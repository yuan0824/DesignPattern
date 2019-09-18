package com.demo.command;

/**
 * @author yuan
 */
public class Switch {
    private Command switchOnCommand;
    private Command switchOffCommand;
    void setOnCommand(Command switchOnCommand) {
        this.switchOnCommand = switchOnCommand;
    }
    void setOffCommand(Command switchOffCommand) {
        this.switchOffCommand = switchOffCommand;
    }

    void on() {
        switchOnCommand.execute();
    }

    void off() {
        switchOffCommand.execute();
    }
}
