package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class cj {
  public static li a(Context paramContext, String paramString, mb parammb) {
    a a = b.a2(paramContext);
    try {
      IBinder iBinder = ((ri)bm.<ri>a(paramContext, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", fj.a)).D7(a, paramString, parammb, 204204000);
      if (iBinder == null)
        return null; 
      IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
      return (iInterface instanceof li) ? (li)iInterface : new ni(iBinder);
    } catch (zzazl zzazl) {
    
    } catch (RemoteException remoteException) {}
    cm.f("#007 Could not call remote method.", (Throwable)remoteException);
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */