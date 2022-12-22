package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

final class z60 implements Runnable {
  private final WeakReference<u60> b;
  
  private z60(u60 paramu60) {
    this.b = new WeakReference<u60>(paramu60);
  }
  
  public final void run() {
    u60 u60 = this.b.get();
    if (u60 != null)
      u60.b1(u60); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/z60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */