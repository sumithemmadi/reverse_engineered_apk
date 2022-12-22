package com.allinone.callerid.callscreen.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "RewardedAdInfo")
public class RewardedAdInfo {
  @Column(name = "dataId")
  private String dataId;
  
  @Column(autoGen = true, isId = true, name = "id", property = "NOT NULL")
  private int id;
  
  @Column(name = "name")
  private String name;
  
  public String getDataId() {
    return this.dataId;
  }
  
  public int getId() {
    return this.id;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setDataId(String paramString) {
    this.dataId = paramString;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("RewardedAdInfo{id=");
    stringBuilder.append(this.id);
    stringBuilder.append(", name='");
    stringBuilder.append(this.name);
    stringBuilder.append('\'');
    stringBuilder.append(", dataId='");
    stringBuilder.append(this.dataId);
    stringBuilder.append('\'');
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callscreen/bean/RewardedAdInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */