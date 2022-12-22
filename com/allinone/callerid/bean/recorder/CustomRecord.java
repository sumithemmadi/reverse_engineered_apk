package com.allinone.callerid.bean.recorder;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "CustomRecord")
public class CustomRecord {
  public static final int TYPEBLACK = 1;
  
  public static final int TYPEWHITE = 0;
  
  @Column(name = "contactId")
  private String contactId;
  
  @Column(autoGen = true, isId = true, name = "id")
  private int id;
  
  private boolean isSelect;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "phone")
  private String phone;
  
  @Column(name = "type")
  private int type;
  
  public String getContactId() {
    return this.contactId;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getPhone() {
    return this.phone;
  }
  
  public int getType() {
    return this.type;
  }
  
  public boolean isSelect() {
    return this.isSelect;
  }
  
  public void setContactId(String paramString) {
    this.contactId = paramString;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public void setPhone(String paramString) {
    this.phone = paramString;
  }
  
  public void setSelect(boolean paramBoolean) {
    this.isSelect = paramBoolean;
  }
  
  public void setType(int paramInt) {
    this.type = paramInt;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/recorder/CustomRecord.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */