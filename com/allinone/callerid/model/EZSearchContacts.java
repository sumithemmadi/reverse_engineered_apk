package com.allinone.callerid.model;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "com_allinone_callerid_model_EZSearchContacts")
public class EZSearchContacts {
  @Column(name = "activity_count")
  private String activity_count;
  
  @Column(name = "address")
  private String address;
  
  @Column(name = "avatar")
  private String avatar;
  
  @Column(name = "belong_area")
  private String belong_area;
  
  @Column(name = "block_count")
  private int block_count;
  
  @Column(name = "can_search_commentcount")
  private boolean can_search_commentcount = true;
  
  @Column(name = "cc")
  private String cc;
  
  @Column(name = "comment_count")
  private String comment_count;
  
  @Column(name = "comment_tags")
  private String comment_tags;
  
  @Column(name = "country")
  private String country;
  
  @Column(name = "date")
  private long date;
  
  @Column(name = "declined_count")
  private int declined_count;
  
  @Column(name = "e164_tel_number")
  private String e164_tel_number;
  
  @Column(name = "faild_error_log")
  private int faild_error_log;
  
  @Column(name = "fb_avatar")
  private String fb_avatar;
  
  @Column(name = "format_tel_number")
  private String format_tel_number;
  
  @Column(autoGen = true, isId = true, name = "id")
  private int id;
  
  @Column(name = "isSearched")
  private boolean isSearched;
  
  @Column(name = "is_activity")
  private int is_activity;
  
  @Column(name = "is_can_search")
  private boolean is_can_search = true;
  
  @Column(name = "keyword")
  private String keyword;
  
  @Column(name = "longnumberdate")
  private long longnumberdate;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "name_tags")
  private String name_tags;
  
  @Column(name = "old_tel_number")
  private String old_tel_number;
  
  @Column(name = "onedayincomingah")
  private int onedayincomingah;
  
  @Column(name = "operator")
  private String operator;
  
  @Column(name = "report_count")
  private String report_count;
  
  @Column(name = "search_time")
  private long search_time;
  
  @Column(name = "searched_buyu")
  private boolean searched_buyu;
  
  @Column(name = "soft_comments")
  private String soft_comments = "[]";
  
  @Column(name = "subtype")
  private String subtype;
  
  @Column(name = "subtype_cc")
  private String subtype_cc;
  
  @Column(name = "subtype_isserach")
  private boolean subtype_isserach;
  
  @Column(name = "subtype_pdt")
  private String subtype_pdt;
  
  @Column(name = "t_p")
  private String t_p;
  
  @Column(name = "tag_main")
  private String tag_main;
  
  @Column(name = "tag_sub")
  private String tag_sub;
  
  @Column(name = "tel_number")
  private String tel_number;
  
  @Column(name = "type")
  private String type;
  
  @Column(name = "type_label")
  private String type_label;
  
  @Column(name = "type_tags")
  private String type_tags;
  
  @Column(name = "website")
  private String website;
  
  @Column(name = "weekoutingnum")
  private int weekoutingnum;
  
  @Column(name = "weekoutingtime")
  private long weekoutingtime;
  
  @Column(name = "wiki_search_time")
  private long wiki_search_time;
  
  public String getActivity_count() {
    return this.activity_count;
  }
  
  public String getAddress() {
    return this.address;
  }
  
  public String getAvatar() {
    return this.avatar;
  }
  
  public String getBelong_area() {
    return this.belong_area;
  }
  
  public int getBlock_count() {
    return this.block_count;
  }
  
  public String getCc() {
    return this.cc;
  }
  
  public String getComment_count() {
    return this.comment_count;
  }
  
  public String getComment_tags() {
    return this.comment_tags;
  }
  
  public String getCountry() {
    return this.country;
  }
  
  public long getDate() {
    return this.date;
  }
  
  public int getDeclined_count() {
    return this.declined_count;
  }
  
  public String getE164_tel_number() {
    return this.e164_tel_number;
  }
  
  public int getFaild_error_log() {
    return this.faild_error_log;
  }
  
  public String getFb_avatar() {
    return this.fb_avatar;
  }
  
  public String getFormat_tel_number() {
    return this.format_tel_number;
  }
  
  public int getId() {
    return this.id;
  }
  
  public int getIs_activity() {
    return this.is_activity;
  }
  
  public String getKeyword() {
    return this.keyword;
  }
  
  public long getLongnumberdate() {
    return this.longnumberdate;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getName_tags() {
    return this.name_tags;
  }
  
  public String getOld_tel_number() {
    return this.old_tel_number;
  }
  
  public int getOnedayincomingah() {
    return this.onedayincomingah;
  }
  
  public String getOperator() {
    return this.operator;
  }
  
  public String getReport_count() {
    return this.report_count;
  }
  
  public long getSearch_time() {
    return this.search_time;
  }
  
  public String getSoft_comments() {
    return this.soft_comments;
  }
  
  public String getSubtype() {
    return this.subtype;
  }
  
  public String getSubtype_cc() {
    return this.subtype_cc;
  }
  
  public String getSubtype_pdt() {
    return this.subtype_pdt;
  }
  
  public String getT_p() {
    return this.t_p;
  }
  
  public String getTag_main() {
    return this.tag_main;
  }
  
  public String getTag_sub() {
    return this.tag_sub;
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
  
  public String getType_tags() {
    return this.type_tags;
  }
  
  public String getWebsite() {
    return this.website;
  }
  
  public int getWeekoutingnum() {
    return this.weekoutingnum;
  }
  
  public long getWeekoutingtime() {
    return this.weekoutingtime;
  }
  
  public long getWiki_search_time() {
    return this.wiki_search_time;
  }
  
  public boolean isCan_search_commentcount() {
    return this.can_search_commentcount;
  }
  
  public boolean isIs_can_search() {
    return this.is_can_search;
  }
  
  public boolean isSearched() {
    return this.isSearched;
  }
  
  public boolean isSearched_buyu() {
    return this.searched_buyu;
  }
  
  public boolean isSubtype_isserach() {
    return this.subtype_isserach;
  }
  
  public void setActivity_count(String paramString) {
    this.activity_count = paramString;
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
  
  public void setBlock_count(int paramInt) {
    this.block_count = paramInt;
  }
  
  public void setCan_search_commentcount(boolean paramBoolean) {
    this.can_search_commentcount = paramBoolean;
  }
  
  public void setCc(String paramString) {
    this.cc = paramString;
  }
  
  public void setComment_count(String paramString) {
    this.comment_count = paramString;
  }
  
  public void setComment_tags(String paramString) {
    this.comment_tags = paramString;
  }
  
  public void setCountry(String paramString) {
    this.country = paramString;
  }
  
  public void setDate(long paramLong) {
    this.date = paramLong;
  }
  
  public void setDeclined_count(int paramInt) {
    this.declined_count = paramInt;
  }
  
  public void setE164_tel_number(String paramString) {
    this.e164_tel_number = paramString;
  }
  
  public void setFaild_error_log(int paramInt) {
    this.faild_error_log = paramInt;
  }
  
  public void setFb_avatar(String paramString) {
    this.fb_avatar = paramString;
  }
  
  public void setFormat_tel_number(String paramString) {
    this.format_tel_number = paramString;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public void setIs_activity(int paramInt) {
    this.is_activity = paramInt;
  }
  
  public void setIs_can_search(boolean paramBoolean) {
    this.is_can_search = paramBoolean;
  }
  
  public void setKeyword(String paramString) {
    this.keyword = paramString;
  }
  
  public void setLongnumberdate(long paramLong) {
    this.longnumberdate = paramLong;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public void setName_tags(String paramString) {
    this.name_tags = paramString;
  }
  
  public void setOld_tel_number(String paramString) {
    this.old_tel_number = paramString;
  }
  
  public void setOnedayincomingah(int paramInt) {
    this.onedayincomingah = paramInt;
  }
  
  public void setOperator(String paramString) {
    this.operator = paramString;
  }
  
  public void setReport_count(String paramString) {
    this.report_count = paramString;
  }
  
  public void setSearch_time(long paramLong) {
    this.search_time = paramLong;
  }
  
  public void setSearched(boolean paramBoolean) {
    this.isSearched = paramBoolean;
  }
  
  public void setSearched_buyu(boolean paramBoolean) {
    this.searched_buyu = paramBoolean;
  }
  
  public void setSoft_comments(String paramString) {
    this.soft_comments = paramString;
  }
  
  public void setSubtype(String paramString) {
    this.subtype = paramString;
  }
  
  public void setSubtype_cc(String paramString) {
    this.subtype_cc = paramString;
  }
  
  public void setSubtype_isserach(boolean paramBoolean) {
    this.subtype_isserach = paramBoolean;
  }
  
  public void setSubtype_pdt(String paramString) {
    this.subtype_pdt = paramString;
  }
  
  public void setT_p(String paramString) {
    this.t_p = paramString;
  }
  
  public void setTag_main(String paramString) {
    this.tag_main = paramString;
  }
  
  public void setTag_sub(String paramString) {
    this.tag_sub = paramString;
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
  
  public void setType_tags(String paramString) {
    this.type_tags = paramString;
  }
  
  public void setWebsite(String paramString) {
    this.website = paramString;
  }
  
  public void setWeekoutingnum(int paramInt) {
    this.weekoutingnum = paramInt;
  }
  
  public void setWeekoutingtime(long paramLong) {
    this.weekoutingtime = paramLong;
  }
  
  public void setWiki_search_time(long paramLong) {
    this.wiki_search_time = paramLong;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("EZSearchContacts{id=");
    stringBuilder.append(this.id);
    stringBuilder.append(", tel_number='");
    stringBuilder.append(this.tel_number);
    stringBuilder.append('\'');
    stringBuilder.append(", old_tel_number='");
    stringBuilder.append(this.old_tel_number);
    stringBuilder.append('\'');
    stringBuilder.append(", format_tel_number='");
    stringBuilder.append(this.format_tel_number);
    stringBuilder.append('\'');
    stringBuilder.append(", operator='");
    stringBuilder.append(this.operator);
    stringBuilder.append('\'');
    stringBuilder.append(", type='");
    stringBuilder.append(this.type);
    stringBuilder.append('\'');
    stringBuilder.append(", type_label='");
    stringBuilder.append(this.type_label);
    stringBuilder.append('\'');
    stringBuilder.append(", report_count='");
    stringBuilder.append(this.report_count);
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
    stringBuilder.append(", faild_error_log=");
    stringBuilder.append(this.faild_error_log);
    stringBuilder.append(", avatar='");
    stringBuilder.append(this.avatar);
    stringBuilder.append('\'');
    stringBuilder.append(", fb_avatar='");
    stringBuilder.append(this.fb_avatar);
    stringBuilder.append('\'');
    stringBuilder.append(", tag_main='");
    stringBuilder.append(this.tag_main);
    stringBuilder.append('\'');
    stringBuilder.append(", tag_sub='");
    stringBuilder.append(this.tag_sub);
    stringBuilder.append('\'');
    stringBuilder.append(", soft_comments='");
    stringBuilder.append(this.soft_comments);
    stringBuilder.append('\'');
    stringBuilder.append(", website='");
    stringBuilder.append(this.website);
    stringBuilder.append('\'');
    stringBuilder.append(", t_p='");
    stringBuilder.append(this.t_p);
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
    stringBuilder.append(", keyword='");
    stringBuilder.append(this.keyword);
    stringBuilder.append('\'');
    stringBuilder.append(", subtype='");
    stringBuilder.append(this.subtype);
    stringBuilder.append('\'');
    stringBuilder.append(", subtype_cc='");
    stringBuilder.append(this.subtype_cc);
    stringBuilder.append('\'');
    stringBuilder.append(", subtype_pdt='");
    stringBuilder.append(this.subtype_pdt);
    stringBuilder.append('\'');
    stringBuilder.append(", subtype_isserach=");
    stringBuilder.append(this.subtype_isserach);
    stringBuilder.append(", date=");
    stringBuilder.append(this.date);
    stringBuilder.append(", isSearched=");
    stringBuilder.append(this.isSearched);
    stringBuilder.append(", search_time=");
    stringBuilder.append(this.search_time);
    stringBuilder.append(", is_can_search=");
    stringBuilder.append(this.is_can_search);
    stringBuilder.append(", comment_count='");
    stringBuilder.append(this.comment_count);
    stringBuilder.append('\'');
    stringBuilder.append(", can_search_commentcount=");
    stringBuilder.append(this.can_search_commentcount);
    stringBuilder.append(", is_activity=");
    stringBuilder.append(this.is_activity);
    stringBuilder.append(", activity_count='");
    stringBuilder.append(this.activity_count);
    stringBuilder.append('\'');
    stringBuilder.append(", e164_tel_number='");
    stringBuilder.append(this.e164_tel_number);
    stringBuilder.append('\'');
    stringBuilder.append(", cc='");
    stringBuilder.append(this.cc);
    stringBuilder.append('\'');
    stringBuilder.append(", block_count=");
    stringBuilder.append(this.block_count);
    stringBuilder.append(", declined_count=");
    stringBuilder.append(this.declined_count);
    stringBuilder.append(", wiki_search_time=");
    stringBuilder.append(this.wiki_search_time);
    stringBuilder.append(", onedayincomingah=");
    stringBuilder.append(this.onedayincomingah);
    stringBuilder.append(", longnumberdate=");
    stringBuilder.append(this.longnumberdate);
    stringBuilder.append(", searched_buyu=");
    stringBuilder.append(this.searched_buyu);
    stringBuilder.append(", weekoutingnum=");
    stringBuilder.append(this.weekoutingnum);
    stringBuilder.append(", weekoutingtime=");
    stringBuilder.append(this.weekoutingtime);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/model/EZSearchContacts.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */