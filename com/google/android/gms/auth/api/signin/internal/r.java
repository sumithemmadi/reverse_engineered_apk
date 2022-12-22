package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.internal.auth_api.c;

public abstract class r extends c implements o {
  public r() {
    super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
  }
  
  protected final boolean Y0(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2)
        return false; 
      s0();
    } else {
      g0();
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */