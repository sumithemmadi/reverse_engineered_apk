package com.allinone.callerid.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "comment")
public class CommentContent {
  @Column(name = "audit")
  private String audit;
  
  @Column(name = "author")
  private String author;
  
  @Column(name = "cid")
  private String cid;
  
  @Column(name = "comments_count")
  private int comments_count;
  
  @Column(name = "content")
  private String content;
  
  @Column(name = "create_time")
  private String create_time;
  
  @Column(autoGen = true, isId = true, name = "id", property = "NOT NULL")
  private int id;
  
  @Column(name = "inform")
  private String inform;
  
  @Column(name = "state")
  private int report_state;
  
  @Column(name = "t_p")
  private String t_p;
  
  @Column(name = "tel_number")
  private String tel_number;
  
  @Column(name = "type_label")
  private String type_label;
  
  public String getAudit() {
    return this.audit;
  }
  
  public String getAuthor() {
    return this.author;
  }
  
  public String getCid() {
    return this.cid;
  }
  
  public int getComments_count() {
    return this.comments_count;
  }
  
  public String getContent() {
    return this.content;
  }
  
  public String getCreate_time() {
    return this.create_time;
  }
  
  public int getId() {
    return this.id;
  }
  
  public String getInform() {
    return this.inform;
  }
  
  public int getReport_state() {
    return this.report_state;
  }
  
  public String getT_p() {
    return this.t_p;
  }
  
  public String getTel_number() {
    return this.tel_number;
  }
  
  public String getType_label() {
    return this.type_label;
  }
  
  public void setAudit(String paramString) {
    this.audit = paramString;
  }
  
  public void setAuthor(String paramString) {
    this.author = paramString;
  }
  
  public void setCid(String paramString) {
    this.cid = paramString;
  }
  
  public void setComments_count(int paramInt) {
    this.comments_count = paramInt;
  }
  
  public void setContent(String paramString) {
    this.content = paramString;
  }
  
  public void setCreate_time(String paramString) {
    this.create_time = paramString;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public void setInform(String paramString) {
    this.inform = paramString;
  }
  
  public void setReport_state(int paramInt) {
    this.report_state = paramInt;
  }
  
  public void setT_p(String paramString) {
    this.t_p = paramString;
  }
  
  public void setTel_number(String paramString) {
    this.tel_number = paramString;
  }
  
  public void setType_label(String paramString) {
    this.type_label = paramString;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("CommentContent{id=");
    stringBuilder.append(this.id);
    stringBuilder.append(", cid='");
    stringBuilder.append(this.cid);
    stringBuilder.append('\'');
    stringBuilder.append(", tel_number='");
    stringBuilder.append(this.tel_number);
    stringBuilder.append('\'');
    stringBuilder.append(", author='");
    stringBuilder.append(this.author);
    stringBuilder.append('\'');
    stringBuilder.append(", create_time='");
    stringBuilder.append(this.create_time);
    stringBuilder.append('\'');
    stringBuilder.append(", content='");
    stringBuilder.append(this.content);
    stringBuilder.append('\'');
    stringBuilder.append(", audit='");
    stringBuilder.append(this.audit);
    stringBuilder.append('\'');
    stringBuilder.append(", inform='");
    stringBuilder.append(this.inform);
    stringBuilder.append('\'');
    stringBuilder.append(", t_p='");
    stringBuilder.append(this.t_p);
    stringBuilder.append('\'');
    stringBuilder.append(", comments_count=");
    stringBuilder.append(this.comments_count);
    stringBuilder.append(", report_state=");
    stringBuilder.append(this.report_state);
    stringBuilder.append(", type_label='");
    stringBuilder.append(this.type_label);
    stringBuilder.append('\'');
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/CommentContent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */