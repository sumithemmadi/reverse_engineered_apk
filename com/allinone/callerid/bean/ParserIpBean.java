package com.allinone.callerid.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

@Table(name = "parseripbean")
public class ParserIpBean {
  @Column(name = "city")
  private String city;
  
  @Column(name = "country")
  private String country;
  
  @Column(name = "country_full")
  private String country_full;
  
  @Column(autoGen = true, isId = true, name = "id")
  private int id;
  
  @Column(name = "state")
  private String state;
  
  @Column(name = "state_full")
  private String state_full;
  
  @Column(name = "true_ip")
  private String true_ip;
  
  public String getCity() {
    return this.city;
  }
  
  public String getCountry() {
    return this.country;
  }
  
  public String getCountry_full() {
    return this.country_full;
  }
  
  public int getId() {
    return this.id;
  }
  
  public String getState() {
    return this.state;
  }
  
  public String getState_full() {
    return this.state_full;
  }
  
  public String getTrue_ip() {
    return this.true_ip;
  }
  
  public void setCity(String paramString) {
    this.city = paramString;
  }
  
  public void setCountry(String paramString) {
    this.country = paramString;
  }
  
  public void setCountry_full(String paramString) {
    this.country_full = paramString;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public void setState(String paramString) {
    this.state = paramString;
  }
  
  public void setState_full(String paramString) {
    this.state_full = paramString;
  }
  
  public void setTrue_ip(String paramString) {
    this.true_ip = paramString;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ParserIpBean{id=");
    stringBuilder.append(this.id);
    stringBuilder.append(", true_ip='");
    stringBuilder.append(this.true_ip);
    stringBuilder.append('\'');
    stringBuilder.append(", country='");
    stringBuilder.append(this.country);
    stringBuilder.append('\'');
    stringBuilder.append(", country_full='");
    stringBuilder.append(this.country_full);
    stringBuilder.append('\'');
    stringBuilder.append(", state='");
    stringBuilder.append(this.state);
    stringBuilder.append('\'');
    stringBuilder.append(", state_full='");
    stringBuilder.append(this.state_full);
    stringBuilder.append('\'');
    stringBuilder.append(", city='");
    stringBuilder.append(this.city);
    stringBuilder.append('\'');
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/ParserIpBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */