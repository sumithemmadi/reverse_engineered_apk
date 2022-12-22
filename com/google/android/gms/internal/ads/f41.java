package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

final class f41 implements et1<ArrayList<Uri>> {
  f41(r31 paramr31, uf paramuf) {}
  
  public final void a(Throwable paramThrowable) {
    try {
      uf uf1 = this.a;
      String str = String.valueOf(paramThrowable.getMessage());
      if (str.length() != 0) {
        str = "Internal error: ".concat(str);
      } else {
        str = new String("Internal error: ");
      } 
      uf1.l1(str);
      return;
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/f41.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */