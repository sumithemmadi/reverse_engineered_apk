package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class wv0 implements hv0<by> {
  private final rx a;
  
  private final Context b;
  
  private final kl0 c;
  
  private final Executor d;
  
  public wv0(rx paramrx, Context paramContext, Executor paramExecutor, kl0 paramkl0) {
    this.b = paramContext;
    this.a = paramrx;
    this.d = paramExecutor;
    this.c = paramkl0;
  }
  
  public final boolean a(ci1 paramci1, nh1 paramnh1) {
    uh1 uh1 = paramnh1.r;
    return (uh1 != null && uh1.a != null);
  }
  
  public final ot1<by> b(ci1 paramci1, nh1 paramnh1) {
    return dt1.k(dt1.h(null), new aw0(this, paramci1, paramnh1), this.d);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wv0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */