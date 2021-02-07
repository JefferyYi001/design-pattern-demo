package com.jeffery.designpattern.interpreter;

/**
 * @time 2021/2/7 - 10:21
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class Test {

    public static void main(String[] args) {

        // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
