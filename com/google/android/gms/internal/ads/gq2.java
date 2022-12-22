package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class gq2 extends RemoteCreator<vr2> {
  public gq2() {
    super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
  }
  
  public final ur2 c(Context paramContext, String paramString, mb parammb) {
    try {
      a a = b.a2(paramContext);
      IBinder iBinder = ((vr2)b(paramContext)).k6(a, paramString, parammb, 204204000);
      if (iBinder == null)
        return null; 
      null = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      return (null instanceof ur2) ? (ur2)null : new wr2(iBinder);
    } catch (RemoteException remoteException) {
    
    } catch (com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException remoteCreatorException) {}
    cm.d("Could not create remote builder for AdLoader.", (Throwable)remoteCreatorException);
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gq2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */