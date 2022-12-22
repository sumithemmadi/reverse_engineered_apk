package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {
  private final IBinder b;
  
  private final String c;
  
  protected a(IBinder paramIBinder, String paramString) {
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
  
  protected final Parcel i1(int paramInt, Parcel paramParcel) {
    Exception exception;
    Parcel parcel = Parcel.obtain();
    try {
      this.b.transact(paramInt, paramParcel, parcel, 0);
      parcel.readException();
      paramParcel.recycle();
      return parcel;
    } catch (RuntimeException null) {
      parcel.recycle();
      throw exception;
    } finally {}
    paramParcel.recycle();
    throw exception;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/auth/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */