package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class bo0 implements a92<gb0<d70>> {
  private final m92<zn0> a;
  
  private final m92<Executor> b;
  
  private final m92<ft0> c;
  
  private bo0(m92<zn0> paramm92, m92<Executor> paramm921, m92<ft0> paramm922) {
    this.a = paramm92;
    this.b = paramm921;
    this.c = paramm922;
  }
  
  public static bo0 a(m92<zn0> paramm92, m92<Executor> paramm921, m92<ft0> paramm922) {
    return new bo0(paramm92, paramm921, paramm922);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bo0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */