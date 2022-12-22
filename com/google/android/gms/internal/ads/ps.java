package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class ps extends ub2 implements ms {
  public static ms S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
    return (iInterface instanceof ms) ? (ms)iInterface : new os(paramIBinder);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */