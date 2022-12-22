package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public final class xb2 extends sb2 implements wb2 {
  xb2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.clearcut.IClearcut");
  }
  
  public final void l4(int[] paramArrayOfint) {
    Parcel parcel = a2();
    parcel.writeIntArray(null);
    i1(4, parcel);
  }
  
  public final void r5(a parama, String paramString1, String paramString2) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    parcel.writeString(paramString1);
    parcel.writeString(null);
    i1(8, parcel);
  }
  
  public final void v2(a parama, String paramString) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    parcel.writeString(paramString);
    i1(2, parcel);
  }
  
  public final void x3(int paramInt) {
    Parcel parcel = a2();
    parcel.writeInt(paramInt);
    i1(6, parcel);
  }
  
  public final void x8() {
    i1(3, a2());
  }
  
  public final void y1(byte[] paramArrayOfbyte) {
    Parcel parcel = a2();
    parcel.writeByteArray(paramArrayOfbyte);
    i1(5, parcel);
  }
  
  public final void y4(int paramInt) {
    Parcel parcel = a2();
    parcel.writeInt(paramInt);
    i1(7, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */