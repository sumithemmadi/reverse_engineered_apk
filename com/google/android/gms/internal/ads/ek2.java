package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

final class ek2 extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {
  private final int[] b = new int[1];
  
  private Handler c;
  
  private SurfaceTexture d;
  
  private Error e;
  
  private RuntimeException f;
  
  private zzqa g;
  
  public ek2() {
    super("dummySurface");
  }
  
  public final void a() {
    this.c.sendEmptyMessage(3);
  }
  
  public final zzqa b(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual start : ()V
    //   4: aload_0
    //   5: new android/os/Handler
    //   8: dup
    //   9: aload_0
    //   10: invokevirtual getLooper : ()Landroid/os/Looper;
    //   13: aload_0
    //   14: invokespecial <init> : (Landroid/os/Looper;Landroid/os/Handler$Callback;)V
    //   17: putfield c : Landroid/os/Handler;
    //   20: aload_0
    //   21: monitorenter
    //   22: aload_0
    //   23: getfield c : Landroid/os/Handler;
    //   26: astore_2
    //   27: iconst_0
    //   28: istore_3
    //   29: iload_1
    //   30: ifeq -> 39
    //   33: iconst_1
    //   34: istore #4
    //   36: goto -> 42
    //   39: iconst_0
    //   40: istore #4
    //   42: aload_2
    //   43: iconst_1
    //   44: iload #4
    //   46: iconst_0
    //   47: invokevirtual obtainMessage : (III)Landroid/os/Message;
    //   50: invokevirtual sendToTarget : ()V
    //   53: iload_3
    //   54: istore #4
    //   56: aload_0
    //   57: getfield g : Lcom/google/android/gms/internal/ads/zzqa;
    //   60: ifnonnull -> 93
    //   63: aload_0
    //   64: getfield f : Ljava/lang/RuntimeException;
    //   67: ifnonnull -> 93
    //   70: aload_0
    //   71: getfield e : Ljava/lang/Error;
    //   74: astore_2
    //   75: aload_2
    //   76: ifnonnull -> 93
    //   79: aload_0
    //   80: invokevirtual wait : ()V
    //   83: goto -> 56
    //   86: astore_2
    //   87: iconst_1
    //   88: istore #4
    //   90: goto -> 56
    //   93: aload_0
    //   94: monitorexit
    //   95: iload #4
    //   97: ifeq -> 106
    //   100: invokestatic currentThread : ()Ljava/lang/Thread;
    //   103: invokevirtual interrupt : ()V
    //   106: aload_0
    //   107: getfield f : Ljava/lang/RuntimeException;
    //   110: astore_2
    //   111: aload_2
    //   112: ifnonnull -> 131
    //   115: aload_0
    //   116: getfield e : Ljava/lang/Error;
    //   119: astore_2
    //   120: aload_2
    //   121: ifnonnull -> 129
    //   124: aload_0
    //   125: getfield g : Lcom/google/android/gms/internal/ads/zzqa;
    //   128: areturn
    //   129: aload_2
    //   130: athrow
    //   131: aload_2
    //   132: athrow
    //   133: astore_2
    //   134: aload_0
    //   135: monitorexit
    //   136: goto -> 141
    //   139: aload_2
    //   140: athrow
    //   141: goto -> 139
    // Exception table:
    //   from	to	target	type
    //   22	27	133	finally
    //   42	53	133	finally
    //   56	75	133	finally
    //   79	83	86	java/lang/InterruptedException
    //   79	83	133	finally
    //   93	95	133	finally
    //   134	136	133	finally
  }
  
  public final boolean handleMessage(Message paramMessage) {
    // Byte code:
    //   0: aload_1
    //   1: getfield what : I
    //   4: istore_2
    //   5: iload_2
    //   6: iconst_1
    //   7: if_icmpeq -> 112
    //   10: iload_2
    //   11: iconst_2
    //   12: if_icmpeq -> 103
    //   15: iload_2
    //   16: iconst_3
    //   17: if_icmpeq -> 22
    //   20: iconst_1
    //   21: ireturn
    //   22: aload_0
    //   23: getfield d : Landroid/graphics/SurfaceTexture;
    //   26: invokevirtual release : ()V
    //   29: aload_0
    //   30: aconst_null
    //   31: putfield g : Lcom/google/android/gms/internal/ads/zzqa;
    //   34: aload_0
    //   35: aconst_null
    //   36: putfield d : Landroid/graphics/SurfaceTexture;
    //   39: iconst_1
    //   40: aload_0
    //   41: getfield b : [I
    //   44: iconst_0
    //   45: invokestatic glDeleteTextures : (I[II)V
    //   48: aload_0
    //   49: invokevirtual quit : ()Z
    //   52: pop
    //   53: goto -> 93
    //   56: astore_1
    //   57: aload_0
    //   58: aconst_null
    //   59: putfield g : Lcom/google/android/gms/internal/ads/zzqa;
    //   62: aload_0
    //   63: aconst_null
    //   64: putfield d : Landroid/graphics/SurfaceTexture;
    //   67: iconst_1
    //   68: aload_0
    //   69: getfield b : [I
    //   72: iconst_0
    //   73: invokestatic glDeleteTextures : (I[II)V
    //   76: aload_1
    //   77: athrow
    //   78: astore_1
    //   79: ldc 'DummySurface'
    //   81: ldc 'Failed to release dummy surface'
    //   83: aload_1
    //   84: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   87: pop
    //   88: aload_0
    //   89: invokevirtual quit : ()Z
    //   92: pop
    //   93: iconst_1
    //   94: ireturn
    //   95: astore_1
    //   96: aload_0
    //   97: invokevirtual quit : ()Z
    //   100: pop
    //   101: aload_1
    //   102: athrow
    //   103: aload_0
    //   104: getfield d : Landroid/graphics/SurfaceTexture;
    //   107: invokevirtual updateTexImage : ()V
    //   110: iconst_1
    //   111: ireturn
    //   112: aload_1
    //   113: getfield arg1 : I
    //   116: ifeq -> 124
    //   119: iconst_1
    //   120: istore_3
    //   121: goto -> 126
    //   124: iconst_0
    //   125: istore_3
    //   126: iconst_0
    //   127: invokestatic eglGetDisplay : (I)Landroid/opengl/EGLDisplay;
    //   130: astore #4
    //   132: aload #4
    //   134: ifnull -> 143
    //   137: iconst_1
    //   138: istore #5
    //   140: goto -> 146
    //   143: iconst_0
    //   144: istore #5
    //   146: iload #5
    //   148: ldc 'eglGetDisplay failed'
    //   150: invokestatic f : (ZLjava/lang/Object;)V
    //   153: iconst_2
    //   154: newarray int
    //   156: astore_1
    //   157: aload #4
    //   159: aload_1
    //   160: iconst_0
    //   161: aload_1
    //   162: iconst_1
    //   163: invokestatic eglInitialize : (Landroid/opengl/EGLDisplay;[II[II)Z
    //   166: ldc 'eglInitialize failed'
    //   168: invokestatic f : (ZLjava/lang/Object;)V
    //   171: iconst_1
    //   172: anewarray android/opengl/EGLConfig
    //   175: astore #6
    //   177: iconst_1
    //   178: newarray int
    //   180: astore_1
    //   181: aload #4
    //   183: bipush #17
    //   185: newarray int
    //   187: dup
    //   188: iconst_0
    //   189: sipush #12352
    //   192: iastore
    //   193: dup
    //   194: iconst_1
    //   195: iconst_4
    //   196: iastore
    //   197: dup
    //   198: iconst_2
    //   199: sipush #12324
    //   202: iastore
    //   203: dup
    //   204: iconst_3
    //   205: bipush #8
    //   207: iastore
    //   208: dup
    //   209: iconst_4
    //   210: sipush #12323
    //   213: iastore
    //   214: dup
    //   215: iconst_5
    //   216: bipush #8
    //   218: iastore
    //   219: dup
    //   220: bipush #6
    //   222: sipush #12322
    //   225: iastore
    //   226: dup
    //   227: bipush #7
    //   229: bipush #8
    //   231: iastore
    //   232: dup
    //   233: bipush #8
    //   235: sipush #12321
    //   238: iastore
    //   239: dup
    //   240: bipush #9
    //   242: bipush #8
    //   244: iastore
    //   245: dup
    //   246: bipush #10
    //   248: sipush #12325
    //   251: iastore
    //   252: dup
    //   253: bipush #11
    //   255: iconst_0
    //   256: iastore
    //   257: dup
    //   258: bipush #12
    //   260: sipush #12327
    //   263: iastore
    //   264: dup
    //   265: bipush #13
    //   267: sipush #12344
    //   270: iastore
    //   271: dup
    //   272: bipush #14
    //   274: sipush #12339
    //   277: iastore
    //   278: dup
    //   279: bipush #15
    //   281: iconst_4
    //   282: iastore
    //   283: dup
    //   284: bipush #16
    //   286: sipush #12344
    //   289: iastore
    //   290: iconst_0
    //   291: aload #6
    //   293: iconst_0
    //   294: iconst_1
    //   295: aload_1
    //   296: iconst_0
    //   297: invokestatic eglChooseConfig : (Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z
    //   300: ifeq -> 322
    //   303: aload_1
    //   304: iconst_0
    //   305: iaload
    //   306: ifle -> 322
    //   309: aload #6
    //   311: iconst_0
    //   312: aaload
    //   313: ifnull -> 322
    //   316: iconst_1
    //   317: istore #5
    //   319: goto -> 325
    //   322: iconst_0
    //   323: istore #5
    //   325: iload #5
    //   327: ldc 'eglChooseConfig failed'
    //   329: invokestatic f : (ZLjava/lang/Object;)V
    //   332: aload #6
    //   334: iconst_0
    //   335: aaload
    //   336: astore #6
    //   338: iload_3
    //   339: ifeq -> 375
    //   342: iconst_5
    //   343: newarray int
    //   345: astore_1
    //   346: aload_1
    //   347: iconst_0
    //   348: sipush #12440
    //   351: iastore
    //   352: aload_1
    //   353: iconst_1
    //   354: iconst_2
    //   355: iastore
    //   356: aload_1
    //   357: iconst_2
    //   358: sipush #12992
    //   361: iastore
    //   362: aload_1
    //   363: iconst_3
    //   364: iconst_1
    //   365: iastore
    //   366: aload_1
    //   367: iconst_4
    //   368: sipush #12344
    //   371: iastore
    //   372: goto -> 395
    //   375: iconst_3
    //   376: newarray int
    //   378: astore_1
    //   379: aload_1
    //   380: iconst_0
    //   381: sipush #12440
    //   384: iastore
    //   385: aload_1
    //   386: iconst_1
    //   387: iconst_2
    //   388: iastore
    //   389: aload_1
    //   390: iconst_2
    //   391: sipush #12344
    //   394: iastore
    //   395: aload #4
    //   397: aload #6
    //   399: getstatic android/opengl/EGL14.EGL_NO_CONTEXT : Landroid/opengl/EGLContext;
    //   402: aload_1
    //   403: iconst_0
    //   404: invokestatic eglCreateContext : (Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;
    //   407: astore #7
    //   409: aload #7
    //   411: ifnull -> 420
    //   414: iconst_1
    //   415: istore #5
    //   417: goto -> 423
    //   420: iconst_0
    //   421: istore #5
    //   423: iload #5
    //   425: ldc 'eglCreateContext failed'
    //   427: invokestatic f : (ZLjava/lang/Object;)V
    //   430: iload_3
    //   431: ifeq -> 479
    //   434: bipush #7
    //   436: newarray int
    //   438: astore_1
    //   439: aload_1
    //   440: iconst_0
    //   441: sipush #12375
    //   444: iastore
    //   445: aload_1
    //   446: iconst_1
    //   447: iconst_1
    //   448: iastore
    //   449: aload_1
    //   450: iconst_2
    //   451: sipush #12374
    //   454: iastore
    //   455: aload_1
    //   456: iconst_3
    //   457: iconst_1
    //   458: iastore
    //   459: aload_1
    //   460: iconst_4
    //   461: sipush #12992
    //   464: iastore
    //   465: aload_1
    //   466: iconst_5
    //   467: iconst_1
    //   468: iastore
    //   469: aload_1
    //   470: bipush #6
    //   472: sipush #12344
    //   475: iastore
    //   476: goto -> 509
    //   479: iconst_5
    //   480: newarray int
    //   482: astore_1
    //   483: aload_1
    //   484: iconst_0
    //   485: sipush #12375
    //   488: iastore
    //   489: aload_1
    //   490: iconst_1
    //   491: iconst_1
    //   492: iastore
    //   493: aload_1
    //   494: iconst_2
    //   495: sipush #12374
    //   498: iastore
    //   499: aload_1
    //   500: iconst_3
    //   501: iconst_1
    //   502: iastore
    //   503: aload_1
    //   504: iconst_4
    //   505: sipush #12344
    //   508: iastore
    //   509: aload #4
    //   511: aload #6
    //   513: aload_1
    //   514: iconst_0
    //   515: invokestatic eglCreatePbufferSurface : (Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;[II)Landroid/opengl/EGLSurface;
    //   518: astore_1
    //   519: aload_1
    //   520: ifnull -> 529
    //   523: iconst_1
    //   524: istore #5
    //   526: goto -> 532
    //   529: iconst_0
    //   530: istore #5
    //   532: iload #5
    //   534: ldc 'eglCreatePbufferSurface failed'
    //   536: invokestatic f : (ZLjava/lang/Object;)V
    //   539: aload #4
    //   541: aload_1
    //   542: aload_1
    //   543: aload #7
    //   545: invokestatic eglMakeCurrent : (Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z
    //   548: ldc 'eglMakeCurrent failed'
    //   550: invokestatic f : (ZLjava/lang/Object;)V
    //   553: iconst_1
    //   554: aload_0
    //   555: getfield b : [I
    //   558: iconst_0
    //   559: invokestatic glGenTextures : (I[II)V
    //   562: new android/graphics/SurfaceTexture
    //   565: astore_1
    //   566: aload_1
    //   567: aload_0
    //   568: getfield b : [I
    //   571: iconst_0
    //   572: iaload
    //   573: invokespecial <init> : (I)V
    //   576: aload_0
    //   577: aload_1
    //   578: putfield d : Landroid/graphics/SurfaceTexture;
    //   581: aload_1
    //   582: aload_0
    //   583: invokevirtual setOnFrameAvailableListener : (Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V
    //   586: new com/google/android/gms/internal/ads/zzqa
    //   589: astore_1
    //   590: aload_1
    //   591: aload_0
    //   592: aload_0
    //   593: getfield d : Landroid/graphics/SurfaceTexture;
    //   596: iload_3
    //   597: aconst_null
    //   598: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ek2;Landroid/graphics/SurfaceTexture;ZLcom/google/android/gms/internal/ads/bk2;)V
    //   601: aload_0
    //   602: aload_1
    //   603: putfield g : Lcom/google/android/gms/internal/ads/zzqa;
    //   606: aload_0
    //   607: monitorenter
    //   608: aload_0
    //   609: invokevirtual notify : ()V
    //   612: aload_0
    //   613: monitorexit
    //   614: goto -> 680
    //   617: astore_1
    //   618: aload_0
    //   619: monitorexit
    //   620: aload_1
    //   621: athrow
    //   622: astore_1
    //   623: goto -> 687
    //   626: astore_1
    //   627: ldc 'DummySurface'
    //   629: ldc 'Failed to initialize dummy surface'
    //   631: aload_1
    //   632: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   635: pop
    //   636: aload_0
    //   637: aload_1
    //   638: putfield e : Ljava/lang/Error;
    //   641: aload_0
    //   642: monitorenter
    //   643: aload_0
    //   644: invokevirtual notify : ()V
    //   647: aload_0
    //   648: monitorexit
    //   649: goto -> 680
    //   652: astore_1
    //   653: aload_0
    //   654: monitorexit
    //   655: aload_1
    //   656: athrow
    //   657: astore_1
    //   658: ldc 'DummySurface'
    //   660: ldc 'Failed to initialize dummy surface'
    //   662: aload_1
    //   663: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   666: pop
    //   667: aload_0
    //   668: aload_1
    //   669: putfield f : Ljava/lang/RuntimeException;
    //   672: aload_0
    //   673: monitorenter
    //   674: aload_0
    //   675: invokevirtual notify : ()V
    //   678: aload_0
    //   679: monitorexit
    //   680: iconst_1
    //   681: ireturn
    //   682: astore_1
    //   683: aload_0
    //   684: monitorexit
    //   685: aload_1
    //   686: athrow
    //   687: aload_0
    //   688: monitorenter
    //   689: aload_0
    //   690: invokevirtual notify : ()V
    //   693: aload_0
    //   694: monitorexit
    //   695: aload_1
    //   696: athrow
    //   697: astore_1
    //   698: aload_0
    //   699: monitorexit
    //   700: aload_1
    //   701: athrow
    // Exception table:
    //   from	to	target	type
    //   22	29	56	finally
    //   29	48	78	finally
    //   57	78	78	finally
    //   79	88	95	finally
    //   112	119	657	java/lang/RuntimeException
    //   112	119	626	java/lang/Error
    //   112	119	622	finally
    //   126	132	657	java/lang/RuntimeException
    //   126	132	626	java/lang/Error
    //   126	132	622	finally
    //   146	303	657	java/lang/RuntimeException
    //   146	303	626	java/lang/Error
    //   146	303	622	finally
    //   325	332	657	java/lang/RuntimeException
    //   325	332	626	java/lang/Error
    //   325	332	622	finally
    //   342	346	657	java/lang/RuntimeException
    //   342	346	626	java/lang/Error
    //   342	346	622	finally
    //   375	379	657	java/lang/RuntimeException
    //   375	379	626	java/lang/Error
    //   375	379	622	finally
    //   395	409	657	java/lang/RuntimeException
    //   395	409	626	java/lang/Error
    //   395	409	622	finally
    //   423	430	657	java/lang/RuntimeException
    //   423	430	626	java/lang/Error
    //   423	430	622	finally
    //   434	439	657	java/lang/RuntimeException
    //   434	439	626	java/lang/Error
    //   434	439	622	finally
    //   479	483	657	java/lang/RuntimeException
    //   479	483	626	java/lang/Error
    //   479	483	622	finally
    //   509	519	657	java/lang/RuntimeException
    //   509	519	626	java/lang/Error
    //   509	519	622	finally
    //   532	606	657	java/lang/RuntimeException
    //   532	606	626	java/lang/Error
    //   532	606	622	finally
    //   608	614	617	finally
    //   618	620	617	finally
    //   627	641	622	finally
    //   643	649	652	finally
    //   653	655	652	finally
    //   658	672	622	finally
    //   674	680	682	finally
    //   683	685	682	finally
    //   689	695	697	finally
    //   698	700	697	finally
  }
  
  public final void onFrameAvailable(SurfaceTexture paramSurfaceTexture) {
    this.c.sendEmptyMessage(2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ek2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */