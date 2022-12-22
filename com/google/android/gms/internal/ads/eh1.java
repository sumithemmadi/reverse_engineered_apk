package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.y.a;

final class eh1 extends a {
  eh1(bh1 parambh1, bt2 parambt2) {}
  
  public final void B() {
    if (bh1.T9(this.b) != null)
      try {
        this.a.S0();
        return;
      } catch (RemoteException remoteException) {
        cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/eh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */