package com.jeffery.adapter2;

/**
 * @time 2020/12/15 - 8:16
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class AdapterTest {

    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }
}
