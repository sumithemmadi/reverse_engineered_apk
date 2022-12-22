package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@Deprecated
public final class a1 {
  private final Map<String, x0> a;
  
  private final z0 b;
  
  public a1(z0 paramz0) {
    this.b = paramz0;
    this.a = new HashMap<String, x0>();
  }
  
  public final void a(String paramString, x0 paramx0) {
    this.a.put(paramString, paramx0);
  }
  
  public final void b(String paramString1, String paramString2, long paramLong) {
    x0 x01;
    z0 z02 = this.b;
    x0 x02 = this.a.get(paramString2);
    if (z02 != null && x02 != null)
      z02.a(x02, paramLong, new String[] { paramString1 }); 
    Map<String, x0> map = this.a;
    z0 z01 = this.b;
    if (z01 == null) {
      z01 = null;
    } else {
      x01 = z01.c(paramLong);
    } 
    map.put(paramString1, x01);
  }
  
  public final z0 c() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/a1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */