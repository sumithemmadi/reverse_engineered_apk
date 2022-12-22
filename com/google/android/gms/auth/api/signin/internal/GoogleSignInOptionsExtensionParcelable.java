package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
  public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new c();
  
  private final int b;
  
  private int c;
  
  private Bundle d;
  
  GoogleSignInOptionsExtensionParcelable(int paramInt1, int paramInt2, Bundle paramBundle) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramBundle;
  }
  
  public int o0() {
    return this.c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.k(paramParcel, 2, o0());
    a.e(paramParcel, 3, this.d, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/GoogleSignInOptionsExtensionParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */