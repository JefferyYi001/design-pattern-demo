package com.jeffery.prototype.deepcopy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author jeffery.yi
 * @since 12-12-2020
 */
public class WeeklyLog implements Serializable {
  private static final long serialVersionUID = 1L;

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
  //通过序列化进行深克隆
  public WeeklyLog deepClone() throws Exception {
    //将对象写入流中,
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(bos);
    oos.writeObject(this);
    //将对象取出来
    ByteArrayInputStream bi = new ByteArrayInputStream(bos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bi);
    return (WeeklyLog)ois.readObject();
  }
}
