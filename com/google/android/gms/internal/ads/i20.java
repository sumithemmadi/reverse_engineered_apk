package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class i20 implements a92<gb0<bq2>> {
  private final m92<jw> a;
  
  private final m92<Executor> b;
  
  private i20(m92<jw> paramm92, m92<Executor> paramm921) {
    this.a = paramm92;
    this.b = paramm921;
  }
  
  public static i20 a(m92<jw> paramm92, m92<Executor> paramm921) {
    return new i20(paramm92, paramm921);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/i20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */