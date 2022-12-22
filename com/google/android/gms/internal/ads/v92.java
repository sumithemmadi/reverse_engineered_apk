package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class v92 extends zz0<Integer, Object> {
  public Long b;
  
  public Boolean c;
  
  public Boolean d;
  
  public v92(String paramString) {
    super.a(paramString);
  }
  
  protected final void a(String paramString) {
    HashMap<?, ?> hashMap = zz0.b(paramString);
    if (hashMap != null) {
      this.b = (Long)hashMap.get(Integer.valueOf(0));
      this.c = (Boolean)hashMap.get(Integer.valueOf(1));
      this.d = (Boolean)hashMap.get(Integer.valueOf(2));
    } 
  }
  
  protected final HashMap<Integer, Object> c() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put(Integer.valueOf(0), this.b);
    hashMap.put(Integer.valueOf(1), this.c);
    hashMap.put(Integer.valueOf(2), this.d);
    return (HashMap)hashMap;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/v92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */