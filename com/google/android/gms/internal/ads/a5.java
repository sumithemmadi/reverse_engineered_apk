package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class a5 extends ub2 implements b5 {
  public static b5 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    return (iInterface instanceof b5) ? (b5)iInterface : new d5(paramIBinder);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/a5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */