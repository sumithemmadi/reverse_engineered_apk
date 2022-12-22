package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;

public abstract class df extends ub2 implements af {
  public df() {
    super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
  }
  
  public static af S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    return (iInterface instanceof af) ? (af)iInterface : new cf(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    Bundle bundle;
    boolean bool;
    switch (paramInt1) {
      default:
        return false;
      case 14:
        M0();
        paramParcel2.writeNoException();
        return true;
      case 13:
        U7(a.a.i1(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 12:
        x1(paramParcel1.readInt(), paramParcel1.readInt(), tb2.<Intent>b(paramParcel1, Intent.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 11:
        bool = S8();
        paramParcel2.writeNoException();
        tb2.a(paramParcel2, bool);
        return true;
      case 10:
        z8();
        paramParcel2.writeNoException();
        return true;
      case 9:
        x4();
        paramParcel2.writeNoException();
        return true;
      case 8:
        onDestroy();
        paramParcel2.writeNoException();
        return true;
      case 7:
        X();
        paramParcel2.writeNoException();
        return true;
      case 6:
        bundle = tb2.<Bundle>b(paramParcel1, Bundle.CREATOR);
        c5(bundle);
        paramParcel2.writeNoException();
        tb2.g(paramParcel2, (Parcelable)bundle);
        return true;
      case 5:
        onPause();
        paramParcel2.writeNoException();
        return true;
      case 4:
        onResume();
        paramParcel2.writeNoException();
        return true;
      case 3:
        onStart();
        paramParcel2.writeNoException();
        return true;
      case 2:
        L7();
        paramParcel2.writeNoException();
        return true;
      case 1:
        break;
    } 
    G9(tb2.<Bundle>b((Parcel)bundle, Bundle.CREATOR));
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/df.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */