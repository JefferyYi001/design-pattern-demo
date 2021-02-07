package com.jeffery.designpattern.command;

/**
 * @author jeffery.yi
 * @since 01-03-2021
 */
public class MyCommand implements Command{

  private Receiver receiver;

  public MyCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void exe() {
    receiver.action();
  }
}
