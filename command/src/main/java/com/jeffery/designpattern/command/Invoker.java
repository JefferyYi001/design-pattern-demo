package com.jeffery.designpattern.command;

/**
 * @author jeffery.yi
 * @since 01-03-2021
 */
public class Invoker {

  private Command command;

  public Invoker(Command command) {
    this.command = command;
  }

  public void action(){
    command.exe();
  }

}
