package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.k.c;

public class d {
  public static boolean a() {
    return false;
  }
  
  public static boolean b(Context paramContext, String paramString) {
    "com.google.android.gms".equals(paramString);
    try {
      int i = (c.a(paramContext).c(paramString, 0)).flags;
      if ((i & 0x200000) != 0)
        return true; 
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {}
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */