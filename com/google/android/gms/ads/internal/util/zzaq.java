package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.internal.ads.bj1;
import com.google.android.gms.internal.ads.er1;
import com.google.android.gms.internal.ads.zzvg;

public final class zzaq extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzaq> CREATOR = new r();
  
  public final String b;
  
  public final int c;
  
  zzaq(String paramString, int paramInt) {
    String str = paramString;
    if (paramString == null)
      str = ""; 
    this.b = str;
    this.c = paramInt;
  }
  
  public static zzaq o0(Throwable paramThrowable) {
    String str;
    zzvg zzvg = bj1.d(paramThrowable);
    if (er1.b(paramThrowable.getMessage())) {
      str = zzvg.c;
    } else {
      str = str.getMessage();
    } 
    return new zzaq(str, zzvg.b);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.r(paramParcel, 1, this.b, false);
    a.k(paramParcel, 2, this.c);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/zzaq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */