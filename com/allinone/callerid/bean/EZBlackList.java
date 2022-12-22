package com.allinone.callerid.bean;

import java.io.Serializable;
import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "blacklist")
public class EZBlackList implements Serializable {
  @Column(name = "address")
  private String address;
  
  @Column(name = "formatnumber")
  private String formatnumber;
  
  @Column(autoGen = true, isId = true, name = "_id")
  private int id;
  
  @Column(name = "ismyblocklist")
  private String ismyblocklist;
  
  @Column(name = "ismyblocklistfromspams")
  private String ismyblocklistfromspams;
  
  @Column(name = "isselected")
  private boolean isselected;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "number")
  private String number;
  
  @Column(name = "operator")
  private String operator;
  
  @Column(name = "report_count")
  private String report_count;
  
  @Column(name = "score_level")
  private String score_level;
  
  @Column(name = "spam_type")
  private String spam_type;
  
  @Column(name = "type")
  private String type;
  
  public String getAddress() {
    return this.address;
  }
  
  public String getFormat_number() {
    return this.formatnumber;
  }
  
  public int getId() {
    return this.id;
  }
  
  public String getIs_myblock() {
    return this.ismyblocklist;
  }
  
  public String getIsmyblocklistfromspams() {
    return this.ismyblocklistfromspams;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getNumber() {
    return this.number;
  }
  
  public String getOperator() {
    return this.operator;
  }
  
  public String getReport_count() {
    return this.report_count;
  }
  
  public String getScore_level() {
    return this.score_level;
  }
  
  public String getSpam_type() {
    return this.spam_type;
  }
  
  public String getType() {
    return this.type;
  }
  
  public boolean isselected() {
    return this.isselected;
  }
  
  public void setAddress(String paramString) {
    this.address = paramString;
  }
  
  public void setFormat_number(String paramString) {
    this.formatnumber = paramString;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public void setIs_myblock(String paramString) {
    this.ismyblocklist = paramString;
  }
  
  public void setIsmyblocklistfromspams(String paramString) {
    this.ismyblocklistfromspams = paramString;
  }
  
  public void setIsselected(boolean paramBoolean) {
    this.isselected = paramBoolean;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public void setNumber(String paramString) {
    this.number = paramString;
  }
  
  public void setOperator(String paramString) {
    this.operator = paramString;
  }
  
  public void setReport_count(String paramString) {
    this.report_count = paramString;
  }
  
  public void setScore_level(String paramString) {
    this.score_level = paramString;
  }
  
  public void setSpam_type(String paramString) {
    this.spam_type = paramString;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("EZBlackList{id='");
    stringBuilder.append(this.id);
    stringBuilder.append('\'');
    stringBuilder.append(", name='");
    stringBuilder.append(this.name);
    stringBuilder.append('\'');
    stringBuilder.append(", number='");
    stringBuilder.append(this.number);
    stringBuilder.append('\'');
    stringBuilder.append(", formatnumber='");
    stringBuilder.append(this.formatnumber);
    stringBuilder.append('\'');
    stringBuilder.append(", ismyblocklistfromspams='");
    stringBuilder.append(this.ismyblocklistfromspams);
    stringBuilder.append('\'');
    stringBuilder.append(", ismyblocklist='");
    stringBuilder.append(this.ismyblocklist);
    stringBuilder.append('\'');
    stringBuilder.append(", type='");
    stringBuilder.append(this.type);
    stringBuilder.append('\'');
    stringBuilder.append(", spam_type='");
    stringBuilder.append(this.spam_type);
    stringBuilder.append('\'');
    stringBuilder.append(", operator='");
    stringBuilder.append(this.operator);
    stringBuilder.append('\'');
    stringBuilder.append(", address='");
    stringBuilder.append(this.address);
    stringBuilder.append('\'');
    stringBuilder.append(", report_count='");
    stringBuilder.append(this.report_count);
    stringBuilder.append('\'');
    stringBuilder.append(", score_level='");
    stringBuilder.append(this.score_level);
    stringBuilder.append('\'');
    stringBuilder.append(", isselected=");
    stringBuilder.append(this.isselected);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/EZBlackList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */