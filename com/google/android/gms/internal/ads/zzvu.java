package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import org.json.JSONObject;

public final class zzvu extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzvu> CREATOR = new nq2();
  
  public final int b;
  
  public final int c;
  
  public final String d;
  
  public final long e;
  
  public zzvu(int paramInt1, int paramInt2, String paramString, long paramLong) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramString;
    this.e = paramLong;
  }
  
  public static zzvu o0(JSONObject paramJSONObject) {
    return new zzvu(paramJSONObject.getInt("type_num"), paramJSONObject.getInt("precision_num"), paramJSONObject.getString("currency"), paramJSONObject.getLong("value"));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.k(paramParcel, 2, this.c);
    a.r(paramParcel, 3, this.d, false);
    a.n(paramParcel, 4, this.e);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzvu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */