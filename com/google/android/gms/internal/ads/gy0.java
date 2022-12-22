package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.h0;
import java.util.concurrent.Executor;

public final class gy0 implements ov0<ff0, xi1, cx0> {
  private final Context a;
  
  private final ce0 b;
  
  private final Executor c;
  
  public gy0(Context paramContext, ce0 paramce0, Executor paramExecutor) {
    this.a = paramContext;
    this.b = paramce0;
    this.c = paramExecutor;
  }
  
  private static boolean c(ci1 paramci1, int paramInt) {
    return paramci1.a.a.g.contains(Integer.toString(paramInt));
  }
  
  public final void b(ci1 paramci1, nh1 paramnh1, jv0<xi1, cx0> paramjv0) {
    xi1 xi1 = (xi1)paramjv0.b;
    Context context = this.a;
    zzvl zzvl = paramci1.a.a.d;
    String str2 = paramnh1.u.toString();
    String str1 = h0.a(paramnh1.r);
    sb sb = (sb)paramjv0.c;
    gi1 gi1 = paramci1.a.a;
    xi1.p(context, zzvl, str2, str1, sb, gi1.i, gi1.g);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gy0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */