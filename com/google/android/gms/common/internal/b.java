package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

public class b {
  public static ApiException a(Status paramStatus) {
    return (ApiException)(paramStatus.r0() ? new ResolvableApiException(paramStatus) : new ApiException(paramStatus));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */