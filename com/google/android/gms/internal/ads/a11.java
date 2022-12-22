package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class a11 extends zz0<Integer, Object> {
  public String b = "E";
  
  public long c = -1L;
  
  public String d = "E";
  
  public String e = "E";
  
  public String f = "E";
  
  public a11() {}
  
  public a11(String paramString) {
    this();
    super.a(paramString);
  }
  
  protected final void a(String paramString) {
    HashMap<?, ?> hashMap = zz0.b(paramString);
    if (hashMap != null) {
      long l;
      paramString = (String)hashMap.get(Integer.valueOf(0));
      String str = "E";
      if (paramString == null) {
        paramString = "E";
      } else {
        paramString = (String)hashMap.get(Integer.valueOf(0));
      } 
      this.b = paramString;
      if (hashMap.get(Integer.valueOf(1)) == null) {
        l = -1L;
      } else {
        l = ((Long)hashMap.get(Integer.valueOf(1))).longValue();
      } 
      this.c = l;
      if (hashMap.get(Integer.valueOf(2)) == null) {
        paramString = "E";
      } else {
        paramString = (String)hashMap.get(Integer.valueOf(2));
      } 
      this.d = paramString;
      if (hashMap.get(Integer.valueOf(3)) == null) {
        paramString = "E";
      } else {
        paramString = (String)hashMap.get(Integer.valueOf(3));
      } 
      this.e = paramString;
      if (hashMap.get(Integer.valueOf(4)) == null) {
        paramString = str;
      } else {
        paramString = (String)hashMap.get(Integer.valueOf(4));
      } 
      this.f = paramString;
    } 
  }
  
  protected final HashMap<Integer, Object> c() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put(Integer.valueOf(0), this.b);
    hashMap.put(Integer.valueOf(4), this.f);
    hashMap.put(Integer.valueOf(3), this.e);
    hashMap.put(Integer.valueOf(2), this.d);
    hashMap.put(Integer.valueOf(1), Long.valueOf(this.c));
    return (HashMap)hashMap;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/a11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */