package com.jeffery.designpattern.memento;

/**
 * @time 2021/2/7 - 11:40
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class Storage {

    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
