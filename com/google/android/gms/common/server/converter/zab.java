package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.server.response.FastJsonResponse;

public final class zab extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zab> CREATOR = new a();
  
  private final int b;
  
  private final StringToIntConverter c;
  
  zab(int paramInt, StringToIntConverter paramStringToIntConverter) {
    this.b = paramInt;
    this.c = paramStringToIntConverter;
  }
  
  private zab(StringToIntConverter paramStringToIntConverter) {
    this.b = 1;
    this.c = paramStringToIntConverter;
  }
  
  public static zab o0(FastJsonResponse.a<?, ?> parama) {
    if (parama instanceof StringToIntConverter)
      return new zab((StringToIntConverter)parama); 
    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
  }
  
  public final FastJsonResponse.a<?, ?> p0() {
    StringToIntConverter stringToIntConverter = this.c;
    if (stringToIntConverter != null)
      return stringToIntConverter; 
    throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.q(paramParcel, 2, (Parcelable)this.c, paramInt, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/server/converter/zab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */