package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.l;
import com.google.android.gms.ads.z.b;
import com.google.android.gms.ads.z.d;

public final class ej extends wi {
  private final d b;
  
  private final b c;
  
  public ej(d paramd, b paramb) {
    this.b = paramd;
    this.c = paramb;
  }
  
  public final void S1() {
    d d1 = this.b;
    if (d1 != null) {
      d1.e();
      this.b.b(this.c);
    } 
  }
  
  public final void i7(int paramInt) {
    d d1 = this.b;
    if (d1 != null)
      d1.c(paramInt); 
  }
  
  public final void s8(zzvg paramzzvg) {
    if (this.b != null) {
      l l = paramzzvg.p0();
      this.b.d(l);
      this.b.a(l);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */