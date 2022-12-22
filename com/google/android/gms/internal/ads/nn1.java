package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class nn1 extends ub2 implements kn1 {
  public static kn1 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
    return (iInterface instanceof kn1) ? (kn1)iInterface : new mn1(paramIBinder);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */