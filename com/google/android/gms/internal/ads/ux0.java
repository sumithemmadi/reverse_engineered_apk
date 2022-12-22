package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class ux0 implements lv0<xi1, cx0> {
  private final hm0 a;
  
  public ux0(hm0 paramhm0) {
    this.a = paramhm0;
  }
  
  public final jv0<xi1, cx0> a(String paramString, JSONObject paramJSONObject) {
    xi1 xi1 = this.a.d(paramString, paramJSONObject);
    return (xi1 == null) ? null : new jv0<xi1, cx0>(xi1, new cx0(), paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ux0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */