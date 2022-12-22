package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;
import java.util.List;

public final class zzvl extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzvl> CREATOR = new iq2();
  
  public final int b;
  
  @Deprecated
  public final long c;
  
  public final Bundle d;
  
  @Deprecated
  public final int e;
  
  public final List<String> f;
  
  public final boolean g;
  
  public final int h;
  
  public final boolean i;
  
  public final String j;
  
  public final zzaaq k;
  
  public final Location l;
  
  public final String m;
  
  public final Bundle n;
  
  public final Bundle o;
  
  public final List<String> p;
  
  public final String q;
  
  public final String r;
  
  @Deprecated
  public final boolean s;
  
  public final zzve t;
  
  public final int u;
  
  public final String v;
  
  public final List<String> w;
  
  public final int x;
  
  public zzvl(int paramInt1, long paramLong, Bundle paramBundle1, int paramInt2, List<String> paramList1, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, String paramString1, zzaaq paramzzaaq, Location paramLocation, String paramString2, Bundle paramBundle2, Bundle paramBundle3, List<String> paramList2, String paramString3, String paramString4, boolean paramBoolean3, zzve paramzzve, int paramInt4, String paramString5, List<String> paramList3, int paramInt5) {
    List<String> list;
    this.b = paramInt1;
    this.c = paramLong;
    if (paramBundle1 == null)
      paramBundle1 = new Bundle(); 
    this.d = paramBundle1;
    this.e = paramInt2;
    this.f = paramList1;
    this.g = paramBoolean1;
    this.h = paramInt3;
    this.i = paramBoolean2;
    this.j = paramString1;
    this.k = paramzzaaq;
    this.l = paramLocation;
    this.m = paramString2;
    if (paramBundle2 == null) {
      paramBundle1 = new Bundle();
    } else {
      paramBundle1 = paramBundle2;
    } 
    this.n = paramBundle1;
    this.o = paramBundle3;
    this.p = paramList2;
    this.q = paramString3;
    this.r = paramString4;
    this.s = paramBoolean3;
    this.t = paramzzve;
    this.u = paramInt4;
    this.v = paramString5;
    if (paramList3 == null) {
      list = new ArrayList();
    } else {
      list = paramList3;
    } 
    this.w = list;
    this.x = paramInt5;
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof zzvl))
      return false; 
    paramObject = paramObject;
    return (this.b == ((zzvl)paramObject).b && this.c == ((zzvl)paramObject).c && r.a(this.d, ((zzvl)paramObject).d) && this.e == ((zzvl)paramObject).e && r.a(this.f, ((zzvl)paramObject).f) && this.g == ((zzvl)paramObject).g && this.h == ((zzvl)paramObject).h && this.i == ((zzvl)paramObject).i && r.a(this.j, ((zzvl)paramObject).j) && r.a(this.k, ((zzvl)paramObject).k) && r.a(this.l, ((zzvl)paramObject).l) && r.a(this.m, ((zzvl)paramObject).m) && r.a(this.n, ((zzvl)paramObject).n) && r.a(this.o, ((zzvl)paramObject).o) && r.a(this.p, ((zzvl)paramObject).p) && r.a(this.q, ((zzvl)paramObject).q) && r.a(this.r, ((zzvl)paramObject).r) && this.s == ((zzvl)paramObject).s && this.u == ((zzvl)paramObject).u && r.a(this.v, ((zzvl)paramObject).v) && r.a(this.w, ((zzvl)paramObject).w) && this.x == ((zzvl)paramObject).x);
  }
  
  public final int hashCode() {
    return r.b(new Object[] { 
          Integer.valueOf(this.b), Long.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Boolean.valueOf(this.g), Integer.valueOf(this.h), Boolean.valueOf(this.i), this.j, this.k, 
          this.l, this.m, this.n, this.o, this.p, this.q, this.r, Boolean.valueOf(this.s), Integer.valueOf(this.u), this.v, 
          this.w, Integer.valueOf(this.x) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.n(paramParcel, 2, this.c);
    a.e(paramParcel, 3, this.d, false);
    a.k(paramParcel, 4, this.e);
    a.t(paramParcel, 5, this.f, false);
    a.c(paramParcel, 6, this.g);
    a.k(paramParcel, 7, this.h);
    a.c(paramParcel, 8, this.i);
    a.r(paramParcel, 9, this.j, false);
    a.q(paramParcel, 10, (Parcelable)this.k, paramInt, false);
    a.q(paramParcel, 11, (Parcelable)this.l, paramInt, false);
    a.r(paramParcel, 12, this.m, false);
    a.e(paramParcel, 13, this.n, false);
    a.e(paramParcel, 14, this.o, false);
    a.t(paramParcel, 15, this.p, false);
    a.r(paramParcel, 16, this.q, false);
    a.r(paramParcel, 17, this.r, false);
    a.c(paramParcel, 18, this.s);
    a.q(paramParcel, 19, (Parcelable)this.t, paramInt, false);
    a.k(paramParcel, 20, this.u);
    a.r(paramParcel, 21, this.v, false);
    a.t(paramParcel, 22, this.w, false);
    a.k(paramParcel, 23, this.x);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzvl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */