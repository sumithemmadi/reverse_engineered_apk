package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.common.a;
import com.google.android.gms.internal.common.c;

public abstract class w0 extends a implements u0 {
  public w0() {
    super("com.google.android.gms.common.internal.ICertData");
  }
  
  public static u0 i1(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
    return (iInterface instanceof u0) ? (u0)iInterface : new v0(paramIBinder);
  }
  
  protected final boolean Y0(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2)
        return false; 
      paramInt1 = c();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
    } else {
      a a1 = b();
      paramParcel2.writeNoException();
      c.b(paramParcel2, (IInterface)a1);
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/w0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */