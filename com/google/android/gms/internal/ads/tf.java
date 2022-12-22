package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class tf extends ub2 implements uf {
  public static uf S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    return (iInterface instanceof uf) ? (uf)iInterface : new vf(paramIBinder);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */