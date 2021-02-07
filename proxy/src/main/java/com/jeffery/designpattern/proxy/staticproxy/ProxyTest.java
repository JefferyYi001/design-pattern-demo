package com.jeffery.designpattern.proxy.staticproxy;

/**
 * @author jeffery.yi
 * @since 01-02-2021
 */
public class ProxyTest {

  public static void main(String[] args) {
    Sourceable source = new Proxy();
    source.method();
  }

}
