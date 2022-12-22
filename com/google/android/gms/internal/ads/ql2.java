package com.google.android.gms.internal.ads;

final class ql2 implements Runnable {
  ql2(nl2 paramnl2) {}
  
  public final void run() {
    synchronized (nl2.d(this.b)) {
      if (nl2.i(this.b) && nl2.j(this.b)) {
        nl2.g(this.b, false);
        cm.e("App went background");
        for (pl2 pl2 : nl2.k(this.b)) {
          try {
            pl2.a(false);
          } catch (Exception exception) {
            cm.c("", exception);
          } 
        } 
      } else {
        cm.e("App is still foreground");
      } 
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ql2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */