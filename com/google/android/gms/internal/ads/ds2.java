package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ds2 extends ub2 implements es2 {
  public ds2() {
    super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
  }
  
  public static es2 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
    return (iInterface instanceof es2) ? (es2)iInterface : new gs2(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 == 1) {
      S0();
      paramParcel2.writeNoException();
      return true;
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ds2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */