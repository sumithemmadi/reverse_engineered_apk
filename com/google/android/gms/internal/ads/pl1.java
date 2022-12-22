package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

public final class pl1 {
  private final E a;
  
  private pl1(ll1 paramll1, E paramE) {
    this.a = paramE;
  }
  
  private final <O> sl1<O> b(Callable<O> paramCallable, nt1 paramnt1) {
    return new sl1<O>(this.b, this.a, null, ll1.d(), Collections.emptyList(), paramnt1.a(paramCallable), null);
  }
  
  public final sl1<?> a(jl1 paramjl1, nt1 paramnt1) {
    return b(new tl1(paramjl1), paramnt1);
  }
  
  public final <O> sl1<O> c(Callable<O> paramCallable) {
    return b(paramCallable, ll1.c(this.b));
  }
  
  public final <O> sl1<O> d(ot1<O> paramot1) {
    return new sl1<O>(this.b, this.a, null, ll1.d(), Collections.emptyList(), paramot1, null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pl1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */