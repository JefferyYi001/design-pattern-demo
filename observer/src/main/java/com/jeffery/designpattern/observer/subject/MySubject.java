package com.jeffery.designpattern.observer.subject;

/**
 * @author jeffery.yi
 * @since 01-31-2021
 */
public class MySubject extends AbstractSubject {
  @Override
  public void operation() {
    System.out.println("update self!");
    notifyObservers();
  }
}
