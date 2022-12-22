package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

abstract class es1<V, X extends Throwable, F, T> extends xs1<V> implements Runnable {
  private ot1<? extends V> i;
  
  private Class<X> j;
  
  private F k;
  
  es1(ot1<? extends V> paramot1, Class<X> paramClass, F paramF) {
    this.i = xq1.<ot1<? extends V>>b(paramot1);
    this.j = xq1.<Class<X>>b(paramClass);
    this.k = xq1.b(paramF);
  }
  
  static <X extends Throwable, V> ot1<V> J(ot1<? extends V> paramot1, Class<X> paramClass, qs1<? super X, ? extends V> paramqs1, Executor paramExecutor) {
    hs1<V, X> hs1 = new hs1<V, X>(paramot1, paramClass, paramqs1);
    paramot1.a(hs1, qt1.b(paramExecutor, hs1));
    return hs1;
  }
  
  abstract void I(T paramT);
  
  abstract T K(F paramF, X paramX);
  
  protected final void c() {
    g(this.i);
    this.i = null;
    this.j = null;
    this.k = null;
  }
  
  protected final String h() {
    String str1;
    ot1<? extends V> ot11 = this.i;
    Class<X> clazz = this.j;
    F f = this.k;
    String str2 = super.h();
    if (ot11 != null) {
      str1 = String.valueOf(ot11);
      StringBuilder stringBuilder = new StringBuilder(str1.length() + 16);
      stringBuilder.append("inputFuture=[");
      stringBuilder.append(str1);
      stringBuilder.append("], ");
      str1 = stringBuilder.toString();
    } else {
      str1 = "";
    } 
    if (clazz != null && f != null) {
      str2 = String.valueOf(clazz);
      String str = String.valueOf(f);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 29 + str2.length() + str.length());
      stringBuilder.append(str1);
      stringBuilder.append("exceptionType=[");
      stringBuilder.append(str2);
      stringBuilder.append("], fallback=[");
      stringBuilder.append(str);
      stringBuilder.append("]");
      return stringBuilder.toString();
    } 
    if (str2 != null) {
      str1 = String.valueOf(str1);
      return (str2.length() != 0) ? str1.concat(str2) : new String(str1);
    } 
    return null;
  }
  
  public final void run() {
    // Byte code:
    //   0: aload_0
    //   1: getfield i : Lcom/google/android/gms/internal/ads/ot1;
    //   4: astore_1
    //   5: aload_0
    //   6: getfield j : Ljava/lang/Class;
    //   9: astore_2
    //   10: aload_0
    //   11: getfield k : Ljava/lang/Object;
    //   14: astore_3
    //   15: iconst_1
    //   16: istore #4
    //   18: aload_1
    //   19: ifnonnull -> 28
    //   22: iconst_1
    //   23: istore #5
    //   25: goto -> 31
    //   28: iconst_0
    //   29: istore #5
    //   31: aload_2
    //   32: ifnonnull -> 41
    //   35: iconst_1
    //   36: istore #6
    //   38: goto -> 44
    //   41: iconst_0
    //   42: istore #6
    //   44: aload_3
    //   45: ifnonnull -> 51
    //   48: goto -> 54
    //   51: iconst_0
    //   52: istore #4
    //   54: iload #4
    //   56: iload #5
    //   58: iload #6
    //   60: ior
    //   61: ior
    //   62: ifne -> 347
    //   65: aload_0
    //   66: invokevirtual isCancelled : ()Z
    //   69: ifeq -> 75
    //   72: goto -> 347
    //   75: aload_0
    //   76: aconst_null
    //   77: putfield i : Lcom/google/android/gms/internal/ads/ot1;
    //   80: aload_1
    //   81: instanceof com/google/android/gms/internal/ads/eu1
    //   84: ifeq -> 99
    //   87: aload_1
    //   88: checkcast com/google/android/gms/internal/ads/eu1
    //   91: invokestatic a : (Lcom/google/android/gms/internal/ads/eu1;)Ljava/lang/Throwable;
    //   94: astore #7
    //   96: goto -> 102
    //   99: aconst_null
    //   100: astore #7
    //   102: aload #7
    //   104: astore #8
    //   106: aload #7
    //   108: ifnonnull -> 122
    //   111: aload_1
    //   112: invokestatic f : (Ljava/util/concurrent/Future;)Ljava/lang/Object;
    //   115: astore #8
    //   117: goto -> 257
    //   120: astore #8
    //   122: aconst_null
    //   123: astore #9
    //   125: aload #8
    //   127: astore #7
    //   129: aload #9
    //   131: astore #8
    //   133: goto -> 257
    //   136: astore #9
    //   138: aload #9
    //   140: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   143: astore #8
    //   145: aload #8
    //   147: astore #7
    //   149: aload #8
    //   151: ifnonnull -> 250
    //   154: aload_1
    //   155: invokevirtual getClass : ()Ljava/lang/Class;
    //   158: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   161: astore #7
    //   163: aload #9
    //   165: invokevirtual getClass : ()Ljava/lang/Class;
    //   168: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   171: astore #8
    //   173: new java/lang/StringBuilder
    //   176: dup
    //   177: aload #7
    //   179: invokevirtual length : ()I
    //   182: bipush #35
    //   184: iadd
    //   185: aload #8
    //   187: invokevirtual length : ()I
    //   190: iadd
    //   191: invokespecial <init> : (I)V
    //   194: astore #9
    //   196: aload #9
    //   198: ldc 'Future type '
    //   200: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: pop
    //   204: aload #9
    //   206: aload #7
    //   208: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: pop
    //   212: aload #9
    //   214: ldc ' threw '
    //   216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: pop
    //   220: aload #9
    //   222: aload #8
    //   224: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: pop
    //   228: aload #9
    //   230: ldc ' without a cause'
    //   232: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: pop
    //   236: new java/lang/NullPointerException
    //   239: dup
    //   240: aload #9
    //   242: invokevirtual toString : ()Ljava/lang/String;
    //   245: invokespecial <init> : (Ljava/lang/String;)V
    //   248: astore #7
    //   250: aload #7
    //   252: astore #8
    //   254: goto -> 122
    //   257: aload #7
    //   259: ifnonnull -> 270
    //   262: aload_0
    //   263: aload #8
    //   265: invokevirtual i : (Ljava/lang/Object;)Z
    //   268: pop
    //   269: return
    //   270: aload_2
    //   271: aload #7
    //   273: invokevirtual isInstance : (Ljava/lang/Object;)Z
    //   276: ifne -> 286
    //   279: aload_0
    //   280: aload_1
    //   281: invokevirtual k : (Lcom/google/android/gms/internal/ads/ot1;)Z
    //   284: pop
    //   285: return
    //   286: aload_0
    //   287: aload_3
    //   288: aload #7
    //   290: invokevirtual K : (Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;
    //   293: astore #7
    //   295: aload_0
    //   296: aconst_null
    //   297: putfield j : Ljava/lang/Class;
    //   300: aload_0
    //   301: aconst_null
    //   302: putfield k : Ljava/lang/Object;
    //   305: aload_0
    //   306: aload #7
    //   308: invokevirtual I : (Ljava/lang/Object;)V
    //   311: return
    //   312: astore #7
    //   314: aload_0
    //   315: aload #7
    //   317: invokevirtual j : (Ljava/lang/Throwable;)Z
    //   320: pop
    //   321: aload_0
    //   322: aconst_null
    //   323: putfield j : Ljava/lang/Class;
    //   326: aload_0
    //   327: aconst_null
    //   328: putfield k : Ljava/lang/Object;
    //   331: return
    //   332: astore #7
    //   334: aload_0
    //   335: aconst_null
    //   336: putfield j : Ljava/lang/Class;
    //   339: aload_0
    //   340: aconst_null
    //   341: putfield k : Ljava/lang/Object;
    //   344: aload #7
    //   346: athrow
    //   347: return
    // Exception table:
    //   from	to	target	type
    //   80	96	136	java/util/concurrent/ExecutionException
    //   80	96	120	finally
    //   111	117	136	java/util/concurrent/ExecutionException
    //   111	117	120	finally
    //   286	295	312	finally
    //   314	321	332	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/es1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */