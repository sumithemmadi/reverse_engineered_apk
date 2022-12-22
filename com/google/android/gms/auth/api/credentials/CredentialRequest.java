package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;

public final class CredentialRequest extends AbstractSafeParcelable {
  public static final Parcelable.Creator<CredentialRequest> CREATOR = new e();
  
  private final int b;
  
  private final boolean c;
  
  private final String[] d;
  
  private final CredentialPickerConfig e;
  
  private final CredentialPickerConfig f;
  
  private final boolean g;
  
  private final String h;
  
  private final String i;
  
  private final boolean j;
  
  CredentialRequest(int paramInt, boolean paramBoolean1, String[] paramArrayOfString, CredentialPickerConfig paramCredentialPickerConfig1, CredentialPickerConfig paramCredentialPickerConfig2, boolean paramBoolean2, String paramString1, String paramString2, boolean paramBoolean3) {
    this.b = paramInt;
    this.c = paramBoolean1;
    this.d = (String[])t.j(paramArrayOfString);
    CredentialPickerConfig credentialPickerConfig = paramCredentialPickerConfig1;
    if (paramCredentialPickerConfig1 == null)
      credentialPickerConfig = (new CredentialPickerConfig.a()).a(); 
    this.e = credentialPickerConfig;
    credentialPickerConfig = paramCredentialPickerConfig2;
    if (paramCredentialPickerConfig2 == null)
      credentialPickerConfig = (new CredentialPickerConfig.a()).a(); 
    this.f = credentialPickerConfig;
    if (paramInt < 3) {
      this.g = true;
      this.h = null;
      this.i = null;
    } else {
      this.g = paramBoolean2;
      this.h = paramString1;
      this.i = paramString2;
    } 
    this.j = paramBoolean3;
  }
  
  public final String[] o0() {
    return this.d;
  }
  
  public final CredentialPickerConfig p0() {
    return this.f;
  }
  
  public final CredentialPickerConfig q0() {
    return this.e;
  }
  
  public final String r0() {
    return this.i;
  }
  
  public final String s0() {
    return this.h;
  }
  
  public final boolean t0() {
    return this.g;
  }
  
  public final boolean u0() {
    return this.c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.c(paramParcel, 1, u0());
    a.s(paramParcel, 2, o0(), false);
    a.q(paramParcel, 3, (Parcelable)q0(), paramInt, false);
    a.q(paramParcel, 4, (Parcelable)p0(), paramInt, false);
    a.c(paramParcel, 5, t0());
    a.r(paramParcel, 6, s0(), false);
    a.r(paramParcel, 7, r0(), false);
    a.c(paramParcel, 8, this.j);
    a.k(paramParcel, 1000, this.b);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/CredentialRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */