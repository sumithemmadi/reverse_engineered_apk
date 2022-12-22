package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public abstract class wk extends ub2 implements tk {
  public wk() {
    super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    a a1;
    IInterface iInterface;
    switch (paramInt1) {
      default:
        return false;
      case 7:
        Q2(tb2.<zzasq>b(paramParcel1, zzasq.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 6:
        A6(paramParcel1.createTypedArrayList(Uri.CREATOR), a.a.i1(paramParcel1.readStrongBinder()), tf.S9(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5:
        N9(paramParcel1.createTypedArrayList(Uri.CREATOR), a.a.i1(paramParcel1.readStrongBinder()), tf.S9(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 4:
        a1 = q1(a.a.i1(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, (IInterface)a1);
        return true;
      case 3:
        a1 = f4(a.a.i1(a1.readStrongBinder()), a.a.i1(a1.readStrongBinder()));
        paramParcel2.writeNoException();
        tb2.c(paramParcel2, (IInterface)a1);
        return true;
      case 2:
        w4(a.a.i1(a1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 1:
        break;
    } 
    a a2 = a.a.i1(a1.readStrongBinder());
    zzaye zzaye = tb2.<zzaye>b((Parcel)a1, zzaye.CREATOR);
    IBinder iBinder = a1.readStrongBinder();
    if (iBinder == null) {
      a1 = null;
    } else {
      iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
      if (iInterface instanceof sk) {
        iInterface = iInterface;
      } else {
        iInterface = new uk(iBinder);
      } 
    } 
    J8(a2, zzaye, (sk)iInterface);
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */