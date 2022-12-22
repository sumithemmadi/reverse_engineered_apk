package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

final class tn2 extends PushbackInputStream {
  tn2(sn2 paramsn2, InputStream paramInputStream, int paramInt) {
    super(paramInputStream, 1);
  }
  
  public final void close() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Lcom/google/android/gms/internal/ads/sn2;
    //   6: getfield c : Lcom/google/android/gms/internal/ads/qn2;
    //   9: invokestatic b : (Lcom/google/android/gms/internal/ads/qn2;)V
    //   12: aload_0
    //   13: invokespecial close : ()V
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: astore_1
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_1
    //   23: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	19	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tn2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */