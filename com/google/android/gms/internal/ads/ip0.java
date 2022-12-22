package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class ip0 implements a92<Set<gb0<fm1>>> {
  private final bp0 a;
  
  private final m92<lp0> b;
  
  private final m92<Executor> c;
  
  private ip0(bp0 parambp0, m92<lp0> paramm92, m92<Executor> paramm921) {
    this.a = parambp0;
    this.b = paramm92;
    this.c = paramm921;
  }
  
  public static ip0 a(bp0 parambp0, m92<lp0> paramm92, m92<Executor> paramm921) {
    return new ip0(parambp0, paramm92, paramm921);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ip0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */