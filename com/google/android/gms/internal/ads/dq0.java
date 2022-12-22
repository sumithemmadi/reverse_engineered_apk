package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.k.c;

public final class dq0 {
  public static PackageInfo a(Context paramContext, ApplicationInfo paramApplicationInfo) {
    try {
      PackageInfo packageInfo = c.a(paramContext).e(paramApplicationInfo.packageName, 0);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      nameNotFoundException = null;
    } 
    return (PackageInfo)nameNotFoundException;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */