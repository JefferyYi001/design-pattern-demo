package com.jeffery.absfactory2;

/**
 * @time 2020/12/6 - 9:56
 * @Version 1.0
 * @Author Jeffery Yi
 */

public class Customer {
    public static void main(String[] args){
        //生产宝马320系列配件
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();

        //生产宝马523系列配件
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        factoryBMW523.createEngine();
        factoryBMW523.createAircondition();
    }
}
