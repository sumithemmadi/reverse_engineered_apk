package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

public final class se1 {
  public static <T> void a(AtomicReference<T> paramAtomicReference, re1<T> paramre1) {
    paramAtomicReference = (AtomicReference<T>)paramAtomicReference.get();
    if (paramAtomicReference == null)
      return; 
    try {
      paramre1.a((T)paramAtomicReference);
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/se1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */