package com.jeffery.simplefactory;

/**
 * @time 2020/12/5 - 15:10
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);
    }
}
