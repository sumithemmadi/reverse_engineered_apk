package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.d;

final class w7 implements d.a {
  w7(s7 params7, sm paramsm) {}
  
  public final void Y0(int paramInt) {
    sm sm1 = this.a;
    StringBuilder stringBuilder = new StringBuilder(34);
    stringBuilder.append("onConnectionSuspended: ");
    stringBuilder.append(paramInt);
    sm1.d(new RuntimeException(stringBuilder.toString()));
  }
  
  public final void o1(Bundle paramBundle) {
    try {
      this.a.c(s7.d(this.b).i0());
      return;
    } catch (DeadObjectException deadObjectException) {
      this.a.d((Throwable)deadObjectException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/w7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */