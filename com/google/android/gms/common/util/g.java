package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.t;

public final class g {
  private static final String[] a = new String[] { "android.", "com.android.", "dalvik.", "java.", "javax." };
  
  public static boolean a(Context paramContext, Throwable paramThrowable) {
    return b(paramContext, paramThrowable, 536870912);
  }
  
  private static boolean b(Context paramContext, Throwable paramThrowable, int paramInt) {
    try {
      t.j(paramContext);
      t.j(paramThrowable);
      return false;
    } catch (Exception exception) {
      Log.e("CrashUtils", "Error adding exception to DropBox!", exception);
      return false;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */