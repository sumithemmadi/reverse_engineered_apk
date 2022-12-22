package com.google.android.gms.internal.ads;

import android.content.Context;

public final class hw implements i50 {
  private final xi1 b;
  
  public hw(xi1 paramxi1) {
    this.b = paramxi1;
  }
  
  public final void D(Context paramContext) {
    try {
      this.b.f();
      return;
    } catch (zzdnt zzdnt) {
      cm.d("Cannot invoke onPause for the mediation adapter.", zzdnt);
      return;
    } 
  }
  
  public final void r(Context paramContext) {
    try {
      this.b.a();
      return;
    } catch (zzdnt zzdnt) {
      cm.d("Cannot invoke onDestroy for the mediation adapter.", zzdnt);
      return;
    } 
  }
  
  public final void y(Context paramContext) {
    try {
      this.b.g();
      if (paramContext != null)
        this.b.e(paramContext); 
      return;
    } catch (zzdnt zzdnt) {
      cm.d("Cannot invoke onResume for the mediation adapter.", zzdnt);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */