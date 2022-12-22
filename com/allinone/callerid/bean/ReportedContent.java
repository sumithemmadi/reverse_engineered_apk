package com.allinone.callerid.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "com_allinone_callerid_bean_BlockCall")
public class ReportedContent {
  @Column(autoGen = true, isId = true, name = "id")
  private int id;
  
  @Column(name = "number")
  private String number;
  
  @Column(name = "time")
  private long time;
  
  @Column(name = "type")
  private String type;
  
  public int getId() {
    return this.id;
  }
  
  public String getNumber() {
    return this.number;
  }
  
  public long getTime() {
    return this.time;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public void setNumber(String paramString) {
    this.number = paramString;
  }
  
  public void setTime(long paramLong) {
    this.time = paramLong;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ReportedContent{id=");
    stringBuilder.append(this.id);
    stringBuilder.append(", number='");
    stringBuilder.append(this.number);
    stringBuilder.append('\'');
    stringBuilder.append(", type='");
    stringBuilder.append(this.type);
    stringBuilder.append('\'');
    stringBuilder.append(", time=");
    stringBuilder.append(this.time);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/ReportedContent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */