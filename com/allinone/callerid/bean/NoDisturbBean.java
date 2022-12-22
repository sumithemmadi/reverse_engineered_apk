package com.allinone.callerid.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "NoDistur")
public class NoDisturbBean {
  @Column(autoGen = true, isId = true, name = "id")
  private int id;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "number")
  private String number;
  
  public int getId() {
    return this.id;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getNumber() {
    return this.number;
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
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/NoDisturbBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */