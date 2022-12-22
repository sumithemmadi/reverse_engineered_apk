package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.y.b;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import org.json.JSONArray;

public final class zzavj extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzavj> CREATOR = new ii();
  
  public final String b;
  
  public final int c;
  
  public zzavj(b paramb) {
    this(paramb.l(), paramb.P());
  }
  
  public zzavj(String paramString, int paramInt) {
    this.b = paramString;
    this.c = paramInt;
  }
  
  public static zzavj o0(JSONArray paramJSONArray) {
    return (paramJSONArray == null || paramJSONArray.length() == 0) ? null : new zzavj(paramJSONArray.getJSONObject(0).optString("rb_type"), paramJSONArray.getJSONObject(0).optInt("rb_amount"));
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject != null && paramObject instanceof zzavj) {
      paramObject = paramObject;
      if (r.a(this.b, ((zzavj)paramObject).b) && r.a(Integer.valueOf(this.c), Integer.valueOf(((zzavj)paramObject).c)))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return r.b(new Object[] { this.b, Integer.valueOf(this.c) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.r(paramParcel, 2, this.b, false);
    a.k(paramParcel, 3, this.c);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzavj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */