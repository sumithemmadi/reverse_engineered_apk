package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class gu2 extends RemoteCreator<ss2> {
  public gu2() {
    super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
  }
  
  public final rs2 c(Context paramContext) {
    try {
      a a = b.a2(paramContext);
      IBinder iBinder = ((ss2)b(paramContext)).c9(a, 204204000);
      if (iBinder == null)
        return null; 
      IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
      return (iInterface instanceof rs2) ? (rs2)iInterface : new ts2(iBinder);
    } catch (RemoteException remoteException) {
    
    } catch (com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException remoteCreatorException) {}
    cm.d("Could not get remote MobileAdsSettingManager.", (Throwable)remoteCreatorException);
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gu2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */