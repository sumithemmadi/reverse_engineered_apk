package com.allinone.callerid.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "android_spam")
public class OfflineContent {
  @Column(name = "address")
  private String address;
  
  @Column(name = "avatar")
  private String avatar;
  
  @Column(name = "belong_area")
  private String belong_area;
  
  @Column(autoGen = true, isId = true, name = "id")
  private int id;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "operator")
  private String operator;
  
  @Column(name = "report_count")
  private String report_count;
  
  @Column(name = "tel_number")
  private String tel_number;
  
  @Column(name = "type")
  private String type;
  
  @Column(name = "type_label")
  private String type_label;
  
  @Column(name = "website")
  private String website;
  
  public String getAddress() {
    return this.address;
  }
  
  public String getAvatar() {
    return this.avatar;
  }
  
  public String getBelong_area() {
    return this.belong_area;
  }
  
  public int getId() {
    return this.id;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getOperator() {
    return this.operator;
  }
  
  public String getReport_count() {
    return this.report_count;
  }
  
  public String getTel_number() {
    return this.tel_number;
  }
  
  public String getType() {
    return this.type;
  }
  
  public String getType_label() {
    return this.type_label;
  }
  
  public String getWebsite() {
    return this.website;
  }
  
  public void setAddress(String paramString) {
    this.address = paramString;
  }
  
  public void setAvatar(String paramString) {
    this.avatar = paramString;
  }
  
  public void setBelong_area(String paramString) {
    this.belong_area = paramString;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public void setOperator(String paramString) {
    this.operator = paramString;
  }
  
  public void setReport_count(String paramString) {
    this.report_count = paramString;
  }
  
  public void setTel_number(String paramString) {
    this.tel_number = paramString;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public void setType_label(String paramString) {
    this.type_label = paramString;
  }
  
  public void setWebsite(String paramString) {
    this.website = paramString;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("OfflineContent{id=");
    stringBuilder.append(this.id);
    stringBuilder.append(", tel_number='");
    stringBuilder.append(this.tel_number);
    stringBuilder.append('\'');
    stringBuilder.append(", operator='");
    stringBuilder.append(this.operator);
    stringBuilder.append('\'');
    stringBuilder.append(", belong_area='");
    stringBuilder.append(this.belong_area);
    stringBuilder.append('\'');
    stringBuilder.append(", address='");
    stringBuilder.append(this.address);
    stringBuilder.append('\'');
    stringBuilder.append(", type='");
    stringBuilder.append(this.type);
    stringBuilder.append('\'');
    stringBuilder.append(", name='");
    stringBuilder.append(this.name);
    stringBuilder.append('\'');
    stringBuilder.append(", website='");
    stringBuilder.append(this.website);
    stringBuilder.append('\'');
    stringBuilder.append(", avatar='");
    stringBuilder.append(this.avatar);
    stringBuilder.append('\'');
    stringBuilder.append(", report_count='");
    stringBuilder.append(this.report_count);
    stringBuilder.append('\'');
    stringBuilder.append(", type_label='");
    stringBuilder.append(this.type_label);
    stringBuilder.append('\'');
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/OfflineContent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */