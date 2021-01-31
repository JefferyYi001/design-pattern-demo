package com.jeffery.designpattern.template;

/**
 * @author jeffery.yi
 * @since 01-03-2021
 */
public class Plus extends AbstractCalculator {
  @Override
  public int calculate(int num1, int num2) {
    return num1 + num2;
  }
}
