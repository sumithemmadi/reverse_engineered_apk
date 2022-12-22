package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class of extends ub2 implements kf {
  public static kf S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
    return (iInterface instanceof kf) ? (kf)iInterface : new nf(paramIBinder);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/of.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */