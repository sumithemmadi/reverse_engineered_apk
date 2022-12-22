package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzatb extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzatb> CREATOR = new fg();
  
  private final List<String> A;
  
  private final long B;
  
  private final String C;
  
  private final float D;
  
  private final int E;
  
  private final int F;
  
  private final boolean G;
  
  private final String H;
  
  private final boolean I;
  
  private final String J;
  
  private final boolean K;
  
  private final int L;
  
  private final Bundle M;
  
  private final String N;
  
  private final zzzi O;
  
  private final boolean P;
  
  private final Bundle Q;
  
  private final String R;
  
  private final String S;
  
  private final String T;
  
  private final boolean U;
  
  private final List<Integer> V;
  
  private final String W;
  
  private final List<String> X;
  
  private final int Y;
  
  private final boolean Z;
  
  private final boolean a0;
  
  private final int b;
  
  private final boolean b0;
  
  private final Bundle c;
  
  private final ArrayList<String> c0;
  
  private final zzvl d;
  
  private final String d0;
  
  private final zzvs e;
  
  private final zzajt e0;
  
  private final String f;
  
  private final String f0;
  
  private final ApplicationInfo g;
  
  private final Bundle g0;
  
  private final PackageInfo h;
  
  private final String i;
  
  private final String j;
  
  private final String k;
  
  private final zzazn l;
  
  private final Bundle m;
  
  private final int n;
  
  private final List<String> o;
  
  private final Bundle p;
  
  private final boolean q;
  
  private final int r;
  
  private final int s;
  
  private final float t;
  
  private final String u;
  
  private final long v;
  
  private final String w;
  
  private final List<String> x;
  
  private final String y;
  
  private final zzaeh z;
  
  zzatb(int paramInt1, Bundle paramBundle1, zzvl paramzzvl, zzvs paramzzvs, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, String paramString4, zzazn paramzzazn, Bundle paramBundle2, int paramInt2, List<String> paramList1, Bundle paramBundle3, boolean paramBoolean1, int paramInt3, int paramInt4, float paramFloat1, String paramString5, long paramLong1, String paramString6, List<String> paramList2, String paramString7, zzaeh paramzzaeh, List<String> paramList3, long paramLong2, String paramString8, float paramFloat2, boolean paramBoolean2, int paramInt5, int paramInt6, boolean paramBoolean3, String paramString9, String paramString10, boolean paramBoolean4, int paramInt7, Bundle paramBundle4, String paramString11, zzzi paramzzzi, boolean paramBoolean5, Bundle paramBundle5, String paramString12, String paramString13, String paramString14, boolean paramBoolean6, List<Integer> paramList, String paramString15, List<String> paramList4, int paramInt8, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9, ArrayList<String> paramArrayList, String paramString16, zzajt paramzzajt, String paramString17, Bundle paramBundle6) {
    List<String> list;
    this.b = paramInt1;
    this.c = paramBundle1;
    this.d = paramzzvl;
    this.e = paramzzvs;
    this.f = paramString1;
    this.g = paramApplicationInfo;
    this.h = paramPackageInfo;
    this.i = paramString2;
    this.j = paramString3;
    this.k = paramString4;
    this.l = paramzzazn;
    this.m = paramBundle2;
    this.n = paramInt2;
    this.o = paramList1;
    if (paramList3 == null) {
      list = Collections.emptyList();
    } else {
      list = Collections.unmodifiableList(paramList3);
    } 
    this.A = list;
    this.p = paramBundle3;
    this.q = paramBoolean1;
    this.r = paramInt3;
    this.s = paramInt4;
    this.t = paramFloat1;
    this.u = paramString5;
    this.v = paramLong1;
    this.w = paramString6;
    if (paramList2 == null) {
      list = Collections.emptyList();
    } else {
      list = Collections.unmodifiableList(paramList2);
    } 
    this.x = list;
    this.y = paramString7;
    this.z = paramzzaeh;
    this.B = paramLong2;
    this.C = paramString8;
    this.D = paramFloat2;
    this.I = paramBoolean2;
    this.E = paramInt5;
    this.F = paramInt6;
    this.G = paramBoolean3;
    this.H = paramString9;
    this.J = paramString10;
    this.K = paramBoolean4;
    this.L = paramInt7;
    this.M = paramBundle4;
    this.N = paramString11;
    this.O = paramzzzi;
    this.P = paramBoolean5;
    this.Q = paramBundle5;
    this.R = paramString12;
    this.S = paramString13;
    this.T = paramString14;
    this.U = paramBoolean6;
    this.V = paramList;
    this.W = paramString15;
    this.X = paramList4;
    this.Y = paramInt8;
    this.Z = paramBoolean7;
    this.a0 = paramBoolean8;
    this.b0 = paramBoolean9;
    this.c0 = paramArrayList;
    this.d0 = paramString16;
    this.e0 = paramzzajt;
    this.f0 = paramString17;
    this.g0 = paramBundle6;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.e(paramParcel, 2, this.c, false);
    a.q(paramParcel, 3, (Parcelable)this.d, paramInt, false);
    a.q(paramParcel, 4, (Parcelable)this.e, paramInt, false);
    a.r(paramParcel, 5, this.f, false);
    a.q(paramParcel, 6, (Parcelable)this.g, paramInt, false);
    a.q(paramParcel, 7, (Parcelable)this.h, paramInt, false);
    a.r(paramParcel, 8, this.i, false);
    a.r(paramParcel, 9, this.j, false);
    a.r(paramParcel, 10, this.k, false);
    a.q(paramParcel, 11, (Parcelable)this.l, paramInt, false);
    a.e(paramParcel, 12, this.m, false);
    a.k(paramParcel, 13, this.n);
    a.t(paramParcel, 14, this.o, false);
    a.e(paramParcel, 15, this.p, false);
    a.c(paramParcel, 16, this.q);
    a.k(paramParcel, 18, this.r);
    a.k(paramParcel, 19, this.s);
    a.h(paramParcel, 20, this.t);
    a.r(paramParcel, 21, this.u, false);
    a.n(paramParcel, 25, this.v);
    a.r(paramParcel, 26, this.w, false);
    a.t(paramParcel, 27, this.x, false);
    a.r(paramParcel, 28, this.y, false);
    a.q(paramParcel, 29, (Parcelable)this.z, paramInt, false);
    a.t(paramParcel, 30, this.A, false);
    a.n(paramParcel, 31, this.B);
    a.r(paramParcel, 33, this.C, false);
    a.h(paramParcel, 34, this.D);
    a.k(paramParcel, 35, this.E);
    a.k(paramParcel, 36, this.F);
    a.c(paramParcel, 37, this.G);
    a.r(paramParcel, 39, this.H, false);
    a.c(paramParcel, 40, this.I);
    a.r(paramParcel, 41, this.J, false);
    a.c(paramParcel, 42, this.K);
    a.k(paramParcel, 43, this.L);
    a.e(paramParcel, 44, this.M, false);
    a.r(paramParcel, 45, this.N, false);
    a.q(paramParcel, 46, (Parcelable)this.O, paramInt, false);
    a.c(paramParcel, 47, this.P);
    a.e(paramParcel, 48, this.Q, false);
    a.r(paramParcel, 49, this.R, false);
    a.r(paramParcel, 50, this.S, false);
    a.r(paramParcel, 51, this.T, false);
    a.c(paramParcel, 52, this.U);
    a.l(paramParcel, 53, this.V, false);
    a.r(paramParcel, 54, this.W, false);
    a.t(paramParcel, 55, this.X, false);
    a.k(paramParcel, 56, this.Y);
    a.c(paramParcel, 57, this.Z);
    a.c(paramParcel, 58, this.a0);
    a.c(paramParcel, 59, this.b0);
    a.t(paramParcel, 60, this.c0, false);
    a.r(paramParcel, 61, this.d0, false);
    a.q(paramParcel, 63, (Parcelable)this.e0, paramInt, false);
    a.r(paramParcel, 64, this.f0, false);
    a.e(paramParcel, 65, this.g0, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzatb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */