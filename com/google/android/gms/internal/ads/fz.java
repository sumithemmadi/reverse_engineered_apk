package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class fz implements a92<Set<gb0<d60>>> {
  private final yy a;
  
  private final m92<k00> b;
  
  public fz(yy paramyy, m92<k00> paramm92) {
    this.a = paramyy;
    this.b = paramm92;
  }
  
  public static Set<gb0<d60>> a(yy paramyy, k00 paramk00) {
    return g92.<Set<gb0<d60>>>b(Collections.singleton(new gb0<d60>(paramk00, fm.f)), "Cannot return null from a non-@Nullable @Provides method");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */