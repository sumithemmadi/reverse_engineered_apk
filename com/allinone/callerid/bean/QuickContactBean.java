package com.allinone.callerid.bean;

import com.allinone.callerid.search.CallLogBean;

public class QuickContactBean {
  private CallLogBean bean;
  
  private Boolean isquick;
  
  public CallLogBean getBean() {
    return this.bean;
  }
  
  public Boolean getIsquick() {
    return this.isquick;
  }
  
  public void setBean(CallLogBean paramCallLogBean) {
    this.bean = paramCallLogBean;
  }
  
  public void setIsquick(Boolean paramBoolean) {
    this.isquick = paramBoolean;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("QuickContactBean{bean=");
    stringBuilder.append(this.bean.toString());
    stringBuilder.append(", isquick=");
    stringBuilder.append(this.isquick);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/bean/QuickContactBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */