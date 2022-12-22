package com.google.android.gms.internal.auth_api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class d implements IInterface {
  private final IBinder b;
  
  private final String c;
  
  protected d(IBinder paramIBinder, String paramString) {
    this.b = paramIBinder;
    this.c = paramString;
  }
  
  protected final Parcel Y0() {
    Parcel parcel = Parcel.obtain();
    parcel.writeInterfaceToken(this.c);
    return parcel;
  }
  
  public IBinder asBinder() {
    return this.b;
  }
  
  protected final void i1(int paramInt, Parcel paramParcel) {
    Parcel parcel = Parcel.obtain();
    try {
      this.b.transact(paramInt, paramParcel, parcel, 0);
      parcel.readException();
      return;
    } finally {
      paramParcel.recycle();
      parcel.recycle();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/auth_api/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */