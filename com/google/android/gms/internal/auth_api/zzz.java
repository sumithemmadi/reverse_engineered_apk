package com.google.android.gms.internal.auth_api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzz extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzz> CREATOR = new k();
  
  private final Credential b;
  
  public zzz(Credential paramCredential) {
    this.b = paramCredential;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.q(paramParcel, 1, (Parcelable)this.b, paramInt, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/auth_api/zzz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */