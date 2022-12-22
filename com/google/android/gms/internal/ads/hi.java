package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;

public final class hi extends sb2 implements fi {
  hi(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
  }
  
  public final void I3(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(11, parcel);
  }
  
  public final void O1(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(3, parcel);
  }
  
  public final void V5(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(8, parcel);
  }
  
  public final void X2(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(4, parcel);
  }
  
  public final void X3(a parama, zzavj paramzzavj) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    tb2.d(parcel, (Parcelable)paramzzavj);
    i1(7, parcel);
  }
  
  public final void a5(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(1, parcel);
  }
  
  public final void k9(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(6, parcel);
  }
  
  public final void u2(a parama, int paramInt) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    parcel.writeInt(paramInt);
    i1(2, parcel);
  }
  
  public final void u7(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(10, parcel);
  }
  
  public final void w3(a parama, int paramInt) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    parcel.writeInt(paramInt);
    i1(9, parcel);
  }
  
  public final void y8(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(5, parcel);
  }
  
  public final void z(Bundle paramBundle) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramBundle);
    i1(12, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */