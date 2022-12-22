package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class yh extends RemoteCreator<sh> {
  public yh() {
    super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
  }
  
  public final rh c(Context paramContext, mb parammb) {
    try {
      a a = b.a2(paramContext);
      IBinder iBinder = ((sh)b(paramContext)).D2(a, parammb, 204204000);
      if (iBinder == null)
        return null; 
      IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
      return (iInterface instanceof rh) ? (rh)iInterface : new th(iBinder);
    } catch (RemoteException remoteException) {
    
    } catch (com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException remoteCreatorException) {}
    cm.d("Could not get remote RewardedVideoAd.", (Throwable)remoteCreatorException);
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */