package com.google.android.gms.internal.ads;

public final class b92<T> implements t82<T>, m92<T> {
  private static final Object a = new Object();
  
  private volatile m92<T> b;
  
  private volatile Object c = a;
  
  private b92(m92<T> paramm92) {
    this.b = paramm92;
  }
  
  public static <P extends m92<T>, T> m92<T> a(P paramP) {
    g92.a(paramP);
    return (m92<T>)((paramP instanceof b92) ? (Object)paramP : new b92<T>((m92<T>)paramP));
  }
  
  public static <P extends m92<T>, T> t82<T> b(P paramP) {
    return (paramP instanceof t82) ? (t82<T>)paramP : new b92<T>(g92.<m92<T>>a((m92<T>)paramP));
  }
  
  public final T get() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Ljava/lang/Object;
    //   4: astore_1
    //   5: getstatic com/google/android/gms/internal/ads/b92.a : Ljava/lang/Object;
    //   8: astore_2
    //   9: aload_1
    //   10: astore_3
    //   11: aload_1
    //   12: aload_2
    //   13: if_acmpne -> 189
    //   16: aload_0
    //   17: monitorenter
    //   18: aload_0
    //   19: getfield c : Ljava/lang/Object;
    //   22: astore_1
    //   23: aload_1
    //   24: astore_3
    //   25: aload_1
    //   26: aload_2
    //   27: if_acmpne -> 179
    //   30: aload_0
    //   31: getfield b : Lcom/google/android/gms/internal/ads/m92;
    //   34: invokeinterface get : ()Ljava/lang/Object;
    //   39: astore_3
    //   40: aload_0
    //   41: getfield c : Ljava/lang/Object;
    //   44: astore #4
    //   46: aload #4
    //   48: aload_2
    //   49: if_acmpeq -> 58
    //   52: iconst_1
    //   53: istore #5
    //   55: goto -> 61
    //   58: iconst_0
    //   59: istore #5
    //   61: iload #5
    //   63: ifeq -> 169
    //   66: aload #4
    //   68: aload_3
    //   69: if_acmpne -> 75
    //   72: goto -> 169
    //   75: new java/lang/IllegalStateException
    //   78: astore_1
    //   79: aload #4
    //   81: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   84: astore_2
    //   85: aload_3
    //   86: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   89: astore_3
    //   90: aload_2
    //   91: invokevirtual length : ()I
    //   94: istore #5
    //   96: aload_3
    //   97: invokevirtual length : ()I
    //   100: istore #6
    //   102: new java/lang/StringBuilder
    //   105: astore #4
    //   107: aload #4
    //   109: iload #5
    //   111: bipush #118
    //   113: iadd
    //   114: iload #6
    //   116: iadd
    //   117: invokespecial <init> : (I)V
    //   120: aload #4
    //   122: ldc 'Scoped provider was invoked recursively returning different results: '
    //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: pop
    //   128: aload #4
    //   130: aload_2
    //   131: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: pop
    //   135: aload #4
    //   137: ldc ' & '
    //   139: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload #4
    //   145: aload_3
    //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: pop
    //   150: aload #4
    //   152: ldc '. This is likely due to a circular dependency.'
    //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: pop
    //   158: aload_1
    //   159: aload #4
    //   161: invokevirtual toString : ()Ljava/lang/String;
    //   164: invokespecial <init> : (Ljava/lang/String;)V
    //   167: aload_1
    //   168: athrow
    //   169: aload_0
    //   170: aload_3
    //   171: putfield c : Ljava/lang/Object;
    //   174: aload_0
    //   175: aconst_null
    //   176: putfield b : Lcom/google/android/gms/internal/ads/m92;
    //   179: aload_0
    //   180: monitorexit
    //   181: goto -> 189
    //   184: astore_3
    //   185: aload_0
    //   186: monitorexit
    //   187: aload_3
    //   188: athrow
    //   189: aload_3
    //   190: areturn
    // Exception table:
    //   from	to	target	type
    //   18	23	184	finally
    //   30	46	184	finally
    //   75	169	184	finally
    //   169	179	184	finally
    //   179	181	184	finally
    //   185	187	184	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/b92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */