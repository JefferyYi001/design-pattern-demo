package com.jeffery.bridge;

/**
 * @time 2020/12/29 - 23:55
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class MyBridge extends Bridge {
    @Override
    public void method(){
        getSource().method();
    }
}
