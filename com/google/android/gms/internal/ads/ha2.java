package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class ha2 extends zz0<Integer, Long> {
  public Long b;
  
  public Long c;
  
  public Long d;
  
  public Long e;
  
  public ha2(String paramString) {
    super.a(paramString);
  }
  
  protected final void a(String paramString) {
    HashMap<?, ?> hashMap = zz0.b(paramString);
    if (hashMap != null) {
      this.b = (Long)hashMap.get(Integer.valueOf(0));
      this.c = (Long)hashMap.get(Integer.valueOf(1));
      this.d = (Long)hashMap.get(Integer.valueOf(2));
      this.e = (Long)hashMap.get(Integer.valueOf(3));
    } 
  }
  
  protected final HashMap<Integer, Long> c() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put(Integer.valueOf(0), this.b);
    hashMap.put(Integer.valueOf(1), this.c);
    hashMap.put(Integer.valueOf(2), this.d);
    hashMap.put(Integer.valueOf(3), this.e);
    return (HashMap)hashMap;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ha2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */