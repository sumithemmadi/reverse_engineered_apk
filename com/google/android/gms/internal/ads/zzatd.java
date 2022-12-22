package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Collections;
import java.util.List;

public final class zzatd extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzatd> CREATOR = new gg();
  
  private final String A;
  
  private final boolean B;
  
  private final boolean C;
  
  private final zzavj D;
  
  private final List<String> E;
  
  private final List<String> F;
  
  private final boolean G;
  
  private final zzatf H;
  
  private String I;
  
  private final List<String> J;
  
  private final boolean K;
  
  private final String L;
  
  private final zzawu M;
  
  private final String N;
  
  private final boolean O;
  
  private final boolean P;
  
  private Bundle Q;
  
  private final boolean R;
  
  private final int S;
  
  private final boolean T;
  
  private final List<String> U;
  
  private final boolean V;
  
  private final String W;
  
  private String X;
  
  private boolean Y;
  
  private boolean Z;
  
  private final int b;
  
  private final String c;
  
  private String d;
  
  private final List<String> e;
  
  private final int f;
  
  private final List<String> g;
  
  private final long h;
  
  private final boolean i;
  
  private final long j;
  
  private final List<String> k;
  
  private final long l;
  
  private final int m;
  
  private final String n;
  
  private final long o;
  
  private final String p;
  
  private final boolean q;
  
  private final String r;
  
  private final String s;
  
  private final boolean t;
  
  private final boolean u;
  
  private final boolean v;
  
  private final boolean w;
  
  private final boolean x;
  
  private zzatp y;
  
  private String z;
  
  zzatd(int paramInt1, String paramString1, String paramString2, List<String> paramList1, int paramInt2, List<String> paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List<String> paramList3, long paramLong3, int paramInt3, String paramString3, long paramLong4, String paramString4, boolean paramBoolean2, String paramString5, String paramString6, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, zzatp paramzzatp, String paramString7, String paramString8, boolean paramBoolean8, boolean paramBoolean9, zzavj paramzzavj, List<String> paramList4, List<String> paramList5, boolean paramBoolean10, zzatf paramzzatf, String paramString9, List<String> paramList6, boolean paramBoolean11, String paramString10, zzawu paramzzawu, String paramString11, boolean paramBoolean12, boolean paramBoolean13, Bundle paramBundle, boolean paramBoolean14, int paramInt4, boolean paramBoolean15, List<String> paramList7, boolean paramBoolean16, String paramString12, String paramString13, boolean paramBoolean17, boolean paramBoolean18) {
    List<String> list;
    this.b = paramInt1;
    this.c = paramString1;
    this.d = paramString2;
    paramString2 = null;
    if (paramList1 != null) {
      list = Collections.unmodifiableList(paramList1);
    } else {
      paramString1 = null;
    } 
    this.e = (List<String>)paramString1;
    this.f = paramInt2;
    if (paramList2 != null) {
      list = Collections.unmodifiableList(paramList2);
    } else {
      paramString1 = null;
    } 
    this.g = (List<String>)paramString1;
    this.h = paramLong1;
    this.i = paramBoolean1;
    this.j = paramLong2;
    if (paramList3 != null) {
      list = Collections.unmodifiableList(paramList3);
    } else {
      paramString1 = null;
    } 
    this.k = (List<String>)paramString1;
    this.l = paramLong3;
    this.m = paramInt3;
    this.n = paramString3;
    this.o = paramLong4;
    this.p = paramString4;
    this.q = paramBoolean2;
    this.r = paramString5;
    this.s = paramString6;
    this.t = paramBoolean3;
    this.u = paramBoolean4;
    this.v = paramBoolean5;
    this.w = paramBoolean6;
    this.O = paramBoolean12;
    this.x = paramBoolean7;
    this.y = paramzzatp;
    this.z = paramString7;
    this.A = paramString8;
    if (this.d == null && paramzzatp != null) {
      zzats zzats = paramzzatp.<zzats>o0(zzats.CREATOR);
      if (zzats != null && !TextUtils.isEmpty(zzats.b))
        this.d = zzats.b; 
    } 
    this.B = paramBoolean8;
    this.C = paramBoolean9;
    this.D = paramzzavj;
    this.E = paramList4;
    this.F = paramList5;
    this.G = paramBoolean10;
    this.H = paramzzatf;
    this.I = paramString9;
    this.J = paramList6;
    this.K = paramBoolean11;
    this.L = paramString10;
    this.M = paramzzawu;
    this.N = paramString11;
    this.P = paramBoolean13;
    this.Q = paramBundle;
    this.R = paramBoolean14;
    this.S = paramInt4;
    this.T = paramBoolean15;
    paramString1 = paramString2;
    if (paramList7 != null)
      list = Collections.unmodifiableList(paramList7); 
    this.U = list;
    this.V = paramBoolean16;
    this.W = paramString12;
    this.X = paramString13;
    this.Y = paramBoolean17;
    this.Z = paramBoolean18;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.r(paramParcel, 2, this.c, false);
    a.r(paramParcel, 3, this.d, false);
    a.t(paramParcel, 4, this.e, false);
    a.k(paramParcel, 5, this.f);
    a.t(paramParcel, 6, this.g, false);
    a.n(paramParcel, 7, this.h);
    a.c(paramParcel, 8, this.i);
    a.n(paramParcel, 9, this.j);
    a.t(paramParcel, 10, this.k, false);
    a.n(paramParcel, 11, this.l);
    a.k(paramParcel, 12, this.m);
    a.r(paramParcel, 13, this.n, false);
    a.n(paramParcel, 14, this.o);
    a.r(paramParcel, 15, this.p, false);
    a.c(paramParcel, 18, this.q);
    a.r(paramParcel, 19, this.r, false);
    a.r(paramParcel, 21, this.s, false);
    a.c(paramParcel, 22, this.t);
    a.c(paramParcel, 23, this.u);
    a.c(paramParcel, 24, this.v);
    a.c(paramParcel, 25, this.w);
    a.c(paramParcel, 26, this.x);
    a.q(paramParcel, 28, (Parcelable)this.y, paramInt, false);
    a.r(paramParcel, 29, this.z, false);
    a.r(paramParcel, 30, this.A, false);
    a.c(paramParcel, 31, this.B);
    a.c(paramParcel, 32, this.C);
    a.q(paramParcel, 33, (Parcelable)this.D, paramInt, false);
    a.t(paramParcel, 34, this.E, false);
    a.t(paramParcel, 35, this.F, false);
    a.c(paramParcel, 36, this.G);
    a.q(paramParcel, 37, (Parcelable)this.H, paramInt, false);
    a.r(paramParcel, 39, this.I, false);
    a.t(paramParcel, 40, this.J, false);
    a.c(paramParcel, 42, this.K);
    a.r(paramParcel, 43, this.L, false);
    a.q(paramParcel, 44, (Parcelable)this.M, paramInt, false);
    a.r(paramParcel, 45, this.N, false);
    a.c(paramParcel, 46, this.O);
    a.c(paramParcel, 47, this.P);
    a.e(paramParcel, 48, this.Q, false);
    a.c(paramParcel, 49, this.R);
    a.k(paramParcel, 50, this.S);
    a.c(paramParcel, 51, this.T);
    a.t(paramParcel, 52, this.U, false);
    a.c(paramParcel, 53, this.V);
    a.r(paramParcel, 54, this.W, false);
    a.r(paramParcel, 55, this.X, false);
    a.c(paramParcel, 56, this.Y);
    a.c(paramParcel, 57, this.Z);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzatd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */