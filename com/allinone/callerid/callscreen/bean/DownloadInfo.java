package com.allinone.callerid.callscreen.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "DownloadInfo")
public class DownloadInfo {
  public static final int DOWNLOAD_COMPLETE = 1;
  
  public static final int DOWNLOAD_ING = 2;
  
  @Column(name = "audio_path")
  private String audio_path;
  
  @Column(name = "dataId")
  private String dataId;
  
  @Column(name = "download_status")
  private int downloadStatus;
  
  @Column(autoGen = true, isId = true, name = "id", property = "NOT NULL")
  private int id;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "path")
  private String path;
  
  @Column(name = "time")
  private long time;
  
  public String getAudio_path() {
    return this.audio_path;
  }
  
  public String getDataId() {
    return this.dataId;
  }
  
  public int getDownloadStatus() {
    return this.downloadStatus;
  }
  
  public int getId() {
    return this.id;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public long getTime() {
    return this.time;
  }
  
  public void setAudio_path(String paramString) {
    this.audio_path = paramString;
  }
  
  public void setDataId(String paramString) {
    this.dataId = paramString;
  }
  
  public void setDownloadStatus(int paramInt) {
    this.downloadStatus = paramInt;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public void setPath(String paramString) {
    this.path = paramString;
  }
  
  public void setTime(long paramLong) {
    this.time = paramLong;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("DownloadInfo{id=");
    stringBuilder.append(this.id);
    stringBuilder.append(", name='");
    stringBuilder.append(this.name);
    stringBuilder.append('\'');
    stringBuilder.append(", path='");
    stringBuilder.append(this.path);
    stringBuilder.append('\'');
    stringBuilder.append(", audio_path='");
    stringBuilder.append(this.audio_path);
    stringBuilder.append('\'');
    stringBuilder.append(", time=");
    stringBuilder.append(this.time);
    stringBuilder.append(", downloadStatus=");
    stringBuilder.append(this.downloadStatus);
    stringBuilder.append(", dataId='");
    stringBuilder.append(this.dataId);
    stringBuilder.append('\'');
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callscreen/bean/DownloadInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */