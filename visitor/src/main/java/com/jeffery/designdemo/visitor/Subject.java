package com.jeffery.designdemo.visitor;

/**
 * @time 2021/1/22 - 23:04
 * @Version 1.0
 * @Author Jeffery Yi
 */
public interface Subject {
    public void accept(Visitor visitor);

    public String getSubject();
}
