package com.jeffery.designpattern.mediator;

/**
 * @time 2021/2/7 - 10:04
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class Test {

    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
