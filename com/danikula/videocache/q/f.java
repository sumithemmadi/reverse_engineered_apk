package com.danikula.videocache.q;

import android.text.TextUtils;
import com.danikula.videocache.m;

public class f implements c {
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/q/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */