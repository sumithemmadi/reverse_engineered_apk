package com.allinone.callerid.bean;

import android.graphics.drawable.Drawable;

public class ShareAppInfo {
  private Drawable AppIcon;
  
  private String AppLauncherClassName;
  
  private String AppName;
  
  private String AppPkgName;
  
  public Drawable getAppIcon() {
    return this.AppIcon;
  }
  
  public String getAppLauncherClassName() {
    return this.AppLauncherClassName;
  }
  
  public String getAppName() {
    return this.AppName;
  }
  
  public String getAppPkgName() {
    return this.AppPkgName;
  }
  
  public void setAppIcon(Drawable paramDrawable) {
    this.AppIcon = paramDrawable;
  }
  
  public void setAppLauncherClassName(String paramString) {
    this.AppLauncherClassName = paramString;
  }
  
  public void setAppName(String paramString) {
    this.AppName = paramString;
  }
  
  public void setAppPkgName(String paramString) {
    this.AppPkgName = paramString;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/ShareAppInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */