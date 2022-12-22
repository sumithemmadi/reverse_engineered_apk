package com.google.android.gms.internal.ads;

final class up0 implements et1<String> {
  up0(np0 paramnp0) {}
  
  public final void a(Throwable paramThrowable) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Lcom/google/android/gms/internal/ads/np0;
    //   6: iconst_1
    //   7: invokestatic i : (Lcom/google/android/gms/internal/ads/np0;Z)Z
    //   10: pop
    //   11: aload_0
    //   12: getfield a : Lcom/google/android/gms/internal/ads/np0;
    //   15: ldc 'com.google.android.gms.ads.MobileAds'
    //   17: iconst_0
    //   18: ldc 'Internal Error.'
    //   20: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   23: invokeinterface b : ()J
    //   28: aload_0
    //   29: getfield a : Lcom/google/android/gms/internal/ads/np0;
    //   32: invokestatic b : (Lcom/google/android/gms/internal/ads/np0;)J
    //   35: lsub
    //   36: l2i
    //   37: invokestatic e : (Lcom/google/android/gms/internal/ads/np0;Ljava/lang/String;ZLjava/lang/String;I)V
    //   40: aload_0
    //   41: getfield a : Lcom/google/android/gms/internal/ads/np0;
    //   44: invokestatic r : (Lcom/google/android/gms/internal/ads/np0;)Lcom/google/android/gms/internal/ads/sm;
    //   47: astore_1
    //   48: new java/lang/Exception
    //   51: astore_2
    //   52: aload_2
    //   53: invokespecial <init> : ()V
    //   56: aload_1
    //   57: aload_2
    //   58: invokevirtual d : (Ljava/lang/Throwable;)Z
    //   61: pop
    //   62: aload_0
    //   63: monitorexit
    //   64: return
    //   65: astore_1
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_1
    //   69: athrow
    // Exception table:
    //   from	to	target	type
    //   2	64	65	finally
    //   66	68	65	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/up0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */