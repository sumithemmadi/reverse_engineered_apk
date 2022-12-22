package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class vb2 extends ub2 implements wb2 {
  public static wb2 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
    return (iInterface instanceof wb2) ? (wb2)iInterface : new xb2(paramIBinder);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */