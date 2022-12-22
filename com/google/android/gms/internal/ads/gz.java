package com.google.android.gms.internal.ads;

import android.content.Context;

public final class gz implements a92<gb0<d60>> {
  private final yy a;
  
  private final m92<Context> b;
  
  private final m92<zzazn> c;
  
  private final m92<nh1> d;
  
  private final m92<gi1> e;
  
  public gz(yy paramyy, m92<Context> paramm92, m92<zzazn> paramm921, m92<nh1> paramm922, m92<gi1> paramm923) {
    this.a = paramyy;
    this.b = paramm92;
    this.c = paramm921;
    this.d = paramm922;
    this.e = paramm923;
  }
  
  public static gb0<d60> a(yy paramyy, Context paramContext, zzazn paramzzazn, nh1 paramnh1, gi1 paramgi1) {
    return g92.<gb0<d60>>b(new gb0<d60>(new xy(paramContext, paramzzazn, paramnh1, paramgi1), fm.f), "Cannot return null from a non-@Nullable @Provides method");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */