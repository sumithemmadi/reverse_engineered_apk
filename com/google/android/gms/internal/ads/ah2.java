package com.google.android.gms.internal.ads;

final class ah2 implements Runnable {
  ah2(zg2 paramzg2, fh2 paramfh2) {}
  
  public final void run() {
    this.b.a();
    int i = zg2.z(this.c).size();
    for (byte b = 0; b < i; b++)
      ((th2)zg2.z(this.c).valueAt(b)).e(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ah2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */