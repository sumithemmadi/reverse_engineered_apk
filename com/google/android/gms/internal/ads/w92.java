package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class w92 extends zz0<Integer, Long> {
  public Long b;
  
  public Long c;
  
  public w92(String paramString) {
    super.a(paramString);
  }
  
  protected final void a(String paramString) {
    HashMap<?, ?> hashMap = zz0.b(paramString);
    if (hashMap != null) {
      this.b = (Long)hashMap.get(Integer.valueOf(0));
      this.c = (Long)hashMap.get(Integer.valueOf(1));
    } 
  }
  
  protected final HashMap<Integer, Long> c() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put(Integer.valueOf(0), this.b);
    hashMap.put(Integer.valueOf(1), this.c);
    return (HashMap)hashMap;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/w92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */