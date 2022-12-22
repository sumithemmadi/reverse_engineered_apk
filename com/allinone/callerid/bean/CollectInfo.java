package com.allinone.callerid.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "collectinfo")
public class CollectInfo {
  @Column(autoGen = true, isId = true, name = "id")
  private int id;
  
  @Column(name = "number")
  private String number;
  
  @Column(name = "user_blocked")
  private String user_blocked = "0";
  
  @Column(name = "user_commented")
  private String user_commented = "0";
  
  @Column(name = "user_reported")
  private String user_reported = "0";
  
  @Column(name = "user_upload_recording")
  private String user_upload_recording = "0";
  
  public int getId() {
    return this.id;
  }
  
  public String getNumber() {
    return this.number;
  }
  
  public String getUser_blocked() {
    return this.user_blocked;
  }
  
  public String getUser_commented() {
    return this.user_commented;
  }
  
  public String getUser_reported() {
    return this.user_reported;
  }
  
  public String getUser_upload_recording() {
    return this.user_upload_recording;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public void setNumber(String paramString) {
    this.number = paramString;
  }
  
  public void setUser_blocked(String paramString) {
    this.user_blocked = paramString;
  }
  
  public void setUser_commented(String paramString) {
    this.user_commented = paramString;
  }
  
  public void setUser_reported(String paramString) {
    this.user_reported = paramString;
  }
  
  public void setUser_upload_recording(String paramString) {
    this.user_upload_recording = paramString;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("CollectInfo{id=");
    stringBuilder.append(this.id);
    stringBuilder.append(", number='");
    stringBuilder.append(this.number);
    stringBuilder.append('\'');
    stringBuilder.append(", user_blocked='");
    stringBuilder.append(this.user_blocked);
    stringBuilder.append('\'');
    stringBuilder.append(", user_commented='");
    stringBuilder.append(this.user_commented);
    stringBuilder.append('\'');
    stringBuilder.append(", user_reported='");
    stringBuilder.append(this.user_reported);
    stringBuilder.append('\'');
    stringBuilder.append(", user_upload_recording='");
    stringBuilder.append(this.user_upload_recording);
    stringBuilder.append('\'');
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/CollectInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */