package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.auth_api.d;
import com.google.android.gms.internal.auth_api.e;

public final class v extends d implements s {
  v(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
  }
  
  public final void J6(q paramq, GoogleSignInOptions paramGoogleSignInOptions) {
    Parcel parcel = Y0();
    e.b(parcel, paramq);
    e.c(parcel, (Parcelable)paramGoogleSignInOptions);
    i1(103, parcel);
  }
  
  public final void Q7(q paramq, GoogleSignInOptions paramGoogleSignInOptions) {
    Parcel parcel = Y0();
    e.b(parcel, paramq);
    e.c(parcel, (Parcelable)paramGoogleSignInOptions);
    i1(102, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */