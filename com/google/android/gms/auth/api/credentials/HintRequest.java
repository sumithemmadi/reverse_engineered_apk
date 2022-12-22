package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;

public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
  public static final Parcelable.Creator<HintRequest> CREATOR = new f();
  
  private final int b;
  
  private final CredentialPickerConfig c;
  
  private final boolean d;
  
  private final boolean e;
  
  private final String[] f;
  
  private final boolean g;
  
  private final String h;
  
  private final String i;
  
  HintRequest(int paramInt, CredentialPickerConfig paramCredentialPickerConfig, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString, boolean paramBoolean3, String paramString1, String paramString2) {
    this.b = paramInt;
    this.c = (CredentialPickerConfig)t.j(paramCredentialPickerConfig);
    this.d = paramBoolean1;
    this.e = paramBoolean2;
    this.f = (String[])t.j(paramArrayOfString);
    if (paramInt < 2) {
      this.g = true;
      this.h = null;
      this.i = null;
      return;
    } 
    this.g = paramBoolean3;
    this.h = paramString1;
    this.i = paramString2;
  }
  
  public final String[] o0() {
    return this.f;
  }
  
  public final CredentialPickerConfig p0() {
    return this.c;
  }
  
  public final String q0() {
    return this.i;
  }
  
  public final String r0() {
    return this.h;
  }
  
  public final boolean s0() {
    return this.d;
  }
  
  public final boolean t0() {
    return this.g;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.q(paramParcel, 1, (Parcelable)p0(), paramInt, false);
    a.c(paramParcel, 2, s0());
    a.c(paramParcel, 3, this.e);
    a.s(paramParcel, 4, o0(), false);
    a.c(paramParcel, 5, t0());
    a.r(paramParcel, 6, r0(), false);
    a.r(paramParcel, 7, q0(), false);
    a.k(paramParcel, 1000, this.b);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/HintRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */