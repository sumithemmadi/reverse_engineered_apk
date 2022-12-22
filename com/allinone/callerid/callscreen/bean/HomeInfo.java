package com.allinone.callerid.callscreen.bean;

import java.io.File;
import java.io.Serializable;
import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "HomeInfo")
public class HomeInfo implements Serializable {
  @Column(name = "audio_path")
  private String audio_path;
  
  private String audio_url;
  
  private String author;
  
  private boolean contacts_diy;
  
  private int contacts_diy_counts;
  
  private String data_id;
  
  private boolean defautl_diy;
  
  private int downloads;
  
  private String gifimg_url;
  
  private long hdvideo_size;
  
  private String hdvideo_url;
  
  @Column(autoGen = true, isId = true, name = "id", property = "NOT NULL")
  private int id;
  
  @Column(name = "isUnLock")
  private boolean isUnLock;
  
  @Column(name = "isUseVideoAudioRing")
  private boolean isUseVideoAudioRing;
  
  @Column(name = "isdefault")
  private boolean isdefault;
  
  @Column(name = "isdiy")
  private boolean isdiy;
  
  private boolean islike;
  
  private boolean isreport;
  
  @Column(name = "isselect")
  private boolean isselect;
  
  private String jpgimg_url;
  
  private int like_count;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "path")
  private String path;
  
  @Column(name = "phone")
  private String phone;
  
  private long sdvideo_size;
  
  private String sdvideo_url;
  
  @Column(name = "time")
  private long time;
  
  public String getAudio_path() {
    return this.audio_path;
  }
  
  public String getAudio_url() {
    return this.audio_url;
  }
  
  public String getAuthor() {
    return this.author;
  }
  
  public int getContacts_diy_counts() {
    return this.contacts_diy_counts;
  }
  
  public String getData_id() {
    return this.data_id;
  }
  
  public int getDownloads() {
    return this.downloads;
  }
  
  public String getGifimg_url() {
    return this.gifimg_url;
  }
  
  public long getHdvideo_size() {
    return this.hdvideo_size;
  }
  
  public String getHdvideo_url() {
    return this.hdvideo_url;
  }
  
  public int getId() {
    return this.id;
  }
  
  public String getJpgimg_url() {
    return this.jpgimg_url;
  }
  
  public int getLike_count() {
    return this.like_count;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public String getPhone() {
    return this.phone;
  }
  
  public long getSdvideo_size() {
    return this.sdvideo_size;
  }
  
  public String getSdvideo_url() {
    return this.sdvideo_url;
  }
  
  public long getTime() {
    return this.time;
  }
  
  public boolean isContacts_diy() {
    return this.contacts_diy;
  }
  
  public boolean isDefautl_diy() {
    return this.defautl_diy;
  }
  
  public boolean isDownloaded() {
    boolean bool;
    String str = this.path;
    if (str != null && !"".equals(str) && (new File(this.path)).exists()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean isIsdefault() {
    return this.isdefault;
  }
  
  public boolean isIsdiy() {
    return this.isdiy;
  }
  
  public boolean isIslike() {
    return this.islike;
  }
  
  public boolean isIsreport() {
    return this.isreport;
  }
  
  public boolean isIsselect() {
    return this.isselect;
  }
  
  public boolean isUnLock() {
    return this.isUnLock;
  }
  
  public boolean isUseVideoAudioRing() {
    return this.isUseVideoAudioRing;
  }
  
  public void setAudio_path(String paramString) {
    this.audio_path = paramString;
  }
  
  public void setAudio_url(String paramString) {
    this.audio_url = paramString;
  }
  
  public void setAuthor(String paramString) {
    this.author = paramString;
  }
  
  public void setContacts_diy(boolean paramBoolean) {
    this.contacts_diy = paramBoolean;
  }
  
  public void setContacts_diy_counts(int paramInt) {
    this.contacts_diy_counts = paramInt;
  }
  
  public void setData_id(String paramString) {
    this.data_id = paramString;
  }
  
  public void setDefautl_diy(boolean paramBoolean) {
    this.defautl_diy = paramBoolean;
  }
  
  public void setDownloads(int paramInt) {
    this.downloads = paramInt;
  }
  
  public void setGifimg_url(String paramString) {
    this.gifimg_url = paramString;
  }
  
  public void setHdvideo_size(long paramLong) {
    this.hdvideo_size = paramLong;
  }
  
  public void setHdvideo_url(String paramString) {
    this.hdvideo_url = paramString;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public void setIsdefault(boolean paramBoolean) {
    this.isdefault = paramBoolean;
  }
  
  public void setIsdiy(boolean paramBoolean) {
    this.isdiy = paramBoolean;
  }
  
  public void setIslike(boolean paramBoolean) {
    this.islike = paramBoolean;
  }
  
  public void setIsreport(boolean paramBoolean) {
    this.isreport = paramBoolean;
  }
  
  public void setIsselect(boolean paramBoolean) {
    this.isselect = paramBoolean;
  }
  
  public void setJpgimg_url(String paramString) {
    this.jpgimg_url = paramString;
  }
  
  public void setLike_count(int paramInt) {
    this.like_count = paramInt;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public void setPath(String paramString) {
    this.path = paramString;
  }
  
  public void setPhone(String paramString) {
    this.phone = paramString;
  }
  
  public void setSdvideo_size(long paramLong) {
    this.sdvideo_size = paramLong;
  }
  
  public void setSdvideo_url(String paramString) {
    this.sdvideo_url = paramString;
  }
  
  public void setTime(long paramLong) {
    this.time = paramLong;
  }
  
  public void setUnLock(boolean paramBoolean) {
    this.isUnLock = paramBoolean;
  }
  
  public void setUseVideoAudioRing(boolean paramBoolean) {
    this.isUseVideoAudioRing = paramBoolean;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("HomeInfo{data_id='");
    stringBuilder.append(this.data_id);
    stringBuilder.append('\'');
    stringBuilder.append(", author='");
    stringBuilder.append(this.author);
    stringBuilder.append('\'');
    stringBuilder.append(", gifimg_url='");
    stringBuilder.append(this.gifimg_url);
    stringBuilder.append('\'');
    stringBuilder.append(", jpgimg_url='");
    stringBuilder.append(this.jpgimg_url);
    stringBuilder.append('\'');
    stringBuilder.append(", sdvideo_url='");
    stringBuilder.append(this.sdvideo_url);
    stringBuilder.append('\'');
    stringBuilder.append(", sdvideo_size=");
    stringBuilder.append(this.sdvideo_size);
    stringBuilder.append(", hdvideo_url='");
    stringBuilder.append(this.hdvideo_url);
    stringBuilder.append('\'');
    stringBuilder.append(", hdvideo_size=");
    stringBuilder.append(this.hdvideo_size);
    stringBuilder.append(", audio_url='");
    stringBuilder.append(this.audio_url);
    stringBuilder.append('\'');
    stringBuilder.append(", downloads=");
    stringBuilder.append(this.downloads);
    stringBuilder.append(", like_count=");
    stringBuilder.append(this.like_count);
    stringBuilder.append(", islike=");
    stringBuilder.append(this.islike);
    stringBuilder.append(", isreport=");
    stringBuilder.append(this.isreport);
    stringBuilder.append(", defautl_diy=");
    stringBuilder.append(this.defautl_diy);
    stringBuilder.append(", contacts_diy=");
    stringBuilder.append(this.contacts_diy);
    stringBuilder.append(", contacts_diy_counts=");
    stringBuilder.append(this.contacts_diy_counts);
    stringBuilder.append(", id=");
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
    stringBuilder.append(", isselect=");
    stringBuilder.append(this.isselect);
    stringBuilder.append(", phone='");
    stringBuilder.append(this.phone);
    stringBuilder.append('\'');
    stringBuilder.append(", isdefault=");
    stringBuilder.append(this.isdefault);
    stringBuilder.append(", time=");
    stringBuilder.append(this.time);
    stringBuilder.append(", isdiy=");
    stringBuilder.append(this.isdiy);
    stringBuilder.append(", isUnLock=");
    stringBuilder.append(this.isUnLock);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callscreen/bean/HomeInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */