package com.google.android.gms.common.k;

import android.content.Context;

public class c {
  private static c a = new c();
  
  private b b = null;
  
  public static b a(Context paramContext) {
    return a.b(paramContext);
  }
  
  private final b b(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Lcom/google/android/gms/common/k/b;
    //   6: ifnonnull -> 38
    //   9: aload_1
    //   10: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   13: ifnonnull -> 19
    //   16: goto -> 24
    //   19: aload_1
    //   20: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   23: astore_1
    //   24: new com/google/android/gms/common/k/b
    //   27: astore_2
    //   28: aload_2
    //   29: aload_1
    //   30: invokespecial <init> : (Landroid/content/Context;)V
    //   33: aload_0
    //   34: aload_2
    //   35: putfield b : Lcom/google/android/gms/common/k/b;
    //   38: aload_0
    //   39: getfield b : Lcom/google/android/gms/common/k/b;
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: areturn
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	47	finally
    //   19	24	47	finally
    //   24	38	47	finally
    //   38	43	47	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/k/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */