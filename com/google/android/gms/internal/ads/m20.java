package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class m20 implements a92<gb0<d60>> {
  private final m92<jw> a;
  
  private final m92<Executor> b;
  
  private m20(m92<jw> paramm92, m92<Executor> paramm921) {
    this.a = paramm92;
    this.b = paramm921;
  }
  
  public static gb0<d60> a(jw paramjw, Executor paramExecutor) {
    return g92.<gb0<d60>>b(new gb0<d60>(paramjw, paramExecutor), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public static m20 b(m92<jw> paramm92, m92<Executor> paramm921) {
    return new m20(paramm92, paramm921);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/m20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */