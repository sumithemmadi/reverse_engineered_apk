package com.google.android.gms.internal.ads;

import android.content.Context;

public final class q91 implements a92<n91> {
  private final m92<nt1> a;
  
  private final m92<Context> b;
  
  private q91(m92<nt1> paramm92, m92<Context> paramm921) {
    this.a = paramm92;
    this.b = paramm921;
  }
  
  public static n91 a(nt1 paramnt1, Context paramContext) {
    return new n91(paramnt1, paramContext);
  }
  
  public static q91 b(m92<nt1> paramm92, m92<Context> paramm921) {
    return new q91(paramm92, paramm921);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/q91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */