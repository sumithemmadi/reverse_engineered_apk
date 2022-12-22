package com.allinone.callerid.search;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class EZSearchResult implements Serializable, Parcelable {
  public static final Parcelable.Creator<EZSearchResult> CREATOR = new a();
  
  private int Report_count;
  
  private String activity_count;
  
  private String address;
  
  private int block_count;
  
  private String block_times;
  
  private String comment_tags;
  
  private String complaint_times;
  
  private int count;
  
  private String country;
  
  private long date;
  
  private int declined_count;
  
  private String email;
  
  private String format_tel_number;
  
  private String icon;
  
  private long incomingtime;
  
  private boolean isContact;
  
  private boolean isSpam;
  
  private int is_activity;
  
  private boolean issetfav;
  
  private String keyword;
  
  private String location;
  
  private long longnumberdate;
  
  private int max_report;
  
  private String name;
  
  private String number;
  
  private String old_tel_number;
  
  private int onedayincomingah;
  
  private String operator;
  
  private int raw_contact_id;
  
  private String soft_comments;
  
  private int status;
  
  private String subtype;
  
  private String subtype_cc;
  
  private String subtype_pdt;
  
  private String t_p;
  
  private String tag_main;
  
  private String tag_sub;
  
  private String tel_number;
  
  private String type;
  
  private String type_label;
  
  private String type_label_id;
  
  private String website;
  
  private int weekoutingnum;
  
  public EZSearchResult() {}
  
  protected EZSearchResult(Parcel paramParcel) {
    boolean bool2;
    this.type = paramParcel.readString();
    this.location = paramParcel.readString();
    this.email = paramParcel.readString();
    byte b = paramParcel.readByte();
    boolean bool1 = true;
    if (b != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.isContact = bool2;
    this.icon = paramParcel.readString();
    this.website = paramParcel.readString();
    this.address = paramParcel.readString();
    this.Report_count = paramParcel.readInt();
    this.type_label = paramParcel.readString();
    this.type_label_id = paramParcel.readString();
    this.date = paramParcel.readLong();
    this.old_tel_number = paramParcel.readString();
    this.tel_number = paramParcel.readString();
    this.format_tel_number = paramParcel.readString();
    this.name = paramParcel.readString();
    this.max_report = paramParcel.readInt();
    this.status = paramParcel.readInt();
    if (paramParcel.readByte() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.isSpam = bool2;
    if (paramParcel.readByte() != 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    this.issetfav = bool2;
    this.block_times = paramParcel.readString();
    this.complaint_times = paramParcel.readString();
    this.number = paramParcel.readString();
    this.tag_main = paramParcel.readString();
    this.tag_sub = paramParcel.readString();
    this.soft_comments = paramParcel.readString();
    this.operator = paramParcel.readString();
    this.t_p = paramParcel.readString();
    this.comment_tags = paramParcel.readString();
    this.country = paramParcel.readString();
    this.subtype = paramParcel.readString();
    this.subtype_cc = paramParcel.readString();
    this.raw_contact_id = paramParcel.readInt();
    this.count = paramParcel.readInt();
    this.subtype_pdt = paramParcel.readString();
    this.keyword = paramParcel.readString();
    this.is_activity = paramParcel.readInt();
    this.activity_count = paramParcel.readString();
    this.weekoutingnum = paramParcel.readInt();
    this.block_count = paramParcel.readInt();
    this.declined_count = paramParcel.readInt();
    this.incomingtime = paramParcel.readLong();
    this.onedayincomingah = paramParcel.readInt();
    this.longnumberdate = paramParcel.readLong();
  }
  
  public int describeContents() {
    return 0;
  }
  
  public String getActivity_count() {
    return this.activity_count;
  }
  
  public String getAddress() {
    return this.address;
  }
  
  public int getBlock_count() {
    return this.block_count;
  }
  
  public String getBlock_times() {
    return this.block_times;
  }
  
  public String getComment_tags() {
    return this.comment_tags;
  }
  
  public String getComplaint_times() {
    return this.complaint_times;
  }
  
  public int getCount() {
    return this.count;
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
  
  public String getEmail() {
    return this.email;
  }
  
  public String getFormat_tel_number() {
    return this.format_tel_number;
  }
  
  public String getIcon() {
    return this.icon;
  }
  
  public long getIncomingtime() {
    return this.incomingtime;
  }
  
  public int getIs_activity() {
    return this.is_activity;
  }
  
  public String getKeyword() {
    return this.keyword;
  }
  
  public String getLocation() {
    return this.location;
  }
  
  public long getLongnumberdate() {
    return this.longnumberdate;
  }
  
  public int getMax_report() {
    return this.max_report;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getNumber() {
    return this.number;
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
  
  public int getRaw_contact_id() {
    return this.raw_contact_id;
  }
  
  public int getReport_count() {
    return this.Report_count;
  }
  
  public String getSoft_comments() {
    return this.soft_comments;
  }
  
  public int getStatus() {
    return this.status;
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
  
  public String getType_label_id() {
    return this.type_label_id;
  }
  
  public String getWebsite() {
    return this.website;
  }
  
  public int getWeekoutingnum() {
    return this.weekoutingnum;
  }
  
  public boolean isContact() {
    return this.isContact;
  }
  
  public boolean isIssetfav() {
    return this.issetfav;
  }
  
  public boolean isSpam() {
    return this.isSpam;
  }
  
  public boolean issetfav() {
    return this.issetfav;
  }
  
  public void setActivity_count(String paramString) {
    this.activity_count = paramString;
  }
  
  public void setAddress(String paramString) {
    this.address = paramString;
  }
  
  public void setBlock_count(int paramInt) {
    this.block_count = paramInt;
  }
  
  public void setBlock_times(String paramString) {
    this.block_times = paramString;
  }
  
  public void setComment_tags(String paramString) {
    this.comment_tags = paramString;
  }
  
  public void setComplaint_times(String paramString) {
    this.complaint_times = paramString;
  }
  
  public void setContact(boolean paramBoolean) {
    this.isContact = paramBoolean;
  }
  
  public void setCount(int paramInt) {
    this.count = paramInt;
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
  
  public void setEmail(String paramString) {
    this.email = paramString;
  }
  
  public void setFormat_tel_number(String paramString) {
    this.format_tel_number = paramString;
  }
  
  public void setIcon(String paramString) {
    this.icon = paramString;
  }
  
  public void setIncomingtime(long paramLong) {
    this.incomingtime = paramLong;
  }
  
  public void setIsSpam(boolean paramBoolean) {
    this.isSpam = paramBoolean;
  }
  
  public void setIs_activity(int paramInt) {
    this.is_activity = paramInt;
  }
  
  public void setIssetfav(boolean paramBoolean) {
    this.issetfav = paramBoolean;
  }
  
  public void setKeyword(String paramString) {
    this.keyword = paramString;
  }
  
  public void setLocation(String paramString) {
    this.location = paramString;
  }
  
  public void setLongnumberdate(long paramLong) {
    this.longnumberdate = paramLong;
  }
  
  public void setMax_report(int paramInt) {
    this.max_report = paramInt;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public void setNumber(String paramString) {
    this.number = paramString;
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
  
  public void setRaw_contact_id(int paramInt) {
    this.raw_contact_id = paramInt;
  }
  
  public void setReport_count(int paramInt) {
    this.Report_count = paramInt;
  }
  
  public void setSoft_comments(String paramString) {
    this.soft_comments = paramString;
  }
  
  public void setSpam(boolean paramBoolean) {
    this.isSpam = paramBoolean;
  }
  
  public void setStatus(int paramInt) {
    this.status = paramInt;
  }
  
  public void setSubtype(String paramString) {
    this.subtype = paramString;
  }
  
  public void setSubtype_cc(String paramString) {
    this.subtype_cc = paramString;
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
  
  public void setType_label_id(String paramString) {
    this.type_label_id = paramString;
  }
  
  public void setWebsite(String paramString) {
    this.website = paramString;
  }
  
  public void setWeekoutingnum(int paramInt) {
    this.weekoutingnum = paramInt;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("EZSearchResult{type='");
    stringBuilder.append(this.type);
    stringBuilder.append('\'');
    stringBuilder.append(", location='");
    stringBuilder.append(this.location);
    stringBuilder.append('\'');
    stringBuilder.append(", email='");
    stringBuilder.append(this.email);
    stringBuilder.append('\'');
    stringBuilder.append(", isContact=");
    stringBuilder.append(this.isContact);
    stringBuilder.append(", icon='");
    stringBuilder.append(this.icon);
    stringBuilder.append('\'');
    stringBuilder.append(", website='");
    stringBuilder.append(this.website);
    stringBuilder.append('\'');
    stringBuilder.append(", address='");
    stringBuilder.append(this.address);
    stringBuilder.append('\'');
    stringBuilder.append(", Report_count=");
    stringBuilder.append(this.Report_count);
    stringBuilder.append(", type_label='");
    stringBuilder.append(this.type_label);
    stringBuilder.append('\'');
    stringBuilder.append(", type_label_id='");
    stringBuilder.append(this.type_label_id);
    stringBuilder.append('\'');
    stringBuilder.append(", date=");
    stringBuilder.append(this.date);
    stringBuilder.append(", old_tel_number='");
    stringBuilder.append(this.old_tel_number);
    stringBuilder.append('\'');
    stringBuilder.append(", tel_number='");
    stringBuilder.append(this.tel_number);
    stringBuilder.append('\'');
    stringBuilder.append(", format_tel_number='");
    stringBuilder.append(this.format_tel_number);
    stringBuilder.append('\'');
    stringBuilder.append(", name='");
    stringBuilder.append(this.name);
    stringBuilder.append('\'');
    stringBuilder.append(", max_report=");
    stringBuilder.append(this.max_report);
    stringBuilder.append(", status=");
    stringBuilder.append(this.status);
    stringBuilder.append(", isSpam=");
    stringBuilder.append(this.isSpam);
    stringBuilder.append(", issetfav=");
    stringBuilder.append(this.issetfav);
    stringBuilder.append(", block_times='");
    stringBuilder.append(this.block_times);
    stringBuilder.append('\'');
    stringBuilder.append(", complaint_times='");
    stringBuilder.append(this.complaint_times);
    stringBuilder.append('\'');
    stringBuilder.append(", number='");
    stringBuilder.append(this.number);
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
    stringBuilder.append(", operator='");
    stringBuilder.append(this.operator);
    stringBuilder.append('\'');
    stringBuilder.append(", t_p='");
    stringBuilder.append(this.t_p);
    stringBuilder.append('\'');
    stringBuilder.append(", comment_tags='");
    stringBuilder.append(this.comment_tags);
    stringBuilder.append('\'');
    stringBuilder.append(", country='");
    stringBuilder.append(this.country);
    stringBuilder.append('\'');
    stringBuilder.append(", subtype='");
    stringBuilder.append(this.subtype);
    stringBuilder.append('\'');
    stringBuilder.append(", subtype_cc='");
    stringBuilder.append(this.subtype_cc);
    stringBuilder.append('\'');
    stringBuilder.append(", raw_contact_id=");
    stringBuilder.append(this.raw_contact_id);
    stringBuilder.append(", count=");
    stringBuilder.append(this.count);
    stringBuilder.append(", subtype_pdt='");
    stringBuilder.append(this.subtype_pdt);
    stringBuilder.append('\'');
    stringBuilder.append(", keyword='");
    stringBuilder.append(this.keyword);
    stringBuilder.append('\'');
    stringBuilder.append(", is_activity=");
    stringBuilder.append(this.is_activity);
    stringBuilder.append(", activity_count='");
    stringBuilder.append(this.activity_count);
    stringBuilder.append('\'');
    stringBuilder.append(", weekoutingnum=");
    stringBuilder.append(this.weekoutingnum);
    stringBuilder.append(", block_count=");
    stringBuilder.append(this.block_count);
    stringBuilder.append(", declined_count=");
    stringBuilder.append(this.declined_count);
    stringBuilder.append(", incomingtime=");
    stringBuilder.append(this.incomingtime);
    stringBuilder.append(", onedayincomingah=");
    stringBuilder.append(this.onedayincomingah);
    stringBuilder.append(", longnumberdate=");
    stringBuilder.append(this.longnumberdate);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeString(this.type);
    paramParcel.writeString(this.location);
    paramParcel.writeString(this.email);
    paramParcel.writeByte(this.isContact);
    paramParcel.writeString(this.icon);
    paramParcel.writeString(this.website);
    paramParcel.writeString(this.address);
    paramParcel.writeInt(this.Report_count);
    paramParcel.writeString(this.type_label);
    paramParcel.writeString(this.type_label_id);
    paramParcel.writeLong(this.date);
    paramParcel.writeString(this.old_tel_number);
    paramParcel.writeString(this.tel_number);
    paramParcel.writeString(this.format_tel_number);
    paramParcel.writeString(this.name);
    paramParcel.writeInt(this.max_report);
    paramParcel.writeInt(this.status);
    paramParcel.writeByte(this.isSpam);
    paramParcel.writeByte(this.issetfav);
    paramParcel.writeString(this.block_times);
    paramParcel.writeString(this.complaint_times);
    paramParcel.writeString(this.number);
    paramParcel.writeString(this.tag_main);
    paramParcel.writeString(this.tag_sub);
    paramParcel.writeString(this.soft_comments);
    paramParcel.writeString(this.operator);
    paramParcel.writeString(this.t_p);
    paramParcel.writeString(this.comment_tags);
    paramParcel.writeString(this.country);
    paramParcel.writeString(this.subtype);
    paramParcel.writeString(this.subtype_cc);
    paramParcel.writeInt(this.raw_contact_id);
    paramParcel.writeInt(this.count);
    paramParcel.writeString(this.subtype_pdt);
    paramParcel.writeString(this.keyword);
    paramParcel.writeInt(this.is_activity);
    paramParcel.writeString(this.activity_count);
    paramParcel.writeInt(this.weekoutingnum);
    paramParcel.writeInt(this.block_count);
    paramParcel.writeInt(this.declined_count);
    paramParcel.writeLong(this.incomingtime);
    paramParcel.writeInt(this.onedayincomingah);
    paramParcel.writeLong(this.longnumberdate);
  }
  
  static final class a implements Parcelable.Creator<EZSearchResult> {
    public EZSearchResult a(Parcel param1Parcel) {
      return new EZSearchResult(param1Parcel);
    }
    
    public EZSearchResult[] b(int param1Int) {
      return new EZSearchResult[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/search/EZSearchResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */