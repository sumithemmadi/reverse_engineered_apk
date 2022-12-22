package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class c50 implements a92<t40> {
  private final m92<x40> a;
  
  private final m92<Set<gb0<q40>>> b;
  
  private final m92<Executor> c;
  
  private c50(m92<x40> paramm92, m92<Set<gb0<q40>>> paramm921, m92<Executor> paramm922) {
    this.a = paramm92;
    this.b = paramm921;
    this.c = paramm922;
  }
  
  public static c50 a(m92<x40> paramm92, m92<Set<gb0<q40>>> paramm921, m92<Executor> paramm922) {
    return new c50(paramm92, paramm921, paramm922);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/c50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */