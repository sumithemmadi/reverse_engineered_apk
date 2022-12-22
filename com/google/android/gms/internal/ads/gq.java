package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class gq extends up implements hj2<ti2> {
  private String e;
  
  private final bo f;
  
  private boolean g;
  
  private final hq h;
  
  private final lp i;
  
  private ByteBuffer j;
  
  private boolean k;
  
  private final Object l;
  
  private final String m;
  
  private final int n;
  
  private boolean o;
  
  public gq(eo parameo, bo parambo) {
    super(parameo);
    String str;
    boolean bool;
    this.f = parambo;
    this.h = new hq();
    this.i = new lp();
    this.l = new Object();
    if (parameo != null) {
      str = parameo.g0();
    } else {
      str = "";
    } 
    this.m = str;
    if (parameo != null) {
      bool = parameo.D0();
    } else {
      bool = false;
    } 
    this.n = bool;
  }
  
  private final void B() {
    boolean bool;
    int i = (int)this.h.b();
    int j = (int)this.i.a(this.j);
    int k = this.j.position();
    int m = Math.round(j * k / i);
    if (m > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    int n = ap.K();
    int i1 = ap.L();
    String str = this.e;
    l(str, super.x(str), k, i, m, j, bool, n, i1);
  }
  
  public final String A() {
    return this.e;
  }
  
  public final boolean C() {
    return this.o;
  }
  
  public final void g() {
    this.g = true;
  }
  
  public final boolean w(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield e : Ljava/lang/String;
    //   5: aload_0
    //   6: aload_1
    //   7: invokevirtual x : (Ljava/lang/String;)Ljava/lang/String;
    //   10: astore_2
    //   11: ldc 'error'
    //   13: astore_3
    //   14: aload_3
    //   15: astore #4
    //   17: new com/google/android/gms/internal/ads/zi2
    //   20: astore #5
    //   22: aload_3
    //   23: astore #4
    //   25: aload_0
    //   26: getfield c : Ljava/lang/String;
    //   29: astore #6
    //   31: aload_3
    //   32: astore #4
    //   34: aload_0
    //   35: getfield f : Lcom/google/android/gms/internal/ads/bo;
    //   38: astore #7
    //   40: aload_3
    //   41: astore #4
    //   43: aload #5
    //   45: aload #6
    //   47: aconst_null
    //   48: aload_0
    //   49: aload #7
    //   51: getfield d : I
    //   54: aload #7
    //   56: getfield f : I
    //   59: iconst_1
    //   60: aconst_null
    //   61: invokespecial <init> : (Ljava/lang/String;Lcom/google/android/gms/internal/ads/sj2;Lcom/google/android/gms/internal/ads/hj2;IIZLcom/google/android/gms/internal/ads/bj2;)V
    //   64: aload_3
    //   65: astore #4
    //   67: aload_0
    //   68: getfield f : Lcom/google/android/gms/internal/ads/bo;
    //   71: getfield j : Z
    //   74: istore #8
    //   76: aload #5
    //   78: astore #7
    //   80: iload #8
    //   82: ifeq -> 124
    //   85: aload_3
    //   86: astore #4
    //   88: new com/google/android/gms/internal/ads/wo
    //   91: astore #7
    //   93: aload_3
    //   94: astore #4
    //   96: aload #7
    //   98: aload_0
    //   99: getfield b : Landroid/content/Context;
    //   102: aload #5
    //   104: aload_0
    //   105: getfield m : Ljava/lang/String;
    //   108: aload_0
    //   109: getfield n : I
    //   112: aconst_null
    //   113: aconst_null
    //   114: invokespecial <init> : (Landroid/content/Context;Lcom/google/android/gms/internal/ads/ti2;Ljava/lang/String;ILcom/google/android/gms/internal/ads/hj2;Lcom/google/android/gms/internal/ads/yo;)V
    //   117: goto -> 124
    //   120: astore_3
    //   121: goto -> 730
    //   124: aload_3
    //   125: astore #4
    //   127: aload_1
    //   128: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   131: astore #6
    //   133: aload_3
    //   134: astore #4
    //   136: new com/google/android/gms/internal/ads/xi2
    //   139: astore #5
    //   141: aload_3
    //   142: astore #4
    //   144: aload #5
    //   146: aload #6
    //   148: invokespecial <init> : (Landroid/net/Uri;)V
    //   151: aload_3
    //   152: astore #4
    //   154: aload #7
    //   156: aload #5
    //   158: invokeinterface a : (Lcom/google/android/gms/internal/ads/xi2;)J
    //   163: pop2
    //   164: aload_3
    //   165: astore #4
    //   167: aload_0
    //   168: getfield d : Ljava/lang/ref/WeakReference;
    //   171: invokevirtual get : ()Ljava/lang/Object;
    //   174: checkcast com/google/android/gms/internal/ads/eo
    //   177: astore #5
    //   179: aload #5
    //   181: ifnull -> 196
    //   184: aload_3
    //   185: astore #4
    //   187: aload #5
    //   189: aload_2
    //   190: aload_0
    //   191: invokeinterface j : (Ljava/lang/String;Lcom/google/android/gms/internal/ads/up;)V
    //   196: aload_3
    //   197: astore #4
    //   199: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   202: astore #6
    //   204: aload_3
    //   205: astore #4
    //   207: aload #6
    //   209: invokeinterface a : ()J
    //   214: lstore #9
    //   216: aload_3
    //   217: astore #4
    //   219: getstatic com/google/android/gms/internal/ads/m0.s : Lcom/google/android/gms/internal/ads/x;
    //   222: astore #5
    //   224: aload_3
    //   225: astore #4
    //   227: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   230: aload #5
    //   232: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   235: checkcast java/lang/Long
    //   238: invokevirtual longValue : ()J
    //   241: lstore #11
    //   243: aload_3
    //   244: astore #4
    //   246: getstatic com/google/android/gms/internal/ads/m0.r : Lcom/google/android/gms/internal/ads/x;
    //   249: astore #5
    //   251: aload_3
    //   252: astore #4
    //   254: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   257: aload #5
    //   259: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   262: checkcast java/lang/Long
    //   265: invokevirtual longValue : ()J
    //   268: lstore #13
    //   270: aload_3
    //   271: astore #4
    //   273: aload_0
    //   274: aload_0
    //   275: getfield f : Lcom/google/android/gms/internal/ads/bo;
    //   278: getfield c : I
    //   281: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   284: putfield j : Ljava/nio/ByteBuffer;
    //   287: aload_3
    //   288: astore #4
    //   290: sipush #8192
    //   293: newarray byte
    //   295: astore #15
    //   297: lload #9
    //   299: lstore #16
    //   301: aload_3
    //   302: astore #4
    //   304: aload #7
    //   306: aload #15
    //   308: iconst_0
    //   309: aload_0
    //   310: getfield j : Ljava/nio/ByteBuffer;
    //   313: invokevirtual remaining : ()I
    //   316: sipush #8192
    //   319: invokestatic min : (II)I
    //   322: invokeinterface read : ([BII)I
    //   327: istore #18
    //   329: iload #18
    //   331: iconst_m1
    //   332: if_icmpne -> 368
    //   335: aload_3
    //   336: astore #4
    //   338: aload_0
    //   339: iconst_1
    //   340: putfield o : Z
    //   343: aload_3
    //   344: astore #4
    //   346: aload_0
    //   347: aload_1
    //   348: aload_2
    //   349: aload_0
    //   350: getfield i : Lcom/google/android/gms/internal/ads/lp;
    //   353: aload_0
    //   354: getfield j : Ljava/nio/ByteBuffer;
    //   357: invokevirtual a : (Ljava/nio/ByteBuffer;)J
    //   360: l2i
    //   361: i2l
    //   362: invokevirtual p : (Ljava/lang/String;Ljava/lang/String;J)V
    //   365: goto -> 442
    //   368: aload_3
    //   369: astore #4
    //   371: aload_0
    //   372: getfield l : Ljava/lang/Object;
    //   375: astore #5
    //   377: aload_3
    //   378: astore #4
    //   380: aload #5
    //   382: monitorenter
    //   383: aload_0
    //   384: getfield g : Z
    //   387: ifne -> 413
    //   390: aload_0
    //   391: getfield j : Ljava/nio/ByteBuffer;
    //   394: astore #19
    //   396: aload_3
    //   397: astore #4
    //   399: aload #19
    //   401: aload #15
    //   403: iconst_0
    //   404: iload #18
    //   406: invokevirtual put : ([BII)Ljava/nio/ByteBuffer;
    //   409: pop
    //   410: goto -> 413
    //   413: aload_3
    //   414: astore #4
    //   416: aload #5
    //   418: monitorexit
    //   419: aload_3
    //   420: astore #4
    //   422: aload_0
    //   423: getfield j : Ljava/nio/ByteBuffer;
    //   426: invokevirtual remaining : ()I
    //   429: ifgt -> 444
    //   432: aload_3
    //   433: astore #4
    //   435: aload_0
    //   436: invokespecial B : ()V
    //   439: goto -> 365
    //   442: iconst_1
    //   443: ireturn
    //   444: aload_3
    //   445: astore #4
    //   447: aload_0
    //   448: getfield g : Z
    //   451: ifne -> 603
    //   454: aload_3
    //   455: astore #4
    //   457: aload #6
    //   459: invokeinterface a : ()J
    //   464: lstore #20
    //   466: lload #16
    //   468: lstore #22
    //   470: lload #20
    //   472: lload #16
    //   474: lsub
    //   475: lload #11
    //   477: lcmp
    //   478: iflt -> 492
    //   481: aload_3
    //   482: astore #4
    //   484: aload_0
    //   485: invokespecial B : ()V
    //   488: lload #20
    //   490: lstore #22
    //   492: lload #20
    //   494: lload #9
    //   496: lsub
    //   497: ldc2_w 1000
    //   500: lload #13
    //   502: lmul
    //   503: lcmp
    //   504: ifgt -> 514
    //   507: lload #22
    //   509: lstore #16
    //   511: goto -> 301
    //   514: ldc 'downloadTimeout'
    //   516: astore_3
    //   517: aload_3
    //   518: astore #4
    //   520: new java/lang/StringBuilder
    //   523: astore #7
    //   525: aload_3
    //   526: astore #4
    //   528: aload #7
    //   530: bipush #49
    //   532: invokespecial <init> : (I)V
    //   535: aload_3
    //   536: astore #4
    //   538: aload #7
    //   540: ldc 'Timeout exceeded. Limit: '
    //   542: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   545: pop
    //   546: aload_3
    //   547: astore #4
    //   549: aload #7
    //   551: lload #13
    //   553: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   556: pop
    //   557: aload_3
    //   558: astore #4
    //   560: aload #7
    //   562: ldc_w ' sec'
    //   565: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   568: pop
    //   569: aload_3
    //   570: astore #4
    //   572: aload #7
    //   574: invokevirtual toString : ()Ljava/lang/String;
    //   577: astore #5
    //   579: aload_3
    //   580: astore #4
    //   582: new java/io/IOException
    //   585: astore #7
    //   587: aload_3
    //   588: astore #4
    //   590: aload #7
    //   592: aload #5
    //   594: invokespecial <init> : (Ljava/lang/String;)V
    //   597: aload_3
    //   598: astore #4
    //   600: aload #7
    //   602: athrow
    //   603: ldc_w 'externalAbort'
    //   606: astore_3
    //   607: aload_3
    //   608: astore #4
    //   610: new java/io/IOException
    //   613: astore #5
    //   615: aload_3
    //   616: astore #4
    //   618: aload_0
    //   619: getfield j : Ljava/nio/ByteBuffer;
    //   622: invokevirtual limit : ()I
    //   625: istore #18
    //   627: aload_3
    //   628: astore #4
    //   630: new java/lang/StringBuilder
    //   633: astore #7
    //   635: aload_3
    //   636: astore #4
    //   638: aload #7
    //   640: bipush #35
    //   642: invokespecial <init> : (I)V
    //   645: aload_3
    //   646: astore #4
    //   648: aload #7
    //   650: ldc_w 'Precache abort at '
    //   653: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   656: pop
    //   657: aload_3
    //   658: astore #4
    //   660: aload #7
    //   662: iload #18
    //   664: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   667: pop
    //   668: aload_3
    //   669: astore #4
    //   671: aload #7
    //   673: ldc_w ' bytes'
    //   676: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   679: pop
    //   680: aload_3
    //   681: astore #4
    //   683: aload #5
    //   685: aload #7
    //   687: invokevirtual toString : ()Ljava/lang/String;
    //   690: invokespecial <init> : (Ljava/lang/String;)V
    //   693: aload_3
    //   694: astore #4
    //   696: aload #5
    //   698: athrow
    //   699: astore #4
    //   701: aload #4
    //   703: astore #7
    //   705: aload_3
    //   706: astore #4
    //   708: aload #5
    //   710: monitorexit
    //   711: aload_3
    //   712: astore #4
    //   714: aload #7
    //   716: athrow
    //   717: astore_3
    //   718: goto -> 730
    //   721: astore #7
    //   723: aload #4
    //   725: astore_3
    //   726: goto -> 705
    //   729: astore_3
    //   730: aload_3
    //   731: invokevirtual getClass : ()Ljava/lang/Class;
    //   734: invokevirtual getCanonicalName : ()Ljava/lang/String;
    //   737: astore #7
    //   739: aload_3
    //   740: invokevirtual getMessage : ()Ljava/lang/String;
    //   743: astore #5
    //   745: new java/lang/StringBuilder
    //   748: dup
    //   749: aload #7
    //   751: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   754: invokevirtual length : ()I
    //   757: iconst_1
    //   758: iadd
    //   759: aload #5
    //   761: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   764: invokevirtual length : ()I
    //   767: iadd
    //   768: invokespecial <init> : (I)V
    //   771: astore_3
    //   772: aload_3
    //   773: aload #7
    //   775: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   778: pop
    //   779: aload_3
    //   780: ldc_w ':'
    //   783: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   786: pop
    //   787: aload_3
    //   788: aload #5
    //   790: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   793: pop
    //   794: aload_3
    //   795: invokevirtual toString : ()Ljava/lang/String;
    //   798: astore_3
    //   799: new java/lang/StringBuilder
    //   802: dup
    //   803: aload_1
    //   804: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   807: invokevirtual length : ()I
    //   810: bipush #34
    //   812: iadd
    //   813: aload_3
    //   814: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   817: invokevirtual length : ()I
    //   820: iadd
    //   821: invokespecial <init> : (I)V
    //   824: astore #7
    //   826: aload #7
    //   828: ldc_w 'Failed to preload url '
    //   831: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   834: pop
    //   835: aload #7
    //   837: aload_1
    //   838: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   841: pop
    //   842: aload #7
    //   844: ldc_w ' Exception: '
    //   847: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   850: pop
    //   851: aload #7
    //   853: aload_3
    //   854: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   857: pop
    //   858: aload #7
    //   860: invokevirtual toString : ()Ljava/lang/String;
    //   863: invokestatic i : (Ljava/lang/String;)V
    //   866: aload_0
    //   867: aload_1
    //   868: aload_2
    //   869: aload #4
    //   871: aload_3
    //   872: invokevirtual n : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   875: iconst_0
    //   876: ireturn
    // Exception table:
    //   from	to	target	type
    //   17	22	729	java/lang/Exception
    //   25	31	729	java/lang/Exception
    //   34	40	729	java/lang/Exception
    //   43	64	729	java/lang/Exception
    //   67	76	729	java/lang/Exception
    //   88	93	120	java/lang/Exception
    //   96	117	120	java/lang/Exception
    //   127	133	729	java/lang/Exception
    //   136	141	729	java/lang/Exception
    //   144	151	729	java/lang/Exception
    //   154	164	729	java/lang/Exception
    //   167	179	729	java/lang/Exception
    //   187	196	120	java/lang/Exception
    //   199	204	729	java/lang/Exception
    //   207	216	729	java/lang/Exception
    //   219	224	729	java/lang/Exception
    //   227	243	729	java/lang/Exception
    //   246	251	729	java/lang/Exception
    //   254	270	729	java/lang/Exception
    //   273	287	729	java/lang/Exception
    //   290	297	729	java/lang/Exception
    //   304	329	729	java/lang/Exception
    //   338	343	120	java/lang/Exception
    //   346	365	120	java/lang/Exception
    //   371	377	729	java/lang/Exception
    //   380	383	729	java/lang/Exception
    //   383	396	699	finally
    //   399	410	721	finally
    //   416	419	721	finally
    //   422	432	717	java/lang/Exception
    //   435	439	717	java/lang/Exception
    //   447	454	717	java/lang/Exception
    //   457	466	717	java/lang/Exception
    //   484	488	717	java/lang/Exception
    //   520	525	120	java/lang/Exception
    //   528	535	120	java/lang/Exception
    //   538	546	120	java/lang/Exception
    //   549	557	120	java/lang/Exception
    //   560	569	120	java/lang/Exception
    //   572	579	120	java/lang/Exception
    //   582	587	120	java/lang/Exception
    //   590	597	120	java/lang/Exception
    //   600	603	120	java/lang/Exception
    //   610	615	120	java/lang/Exception
    //   618	627	120	java/lang/Exception
    //   630	635	120	java/lang/Exception
    //   638	645	120	java/lang/Exception
    //   648	657	120	java/lang/Exception
    //   660	668	120	java/lang/Exception
    //   671	680	120	java/lang/Exception
    //   683	693	120	java/lang/Exception
    //   696	699	120	java/lang/Exception
    //   708	711	721	finally
    //   714	717	717	java/lang/Exception
  }
  
  protected final String x(String paramString) {
    paramString = String.valueOf(super.x(paramString));
    return (paramString.length() != 0) ? "cache:".concat(paramString) : new String("cache:");
  }
  
  public final ByteBuffer z() {
    synchronized (this.l) {
      ByteBuffer byteBuffer = this.j;
      if (byteBuffer != null && !this.k) {
        byteBuffer.flip();
        this.k = true;
      } 
      this.g = true;
      return this.j;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */