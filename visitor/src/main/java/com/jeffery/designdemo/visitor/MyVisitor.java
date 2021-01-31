package com.jeffery.designdemo.visitor;


import com.jeffery.designdemo.visitor.Subject;

/**
 * @time 2021/1/22 - 23:03
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}

