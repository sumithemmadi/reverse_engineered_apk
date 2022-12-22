package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
public final class jo0 {
  private final so0 a;
  
  private final Executor b;
  
  private final Map<String, String> c;
  
  public jo0(so0 paramso0, Executor paramExecutor) {
    this.a = paramso0;
    this.c = paramso0.d();
    this.b = paramExecutor;
  }
  
  public final mo0 b() {
    return mo0.f(new mo0(this));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jo0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */