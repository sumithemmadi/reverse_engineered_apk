package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.o;

final class lc implements d<o, ?> {
  lc(jc paramjc, sb paramsb) {}
  
  public final void Q(String paramString) {
    try {
      String str = jc.U9(this.b).getClass().getCanonicalName();
      int i = String.valueOf(str).length();
      int j = String.valueOf(paramString).length();
      StringBuilder stringBuilder = new StringBuilder();
      this(i + 31 + j);
      stringBuilder.append(str);
      stringBuilder.append("failed to loaded mediation ad: ");
      stringBuilder.append(paramString);
      cm.e(stringBuilder.toString());
      this.a.N3(0, paramString);
      this.a.Z(0);
      return;
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */