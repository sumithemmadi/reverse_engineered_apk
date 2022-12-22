package com.google.android.gms.internal.ads;

import java.util.Map;

public final class t00<AdT> implements u00<AdT> {
  private final Map<String, hv0<AdT>> a;
  
  t00(Map<String, hv0<AdT>> paramMap) {
    this.a = paramMap;
  }
  
  public final hv0<AdT> a(int paramInt, String paramString) {
    return this.a.get(paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/t00.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */