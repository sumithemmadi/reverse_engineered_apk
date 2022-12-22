package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class o8 extends ub2 implements p8 {
  public static p8 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    return (iInterface instanceof p8) ? (p8)iInterface : new q8(paramIBinder);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/o8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */