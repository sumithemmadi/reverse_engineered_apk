package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class et2 extends ub2 implements bt2 {
  public static bt2 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    return (iInterface instanceof bt2) ? (bt2)iInterface : new dt2(paramIBinder);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/et2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */