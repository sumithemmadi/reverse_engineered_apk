package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class ee0 implements a92<Set<String>> {
  private final m92<ag0> a;
  
  public ee0(m92<ag0> paramm92) {
    this.a = paramm92;
  }
  
  public static Set<String> a(ag0 paramag0) {
    Set<?> set;
    if (paramag0.d() != null) {
      set = Collections.singleton("banner");
    } else {
      set = Collections.emptySet();
    } 
    return (Set<String>)g92.<Set<?>>b(set, "Cannot return null from a non-@Nullable @Provides method");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ee0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */