package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzdpf extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzdpf> CREATOR = new yj1();
  
  private final zzdpi[] b;
  
  private final int[] c;
  
  private final int[] d;
  
  public final Context e;
  
  private final int f;
  
  public final zzdpi g;
  
  public final int h;
  
  public final int i;
  
  public final int j;
  
  public final String k;
  
  private final int l;
  
  public final int m;
  
  private final int n;
  
  private final int o;
  
  public zzdpf(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, int paramInt5, int paramInt6) {
    zzdpi[] arrayOfZzdpi = zzdpi.values();
    this.b = arrayOfZzdpi;
    int[] arrayOfInt1 = xj1.a();
    this.c = arrayOfInt1;
    int[] arrayOfInt2 = zj1.a();
    this.d = arrayOfInt2;
    this.e = null;
    this.f = paramInt1;
    this.g = arrayOfZzdpi[paramInt1];
    this.h = paramInt2;
    this.i = paramInt3;
    this.j = paramInt4;
    this.k = paramString;
    this.l = paramInt5;
    this.m = arrayOfInt1[paramInt5];
    this.n = paramInt6;
    this.o = arrayOfInt2[paramInt6];
  }
  
  private zzdpf(Context paramContext, zzdpi paramzzdpi, int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3) {
    this.b = zzdpi.values();
    this.c = xj1.a();
    this.d = zj1.a();
    this.e = paramContext;
    this.f = paramzzdpi.ordinal();
    this.g = paramzzdpi;
    this.h = paramInt1;
    this.i = paramInt2;
    this.j = paramInt3;
    this.k = paramString1;
    if ("oldest".equals(paramString2)) {
      paramInt1 = xj1.a;
    } else if (!"lru".equals(paramString2) && "lfu".equals(paramString2)) {
      paramInt1 = xj1.c;
    } else {
      paramInt1 = xj1.b;
    } 
    this.m = paramInt1;
    this.l = paramInt1 - 1;
    "onAdClosed".equals(paramString3);
    paramInt1 = zj1.a;
    this.o = paramInt1;
    this.n = paramInt1 - 1;
  }
  
  public static zzdpf o0(zzdpi paramzzdpi, Context paramContext) {
    if (paramzzdpi == zzdpi.b) {
      x<Integer> x = m0.V4;
      int i = ((Integer)er2.e().<Integer>c(x)).intValue();
      x = m0.b5;
      int j = ((Integer)er2.e().<Integer>c(x)).intValue();
      x = m0.d5;
      int k = ((Integer)er2.e().<Integer>c(x)).intValue();
      x<String> x1 = m0.f5;
      String str1 = er2.e().<String>c(x1);
      x<String> x2 = m0.X4;
      String str2 = er2.e().<String>c(x2);
      x2 = m0.Z4;
      return new zzdpf(paramContext, paramzzdpi, i, j, k, str1, str2, er2.e().<String>c(x2));
    } 
    if (paramzzdpi == zzdpi.c) {
      x<Integer> x = m0.W4;
      int i = ((Integer)er2.e().<Integer>c(x)).intValue();
      x = m0.c5;
      int j = ((Integer)er2.e().<Integer>c(x)).intValue();
      x = m0.e5;
      int k = ((Integer)er2.e().<Integer>c(x)).intValue();
      x<String> x1 = m0.g5;
      String str1 = er2.e().<String>c(x1);
      x<String> x2 = m0.Y4;
      String str2 = er2.e().<String>c(x2);
      x<String> x3 = m0.a5;
      return new zzdpf(paramContext, paramzzdpi, i, j, k, str1, str2, er2.e().<String>c(x3));
    } 
    if (paramzzdpi == zzdpi.d) {
      x<Integer> x = m0.j5;
      int k = ((Integer)er2.e().<Integer>c(x)).intValue();
      x = m0.l5;
      int j = ((Integer)er2.e().<Integer>c(x)).intValue();
      x = m0.m5;
      int i = ((Integer)er2.e().<Integer>c(x)).intValue();
      x<String> x1 = m0.h5;
      String str1 = er2.e().<String>c(x1);
      x<String> x2 = m0.i5;
      String str2 = er2.e().<String>c(x2);
      x2 = m0.k5;
      return new zzdpf(paramContext, paramzzdpi, k, j, i, str1, str2, er2.e().<String>c(x2));
    } 
    return null;
  }
  
  public static boolean p0() {
    x<Boolean> x = m0.U4;
    return ((Boolean)er2.e().<Boolean>c(x)).booleanValue();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.f);
    a.k(paramParcel, 2, this.h);
    a.k(paramParcel, 3, this.i);
    a.k(paramParcel, 4, this.j);
    a.r(paramParcel, 5, this.k, false);
    a.k(paramParcel, 6, this.l);
    a.k(paramParcel, 7, this.n);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdpf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */