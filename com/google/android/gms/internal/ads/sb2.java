package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class sb2 implements IInterface {
  private final IBinder b;
  
  private final String c;
  
  protected sb2(IBinder paramIBinder, String paramString) {
    this.b = paramIBinder;
    this.c = paramString;
  }
  
  protected final Parcel Y0(int paramInt, Parcel paramParcel) {
    Parcel parcel = Parcel.obtain();
    try {
      this.b.transact(paramInt, paramParcel, parcel, 0);
      parcel.readException();
      paramParcel.recycle();
      return parcel;
    } catch (RuntimeException runtimeException) {
      parcel.recycle();
      throw runtimeException;
    } finally {}
    paramParcel.recycle();
    throw parcel;
  }
  
  protected final Parcel a2() {
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
  
  protected final void o1(int paramInt, Parcel paramParcel) {
    try {
      this.b.transact(2, paramParcel, null, 1);
      return;
    } finally {
      paramParcel.recycle();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */