package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.d1;
import java.util.Map;

public final class bw implements yv {
  private d1 a;
  
  public bw(d1 paramd1) {
    this.a = paramd1;
  }
  
  public final void a(Map<String, String> paramMap) {
    this.a.s(Boolean.parseBoolean(paramMap.get("content_url_opted_out")));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */