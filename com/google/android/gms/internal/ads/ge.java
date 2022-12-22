package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.Map;

public final class ge {
  private final tq a;
  
  private final boolean b;
  
  private final String c;
  
  public ge(tq paramtq, Map<String, String> paramMap) {
    this.a = paramtq;
    this.c = paramMap.get("forceOrientation");
    if (paramMap.containsKey("allowOrientationChange")) {
      this.b = Boolean.parseBoolean(paramMap.get("allowOrientationChange"));
      return;
    } 
    this.b = true;
  }
  
  public final void a() {
    int i;
    if (this.a == null) {
      cm.i("AdWebView is null");
      return;
    } 
    if ("portrait".equalsIgnoreCase(this.c)) {
      i = 7;
    } else if ("landscape".equalsIgnoreCase(this.c)) {
      i = 6;
    } else if (this.b) {
      i = -1;
    } else {
      i = q.e().o();
    } 
    this.a.setRequestedOrientation(i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */