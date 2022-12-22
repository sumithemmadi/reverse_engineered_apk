package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

public final class nq0 implements a92<PackageInfo> {
  private final m92<Context> a;
  
  private final m92<ApplicationInfo> b;
  
  private nq0(m92<Context> paramm92, m92<ApplicationInfo> paramm921) {
    this.a = paramm92;
    this.b = paramm921;
  }
  
  public static nq0 a(m92<Context> paramm92, m92<ApplicationInfo> paramm921) {
    return new nq0(paramm92, paramm921);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */