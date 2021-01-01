package com.jeffery.designpatern.decorator;

/**
 * @author jeffery.yi
 * @since 01-02-2021
 */
public class DecoratorTest {
  public static void main(String[] args) {
    Sourceable source = new Source();
    Sourceable obj = new Decorator(source);
    obj.method();
  }
}
