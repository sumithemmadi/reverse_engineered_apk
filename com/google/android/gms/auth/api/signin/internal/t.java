package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth_api.c;
import com.google.android.gms.internal.auth_api.e;

public abstract class t extends c implements q {
  public t() {
    super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
  }
  
  protected final boolean Y0(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    switch (paramInt1) {
      default:
        return false;
      case 103:
        J2((Status)e.a(paramParcel1, Status.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 102:
        P1((Status)e.a(paramParcel1, Status.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 101:
        break;
    } 
    V3((GoogleSignInAccount)e.a(paramParcel1, GoogleSignInAccount.CREATOR), (Status)e.a(paramParcel1, Status.CREATOR));
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */