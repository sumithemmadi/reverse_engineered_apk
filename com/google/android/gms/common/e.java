package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.k.c;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.o;
import com.google.android.gms.common.util.t;
import com.google.android.gms.common.util.x;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class e {
  @Deprecated
  public static final int a = 12451000;
  
  private static boolean b = false;
  
  private static boolean c = false;
  
  static final AtomicBoolean d = new AtomicBoolean();
  
  private static final AtomicBoolean e = new AtomicBoolean();
  
  @Deprecated
  public static void a(Context paramContext, int paramInt) {
    paramInt = c.f().h(paramContext, paramInt);
    if (paramInt != 0) {
      Intent intent = c.f().b(paramContext, paramInt, "e");
      StringBuilder stringBuilder = new StringBuilder(57);
      stringBuilder.append("GooglePlayServices not available due to error ");
      stringBuilder.append(paramInt);
      Log.e("GooglePlayServicesUtil", stringBuilder.toString());
      if (intent == null)
        throw new GooglePlayServicesNotAvailableException(paramInt); 
      throw new GooglePlayServicesRepairableException(paramInt, "Google Play Services not available", intent);
    } 
  }
  
  @Deprecated
  public static int b(Context paramContext) {
    try {
      PackageInfo packageInfo = paramContext.getPackageManager().getPackageInfo("com.google.android.gms", 0);
      return packageInfo.versionCode;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
      return 0;
    } 
  }
  
  @Deprecated
  public static String c(int paramInt) {
    return ConnectionResult.t0(paramInt);
  }
  
  public static Context d(Context paramContext) {
    try {
      return paramContext.createPackageContext("com.google.android.gms", 3);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      return null;
    } 
  }
  
  public static Resources e(Context paramContext) {
    try {
      return paramContext.getPackageManager().getResourcesForApplication("com.google.android.gms");
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      return null;
    } 
  }
  
  public static boolean f(Context paramContext) {
    if (!c)
      try {
        PackageInfo packageInfo = c.a(paramContext).e("com.google.android.gms", 64);
        f.a(paramContext);
        if (packageInfo != null && !f.f(packageInfo, false) && f.f(packageInfo, true)) {
          b = true;
        } else {
          b = false;
        } 
        c = true;
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", (Throwable)nameNotFoundException);
        c = true;
      } finally {} 
    return (b || !i.c());
  }
  
  @Deprecated
  public static int g(Context paramContext, int paramInt) {
    StringBuilder stringBuilder;
    boolean bool;
    try {
      paramContext.getResources().getString(g.common_google_play_services_unknown_issue);
    } finally {
      Exception exception = null;
    } 
    if (!i.f((Context)stringBuilder) && !i.g((Context)stringBuilder)) {
      bool = true;
    } else {
      bool = false;
    } 
    return l((Context)stringBuilder, bool, paramInt);
  }
  
  @Deprecated
  public static boolean h(Context paramContext, int paramInt) {
    return (paramInt == 18) ? true : ((paramInt == 1) ? m(paramContext, "com.google.android.gms") : false);
  }
  
  @TargetApi(18)
  public static boolean i(Context paramContext) {
    if (o.e()) {
      Bundle bundle = ((UserManager)paramContext.getSystemService("user")).getApplicationRestrictions(paramContext.getPackageName());
      if (bundle != null && "true".equals(bundle.getString("restricted_profile")))
        return true; 
    } 
    return false;
  }
  
  @Deprecated
  public static boolean j(int paramInt) {
    return !(paramInt != 1 && paramInt != 2 && paramInt != 3 && paramInt != 9);
  }
  
  @Deprecated
  @TargetApi(19)
  public static boolean k(Context paramContext, int paramInt, String paramString) {
    return t.b(paramContext, paramInt, paramString);
  }
  
  private static int l(Context paramContext, boolean paramBoolean, int paramInt) {
    boolean bool;
    if (paramInt >= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    t.a(bool);
    String str = paramContext.getPackageName();
    PackageManager packageManager = paramContext.getPackageManager();
    PackageInfo packageInfo = null;
    if (paramBoolean)
      try {
        packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        Log.w("GooglePlayServicesUtil", String.valueOf(str).concat(" requires the Google Play Store, but it is missing."));
        return 9;
      }  
    try {
      PackageInfo packageInfo1 = packageManager.getPackageInfo("com.google.android.gms", 64);
      f.a((Context)nameNotFoundException);
      if (!f.f(packageInfo1, true)) {
        Log.w("GooglePlayServicesUtil", String.valueOf(str).concat(" requires Google Play services, but their signature is invalid."));
        return 9;
      } 
      if (paramBoolean && (!f.f((PackageInfo)t.j(packageInfo), true) || !packageInfo.signatures[0].equals(packageInfo1.signatures[0]))) {
        Log.w("GooglePlayServicesUtil", String.valueOf(str).concat(" requires Google Play Store, but its signature is invalid."));
        return 9;
      } 
      if (x.a(packageInfo1.versionCode) < x.a(paramInt)) {
        int i = packageInfo1.versionCode;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 82);
        stringBuilder.append("Google Play services out of date for ");
        stringBuilder.append(str);
        stringBuilder.append(".  Requires ");
        stringBuilder.append(paramInt);
        stringBuilder.append(" but found ");
        stringBuilder.append(i);
        Log.w("GooglePlayServicesUtil", stringBuilder.toString());
        return 2;
      } 
      ApplicationInfo applicationInfo2 = packageInfo1.applicationInfo;
      ApplicationInfo applicationInfo1 = applicationInfo2;
      if (applicationInfo2 == null)
        try {
          applicationInfo1 = packageManager.getApplicationInfo("com.google.android.gms", 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException1) {
          Log.wtf("GooglePlayServicesUtil", String.valueOf(str).concat(" requires Google Play services, but they're missing when getting application info."), (Throwable)nameNotFoundException1);
          return 1;
        }  
      return !((ApplicationInfo)nameNotFoundException1).enabled ? 3 : 0;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException1) {
      Log.w("GooglePlayServicesUtil", String.valueOf(str).concat(" requires Google Play services, but they are missing."));
      return 1;
    } 
  }
  
  @TargetApi(21)
  static boolean m(Context paramContext, String paramString) {
    boolean bool = paramString.equals("com.google.android.gms");
    if (o.h())
      try {
        List list = paramContext.getPackageManager().getPackageInstaller().getAllSessions();
        Iterator<PackageInstaller.SessionInfo> iterator = list.iterator();
        while (iterator.hasNext()) {
          if (paramString.equals(((PackageInstaller.SessionInfo)iterator.next()).getAppPackageName()))
            return true; 
        } 
      } catch (Exception exception) {
        return false;
      }  
    PackageManager packageManager = exception.getPackageManager();
    try {
      ApplicationInfo applicationInfo = packageManager.getApplicationInfo(paramString, 8192);
      if (bool)
        return applicationInfo.enabled; 
      if (applicationInfo.enabled) {
        bool = i((Context)exception);
        if (!bool)
          return true; 
      } 
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {}
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */