package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class tm0 implements a92<gb0<f50>> {
  private final m92<fn0> a;
  
  private final m92<Executor> b;
  
  private tm0(m92<fn0> paramm92, m92<Executor> paramm921) {
    this.a = paramm92;
    this.b = paramm921;
  }
  
  public static tm0 a(m92<fn0> paramm92, m92<Executor> paramm921) {
    return new tm0(paramm92, paramm921);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tm0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */