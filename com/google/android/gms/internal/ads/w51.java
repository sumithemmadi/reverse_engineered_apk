package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class w51 implements a92<v51> {
  private final m92<Executor> a;
  
  private final m92<fl> b;
  
  private w51(m92<Executor> paramm92, m92<fl> paramm921) {
    this.a = paramm92;
    this.b = paramm921;
  }
  
  public static v51 a(Executor paramExecutor, fl paramfl) {
    return new v51(paramExecutor, paramfl);
  }
  
  public static w51 b(m92<Executor> paramm92, m92<fl> paramm921) {
    return new w51(paramm92, paramm921);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/w51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */