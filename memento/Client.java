package com.demo.memento;


/**
 * @author yuan
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("first");
        caretaker.setMemento(originator.saveStateToMemento());
        originator.setState("second");
        System.out.println(originator.getState());
        originator.getStateFromMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
