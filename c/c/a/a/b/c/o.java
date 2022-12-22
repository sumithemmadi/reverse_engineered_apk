package c.c.a.a.b.c;

public final class o {
  static final i a;
  
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
    //   66: new c/c/a/a/b/c/n
    //   69: astore_0
    //   70: aload_1
    //   71: astore_2
    //   72: aload_0
    //   73: invokespecial <init> : ()V
    //   76: aload_1
    //   77: astore_2
    //   78: aload_0
    //   79: astore_1
    //   80: goto -> 202
    //   83: aload_1
    //   84: astore_2
    //   85: ldc 'com.google.devtools.build.android.desugar.runtime.twr_disable_mimic'
    //   87: invokestatic getBoolean : (Ljava/lang/String;)Z
    //   90: ifne -> 110
    //   93: aload_1
    //   94: astore_2
    //   95: new c/c/a/a/b/c/l
    //   98: dup
    //   99: invokespecial <init> : ()V
    //   102: astore_0
    //   103: aload_1
    //   104: astore_2
    //   105: aload_0
    //   106: astore_1
    //   107: goto -> 202
    //   110: aload_1
    //   111: astore_2
    //   112: new c/c/a/a/b/c/m
    //   115: dup
    //   116: invokespecial <init> : ()V
    //   119: astore_0
    //   120: aload_1
    //   121: astore_2
    //   122: aload_0
    //   123: astore_1
    //   124: goto -> 202
    //   127: astore_1
    //   128: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   131: astore_0
    //   132: ldc c/c/a/a/b/c/m
    //   134: invokevirtual getName : ()Ljava/lang/String;
    //   137: astore_3
    //   138: new java/lang/StringBuilder
    //   141: dup
    //   142: aload_3
    //   143: invokevirtual length : ()I
    //   146: sipush #133
    //   149: iadd
    //   150: invokespecial <init> : (I)V
    //   153: astore #4
    //   155: aload #4
    //   157: ldc 'An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy '
    //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: pop
    //   163: aload #4
    //   165: aload_3
    //   166: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: pop
    //   170: aload #4
    //   172: ldc 'will be used. The error is: '
    //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: pop
    //   178: aload_0
    //   179: aload #4
    //   181: invokevirtual toString : ()Ljava/lang/String;
    //   184: invokevirtual println : (Ljava/lang/String;)V
    //   187: aload_1
    //   188: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   191: invokevirtual printStackTrace : (Ljava/io/PrintStream;)V
    //   194: new c/c/a/a/b/c/m
    //   197: dup
    //   198: invokespecial <init> : ()V
    //   201: astore_1
    //   202: aload_1
    //   203: putstatic c/c/a/a/b/c/o.a : Lc/c/a/a/b/c/i;
    //   206: aload_2
    //   207: ifnonnull -> 211
    //   210: return
    //   211: aload_2
    //   212: invokevirtual intValue : ()I
    //   215: pop
    //   216: return
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/c/c/a/a/b/c/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */