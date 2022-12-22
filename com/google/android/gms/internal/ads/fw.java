package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class fw implements yv {
  private final lh1 a;
  
  public fw(lh1 paramlh1) {
    this.a = paramlh1;
  }
  
  public final void a(Map<String, String> paramMap) {
    String str = paramMap.get("render_in_browser");
    if (!TextUtils.isEmpty(str))
      try {
        this.a.d(Boolean.parseBoolean(str));
        return;
      } catch (Exception exception) {
        throw new IllegalStateException("Invalid render_in_browser state");
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */