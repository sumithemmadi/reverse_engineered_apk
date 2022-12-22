package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.qm1;

final class h implements Runnable {
  h(f paramf, boolean paramBoolean) {}
  
  public final void run() {
    long l = System.currentTimeMillis();
    try {
      String str = (f.k(this.c)).b;
      f f1 = this.c;
      qm1.j(str, f.h(f1, f.l(f1)), this.b).q();
      return;
    } catch (NullPointerException nullPointerException) {
      f.i(this.c).b(2027, System.currentTimeMillis() - l, nullPointerException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */