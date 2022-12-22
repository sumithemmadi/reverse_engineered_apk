package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;

public abstract class m extends j implements l {
  public static l Y0(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
    return (iInterface instanceof l) ? (l)iInterface : new n(paramIBinder);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/auth/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */