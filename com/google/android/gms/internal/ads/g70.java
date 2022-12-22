package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.a;
import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.y.a;

public final class g70 extends a implements a, p, m40, b50, f50, i60, v60, bq2 {
  private final i80 b = new i80(this, null);
  
  private z11 c;
  
  private u21 d;
  
  private yc1 e;
  
  private xf1 f;
  
  private static <T> void i0(T paramT, l80<T> paraml80) {
    if (paramT != null)
      paraml80.a(paramT); 
  }
  
  public final void B() {
    i0(this.f, s70.a);
  }
  
  public final void H(kh paramkh, String paramString1, String paramString2) {
    i0(this.c, new h80(paramkh, paramString1, paramString2));
    i0(this.f, new g80(paramkh, paramString1, paramString2));
  }
  
  public final void I() {
    i0(this.c, f80.a);
    i0(this.f, e80.a);
  }
  
  public final void K() {
    i0(this.c, h70.a);
    i0(this.f, k70.a);
  }
  
  public final void L() {
    i0(this.c, f70.a);
    i0(this.f, i70.a);
  }
  
  public final void M0() {
    i0(this.e, y70.a);
  }
  
  public final void O() {
    i0(this.c, c80.a);
    i0(this.f, b80.a);
  }
  
  public final void R5(zzn paramzzn) {
    i0(this.e, new v70(paramzzn));
  }
  
  public final void S() {
    i0(this.c, q70.a);
  }
  
  public final void Y() {
    i0(this.c, r70.a);
    i0(this.f, z70.a);
  }
  
  public final i80 k0() {
    return this.b;
  }
  
  public final void n(String paramString1, String paramString2) {
    i0(this.c, new l70(paramString1, paramString2));
  }
  
  public final void o1() {
    i0(this.e, p70.a);
  }
  
  public final void onPause() {
    i0(this.e, x70.a);
  }
  
  public final void onResume() {
    i0(this.e, a80.a);
  }
  
  public final void r(zzvg paramzzvg) {
    i0(this.f, new u70(paramzzvg));
    i0(this.c, new t70(paramzzvg));
  }
  
  public final void t(zzvu paramzzvu) {
    i0(this.c, new o70(paramzzvu));
    i0(this.f, new n70(paramzzvu));
  }
  
  public final void u9() {
    i0(this.e, w70.a);
  }
  
  public final void x() {
    i0(this.c, j70.a);
    i0(this.d, m70.a);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/g70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */