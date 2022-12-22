package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

final class wp0 extends y7 {
  wp0(np0 paramnp0, Object paramObject, String paramString, long paramLong, sm paramsm) {}
  
  public final void W0() {
    synchronized (this.b) {
      np0.e(this.f, this.c, true, "", (int)(q.j().b() - this.d));
      np0.t(this.f).e(this.c);
      np0.u(this.f).I0(this.c);
      this.e.c(Boolean.TRUE);
      return;
    } 
  }
  
  public final void p3(String paramString) {
    synchronized (this.b) {
      np0.e(this.f, this.c, false, paramString, (int)(q.j().b() - this.d));
      np0.t(this.f).f(this.c, "error");
      np0.u(this.f).H(this.c, "error");
      this.e.c(Boolean.FALSE);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wp0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */