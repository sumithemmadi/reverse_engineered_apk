package com.allinone.callerid.bean;

import java.io.Serializable;

public class EZSimpleContact implements Serializable {
  private int id;
  
  private String name;
  
  private String number;
  
  private String photo_id;
  
  private String type;
  
  public int getId() {
    return this.id;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getNumber() {
    return this.number;
  }
  
  public String getPhoto_id() {
    return this.photo_id;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public void setNumber(String paramString) {
    this.number = paramString;
  }
  
  public void setPhoto_id(String paramString) {
    this.photo_id = paramString;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/EZSimpleContact.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */