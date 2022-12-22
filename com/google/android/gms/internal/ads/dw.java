package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.d1;
import java.util.Map;

public final class dw implements yv {
  private d1 a;
  
  public dw(d1 paramd1) {
    this.a = paramd1;
  }
  
  public final void a(Map<String, String> paramMap) {
    this.a.w(Boolean.parseBoolean(paramMap.get("content_vertical_opted_out")));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */