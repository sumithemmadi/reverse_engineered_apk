package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.k.b;
import com.google.android.gms.common.k.c;

public final class a1 {
  private static Object a = new Object();
  
  private static boolean b;
  
  private static String c;
  
  private static int d;
  
  public static int a(Context paramContext) {
    b(paramContext);
    return d;
  }
  
  private static void b(Context paramContext) {
    synchronized (a) {
      if (b)
        return; 
      b = true;
      String str = paramContext.getPackageName();
      b b = c.a(paramContext);
      try {
        Bundle bundle = (b.c(str, 128)).metaData;
        if (bundle == null)
          return; 
        c = bundle.getString("com.google.app.id");
        d = bundle.getInt("com.google.android.gms.version");
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        Log.wtf("MetadataValueReader", "This should never happen.", (Throwable)nameNotFoundException);
      } 
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/a1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */