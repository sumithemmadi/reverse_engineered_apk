package com.google.android.gms.internal.ads;

import java.util.Set;

public final class y90 implements a92<Set<gb0<d60>>> {
  private final k90 a;
  
  private y90(k90 paramk90) {
    this.a = paramk90;
  }
  
  public static y90 a(k90 paramk90) {
    return new y90(paramk90);
  }
  
  public static Set<gb0<d60>> b(k90 paramk90) {
    return g92.<Set<gb0<d60>>>b(paramk90.c(), "Cannot return null from a non-@Nullable @Provides method");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/y90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */