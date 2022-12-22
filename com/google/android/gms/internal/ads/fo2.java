package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class fo2 {
  private final byte[] a;
  
  private int b;
  
  private int c;
  
  private fo2(ao2 paramao2, byte[] paramArrayOfbyte) {
    this.a = paramArrayOfbyte;
  }
  
  public final void a() {
    Exception exception;
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/fo2}} */
    try {
      ao2 ao21 = this.d;
      if (ao21.b) {
        ao21.a.y1(this.a);
        this.d.a.x3(this.b);
        this.d.a.y4(this.c);
        this.d.a.l4(null);
        this.d.a.x8();
      } 
      /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/fo2}} */
      return;
    } catch (RemoteException remoteException) {
      cm.b("Clearcut log failed", (Throwable)remoteException);
      /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/fo2}} */
      return;
    } finally {}
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/fo2}} */
    throw exception;
  }
  
  public final fo2 b(int paramInt) {
    this.b = paramInt;
    return this;
  }
  
  public final fo2 c(int paramInt) {
    this.c = paramInt;
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fo2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */