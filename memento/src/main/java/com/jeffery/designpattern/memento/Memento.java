package com.jeffery.designpattern.memento;

/**
 * @time 2021/2/7 - 11:06
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}