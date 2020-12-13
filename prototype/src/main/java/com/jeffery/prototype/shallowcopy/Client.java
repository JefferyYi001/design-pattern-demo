package com.jeffery.prototype.shallowcopy;

/**
 * @author jeffery.yi
 * @since 12-12-2020
 */
public class Client {
  //测试类，客户端
  public static void main(String[] args) {
    WeeklyLog log_1,log_2;
    //创建原型对象
    log_1 = new WeeklyLog();
    //创建附件对象
    Attachment attachment = new Attachment();
    //将附件添加到周报种去
    log_1.setAttachment(attachment);
    //克隆周报
    log_2=log_1.clone();
    System.out.println("周报是否相同"+(log_1==log_2));
    System.out.println("附件是否相同"+(log_1.getAttachment()==log_2.getAttachment()));
  }
}
