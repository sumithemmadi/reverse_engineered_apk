package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class a51 implements s91<Object> {
  private final ot1<String> a;
  
  private final Executor b;
  
  public a51(ot1<String> paramot1, Executor paramExecutor) {
    this.a = paramot1;
    this.b = paramExecutor;
  }
  
  public final ot1<Object> a() {
    return dt1.k(this.a, z41.a, this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/a51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */