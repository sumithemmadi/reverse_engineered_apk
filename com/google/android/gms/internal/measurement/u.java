package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class u extends Binder implements IInterface {
  protected u(String paramString) {
    attachInterface(this, paramString);
  }
  
  protected boolean Y0(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    throw null;
  }
  
  public IBinder asBinder() {
    return (IBinder)this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 > 16777215) {
      if (super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2))
        return true; 
    } else {
      paramParcel1.enforceInterface(getInterfaceDescriptor());
    } 
    return Y0(paramInt1, paramParcel1, paramParcel2, paramInt2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/measurement/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */