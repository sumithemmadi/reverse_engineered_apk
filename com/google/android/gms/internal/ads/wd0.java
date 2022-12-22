package com.google.android.gms.internal.ads;

import java.util.Map;

final class wd0 implements u00<v00> {
  private final Map<String, hv0<v00>> a;
  
  private final Map<String, hv0<ff0>> b;
  
  private final Map<String, xx0<ff0>> c;
  
  private final m92<u00<qy>> d;
  
  private final ag0 e;
  
  wd0(Map<String, hv0<v00>> paramMap, Map<String, hv0<ff0>> paramMap1, Map<String, xx0<ff0>> paramMap2, m92<u00<qy>> paramm92, ag0 paramag0) {
    this.a = paramMap;
    this.b = paramMap1;
    this.c = paramMap2;
    this.d = paramm92;
    this.e = paramag0;
  }
  
  public final hv0<v00> a(int paramInt, String paramString) {
    hv0<v00> hv01 = this.a.get(paramString);
    if (hv01 != null)
      return hv01; 
    if (paramInt != 1) {
      if (paramInt != 4)
        return null; 
      hv01 = (xx0)this.c.get(paramString);
      if (hv01 != null)
        return v00.b((xx0)hv01); 
      hv0 = (hv0)this.b.get(paramString);
      return (hv0 != null) ? v00.a(hv0) : null;
    } 
    if (this.e.d() == null)
      return null; 
    hv0<? extends p00> hv0 = ((u00<? extends p00>)this.d.get()).a(paramInt, (String)hv0);
    return (hv0 == null) ? null : v00.a(hv0);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wd0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */