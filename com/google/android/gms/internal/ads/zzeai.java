package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

final class zzeai extends TimeoutException {
  private zzeai(String paramString) {
    super(paramString);
  }
  
  public final Throwable fillInStackTrace() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_0
    //   4: anewarray java/lang/StackTraceElement
    //   7: invokevirtual setStackTrace : ([Ljava/lang/StackTraceElement;)V
    //   10: aload_0
    //   11: monitorexit
    //   12: aload_0
    //   13: areturn
    //   14: astore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_1
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	14	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzeai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */