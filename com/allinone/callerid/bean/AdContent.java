package com.allinone.callerid.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "com_allinone_callerid_bean_AdContent")
public class AdContent {
  @Column(name = "adname")
  private String adname;
  
  @Column(autoGen = true, isId = true, name = "id")
  private int id;
  
  @Column(name = "isSelected")
  private boolean isSelected;
  
  public String getAdname() {
    return this.adname;
  }
  
  public int getId() {
    return this.id;
  }
  
  public boolean isSelected() {
    return this.isSelected;
  }
  
  public void setAdname(String paramString) {
    this.adname = paramString;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public void setSelected(boolean paramBoolean) {
    this.isSelected = paramBoolean;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("AdContent{id=");
    stringBuilder.append(this.id);
    stringBuilder.append(", isSelected=");
    stringBuilder.append(this.isSelected);
    stringBuilder.append(", adname='");
    stringBuilder.append(this.adname);
    stringBuilder.append('\'');
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/AdContent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */