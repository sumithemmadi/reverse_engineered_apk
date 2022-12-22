package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zy implements a92<x50> {
  private final yy a;
  
  private final m92<Set<gb0<d60>>> b;
  
  public zy(yy paramyy, m92<Set<gb0<d60>>> paramm92) {
    this.a = paramyy;
    this.b = paramm92;
  }
  
  public static x50 a(yy paramyy, Set<gb0<d60>> paramSet) {
    return g92.<x50>b(paramyy.a(paramSet), "Cannot return null from a non-@Nullable @Provides method");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */