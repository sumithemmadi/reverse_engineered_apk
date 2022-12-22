package com.google.android.gms.auth;

import android.content.Intent;

public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {
  private final int zzu;
  
  GooglePlayServicesAvailabilityException(int paramInt, String paramString, Intent paramIntent) {
    super(paramString, paramIntent);
    this.zzu = paramInt;
  }
  
  public int getConnectionStatusCode() {
    return this.zzu;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/GooglePlayServicesAvailabilityException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */