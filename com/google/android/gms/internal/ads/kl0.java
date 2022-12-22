package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.b;

public final class kl0 {
  private final br a;
  
  private final Context b;
  
  private final p12 c;
  
  private final n1 d;
  
  private final zzazn e;
  
  private final b f;
  
  private final xn2 g;
  
  private final u60 h;
  
  public kl0(br parambr, Context paramContext, p12 paramp12, n1 paramn1, zzazn paramzzazn, b paramb, xn2 paramxn2, u60 paramu60) {
    this.a = parambr;
    this.b = paramContext;
    this.c = paramp12;
    this.d = paramn1;
    this.e = paramzzazn;
    this.f = paramb;
    this.g = paramxn2;
    this.h = paramu60;
  }
  
  public final tq a(zzvs paramzzvs, nh1 paramnh1, sh1 paramsh1) {
    return br.a(this.b, ks.i(paramzzvs), paramzzvs.b, false, false, this.c, this.d, this.e, null, new jl0(this), this.f, this.g, paramnh1, paramsh1);
  }
  
  public final tq c(zzvs paramzzvs) {
    return a(paramzzvs, null, null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kl0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */