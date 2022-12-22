package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;

public class ResolvableApiException extends ApiException {
  public ResolvableApiException(Status paramStatus) {
    super(paramStatus);
  }
  
  public PendingIntent getResolution() {
    return getStatus().o0();
  }
  
  public void startResolutionForResult(Activity paramActivity, int paramInt) {
    getStatus().t0(paramActivity, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/ResolvableApiException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */