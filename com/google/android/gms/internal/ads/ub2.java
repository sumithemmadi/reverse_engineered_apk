package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class ub2 extends Binder implements IInterface {
  static {
  
  }
  
  protected ub2(String paramString) {
    attachInterface(this, paramString);
  }
  
  protected boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    throw null;
  }
  
  public IBinder asBinder() {
    return (IBinder)this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    boolean bool;
    if (paramInt1 > 16777215) {
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    } else {
      paramParcel1.enforceInterface(getInterfaceDescriptor());
      bool = false;
    } 
    return bool ? true : R9(paramInt1, paramParcel1, paramParcel2, paramInt2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ub2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */