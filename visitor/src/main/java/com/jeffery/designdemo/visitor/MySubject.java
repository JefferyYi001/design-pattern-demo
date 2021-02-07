package com.jeffery.designdemo.visitor;

/**
 * @time 2021/1/22 - 23:04
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class MySubject implements Subject{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }

}
