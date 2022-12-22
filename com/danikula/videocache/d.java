package com.danikula.videocache;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class d {
  private static final Pattern a = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");
  
  private static final Pattern b = Pattern.compile("GET /(.*) HTTP");
  
  public final String c;
  
  public final long d;
  
  public final boolean e;
  
  public d(String paramString) {
    boolean bool;
    k.d(paramString);
    long l = a(paramString);
    this.d = Math.max(0L, l);
    if (l >= 0L) {
      bool = true;
    } else {
      bool = false;
    } 
    this.e = bool;
    this.c = b(paramString);
  }
  
  private long a(String paramString) {
    Matcher matcher = a.matcher(paramString);
    return matcher.find() ? Long.parseLong(matcher.group(1)) : -1L;
  }
  
  private String b(String paramString) {
    Matcher matcher = b.matcher(paramString);
    if (matcher.find())
      return matcher.group(1); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid request `");
    stringBuilder.append(paramString);
    stringBuilder.append("`: url not found!");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static d c(InputStream paramInputStream) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(paramInputStream, "UTF-8"));
    StringBuilder stringBuilder = new StringBuilder();
    while (true) {
      String str = bufferedReader.readLine();
      if (!TextUtils.isEmpty(str)) {
        stringBuilder.append(str);
        stringBuilder.append('\n');
        continue;
      } 
      return new d(stringBuilder.toString());
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("GetRequest{rangeOffset=");
    stringBuilder.append(this.d);
    stringBuilder.append(", partial=");
    stringBuilder.append(this.e);
    stringBuilder.append(", uri='");
    stringBuilder.append(this.c);
    stringBuilder.append('\'');
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */