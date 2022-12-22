package com.google.android.gms.common;

import android.content.Intent;

public class GooglePlayServicesRepairableException extends UserRecoverableException {
  private final int zza;
  
  public GooglePlayServicesRepairableException(int paramInt, String paramString, Intent paramIntent) {
    super(paramString, paramIntent);
    this.zza = paramInt;
  }
  
  public int getConnectionStatusCode() {
    return this.zza;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/GooglePlayServicesRepairableException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */