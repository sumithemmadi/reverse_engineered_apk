package com.allinone.callerid.d.f;

import android.text.TextUtils;
import com.danikula.videocache.m;
import com.danikula.videocache.q.c;

public class d implements c {
  private String b(String paramString) {
    int i = paramString.lastIndexOf('.');
    int j = paramString.lastIndexOf('/');
    if (i != -1 && i > j && i + 2 + 4 > paramString.length()) {
      paramString = paramString.substring(i + 1, paramString.length());
    } else {
      paramString = "";
    } 
    return paramString;
  }
  
  public String a(String paramString) {
    String str = b(paramString);
    int i = paramString.lastIndexOf('.');
    if (paramString.length() > 18 && i > 18)
      return paramString.substring(i - 18); 
    paramString = m.d(paramString);
    if (!TextUtils.isEmpty(str)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString);
      stringBuilder.append(".");
      stringBuilder.append(str);
      paramString = stringBuilder.toString();
    } 
    return paramString;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */