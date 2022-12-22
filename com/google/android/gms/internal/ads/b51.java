package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class b51 implements a92<a51> {
  private final m92<ot1<String>> a;
  
  private final m92<Executor> b;
  
  private b51(m92<ot1<String>> paramm92, m92<Executor> paramm921) {
    this.a = paramm92;
    this.b = paramm921;
  }
  
  public static b51 a(m92<ot1<String>> paramm92, m92<Executor> paramm921) {
    return new b51(paramm92, paramm921);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/b51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */