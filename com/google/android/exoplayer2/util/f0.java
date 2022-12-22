package com.google.android.exoplayer2.util;

import android.annotation.TargetApi;
import android.os.Trace;

public final class f0 {
  public static void a(String paramString) {
    if (h0.a >= 18)
      b(paramString); 
  }
  
  @TargetApi(18)
  private static void b(String paramString) {
    Trace.beginSection(paramString);
  }
  
  public static void c() {
    if (h0.a >= 18)
      d(); 
  }
  
  @TargetApi(18)
  private static void d() {
    Trace.endSection();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */