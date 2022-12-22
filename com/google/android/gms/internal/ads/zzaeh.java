package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.nativead.b;
import com.google.android.gms.ads.u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzaeh extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzaeh> CREATOR = new d3();
  
  public final int b;
  
  public final boolean c;
  
  public final int d;
  
  public final boolean e;
  
  public final int f;
  
  public final zzaau g;
  
  public final boolean h;
  
  public final int i;
  
  public zzaeh(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, int paramInt3, zzaau paramzzaau, boolean paramBoolean3, int paramInt4) {
    this.b = paramInt1;
    this.c = paramBoolean1;
    this.d = paramInt2;
    this.e = paramBoolean2;
    this.f = paramInt3;
    this.g = paramzzaau;
    this.h = paramBoolean3;
    this.i = paramInt4;
  }
  
  public zzaeh(b paramb) {
    this(4, bool1, i, bool2, j, zzaau1, paramb.g(), paramb.c());
  }
  
  public zzaeh(b paramb) {
    this(4, bool1, -1, bool2, i, zzaau1, paramb.f(), paramb.b());
  }
  
  public static b o0(zzaeh paramzzaeh) {
    b.a a = new b.a();
    if (paramzzaeh == null)
      return a.a(); 
    int i = paramzzaeh.b;
    if (i != 2) {
      if (i != 3) {
        if (i != 4) {
          a.f(paramzzaeh.c).e(paramzzaeh.e);
          return a.a();
        } 
        a.d(paramzzaeh.h).c(paramzzaeh.i);
      } 
      zzaau zzaau1 = paramzzaeh.g;
      if (zzaau1 != null)
        a.g(new u(zzaau1)); 
    } 
    a.b(paramzzaeh.f);
    a.f(paramzzaeh.c).e(paramzzaeh.e);
    return a.a();
  }
  
  public static b p0(zzaeh paramzzaeh) {
    b.a a = new b.a();
    if (paramzzaeh == null)
      return a.a(); 
    int i = paramzzaeh.b;
    if (i != 2) {
      if (i != 3) {
        if (i != 4) {
          a.g(paramzzaeh.c).c(paramzzaeh.d).f(paramzzaeh.e);
          return a.a();
        } 
        a.e(paramzzaeh.h).d(paramzzaeh.i);
      } 
      zzaau zzaau1 = paramzzaeh.g;
      if (zzaau1 != null)
        a.h(new u(zzaau1)); 
    } 
    a.b(paramzzaeh.f);
    a.g(paramzzaeh.c).c(paramzzaeh.d).f(paramzzaeh.e);
    return a.a();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.c(paramParcel, 2, this.c);
    a.k(paramParcel, 3, this.d);
    a.c(paramParcel, 4, this.e);
    a.k(paramParcel, 5, this.f);
    a.q(paramParcel, 6, (Parcelable)this.g, paramInt, false);
    a.c(paramParcel, 7, this.h);
    a.k(paramParcel, 8, this.i);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzaeh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */