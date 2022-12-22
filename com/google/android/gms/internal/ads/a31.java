package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class a31 {
  private final f31<p00> a;
  
  private final String b;
  
  private ht2 c;
  
  private boolean d = false;
  
  public a31(f31<p00> paramf31, String paramString) {
    this.a = paramf31;
    this.b = paramString;
  }
  
  public final String a() {
    Exception exception;
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/a31}} */
    try {
      ht2 ht21 = this.c;
      if (ht21 != null) {
        String str = ht21.a();
        /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/a31}} */
        return str;
      } 
      /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/a31}} */
      return null;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/a31}} */
      return null;
    } finally {}
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/a31}} */
    throw exception;
  }
  
  public final boolean b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Lcom/google/android/gms/internal/ads/f31;
    //   6: invokeinterface r : ()Z
    //   11: istore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: iload_1
    //   15: ireturn
    //   16: astore_2
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_2
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	16	finally
  }
  
  public final void d(zzvl paramzzvl, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aconst_null
    //   4: putfield c : Lcom/google/android/gms/internal/ads/ht2;
    //   7: new com/google/android/gms/internal/ads/g31
    //   10: astore_3
    //   11: aload_3
    //   12: iload_2
    //   13: invokespecial <init> : (I)V
    //   16: aload_0
    //   17: getfield a : Lcom/google/android/gms/internal/ads/f31;
    //   20: astore #4
    //   22: aload_0
    //   23: getfield b : Ljava/lang/String;
    //   26: astore #5
    //   28: new com/google/android/gms/internal/ads/z21
    //   31: astore #6
    //   33: aload #6
    //   35: aload_0
    //   36: invokespecial <init> : (Lcom/google/android/gms/internal/ads/a31;)V
    //   39: aload_0
    //   40: aload #4
    //   42: aload_1
    //   43: aload #5
    //   45: aload_3
    //   46: aload #6
    //   48: invokeinterface a : (Lcom/google/android/gms/internal/ads/zzvl;Ljava/lang/String;Lcom/google/android/gms/internal/ads/e31;Lcom/google/android/gms/internal/ads/h31;)Z
    //   53: putfield d : Z
    //   56: aload_0
    //   57: monitorexit
    //   58: return
    //   59: astore_1
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_1
    //   63: athrow
    // Exception table:
    //   from	to	target	type
    //   2	56	59	finally
  }
  
  public final String f() {
    Exception exception;
    /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/a31}} */
    try {
      ht2 ht21 = this.c;
      if (ht21 != null) {
        String str = ht21.a();
        /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/a31}} */
        return str;
      } 
      /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/a31}} */
      return null;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/a31}} */
      return null;
    } finally {}
    /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/a31}} */
    throw exception;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/a31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */