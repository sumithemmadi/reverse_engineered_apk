package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class r20 implements a92<gb0<q40>> {
  private final m92<xn0> a;
  
  private final m92<Executor> b;
  
  private final m92<dt0> c;
  
  private r20(m92<xn0> paramm92, m92<Executor> paramm921, m92<dt0> paramm922) {
    this.a = paramm92;
    this.b = paramm921;
    this.c = paramm922;
  }
  
  public static r20 a(m92<xn0> paramm92, m92<Executor> paramm921, m92<dt0> paramm922) {
    return new r20(paramm92, paramm921, paramm922);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/r20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */