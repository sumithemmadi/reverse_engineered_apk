package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class ig extends ub2 implements jg {
  public ig() {
    super("com.google.android.gms.ads.internal.request.IAdRequestService");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    kg kg;
    if (paramInt1 != 1) {
      mg mg;
      String str = null;
      IBinder iBinder1 = null;
      IBinder iBinder2 = null;
      IBinder iBinder3 = null;
      IBinder iBinder4 = null;
      if (paramInt1 != 2) {
        if (paramInt1 != 4) {
          if (paramInt1 != 5) {
            if (paramInt1 != 6) {
              if (paramInt1 != 7)
                return false; 
              str = paramParcel1.readString();
              IBinder iBinder = paramParcel1.readStrongBinder();
              if (iBinder == null) {
                iBinder = iBinder4;
              } else {
                IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (iInterface instanceof mg) {
                  mg = (mg)iInterface;
                } else {
                  mg = new og((IBinder)mg);
                } 
              } 
              D4(str, mg);
              paramParcel2.writeNoException();
            } else {
              String str1;
              zzatq zzatq = tb2.<zzatq>b((Parcel)mg, zzatq.CREATOR);
              IBinder iBinder = mg.readStrongBinder();
              if (iBinder == null) {
                str1 = str;
              } else {
                IInterface iInterface = str1.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (iInterface instanceof mg) {
                  mg = (mg)iInterface;
                } else {
                  mg = new og((IBinder)mg);
                } 
              } 
              m6(zzatq, mg);
              paramParcel2.writeNoException();
            } 
          } else {
            zzatq zzatq = tb2.<zzatq>b((Parcel)mg, zzatq.CREATOR);
            IBinder iBinder = mg.readStrongBinder();
            if (iBinder == null) {
              iBinder = iBinder1;
            } else {
              IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
              if (iInterface instanceof mg) {
                mg = (mg)iInterface;
              } else {
                mg = new og((IBinder)mg);
              } 
            } 
            V4(zzatq, mg);
            paramParcel2.writeNoException();
          } 
        } else {
          zzatq zzatq = tb2.<zzatq>b((Parcel)mg, zzatq.CREATOR);
          IBinder iBinder = mg.readStrongBinder();
          if (iBinder == null) {
            iBinder = iBinder2;
          } else {
            IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
            if (iInterface instanceof mg) {
              mg = (mg)iInterface;
            } else {
              mg = new og((IBinder)mg);
            } 
          } 
          o4(zzatq, mg);
          paramParcel2.writeNoException();
        } 
      } else {
        zzatb zzatb = tb2.<zzatb>b((Parcel)mg, zzatb.CREATOR);
        IBinder iBinder = mg.readStrongBinder();
        if (iBinder == null) {
          iBinder = iBinder3;
        } else {
          IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
          if (iInterface instanceof kg) {
            kg = (kg)iInterface;
          } else {
            kg = new ng((IBinder)kg);
          } 
        } 
        E4(zzatb, kg);
        paramParcel2.writeNoException();
      } 
    } else {
      zzatd zzatd = R3(tb2.<zzatb>b((Parcel)kg, zzatb.CREATOR));
      paramParcel2.writeNoException();
      tb2.g(paramParcel2, (Parcelable)zzatd);
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */