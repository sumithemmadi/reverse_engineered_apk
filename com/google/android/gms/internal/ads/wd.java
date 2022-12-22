package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.o;

final class wd implements d<o, ?> {
  wd(td paramtd, jd paramjd, sb paramsb) {}
  
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */