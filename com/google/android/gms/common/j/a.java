package com.google.android.gms.common.j;

import java.util.concurrent.ScheduledExecutorService;

@Deprecated
public class a {
  private static a a;
  
  @Deprecated
  public static a a() {
    // Byte code:
    //   0: ldc com/google/android/gms/common/j/a
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/common/j/a.a : Lcom/google/android/gms/common/j/a$a;
    //   6: ifnonnull -> 21
    //   9: new com/google/android/gms/common/j/b
    //   12: astore_0
    //   13: aload_0
    //   14: invokespecial <init> : ()V
    //   17: aload_0
    //   18: putstatic com/google/android/gms/common/j/a.a : Lcom/google/android/gms/common/j/a$a;
    //   21: getstatic com/google/android/gms/common/j/a.a : Lcom/google/android/gms/common/j/a$a;
    //   24: astore_0
    //   25: ldc com/google/android/gms/common/j/a
    //   27: monitorexit
    //   28: aload_0
    //   29: areturn
    //   30: astore_0
    //   31: ldc com/google/android/gms/common/j/a
    //   33: monitorexit
    //   34: aload_0
    //   35: athrow
    // Exception table:
    //   from	to	target	type
    //   3	21	30	finally
    //   21	25	30	finally
  }
  
  public static interface a {
    @Deprecated
    ScheduledExecutorService a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */