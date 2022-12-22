package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;

final class vc implements Runnable {
  vc(tc paramtc, AdRequest.ErrorCode paramErrorCode) {}
  
  public final void run() {
    try {
      tc.c(this.c).Z(xc.a(this.b));
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */