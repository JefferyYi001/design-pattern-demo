package com.jeffery.designpattern.proxy.dynamicproxyjdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author jeffery.yi
 * @since 01-02-2021
 */
public class ProxyHandler implements InvocationHandler {
  private Object object;
  public ProxyHandler(Object object){
    this.object = object;
  }
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("Before invoke "  + method.getName());
    method.invoke(object, args);
    System.out.println("After invoke " + method.getName());
    return null;
  }
}
