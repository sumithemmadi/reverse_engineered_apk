package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.w;

final class ud implements d<w, ?> {
  ud(td paramtd, ed paramed, sb paramsb) {}
  
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */