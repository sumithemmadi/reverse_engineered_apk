package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.kt2;
import com.google.android.gms.internal.ads.po;
import com.google.android.gms.internal.ads.sm;
import com.google.android.gms.internal.ads.v4;
import com.google.android.gms.internal.ads.w;
import com.google.android.gms.internal.ads.wl;
import java.util.Map;

public final class e0 extends w<kt2> {
  private final sm<kt2> r;
  
  private final Map<String, String> s = null;
  
  private final wl t;
  
  public e0(String paramString, sm<kt2> paramsm) {
    this(paramString, null, paramsm);
  }
  
  private e0(String paramString, Map<String, String> paramMap, sm<kt2> paramsm) {
    super(0, paramString, new d0(paramsm));
    this.r = paramsm;
    wl wl1 = new wl();
    this.t = wl1;
    wl1.f(paramString, "GET", null, null);
  }
  
  protected final v4<kt2> m(kt2 paramkt2) {
    return v4.b(paramkt2, po.a(paramkt2));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */