package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;

public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
  public static final Parcelable.Creator<SignInAccount> CREATOR = new j();
  
  @Deprecated
  private String b;
  
  private GoogleSignInAccount c;
  
  @Deprecated
  private String d;
  
  SignInAccount(String paramString1, GoogleSignInAccount paramGoogleSignInAccount, String paramString2) {
    this.c = paramGoogleSignInAccount;
    this.b = t.g(paramString1, "8.3 and 8.4 SDKs require non-null email");
    this.d = t.g(paramString2, "8.3 and 8.4 SDKs require non-null userId");
  }
  
  public final GoogleSignInAccount S() {
    return this.c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.r(paramParcel, 4, this.b, false);
    a.q(paramParcel, 7, (Parcelable)this.c, paramInt, false);
    a.r(paramParcel, 8, this.d, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/SignInAccount.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */