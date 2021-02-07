package com.jeffery.designpattern.mediator;

/**
 * @time 2021/2/7 - 10:02
 * @Version 1.0
 * @Author Jeffery Yi
 */
public abstract class User {

    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}