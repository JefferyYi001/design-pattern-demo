package com.jeffery.prototype.deepcopy;

import java.io.Serializable;

/**
 * @author jeffery.yi
 * @since 12-12-2020
 */
public class Attachment implements Serializable {
  private static final long serialVersionUID = 1L;
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
