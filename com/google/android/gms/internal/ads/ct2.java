package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class ct2 {
  private final String a;
  
  private ys2 b;
  
  public ct2(ys2 paramys2) {
    this.b = paramys2;
    try {
      String str = paramys2.Z0();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      remoteException = null;
    } 
    this.a = (String)remoteException;
  }
  
  public final String toString() {
    return this.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ct2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */