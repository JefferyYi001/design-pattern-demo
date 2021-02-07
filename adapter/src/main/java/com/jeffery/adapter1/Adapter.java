package com.jeffery.adapter1;

/**
 * @time 2020/12/15 - 8:15
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}