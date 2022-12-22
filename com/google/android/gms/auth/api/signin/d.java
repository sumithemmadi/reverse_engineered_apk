package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;

public class d implements i {
  private Status b;
  
  private GoogleSignInAccount c;
  
  public d(GoogleSignInAccount paramGoogleSignInAccount, Status paramStatus) {
    this.c = paramGoogleSignInAccount;
    this.b = paramStatus;
  }
  
  public GoogleSignInAccount a() {
    return this.c;
  }
  
  public Status c() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */