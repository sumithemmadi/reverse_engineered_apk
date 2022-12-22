package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;
import java.util.concurrent.atomic.AtomicReference;

public final class o61<S extends t91<?>> implements s91<S> {
  private final AtomicReference<n61<S>> a = new AtomicReference<n61<S>>();
  
  private final e b;
  
  private final s91<S> c;
  
  private final long d;
  
  public o61(s91<S> params91, long paramLong, e parame) {
    this.b = parame;
    this.c = params91;
    this.d = paramLong;
  }
  
  public final ot1<S> a() {
    n61<t91<?>> n611 = this.a.get();
    if (n611 != null) {
      n61<t91<?>> n61 = n611;
      if (n611.a()) {
        n61 = new n61<t91<?>>(this.c.a(), this.d, this.b);
        this.a.set(n61);
        return (ot1)n61.a;
      } 
      return (ot1)n61.a;
    } 
    n61<t91<?>> n612 = new n61<t91<?>>(this.c.a(), this.d, this.b);
    this.a.set(n612);
    return (ot1)n612.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/o61.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */