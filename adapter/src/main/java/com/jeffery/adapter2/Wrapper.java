package com.jeffery.adapter2;

/**
 * @time 2020/12/15 - 8:15
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void method1() {
        source.method1();
    }
}