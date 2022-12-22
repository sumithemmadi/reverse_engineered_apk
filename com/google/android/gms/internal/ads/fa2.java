package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class fa2 extends zz0<Integer, Long> {
  public Long b;
  
  public Long c;
  
  public Long d;
  
  public Long e;
  
  public Long f;
  
  public Long g;
  
  public Long h;
  
  public Long i;
  
  public Long j;
  
  public Long k;
  
  public Long l;
  
  public fa2(String paramString) {
    super.a(paramString);
  }
  
  protected final void a(String paramString) {
    HashMap<?, ?> hashMap = zz0.b(paramString);
    if (hashMap != null) {
      this.b = (Long)hashMap.get(Integer.valueOf(0));
      this.c = (Long)hashMap.get(Integer.valueOf(1));
      this.d = (Long)hashMap.get(Integer.valueOf(2));
      this.e = (Long)hashMap.get(Integer.valueOf(3));
      this.f = (Long)hashMap.get(Integer.valueOf(4));
      this.g = (Long)hashMap.get(Integer.valueOf(5));
      this.h = (Long)hashMap.get(Integer.valueOf(6));
      this.i = (Long)hashMap.get(Integer.valueOf(7));
      this.j = (Long)hashMap.get(Integer.valueOf(8));
      this.k = (Long)hashMap.get(Integer.valueOf(9));
      this.l = (Long)hashMap.get(Integer.valueOf(10));
    } 
  }
  
  protected final HashMap<Integer, Long> c() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put(Integer.valueOf(0), this.b);
    hashMap.put(Integer.valueOf(1), this.c);
    hashMap.put(Integer.valueOf(2), this.d);
    hashMap.put(Integer.valueOf(3), this.e);
    hashMap.put(Integer.valueOf(4), this.f);
    hashMap.put(Integer.valueOf(5), this.g);
    hashMap.put(Integer.valueOf(6), this.h);
    hashMap.put(Integer.valueOf(7), this.i);
    hashMap.put(Integer.valueOf(8), this.j);
    hashMap.put(Integer.valueOf(9), this.k);
    hashMap.put(Integer.valueOf(10), this.l);
    return (HashMap)hashMap;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fa2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */