package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.b1;

final class u9 implements um {
  u9(h9 paramh9, z9 paramz9) {}
  
  public final void run() {
    synchronized (h9.d(this.b)) {
      h9.a(this.b, 1);
      b1.m("Failed loading new engine. Marking new engine destroyable.");
      this.a.i();
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/u9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */