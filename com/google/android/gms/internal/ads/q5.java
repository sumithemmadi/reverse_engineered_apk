package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class q5 extends RemoteCreator<r3> {
  public q5() {
    super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
  }
  
  public final q3 c(Context paramContext, FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2) {
    try {
      a a3 = b.a2(paramContext);
      a a1 = b.a2(paramFrameLayout1);
      a a2 = b.a2(paramFrameLayout2);
      IBinder iBinder = ((r3)b(paramContext)).R4(a3, a1, a2, 204204000);
      if (iBinder == null)
        return null; 
      null = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
      return (null instanceof q3) ? (q3)null : new s3(iBinder);
    } catch (RemoteException remoteException) {
    
    } catch (com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException remoteCreatorException) {}
    cm.d("Could not create remote NativeAdViewDelegate.", (Throwable)remoteCreatorException);
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/q5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */