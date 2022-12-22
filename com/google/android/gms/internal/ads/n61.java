package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.e;

final class n61<S extends t91<?>> {
  public final ot1<S> a;
  
  private final long b;
  
  private final e c;
  
  public n61(ot1<S> paramot1, long paramLong, e parame) {
    this.a = paramot1;
    this.c = parame;
    this.b = parame.b() + paramLong;
  }
  
  public final boolean a() {
    return (this.b < this.c.b());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/n61.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */