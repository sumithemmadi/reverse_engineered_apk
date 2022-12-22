package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class sr2 extends ub2 implements pr2 {
  public sr2() {
    super("com.google.android.gms.ads.internal.client.IAdLoader");
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    String str;
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3) {
          if (paramInt1 != 4) {
            if (paramInt1 != 5)
              return false; 
            s2(tb2.<zzvl>b(paramParcel1, zzvl.CREATOR), paramParcel1.readInt());
            paramParcel2.writeNoException();
          } else {
            str = X0();
            paramParcel2.writeNoException();
            paramParcel2.writeString(str);
          } 
        } else {
          boolean bool = r();
          paramParcel2.writeNoException();
          tb2.a(paramParcel2, bool);
        } 
      } else {
        str = a();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str);
      } 
    } else {
      Y5(tb2.<zzvl>b((Parcel)str, zzvl.CREATOR));
      paramParcel2.writeNoException();
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sr2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */