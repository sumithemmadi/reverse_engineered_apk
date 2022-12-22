package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.h1;

final class go implements Runnable {
  private zzbax b;
  
  private boolean c = false;
  
  go(zzbax paramzzbax) {
    this.b = paramzzbax;
  }
  
  private final void c() {
    xp1 xp1 = h1.a;
    xp1.removeCallbacks(this);
    xp1.postDelayed(this, 250L);
  }
  
  public final void a() {
    this.c = true;
    this.b.v();
  }
  
  public final void b() {
    this.c = false;
    c();
  }
  
  public final void run() {
    if (!this.c) {
      this.b.v();
      c();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/go.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */