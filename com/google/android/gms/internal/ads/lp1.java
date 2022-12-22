package com.google.android.gms.internal.ads;

final class lp1 implements Runnable {
  lp1(lq1 paramlq1) {}
  
  public final void run() {
    if (this.b.e != null)
      return; 
    synchronized (lq1.g()) {
      boolean bool2;
      if (this.b.e != null)
        return; 
      boolean bool1 = false;
      try {
        bool2 = ((Boolean)m0.N1.a()).booleanValue();
      } catch (IllegalStateException illegalStateException) {
        bool2 = false;
      } 
      if (bool2)
        try {
          ao2 ao2 = new ao2();
          this((lq1.a(this.b)).b, "ADSHIELD", null);
        } finally {
          Exception exception = null;
        }  
      this.b.e = Boolean.valueOf(bool2);
      lq1.g().open();
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */