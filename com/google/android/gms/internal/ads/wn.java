package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

public final class wn extends nn {
  public final zzbav a(Context paramContext, eo parameo, int paramInt, boolean paramBoolean, z0 paramz0, bo parambo) {
    boolean bool;
    ApplicationInfo applicationInfo = paramContext.getApplicationInfo();
    if (applicationInfo == null || applicationInfo.targetSdkVersion >= 11) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool)
      return null; 
    do do = new do(paramContext, parameo.b(), parameo.getRequestId(), paramz0, parameo.E());
    return (zzbav)((paramInt == 2) ? new zzbbr(paramContext, do, parameo, paramBoolean, nn.b(parameo), parambo) : new zzbam(paramContext, parameo, paramBoolean, nn.b(parameo), parambo, new do(paramContext, parameo.b(), parameo.getRequestId(), paramz0, parameo.E())));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */