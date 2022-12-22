package com.google.android.gms.auth;

import android.content.Intent;

public class UserRecoverableAuthException extends GoogleAuthException {
  private final Intent mIntent;
  
  public UserRecoverableAuthException(String paramString, Intent paramIntent) {
    super(paramString);
    this.mIntent = paramIntent;
  }
  
  public Intent getIntent() {
    return (this.mIntent == null) ? null : new Intent(this.mIntent);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/UserRecoverableAuthException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */