package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class xe extends ub2 implements ue {
  public static ue S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    return (iInterface instanceof ue) ? (ue)iInterface : new we(paramIBinder);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */