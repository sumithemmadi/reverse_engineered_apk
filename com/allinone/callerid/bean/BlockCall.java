package com.allinone.callerid.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "com_allinone_callerid_bean_BlockCall")
public class BlockCall {
  @Column(autoGen = true, isId = true, name = "id")
  private int id;
  
  @Column(name = "number")
  private String number;
  
  @Column(name = "time")
  private long time;
  
  public int getId() {
    return this.id;
  }
  
  public String getNumber() {
    return this.number;
  }
  
  public long getTime() {
    return this.time;
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
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("BlockCall{id=");
    stringBuilder.append(this.id);
    stringBuilder.append(", number='");
    stringBuilder.append(this.number);
    stringBuilder.append('\'');
    stringBuilder.append(", time=");
    stringBuilder.append(this.time);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/BlockCall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */