package com.google.android.gms.common.util;

import android.os.Build;
import android.util.Log;

public final class o {
  private static Boolean a;
  
  public static boolean a() {
    return true;
  }
  
  public static boolean b() {
    return (Build.VERSION.SDK_INT >= 15);
  }
  
  public static boolean c() {
    return (Build.VERSION.SDK_INT >= 16);
  }
  
  public static boolean d() {
    return (Build.VERSION.SDK_INT >= 17);
  }
  
  public static boolean e() {
    return (Build.VERSION.SDK_INT >= 18);
  }
  
  public static boolean f() {
    return (Build.VERSION.SDK_INT >= 19);
  }
  
  public static boolean g() {
    return (Build.VERSION.SDK_INT >= 20);
  }
  
  public static boolean h() {
    return (Build.VERSION.SDK_INT >= 21);
  }
  
  public static boolean i() {
    return (Build.VERSION.SDK_INT >= 23);
  }
  
  public static boolean j() {
    return (Build.VERSION.SDK_INT >= 24);
  }
  
  public static boolean k() {
    return (Build.VERSION.SDK_INT >= 26);
  }
  
  public static boolean l() {
    return (Build.VERSION.SDK_INT >= 28);
  }
  
  public static boolean m() {
    return (Build.VERSION.SDK_INT >= 29);
  }
  
  public static boolean n() {
    boolean bool3;
    boolean bool = m();
    boolean bool1 = false;
    if (!bool)
      return false; 
    if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.CODENAME.equals("REL"))
      return true; 
    String str = Build.VERSION.CODENAME;
    if (str.length() == 1 && str.charAt(0) >= 'R' && str.charAt(0) <= 'Z') {
      bool3 = true;
    } else {
      bool3 = false;
    } 
    if (!bool3)
      return false; 
    Boolean bool2 = a;
    if (bool2 != null)
      return bool2.booleanValue(); 
    bool = bool1;
    try {
      if ("google".equals(Build.BRAND)) {
        bool = bool1;
        if (!Build.ID.startsWith("RPP1")) {
          bool = bool1;
          if (!Build.ID.startsWith("RPP2")) {
            bool = bool1;
            if (Integer.parseInt(Build.VERSION.INCREMENTAL) >= 6301457)
              bool = true; 
          } 
        } 
      } 
      a = Boolean.valueOf(bool);
    } catch (NumberFormatException numberFormatException) {
      a = Boolean.TRUE;
    } 
    if (!a.booleanValue())
      Log.w("PlatformVersion", "Build version must be at least 6301457 to support R in gmscore"); 
    return a.booleanValue();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */