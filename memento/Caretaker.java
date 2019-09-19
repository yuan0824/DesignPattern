package com.demo.memento;

/**
 * 管理者
 * @author yuan
 */

class Caretaker {
    private Memento memento;
    public Memento getMemento(){
        return memento;
    }
    public void setMemento(Memento memento){
        this.memento = memento;
    }
}
