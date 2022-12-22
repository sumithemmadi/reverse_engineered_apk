package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zl0 implements i50 {
  private final tq b;
  
  zl0(tq paramtq) {
    x<Boolean> x = m0.v0;
    if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      paramtq = null; 
    this.b = paramtq;
  }
  
  public final void D(Context paramContext) {
    tq tq1 = this.b;
    if (tq1 != null)
      tq1.onPause(); 
  }
  
  public final void r(Context paramContext) {
    tq tq1 = this.b;
    if (tq1 != null)
      tq1.destroy(); 
  }
  
  public final void y(Context paramContext) {
    tq tq1 = this.b;
    if (tq1 != null)
      tq1.onResume(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zl0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */