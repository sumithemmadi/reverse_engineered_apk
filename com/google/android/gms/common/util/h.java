package com.google.android.gms.common.util;

import android.os.SystemClock;

public class h implements e {
  private static final h a = new h();
  
  public static e d() {
    return a;
  }
  
  public long a() {
    return System.currentTimeMillis();
  }
  
  public long b() {
    return SystemClock.elapsedRealtime();
  }
  
  public long c() {
    return System.nanoTime();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */