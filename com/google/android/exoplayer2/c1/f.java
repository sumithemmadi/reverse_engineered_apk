package com.google.android.exoplayer2.c1;

import java.lang.reflect.Constructor;

public final class f implements l {
  private static final Constructor<? extends h> a;
  
  private boolean b;
  
  private int c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private int i = 1;
  
  private int j;
  
  static {
    Constructor constructor1 = null;
    Constructor constructor2 = constructor1;
    try {
      if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0])))
        constructor2 = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").<h>asSubclass(h.class).getConstructor(new Class[0]); 
    } catch (ClassNotFoundException classNotFoundException) {
      Constructor constructor = constructor1;
    } catch (Exception exception) {
      throw new RuntimeException("Error instantiating FLAC extension", exception);
    } 
    a = (Constructor<? extends h>)exception;
  }
  
  public h[] a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: bipush #14
    //   4: anewarray com/google/android/exoplayer2/c1/h
    //   7: astore_1
    //   8: new com/google/android/exoplayer2/c1/a0/e
    //   11: astore_2
    //   12: aload_2
    //   13: aload_0
    //   14: getfield e : I
    //   17: invokespecial <init> : (I)V
    //   20: aload_1
    //   21: iconst_0
    //   22: aload_2
    //   23: aastore
    //   24: new com/google/android/exoplayer2/extractor/mp4/g
    //   27: astore_2
    //   28: aload_2
    //   29: aload_0
    //   30: getfield g : I
    //   33: invokespecial <init> : (I)V
    //   36: iconst_1
    //   37: istore_3
    //   38: aload_1
    //   39: iconst_1
    //   40: aload_2
    //   41: aastore
    //   42: new com/google/android/exoplayer2/extractor/mp4/i
    //   45: astore_2
    //   46: aload_2
    //   47: aload_0
    //   48: getfield f : I
    //   51: invokespecial <init> : (I)V
    //   54: aload_1
    //   55: iconst_2
    //   56: aload_2
    //   57: aastore
    //   58: new com/google/android/exoplayer2/c1/b0/e
    //   61: astore_2
    //   62: aload_0
    //   63: getfield h : I
    //   66: istore #4
    //   68: aload_0
    //   69: getfield b : Z
    //   72: ifeq -> 81
    //   75: iconst_1
    //   76: istore #5
    //   78: goto -> 84
    //   81: iconst_0
    //   82: istore #5
    //   84: aload_2
    //   85: iload #4
    //   87: iload #5
    //   89: ior
    //   90: invokespecial <init> : (I)V
    //   93: aload_1
    //   94: iconst_3
    //   95: aload_2
    //   96: aastore
    //   97: new com/google/android/exoplayer2/c1/d0/j
    //   100: astore_2
    //   101: aload_0
    //   102: getfield c : I
    //   105: istore #4
    //   107: aload_0
    //   108: getfield b : Z
    //   111: ifeq -> 120
    //   114: iconst_1
    //   115: istore #5
    //   117: goto -> 123
    //   120: iconst_0
    //   121: istore #5
    //   123: aload_2
    //   124: iload #4
    //   126: iload #5
    //   128: ior
    //   129: invokespecial <init> : (I)V
    //   132: aload_1
    //   133: iconst_4
    //   134: aload_2
    //   135: aastore
    //   136: new com/google/android/exoplayer2/c1/d0/f
    //   139: astore_2
    //   140: aload_2
    //   141: invokespecial <init> : ()V
    //   144: aload_1
    //   145: iconst_5
    //   146: aload_2
    //   147: aastore
    //   148: new com/google/android/exoplayer2/c1/d0/g0
    //   151: astore_2
    //   152: aload_2
    //   153: aload_0
    //   154: getfield i : I
    //   157: aload_0
    //   158: getfield j : I
    //   161: invokespecial <init> : (II)V
    //   164: aload_1
    //   165: bipush #6
    //   167: aload_2
    //   168: aastore
    //   169: new com/google/android/exoplayer2/extractor/flv/c
    //   172: astore_2
    //   173: aload_2
    //   174: invokespecial <init> : ()V
    //   177: aload_1
    //   178: bipush #7
    //   180: aload_2
    //   181: aastore
    //   182: new com/google/android/exoplayer2/c1/c0/d
    //   185: astore_2
    //   186: aload_2
    //   187: invokespecial <init> : ()V
    //   190: aload_1
    //   191: bipush #8
    //   193: aload_2
    //   194: aastore
    //   195: new com/google/android/exoplayer2/c1/d0/z
    //   198: astore_2
    //   199: aload_2
    //   200: invokespecial <init> : ()V
    //   203: aload_1
    //   204: bipush #9
    //   206: aload_2
    //   207: aastore
    //   208: new com/google/android/exoplayer2/c1/e0/b
    //   211: astore_2
    //   212: aload_2
    //   213: invokespecial <init> : ()V
    //   216: aload_1
    //   217: bipush #10
    //   219: aload_2
    //   220: aastore
    //   221: new com/google/android/exoplayer2/c1/y/b
    //   224: astore_2
    //   225: aload_0
    //   226: getfield d : I
    //   229: istore #4
    //   231: aload_0
    //   232: getfield b : Z
    //   235: ifeq -> 244
    //   238: iload_3
    //   239: istore #5
    //   241: goto -> 247
    //   244: iconst_0
    //   245: istore #5
    //   247: aload_2
    //   248: iload #5
    //   250: iload #4
    //   252: ior
    //   253: invokespecial <init> : (I)V
    //   256: aload_1
    //   257: bipush #11
    //   259: aload_2
    //   260: aastore
    //   261: new com/google/android/exoplayer2/c1/d0/h
    //   264: astore_2
    //   265: aload_2
    //   266: invokespecial <init> : ()V
    //   269: aload_1
    //   270: bipush #12
    //   272: aload_2
    //   273: aastore
    //   274: getstatic com/google/android/exoplayer2/c1/f.a : Ljava/lang/reflect/Constructor;
    //   277: astore_2
    //   278: aload_2
    //   279: ifnull -> 314
    //   282: aload_1
    //   283: bipush #13
    //   285: aload_2
    //   286: iconst_0
    //   287: anewarray java/lang/Object
    //   290: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   293: checkcast com/google/android/exoplayer2/c1/h
    //   296: aastore
    //   297: goto -> 325
    //   300: astore_2
    //   301: new java/lang/IllegalStateException
    //   304: astore_1
    //   305: aload_1
    //   306: ldc 'Unexpected error creating FLAC extractor'
    //   308: aload_2
    //   309: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   312: aload_1
    //   313: athrow
    //   314: aload_1
    //   315: bipush #13
    //   317: new com/google/android/exoplayer2/c1/z/d
    //   320: dup
    //   321: invokespecial <init> : ()V
    //   324: aastore
    //   325: aload_0
    //   326: monitorexit
    //   327: aload_1
    //   328: areturn
    //   329: astore_1
    //   330: aload_0
    //   331: monitorexit
    //   332: aload_1
    //   333: athrow
    // Exception table:
    //   from	to	target	type
    //   2	20	329	finally
    //   24	36	329	finally
    //   42	54	329	finally
    //   58	75	329	finally
    //   84	93	329	finally
    //   97	114	329	finally
    //   123	132	329	finally
    //   136	144	329	finally
    //   148	164	329	finally
    //   169	177	329	finally
    //   182	190	329	finally
    //   195	203	329	finally
    //   208	216	329	finally
    //   221	238	329	finally
    //   247	256	329	finally
    //   261	269	329	finally
    //   274	278	329	finally
    //   282	297	300	java/lang/Exception
    //   282	297	329	finally
    //   301	314	329	finally
    //   314	325	329	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */