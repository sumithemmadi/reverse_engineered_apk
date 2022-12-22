package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zal extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zal> CREATOR = new b();
  
  private final int b;
  
  final String c;
  
  final FastJsonResponse.Field<?, ?> d;
  
  zal(int paramInt, String paramString, FastJsonResponse.Field<?, ?> paramField) {
    this.b = paramInt;
    this.c = paramString;
    this.d = paramField;
  }
  
  zal(String paramString, FastJsonResponse.Field<?, ?> paramField) {
    this.b = 1;
    this.c = paramString;
    this.d = paramField;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.r(paramParcel, 2, this.c, false);
    a.q(paramParcel, 3, (Parcelable)this.d, paramInt, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/server/response/zal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */