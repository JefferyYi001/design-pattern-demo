package com.jeffery.designdemo.visitor;

/**
 * @time 2021/1/22 - 23:11
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class Test {
    public static void main(String[] args) {

        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }

}
