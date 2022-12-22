package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;

public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
  public static final Parcelable.Creator<SignInConfiguration> CREATOR = new w();
  
  private final String b;
  
  private GoogleSignInOptions c;
  
  public SignInConfiguration(String paramString, GoogleSignInOptions paramGoogleSignInOptions) {
    this.b = t.f(paramString);
    this.c = paramGoogleSignInOptions;
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof SignInConfiguration))
      return false; 
    paramObject = paramObject;
    if (this.b.equals(((SignInConfiguration)paramObject).b)) {
      GoogleSignInOptions googleSignInOptions = this.c;
      if ((googleSignInOptions == null) ? (((SignInConfiguration)paramObject).c == null) : googleSignInOptions.equals(((SignInConfiguration)paramObject).c))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return (new a()).a(this.b).a(this.c).b();
  }
  
  public final GoogleSignInOptions o0() {
    return this.c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.r(paramParcel, 2, this.b, false);
    a.q(paramParcel, 5, (Parcelable)this.c, paramInt, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/SignInConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */