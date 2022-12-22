package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public final class cn0 implements a92<Set<gb0<fm1>>> {
  private final m92<Executor> a;
  
  private final m92<sn0> b;
  
  private cn0(m92<Executor> paramm92, m92<sn0> paramm921) {
    this.a = paramm92;
    this.b = paramm921;
  }
  
  public static cn0 a(m92<Executor> paramm92, m92<sn0> paramm921) {
    return new cn0(paramm92, paramm921);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */