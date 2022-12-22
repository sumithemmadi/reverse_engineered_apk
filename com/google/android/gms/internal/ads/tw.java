package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public class tw extends w<String> {
  private final Object r = new Object();
  
  private r6<String> s;
  
  public tw(int paramInt, String paramString, r6<String> paramr6, q7 paramq7) {
    super(paramInt, paramString, paramq7);
    this.s = paramr6;
  }
  
  protected void I(String paramString) {
    synchronized (this.r) {
      r6<String> r61 = this.s;
      if (r61 != null)
        r61.b(paramString); 
      return;
    } 
  }
  
  protected final v4<String> m(kt2 paramkt2) {
    String str;
    try {
      String str1 = new String();
      byte[] arrayOfByte = paramkt2.b;
      Map<String, String> map = paramkt2.c;
      String str2 = "ISO-8859-1";
      str = str2;
      if (map != null) {
        String str3 = map.get("Content-Type");
        str = str2;
        if (str3 != null) {
          String[] arrayOfString = str3.split(";", 0);
          byte b = 1;
          while (true) {
            str = str2;
            if (b < arrayOfString.length) {
              String[] arrayOfString1 = arrayOfString[b].trim().split("=", 0);
              if (arrayOfString1.length == 2 && arrayOfString1[0].equals("charset")) {
                str = arrayOfString1[1];
                break;
              } 
              b++;
              continue;
            } 
            break;
          } 
        } 
      } 
      this(arrayOfByte, str);
      str = str1;
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      str = new String(paramkt2.b);
    } 
    return v4.b(str, po.a(paramkt2));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */