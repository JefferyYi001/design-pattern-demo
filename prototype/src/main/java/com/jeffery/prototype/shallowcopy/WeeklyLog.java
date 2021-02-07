package com.jeffery.prototype.shallowcopy;

/**
 * @author jeffery.yi
 * @since 12-12-2020
 */
public class WeeklyLog implements Cloneable {
  private Attachment attachment;
  private String date;
  private String name;
  private String content;

  public Attachment getAttachment() {
    return attachment;
  }

  public void setAttachment(Attachment attachment) {
    this.attachment = attachment;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public WeeklyLog clone() {
    //需要实现cloneable的接口，直接继承object就好，它里面自带一个clone方法！
    Object obj = null;
    try {
      obj = super.clone();
      return (WeeklyLog) obj;
    } catch (CloneNotSupportedException e) {
      // TODO Auto-generated catch block
      System.out.println("不支持克隆方法！");
      return null;
    }
  }
}
