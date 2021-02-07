package com.jeffery.absfactory1;

/**
 * @time 2020/12/5 - 23:31
 * @Version 1.0
 * @Author Jeffery Yi
 */

public class Customer {
    public static void main(String[] args) {
        Order orderBMW320 = new Order(new FactoryBMW320());
        orderBMW320.factory.createBMW();
        Order orderBMW523 = new Order(new FactoryBMW523());
        orderBMW523.factory.createBMW();
    }
}
