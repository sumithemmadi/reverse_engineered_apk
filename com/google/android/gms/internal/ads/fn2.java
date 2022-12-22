package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.d;

final class fn2 implements d.a {
  fn2(dn2 paramdn2) {}
  
  public final void Y0(int paramInt) {
    synchronized (dn2.k(this.a)) {
      dn2.g(this.a, null);
      dn2.k(this.a).notifyAll();
      return;
    } 
  }
  
  public final void o1(Bundle paramBundle) {
    Object object = dn2.k(this.a);
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (dn2.l(this.a) != null) {
        dn2 dn21 = this.a;
        dn2.g(dn21, dn2.l(dn21).i0());
      } 
    } catch (DeadObjectException deadObjectException) {
      cm.c("Unable to obtain a cache service instance.", (Throwable)deadObjectException);
      dn2.h(this.a);
    } finally {
      Exception exception;
    } 
    dn2.k(this.a).notifyAll();
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fn2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */