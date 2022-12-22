package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class uc0 implements a92<gb0<m40>> {
  private final fc0 a;
  
  private final m92<ud0> b;
  
  private final m92<Executor> c;
  
  private uc0(fc0 paramfc0, m92<ud0> paramm92, m92<Executor> paramm921) {
    this.a = paramfc0;
    this.b = paramm92;
    this.c = paramm921;
  }
  
  public static uc0 a(fc0 paramfc0, m92<ud0> paramm92, m92<Executor> paramm921) {
    return new uc0(paramfc0, paramm92, paramm921);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/uc0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */