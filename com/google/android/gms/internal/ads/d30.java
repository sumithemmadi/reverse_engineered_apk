package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class d30 implements a92<gb0<f50>> {
  private final m92<xn0> a;
  
  private final m92<Executor> b;
  
  private final m92<dt0> c;
  
  private d30(m92<xn0> paramm92, m92<Executor> paramm921, m92<dt0> paramm922) {
    this.a = paramm92;
    this.b = paramm921;
    this.c = paramm922;
  }
  
  public static d30 a(m92<xn0> paramm92, m92<Executor> paramm921, m92<dt0> paramm922) {
    return new d30(paramm92, paramm921, paramm922);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/d30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */