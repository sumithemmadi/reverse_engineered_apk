package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzava extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzava> CREATOR = new di();
  
  public final zzvl b;
  
  public final String c;
  
  public zzava(zzvl paramzzvl, String paramString) {
    this.b = paramzzvl;
    this.c = paramString;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.q(paramParcel, 2, (Parcelable)this.b, paramInt, false);
    a.r(paramParcel, 3, this.c, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzava.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */