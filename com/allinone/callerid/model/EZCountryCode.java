package com.allinone.callerid.model;

import java.io.Serializable;

public class EZCountryCode implements Serializable {
  public String country_code;
  
  public String country_name;
  
  public String iso_code;
  
  public String getCountry_code() {
    return this.country_code;
  }
  
  public String getCountry_name() {
    return this.country_name;
  }
  
  public String getIso_code() {
    return this.iso_code;
  }
  
  public void setCountry_code(String paramString) {
    this.country_code = paramString;
  }
  
  public void setCountry_name(String paramString) {
    this.country_name = paramString;
  }
  
  public void setIso_code(String paramString) {
    this.iso_code = paramString;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("EZCountryCode{country_name='");
    stringBuilder.append(this.country_name);
    stringBuilder.append('\'');
    stringBuilder.append(", country_code='");
    stringBuilder.append(this.country_code);
    stringBuilder.append('\'');
    stringBuilder.append(", iso_code='");
    stringBuilder.append(this.iso_code);
    stringBuilder.append('\'');
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/model/EZCountryCode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */