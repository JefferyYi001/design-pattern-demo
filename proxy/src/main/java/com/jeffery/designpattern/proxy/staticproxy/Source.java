package com.jeffery.designpattern.proxy.staticproxy;

/**
 * @author jeffery.yi
 * @since 01-02-2021
 */
public class Source implements Sourceable {
  @Override
  public void method() {
    System.out.println("the original method!");
  }
}
