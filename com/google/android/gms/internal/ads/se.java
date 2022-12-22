package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public abstract class se extends ub2 implements te {
  public se() {
    super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
  }
  
  public static te S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    return (iInterface instanceof te) ? (te)iInterface : new ve(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3)
          return false; 
        A3();
      } else {
        O7(a.a.i1(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      } 
    } else {
      g1(tb2.<Intent>b(paramParcel1, Intent.CREATOR));
    } 
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/se.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */