package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
  public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new a();
  
  private final int b;
  
  private final String c;
  
  private final int d;
  
  public FavaDiagnosticsEntity(int paramInt1, String paramString, int paramInt2) {
    this.b = paramInt1;
    this.c = paramString;
    this.d = paramInt2;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.r(paramParcel, 2, this.c, false);
    a.k(paramParcel, 3, this.d);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/server/FavaDiagnosticsEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */