package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.a;
import com.google.android.gms.ads.l;

public final class km2 extends sm2 {
  private final a.a b;
  
  private final String c;
  
  public km2(a.a parama, String paramString) {
    this.b = parama;
    this.c = paramString;
  }
  
  public final void G6(int paramInt) {
    a.a a1 = this.b;
    if (a1 != null)
      a1.c(paramInt); 
  }
  
  public final void M3(om2 paramom2) {
    if (this.b != null) {
      mm2 mm2 = new mm2(paramom2, this.c);
      this.b.e(mm2);
      this.b.b(mm2);
    } 
  }
  
  public final void W7(zzvg paramzzvg) {
    if (this.b != null) {
      l l = paramzzvg.p0();
      this.b.d(l);
      this.b.a(l);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/km2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */