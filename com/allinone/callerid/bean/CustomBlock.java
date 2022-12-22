package com.allinone.callerid.bean;

import java.io.Serializable;
import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "customblock")
public class CustomBlock implements Serializable {
  @Column(autoGen = true, isId = true, name = "_id")
  private int id;
  
  @Column(name = "isselected")
  private boolean isselected;
  
  @Column(name = "number")
  private String number;
  
  @Column(name = "type")
  private int type;
  
  public String getNumber() {
    return this.number;
  }
  
  public int getType() {
    return this.type;
  }
  
  public boolean isselected() {
    return this.isselected;
  }
  
  public void setIsselected(boolean paramBoolean) {
    this.isselected = paramBoolean;
  }
  
  public void setNumber(String paramString) {
    this.number = paramString;
  }
  
  public void setType(int paramInt) {
    this.type = paramInt;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("CustomBlock{id=");
    stringBuilder.append(this.id);
    stringBuilder.append(", number='");
    stringBuilder.append(this.number);
    stringBuilder.append('\'');
    stringBuilder.append(", type=");
    stringBuilder.append(this.type);
    stringBuilder.append(", isselected=");
    stringBuilder.append(this.isselected);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/CustomBlock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */