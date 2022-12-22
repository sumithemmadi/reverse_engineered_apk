package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;

public final class zzatq extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzatq> CREATOR = new sg();
  
  public final Bundle b;
  
  public final zzazn c;
  
  private final ApplicationInfo d;
  
  public final String e;
  
  public final List<String> f;
  
  public final PackageInfo g;
  
  public final String h;
  
  public final String i;
  
  public zzdpf j;
  
  public String k;
  
  public zzatq(Bundle paramBundle, zzazn paramzzazn, ApplicationInfo paramApplicationInfo, String paramString1, List<String> paramList, PackageInfo paramPackageInfo, String paramString2, String paramString3, zzdpf paramzzdpf, String paramString4) {
    this.b = paramBundle;
    this.c = paramzzazn;
    this.e = paramString1;
    this.d = paramApplicationInfo;
    this.f = paramList;
    this.g = paramPackageInfo;
    this.h = paramString2;
    this.i = paramString3;
    this.j = paramzzdpf;
    this.k = paramString4;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.e(paramParcel, 1, this.b, false);
    a.q(paramParcel, 2, (Parcelable)this.c, paramInt, false);
    a.q(paramParcel, 3, (Parcelable)this.d, paramInt, false);
    a.r(paramParcel, 4, this.e, false);
    a.t(paramParcel, 5, this.f, false);
    a.q(paramParcel, 6, (Parcelable)this.g, paramInt, false);
    a.r(paramParcel, 7, this.h, false);
    a.r(paramParcel, 9, this.i, false);
    a.q(paramParcel, 10, (Parcelable)this.j, paramInt, false);
    a.r(paramParcel, 11, this.k, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzatq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */