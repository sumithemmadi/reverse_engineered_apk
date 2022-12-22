package com.allinone.callerid.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "com_allinone_callerid_bean_SpamCall")
public class SpamCall {
  @Column(name = "address")
  private String address;
  
  @Column(name = "avatar")
  private String avatar;
  
  @Column(name = "belong_area")
  private String belong_area;
  
  @Column(name = "calltype")
  private int calltype;
  
  @Column(name = "comment_tags")
  private String comment_tags;
  
  @Column(name = "country")
  private String country;
  
  @Column(name = "date")
  private String date;
  
  @Column(name = "format_tel_number")
  private String format_tel_number;
  
  @Column(autoGen = true, isId = true, name = "id")
  private int id;
  
  @Column(name = "isSelected")
  private boolean isSelected;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "name_tags")
  private String name_tags;
  
  @Column(name = "number")
  private String number;
  
  @Column(name = "operator")
  private String operator;
  
  @Column(name = "reportcounts")
  private String reportcounts;
  
  @Column(name = "tel_number")
  private String tel_number;
  
  @Column(name = "type")
  private String type;
  
  @Column(name = "type_tags")
  private String type_tags;
  
  @Column(name = "typelabel")
  private String typelabel;
  
  public String getAddress() {
    return this.address;
  }
  
  public String getAvatar() {
    return this.avatar;
  }
  
  public String getBelong_area() {
    return this.belong_area;
  }
  
  public int getCalltype() {
    return this.calltype;
  }
  
  public String getComment_tags() {
    return this.comment_tags;
  }
  
  public String getCountry() {
    return this.country;
  }
  
  public String getDate() {
    return this.date;
  }
  
  public String getFormat_tel_number() {
    return this.format_tel_number;
  }
  
  public int getId() {
    return this.id;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getName_tags() {
    return this.name_tags;
  }
  
  public String getNumber() {
    return this.number;
  }
  
  public String getOperator() {
    return this.operator;
  }
  
  public String getReportcounts() {
    return this.reportcounts;
  }
  
  public String getTel_number() {
    return this.tel_number;
  }
  
  public String getType() {
    return this.type;
  }
  
  public String getType_tags() {
    return this.type_tags;
  }
  
  public String getTypelabel() {
    return this.typelabel;
  }
  
  public boolean isSelected() {
    return this.isSelected;
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
  
  public void setCalltype(int paramInt) {
    this.calltype = paramInt;
  }
  
  public void setComment_tags(String paramString) {
    this.comment_tags = paramString;
  }
  
  public void setCountry(String paramString) {
    this.country = paramString;
  }
  
  public void setDate(String paramString) {
    this.date = paramString;
  }
  
  public void setFormat_tel_number(String paramString) {
    this.format_tel_number = paramString;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public void setName_tags(String paramString) {
    this.name_tags = paramString;
  }
  
  public void setNumber(String paramString) {
    this.number = paramString;
  }
  
  public void setOperator(String paramString) {
    this.operator = paramString;
  }
  
  public void setReportcounts(String paramString) {
    this.reportcounts = paramString;
  }
  
  public void setSelected(boolean paramBoolean) {
    this.isSelected = paramBoolean;
  }
  
  public void setTel_number(String paramString) {
    this.tel_number = paramString;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public void setType_tags(String paramString) {
    this.type_tags = paramString;
  }
  
  public void setTypelabel(String paramString) {
    this.typelabel = paramString;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("SpamCall{id=");
    stringBuilder.append(this.id);
    stringBuilder.append(", calltype=");
    stringBuilder.append(this.calltype);
    stringBuilder.append(", number='");
    stringBuilder.append(this.number);
    stringBuilder.append('\'');
    stringBuilder.append(", reportcounts='");
    stringBuilder.append(this.reportcounts);
    stringBuilder.append('\'');
    stringBuilder.append(", typelabel='");
    stringBuilder.append(this.typelabel);
    stringBuilder.append('\'');
    stringBuilder.append(", type='");
    stringBuilder.append(this.type);
    stringBuilder.append('\'');
    stringBuilder.append(", date='");
    stringBuilder.append(this.date);
    stringBuilder.append('\'');
    stringBuilder.append(", isSelected=");
    stringBuilder.append(this.isSelected);
    stringBuilder.append(", tel_number='");
    stringBuilder.append(this.tel_number);
    stringBuilder.append('\'');
    stringBuilder.append(", format_tel_number='");
    stringBuilder.append(this.format_tel_number);
    stringBuilder.append('\'');
    stringBuilder.append(", operator='");
    stringBuilder.append(this.operator);
    stringBuilder.append('\'');
    stringBuilder.append(", name='");
    stringBuilder.append(this.name);
    stringBuilder.append('\'');
    stringBuilder.append(", address='");
    stringBuilder.append(this.address);
    stringBuilder.append('\'');
    stringBuilder.append(", belong_area='");
    stringBuilder.append(this.belong_area);
    stringBuilder.append('\'');
    stringBuilder.append(", avatar='");
    stringBuilder.append(this.avatar);
    stringBuilder.append('\'');
    stringBuilder.append(", type_tags='");
    stringBuilder.append(this.type_tags);
    stringBuilder.append('\'');
    stringBuilder.append(", name_tags='");
    stringBuilder.append(this.name_tags);
    stringBuilder.append('\'');
    stringBuilder.append(", comment_tags='");
    stringBuilder.append(this.comment_tags);
    stringBuilder.append('\'');
    stringBuilder.append(", country='");
    stringBuilder.append(this.country);
    stringBuilder.append('\'');
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/SpamCall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */