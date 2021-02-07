package com.jeffery.prototype.deepcopy;

/**
 * @author jeffery.yi
 * @since 12-12-2020
 */
public class Client {
  public static void main(String[] args) {
    WeeklyLog log_1, log_2 = null;
    //创建原型对象
    log_1 = new WeeklyLog();
    //创建附件对象
    Attachment attachment = new Attachment();
    //将附件添加到周报种去
    log_1.setAttachment(attachment);
    try {
      log_2 = log_1.deepClone();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    //克隆周报
    System.out.println("周报对象是否相同" + (log_1 == log_2));
    System.out.println("附件对象是否相同" + (log_1.getAttachment() == log_2.getAttachment()));
  }
}
