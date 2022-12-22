package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class xs2 extends ub2 implements us2 {
  public static us2 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    return (iInterface instanceof us2) ? (us2)iInterface : new ws2(paramIBinder);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xs2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */