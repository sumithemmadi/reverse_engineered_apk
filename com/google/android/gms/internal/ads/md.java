package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;

public final class md extends sb2 implements kd {
  md(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
  }
  
  public final void B5(String paramString1, String paramString2, zzvl paramzzvl, a parama, jd paramjd, sb paramsb) {
    Parcel parcel = a2();
    parcel.writeString(paramString1);
    parcel.writeString(paramString2);
    tb2.d(parcel, (Parcelable)paramzzvl);
    tb2.c(parcel, (IInterface)parama);
    tb2.c(parcel, paramjd);
    tb2.c(parcel, paramsb);
    i1(20, parcel);
  }
  
  public final zzapy F0() {
    Parcel parcel = Y0(2, a2());
    zzapy zzapy = tb2.<zzapy>b(parcel, zzapy.CREATOR);
    parcel.recycle();
    return zzapy;
  }
  
  public final void G1(String paramString) {
    Parcel parcel = a2();
    parcel.writeString(paramString);
    i1(19, parcel);
  }
  
  public final void I4(String paramString1, String paramString2, zzvl paramzzvl, a parama, yc paramyc, sb paramsb, zzvs paramzzvs) {
    Parcel parcel = a2();
    parcel.writeString(paramString1);
    parcel.writeString(paramString2);
    tb2.d(parcel, (Parcelable)paramzzvl);
    tb2.c(parcel, (IInterface)parama);
    tb2.c(parcel, paramyc);
    tb2.c(parcel, paramsb);
    tb2.d(parcel, (Parcelable)paramzzvs);
    i1(13, parcel);
  }
  
  public final void J5(a parama, String paramString, Bundle paramBundle1, Bundle paramBundle2, zzvs paramzzvs, pd parampd) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    parcel.writeString(paramString);
    tb2.d(parcel, (Parcelable)paramBundle1);
    tb2.d(parcel, (Parcelable)paramBundle2);
    tb2.d(parcel, (Parcelable)paramzzvs);
    tb2.c(parcel, parampd);
    i1(1, parcel);
  }
  
  public final void U3(String paramString1, String paramString2, zzvl paramzzvl, a parama, ed paramed, sb paramsb) {
    Parcel parcel = a2();
    parcel.writeString(paramString1);
    parcel.writeString(paramString2);
    tb2.d(parcel, (Parcelable)paramzzvl);
    tb2.c(parcel, (IInterface)parama);
    tb2.c(parcel, paramed);
    tb2.c(parcel, paramsb);
    i1(18, parcel);
  }
  
  public final boolean U8(a parama) {
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama);
    Parcel parcel1 = Y0(17, parcel2);
    boolean bool = tb2.e(parcel1);
    parcel1.recycle();
    return bool;
  }
  
  public final boolean a4(a parama) {
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama);
    Parcel parcel1 = Y0(15, parcel2);
    boolean bool = tb2.e(parcel1);
    parcel1.recycle();
    return bool;
  }
  
  public final nt2 getVideoController() {
    Parcel parcel = Y0(5, a2());
    nt2 nt2 = mt2.S9(parcel.readStrongBinder());
    parcel.recycle();
    return nt2;
  }
  
  public final void u4(String paramString1, String paramString2, zzvl paramzzvl, a parama, jd paramjd, sb paramsb) {
    Parcel parcel = a2();
    parcel.writeString(paramString1);
    parcel.writeString(paramString2);
    tb2.d(parcel, (Parcelable)paramzzvl);
    tb2.c(parcel, (IInterface)parama);
    tb2.c(parcel, paramjd);
    tb2.c(parcel, paramsb);
    i1(16, parcel);
  }
  
  public final zzapy v0() {
    Parcel parcel = Y0(3, a2());
    zzapy zzapy = tb2.<zzapy>b(parcel, zzapy.CREATOR);
    parcel.recycle();
    return zzapy;
  }
  
  public final void v7(String paramString1, String paramString2, zzvl paramzzvl, a parama, dd paramdd, sb paramsb) {
    Parcel parcel = a2();
    parcel.writeString(paramString1);
    parcel.writeString(paramString2);
    tb2.d(parcel, (Parcelable)paramzzvl);
    tb2.c(parcel, (IInterface)parama);
    tb2.c(parcel, paramdd);
    tb2.c(parcel, paramsb);
    i1(14, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/md.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */