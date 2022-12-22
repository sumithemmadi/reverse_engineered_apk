package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class g52 extends zz0<Integer, Long> {
  public long b = -1L;
  
  public long c = -1L;
  
  public g52() {}
  
  public g52(String paramString) {
    this();
    super.a(paramString);
  }
  
  protected final void a(String paramString) {
    HashMap<?, ?> hashMap = zz0.b(paramString);
    if (hashMap != null) {
      this.b = ((Long)hashMap.get(Integer.valueOf(0))).longValue();
      this.c = ((Long)hashMap.get(Integer.valueOf(1))).longValue();
    } 
  }
  
  protected final HashMap<Integer, Long> c() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put(Integer.valueOf(0), Long.valueOf(this.b));
    hashMap.put(Integer.valueOf(1), Long.valueOf(this.c));
    return (HashMap)hashMap;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/g52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */