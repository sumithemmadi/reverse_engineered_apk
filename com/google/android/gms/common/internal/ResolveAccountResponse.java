package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public class ResolveAccountResponse extends AbstractSafeParcelable {
  public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new i0();
  
  private final int b;
  
  private IBinder c;
  
  private ConnectionResult d;
  
  private boolean e;
  
  private boolean f;
  
  ResolveAccountResponse(int paramInt, IBinder paramIBinder, ConnectionResult paramConnectionResult, boolean paramBoolean1, boolean paramBoolean2) {
    this.b = paramInt;
    this.c = paramIBinder;
    this.d = paramConnectionResult;
    this.e = paramBoolean1;
    this.f = paramBoolean2;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof ResolveAccountResponse))
      return false; 
    paramObject = paramObject;
    return (this.d.equals(((ResolveAccountResponse)paramObject).d) && o0().equals(paramObject.o0()));
  }
  
  public l o0() {
    return l.a.i1(this.c);
  }
  
  public ConnectionResult p0() {
    return this.d;
  }
  
  public boolean q0() {
    return this.e;
  }
  
  public boolean r0() {
    return this.f;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.j(paramParcel, 2, this.c, false);
    a.q(paramParcel, 3, (Parcelable)p0(), paramInt, false);
    a.c(paramParcel, 4, q0());
    a.c(paramParcel, 5, r0());
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/ResolveAccountResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */