package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.l;
import com.google.android.gms.ads.s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzvg extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzvg> CREATOR = new dq2();
  
  public final int b;
  
  public final String c;
  
  public final String d;
  
  public zzvg e;
  
  public IBinder f;
  
  public zzvg(int paramInt, String paramString1, String paramString2, zzvg paramzzvg, IBinder paramIBinder) {
    this.b = paramInt;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramzzvg;
    this.f = paramIBinder;
  }
  
  public final a o0() {
    a a;
    zzvg zzvg1 = this.e;
    if (zzvg1 == null) {
      zzvg1 = null;
    } else {
      a = new a(zzvg1.b, zzvg1.c, zzvg1.d);
    } 
    return new a(this.b, this.c, this.d, a);
  }
  
  public final l p0() {
    a a;
    zzvg zzvg1 = this.e;
    IInterface iInterface = null;
    if (zzvg1 == null) {
      zzvg1 = null;
    } else {
      a = new a(zzvg1.b, zzvg1.c, zzvg1.d);
    } 
    int i = this.b;
    String str1 = this.c;
    String str2 = this.d;
    IBinder iBinder = this.f;
    if (iBinder != null) {
      iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
      if (iInterface instanceof ht2) {
        iInterface = iInterface;
      } else {
        iInterface = new jt2(iBinder);
      } 
    } 
    return new l(i, str1, str2, a, s.c((ht2)iInterface));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.r(paramParcel, 2, this.c, false);
    a.r(paramParcel, 3, this.d, false);
    a.q(paramParcel, 4, (Parcelable)this.e, paramInt, false);
    a.j(paramParcel, 5, this.f, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzvg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */