package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.ads.internal.overlay.zzn;

final class cr implements p {
  private tq b;
  
  private p c;
  
  public cr(tq paramtq, p paramp) {
    this.b = paramtq;
    this.c = paramp;
  }
  
  public final void M0() {
    p p1 = this.c;
    if (p1 != null)
      p1.M0(); 
  }
  
  public final void R5(zzn paramzzn) {
    p p1 = this.c;
    if (p1 != null)
      p1.R5(paramzzn); 
    this.b.U();
  }
  
  public final void onPause() {}
  
  public final void onResume() {}
  
  public final void u9() {
    p p1 = this.c;
    if (p1 != null)
      p1.u9(); 
    this.b.K0();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */