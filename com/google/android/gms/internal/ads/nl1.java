package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

public final class nl1 {
  private final E a;
  
  private final List<ot1<?>> b;
  
  private nl1(ll1 paramll1, E paramE, List<ot1<?>> paramList) {
    this.a = paramE;
    this.b = paramList;
  }
  
  public final <O> sl1<O> a(Callable<O> paramCallable) {
    it1<?> it1 = dt1.p(this.b);
    ot1<?> ot1 = it1.a(rl1.a, fm.f);
    ll1 ll11 = this.c;
    return new sl1<O>(ll11, this.a, null, ot1, this.b, it1.a(paramCallable, ll1.c(ll11)), null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nl1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */