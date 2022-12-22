package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.g0;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.b6;
import com.google.android.gms.internal.ads.bq2;
import com.google.android.gms.internal.ads.jo0;
import com.google.android.gms.internal.ads.pm1;
import com.google.android.gms.internal.ads.pu0;
import com.google.android.gms.internal.ads.tq;
import com.google.android.gms.internal.ads.z5;
import com.google.android.gms.internal.ads.zzazn;

public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
  public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new o();
  
  public final zzd b;
  
  public final bq2 c;
  
  public final p d;
  
  public final tq e;
  
  public final b6 f;
  
  public final String g;
  
  public final boolean h;
  
  public final String i;
  
  public final u j;
  
  public final int k;
  
  public final int l;
  
  public final String m;
  
  public final zzazn n;
  
  public final String o;
  
  public final zzk p;
  
  public final z5 q;
  
  public final String r;
  
  public final pu0 s;
  
  public final jo0 t;
  
  public final pm1 u;
  
  public final g0 v;
  
  public final String w;
  
  AdOverlayInfoParcel(zzd paramzzd, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, IBinder paramIBinder4, String paramString1, boolean paramBoolean, String paramString2, IBinder paramIBinder5, int paramInt1, int paramInt2, String paramString3, zzazn paramzzazn, String paramString4, zzk paramzzk, IBinder paramIBinder6, String paramString5, IBinder paramIBinder7, IBinder paramIBinder8, IBinder paramIBinder9, IBinder paramIBinder10, String paramString6) {
    this.b = paramzzd;
    this.c = (bq2)b.o1(a.a.i1(paramIBinder1));
    this.d = (p)b.o1(a.a.i1(paramIBinder2));
    this.e = (tq)b.o1(a.a.i1(paramIBinder3));
    this.q = (z5)b.o1(a.a.i1(paramIBinder6));
    this.f = (b6)b.o1(a.a.i1(paramIBinder4));
    this.g = paramString1;
    this.h = paramBoolean;
    this.i = paramString2;
    this.j = (u)b.o1(a.a.i1(paramIBinder5));
    this.k = paramInt1;
    this.l = paramInt2;
    this.m = paramString3;
    this.n = paramzzazn;
    this.o = paramString4;
    this.p = paramzzk;
    this.r = paramString5;
    this.w = paramString6;
    this.s = (pu0)b.o1(a.a.i1(paramIBinder7));
    this.t = (jo0)b.o1(a.a.i1(paramIBinder8));
    this.u = (pm1)b.o1(a.a.i1(paramIBinder9));
    this.v = (g0)b.o1(a.a.i1(paramIBinder10));
  }
  
  public AdOverlayInfoParcel(zzd paramzzd, bq2 parambq2, p paramp, u paramu, zzazn paramzzazn, tq paramtq) {
    this.b = paramzzd;
    this.c = parambq2;
    this.d = paramp;
    this.e = paramtq;
    this.q = null;
    this.f = null;
    this.g = null;
    this.h = false;
    this.i = null;
    this.j = paramu;
    this.k = -1;
    this.l = 4;
    this.m = null;
    this.n = paramzzazn;
    this.o = null;
    this.p = null;
    this.r = null;
    this.w = null;
    this.s = null;
    this.t = null;
    this.u = null;
    this.v = null;
  }
  
  public AdOverlayInfoParcel(bq2 parambq2, p paramp, u paramu, tq paramtq, int paramInt, zzazn paramzzazn, String paramString1, zzk paramzzk, String paramString2, String paramString3) {
    this.b = null;
    this.c = null;
    this.d = paramp;
    this.e = paramtq;
    this.q = null;
    this.f = null;
    this.g = paramString2;
    this.h = false;
    this.i = paramString3;
    this.j = null;
    this.k = paramInt;
    this.l = 1;
    this.m = null;
    this.n = paramzzazn;
    this.o = paramString1;
    this.p = paramzzk;
    this.r = null;
    this.w = null;
    this.s = null;
    this.t = null;
    this.u = null;
    this.v = null;
  }
  
  public AdOverlayInfoParcel(bq2 parambq2, p paramp, u paramu, tq paramtq, boolean paramBoolean, int paramInt, zzazn paramzzazn) {
    this.b = null;
    this.c = parambq2;
    this.d = paramp;
    this.e = paramtq;
    this.q = null;
    this.f = null;
    this.g = null;
    this.h = paramBoolean;
    this.i = null;
    this.j = paramu;
    this.k = paramInt;
    this.l = 2;
    this.m = null;
    this.n = paramzzazn;
    this.o = null;
    this.p = null;
    this.r = null;
    this.w = null;
    this.s = null;
    this.t = null;
    this.u = null;
    this.v = null;
  }
  
  public AdOverlayInfoParcel(bq2 parambq2, p paramp, z5 paramz5, b6 paramb6, u paramu, tq paramtq, boolean paramBoolean, int paramInt, String paramString, zzazn paramzzazn) {
    this.b = null;
    this.c = parambq2;
    this.d = paramp;
    this.e = paramtq;
    this.q = paramz5;
    this.f = paramb6;
    this.g = null;
    this.h = paramBoolean;
    this.i = null;
    this.j = paramu;
    this.k = paramInt;
    this.l = 3;
    this.m = paramString;
    this.n = paramzzazn;
    this.o = null;
    this.p = null;
    this.r = null;
    this.w = null;
    this.s = null;
    this.t = null;
    this.u = null;
    this.v = null;
  }
  
  public AdOverlayInfoParcel(bq2 parambq2, p paramp, z5 paramz5, b6 paramb6, u paramu, tq paramtq, boolean paramBoolean, int paramInt, String paramString1, String paramString2, zzazn paramzzazn) {
    this.b = null;
    this.c = parambq2;
    this.d = paramp;
    this.e = paramtq;
    this.q = paramz5;
    this.f = paramb6;
    this.g = paramString2;
    this.h = paramBoolean;
    this.i = paramString1;
    this.j = paramu;
    this.k = paramInt;
    this.l = 3;
    this.m = null;
    this.n = paramzzazn;
    this.o = null;
    this.p = null;
    this.r = null;
    this.w = null;
    this.s = null;
    this.t = null;
    this.u = null;
    this.v = null;
  }
  
  public AdOverlayInfoParcel(tq paramtq, zzazn paramzzazn, g0 paramg0, pu0 parampu0, jo0 paramjo0, pm1 parampm1, String paramString1, String paramString2, int paramInt) {
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = paramtq;
    this.q = null;
    this.f = null;
    this.g = null;
    this.h = false;
    this.i = null;
    this.j = null;
    this.k = paramInt;
    this.l = 5;
    this.m = null;
    this.n = paramzzazn;
    this.o = null;
    this.p = null;
    this.r = paramString1;
    this.w = paramString2;
    this.s = parampu0;
    this.t = paramjo0;
    this.u = parampm1;
    this.v = paramg0;
  }
  
  public static void o0(Intent paramIntent, AdOverlayInfoParcel paramAdOverlayInfoParcel) {
    Bundle bundle = new Bundle(1);
    bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", (Parcelable)paramAdOverlayInfoParcel);
    paramIntent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
  }
  
  public static AdOverlayInfoParcel p0(Intent paramIntent) {
    try {
      Bundle bundle = paramIntent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
      bundle.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
      return (AdOverlayInfoParcel)bundle.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.q(paramParcel, 2, (Parcelable)this.b, paramInt, false);
    a.j(paramParcel, 3, b.a2(this.c).asBinder(), false);
    a.j(paramParcel, 4, b.a2(this.d).asBinder(), false);
    a.j(paramParcel, 5, b.a2(this.e).asBinder(), false);
    a.j(paramParcel, 6, b.a2(this.f).asBinder(), false);
    a.r(paramParcel, 7, this.g, false);
    a.c(paramParcel, 8, this.h);
    a.r(paramParcel, 9, this.i, false);
    a.j(paramParcel, 10, b.a2(this.j).asBinder(), false);
    a.k(paramParcel, 11, this.k);
    a.k(paramParcel, 12, this.l);
    a.r(paramParcel, 13, this.m, false);
    a.q(paramParcel, 14, (Parcelable)this.n, paramInt, false);
    a.r(paramParcel, 16, this.o, false);
    a.q(paramParcel, 17, (Parcelable)this.p, paramInt, false);
    a.j(paramParcel, 18, b.a2(this.q).asBinder(), false);
    a.r(paramParcel, 19, this.r, false);
    a.j(paramParcel, 20, b.a2(this.s).asBinder(), false);
    a.j(paramParcel, 21, b.a2(this.t).asBinder(), false);
    a.j(paramParcel, 22, b.a2(this.u).asBinder(), false);
    a.j(paramParcel, 23, b.a2(this.v).asBinder(), false);
    a.r(paramParcel, 24, this.w, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */