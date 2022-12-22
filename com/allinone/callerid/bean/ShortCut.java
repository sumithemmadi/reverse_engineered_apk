package com.allinone.callerid.bean;

import java.io.Serializable;

public class ShortCut implements Serializable {
  public static final String ID = "_id";
  
  public static final String NAME = "name";
  
  public static final String NUMBER = "number";
  
  private String id;
  
  private String name;
  
  private String number;
  
  public String getId() {
    return this.id;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getNumber() {
    return this.number;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public void setNumber(String paramString) {
    this.number = paramString;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ShortCut{id='");
    stringBuilder.append(this.id);
    stringBuilder.append('\'');
    stringBuilder.append(", name='");
    stringBuilder.append(this.name);
    stringBuilder.append('\'');
    stringBuilder.append(", number='");
    stringBuilder.append(this.number);
    stringBuilder.append('\'');
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/ShortCut.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */