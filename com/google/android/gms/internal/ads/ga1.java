package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.v.a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class ga1 implements s91<ha1> {
  private final bl a;
  
  private final Context b;
  
  private final ScheduledExecutorService c;
  
  private final Executor d;
  
  private final int e;
  
  public ga1(bl parambl, Context paramContext, ScheduledExecutorService paramScheduledExecutorService, Executor paramExecutor, int paramInt) {
    this.a = parambl;
    this.b = paramContext;
    this.c = paramScheduledExecutorService;
    this.d = paramExecutor;
    this.e = paramInt;
  }
  
  public final ot1<ha1> a() {
    x<Boolean> x = m0.E0;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      ys1<ha1> ys1 = ys1.<a.a>H(this.a.c(this.b, this.e)).D(ja1.a, this.d);
      x<Long> x1 = m0.F0;
      return ys1.C(((Long)er2.e().<Long>c(x1)).longValue(), TimeUnit.MILLISECONDS, this.c).E(Throwable.class, new ia1(this), this.d);
    } 
    return dt1.a(new Exception("Did not ad Ad ID into query param."));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ga1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */