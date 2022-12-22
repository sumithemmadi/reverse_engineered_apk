package com.google.android.gms.internal.ads;

import java.math.BigInteger;

public final class ol {
  private BigInteger a = BigInteger.ONE;
  
  private String b = "0";
  
  public final String a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/math/BigInteger;
    //   6: invokevirtual toString : ()Ljava/lang/String;
    //   9: astore_1
    //   10: aload_0
    //   11: aload_0
    //   12: getfield a : Ljava/math/BigInteger;
    //   15: getstatic java/math/BigInteger.ONE : Ljava/math/BigInteger;
    //   18: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   21: putfield a : Ljava/math/BigInteger;
    //   24: aload_0
    //   25: aload_1
    //   26: putfield b : Ljava/lang/String;
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: areturn
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   2	29	33	finally
  }
  
  public final String b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Ljava/lang/String;
    //   6: astore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: aload_1
    //   10: areturn
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */