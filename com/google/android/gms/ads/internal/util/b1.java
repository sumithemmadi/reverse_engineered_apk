package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.i2;

public final class b1 extends cm {
  public static void l(String paramString, Throwable paramThrowable) {
    if (n())
      Log.v("Ads", paramString, paramThrowable); 
  }
  
  public static void m(String paramString) {
    if (n())
      Log.v("Ads", paramString); 
  }
  
  public static boolean n() {
    return (cm.a(2) && ((Boolean)i2.a.a()).booleanValue());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/b1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */