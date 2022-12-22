package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public final class ui extends sb2 implements ri {
  ui(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
  }
  
  public final IBinder D7(a parama, String paramString, mb parammb, int paramInt) {
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama);
    parcel2.writeString(paramString);
    tb2.c(parcel2, parammb);
    parcel2.writeInt(204204000);
    Parcel parcel1 = Y0(1, parcel2);
    IBinder iBinder = parcel1.readStrongBinder();
    parcel1.recycle();
    return iBinder;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */