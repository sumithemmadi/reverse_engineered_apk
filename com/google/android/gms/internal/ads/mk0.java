package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.b;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class mk0 implements Callable<dk0> {
  private final b a;
  
  private final br b;
  
  private final Context c;
  
  private final jo0 d;
  
  private final pm1 e;
  
  private final pu0 f;
  
  private final Executor g;
  
  private final p12 h;
  
  private final zzazn i;
  
  private final jn1 j;
  
  public mk0(Context paramContext, Executor paramExecutor, p12 paramp12, zzazn paramzzazn, b paramb, br parambr, pu0 parampu0, jn1 paramjn1, jo0 paramjo0, pm1 parampm1) {
    this.c = paramContext;
    this.g = paramExecutor;
    this.h = paramp12;
    this.i = paramzzazn;
    this.a = paramb;
    this.b = parambr;
    this.f = parampu0;
    this.j = paramjn1;
    this.d = paramjo0;
    this.e = parampm1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */