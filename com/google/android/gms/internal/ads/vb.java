package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class vb extends ub2 implements sb {
  public vb() {
    super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
  }
  
  public static sb S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    return (iInterface instanceof sb) ? (sb)iInterface : new ub(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    IInterface iInterface;
    IBinder iBinder;
    switch (paramInt1) {
      default:
        return false;
      case 24:
        p7(tb2.<zzvg>b(paramParcel1, zzvg.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 23:
        J0(tb2.<zzvg>b(paramParcel1, zzvg.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 22:
        N3(paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 21:
        G7(paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 20:
        a1();
        paramParcel2.writeNoException();
        return true;
      case 19:
        z(tb2.<Bundle>b(paramParcel1, Bundle.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 18:
        T8();
        paramParcel2.writeNoException();
        return true;
      case 17:
        V6(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 16:
        h1(ji.S9(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 15:
        q0();
        paramParcel2.writeNoException();
        return true;
      case 14:
        n9(tb2.<zzavj>b(paramParcel1, zzavj.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 13:
        v1();
        paramParcel2.writeNoException();
        return true;
      case 12:
        q6(paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 11:
        N0();
        paramParcel2.writeNoException();
        return true;
      case 10:
        I0(h4.S9(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 9:
        n(paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 8:
        S();
        paramParcel2.writeNoException();
        return true;
      case 7:
        iBinder = paramParcel1.readStrongBinder();
        if (iBinder == null) {
          paramParcel1 = null;
        } else {
          iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
          if (iInterface instanceof xb) {
            iInterface = iInterface;
          } else {
            iInterface = new wb(iBinder);
          } 
        } 
        S4((xb)iInterface);
        paramParcel2.writeNoException();
        return true;
      case 6:
        i();
        paramParcel2.writeNoException();
        return true;
      case 5:
        L();
        paramParcel2.writeNoException();
        return true;
      case 4:
        O();
        paramParcel2.writeNoException();
        return true;
      case 3:
        Z(iInterface.readInt());
        paramParcel2.writeNoException();
        return true;
      case 2:
        Y();
        paramParcel2.writeNoException();
        return true;
      case 1:
        break;
    } 
    x();
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */