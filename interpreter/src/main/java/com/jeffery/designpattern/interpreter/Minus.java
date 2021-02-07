package com.jeffery.designpattern.interpreter;

/**
 * @time 2021/2/7 - 10:20
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class Minus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}
