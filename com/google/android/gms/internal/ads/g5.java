package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class g5 extends ub2 implements h5 {
  public static h5 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    return (iInterface instanceof h5) ? (h5)iInterface : new j5(paramIBinder);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/g5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */