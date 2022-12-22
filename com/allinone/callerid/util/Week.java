package com.allinone.callerid.util;

import com.allinone.callerid.main.EZCallApplication;

public enum Week {
  b, c, d, e, f, g, h;
  
  String name_cn;
  
  String name_en;
  
  String name_enShort;
  
  int number;
  
  static {
    Week week1 = new Week("MONDAY", 0, "星期一", EZCallApplication.c().getString(2131755018), "Mon.", 1);
    b = week1;
    Week week2 = new Week("TUESDAY", 1, "星期二", EZCallApplication.c().getString(2131755041), "Tues.", 2);
    c = week2;
    Week week3 = new Week("WEDNESDAY", 2, "星期三", EZCallApplication.c().getString(2131755043), "Wed.", 3);
    d = week3;
    Week week4 = new Week("THURSDAY", 3, "星期四", EZCallApplication.c().getString(2131755039), "Thur.", 4);
    e = week4;
    Week week5 = new Week("FRIDAY", 4, "星期五", EZCallApplication.c().getString(2131755015), "Fri.", 5);
    f = week5;
    Week week6 = new Week("SATURDAY", 5, "星期六", EZCallApplication.c().getString(2131755033), "Sat.", 6);
    g = week6;
    Week week7 = new Week("SUNDAY", 6, "星期日", EZCallApplication.c().getString(2131755034), "Sun.", 7);
    h = week7;
    i = new Week[] { week1, week2, week3, week4, week5, week6, week7 };
  }
  
  Week(String paramString1, String paramString2, String paramString3, int paramInt1) {
    this.name_cn = paramString1;
    this.name_en = paramString2;
    this.name_enShort = paramString3;
    this.number = paramInt1;
  }
  
  public String getChineseName() {
    return this.name_cn;
  }
  
  public String getName() {
    return this.name_en;
  }
  
  public int getNumber() {
    return this.number;
  }
  
  public String getShortName() {
    return this.name_enShort;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/Week.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */