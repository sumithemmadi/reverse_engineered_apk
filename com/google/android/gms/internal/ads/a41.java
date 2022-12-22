package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class a41 implements et1<p41> {
  a41(r31 paramr31, sk paramsk) {}
  
  public final void a(Throwable paramThrowable) {
    try {
      sk sk1 = this.a;
      String str = String.valueOf(paramThrowable.getMessage());
      if (str.length() != 0) {
        str = "Internal error. ".concat(str);
      } else {
        str = new String("Internal error. ");
      } 
      sk1.l1(str);
      return;
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/a41.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */