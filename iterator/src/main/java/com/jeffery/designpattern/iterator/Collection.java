package com.jeffery.designpattern.iterator;

/**
 * @author jeffery.yi
 * @since 01-31-2021
 */
public interface Collection {
  public Iterator iterator();

  /*取得集合元素*/
  public Object get(int i);

  /*取得集合大小*/
  public int size();

}
