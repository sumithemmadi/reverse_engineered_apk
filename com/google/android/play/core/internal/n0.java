package com.google.android.play.core.internal;

public final class n0 {
  static final h0 a;
  
  static {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: aconst_null
    //   3: astore_1
    //   4: aload_0
    //   5: astore_2
    //   6: ldc 'android.os.Build$VERSION'
    //   8: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   11: ldc 'SDK_INT'
    //   13: invokevirtual getField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   16: aconst_null
    //   17: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   20: checkcast java/lang/Integer
    //   23: astore_3
    //   24: aload_3
    //   25: astore_1
    //   26: goto -> 49
    //   29: astore_3
    //   30: aload_0
    //   31: astore_2
    //   32: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   35: ldc 'Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.'
    //   37: invokevirtual println : (Ljava/lang/String;)V
    //   40: aload_0
    //   41: astore_2
    //   42: aload_3
    //   43: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   46: invokevirtual printStackTrace : (Ljava/io/PrintStream;)V
    //   49: aload_1
    //   50: ifnull -> 83
    //   53: aload_1
    //   54: astore_2
    //   55: aload_1
    //   56: invokevirtual intValue : ()I
    //   59: bipush #19
    //   61: if_icmplt -> 83
    //   64: aload_1
    //   65: astore_2
    //   66: new com/google/android/play/core/internal/m0
    //   69: astore_0
    //   70: aload_1
    //   71: astore_2
    //   72: aload_0
    //   73: invokespecial <init> : ()V
    //   76: aload_1
    //   77: astore_2
    //   78: aload_0
    //   79: astore_1
    //   80: goto -> 199
    //   83: aload_1
    //   84: astore_2
    //   85: ldc 'com.google.devtools.build.android.desugar.runtime.twr_disable_mimic'
    //   87: invokestatic getBoolean : (Ljava/lang/String;)Z
    //   90: ifne -> 110
    //   93: aload_1
    //   94: astore_2
    //   95: new com/google/android/play/core/internal/k0
    //   98: dup
    //   99: invokespecial <init> : ()V
    //   102: astore_0
    //   103: aload_1
    //   104: astore_2
    //   105: aload_0
    //   106: astore_1
    //   107: goto -> 199
    //   110: aload_1
    //   111: astore_2
    //   112: new com/google/android/play/core/internal/l0
    //   115: dup
    //   116: invokespecial <init> : ()V
    //   119: astore_0
    //   120: aload_1
    //   121: astore_2
    //   122: aload_0
    //   123: astore_1
    //   124: goto -> 199
    //   127: astore #4
    //   129: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   132: astore_1
    //   133: ldc com/google/android/play/core/internal/l0
    //   135: invokevirtual getName : ()Ljava/lang/String;
    //   138: astore_0
    //   139: new java/lang/StringBuilder
    //   142: dup
    //   143: aload_0
    //   144: invokevirtual length : ()I
    //   147: sipush #133
    //   150: iadd
    //   151: invokespecial <init> : (I)V
    //   154: astore_3
    //   155: aload_3
    //   156: ldc 'An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy '
    //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: pop
    //   162: aload_3
    //   163: aload_0
    //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: pop
    //   168: aload_3
    //   169: ldc 'will be used. The error is: '
    //   171: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: pop
    //   175: aload_1
    //   176: aload_3
    //   177: invokevirtual toString : ()Ljava/lang/String;
    //   180: invokevirtual println : (Ljava/lang/String;)V
    //   183: aload #4
    //   185: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   188: invokevirtual printStackTrace : (Ljava/io/PrintStream;)V
    //   191: new com/google/android/play/core/internal/l0
    //   194: dup
    //   195: invokespecial <init> : ()V
    //   198: astore_1
    //   199: aload_1
    //   200: putstatic com/google/android/play/core/internal/n0.a : Lcom/google/android/play/core/internal/h0;
    //   203: aload_2
    //   204: ifnonnull -> 208
    //   207: return
    //   208: aload_2
    //   209: invokevirtual intValue : ()I
    //   212: pop
    //   213: return
    // Exception table:
    //   from	to	target	type
    //   6	24	29	java/lang/Exception
    //   6	24	127	finally
    //   32	40	127	finally
    //   42	49	127	finally
    //   55	64	127	finally
    //   66	70	127	finally
    //   72	76	127	finally
    //   85	93	127	finally
    //   95	103	127	finally
    //   112	120	127	finally
  }
  
  public static void a(Throwable paramThrowable1, Throwable paramThrowable2) {
    a.a(paramThrowable1, paramThrowable2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/n0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */