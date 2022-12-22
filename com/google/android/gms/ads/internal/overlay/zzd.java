package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class zzd extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzd> CREATOR = new a();
  
  private final String b;
  
  public final String c;
  
  public final String d;
  
  public final String e;
  
  public final String f;
  
  public final String g;
  
  private final String h;
  
  public final Intent i;
  
  public final s j;
  
  public final boolean k;
  
  public zzd(Intent paramIntent, s params) {
    this(null, null, null, null, null, null, null, paramIntent, b.a2(params).asBinder(), false);
  }
  
  public zzd(String paramString, s params, boolean paramBoolean) {
    this(null, paramString, null, null, null, null, null, null, b.a2(params).asBinder(), true);
  }
  
  public zzd(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, Intent paramIntent, IBinder paramIBinder, boolean paramBoolean) {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramString5;
    this.g = paramString6;
    this.h = paramString7;
    this.i = paramIntent;
    this.j = (s)b.o1(a.a.i1(paramIBinder));
    this.k = paramBoolean;
  }
  
  public zzd(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, s params) {
    this(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, null, b.a2(params).asBinder(), false);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.r(paramParcel, 2, this.b, false);
    a.r(paramParcel, 3, this.c, false);
    a.r(paramParcel, 4, this.d, false);
    a.r(paramParcel, 5, this.e, false);
    a.r(paramParcel, 6, this.f, false);
    a.r(paramParcel, 7, this.g, false);
    a.r(paramParcel, 8, this.h, false);
    a.q(paramParcel, 9, (Parcelable)this.i, paramInt, false);
    a.j(paramParcel, 10, b.a2(this.j).asBinder(), false);
    a.c(paramParcel, 11, this.k);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */