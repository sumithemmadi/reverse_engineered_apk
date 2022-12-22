package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.k.c;
import com.google.android.gms.common.util.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

final class y91 implements s91<z91> {
  private final nt1 a;
  
  private final Context b;
  
  public y91(nt1 paramnt1, Context paramContext) {
    this.a = paramnt1;
    this.b = paramContext;
  }
  
  private static ResolveInfo b(PackageManager paramPackageManager, String paramString) {
    return paramPackageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)), 65536);
  }
  
  private static String c(Context paramContext, PackageManager paramPackageManager) {
    ResolveInfo resolveInfo = b(paramPackageManager, "market://details?id=com.google.android.gms.ads");
    if (resolveInfo == null)
      return null; 
    ActivityInfo activityInfo = resolveInfo.activityInfo;
    if (activityInfo == null)
      return null; 
    try {
      PackageInfo packageInfo = c.a(paramContext).e(activityInfo.packageName, 0);
      if (packageInfo != null) {
        int i = packageInfo.versionCode;
        null = activityInfo.packageName;
        int j = String.valueOf(null).length();
        StringBuilder stringBuilder = new StringBuilder();
        this(j + 12);
        stringBuilder.append(i);
        stringBuilder.append(".");
        stringBuilder.append(null);
        return stringBuilder.toString();
      } 
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {}
    return null;
  }
  
  private static String e(Context paramContext) {
    try {
      PackageInfo packageInfo = c.a(paramContext).e("com.android.vending", 128);
      if (packageInfo != null) {
        int i = packageInfo.versionCode;
        null = packageInfo.packageName;
        int j = String.valueOf(null).length();
        StringBuilder stringBuilder = new StringBuilder();
        this(j + 12);
        stringBuilder.append(i);
        stringBuilder.append(".");
        stringBuilder.append(null);
        return stringBuilder.toString();
      } 
    } catch (Exception exception) {}
    return null;
  }
  
  public final ot1<z91> a() {
    return this.a.a(new ba1(this));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/y91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */