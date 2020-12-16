package com.jeffery.adapter1;

/**
 * @time 2020/12/15 - 8:16
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
