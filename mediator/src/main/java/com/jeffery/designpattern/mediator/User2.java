package com.jeffery.designpattern.mediator;

/**
 * @time 2021/2/7 - 10:03
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
