package com.jeffery.designpattern.state;

/**
 * @time 2021/2/7 - 16:32
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class Test {

    public static void main(String[] args) {

        State state = new State();
        Context context = new Context(state);

        //设置第一种状态
        state.setValue("state1");
        context.method();

        //设置第二种状态
        state.setValue("state2");
        context.method();
    }
}
