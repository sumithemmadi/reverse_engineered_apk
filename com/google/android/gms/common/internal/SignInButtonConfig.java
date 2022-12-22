package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public class SignInButtonConfig extends AbstractSafeParcelable {
  public static final Parcelable.Creator<SignInButtonConfig> CREATOR = new j0();
  
  private final int b;
  
  private final int c;
  
  private final int d;
  
  @Deprecated
  private final Scope[] e;
  
  SignInButtonConfig(int paramInt1, int paramInt2, int paramInt3, Scope[] paramArrayOfScope) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramArrayOfScope;
  }
  
  public SignInButtonConfig(int paramInt1, int paramInt2, Scope[] paramArrayOfScope) {
    this(1, paramInt1, paramInt2, null);
  }
  
  public int o0() {
    return this.c;
  }
  
  public int p0() {
    return this.d;
  }
  
  @Deprecated
  public Scope[] q0() {
    return this.e;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.k(paramParcel, 2, o0());
    a.k(paramParcel, 3, p0());
    a.u(paramParcel, 4, (Parcelable[])q0(), paramInt, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/SignInButtonConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */