package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class qb1 implements s91<rb1> {
  private if a;
  
  private ScheduledExecutorService b;
  
  private Context c;
  
  public qb1(if paramif, ScheduledExecutorService paramScheduledExecutorService, Context paramContext) {
    this.a = paramif;
    this.b = paramScheduledExecutorService;
    this.c = paramContext;
  }
  
  public final ot1<rb1> a() {
    ot1<Bundle> ot1 = this.a.a(this.c);
    x<Long> x = m0.O2;
    return dt1.j(dt1.d(ot1, ((Long)er2.e().<Long>c(x)).longValue(), TimeUnit.MILLISECONDS, this.b), tb1.a, fm.a);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qb1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */