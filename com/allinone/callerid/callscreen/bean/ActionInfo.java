package com.allinone.callerid.callscreen.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "ActionInfo")
public class ActionInfo {
  @Column(name = "data_id")
  private String data_id;
  
  @Column(autoGen = true, isId = true, name = "id", property = "NOT NULL")
  private int id;
  
  @Column(name = "isLike")
  private boolean isLike;
  
  @Column(name = "isReport")
  private boolean isReport;
  
  @Column(name = "like_counts")
  private int like_counts;
  
  public String getData_id() {
    return this.data_id;
  }
  
  public int getId() {
    return this.id;
  }
  
  public int getLike_counts() {
    return this.like_counts;
  }
  
  public boolean isLike() {
    return this.isLike;
  }
  
  public boolean isReport() {
    return this.isReport;
  }
  
  public void setData_id(String paramString) {
    this.data_id = paramString;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public void setLike(boolean paramBoolean) {
    this.isLike = paramBoolean;
  }
  
  public void setLike_counts(int paramInt) {
    this.like_counts = paramInt;
  }
  
  public void setReport(boolean paramBoolean) {
    this.isReport = paramBoolean;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ActionInfo{id=");
    stringBuilder.append(this.id);
    stringBuilder.append(", data_id='");
    stringBuilder.append(this.data_id);
    stringBuilder.append('\'');
    stringBuilder.append(", isLike=");
    stringBuilder.append(this.isLike);
    stringBuilder.append(", like_counts=");
    stringBuilder.append(this.like_counts);
    stringBuilder.append(", isReport=");
    stringBuilder.append(this.isReport);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callscreen/bean/ActionInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */