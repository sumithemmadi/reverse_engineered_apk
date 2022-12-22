package com.allinone.callerid.bean.recorder;

import java.io.Serializable;
import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "RrcordCall")
public class RecordCall implements Serializable {
  public static final int PHONESTATUSANSWER = 110;
  
  public static final int PHONESTATUSCALL = 111;
  
  public static final int harassstatusHARASS = 121;
  
  public static final int harassstatusORDINARY = 120;
  
  public static final int harassstatusUNIDENTIFICATION = 122;
  
  public static final int numbertypeCONTACT = 101;
  
  public static final int numbertypeSTRANGE = 100;
  
  @Column(name = "callid")
  private String callid;
  
  @Column(name = "callidint")
  private int callidint;
  
  @Column(name = "endtime")
  private long endtime;
  
  @Column(name = "filename")
  private String filename;
  
  @Column(name = "filepath")
  private String filepath;
  
  @Column(name = "filesize")
  private long filesize;
  
  @Column(name = "filesizestring")
  private String filesizestring;
  
  @Column(name = "harassstatus")
  private int harassstatus;
  
  private String hearddata;
  
  @Column(autoGen = true, isId = true, name = "id")
  private int id;
  
  @Column(name = "isupload")
  private int isupload;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "number")
  private String number;
  
  @Column(name = "numbertype")
  private int numbertype;
  
  @Column(name = "phoneType")
  private String phoneType;
  
  @Column(name = "phonestatus")
  private int phonestatus;
  
  @Column(name = "recordcount")
  private int recordcount;
  
  @Column(name = "recordtime")
  private String recordtime;
  
  @Column(name = "recordtimems")
  private String recordtimems;
  
  @Column(name = "remark")
  private String remark;
  
  @Column(name = "starttime")
  private long starttime;
  
  @Column(name = "timespan")
  private long timespan;
  
  @Column(name = "timespanstring")
  private String timespanstring;
  
  @Column(name = "uploaddate")
  private String uploaddate;
  
  public long getEndtime() {
    return this.endtime;
  }
  
  public String getFilename() {
    return this.filename;
  }
  
  public String getFilepath() {
    return this.filepath;
  }
  
  public long getFilesize() {
    return this.filesize;
  }
  
  public String getFilesizestring() {
    return this.filesizestring;
  }
  
  public int getHarassstatus() {
    return this.harassstatus;
  }
  
  public String getHearddata() {
    return this.hearddata;
  }
  
  public int getIsupload() {
    return this.isupload;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getNumber() {
    return this.number;
  }
  
  public int getNumbertype() {
    return this.numbertype;
  }
  
  public String getPhoneType() {
    return this.phoneType;
  }
  
  public int getPhonestatus() {
    return this.phonestatus;
  }
  
  public int getRecordcount() {
    return this.recordcount;
  }
  
  public String getRecordtime() {
    return this.recordtime;
  }
  
  public String getRecordtimems() {
    return this.recordtimems;
  }
  
  public String getRemark() {
    return this.remark;
  }
  
  public String getShowName() {
    return (getName() != null && !"".equals(getName())) ? getName() : getNumber();
  }
  
  public long getStarttime() {
    return this.starttime;
  }
  
  public long getTimespan() {
    return this.timespan;
  }
  
  public String getTimespanstring() {
    return this.timespanstring;
  }
  
  public String getUploaddate() {
    return this.uploaddate;
  }
  
  public void setEndtime(long paramLong) {
    this.endtime = paramLong;
  }
  
  public void setFilename(String paramString) {
    this.filename = paramString;
  }
  
  public void setFilepath(String paramString) {
    this.filepath = paramString;
  }
  
  public void setFilesize(long paramLong) {
    this.filesize = paramLong;
  }
  
  public void setFilesizestring(String paramString) {
    this.filesizestring = paramString;
  }
  
  public void setHarassstatus(int paramInt) {
    this.harassstatus = paramInt;
  }
  
  public void setHearddata(String paramString) {
    this.hearddata = paramString;
  }
  
  public void setIsupload(int paramInt) {
    this.isupload = paramInt;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public void setNumber(String paramString) {
    this.number = paramString;
  }
  
  public void setNumbertype(int paramInt) {
    this.numbertype = paramInt;
  }
  
  public void setPhoneType(String paramString) {
    this.phoneType = paramString;
  }
  
  public void setPhonestatus(int paramInt) {
    this.phonestatus = paramInt;
  }
  
  public void setRecordcount(int paramInt) {
    this.recordcount = paramInt;
  }
  
  public void setRecordtime(String paramString) {
    this.recordtime = paramString;
  }
  
  public void setRecordtimems(String paramString) {
    this.recordtimems = paramString;
  }
  
  public void setRemark(String paramString) {
    this.remark = paramString;
  }
  
  public void setStarttime(long paramLong) {
    this.starttime = paramLong;
  }
  
  public void setTimespan(long paramLong) {
    this.timespan = paramLong;
  }
  
  public void setTimespanstring(String paramString) {
    this.timespanstring = paramString;
  }
  
  public void setUploaddate(String paramString) {
    this.uploaddate = paramString;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("RecordCall{id=");
    stringBuilder.append(this.id);
    stringBuilder.append(", number='");
    stringBuilder.append(this.number);
    stringBuilder.append('\'');
    stringBuilder.append(", name='");
    stringBuilder.append(this.name);
    stringBuilder.append('\'');
    stringBuilder.append(", phonestatus=");
    stringBuilder.append(this.phonestatus);
    stringBuilder.append(", timespan=");
    stringBuilder.append(this.timespan);
    stringBuilder.append(", timespanstring='");
    stringBuilder.append(this.timespanstring);
    stringBuilder.append('\'');
    stringBuilder.append(", starttime=");
    stringBuilder.append(this.starttime);
    stringBuilder.append(", recordtime='");
    stringBuilder.append(this.recordtime);
    stringBuilder.append('\'');
    stringBuilder.append(", recordtimems='");
    stringBuilder.append(this.recordtimems);
    stringBuilder.append('\'');
    stringBuilder.append(", endtime=");
    stringBuilder.append(this.endtime);
    stringBuilder.append(", uploaddate='");
    stringBuilder.append(this.uploaddate);
    stringBuilder.append('\'');
    stringBuilder.append(", filesize=");
    stringBuilder.append(this.filesize);
    stringBuilder.append(", filesizestring='");
    stringBuilder.append(this.filesizestring);
    stringBuilder.append('\'');
    stringBuilder.append(", harassstatus=");
    stringBuilder.append(this.harassstatus);
    stringBuilder.append(", remark='");
    stringBuilder.append(this.remark);
    stringBuilder.append('\'');
    stringBuilder.append(", isupload=");
    stringBuilder.append(this.isupload);
    stringBuilder.append(", numbertype=");
    stringBuilder.append(this.numbertype);
    stringBuilder.append(", filepath='");
    stringBuilder.append(this.filepath);
    stringBuilder.append('\'');
    stringBuilder.append(", filename='");
    stringBuilder.append(this.filename);
    stringBuilder.append('\'');
    stringBuilder.append(", callid='");
    stringBuilder.append(this.callid);
    stringBuilder.append('\'');
    stringBuilder.append(", callidint=");
    stringBuilder.append(this.callidint);
    stringBuilder.append(", recordcount=");
    stringBuilder.append(this.recordcount);
    stringBuilder.append(", phoneType='");
    stringBuilder.append(this.phoneType);
    stringBuilder.append('\'');
    stringBuilder.append(", hearddata='");
    stringBuilder.append(this.hearddata);
    stringBuilder.append('\'');
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/recorder/RecordCall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */