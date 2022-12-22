package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

public final class i {
  private static Boolean a;
  
  private static Boolean b;
  
  private static Boolean c;
  
  private static Boolean d;
  
  public static boolean a(Context paramContext) {
    if (c == null) {
      boolean bool;
      PackageManager packageManager = paramContext.getPackageManager();
      if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
        bool = true;
      } else {
        bool = false;
      } 
      c = Boolean.valueOf(bool);
    } 
    return c.booleanValue();
  }
  
  @TargetApi(21)
  public static boolean b(Context paramContext) {
    return h(paramContext);
  }
  
  public static boolean c() {
    return "user".equals(Build.TYPE);
  }
  
  @TargetApi(20)
  public static boolean d(Context paramContext) {
    return e(paramContext.getPackageManager());
  }
  
  @TargetApi(20)
  public static boolean e(PackageManager paramPackageManager) {
    if (a == null) {
      boolean bool;
      if (o.g() && paramPackageManager.hasSystemFeature("android.hardware.type.watch")) {
        bool = true;
      } else {
        bool = false;
      } 
      a = Boolean.valueOf(bool);
    } 
    return a.booleanValue();
  }
  
  @TargetApi(26)
  public static boolean f(Context paramContext) {
    return (d(paramContext) && (!o.j() || (h(paramContext) && !o.k())));
  }
  
  public static boolean g(Context paramContext) {
    if (d == null) {
      boolean bool;
      if (paramContext.getPackageManager().hasSystemFeature("android.hardware.type.iot") || paramContext.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
        bool = true;
      } else {
        bool = false;
      } 
      d = Boolean.valueOf(bool);
    } 
    return d.booleanValue();
  }
  
  @TargetApi(21)
  private static boolean h(Context paramContext) {
    if (b == null) {
      boolean bool;
      if (o.h() && paramContext.getPackageManager().hasSystemFeature("cn.google")) {
        bool = true;
      } else {
        bool = false;
      } 
      b = Boolean.valueOf(bool);
    } 
    return b.booleanValue();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */