package com.google.android.exoplayer2;

import java.util.HashSet;

public final class e0 {
  private static final HashSet<String> a = new HashSet<String>();
  
  private static String b = "goog.exo.core";
  
  public static void a(String paramString) {
    // Byte code:
    //   0: ldc com/google/android/exoplayer2/e0
    //   2: monitorenter
    //   3: getstatic com/google/android/exoplayer2/e0.a : Ljava/util/HashSet;
    //   6: aload_0
    //   7: invokevirtual add : (Ljava/lang/Object;)Z
    //   10: ifeq -> 49
    //   13: new java/lang/StringBuilder
    //   16: astore_1
    //   17: aload_1
    //   18: invokespecial <init> : ()V
    //   21: aload_1
    //   22: getstatic com/google/android/exoplayer2/e0.b : Ljava/lang/String;
    //   25: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: pop
    //   29: aload_1
    //   30: ldc ', '
    //   32: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload_1
    //   37: aload_0
    //   38: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: aload_1
    //   43: invokevirtual toString : ()Ljava/lang/String;
    //   46: putstatic com/google/android/exoplayer2/e0.b : Ljava/lang/String;
    //   49: ldc com/google/android/exoplayer2/e0
    //   51: monitorexit
    //   52: return
    //   53: astore_0
    //   54: ldc com/google/android/exoplayer2/e0
    //   56: monitorexit
    //   57: aload_0
    //   58: athrow
    // Exception table:
    //   from	to	target	type
    //   3	49	53	finally
  }
  
  public static String b() {
    // Byte code:
    //   0: ldc com/google/android/exoplayer2/e0
    //   2: monitorenter
    //   3: getstatic com/google/android/exoplayer2/e0.b : Ljava/lang/String;
    //   6: astore_0
    //   7: ldc com/google/android/exoplayer2/e0
    //   9: monitorexit
    //   10: aload_0
    //   11: areturn
    //   12: astore_0
    //   13: ldc com/google/android/exoplayer2/e0
    //   15: monitorexit
    //   16: aload_0
    //   17: athrow
    // Exception table:
    //   from	to	target	type
    //   3	7	12	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */