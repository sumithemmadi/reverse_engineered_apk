package com.allinone.callerid.util;

import android.content.Context;
import com.allinone.callerid.bean.CustomBlock;
import com.allinone.callerid.main.EZCallApplication;
import java.util.ArrayList;
import java.util.List;

public class h {
  private static List<CustomBlock> a = new ArrayList<CustomBlock>();
  
  private static List<CustomBlock> b = new ArrayList<CustomBlock>();
  
  private static List<CustomBlock> c = new ArrayList<CustomBlock>();
  
  private static m d;
  
  private static boolean a(Context paramContext, String paramString) {
    List<CustomBlock> list = d.g(0);
    a = list;
    if (list != null && !list.isEmpty() && a.size() > 0)
      for (byte b = 0; b < a.size(); b++) {
        String str = ((CustomBlock)a.get(b)).getNumber();
        if (paramString.startsWith(str)) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(paramString);
            stringBuilder.append("是以");
            stringBuilder.append(str);
            stringBuilder.append("开头的");
            d0.a("customblock", stringBuilder.toString());
          } 
          b1.l1(true);
          return true;
        } 
      }  
    list = d.g(1);
    b = list;
    if (list != null && !list.isEmpty() && b.size() > 0)
      for (byte b = 0; b < b.size(); b++) {
        String str = ((CustomBlock)b.get(b)).getNumber();
        if (paramString.substring(1, paramString.length() - 1).contains(str)) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(paramString);
            stringBuilder.append("包含");
            stringBuilder.append(str);
            d0.a("customblock", stringBuilder.toString());
          } 
          b1.l1(true);
          return true;
        } 
      }  
    list = d.g(2);
    c = list;
    if (list != null && !list.isEmpty() && c.size() > 0)
      for (byte b = 0; b < c.size(); b++) {
        String str = ((CustomBlock)c.get(b)).getNumber();
        if (paramString.endsWith(str)) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(paramString);
            stringBuilder.append("是以");
            stringBuilder.append(str);
            stringBuilder.append("结尾的");
            d0.a("customblock", stringBuilder.toString());
          } 
          b1.l1(true);
          return true;
        } 
      }  
    return false;
  }
  
  public static Boolean b() {
    return d.k("3");
  }
  
  public static boolean c(Context paramContext, String paramString) {
    try {
      m m1 = new m();
      this(paramContext);
      d = m1;
      String str = p.d((Context)EZCallApplication.c()).getCountry_code();
      null = d0.a;
      if (null) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("本地cc=");
        stringBuilder.append(str);
        d0.a("customblock", stringBuilder.toString());
      } 
      if (b().booleanValue())
        if (paramString.startsWith("+")) {
          if (!paramString.substring(1).startsWith(str)) {
            b1.l1(true);
            return true;
          } 
        } else if (paramString.startsWith("00")) {
          String str1 = paramString.substring(2);
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("以00开头");
            stringBuilder.append(paramString);
            stringBuilder.append("-->");
            stringBuilder.append(str1);
            d0.a("customblock", stringBuilder.toString());
          } 
          if (!str1.startsWith(str)) {
            b1.l1(true);
            return true;
          } 
        }  
      return a(paramContext, paramString);
    } catch (Exception exception) {
      exception.printStackTrace();
      return false;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */