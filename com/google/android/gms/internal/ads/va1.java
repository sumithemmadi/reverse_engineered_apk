package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class va1 implements s91<wa1> {
  private final bl a;
  
  private final int b;
  
  private final Context c;
  
  private final fl d;
  
  private final ScheduledExecutorService e;
  
  private final Executor f;
  
  public va1(bl parambl, int paramInt, Context paramContext, fl paramfl, ScheduledExecutorService paramScheduledExecutorService, Executor paramExecutor) {
    this.a = parambl;
    this.b = paramInt;
    this.c = paramContext;
    this.d = paramfl;
    this.e = paramScheduledExecutorService;
    this.f = paramExecutor;
  }
  
  public final ot1<wa1> a() {
    ys1<wa1> ys1 = ys1.H(dt1.c(new ya1(this), this.f)).D(xa1.a, this.f);
    x<Long> x = m0.F0;
    return ys1.C(((Long)er2.e().<Long>c(x)).longValue(), TimeUnit.MILLISECONDS, this.e).E(Exception.class, new ab1(this), qt1.c());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/va1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */