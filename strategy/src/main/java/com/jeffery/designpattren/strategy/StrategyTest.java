package com.jeffery.designpattren.strategy;

/**
 * @time 2021/2/7 - 17:30
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class StrategyTest {

    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
