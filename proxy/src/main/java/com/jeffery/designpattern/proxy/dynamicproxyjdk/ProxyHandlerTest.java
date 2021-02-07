package com.jeffery.designpattern.proxy.dynamicproxyjdk;

import com.jeffery.designpattern.proxy.staticproxy.Source;
import com.jeffery.designpattern.proxy.staticproxy.Sourceable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author jeffery.yi
 * @since 01-02-2021
 */
public class ProxyHandlerTest {
  public static void main(String[] args) {
    System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

    Sourceable source = new Source();

    InvocationHandler handler = new ProxyHandler(source);

    Sourceable proxy = (Sourceable) Proxy.newProxyInstance(source.getClass().getClassLoader(), source.getClass().getInterfaces(), handler);

    proxy.method();
  }
}
