package com.allinone.callerid.bean;

public class SubType {
  private String cc;
  
  private int count;
  
  private boolean is_custom;
  
  private boolean is_has_bg;
  
  private String subtype;
  
  private String subtype_id;
  
  private String tel_number;
  
  private String type;
  
  public String getCc() {
    return this.cc;
  }
  
  public int getCount() {
    return this.count;
  }
  
  public String getSubtype() {
    return this.subtype;
  }
  
  public String getSubtype_id() {
    return this.subtype_id;
  }
  
  public String getTel_number() {
    return this.tel_number;
  }
  
  public String getType() {
    return this.type;
  }
  
  public boolean isIs_custom() {
    return this.is_custom;
  }
  
  public boolean isIs_has_bg() {
    return this.is_has_bg;
  }
  
  public void setCc(String paramString) {
    this.cc = paramString;
  }
  
  public void setCount(int paramInt) {
    this.count = paramInt;
  }
  
  public void setIs_custom(boolean paramBoolean) {
    this.is_custom = paramBoolean;
  }
  
  public void setIs_has_bg(boolean paramBoolean) {
    this.is_has_bg = paramBoolean;
  }
  
  public void setSubtype(String paramString) {
    this.subtype = paramString;
  }
  
  public void setSubtype_id(String paramString) {
    this.subtype_id = paramString;
  }
  
  public void setTel_number(String paramString) {
    this.tel_number = paramString;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("SubType{subtype='");
    stringBuilder.append(this.subtype);
    stringBuilder.append('\'');
    stringBuilder.append(", count='");
    stringBuilder.append(this.count);
    stringBuilder.append('\'');
    stringBuilder.append(", subtype_id='");
    stringBuilder.append(this.subtype_id);
    stringBuilder.append('\'');
    stringBuilder.append(", type='");
    stringBuilder.append(this.type);
    stringBuilder.append('\'');
    stringBuilder.append(", tel_number='");
    stringBuilder.append(this.tel_number);
    stringBuilder.append('\'');
    stringBuilder.append(", cc='");
    stringBuilder.append(this.cc);
    stringBuilder.append('\'');
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/SubType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */