package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

final class jo1 implements lo1 {
  private static final zzcf$zza a = (zzcf$zza)zzcf$zza.z0().z("E").h();
  
  public final zzcf$zza a() {
    return a;
  }
  
  public final zzcf$zza b(Context paramContext) {
    PackageInfo packageInfo = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0);
    return ao1.a(paramContext, paramContext.getPackageName(), Integer.toString(packageInfo.versionCode));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jo1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */