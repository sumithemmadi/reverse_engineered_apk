package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;
import java.util.List;

public final class tb extends sb2 implements rb {
  tb(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
  }
  
  public final void B8(a parama, z7 paramz7, List<zzajr> paramList) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    tb2.c(parcel, paramz7);
    parcel.writeTypedList(paramList);
    i1(31, parcel);
  }
  
  public final zzapy F0() {
    Parcel parcel = Y0(33, a2());
    zzapy zzapy = tb2.<zzapy>b(parcel, zzapy.CREATOR);
    parcel.recycle();
    return zzapy;
  }
  
  public final void F4(a parama, zzvl paramzzvl, String paramString1, fi paramfi, String paramString2) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    tb2.d(parcel, (Parcelable)paramzzvl);
    parcel.writeString(paramString1);
    tb2.c(parcel, paramfi);
    parcel.writeString(paramString2);
    i1(10, parcel);
  }
  
  public final void J() {
    i1(9, a2());
  }
  
  public final fc M4() {
    fc fc;
    Parcel parcel = Y0(27, a2());
    IBinder iBinder = parcel.readStrongBinder();
    if (iBinder == null) {
      iBinder = null;
    } else {
      IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
      if (iInterface instanceof fc) {
        fc = (fc)iInterface;
      } else {
        fc = new hc((IBinder)fc);
      } 
    } 
    parcel.recycle();
    return fc;
  }
  
  public final void Q4(a parama, fi paramfi, List<String> paramList) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    tb2.c(parcel, paramfi);
    parcel.writeStringList(paramList);
    i1(23, parcel);
  }
  
  public final void Q8(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(30, parcel);
  }
  
  public final void S5(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(21, parcel);
  }
  
  public final zb S6() {
    zb zb;
    Parcel parcel = Y0(15, a2());
    IBinder iBinder = parcel.readStrongBinder();
    if (iBinder == null) {
      iBinder = null;
    } else {
      IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
      if (iInterface instanceof zb) {
        zb = (zb)iInterface;
      } else {
        zb = new bc((IBinder)zb);
      } 
    } 
    parcel.recycle();
    return zb;
  }
  
  public final void W1(a parama, zzvl paramzzvl, String paramString1, String paramString2, sb paramsb, zzaeh paramzzaeh, List<String> paramList) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    tb2.d(parcel, (Parcelable)paramzzvl);
    parcel.writeString(paramString1);
    parcel.writeString(paramString2);
    tb2.c(parcel, paramsb);
    tb2.d(parcel, (Parcelable)paramzzaeh);
    parcel.writeStringList(paramList);
    i1(14, parcel);
  }
  
  public final boolean c4() {
    Parcel parcel = Y0(22, a2());
    boolean bool = tb2.e(parcel);
    parcel.recycle();
    return bool;
  }
  
  public final a c8() {
    Parcel parcel = Y0(2, a2());
    a a = a.a.i1(parcel.readStrongBinder());
    parcel.recycle();
    return a;
  }
  
  public final void destroy() {
    i1(5, a2());
  }
  
  public final nt2 getVideoController() {
    Parcel parcel = Y0(26, a2());
    nt2 nt2 = mt2.S9(parcel.readStrongBinder());
    parcel.recycle();
    return nt2;
  }
  
  public final boolean isInitialized() {
    Parcel parcel = Y0(13, a2());
    boolean bool = tb2.e(parcel);
    parcel.recycle();
    return bool;
  }
  
  public final void j9(a parama, zzvl paramzzvl, String paramString1, String paramString2, sb paramsb) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    tb2.d(parcel, (Parcelable)paramzzvl);
    parcel.writeString(paramString1);
    parcel.writeString(paramString2);
    tb2.c(parcel, paramsb);
    i1(7, parcel);
  }
  
  public final void o(boolean paramBoolean) {
    Parcel parcel = a2();
    tb2.a(parcel, paramBoolean);
    i1(25, parcel);
  }
  
  public final void p1(zzvl paramzzvl, String paramString) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzvl);
    parcel.writeString(paramString);
    i1(11, parcel);
  }
  
  public final void p6(a parama, zzvl paramzzvl, String paramString, sb paramsb) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    tb2.d(parcel, (Parcelable)paramzzvl);
    parcel.writeString(paramString);
    tb2.c(parcel, paramsb);
    i1(28, parcel);
  }
  
  public final void pause() {
    i1(8, a2());
  }
  
  public final void r2(a parama, zzvs paramzzvs, zzvl paramzzvl, String paramString1, String paramString2, sb paramsb) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    tb2.d(parcel, (Parcelable)paramzzvs);
    tb2.d(parcel, (Parcelable)paramzzvl);
    parcel.writeString(paramString1);
    parcel.writeString(paramString2);
    tb2.c(parcel, paramsb);
    i1(6, parcel);
  }
  
  public final void showInterstitial() {
    i1(4, a2());
  }
  
  public final void showVideo() {
    i1(12, a2());
  }
  
  public final void u1(a parama, zzvs paramzzvs, zzvl paramzzvl, String paramString, sb paramsb) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    tb2.d(parcel, (Parcelable)paramzzvs);
    tb2.d(parcel, (Parcelable)paramzzvl);
    parcel.writeString(paramString);
    tb2.c(parcel, paramsb);
    i1(1, parcel);
  }
  
  public final zzapy v0() {
    Parcel parcel = Y0(34, a2());
    zzapy zzapy = tb2.<zzapy>b(parcel, zzapy.CREATOR);
    parcel.recycle();
    return zzapy;
  }
  
  public final ac z5() {
    IInterface iInterface;
    Parcel parcel = Y0(16, a2());
    IBinder iBinder = parcel.readStrongBinder();
    if (iBinder == null) {
      iInterface = null;
    } else {
      iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      if (iInterface instanceof ac) {
        iInterface = iInterface;
      } else {
        iInterface = new cc(iBinder);
      } 
    } 
    parcel.recycle();
    return (ac)iInterface;
  }
  
  public final void z7(a parama, zzvl paramzzvl, String paramString, sb paramsb) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    tb2.d(parcel, (Parcelable)paramzzvl);
    parcel.writeString(paramString);
    tb2.c(parcel, paramsb);
    i1(32, parcel);
  }
  
  public final void z9(a parama, zzvl paramzzvl, String paramString, sb paramsb) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    tb2.d(parcel, (Parcelable)paramzzvl);
    parcel.writeString(paramString);
    tb2.c(parcel, paramsb);
    i1(3, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */