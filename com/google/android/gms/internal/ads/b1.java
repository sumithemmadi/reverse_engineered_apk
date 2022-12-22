package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.g;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class b1 extends g1 {
  private final g b;
  
  private final String c;
  
  private final String d;
  
  public b1(g paramg, String paramString1, String paramString2) {
    this.b = paramg;
    this.c = paramString1;
    this.d = paramString2;
  }
  
  public final String Q5() {
    return this.c;
  }
  
  public final void R2() {
    this.b.b();
  }
  
  public final void e3(a parama) {
    if (parama == null)
      return; 
    this.b.c((View)b.o1(parama));
  }
  
  public final String getContent() {
    return this.d;
  }
  
  public final void q() {
    this.b.a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/b1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */