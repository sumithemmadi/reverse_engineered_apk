package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.f;
import com.google.android.gms.common.k.c;

public final class t {
  public static boolean a(Context paramContext, int paramInt) {
    if (!b(paramContext, paramInt, "com.google.android.gms"))
      return false; 
    PackageManager packageManager = paramContext.getPackageManager();
    try {
      PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
      return f.a(paramContext).b(packageInfo);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      if (Log.isLoggable("UidVerifier", 3))
        Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false"); 
      return false;
    } 
  }
  
  @TargetApi(19)
  public static boolean b(Context paramContext, int paramInt, String paramString) {
    return c.a(paramContext).h(paramInt, paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */