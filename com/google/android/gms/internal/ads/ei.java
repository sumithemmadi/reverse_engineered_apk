package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public abstract class ei extends ub2 implements fi {
  public ei() {
    super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
  }
  
  public static fi S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    return (iInterface instanceof fi) ? (fi)iInterface : new hi(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    switch (paramInt1) {
      default:
        return false;
      case 12:
        z(tb2.<Bundle>b(paramParcel1, Bundle.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 11:
        I3(a.a.i1(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 10:
        u7(a.a.i1(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 9:
        w3(a.a.i1(paramParcel1.readStrongBinder()), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 8:
        V5(a.a.i1(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 7:
        X3(a.a.i1(paramParcel1.readStrongBinder()), tb2.<zzavj>b(paramParcel1, zzavj.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 6:
        k9(a.a.i1(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5:
        y8(a.a.i1(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 4:
        X2(a.a.i1(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 3:
        O1(a.a.i1(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 2:
        u2(a.a.i1(paramParcel1.readStrongBinder()), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 1:
        break;
    } 
    a5(a.a.i1(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */