package com.google.android.gms.internal.ads;

import android.os.Trace;

public final class xj2 {
  public static void a(String paramString) {
    if (wj2.a >= 18)
      Trace.beginSection(paramString); 
  }
  
  public static void b() {
    if (wj2.a >= 18)
      Trace.endSection(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */