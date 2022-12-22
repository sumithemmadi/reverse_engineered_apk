package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public final class s3 extends sb2 implements q3 {
  s3(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
  }
  
  public final void C1(a parama, int paramInt) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    parcel.writeInt(paramInt);
    i1(5, parcel);
  }
  
  public final void K3(String paramString, a parama) {
    Parcel parcel = a2();
    parcel.writeString(paramString);
    tb2.c(parcel, (IInterface)parama);
    i1(1, parcel);
  }
  
  public final void P4(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(7, parcel);
  }
  
  public final a W6(String paramString) {
    Parcel parcel = a2();
    parcel.writeString(paramString);
    parcel = Y0(2, parcel);
    a a = a.a.i1(parcel.readStrongBinder());
    parcel.recycle();
    return a;
  }
  
  public final void d1(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(3, parcel);
  }
  
  public final void i0(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(6, parcel);
  }
  
  public final void r6(i3 parami3) {
    Parcel parcel = a2();
    tb2.c(parcel, parami3);
    i1(8, parcel);
  }
  
  public final void y3(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(9, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/s3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */