package com.allinone.callerid.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "WeekInfo")
public class WeekInfo {
  @Column(autoGen = true, isId = true, name = "id")
  private int id;
  
  @Column(name = "isSelect")
  private boolean isSelect;
  
  @Column(name = "week")
  private String week;
  
  @Column(name = "weekId")
  private int weekId;
  
  public String getWeek() {
    return this.week;
  }
  
  public int getWeekId() {
    return this.weekId;
  }
  
  public boolean isSelect() {
    return this.isSelect;
  }
  
  public void setSelect(boolean paramBoolean) {
    this.isSelect = paramBoolean;
  }
  
  public void setWeek(String paramString) {
    this.week = paramString;
  }
  
  public void setWeekId(int paramInt) {
    this.weekId = paramInt;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("WeekInfo{id=");
    stringBuilder.append(this.id);
    stringBuilder.append(", week='");
    stringBuilder.append(this.week);
    stringBuilder.append('\'');
    stringBuilder.append(", isSelect=");
    stringBuilder.append(this.isSelect);
    stringBuilder.append(", weekId=");
    stringBuilder.append(this.weekId);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/WeekInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */