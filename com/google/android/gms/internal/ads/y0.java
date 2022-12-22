package com.google.android.gms.internal.ads;

import android.text.TextUtils;

final class y0 extends t0 {
  private static String b(String paramString) {
    int j;
    if (TextUtils.isEmpty(paramString))
      return paramString; 
    byte b = 0;
    int i = paramString.length();
    while (true) {
      j = i;
      if (b < paramString.length()) {
        j = i;
        if (paramString.charAt(b) == ',') {
          b++;
          continue;
        } 
      } 
      break;
    } 
    while (j > 0 && paramString.charAt(j - 1) == ',')
      j--; 
    return (j < b) ? null : ((b == 0 && j == paramString.length()) ? paramString : paramString.substring(b, j));
  }
  
  public final String a(String paramString1, String paramString2) {
    paramString1 = b(paramString1);
    String str = b(paramString2);
    if (TextUtils.isEmpty(paramString1))
      return str; 
    if (TextUtils.isEmpty(str))
      return paramString1; 
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 1 + String.valueOf(str).length());
    stringBuilder.append(paramString1);
    stringBuilder.append(",");
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/y0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */