package com.jeffery.designdemo.visitor;

import com.jeffery.designdemo.visitor.Subject;

/**
 * @time 2021/1/22 - 23:01
 * @Version 1.0
 * @Author Jeffery Yi
 */
public interface Visitor {
    public void visit(Subject sub);
}
