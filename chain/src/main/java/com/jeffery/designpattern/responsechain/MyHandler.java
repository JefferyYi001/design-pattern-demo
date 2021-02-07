package com.jeffery.designpattern.responsechain;

/**
 * @time 2021/2/7 - 17:51
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + "deal!");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
