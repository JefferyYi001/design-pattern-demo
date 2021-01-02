package com.jeffery.designpattern.facade;

/**
 * @author jeffery.yi
 * @since 01-02-2021
 */
public class User {

  public static void main(String[] args) {
    Computer computer = new Computer();
    computer.startup();
    computer.shutdown();
  }

}
