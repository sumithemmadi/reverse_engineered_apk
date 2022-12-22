package com.allinone.callerid.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "com_allinone_callerid_bean_NumberContent")
public class NumberContent {
  @Column(autoGen = true, isId = true, name = "id")
  private int id;
  
  @Column(name = "is_reported")
  private boolean is_reported;
  
  @Column(name = "is_reported_wrong")
  private boolean is_reported_wrong;
  
  @Column(name = "number")
  private String number;
  
  @Column(name = "reported_time")
  private long reported_time;
  
  @Column(name = "show_submit_comment_time")
  private long show_submit_comment_time;
  
  @Column(name = "submit_commentst_time")
  private long submit_commentst_time;
  
  @Column(name = "subtype_mark_time")
  private long subtype_mark_time;
  
  @Column(name = "suggest_time")
  private long suggest_time;
  
  public int getId() {
    return this.id;
  }
  
  public String getNumber() {
    return this.number;
  }
  
  public long getReported_time() {
    return this.reported_time;
  }
  
  public long getShow_submit_comment_time() {
    return this.show_submit_comment_time;
  }
  
  public long getSubmit_commentst_time() {
    return this.submit_commentst_time;
  }
  
  public long getSubtype_mark_time() {
    return this.subtype_mark_time;
  }
  
  public long getSuggest_time() {
    return this.suggest_time;
  }
  
  public boolean is_reported() {
    return this.is_reported;
  }
  
  public boolean is_reported_wrong() {
    return this.is_reported_wrong;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public void setIs_reported(boolean paramBoolean) {
    this.is_reported = paramBoolean;
  }
  
  public void setIs_reported_wrong(boolean paramBoolean) {
    this.is_reported_wrong = paramBoolean;
  }
  
  public void setNumber(String paramString) {
    this.number = paramString;
  }
  
  public void setReported_time(long paramLong) {
    this.reported_time = paramLong;
  }
  
  public void setShow_submit_comment_time(long paramLong) {
    this.show_submit_comment_time = paramLong;
  }
  
  public void setSubmit_commentst_time(long paramLong) {
    this.submit_commentst_time = paramLong;
  }
  
  public void setSubtype_mark_time(long paramLong) {
    this.subtype_mark_time = paramLong;
  }
  
  public void setSuggest_time(long paramLong) {
    this.suggest_time = paramLong;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("NumberContent{id=");
    stringBuilder.append(this.id);
    stringBuilder.append(", number='");
    stringBuilder.append(this.number);
    stringBuilder.append('\'');
    stringBuilder.append(", is_reported=");
    stringBuilder.append(this.is_reported);
    stringBuilder.append(", is_reported_wrong=");
    stringBuilder.append(this.is_reported_wrong);
    stringBuilder.append(", suggest_time=");
    stringBuilder.append(this.suggest_time);
    stringBuilder.append(", reported_time=");
    stringBuilder.append(this.reported_time);
    stringBuilder.append(", submit_commentst_time=");
    stringBuilder.append(this.submit_commentst_time);
    stringBuilder.append(", subtype_mark_time=");
    stringBuilder.append(this.subtype_mark_time);
    stringBuilder.append(", show_submit_comment_time=");
    stringBuilder.append(this.show_submit_comment_time);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/NumberContent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */