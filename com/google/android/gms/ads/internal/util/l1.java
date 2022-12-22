package com.google.android.gms.ads.internal.util;

import android.content.Context;

final class l1 implements Runnable {
  l1(h1 paramh1, Context paramContext) {}
  
  public final void run() {
    synchronized (h1.e(this.c)) {
      h1.f(this.c, h1.x(this.b));
      h1.e(this.c).notifyAll();
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/l1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */