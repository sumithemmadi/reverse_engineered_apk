package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public class DeviceMetaData extends AbstractSafeParcelable {
  public static final Parcelable.Creator<DeviceMetaData> CREATOR = new e();
  
  private final int b;
  
  private boolean c;
  
  private long d;
  
  private final boolean e;
  
  DeviceMetaData(int paramInt, boolean paramBoolean1, long paramLong, boolean paramBoolean2) {
    this.b = paramInt;
    this.c = paramBoolean1;
    this.d = paramLong;
    this.e = paramBoolean2;
  }
  
  public long o0() {
    return this.d;
  }
  
  public boolean p0() {
    return this.e;
  }
  
  public boolean q0() {
    return this.c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.c(paramParcel, 2, q0());
    a.n(paramParcel, 3, o0());
    a.c(paramParcel, 4, p0());
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/accounttransfer/DeviceMetaData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */