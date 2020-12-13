package com.jeffery.prototype.shallowcopy;

/**
 * @author jeffery.yi
 * @since 12-12-2020
 */

public class Attachment {
  //附件名
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void download() {
    System.out.println("下载附件" + name);
  }
}
