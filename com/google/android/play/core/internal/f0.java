package com.google.android.play.core.internal;

import java.io.Closeable;
import java.io.InputStream;

public abstract class f0 implements Closeable {
  public abstract long b();
  
  protected abstract InputStream c(long paramLong1, long paramLong2);
  
  public final InputStream d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: lconst_0
    //   4: aload_0
    //   5: invokevirtual b : ()J
    //   8: invokevirtual c : (JJ)Ljava/io/InputStream;
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	16	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */