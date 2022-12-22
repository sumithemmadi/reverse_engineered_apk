package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

public final class h81 implements a92<f81> {
  private final m92<nt1> a;
  
  private final m92<Context> b;
  
  private final m92<Set<String>> c;
  
  private h81(m92<nt1> paramm92, m92<Context> paramm921, m92<Set<String>> paramm922) {
    this.a = paramm92;
    this.b = paramm921;
    this.c = paramm922;
  }
  
  public static h81 a(m92<nt1> paramm92, m92<Context> paramm921, m92<Set<String>> paramm922) {
    return new h81(paramm92, paramm921, paramm922);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/h81.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */