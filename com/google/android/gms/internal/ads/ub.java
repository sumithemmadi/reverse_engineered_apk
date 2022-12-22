package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class ub extends sb2 implements sb {
  ub(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
  }
  
  public final void G7(String paramString) {
    Parcel parcel = a2();
    parcel.writeString(paramString);
    i1(21, parcel);
  }
  
  public final void I0(i4 parami4, String paramString) {
    Parcel parcel = a2();
    tb2.c(parcel, parami4);
    parcel.writeString(paramString);
    i1(10, parcel);
  }
  
  public final void J0(zzvg paramzzvg) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzvg);
    i1(23, parcel);
  }
  
  public final void L() {
    i1(5, a2());
  }
  
  public final void N0() {
    i1(11, a2());
  }
  
  public final void N3(int paramInt, String paramString) {
    Parcel parcel = a2();
    parcel.writeInt(paramInt);
    parcel.writeString(paramString);
    i1(22, parcel);
  }
  
  public final void O() {
    i1(4, a2());
  }
  
  public final void S() {
    i1(8, a2());
  }
  
  public final void S4(xb paramxb) {
    Parcel parcel = a2();
    tb2.c(parcel, paramxb);
    i1(7, parcel);
  }
  
  public final void T8() {
    i1(18, a2());
  }
  
  public final void V6(int paramInt) {
    Parcel parcel = a2();
    parcel.writeInt(paramInt);
    i1(17, parcel);
  }
  
  public final void Y() {
    i1(2, a2());
  }
  
  public final void Z(int paramInt) {
    Parcel parcel = a2();
    parcel.writeInt(paramInt);
    i1(3, parcel);
  }
  
  public final void a1() {
    i1(20, a2());
  }
  
  public final void h1(ki paramki) {
    Parcel parcel = a2();
    tb2.c(parcel, paramki);
    i1(16, parcel);
  }
  
  public final void i() {
    i1(6, a2());
  }
  
  public final void n(String paramString1, String paramString2) {
    Parcel parcel = a2();
    parcel.writeString(paramString1);
    parcel.writeString(paramString2);
    i1(9, parcel);
  }
  
  public final void n9(zzavj paramzzavj) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzavj);
    i1(14, parcel);
  }
  
  public final void p7(zzvg paramzzvg) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzvg);
    i1(24, parcel);
  }
  
  public final void q0() {
    i1(15, a2());
  }
  
  public final void q6(String paramString) {
    Parcel parcel = a2();
    parcel.writeString(paramString);
    i1(12, parcel);
  }
  
  public final void v1() {
    i1(13, a2());
  }
  
  public final void x() {
    i1(1, a2());
  }
  
  public final void z(Bundle paramBundle) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramBundle);
    i1(19, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */