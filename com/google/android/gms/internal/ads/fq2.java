package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class fq2 extends RemoteCreator<cs2> {
  public fq2() {
    super("com.google.android.gms.ads.AdManagerCreatorImpl");
  }
  
  public final xr2 c(Context paramContext, zzvs paramzzvs, String paramString, mb parammb, int paramInt) {
    try {
      a a = b.a2(paramContext);
      IBinder iBinder = ((cs2)b(paramContext)).A4(a, paramzzvs, paramString, parammb, 204204000, paramInt);
      if (iBinder == null)
        return null; 
      null = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      return (null instanceof xr2) ? (xr2)null : new zr2(iBinder);
    } catch (RemoteException remoteException) {
    
    } catch (com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException remoteCreatorException) {}
    cm.b("Could not create remote AdManager.", (Throwable)remoteCreatorException);
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fq2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */