package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

final class o implements p {
  private final IBinder b;
  
  o(IBinder paramIBinder) {
    this.b = paramIBinder;
  }
  
  public final void N2(n paramn, GetServiceRequest paramGetServiceRequest) {
    Parcel parcel1 = Parcel.obtain();
    Parcel parcel2 = Parcel.obtain();
    try {
      parcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramn != null) {
        IBinder iBinder = paramn.asBinder();
      } else {
        paramn = null;
      } 
      parcel1.writeStrongBinder((IBinder)paramn);
      if (paramGetServiceRequest != null) {
        parcel1.writeInt(1);
        paramGetServiceRequest.writeToParcel(parcel1, 0);
      } else {
        parcel1.writeInt(0);
      } 
      this.b.transact(46, parcel1, parcel2, 0);
      parcel2.readException();
      return;
    } finally {
      parcel2.recycle();
      parcel1.recycle();
    } 
  }
  
  public final IBinder asBinder() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */