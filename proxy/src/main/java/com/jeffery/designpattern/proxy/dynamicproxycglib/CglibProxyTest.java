package com.jeffery.designpattern.proxy.dynamicproxycglib;

import com.jeffery.designpattern.proxy.staticproxy.Source;
import com.jeffery.designpattern.proxy.staticproxy.Sourceable;

/**
 * @author jeffery.yi
 * @since 01-02-2021
 */
public class CglibProxyTest {
  public static void main(String[] args) {
    CglibProxy cglib = new CglibProxy();//实例化CglibProxy对象
    Sourceable cglibProxy = (Sourceable) cglib.getCglibProxy(new Source());
    cglibProxy.method();
  }
}
