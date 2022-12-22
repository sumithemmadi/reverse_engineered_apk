package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.d1;

public final class z51 implements s91<Object> {
  private static final Object a = new Object();
  
  private final String b;
  
  private final String c;
  
  private final d20 d;
  
  private final fj1 e;
  
  private final gi1 f;
  
  private final d1 g;
  
  public z51(String paramString1, String paramString2, d20 paramd20, fj1 paramfj1, gi1 paramgi1) {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramd20;
    this.e = paramfj1;
    this.f = paramgi1;
    this.g = q.g().r();
  }
  
  public final ot1<Object> a() {
    Bundle bundle = new Bundle();
    x<Boolean> x = m0.h4;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      this.d.n(this.f.d);
      bundle.putAll(this.e.b());
    } 
    return dt1.h(new y51(this, bundle));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/z51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */