package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.a;

public abstract class x0 extends a implements y0 {
  public static y0 i1(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
    return (iInterface instanceof y0) ? (y0)iInterface : new z0(paramIBinder);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/x0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */