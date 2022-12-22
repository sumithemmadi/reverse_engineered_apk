package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.d;

final class sd implements d<?, ?> {
  sd(td paramtd, yc paramyc, sb paramsb) {}
  
  public final void Q(String paramString) {
    try {
      this.a.u(paramString);
      return;
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */