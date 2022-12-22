package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

final class sz1 implements Runnable {
  sz1(tt1 paramtt1, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void run() {
    try {
      tt1.v().f(MotionEvent.obtain(0L, this.b, 0, this.c, this.d, 0));
      return;
    } catch (Exception exception) {
      tt1.w().b(2022, -1L, exception);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */