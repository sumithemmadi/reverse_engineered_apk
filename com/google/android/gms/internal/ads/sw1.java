package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

final class sw1 implements Runnable {
  sw1(tt1 paramtt1, MotionEvent paramMotionEvent) {}
  
  public final void run() {
    try {
      tt1.v().f(this.b);
      return;
    } catch (Exception exception) {
      tt1.w().b(2022, -1L, exception);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sw1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */