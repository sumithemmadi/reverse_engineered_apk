package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.k;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

public final class wo implements ti2 {
  private final hj2<ti2> b;
  
  private final Context c;
  
  private final ti2 d;
  
  private final yo e;
  
  private final String f;
  
  private final int g;
  
  private final boolean h;
  
  private InputStream i;
  
  private boolean j;
  
  private Uri k;
  
  private volatile zzth l;
  
  private boolean m;
  
  private boolean n;
  
  private boolean o;
  
  private boolean p;
  
  private long q;
  
  private ot1<Long> r;
  
  private final AtomicLong s;
  
  public wo(Context paramContext, ti2 paramti2, String paramString, int paramInt, hj2<ti2> paramhj2, yo paramyo) {
    this.c = paramContext;
    this.d = paramti2;
    this.b = paramhj2;
    this.e = paramyo;
    this.f = paramString;
    this.g = paramInt;
    this.m = false;
    this.n = false;
    this.o = false;
    this.p = false;
    this.q = 0L;
    this.s = new AtomicLong(-1L);
    this.r = null;
    x<Boolean> x = m0.D1;
    this.h = ((Boolean)er2.e().<Boolean>c(x)).booleanValue();
  }
  
  private final boolean e() {
    if (!this.h)
      return false; 
    x<Boolean> x = m0.b3;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue() && !this.o)
      return true; 
    x = m0.c3;
    return (((Boolean)er2.e().<Boolean>c(x)).booleanValue() && !this.p);
  }
  
  private final void g(xi2 paramxi2) {
    hj2<ti2> hj21 = this.b;
    if (hj21 != null)
      hj21.k(this, paramxi2); 
  }
  
  public final long a(xi2 paramxi2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield j : Z
    //   4: ifne -> 892
    //   7: iconst_1
    //   8: istore_2
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield j : Z
    //   14: aload_0
    //   15: aload_1
    //   16: getfield a : Landroid/net/Uri;
    //   19: putfield k : Landroid/net/Uri;
    //   22: aload_0
    //   23: getfield h : Z
    //   26: ifne -> 34
    //   29: aload_0
    //   30: aload_1
    //   31: invokespecial g : (Lcom/google/android/gms/internal/ads/xi2;)V
    //   34: aload_0
    //   35: aload_1
    //   36: getfield a : Landroid/net/Uri;
    //   39: invokestatic p0 : (Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/zzth;
    //   42: putfield l : Lcom/google/android/gms/internal/ads/zzth;
    //   45: getstatic com/google/android/gms/internal/ads/m0.Y2 : Lcom/google/android/gms/internal/ads/x;
    //   48: astore_3
    //   49: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   52: aload_3
    //   53: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   56: checkcast java/lang/Boolean
    //   59: invokevirtual booleanValue : ()Z
    //   62: ifeq -> 690
    //   65: aload_0
    //   66: getfield l : Lcom/google/android/gms/internal/ads/zzth;
    //   69: ifnull -> 825
    //   72: aload_0
    //   73: getfield l : Lcom/google/android/gms/internal/ads/zzth;
    //   76: aload_1
    //   77: getfield d : J
    //   80: putfield i : J
    //   83: aload_0
    //   84: getfield l : Lcom/google/android/gms/internal/ads/zzth;
    //   87: aload_0
    //   88: getfield f : Ljava/lang/String;
    //   91: invokestatic d : (Ljava/lang/String;)Ljava/lang/String;
    //   94: putfield j : Ljava/lang/String;
    //   97: aload_0
    //   98: getfield l : Lcom/google/android/gms/internal/ads/zzth;
    //   101: aload_0
    //   102: getfield g : I
    //   105: putfield k : I
    //   108: aload_0
    //   109: getfield l : Lcom/google/android/gms/internal/ads/zzth;
    //   112: getfield h : Z
    //   115: ifeq -> 136
    //   118: getstatic com/google/android/gms/internal/ads/m0.a3 : Lcom/google/android/gms/internal/ads/x;
    //   121: astore_3
    //   122: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   125: aload_3
    //   126: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   129: checkcast java/lang/Long
    //   132: astore_3
    //   133: goto -> 151
    //   136: getstatic com/google/android/gms/internal/ads/m0.Z2 : Lcom/google/android/gms/internal/ads/x;
    //   139: astore_3
    //   140: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   143: aload_3
    //   144: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   147: checkcast java/lang/Long
    //   150: astore_3
    //   151: aload_3
    //   152: invokevirtual longValue : ()J
    //   155: lstore #4
    //   157: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   160: invokeinterface b : ()J
    //   165: lstore #6
    //   167: invokestatic w : ()Lcom/google/android/gms/internal/ads/vn2;
    //   170: pop
    //   171: aload_0
    //   172: getfield c : Landroid/content/Context;
    //   175: aload_0
    //   176: getfield l : Lcom/google/android/gms/internal/ads/zzth;
    //   179: invokestatic a : (Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzth;)Ljava/util/concurrent/Future;
    //   182: astore_3
    //   183: aload_3
    //   184: lload #4
    //   186: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   189: invokeinterface get : (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //   194: checkcast com/google/android/gms/internal/ads/yn2
    //   197: astore #8
    //   199: aload_0
    //   200: aload #8
    //   202: invokevirtual c : ()Z
    //   205: putfield m : Z
    //   208: aload_0
    //   209: aload #8
    //   211: invokevirtual f : ()Z
    //   214: putfield o : Z
    //   217: aload_0
    //   218: aload #8
    //   220: invokevirtual d : ()Z
    //   223: putfield p : Z
    //   226: aload_0
    //   227: aload #8
    //   229: invokevirtual e : ()J
    //   232: putfield q : J
    //   235: aload_0
    //   236: invokespecial e : ()Z
    //   239: ifne -> 335
    //   242: aload_0
    //   243: aload #8
    //   245: invokevirtual a : ()Ljava/io/InputStream;
    //   248: putfield i : Ljava/io/InputStream;
    //   251: aload_0
    //   252: getfield h : Z
    //   255: ifeq -> 263
    //   258: aload_0
    //   259: aload_1
    //   260: invokespecial g : (Lcom/google/android/gms/internal/ads/xi2;)V
    //   263: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   266: invokeinterface b : ()J
    //   271: lload #6
    //   273: lsub
    //   274: lstore #6
    //   276: aload_0
    //   277: getfield e : Lcom/google/android/gms/internal/ads/yo;
    //   280: iconst_1
    //   281: lload #6
    //   283: invokeinterface b : (ZJ)V
    //   288: aload_0
    //   289: iconst_1
    //   290: putfield n : Z
    //   293: new java/lang/StringBuilder
    //   296: dup
    //   297: bipush #44
    //   299: invokespecial <init> : (I)V
    //   302: astore_1
    //   303: aload_1
    //   304: ldc 'Cache connection took '
    //   306: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: pop
    //   310: aload_1
    //   311: lload #6
    //   313: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   316: pop
    //   317: aload_1
    //   318: ldc 'ms'
    //   320: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: pop
    //   324: aload_1
    //   325: invokevirtual toString : ()Ljava/lang/String;
    //   328: invokestatic m : (Ljava/lang/String;)V
    //   331: ldc2_w -1
    //   334: lreturn
    //   335: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   338: invokeinterface b : ()J
    //   343: lload #6
    //   345: lsub
    //   346: lstore #6
    //   348: aload_0
    //   349: getfield e : Lcom/google/android/gms/internal/ads/yo;
    //   352: iconst_1
    //   353: lload #6
    //   355: invokeinterface b : (ZJ)V
    //   360: aload_0
    //   361: iconst_1
    //   362: putfield n : Z
    //   365: new java/lang/StringBuilder
    //   368: dup
    //   369: bipush #44
    //   371: invokespecial <init> : (I)V
    //   374: astore_3
    //   375: aload_3
    //   376: ldc 'Cache connection took '
    //   378: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   381: pop
    //   382: aload_3
    //   383: lload #6
    //   385: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   388: pop
    //   389: aload_3
    //   390: ldc 'ms'
    //   392: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   395: pop
    //   396: aload_3
    //   397: invokevirtual toString : ()Ljava/lang/String;
    //   400: invokestatic m : (Ljava/lang/String;)V
    //   403: goto -> 825
    //   406: astore_1
    //   407: goto -> 620
    //   410: astore #8
    //   412: iconst_1
    //   413: istore #9
    //   415: goto -> 437
    //   418: astore #8
    //   420: iconst_1
    //   421: istore #9
    //   423: goto -> 535
    //   426: astore_1
    //   427: iconst_0
    //   428: istore_2
    //   429: goto -> 620
    //   432: astore #8
    //   434: iconst_0
    //   435: istore #9
    //   437: iload #9
    //   439: istore_2
    //   440: aload_3
    //   441: iconst_1
    //   442: invokeinterface cancel : (Z)Z
    //   447: pop
    //   448: iload #9
    //   450: istore_2
    //   451: invokestatic currentThread : ()Ljava/lang/Thread;
    //   454: invokevirtual interrupt : ()V
    //   457: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   460: invokeinterface b : ()J
    //   465: lload #6
    //   467: lsub
    //   468: lstore #6
    //   470: aload_0
    //   471: getfield e : Lcom/google/android/gms/internal/ads/yo;
    //   474: iload #9
    //   476: lload #6
    //   478: invokeinterface b : (ZJ)V
    //   483: aload_0
    //   484: iload #9
    //   486: putfield n : Z
    //   489: new java/lang/StringBuilder
    //   492: dup
    //   493: bipush #44
    //   495: invokespecial <init> : (I)V
    //   498: astore_3
    //   499: aload_3
    //   500: ldc 'Cache connection took '
    //   502: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   505: pop
    //   506: aload_3
    //   507: lload #6
    //   509: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   512: pop
    //   513: aload_3
    //   514: ldc 'ms'
    //   516: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   519: pop
    //   520: aload_3
    //   521: invokevirtual toString : ()Ljava/lang/String;
    //   524: invokestatic m : (Ljava/lang/String;)V
    //   527: goto -> 825
    //   530: astore #8
    //   532: iconst_0
    //   533: istore #9
    //   535: iload #9
    //   537: istore_2
    //   538: aload_3
    //   539: iconst_1
    //   540: invokeinterface cancel : (Z)Z
    //   545: pop
    //   546: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   549: invokeinterface b : ()J
    //   554: lload #6
    //   556: lsub
    //   557: lstore #6
    //   559: aload_0
    //   560: getfield e : Lcom/google/android/gms/internal/ads/yo;
    //   563: iload #9
    //   565: lload #6
    //   567: invokeinterface b : (ZJ)V
    //   572: aload_0
    //   573: iload #9
    //   575: putfield n : Z
    //   578: new java/lang/StringBuilder
    //   581: dup
    //   582: bipush #44
    //   584: invokespecial <init> : (I)V
    //   587: astore_3
    //   588: aload_3
    //   589: ldc 'Cache connection took '
    //   591: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   594: pop
    //   595: aload_3
    //   596: lload #6
    //   598: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   601: pop
    //   602: aload_3
    //   603: ldc 'ms'
    //   605: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   608: pop
    //   609: aload_3
    //   610: invokevirtual toString : ()Ljava/lang/String;
    //   613: invokestatic m : (Ljava/lang/String;)V
    //   616: goto -> 825
    //   619: astore_1
    //   620: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   623: invokeinterface b : ()J
    //   628: lload #6
    //   630: lsub
    //   631: lstore #6
    //   633: aload_0
    //   634: getfield e : Lcom/google/android/gms/internal/ads/yo;
    //   637: iload_2
    //   638: lload #6
    //   640: invokeinterface b : (ZJ)V
    //   645: aload_0
    //   646: iload_2
    //   647: putfield n : Z
    //   650: new java/lang/StringBuilder
    //   653: dup
    //   654: bipush #44
    //   656: invokespecial <init> : (I)V
    //   659: astore_3
    //   660: aload_3
    //   661: ldc 'Cache connection took '
    //   663: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   666: pop
    //   667: aload_3
    //   668: lload #6
    //   670: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   673: pop
    //   674: aload_3
    //   675: ldc 'ms'
    //   677: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   680: pop
    //   681: aload_3
    //   682: invokevirtual toString : ()Ljava/lang/String;
    //   685: invokestatic m : (Ljava/lang/String;)V
    //   688: aload_1
    //   689: athrow
    //   690: aconst_null
    //   691: astore_3
    //   692: aload_0
    //   693: getfield l : Lcom/google/android/gms/internal/ads/zzth;
    //   696: ifnull -> 746
    //   699: aload_0
    //   700: getfield l : Lcom/google/android/gms/internal/ads/zzth;
    //   703: aload_1
    //   704: getfield d : J
    //   707: putfield i : J
    //   710: aload_0
    //   711: getfield l : Lcom/google/android/gms/internal/ads/zzth;
    //   714: aload_0
    //   715: getfield f : Ljava/lang/String;
    //   718: invokestatic d : (Ljava/lang/String;)Ljava/lang/String;
    //   721: putfield j : Ljava/lang/String;
    //   724: aload_0
    //   725: getfield l : Lcom/google/android/gms/internal/ads/zzth;
    //   728: aload_0
    //   729: getfield g : I
    //   732: putfield k : I
    //   735: invokestatic i : ()Lcom/google/android/gms/internal/ads/dn2;
    //   738: aload_0
    //   739: getfield l : Lcom/google/android/gms/internal/ads/zzth;
    //   742: invokevirtual d : (Lcom/google/android/gms/internal/ads/zzth;)Lcom/google/android/gms/internal/ads/zztc;
    //   745: astore_3
    //   746: aload_3
    //   747: ifnull -> 825
    //   750: aload_3
    //   751: invokevirtual o0 : ()Z
    //   754: ifeq -> 825
    //   757: aload_0
    //   758: aload_3
    //   759: invokevirtual r0 : ()Z
    //   762: putfield m : Z
    //   765: aload_0
    //   766: aload_3
    //   767: invokevirtual u0 : ()Z
    //   770: putfield o : Z
    //   773: aload_0
    //   774: aload_3
    //   775: invokevirtual s0 : ()Z
    //   778: putfield p : Z
    //   781: aload_0
    //   782: aload_3
    //   783: invokevirtual t0 : ()J
    //   786: putfield q : J
    //   789: aload_0
    //   790: iconst_1
    //   791: putfield n : Z
    //   794: aload_0
    //   795: invokespecial e : ()Z
    //   798: ifne -> 825
    //   801: aload_0
    //   802: aload_3
    //   803: invokevirtual p0 : ()Ljava/io/InputStream;
    //   806: putfield i : Ljava/io/InputStream;
    //   809: aload_0
    //   810: getfield h : Z
    //   813: ifeq -> 821
    //   816: aload_0
    //   817: aload_1
    //   818: invokespecial g : (Lcom/google/android/gms/internal/ads/xi2;)V
    //   821: ldc2_w -1
    //   824: lreturn
    //   825: aload_0
    //   826: iconst_0
    //   827: putfield n : Z
    //   830: aload_1
    //   831: astore_3
    //   832: aload_0
    //   833: getfield l : Lcom/google/android/gms/internal/ads/zzth;
    //   836: ifnull -> 881
    //   839: new com/google/android/gms/internal/ads/xi2
    //   842: dup
    //   843: aload_0
    //   844: getfield l : Lcom/google/android/gms/internal/ads/zzth;
    //   847: getfield b : Ljava/lang/String;
    //   850: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   853: aload_1
    //   854: getfield b : [B
    //   857: aload_1
    //   858: getfield c : J
    //   861: aload_1
    //   862: getfield d : J
    //   865: aload_1
    //   866: getfield e : J
    //   869: aload_1
    //   870: getfield f : Ljava/lang/String;
    //   873: aload_1
    //   874: getfield g : I
    //   877: invokespecial <init> : (Landroid/net/Uri;[BJJJLjava/lang/String;I)V
    //   880: astore_3
    //   881: aload_0
    //   882: getfield d : Lcom/google/android/gms/internal/ads/ti2;
    //   885: aload_3
    //   886: invokeinterface a : (Lcom/google/android/gms/internal/ads/xi2;)J
    //   891: lreturn
    //   892: new java/io/IOException
    //   895: dup
    //   896: ldc_w 'Attempt to open an already open CacheDataSource.'
    //   899: invokespecial <init> : (Ljava/lang/String;)V
    //   902: athrow
    // Exception table:
    //   from	to	target	type
    //   183	199	530	java/util/concurrent/ExecutionException
    //   183	199	530	java/util/concurrent/TimeoutException
    //   183	199	432	java/lang/InterruptedException
    //   183	199	426	finally
    //   199	263	418	java/util/concurrent/ExecutionException
    //   199	263	418	java/util/concurrent/TimeoutException
    //   199	263	410	java/lang/InterruptedException
    //   199	263	406	finally
    //   440	448	619	finally
    //   451	457	619	finally
    //   538	546	619	finally
  }
  
  public final long b() {
    // Byte code:
    //   0: aload_0
    //   1: getfield l : Lcom/google/android/gms/internal/ads/zzth;
    //   4: ifnonnull -> 11
    //   7: ldc2_w -1
    //   10: lreturn
    //   11: aload_0
    //   12: getfield s : Ljava/util/concurrent/atomic/AtomicLong;
    //   15: invokevirtual get : ()J
    //   18: ldc2_w -1
    //   21: lcmp
    //   22: ifeq -> 33
    //   25: aload_0
    //   26: getfield s : Ljava/util/concurrent/atomic/AtomicLong;
    //   29: invokevirtual get : ()J
    //   32: lreturn
    //   33: aload_0
    //   34: monitorenter
    //   35: aload_0
    //   36: getfield r : Lcom/google/android/gms/internal/ads/ot1;
    //   39: ifnonnull -> 66
    //   42: getstatic com/google/android/gms/internal/ads/fm.a : Lcom/google/android/gms/internal/ads/nt1;
    //   45: astore_1
    //   46: new com/google/android/gms/internal/ads/vo
    //   49: astore_2
    //   50: aload_2
    //   51: aload_0
    //   52: invokespecial <init> : (Lcom/google/android/gms/internal/ads/wo;)V
    //   55: aload_0
    //   56: aload_1
    //   57: aload_2
    //   58: invokeinterface a : (Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/ot1;
    //   63: putfield r : Lcom/google/android/gms/internal/ads/ot1;
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_0
    //   69: getfield r : Lcom/google/android/gms/internal/ads/ot1;
    //   72: invokeinterface isDone : ()Z
    //   77: ifne -> 84
    //   80: ldc2_w -1
    //   83: lreturn
    //   84: aload_0
    //   85: getfield s : Ljava/util/concurrent/atomic/AtomicLong;
    //   88: ldc2_w -1
    //   91: aload_0
    //   92: getfield r : Lcom/google/android/gms/internal/ads/ot1;
    //   95: invokeinterface get : ()Ljava/lang/Object;
    //   100: checkcast java/lang/Long
    //   103: invokevirtual longValue : ()J
    //   106: invokevirtual compareAndSet : (JJ)Z
    //   109: pop
    //   110: aload_0
    //   111: getfield s : Ljava/util/concurrent/atomic/AtomicLong;
    //   114: invokevirtual get : ()J
    //   117: lreturn
    //   118: astore_1
    //   119: ldc2_w -1
    //   122: lreturn
    //   123: astore_1
    //   124: aload_0
    //   125: monitorexit
    //   126: aload_1
    //   127: athrow
    // Exception table:
    //   from	to	target	type
    //   35	66	123	finally
    //   66	68	123	finally
    //   84	110	118	java/util/concurrent/ExecutionException
    //   84	110	118	java/lang/InterruptedException
    //   124	126	123	finally
  }
  
  public final boolean c() {
    return this.n;
  }
  
  public final void close() {
    if (this.j) {
      boolean bool = false;
      this.j = false;
      this.k = null;
      if (!this.h || this.i != null)
        bool = true; 
      InputStream inputStream = this.i;
      if (inputStream != null) {
        k.a(inputStream);
        this.i = null;
      } else {
        this.d.close();
      } 
      if (bool) {
        hj2<ti2> hj21 = this.b;
        if (hj21 != null)
          hj21.c(this); 
      } 
      return;
    } 
    throw new IOException("Attempt to close an already closed CacheDataSource.");
  }
  
  public final boolean d() {
    return this.p;
  }
  
  public final Uri e0() {
    return this.k;
  }
  
  public final boolean h() {
    return this.m;
  }
  
  public final long i() {
    return this.q;
  }
  
  public final boolean j() {
    return this.o;
  }
  
  public final int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.j) {
      InputStream inputStream = this.i;
      if (inputStream != null) {
        paramInt1 = inputStream.read(paramArrayOfbyte, paramInt1, paramInt2);
      } else {
        paramInt1 = this.d.read(paramArrayOfbyte, paramInt1, paramInt2);
      } 
      if (!this.h || this.i != null) {
        hj2<ti2> hj21 = this.b;
        if (hj21 != null)
          hj21.v(this, paramInt1); 
      } 
      return paramInt1;
    } 
    throw new IOException("Attempt to read closed CacheDataSource.");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */