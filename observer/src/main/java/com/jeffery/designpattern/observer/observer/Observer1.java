package com.jeffery.designpattern.observer.observer;

/**
 * @author jeffery.yi
 * @since 01-31-2021
 */
public class Observer1 implements Observer {

  @Override
  public void update() {
    System.out.println("observer1 has received!");
  }
}
