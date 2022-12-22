package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class e01 implements lv0<kd, cx0> {
  private final i11 a;
  
  public e01(i11 parami11) {
    this.a = parami11;
  }
  
  public final jv0<kd, cx0> a(String paramString, JSONObject paramJSONObject) {
    kd kd = this.a.b(paramString);
    return (kd == null) ? null : new jv0<kd, cx0>(kd, new cx0(), paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/e01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */