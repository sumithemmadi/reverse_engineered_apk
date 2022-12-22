package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.t;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class g3 extends c4 {
  private String c;
  
  private String d;
  
  private int e;
  
  private String f;
  
  private String g;
  
  private long h;
  
  private final long i;
  
  private List<String> j;
  
  private int k;
  
  private String l;
  
  private String m;
  
  private String n;
  
  g3(s4 params4, long paramLong) {
    super(params4);
    this.i = paramLong;
  }
  
  protected final boolean m() {
    return true;
  }
  
  @EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
  protected final void n() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   4: invokevirtual a : ()Landroid/content/Context;
    //   7: invokevirtual getPackageName : ()Ljava/lang/String;
    //   10: astore_1
    //   11: aload_0
    //   12: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   15: invokevirtual a : ()Landroid/content/Context;
    //   18: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   21: astore_2
    //   22: ldc 'Unknown'
    //   24: astore_3
    //   25: ldc -2147483648
    //   27: istore #4
    //   29: ldc ''
    //   31: astore #5
    //   33: ldc 'unknown'
    //   35: astore #6
    //   37: aload_2
    //   38: ifnonnull -> 79
    //   41: aload_0
    //   42: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   45: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   48: invokevirtual o : ()Lcom/google/android/gms/measurement/internal/m3;
    //   51: ldc 'PackageManager is null, app identity information might be inaccurate. appId'
    //   53: aload_1
    //   54: invokestatic x : (Ljava/lang/String;)Ljava/lang/Object;
    //   57: invokevirtual b : (Ljava/lang/String;Ljava/lang/Object;)V
    //   60: ldc 'Unknown'
    //   62: astore #7
    //   64: iload #4
    //   66: istore #8
    //   68: aload #6
    //   70: astore #9
    //   72: aload #7
    //   74: astore #6
    //   76: goto -> 283
    //   79: aload_2
    //   80: aload_1
    //   81: invokevirtual getInstallerPackageName : (Ljava/lang/String;)Ljava/lang/String;
    //   84: astore #9
    //   86: aload #9
    //   88: astore #6
    //   90: goto -> 114
    //   93: astore #9
    //   95: aload_0
    //   96: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   99: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   102: invokevirtual o : ()Lcom/google/android/gms/measurement/internal/m3;
    //   105: ldc 'Error retrieving app installer package name. appId'
    //   107: aload_1
    //   108: invokestatic x : (Ljava/lang/String;)Ljava/lang/Object;
    //   111: invokevirtual b : (Ljava/lang/String;Ljava/lang/Object;)V
    //   114: aload #6
    //   116: ifnonnull -> 126
    //   119: ldc 'manual_install'
    //   121: astore #9
    //   123: goto -> 144
    //   126: aload #6
    //   128: astore #9
    //   130: ldc 'com.android.vending'
    //   132: aload #6
    //   134: invokevirtual equals : (Ljava/lang/Object;)Z
    //   137: ifeq -> 144
    //   140: ldc ''
    //   142: astore #9
    //   144: aload_2
    //   145: aload_0
    //   146: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   149: invokevirtual a : ()Landroid/content/Context;
    //   152: invokevirtual getPackageName : ()Ljava/lang/String;
    //   155: iconst_0
    //   156: invokevirtual getPackageInfo : (Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   159: astore #10
    //   161: aload #9
    //   163: astore #6
    //   165: aload #10
    //   167: ifnull -> 60
    //   170: aload_2
    //   171: aload #10
    //   173: getfield applicationInfo : Landroid/content/pm/ApplicationInfo;
    //   176: invokevirtual getApplicationLabel : (Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
    //   179: astore #6
    //   181: aload #6
    //   183: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   186: ifne -> 201
    //   189: aload #6
    //   191: invokeinterface toString : ()Ljava/lang/String;
    //   196: astore #6
    //   198: goto -> 205
    //   201: ldc 'Unknown'
    //   203: astore #6
    //   205: aload #10
    //   207: getfield versionName : Ljava/lang/String;
    //   210: astore #7
    //   212: aload #7
    //   214: astore_3
    //   215: aload #10
    //   217: getfield versionCode : I
    //   220: istore #8
    //   222: aload #7
    //   224: astore_3
    //   225: goto -> 283
    //   228: astore #7
    //   230: aload_3
    //   231: astore #7
    //   233: aload #6
    //   235: astore_3
    //   236: aload #7
    //   238: astore #6
    //   240: goto -> 249
    //   243: astore #6
    //   245: ldc 'Unknown'
    //   247: astore #6
    //   249: aload_0
    //   250: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   253: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   256: invokevirtual o : ()Lcom/google/android/gms/measurement/internal/m3;
    //   259: ldc 'Error retrieving package info. appId, appName'
    //   261: aload_1
    //   262: invokestatic x : (Ljava/lang/String;)Ljava/lang/Object;
    //   265: aload_3
    //   266: invokevirtual c : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   269: aload_3
    //   270: astore #7
    //   272: aload #6
    //   274: astore_3
    //   275: aload #7
    //   277: astore #6
    //   279: iload #4
    //   281: istore #8
    //   283: aload_0
    //   284: aload_1
    //   285: putfield c : Ljava/lang/String;
    //   288: aload_0
    //   289: aload #9
    //   291: putfield f : Ljava/lang/String;
    //   294: aload_0
    //   295: aload_3
    //   296: putfield d : Ljava/lang/String;
    //   299: aload_0
    //   300: iload #8
    //   302: putfield e : I
    //   305: aload_0
    //   306: aload #6
    //   308: putfield g : Ljava/lang/String;
    //   311: aload_0
    //   312: lconst_0
    //   313: putfield h : J
    //   316: aload_0
    //   317: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   320: invokevirtual L : ()Ljava/lang/String;
    //   323: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   326: ifne -> 350
    //   329: ldc 'am'
    //   331: aload_0
    //   332: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   335: invokevirtual M : ()Ljava/lang/String;
    //   338: invokevirtual equals : (Ljava/lang/Object;)Z
    //   341: ifeq -> 350
    //   344: iconst_1
    //   345: istore #8
    //   347: goto -> 353
    //   350: iconst_0
    //   351: istore #8
    //   353: aload_0
    //   354: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   357: invokevirtual l : ()I
    //   360: istore #4
    //   362: iload #4
    //   364: tableswitch default -> 412, 0 -> 556, 1 -> 538, 2 -> 520, 3 -> 502, 4 -> 484, 5 -> 466, 6 -> 448, 7 -> 430
    //   412: aload_0
    //   413: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   416: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   419: invokevirtual u : ()Lcom/google/android/gms/measurement/internal/m3;
    //   422: ldc 'App measurement disabled due to denied storage consent'
    //   424: invokevirtual a : (Ljava/lang/String;)V
    //   427: goto -> 571
    //   430: aload_0
    //   431: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   434: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   437: invokevirtual u : ()Lcom/google/android/gms/measurement/internal/m3;
    //   440: ldc 'App measurement disabled via the global data collection setting'
    //   442: invokevirtual a : (Ljava/lang/String;)V
    //   445: goto -> 571
    //   448: aload_0
    //   449: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   452: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   455: invokevirtual t : ()Lcom/google/android/gms/measurement/internal/m3;
    //   458: ldc 'App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics'
    //   460: invokevirtual a : (Ljava/lang/String;)V
    //   463: goto -> 571
    //   466: aload_0
    //   467: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   470: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   473: invokevirtual w : ()Lcom/google/android/gms/measurement/internal/m3;
    //   476: ldc 'App measurement disabled via the init parameters'
    //   478: invokevirtual a : (Ljava/lang/String;)V
    //   481: goto -> 571
    //   484: aload_0
    //   485: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   488: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   491: invokevirtual u : ()Lcom/google/android/gms/measurement/internal/m3;
    //   494: ldc 'App measurement disabled via the manifest'
    //   496: invokevirtual a : (Ljava/lang/String;)V
    //   499: goto -> 571
    //   502: aload_0
    //   503: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   506: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   509: invokevirtual u : ()Lcom/google/android/gms/measurement/internal/m3;
    //   512: ldc 'App measurement disabled by setAnalyticsCollectionEnabled(false)'
    //   514: invokevirtual a : (Ljava/lang/String;)V
    //   517: goto -> 571
    //   520: aload_0
    //   521: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   524: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   527: invokevirtual w : ()Lcom/google/android/gms/measurement/internal/m3;
    //   530: ldc 'App measurement deactivated via the init parameters'
    //   532: invokevirtual a : (Ljava/lang/String;)V
    //   535: goto -> 571
    //   538: aload_0
    //   539: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   542: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   545: invokevirtual u : ()Lcom/google/android/gms/measurement/internal/m3;
    //   548: ldc 'App measurement deactivated via the manifest'
    //   550: invokevirtual a : (Ljava/lang/String;)V
    //   553: goto -> 571
    //   556: aload_0
    //   557: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   560: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   563: invokevirtual w : ()Lcom/google/android/gms/measurement/internal/m3;
    //   566: ldc 'App measurement collection enabled'
    //   568: invokevirtual a : (Ljava/lang/String;)V
    //   571: aload_0
    //   572: ldc ''
    //   574: putfield l : Ljava/lang/String;
    //   577: aload_0
    //   578: ldc ''
    //   580: putfield m : Ljava/lang/String;
    //   583: aload_0
    //   584: ldc ''
    //   586: putfield n : Ljava/lang/String;
    //   589: aload_0
    //   590: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   593: invokevirtual d : ()Lcom/google/android/gms/measurement/internal/ka;
    //   596: pop
    //   597: iload #8
    //   599: ifeq -> 613
    //   602: aload_0
    //   603: aload_0
    //   604: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   607: invokevirtual L : ()Ljava/lang/String;
    //   610: putfield m : Ljava/lang/String;
    //   613: aload_0
    //   614: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   617: invokevirtual a : ()Landroid/content/Context;
    //   620: ldc 'google_app_id'
    //   622: aload_0
    //   623: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   626: invokevirtual P : ()Ljava/lang/String;
    //   629: invokestatic a : (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   632: astore_3
    //   633: iconst_1
    //   634: aload_3
    //   635: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   638: if_icmpeq -> 647
    //   641: aload_3
    //   642: astore #9
    //   644: goto -> 651
    //   647: ldc ''
    //   649: astore #9
    //   651: aload_0
    //   652: aload #9
    //   654: putfield l : Ljava/lang/String;
    //   657: invokestatic a : ()Z
    //   660: pop
    //   661: aload_0
    //   662: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   665: invokevirtual z : ()Lcom/google/android/gms/measurement/internal/e;
    //   668: aconst_null
    //   669: getstatic com/google/android/gms/measurement/internal/c3.i0 : Lcom/google/android/gms/measurement/internal/a3;
    //   672: invokevirtual w : (Ljava/lang/String;Lcom/google/android/gms/measurement/internal/a3;)Z
    //   675: istore #11
    //   677: iload #11
    //   679: ifeq -> 797
    //   682: aload_0
    //   683: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   686: invokevirtual a : ()Landroid/content/Context;
    //   689: astore #6
    //   691: aload_0
    //   692: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   695: invokevirtual P : ()Ljava/lang/String;
    //   698: astore #9
    //   700: aload #6
    //   702: invokestatic j : (Ljava/lang/Object;)Ljava/lang/Object;
    //   705: pop
    //   706: aload #6
    //   708: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   711: astore #10
    //   713: aload #9
    //   715: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   718: ifne -> 724
    //   721: goto -> 731
    //   724: aload #6
    //   726: invokestatic a : (Landroid/content/Context;)Ljava/lang/String;
    //   729: astore #9
    //   731: ldc 'ga_app_id'
    //   733: aload #10
    //   735: aload #9
    //   737: invokestatic b : (Ljava/lang/String;Landroid/content/res/Resources;Ljava/lang/String;)Ljava/lang/String;
    //   740: astore #7
    //   742: aload #5
    //   744: astore #6
    //   746: iconst_1
    //   747: aload #7
    //   749: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   752: if_icmpeq -> 759
    //   755: aload #7
    //   757: astore #6
    //   759: aload_0
    //   760: aload #6
    //   762: putfield n : Ljava/lang/String;
    //   765: aload_3
    //   766: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   769: ifeq -> 780
    //   772: aload #7
    //   774: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   777: ifne -> 863
    //   780: aload_0
    //   781: ldc_w 'admob_app_id'
    //   784: aload #10
    //   786: aload #9
    //   788: invokestatic b : (Ljava/lang/String;Landroid/content/res/Resources;Ljava/lang/String;)Ljava/lang/String;
    //   791: putfield m : Ljava/lang/String;
    //   794: goto -> 863
    //   797: aload_3
    //   798: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   801: ifne -> 863
    //   804: aload_0
    //   805: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   808: invokevirtual a : ()Landroid/content/Context;
    //   811: astore_3
    //   812: aload_0
    //   813: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   816: invokevirtual P : ()Ljava/lang/String;
    //   819: astore #9
    //   821: aload_3
    //   822: invokestatic j : (Ljava/lang/Object;)Ljava/lang/Object;
    //   825: pop
    //   826: aload_3
    //   827: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   830: astore #6
    //   832: aload #9
    //   834: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   837: ifne -> 843
    //   840: goto -> 849
    //   843: aload_3
    //   844: invokestatic a : (Landroid/content/Context;)Ljava/lang/String;
    //   847: astore #9
    //   849: aload_0
    //   850: ldc_w 'admob_app_id'
    //   853: aload #6
    //   855: aload #9
    //   857: invokestatic b : (Ljava/lang/String;Landroid/content/res/Resources;Ljava/lang/String;)Ljava/lang/String;
    //   860: putfield m : Ljava/lang/String;
    //   863: iload #4
    //   865: ifne -> 948
    //   868: aload_0
    //   869: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   872: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   875: invokevirtual w : ()Lcom/google/android/gms/measurement/internal/m3;
    //   878: astore_3
    //   879: aload_0
    //   880: getfield c : Ljava/lang/String;
    //   883: astore #6
    //   885: aload_0
    //   886: getfield l : Ljava/lang/String;
    //   889: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   892: ifeq -> 904
    //   895: aload_0
    //   896: getfield m : Ljava/lang/String;
    //   899: astore #9
    //   901: goto -> 910
    //   904: aload_0
    //   905: getfield l : Ljava/lang/String;
    //   908: astore #9
    //   910: aload_3
    //   911: ldc_w 'App measurement enabled for app package, google app id'
    //   914: aload #6
    //   916: aload #9
    //   918: invokevirtual c : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   921: goto -> 948
    //   924: astore #9
    //   926: aload_0
    //   927: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   930: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   933: invokevirtual o : ()Lcom/google/android/gms/measurement/internal/m3;
    //   936: ldc_w 'Fetching Google App Id failed with exception. appId'
    //   939: aload_1
    //   940: invokestatic x : (Ljava/lang/String;)Ljava/lang/Object;
    //   943: aload #9
    //   945: invokevirtual c : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   948: aload_0
    //   949: aconst_null
    //   950: putfield j : Ljava/util/List;
    //   953: aload_0
    //   954: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   957: invokevirtual d : ()Lcom/google/android/gms/measurement/internal/ka;
    //   960: pop
    //   961: aload_0
    //   962: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   965: invokevirtual z : ()Lcom/google/android/gms/measurement/internal/e;
    //   968: ldc_w 'analytics.safelisted_events'
    //   971: invokevirtual z : (Ljava/lang/String;)Ljava/util/List;
    //   974: astore #9
    //   976: aload #9
    //   978: ifnonnull -> 984
    //   981: goto -> 1063
    //   984: aload #9
    //   986: invokeinterface size : ()I
    //   991: ifne -> 1013
    //   994: aload_0
    //   995: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   998: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   1001: invokevirtual t : ()Lcom/google/android/gms/measurement/internal/m3;
    //   1004: ldc_w 'Safelisted event list is empty. Ignoring'
    //   1007: invokevirtual a : (Ljava/lang/String;)V
    //   1010: goto -> 1069
    //   1013: aload #9
    //   1015: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1020: astore #6
    //   1022: aload #6
    //   1024: invokeinterface hasNext : ()Z
    //   1029: ifeq -> 1063
    //   1032: aload #6
    //   1034: invokeinterface next : ()Ljava/lang/Object;
    //   1039: checkcast java/lang/String
    //   1042: astore_3
    //   1043: aload_0
    //   1044: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   1047: invokevirtual G : ()Lcom/google/android/gms/measurement/internal/u9;
    //   1050: ldc_w 'safelisted event'
    //   1053: aload_3
    //   1054: invokevirtual m0 : (Ljava/lang/String;Ljava/lang/String;)Z
    //   1057: ifne -> 1022
    //   1060: goto -> 1069
    //   1063: aload_0
    //   1064: aload #9
    //   1066: putfield j : Ljava/util/List;
    //   1069: aload_2
    //   1070: ifnull -> 1088
    //   1073: aload_0
    //   1074: aload_0
    //   1075: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   1078: invokevirtual a : ()Landroid/content/Context;
    //   1081: invokestatic a : (Landroid/content/Context;)Z
    //   1084: putfield k : I
    //   1087: return
    //   1088: aload_0
    //   1089: iconst_0
    //   1090: putfield k : I
    //   1093: return
    // Exception table:
    //   from	to	target	type
    //   79	86	93	java/lang/IllegalArgumentException
    //   144	161	243	android/content/pm/PackageManager$NameNotFoundException
    //   170	198	243	android/content/pm/PackageManager$NameNotFoundException
    //   205	212	228	android/content/pm/PackageManager$NameNotFoundException
    //   215	222	228	android/content/pm/PackageManager$NameNotFoundException
    //   613	641	924	java/lang/IllegalStateException
    //   651	677	924	java/lang/IllegalStateException
    //   682	721	924	java/lang/IllegalStateException
    //   724	731	924	java/lang/IllegalStateException
    //   731	742	924	java/lang/IllegalStateException
    //   746	755	924	java/lang/IllegalStateException
    //   759	780	924	java/lang/IllegalStateException
    //   780	794	924	java/lang/IllegalStateException
    //   797	840	924	java/lang/IllegalStateException
    //   843	849	924	java/lang/IllegalStateException
    //   849	863	924	java/lang/IllegalStateException
    //   868	901	924	java/lang/IllegalStateException
    //   904	910	924	java/lang/IllegalStateException
    //   910	921	924	java/lang/IllegalStateException
  }
  
  final zzp o(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual h : ()V
    //   4: aload_0
    //   5: invokevirtual p : ()Ljava/lang/String;
    //   8: astore_2
    //   9: aload_0
    //   10: invokevirtual q : ()Ljava/lang/String;
    //   13: astore_3
    //   14: aload_0
    //   15: invokevirtual j : ()V
    //   18: aload_0
    //   19: getfield d : Ljava/lang/String;
    //   22: astore #4
    //   24: aload_0
    //   25: invokevirtual j : ()V
    //   28: aload_0
    //   29: getfield e : I
    //   32: i2l
    //   33: lstore #5
    //   35: aload_0
    //   36: invokevirtual j : ()V
    //   39: aload_0
    //   40: getfield f : Ljava/lang/String;
    //   43: invokestatic j : (Ljava/lang/Object;)Ljava/lang/Object;
    //   46: pop
    //   47: aload_0
    //   48: getfield f : Ljava/lang/String;
    //   51: astore #7
    //   53: aload_0
    //   54: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   57: invokevirtual z : ()Lcom/google/android/gms/measurement/internal/e;
    //   60: invokevirtual p : ()J
    //   63: pop2
    //   64: aload_0
    //   65: invokevirtual j : ()V
    //   68: aload_0
    //   69: invokevirtual h : ()V
    //   72: aload_0
    //   73: getfield h : J
    //   76: lstore #8
    //   78: lload #8
    //   80: lstore #10
    //   82: lload #8
    //   84: lconst_0
    //   85: lcmp
    //   86: ifne -> 308
    //   89: aload_0
    //   90: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   93: invokevirtual G : ()Lcom/google/android/gms/measurement/internal/u9;
    //   96: astore #12
    //   98: aload_0
    //   99: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   102: invokevirtual a : ()Landroid/content/Context;
    //   105: astore #13
    //   107: aload_0
    //   108: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   111: invokevirtual a : ()Landroid/content/Context;
    //   114: invokevirtual getPackageName : ()Ljava/lang/String;
    //   117: astore #14
    //   119: aload #12
    //   121: invokevirtual h : ()V
    //   124: aload #13
    //   126: invokestatic j : (Ljava/lang/Object;)Ljava/lang/Object;
    //   129: pop
    //   130: aload #14
    //   132: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
    //   135: pop
    //   136: aload #13
    //   138: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   141: astore #15
    //   143: invokestatic B : ()Ljava/security/MessageDigest;
    //   146: astore #16
    //   148: ldc2_w -1
    //   151: lstore #10
    //   153: aload #16
    //   155: ifnonnull -> 178
    //   158: aload #12
    //   160: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   163: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   166: invokevirtual o : ()Lcom/google/android/gms/measurement/internal/m3;
    //   169: ldc_w 'Could not get MD5 instance'
    //   172: invokevirtual a : (Ljava/lang/String;)V
    //   175: goto -> 302
    //   178: aload #15
    //   180: ifnull -> 299
    //   183: aload #12
    //   185: aload #13
    //   187: aload #14
    //   189: invokevirtual K : (Landroid/content/Context;Ljava/lang/String;)Z
    //   192: ifne -> 272
    //   195: aload #13
    //   197: invokestatic a : (Landroid/content/Context;)Lcom/google/android/gms/common/k/b;
    //   200: aload #12
    //   202: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   205: invokevirtual a : ()Landroid/content/Context;
    //   208: invokevirtual getPackageName : ()Ljava/lang/String;
    //   211: bipush #64
    //   213: invokevirtual e : (Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   216: getfield signatures : [Landroid/content/pm/Signature;
    //   219: astore #14
    //   221: aload #14
    //   223: ifnull -> 252
    //   226: aload #14
    //   228: arraylength
    //   229: ifle -> 252
    //   232: aload #16
    //   234: aload #14
    //   236: iconst_0
    //   237: aaload
    //   238: invokevirtual toByteArray : ()[B
    //   241: invokevirtual digest : ([B)[B
    //   244: invokestatic C : ([B)J
    //   247: lstore #10
    //   249: goto -> 175
    //   252: aload #12
    //   254: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   257: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   260: invokevirtual r : ()Lcom/google/android/gms/measurement/internal/m3;
    //   263: ldc_w 'Could not get signatures'
    //   266: invokevirtual a : (Ljava/lang/String;)V
    //   269: goto -> 175
    //   272: lconst_0
    //   273: lstore #10
    //   275: goto -> 175
    //   278: astore #16
    //   280: aload #12
    //   282: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   285: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   288: invokevirtual o : ()Lcom/google/android/gms/measurement/internal/m3;
    //   291: ldc_w 'Package name not found'
    //   294: aload #16
    //   296: invokevirtual b : (Ljava/lang/String;Ljava/lang/Object;)V
    //   299: lconst_0
    //   300: lstore #10
    //   302: aload_0
    //   303: lload #10
    //   305: putfield h : J
    //   308: aload_0
    //   309: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   312: invokevirtual k : ()Z
    //   315: istore #17
    //   317: aload_0
    //   318: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   321: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   324: getfield q : Z
    //   327: istore #18
    //   329: aload_0
    //   330: invokevirtual h : ()V
    //   333: aload_0
    //   334: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   337: invokevirtual k : ()Z
    //   340: ifne -> 349
    //   343: aconst_null
    //   344: astore #12
    //   346: goto -> 531
    //   349: invokestatic a : ()Z
    //   352: pop
    //   353: aload_0
    //   354: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   357: invokevirtual z : ()Lcom/google/android/gms/measurement/internal/e;
    //   360: aconst_null
    //   361: getstatic com/google/android/gms/measurement/internal/c3.k0 : Lcom/google/android/gms/measurement/internal/a3;
    //   364: invokevirtual w : (Ljava/lang/String;Lcom/google/android/gms/measurement/internal/a3;)Z
    //   367: ifeq -> 389
    //   370: aload_0
    //   371: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   374: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   377: invokevirtual w : ()Lcom/google/android/gms/measurement/internal/m3;
    //   380: ldc_w 'Disabled IID for tests.'
    //   383: invokevirtual a : (Ljava/lang/String;)V
    //   386: goto -> 343
    //   389: aload_0
    //   390: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   393: invokevirtual a : ()Landroid/content/Context;
    //   396: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   399: ldc_w 'com.google.firebase.analytics.FirebaseAnalytics'
    //   402: invokevirtual loadClass : (Ljava/lang/String;)Ljava/lang/Class;
    //   405: astore #12
    //   407: aload #12
    //   409: ifnonnull -> 415
    //   412: goto -> 343
    //   415: aload #12
    //   417: ldc_w 'getInstance'
    //   420: iconst_1
    //   421: anewarray java/lang/Class
    //   424: dup
    //   425: iconst_0
    //   426: ldc android/content/Context
    //   428: aastore
    //   429: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   432: aconst_null
    //   433: iconst_1
    //   434: anewarray java/lang/Object
    //   437: dup
    //   438: iconst_0
    //   439: aload_0
    //   440: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   443: invokevirtual a : ()Landroid/content/Context;
    //   446: aastore
    //   447: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   450: astore #16
    //   452: aload #16
    //   454: ifnonnull -> 460
    //   457: goto -> 528
    //   460: aload #12
    //   462: ldc_w 'getFirebaseInstanceId'
    //   465: iconst_0
    //   466: anewarray java/lang/Class
    //   469: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   472: aload #16
    //   474: iconst_0
    //   475: anewarray java/lang/Object
    //   478: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   481: checkcast java/lang/String
    //   484: astore #12
    //   486: goto -> 531
    //   489: astore #12
    //   491: aload_0
    //   492: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   495: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   498: invokevirtual t : ()Lcom/google/android/gms/measurement/internal/m3;
    //   501: ldc_w 'Failed to retrieve Firebase Instance Id'
    //   504: invokevirtual a : (Ljava/lang/String;)V
    //   507: goto -> 528
    //   510: astore #12
    //   512: aload_0
    //   513: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   516: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   519: invokevirtual s : ()Lcom/google/android/gms/measurement/internal/m3;
    //   522: ldc_w 'Failed to obtain Firebase Analytics instance'
    //   525: invokevirtual a : (Ljava/lang/String;)V
    //   528: aconst_null
    //   529: astore #12
    //   531: aload_0
    //   532: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   535: astore #16
    //   537: aload #16
    //   539: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   542: getfield f : Lcom/google/android/gms/measurement/internal/a4;
    //   545: invokevirtual a : ()J
    //   548: lstore #8
    //   550: lload #8
    //   552: lconst_0
    //   553: lcmp
    //   554: ifne -> 567
    //   557: aload #16
    //   559: getfield I : J
    //   562: lstore #8
    //   564: goto -> 579
    //   567: aload #16
    //   569: getfield I : J
    //   572: lload #8
    //   574: invokestatic min : (JJ)J
    //   577: lstore #8
    //   579: aload_0
    //   580: invokevirtual j : ()V
    //   583: aload_0
    //   584: getfield k : I
    //   587: istore #19
    //   589: aload_0
    //   590: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   593: invokevirtual z : ()Lcom/google/android/gms/measurement/internal/e;
    //   596: invokevirtual B : ()Z
    //   599: istore #20
    //   601: aload_0
    //   602: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   605: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   608: astore #16
    //   610: aload #16
    //   612: invokevirtual h : ()V
    //   615: aload #16
    //   617: invokevirtual p : ()Landroid/content/SharedPreferences;
    //   620: ldc_w 'deferred_analytics_collection'
    //   623: iconst_0
    //   624: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   629: istore #21
    //   631: aload_0
    //   632: invokevirtual j : ()V
    //   635: aload_0
    //   636: getfield m : Ljava/lang/String;
    //   639: astore #13
    //   641: aload_0
    //   642: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   645: invokevirtual z : ()Lcom/google/android/gms/measurement/internal/e;
    //   648: ldc_w 'google_analytics_default_allow_ad_personalization_signals'
    //   651: invokevirtual y : (Ljava/lang/String;)Ljava/lang/Boolean;
    //   654: astore #16
    //   656: aload #16
    //   658: ifnonnull -> 667
    //   661: aconst_null
    //   662: astore #16
    //   664: goto -> 679
    //   667: aload #16
    //   669: invokevirtual booleanValue : ()Z
    //   672: iconst_1
    //   673: ixor
    //   674: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   677: astore #16
    //   679: aload_0
    //   680: getfield i : J
    //   683: lstore #22
    //   685: aload_0
    //   686: getfield j : Ljava/util/List;
    //   689: astore #24
    //   691: invokestatic a : ()Z
    //   694: pop
    //   695: aload_0
    //   696: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   699: invokevirtual z : ()Lcom/google/android/gms/measurement/internal/e;
    //   702: aconst_null
    //   703: getstatic com/google/android/gms/measurement/internal/c3.i0 : Lcom/google/android/gms/measurement/internal/a3;
    //   706: invokevirtual w : (Ljava/lang/String;Lcom/google/android/gms/measurement/internal/a3;)Z
    //   709: ifeq -> 721
    //   712: aload_0
    //   713: invokevirtual s : ()Ljava/lang/String;
    //   716: astore #14
    //   718: goto -> 724
    //   721: aconst_null
    //   722: astore #14
    //   724: invokestatic a : ()Z
    //   727: pop
    //   728: aload_0
    //   729: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   732: invokevirtual z : ()Lcom/google/android/gms/measurement/internal/e;
    //   735: aconst_null
    //   736: getstatic com/google/android/gms/measurement/internal/c3.w0 : Lcom/google/android/gms/measurement/internal/a3;
    //   739: invokevirtual w : (Ljava/lang/String;Lcom/google/android/gms/measurement/internal/a3;)Z
    //   742: ifeq -> 763
    //   745: aload_0
    //   746: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   749: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   752: invokevirtual t : ()Lcom/google/android/gms/measurement/internal/f;
    //   755: invokevirtual d : ()Ljava/lang/String;
    //   758: astore #15
    //   760: goto -> 767
    //   763: ldc ''
    //   765: astore #15
    //   767: new com/google/android/gms/measurement/internal/zzp
    //   770: dup
    //   771: aload_2
    //   772: aload_3
    //   773: aload #4
    //   775: lload #5
    //   777: aload #7
    //   779: ldc2_w 39065
    //   782: lload #10
    //   784: aload_1
    //   785: iload #17
    //   787: iload #18
    //   789: iconst_1
    //   790: ixor
    //   791: aload #12
    //   793: lconst_0
    //   794: lload #8
    //   796: iload #19
    //   798: iload #20
    //   800: iload #21
    //   802: aload #13
    //   804: aload #16
    //   806: lload #22
    //   808: aload #24
    //   810: aload #14
    //   812: aload #15
    //   814: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    //   817: areturn
    //   818: astore #12
    //   820: goto -> 528
    // Exception table:
    //   from	to	target	type
    //   183	221	278	android/content/pm/PackageManager$NameNotFoundException
    //   226	249	278	android/content/pm/PackageManager$NameNotFoundException
    //   252	269	278	android/content/pm/PackageManager$NameNotFoundException
    //   389	407	818	java/lang/ClassNotFoundException
    //   415	452	510	java/lang/Exception
    //   460	486	489	java/lang/Exception
  }
  
  final String p() {
    j();
    t.j(this.c);
    return this.c;
  }
  
  final String q() {
    j();
    t.j(this.l);
    return this.l;
  }
  
  final String r() {
    j();
    return this.m;
  }
  
  final String s() {
    j();
    t.j(this.n);
    return this.n;
  }
  
  final int t() {
    j();
    return this.e;
  }
  
  final int u() {
    j();
    return this.k;
  }
  
  final List<String> v() {
    return this.j;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/g3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */