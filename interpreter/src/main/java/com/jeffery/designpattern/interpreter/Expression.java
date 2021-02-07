package com.jeffery.designpattern.interpreter;

/**
 * @time 2021/2/7 - 10:11
 * @Version 1.0
 * @Author Jeffery Yi
 */
public interface Expression {
    public int interpret(Context context);
}
