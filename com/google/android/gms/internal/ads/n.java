package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class n implements Runnable {
  n(l paraml) {}
  
  public final void run() {
    if (l.T9(this.b) != null)
      try {
        l.T9(this.b).w0(1);
        return;
      } catch (RemoteException remoteException) {
        cm.d("Could not notify onRewardedVideoAdFailedToLoad event.", (Throwable)remoteException);
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */