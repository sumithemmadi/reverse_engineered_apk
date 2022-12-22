package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class h implements Runnable {
  h(e parame) {}
  
  public final void run() {
    if (e.T9(this.b) != null)
      try {
        e.T9(this.b).Z(1);
        return;
      } catch (RemoteException remoteException) {
        cm.d("Could not notify onAdFailedToLoad event.", (Throwable)remoteException);
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */