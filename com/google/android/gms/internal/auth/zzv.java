package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;

public final class zzv extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzv> CREATOR = new o();
  
  private final int b = 1;
  
  private final String c;
  
  zzv(int paramInt, String paramString) {
    this.c = (String)t.j(paramString);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.r(paramParcel, 2, this.c, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/auth/zzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */