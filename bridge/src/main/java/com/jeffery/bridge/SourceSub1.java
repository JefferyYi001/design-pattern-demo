package com.jeffery.bridge;

/**
 * @time 2020/12/29 - 23:51
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class SourceSub1 implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}
