package com.jeffery.designpattern.iterator;

/**
 * @author jeffery.yi
 * @since 01-31-2021
 */
public class Test {

  public static void main(String[] args) {
    Collection collection = new MyCollection();
    Iterator it = collection.iterator();

    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}
