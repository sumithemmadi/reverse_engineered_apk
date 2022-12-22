package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;

public final class SignInCredential extends AbstractSafeParcelable {
  public static final Parcelable.Creator<SignInCredential> CREATOR = new h();
  
  private final String b;
  
  private final String c;
  
  private final String d;
  
  private final String e;
  
  private final Uri f;
  
  private final String g;
  
  private final String h;
  
  public SignInCredential(String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, String paramString5, String paramString6) {
    this.b = t.f(paramString1);
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramUri;
    this.g = paramString5;
    this.h = paramString6;
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof SignInCredential))
      return false; 
    paramObject = paramObject;
    return (r.a(this.b, ((SignInCredential)paramObject).b) && r.a(this.c, ((SignInCredential)paramObject).c) && r.a(this.d, ((SignInCredential)paramObject).d) && r.a(this.e, ((SignInCredential)paramObject).e) && r.a(this.f, ((SignInCredential)paramObject).f) && r.a(this.g, ((SignInCredential)paramObject).g) && r.a(this.h, ((SignInCredential)paramObject).h));
  }
  
  public final int hashCode() {
    return r.b(new Object[] { this.b, this.c, this.d, this.e, this.f, this.g, this.h });
  }
  
  public final String o0() {
    return this.c;
  }
  
  public final String p0() {
    return this.e;
  }
  
  public final String q0() {
    return this.d;
  }
  
  public final String r0() {
    return this.h;
  }
  
  public final String s0() {
    return this.b;
  }
  
  public final String t0() {
    return this.g;
  }
  
  public final Uri u0() {
    return this.f;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.r(paramParcel, 1, s0(), false);
    a.r(paramParcel, 2, o0(), false);
    a.r(paramParcel, 3, q0(), false);
    a.r(paramParcel, 4, p0(), false);
    a.q(paramParcel, 5, (Parcelable)u0(), paramInt, false);
    a.r(paramParcel, 6, t0(), false);
    a.r(paramParcel, 7, r0(), false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/identity/SignInCredential.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */