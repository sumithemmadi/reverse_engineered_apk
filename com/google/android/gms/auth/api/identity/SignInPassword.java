package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;

public class SignInPassword extends AbstractSafeParcelable {
  public static final Parcelable.Creator<SignInPassword> CREATOR = new i();
  
  private final String b;
  
  private final String c;
  
  public SignInPassword(String paramString1, String paramString2) {
    this.b = t.g(((String)t.k(paramString1, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
    this.c = t.f(paramString2);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof SignInPassword))
      return false; 
    paramObject = paramObject;
    return (r.a(this.b, ((SignInPassword)paramObject).b) && r.a(this.c, ((SignInPassword)paramObject).c));
  }
  
  public int hashCode() {
    return r.b(new Object[] { this.b, this.c });
  }
  
  public String o0() {
    return this.b;
  }
  
  public String p0() {
    return this.c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.r(paramParcel, 1, o0(), false);
    a.r(paramParcel, 2, p0(), false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/identity/SignInPassword.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */