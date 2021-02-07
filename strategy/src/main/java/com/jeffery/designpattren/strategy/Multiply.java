package com.jeffery.designpattren.strategy;

/**
 * @time 2021/2/7 - 17:29
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class Multiply extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp, "\\*");
        return arrayInt[0] * arrayInt[1];
    }
}