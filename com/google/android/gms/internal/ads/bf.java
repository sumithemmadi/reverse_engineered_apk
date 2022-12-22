package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class bf extends RemoteCreator<ff> {
  public bf() {
    super("com.google.android.gms.ads.AdOverlayCreatorImpl");
  }
  
  public final af c(Activity paramActivity) {
    try {
      a a = b.a2(paramActivity);
      IBinder iBinder = ((ff)b((Context)paramActivity)).m4(a);
      if (iBinder == null)
        return null; 
      IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      return (iInterface instanceof af) ? (af)iInterface : new cf(iBinder);
    } catch (RemoteException remoteException) {
      cm.d("Could not create remote AdOverlay.", (Throwable)remoteException);
      return null;
    } catch (com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException remoteCreatorException) {
      cm.d("Could not create remote AdOverlay.", (Throwable)remoteCreatorException);
      return null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */