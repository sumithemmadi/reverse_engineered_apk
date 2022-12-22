package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

public abstract class tr2 extends ub2 implements ur2 {
  public tr2() {
    super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    IBinder iBinder2;
    ls2 ls2;
    IBinder iBinder1;
    jr2 jr2;
    IBinder iBinder3 = null;
    IBinder iBinder4 = null;
    switch (paramInt1) {
      default:
        return false;
      case 15:
        l2(tb2.<AdManagerAdViewOptions>b(paramParcel1, AdManagerAdViewOptions.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 14:
        f2(o8.S9(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 13:
        n6(tb2.<zzajt>b(paramParcel1, zzajt.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 10:
        R8(f5.S9(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 9:
        W2(tb2.<PublisherAdViewOptions>b(paramParcel1, PublisherAdViewOptions.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 8:
        Y1(a5.S9(paramParcel1.readStrongBinder()), tb2.<zzvs>b(paramParcel1, zzvs.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 7:
        iBinder2 = paramParcel1.readStrongBinder();
        if (iBinder2 == null) {
          iBinder2 = iBinder4;
        } else {
          IInterface iInterface = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
          if (iInterface instanceof ls2) {
            ls2 = (ls2)iInterface;
          } else {
            ls2 = new os2((IBinder)ls2);
          } 
        } 
        P6(ls2);
        paramParcel2.writeNoException();
        return true;
      case 6:
        c3(tb2.<zzaeh>b((Parcel)ls2, zzaeh.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 5:
        k3(ls2.readString(), x4.S9(ls2.readStrongBinder()), r4.S9(ls2.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 4:
        C2(q4.S9(ls2.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 3:
        E3(l4.S9(ls2.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 2:
        iBinder1 = ls2.readStrongBinder();
        if (iBinder1 == null) {
          iBinder1 = iBinder3;
        } else {
          IInterface iInterface = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
          if (iInterface instanceof jr2) {
            jr2 = (jr2)iInterface;
          } else {
            jr2 = new lr2((IBinder)jr2);
          } 
        } 
        C5(jr2);
        paramParcel2.writeNoException();
        return true;
      case 1:
        break;
    } 
    pr2 pr2 = n8();
    paramParcel2.writeNoException();
    tb2.c(paramParcel2, pr2);
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tr2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */