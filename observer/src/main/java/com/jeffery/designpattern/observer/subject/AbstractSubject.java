package com.jeffery.designpattern.observer.subject;

import com.jeffery.designpattern.observer.observer.Observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author jeffery.yi
 * @since 01-31-2021
 */
public abstract class AbstractSubject implements Subject {

  private Vector<Observer> vector = new Vector<Observer>();

  @Override
  public void add(Observer observer) {
    vector.add(observer);
  }

  @Override
  public void del(Observer observer) {
    vector.remove(observer);
  }

  @Override
  public void notifyObservers() {
    Enumeration<Observer> enumo = vector.elements();
    while (enumo.hasMoreElements()) {
      enumo.nextElement().update();
    }
  }
}
