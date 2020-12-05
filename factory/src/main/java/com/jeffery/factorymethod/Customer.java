package com.jeffery.factorymethod;

/**
 * @time 2020/12/5 - 23:31
 * @Version 1.0
 * @Author Jeffery Yi
 */

public class Customer {
    public static void main(String[] args) {
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        BMW320 bmw320 = factoryBMW320.createBMW();

        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        BMW523 bmw523 = factoryBMW523.createBMW();
    }
}
