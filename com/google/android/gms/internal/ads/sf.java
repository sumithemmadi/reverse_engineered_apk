package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class sf extends ub2 implements qf {
  public static qf S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
    return (iInterface instanceof qf) ? (qf)iInterface : new rf(paramIBinder);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */