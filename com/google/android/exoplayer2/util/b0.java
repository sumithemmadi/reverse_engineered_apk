package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

final class b0 implements f {
  public long b() {
    return SystemClock.elapsedRealtime();
  }
  
  public long c() {
    return SystemClock.uptimeMillis();
  }
  
  public n d(Looper paramLooper, Handler.Callback paramCallback) {
    return new c0(new Handler(paramLooper, paramCallback));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */