package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.t;

final class r0 {
  private final int a;
  
  private final ConnectionResult b;
  
  r0(ConnectionResult paramConnectionResult, int paramInt) {
    t.j(paramConnectionResult);
    this.b = paramConnectionResult;
    this.a = paramInt;
  }
  
  final ConnectionResult a() {
    return this.b;
  }
  
  final int b() {
    return this.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/r0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */