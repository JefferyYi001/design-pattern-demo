package com.jeffery.designpattern.observer;

import com.jeffery.designpattern.observer.observer.Observer1;
import com.jeffery.designpattern.observer.observer.Observer2;
import com.jeffery.designpattern.observer.subject.MySubject;
import com.jeffery.designpattern.observer.subject.Subject;

/**
 * @author jeffery.yi
 * @since 01-31-2021
 */
public class ObserverTest {

  public static void main(String[] args) {
    Subject sub = new MySubject();
    sub.add(new Observer1());
    sub.add(new Observer2());

    sub.operation();
  }

}