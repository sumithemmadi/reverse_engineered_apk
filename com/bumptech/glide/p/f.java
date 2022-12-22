package com.bumptech.glide.p;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;

public final class f {
  private static final double a;
  
  static {
    int i = Build.VERSION.SDK_INT;
    double d = 1.0D;
    if (i >= 17)
      d = 1.0D / Math.pow(10.0D, 6.0D); 
    a = d;
  }
  
  public static double a(long paramLong) {
    double d1 = (b() - paramLong);
    double d2 = a;
    Double.isNaN(d1);
    return d1 * d2;
  }
  
  @TargetApi(17)
  public static long b() {
    return (Build.VERSION.SDK_INT >= 17) ? SystemClock.elapsedRealtimeNanos() : SystemClock.uptimeMillis();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/p/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */