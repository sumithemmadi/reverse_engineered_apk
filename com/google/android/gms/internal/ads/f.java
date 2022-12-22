package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class f implements Runnable {
  f(c paramc) {}
  
  public final void run() {
    if (fu2.S9(this.b.b) != null)
      try {
        fu2.S9(this.b.b).Z(1);
        return;
      } catch (RemoteException remoteException) {
        cm.d("Could not notify onAdFailedToLoad event.", (Throwable)remoteException);
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */