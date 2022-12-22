package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.play.core.internal.bf;
import com.google.android.play.core.internal.p;
import com.google.android.play.core.internal.r;
import com.google.android.play.core.internal.t;
import com.google.android.play.core.splitinstall.f;
import com.google.android.play.core.splitinstall.j;
import com.google.android.play.core.splitinstall.l;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class a {
  private static final AtomicReference<a> a = new AtomicReference<a>(null);
  
  private final d b;
  
  private final Set<String> c = new HashSet<String>();
  
  private final b d;
  
  private a(Context paramContext) {
    try {
      d d1 = new d();
      this(paramContext);
      this.b = d1;
      this.d = new b(d1);
      return;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      throw new bf(nameNotFoundException);
    } 
  }
  
  public static boolean a(Context paramContext) {
    return e(paramContext, true);
  }
  
  public static boolean b() {
    return (a.get() != null);
  }
  
  private static boolean d() {
    return (Build.VERSION.SDK_INT < 21);
  }
  
  private static boolean e(Context paramContext, boolean paramBoolean) {
    if (d())
      return false; 
    AtomicReference<a> atomicReference = a;
    boolean bool = atomicReference.compareAndSet(null, new a(paramContext));
    a a1 = atomicReference.get();
    if (bool) {
      l.b.b((f)new p(paramContext, q.a(), new r(paramContext, a1.b, new t(), null), a1.b, new q()));
      j.a(new m(a1));
      q.a().execute(new n(paramContext));
    } 
    try {
      a1.f(paramContext, paramBoolean);
      return true;
    } catch (Exception exception) {
      Log.e("SplitCompat", "Error installing additional splits", exception);
      return false;
    } 
  }
  
  private final void f(Context paramContext, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_2
    //   3: ifeq -> 16
    //   6: aload_0
    //   7: getfield b : Lcom/google/android/play/core/splitcompat/d;
    //   10: invokevirtual a : ()V
    //   13: goto -> 39
    //   16: invokestatic a : ()Ljava/util/concurrent/Executor;
    //   19: astore_3
    //   20: new com/google/android/play/core/splitcompat/o
    //   23: astore #4
    //   25: aload #4
    //   27: aload_0
    //   28: invokespecial <init> : (Lcom/google/android/play/core/splitcompat/a;)V
    //   31: aload_3
    //   32: aload #4
    //   34: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   39: aload_1
    //   40: invokevirtual getPackageName : ()Ljava/lang/String;
    //   43: astore_3
    //   44: aload_1
    //   45: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   48: aload_3
    //   49: iconst_0
    //   50: invokevirtual getPackageInfo : (Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   53: getfield splitNames : [Ljava/lang/String;
    //   56: astore #4
    //   58: aload #4
    //   60: ifnonnull -> 76
    //   63: new java/util/ArrayList
    //   66: astore #4
    //   68: aload #4
    //   70: invokespecial <init> : ()V
    //   73: goto -> 83
    //   76: aload #4
    //   78: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   81: astore #4
    //   83: aload_0
    //   84: getfield b : Lcom/google/android/play/core/splitcompat/d;
    //   87: invokevirtual i : ()Ljava/util/Set;
    //   90: astore #5
    //   92: new java/util/HashSet
    //   95: astore_3
    //   96: aload_3
    //   97: invokespecial <init> : ()V
    //   100: aload #5
    //   102: invokeinterface iterator : ()Ljava/util/Iterator;
    //   107: astore #6
    //   109: aload #6
    //   111: invokeinterface hasNext : ()Z
    //   116: ifeq -> 181
    //   119: aload #6
    //   121: invokeinterface next : ()Ljava/lang/Object;
    //   126: checkcast com/google/android/play/core/splitcompat/r
    //   129: invokevirtual b : ()Ljava/lang/String;
    //   132: astore #7
    //   134: aload #4
    //   136: aload #7
    //   138: invokeinterface contains : (Ljava/lang/Object;)Z
    //   143: ifeq -> 109
    //   146: iload_2
    //   147: ifeq -> 162
    //   150: aload_0
    //   151: getfield b : Lcom/google/android/play/core/splitcompat/d;
    //   154: aload #7
    //   156: invokevirtual n : (Ljava/lang/String;)V
    //   159: goto -> 171
    //   162: aload_3
    //   163: aload #7
    //   165: invokeinterface add : (Ljava/lang/Object;)Z
    //   170: pop
    //   171: aload #6
    //   173: invokeinterface remove : ()V
    //   178: goto -> 109
    //   181: aload_3
    //   182: invokeinterface isEmpty : ()Z
    //   187: ifne -> 216
    //   190: invokestatic a : ()Ljava/util/concurrent/Executor;
    //   193: astore #6
    //   195: new com/google/android/play/core/splitcompat/p
    //   198: astore #7
    //   200: aload #7
    //   202: aload_0
    //   203: aload_3
    //   204: invokespecial <init> : (Lcom/google/android/play/core/splitcompat/a;Ljava/util/Set;)V
    //   207: aload #6
    //   209: aload #7
    //   211: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   216: new java/util/HashSet
    //   219: astore #6
    //   221: aload #6
    //   223: invokespecial <init> : ()V
    //   226: aload #5
    //   228: invokeinterface iterator : ()Ljava/util/Iterator;
    //   233: astore_3
    //   234: aload_3
    //   235: invokeinterface hasNext : ()Z
    //   240: ifeq -> 278
    //   243: aload_3
    //   244: invokeinterface next : ()Ljava/lang/Object;
    //   249: checkcast com/google/android/play/core/splitcompat/r
    //   252: invokevirtual b : ()Ljava/lang/String;
    //   255: astore #7
    //   257: aload #7
    //   259: invokestatic b : (Ljava/lang/String;)Z
    //   262: ifne -> 234
    //   265: aload #6
    //   267: aload #7
    //   269: invokeinterface add : (Ljava/lang/Object;)Z
    //   274: pop
    //   275: goto -> 234
    //   278: aload #4
    //   280: invokeinterface iterator : ()Ljava/util/Iterator;
    //   285: astore #4
    //   287: aload #4
    //   289: invokeinterface hasNext : ()Z
    //   294: ifeq -> 327
    //   297: aload #4
    //   299: invokeinterface next : ()Ljava/lang/Object;
    //   304: checkcast java/lang/String
    //   307: astore_3
    //   308: aload_3
    //   309: invokestatic b : (Ljava/lang/String;)Z
    //   312: ifne -> 287
    //   315: aload #6
    //   317: aload_3
    //   318: invokeinterface add : (Ljava/lang/Object;)Z
    //   323: pop
    //   324: goto -> 287
    //   327: new java/util/HashSet
    //   330: astore_3
    //   331: aload_3
    //   332: aload #5
    //   334: invokeinterface size : ()I
    //   339: invokespecial <init> : (I)V
    //   342: aload #5
    //   344: invokeinterface iterator : ()Ljava/util/Iterator;
    //   349: astore #5
    //   351: aload #5
    //   353: invokeinterface hasNext : ()Z
    //   358: ifeq -> 442
    //   361: aload #5
    //   363: invokeinterface next : ()Ljava/lang/Object;
    //   368: checkcast com/google/android/play/core/splitcompat/r
    //   371: astore #7
    //   373: aload #7
    //   375: invokevirtual b : ()Ljava/lang/String;
    //   378: invokestatic a : (Ljava/lang/String;)Z
    //   381: ifne -> 430
    //   384: aload #7
    //   386: invokevirtual b : ()Ljava/lang/String;
    //   389: astore #4
    //   391: aload #4
    //   393: invokestatic a : (Ljava/lang/String;)Z
    //   396: ifeq -> 406
    //   399: ldc ''
    //   401: astore #4
    //   403: goto -> 418
    //   406: aload #4
    //   408: ldc '\.config\.'
    //   410: iconst_2
    //   411: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   414: iconst_0
    //   415: aaload
    //   416: astore #4
    //   418: aload #6
    //   420: aload #4
    //   422: invokeinterface contains : (Ljava/lang/Object;)Z
    //   427: ifeq -> 351
    //   430: aload_3
    //   431: aload #7
    //   433: invokeinterface add : (Ljava/lang/Object;)Z
    //   438: pop
    //   439: goto -> 351
    //   442: new com/google/android/play/core/splitcompat/l
    //   445: astore #8
    //   447: aload #8
    //   449: aload_0
    //   450: getfield b : Lcom/google/android/play/core/splitcompat/d;
    //   453: invokespecial <init> : (Lcom/google/android/play/core/splitcompat/d;)V
    //   456: invokestatic a : ()Lcom/google/android/play/core/internal/s;
    //   459: astore #7
    //   461: aload_1
    //   462: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   465: astore #5
    //   467: iload_2
    //   468: ifeq -> 488
    //   471: aload #7
    //   473: aload #5
    //   475: aload #8
    //   477: invokevirtual a : ()Ljava/util/Set;
    //   480: invokeinterface b : (Ljava/lang/ClassLoader;Ljava/util/Set;)V
    //   485: goto -> 552
    //   488: aload_3
    //   489: invokeinterface iterator : ()Ljava/util/Iterator;
    //   494: astore #4
    //   496: aload #4
    //   498: invokeinterface hasNext : ()Z
    //   503: ifeq -> 552
    //   506: aload #8
    //   508: aload #4
    //   510: invokeinterface next : ()Ljava/lang/Object;
    //   515: checkcast com/google/android/play/core/splitcompat/r
    //   518: invokevirtual b : (Lcom/google/android/play/core/splitcompat/r;)Ljava/util/Set;
    //   521: astore #6
    //   523: aload #6
    //   525: ifnonnull -> 538
    //   528: aload #4
    //   530: invokeinterface remove : ()V
    //   535: goto -> 496
    //   538: aload #7
    //   540: aload #5
    //   542: aload #6
    //   544: invokeinterface b : (Ljava/lang/ClassLoader;Ljava/util/Set;)V
    //   549: goto -> 496
    //   552: new java/util/HashSet
    //   555: astore #6
    //   557: aload #6
    //   559: invokespecial <init> : ()V
    //   562: aload_3
    //   563: invokeinterface iterator : ()Ljava/util/Iterator;
    //   568: astore #8
    //   570: aload #8
    //   572: invokeinterface hasNext : ()Z
    //   577: ifeq -> 770
    //   580: aload #8
    //   582: invokeinterface next : ()Ljava/lang/Object;
    //   587: checkcast com/google/android/play/core/splitcompat/r
    //   590: astore #9
    //   592: new java/util/zip/ZipFile
    //   595: astore #4
    //   597: aload #4
    //   599: aload #9
    //   601: invokevirtual a : ()Ljava/io/File;
    //   604: invokespecial <init> : (Ljava/io/File;)V
    //   607: aload #4
    //   609: ldc_w 'classes.dex'
    //   612: invokevirtual getEntry : (Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   615: astore #10
    //   617: aload #4
    //   619: invokevirtual close : ()V
    //   622: aload #10
    //   624: ifnull -> 723
    //   627: aload #7
    //   629: aload #5
    //   631: aload_0
    //   632: getfield b : Lcom/google/android/play/core/splitcompat/d;
    //   635: aload #9
    //   637: invokevirtual b : ()Ljava/lang/String;
    //   640: invokevirtual h : (Ljava/lang/String;)Ljava/io/File;
    //   643: aload #9
    //   645: invokevirtual a : ()Ljava/io/File;
    //   648: iload_2
    //   649: invokeinterface a : (Ljava/lang/ClassLoader;Ljava/io/File;Ljava/io/File;Z)Z
    //   654: ifeq -> 660
    //   657: goto -> 723
    //   660: aload #9
    //   662: invokevirtual a : ()Ljava/io/File;
    //   665: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   668: astore #9
    //   670: aload #9
    //   672: invokevirtual length : ()I
    //   675: istore #11
    //   677: new java/lang/StringBuilder
    //   680: astore #4
    //   682: aload #4
    //   684: iload #11
    //   686: bipush #24
    //   688: iadd
    //   689: invokespecial <init> : (I)V
    //   692: aload #4
    //   694: ldc_w 'split was not installed '
    //   697: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   700: pop
    //   701: aload #4
    //   703: aload #9
    //   705: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   708: pop
    //   709: ldc 'SplitCompat'
    //   711: aload #4
    //   713: invokevirtual toString : ()Ljava/lang/String;
    //   716: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   719: pop
    //   720: goto -> 570
    //   723: aload #6
    //   725: aload #9
    //   727: invokevirtual a : ()Ljava/io/File;
    //   730: invokeinterface add : (Ljava/lang/Object;)Z
    //   735: pop
    //   736: goto -> 570
    //   739: astore_1
    //   740: goto -> 747
    //   743: astore_1
    //   744: aconst_null
    //   745: astore #4
    //   747: aload #4
    //   749: ifnull -> 768
    //   752: aload #4
    //   754: invokevirtual close : ()V
    //   757: goto -> 768
    //   760: astore #4
    //   762: aload_1
    //   763: aload #4
    //   765: invokestatic a : (Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   768: aload_1
    //   769: athrow
    //   770: aload_0
    //   771: getfield d : Lcom/google/android/play/core/splitcompat/b;
    //   774: aload_1
    //   775: aload #6
    //   777: invokevirtual a : (Landroid/content/Context;Ljava/util/Set;)V
    //   780: new java/util/HashSet
    //   783: astore_1
    //   784: aload_1
    //   785: invokespecial <init> : ()V
    //   788: aload_3
    //   789: invokeinterface iterator : ()Ljava/util/Iterator;
    //   794: astore #4
    //   796: aload #4
    //   798: invokeinterface hasNext : ()Z
    //   803: ifeq -> 974
    //   806: aload #4
    //   808: invokeinterface next : ()Ljava/lang/Object;
    //   813: checkcast com/google/android/play/core/splitcompat/r
    //   816: astore #7
    //   818: aload #6
    //   820: aload #7
    //   822: invokevirtual a : ()Ljava/io/File;
    //   825: invokeinterface contains : (Ljava/lang/Object;)Z
    //   830: ifeq -> 908
    //   833: aload #7
    //   835: invokevirtual b : ()Ljava/lang/String;
    //   838: astore #5
    //   840: aload #5
    //   842: invokevirtual length : ()I
    //   845: istore #11
    //   847: new java/lang/StringBuilder
    //   850: astore_3
    //   851: aload_3
    //   852: iload #11
    //   854: bipush #30
    //   856: iadd
    //   857: invokespecial <init> : (I)V
    //   860: aload_3
    //   861: ldc_w 'Split ''
    //   864: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   867: pop
    //   868: aload_3
    //   869: aload #5
    //   871: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   874: pop
    //   875: aload_3
    //   876: ldc_w '' installation emulated'
    //   879: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   882: pop
    //   883: ldc 'SplitCompat'
    //   885: aload_3
    //   886: invokevirtual toString : ()Ljava/lang/String;
    //   889: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   892: pop
    //   893: aload_1
    //   894: aload #7
    //   896: invokevirtual b : ()Ljava/lang/String;
    //   899: invokeinterface add : (Ljava/lang/Object;)Z
    //   904: pop
    //   905: goto -> 796
    //   908: aload #7
    //   910: invokevirtual b : ()Ljava/lang/String;
    //   913: astore_3
    //   914: aload_3
    //   915: invokevirtual length : ()I
    //   918: istore #11
    //   920: new java/lang/StringBuilder
    //   923: astore #5
    //   925: aload #5
    //   927: iload #11
    //   929: bipush #35
    //   931: iadd
    //   932: invokespecial <init> : (I)V
    //   935: aload #5
    //   937: ldc_w 'Split ''
    //   940: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   943: pop
    //   944: aload #5
    //   946: aload_3
    //   947: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   950: pop
    //   951: aload #5
    //   953: ldc_w '' installation not emulated.'
    //   956: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   959: pop
    //   960: ldc 'SplitCompat'
    //   962: aload #5
    //   964: invokevirtual toString : ()Ljava/lang/String;
    //   967: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   970: pop
    //   971: goto -> 796
    //   974: aload_0
    //   975: getfield c : Ljava/util/Set;
    //   978: astore #4
    //   980: aload #4
    //   982: monitorenter
    //   983: aload_0
    //   984: getfield c : Ljava/util/Set;
    //   987: aload_1
    //   988: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   993: pop
    //   994: aload #4
    //   996: monitorexit
    //   997: aload_0
    //   998: monitorexit
    //   999: return
    //   1000: astore_1
    //   1001: aload #4
    //   1003: monitorexit
    //   1004: aload_1
    //   1005: athrow
    //   1006: astore_1
    //   1007: new java/io/IOException
    //   1010: astore #4
    //   1012: aload #4
    //   1014: ldc_w 'Cannot load data for application '%s''
    //   1017: iconst_1
    //   1018: anewarray java/lang/Object
    //   1021: dup
    //   1022: iconst_0
    //   1023: aload_3
    //   1024: aastore
    //   1025: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1028: aload_1
    //   1029: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1032: aload #4
    //   1034: athrow
    //   1035: astore_1
    //   1036: aload_0
    //   1037: monitorexit
    //   1038: goto -> 1043
    //   1041: aload_1
    //   1042: athrow
    //   1043: goto -> 1041
    // Exception table:
    //   from	to	target	type
    //   6	13	1035	finally
    //   16	39	1035	finally
    //   39	44	1035	finally
    //   44	58	1006	android/content/pm/PackageManager$NameNotFoundException
    //   44	58	1035	finally
    //   63	73	1006	android/content/pm/PackageManager$NameNotFoundException
    //   63	73	1035	finally
    //   76	83	1006	android/content/pm/PackageManager$NameNotFoundException
    //   76	83	1035	finally
    //   83	109	1035	finally
    //   109	146	1035	finally
    //   150	159	1035	finally
    //   162	171	1035	finally
    //   171	178	1035	finally
    //   181	216	1035	finally
    //   216	234	1035	finally
    //   234	275	1035	finally
    //   278	287	1035	finally
    //   287	324	1035	finally
    //   327	351	1035	finally
    //   351	399	1035	finally
    //   406	418	1035	finally
    //   418	430	1035	finally
    //   430	439	1035	finally
    //   442	467	1035	finally
    //   471	485	1035	finally
    //   488	496	1035	finally
    //   496	523	1035	finally
    //   528	535	1035	finally
    //   538	549	1035	finally
    //   552	570	1035	finally
    //   570	592	1035	finally
    //   592	607	743	java/io/IOException
    //   592	607	1035	finally
    //   607	622	739	java/io/IOException
    //   607	622	1035	finally
    //   627	657	1035	finally
    //   660	720	1035	finally
    //   723	736	1035	finally
    //   752	757	760	java/io/IOException
    //   752	757	1035	finally
    //   762	768	1035	finally
    //   768	770	1035	finally
    //   770	796	1035	finally
    //   796	905	1035	finally
    //   908	971	1035	finally
    //   974	983	1035	finally
    //   983	997	1000	finally
    //   1001	1004	1000	finally
    //   1004	1006	1035	finally
    //   1007	1035	1035	finally
  }
  
  public static boolean g(Context paramContext) {
    return e(paramContext, false);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/splitcompat/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */