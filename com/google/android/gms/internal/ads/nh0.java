package com.google.android.gms.internal.ads;

import b.e.a;
import java.util.Map;

public final class nh0 implements f50 {
  private final pf0 b;
  
  private final tf0 c;
  
  public nh0(pf0 parampf0, tf0 paramtf0) {
    this.b = parampf0;
    this.c = paramtf0;
  }
  
  public final void S() {
    if (this.b.H() == null)
      return; 
    tq tq1 = this.b.G();
    tq tq2 = this.b.F();
    if (tq1 == null)
      if (tq2 != null) {
        tq1 = tq2;
      } else {
        tq1 = null;
      }  
    if (this.c.a() && tq1 != null)
      tq1.B("onSdkImpression", (Map<String, ?>)new a()); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nh0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */