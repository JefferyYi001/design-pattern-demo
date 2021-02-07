package com.jeffery.designpattren.strategy;

/**
 * @time 2021/2/7 - 17:27
 * @Version 1.0
 * @Author Jeffery Yi
 */
public abstract class AbstractCalculator {

    public int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
