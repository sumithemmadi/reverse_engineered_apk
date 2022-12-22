package com.allinone.callerid.bean.recorder;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "AudioSourceInfo")
public class AudioSourceInfo {
  @Column(name = "audiosource")
  private int audiosource;
  
  @Column(name = "brand")
  private String brand;
  
  @Column(autoGen = true, isId = true, name = "id")
  private int id;
  
  @Column(name = "isselected")
  private boolean isselected;
  
  @Column(name = "phonemodel")
  private String phonemodel;
  
  @Column(name = "sdk")
  private int sdk;
  
  @Column(name = "showname")
  private String showname;
  
  @Column(name = "version")
  private String version;
  
  public int getAudiosource() {
    return this.audiosource;
  }
  
  public String getBrand() {
    return this.brand;
  }
  
  public String getPhonemodel() {
    return this.phonemodel;
  }
  
  public int getSdk() {
    return this.sdk;
  }
  
  public String getShowname() {
    return this.showname;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public boolean isselected() {
    return this.isselected;
  }
  
  public void setAudiosource(int paramInt) {
    this.audiosource = paramInt;
  }
  
  public void setBrand(String paramString) {
    this.brand = paramString;
  }
  
  public void setIsselected(boolean paramBoolean) {
    this.isselected = paramBoolean;
  }
  
  public void setPhonemodel(String paramString) {
    this.phonemodel = paramString;
  }
  
  public void setSdk(int paramInt) {
    this.sdk = paramInt;
  }
  
  public void setShowname(String paramString) {
    this.showname = paramString;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/recorder/AudioSourceInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */