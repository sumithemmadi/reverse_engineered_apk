package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;

public final class zzab extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzab> CREATOR = new b();
  
  private final int b = 1;
  
  private final String c;
  
  private final int d;
  
  zzab(int paramInt1, String paramString, int paramInt2) {
    this.c = (String)t.j(paramString);
    this.d = paramInt2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.r(paramParcel, 2, this.c, false);
    a.k(paramParcel, 3, this.d);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/auth/zzab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */