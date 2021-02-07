package com.jeffery.designpattern.command;

/**
 * @author jeffery.yi
 * @since 01-03-2021
 */
public class CommandTest {
  public static void main(String[] args) {
    Receiver receiver = new Receiver();
    Command cmd = new MyCommand(receiver);
    Invoker invoker = new Invoker(cmd);
    invoker.action();
  }

}
