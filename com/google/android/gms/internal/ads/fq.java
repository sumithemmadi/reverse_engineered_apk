package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class fq extends up {
  private static final Set<String> e = Collections.synchronizedSet(new HashSet<String>());
  
  private static final DecimalFormat f = new DecimalFormat("#,###");
  
  private File g;
  
  private boolean h;
  
  public fq(eo parameo) {
    super(parameo);
    File file = this.b.getCacheDir();
    if (file == null) {
      cm.i("Context.getCacheDir() returned null");
      return;
    } 
    file = new File(file, "admobVideoStreams");
    this.g = file;
    if (!file.isDirectory() && !this.g.mkdirs()) {
      String str = String.valueOf(this.g.getAbsolutePath());
      if (str.length() != 0) {
        str = "Could not create preload cache directory at ".concat(str);
      } else {
        str = new String("Could not create preload cache directory at ");
      } 
      cm.i(str);
      this.g = null;
      return;
    } 
    if (!this.g.setReadable(true, false) || !this.g.setExecutable(true, false)) {
      String str = String.valueOf(this.g.getAbsolutePath());
      if (str.length() != 0) {
        str = "Could not set cache file permissions at ".concat(str);
      } else {
        str = new String("Could not set cache file permissions at ");
      } 
      cm.i(str);
      this.g = null;
      return;
    } 
  }
  
  private final File z(File paramFile) {
    return new File(this.g, String.valueOf(paramFile.getName()).concat(".done"));
  }
  
  public final void g() {
    this.h = true;
  }
  
  public final boolean w(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Ljava/io/File;
    //   4: astore_2
    //   5: aconst_null
    //   6: astore_3
    //   7: iconst_0
    //   8: istore #4
    //   10: aload_2
    //   11: ifnonnull -> 25
    //   14: aload_0
    //   15: aload_1
    //   16: aconst_null
    //   17: ldc 'noCacheDir'
    //   19: aconst_null
    //   20: invokevirtual n : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   23: iconst_0
    //   24: ireturn
    //   25: aload_0
    //   26: getfield g : Ljava/io/File;
    //   29: astore_2
    //   30: aload_2
    //   31: ifnonnull -> 40
    //   34: iconst_0
    //   35: istore #5
    //   37: goto -> 101
    //   40: aload_2
    //   41: invokevirtual listFiles : ()[Ljava/io/File;
    //   44: astore_2
    //   45: aload_2
    //   46: arraylength
    //   47: istore #6
    //   49: iconst_0
    //   50: istore #7
    //   52: iconst_0
    //   53: istore #8
    //   55: iload #8
    //   57: istore #5
    //   59: iload #7
    //   61: iload #6
    //   63: if_icmpge -> 101
    //   66: iload #8
    //   68: istore #5
    //   70: aload_2
    //   71: iload #7
    //   73: aaload
    //   74: invokevirtual getName : ()Ljava/lang/String;
    //   77: ldc '.done'
    //   79: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   82: ifne -> 91
    //   85: iload #8
    //   87: iconst_1
    //   88: iadd
    //   89: istore #5
    //   91: iinc #7, 1
    //   94: iload #5
    //   96: istore #8
    //   98: goto -> 55
    //   101: getstatic com/google/android/gms/internal/ads/m0.o : Lcom/google/android/gms/internal/ads/x;
    //   104: astore_2
    //   105: iload #5
    //   107: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   110: aload_2
    //   111: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   114: checkcast java/lang/Integer
    //   117: invokevirtual intValue : ()I
    //   120: if_icmple -> 296
    //   123: aload_0
    //   124: getfield g : Ljava/io/File;
    //   127: astore_2
    //   128: aload_2
    //   129: ifnonnull -> 138
    //   132: iconst_0
    //   133: istore #9
    //   135: goto -> 275
    //   138: ldc2_w 9223372036854775807
    //   141: lstore #10
    //   143: aload_2
    //   144: invokevirtual listFiles : ()[Ljava/io/File;
    //   147: astore #12
    //   149: aload #12
    //   151: arraylength
    //   152: istore #7
    //   154: aconst_null
    //   155: astore #13
    //   157: iconst_0
    //   158: istore #8
    //   160: iload #8
    //   162: iload #7
    //   164: if_icmpge -> 236
    //   167: aload #12
    //   169: iload #8
    //   171: aaload
    //   172: astore #14
    //   174: lload #10
    //   176: lstore #15
    //   178: aload #13
    //   180: astore_2
    //   181: aload #14
    //   183: invokevirtual getName : ()Ljava/lang/String;
    //   186: ldc '.done'
    //   188: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   191: ifne -> 223
    //   194: aload #14
    //   196: invokevirtual lastModified : ()J
    //   199: lstore #17
    //   201: lload #10
    //   203: lstore #15
    //   205: aload #13
    //   207: astore_2
    //   208: lload #17
    //   210: lload #10
    //   212: lcmp
    //   213: ifge -> 223
    //   216: aload #14
    //   218: astore_2
    //   219: lload #17
    //   221: lstore #15
    //   223: iinc #8, 1
    //   226: lload #15
    //   228: lstore #10
    //   230: aload_2
    //   231: astore #13
    //   233: goto -> 160
    //   236: aload #13
    //   238: ifnull -> 132
    //   241: aload #13
    //   243: invokevirtual delete : ()Z
    //   246: istore #19
    //   248: aload_0
    //   249: aload #13
    //   251: invokespecial z : (Ljava/io/File;)Ljava/io/File;
    //   254: astore_2
    //   255: iload #19
    //   257: istore #9
    //   259: aload_2
    //   260: invokevirtual isFile : ()Z
    //   263: ifeq -> 275
    //   266: iload #19
    //   268: aload_2
    //   269: invokevirtual delete : ()Z
    //   272: iand
    //   273: istore #9
    //   275: iload #9
    //   277: ifne -> 25
    //   280: ldc 'Unable to expire stream cache'
    //   282: invokestatic i : (Ljava/lang/String;)V
    //   285: aload_0
    //   286: aload_1
    //   287: aconst_null
    //   288: ldc 'expireFailed'
    //   290: aconst_null
    //   291: invokevirtual n : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   294: iconst_0
    //   295: ireturn
    //   296: aload_0
    //   297: aload_1
    //   298: invokevirtual x : (Ljava/lang/String;)Ljava/lang/String;
    //   301: astore_2
    //   302: new java/io/File
    //   305: dup
    //   306: aload_0
    //   307: getfield g : Ljava/io/File;
    //   310: aload_2
    //   311: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   314: astore #20
    //   316: aload_0
    //   317: aload #20
    //   319: invokespecial z : (Ljava/io/File;)Ljava/io/File;
    //   322: astore #21
    //   324: aload #20
    //   326: invokevirtual isFile : ()Z
    //   329: ifeq -> 398
    //   332: aload #21
    //   334: invokevirtual isFile : ()Z
    //   337: ifeq -> 398
    //   340: aload #20
    //   342: invokevirtual length : ()J
    //   345: l2i
    //   346: istore #8
    //   348: aload_1
    //   349: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   352: astore_2
    //   353: aload_2
    //   354: invokevirtual length : ()I
    //   357: ifeq -> 370
    //   360: ldc 'Stream cache hit at '
    //   362: aload_2
    //   363: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   366: astore_2
    //   367: goto -> 380
    //   370: new java/lang/String
    //   373: dup
    //   374: ldc 'Stream cache hit at '
    //   376: invokespecial <init> : (Ljava/lang/String;)V
    //   379: astore_2
    //   380: aload_2
    //   381: invokestatic e : (Ljava/lang/String;)V
    //   384: aload_0
    //   385: aload_1
    //   386: aload #20
    //   388: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   391: iload #8
    //   393: invokevirtual j : (Ljava/lang/String;Ljava/lang/String;I)V
    //   396: iconst_1
    //   397: ireturn
    //   398: aload_0
    //   399: getfield g : Ljava/io/File;
    //   402: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   405: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   408: astore #13
    //   410: aload_1
    //   411: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   414: astore_2
    //   415: aload_2
    //   416: invokevirtual length : ()I
    //   419: ifeq -> 433
    //   422: aload #13
    //   424: aload_2
    //   425: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   428: astore #13
    //   430: goto -> 444
    //   433: new java/lang/String
    //   436: dup
    //   437: aload #13
    //   439: invokespecial <init> : (Ljava/lang/String;)V
    //   442: astore #13
    //   444: getstatic com/google/android/gms/internal/ads/fq.e : Ljava/util/Set;
    //   447: astore #14
    //   449: aload #14
    //   451: monitorenter
    //   452: aload #14
    //   454: aload #13
    //   456: invokeinterface contains : (Ljava/lang/Object;)Z
    //   461: ifeq -> 518
    //   464: aload_1
    //   465: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   468: astore_2
    //   469: aload_2
    //   470: invokevirtual length : ()I
    //   473: ifeq -> 486
    //   476: ldc 'Stream cache already in progress at '
    //   478: aload_2
    //   479: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   482: astore_2
    //   483: goto -> 496
    //   486: new java/lang/String
    //   489: dup
    //   490: ldc 'Stream cache already in progress at '
    //   492: invokespecial <init> : (Ljava/lang/String;)V
    //   495: astore_2
    //   496: aload_2
    //   497: invokestatic i : (Ljava/lang/String;)V
    //   500: aload_0
    //   501: aload_1
    //   502: aload #20
    //   504: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   507: ldc 'inProgress'
    //   509: aconst_null
    //   510: invokevirtual n : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   513: aload #14
    //   515: monitorexit
    //   516: iconst_0
    //   517: ireturn
    //   518: aload #14
    //   520: aload #13
    //   522: invokeinterface add : (Ljava/lang/Object;)Z
    //   527: pop
    //   528: aload #14
    //   530: monitorexit
    //   531: ldc 'error'
    //   533: astore_2
    //   534: invokestatic o : ()Lcom/google/android/gms/internal/ads/pm;
    //   537: pop
    //   538: getstatic com/google/android/gms/internal/ads/m0.t : Lcom/google/android/gms/internal/ads/x;
    //   541: astore #14
    //   543: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   546: aload #14
    //   548: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   551: checkcast java/lang/Integer
    //   554: invokevirtual intValue : ()I
    //   557: istore #7
    //   559: new java/net/URL
    //   562: astore #22
    //   564: aload #22
    //   566: aload_1
    //   567: invokespecial <init> : (Ljava/lang/String;)V
    //   570: iconst_0
    //   571: istore #8
    //   573: iinc #8, 1
    //   576: iload #8
    //   578: bipush #20
    //   580: if_icmpgt -> 2807
    //   583: aload #22
    //   585: invokevirtual openConnection : ()Ljava/net/URLConnection;
    //   588: astore #14
    //   590: aload #14
    //   592: iload #7
    //   594: invokevirtual setConnectTimeout : (I)V
    //   597: aload #14
    //   599: iload #7
    //   601: invokevirtual setReadTimeout : (I)V
    //   604: aload #14
    //   606: instanceof java/net/HttpURLConnection
    //   609: ifeq -> 2794
    //   612: aload #14
    //   614: checkcast java/net/HttpURLConnection
    //   617: astore #23
    //   619: new com/google/android/gms/internal/ads/wl
    //   622: astore #14
    //   624: aload #14
    //   626: invokespecial <init> : ()V
    //   629: aload #14
    //   631: aload #23
    //   633: aconst_null
    //   634: invokevirtual i : (Ljava/net/HttpURLConnection;[B)V
    //   637: aload #23
    //   639: iconst_0
    //   640: invokevirtual setInstanceFollowRedirects : (Z)V
    //   643: aload #23
    //   645: invokevirtual getResponseCode : ()I
    //   648: istore #5
    //   650: aload #14
    //   652: aload #23
    //   654: iload #5
    //   656: invokevirtual h : (Ljava/net/HttpURLConnection;I)V
    //   659: iload #5
    //   661: bipush #100
    //   663: idiv
    //   664: istore #5
    //   666: iload #5
    //   668: iconst_3
    //   669: if_icmpne -> 1038
    //   672: aload_2
    //   673: astore #14
    //   675: aload_2
    //   676: astore #12
    //   678: aload #23
    //   680: ldc 'Location'
    //   682: invokevirtual getHeaderField : (Ljava/lang/String;)Ljava/lang/String;
    //   685: astore #24
    //   687: aload #24
    //   689: ifnull -> 968
    //   692: aload_2
    //   693: astore #14
    //   695: aload_2
    //   696: astore #12
    //   698: new java/net/URL
    //   701: astore #25
    //   703: aload_2
    //   704: astore #14
    //   706: aload_2
    //   707: astore #12
    //   709: aload #25
    //   711: aload #22
    //   713: aload #24
    //   715: invokespecial <init> : (Ljava/net/URL;Ljava/lang/String;)V
    //   718: aload_2
    //   719: astore #14
    //   721: aload_2
    //   722: astore #12
    //   724: aload #25
    //   726: invokevirtual getProtocol : ()Ljava/lang/String;
    //   729: astore #22
    //   731: aload #22
    //   733: ifnull -> 934
    //   736: aload_2
    //   737: astore #14
    //   739: aload_2
    //   740: astore #12
    //   742: aload #22
    //   744: ldc_w 'http'
    //   747: invokevirtual equals : (Ljava/lang/Object;)Z
    //   750: ifne -> 854
    //   753: aload_2
    //   754: astore #14
    //   756: aload_2
    //   757: astore #12
    //   759: aload #22
    //   761: ldc_w 'https'
    //   764: invokevirtual equals : (Ljava/lang/Object;)Z
    //   767: ifne -> 854
    //   770: aload_2
    //   771: astore #14
    //   773: aload_2
    //   774: astore #12
    //   776: new java/io/IOException
    //   779: astore #25
    //   781: aload_2
    //   782: astore #14
    //   784: aload_2
    //   785: astore #12
    //   787: aload #22
    //   789: invokevirtual length : ()I
    //   792: ifeq -> 814
    //   795: aload_2
    //   796: astore #14
    //   798: aload_2
    //   799: astore #12
    //   801: ldc_w 'Unsupported scheme: '
    //   804: aload #22
    //   806: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   809: astore #22
    //   811: goto -> 832
    //   814: aload_2
    //   815: astore #14
    //   817: aload_2
    //   818: astore #12
    //   820: new java/lang/String
    //   823: dup
    //   824: ldc_w 'Unsupported scheme: '
    //   827: invokespecial <init> : (Ljava/lang/String;)V
    //   830: astore #22
    //   832: aload_2
    //   833: astore #14
    //   835: aload_2
    //   836: astore #12
    //   838: aload #25
    //   840: aload #22
    //   842: invokespecial <init> : (Ljava/lang/String;)V
    //   845: aload_2
    //   846: astore #14
    //   848: aload_2
    //   849: astore #12
    //   851: aload #25
    //   853: athrow
    //   854: aload_2
    //   855: astore #14
    //   857: aload_2
    //   858: astore #12
    //   860: aload #24
    //   862: invokevirtual length : ()I
    //   865: ifeq -> 887
    //   868: aload_2
    //   869: astore #14
    //   871: aload_2
    //   872: astore #12
    //   874: ldc_w 'Redirecting to '
    //   877: aload #24
    //   879: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   882: astore #22
    //   884: goto -> 905
    //   887: aload_2
    //   888: astore #14
    //   890: aload_2
    //   891: astore #12
    //   893: new java/lang/String
    //   896: dup
    //   897: ldc_w 'Redirecting to '
    //   900: invokespecial <init> : (Ljava/lang/String;)V
    //   903: astore #22
    //   905: aload_2
    //   906: astore #14
    //   908: aload_2
    //   909: astore #12
    //   911: aload #22
    //   913: invokestatic e : (Ljava/lang/String;)V
    //   916: aload_2
    //   917: astore #14
    //   919: aload_2
    //   920: astore #12
    //   922: aload #23
    //   924: invokevirtual disconnect : ()V
    //   927: aload #25
    //   929: astore #22
    //   931: goto -> 573
    //   934: aload_2
    //   935: astore #14
    //   937: aload_2
    //   938: astore #12
    //   940: new java/io/IOException
    //   943: astore #22
    //   945: aload_2
    //   946: astore #14
    //   948: aload_2
    //   949: astore #12
    //   951: aload #22
    //   953: ldc_w 'Protocol is null'
    //   956: invokespecial <init> : (Ljava/lang/String;)V
    //   959: aload_2
    //   960: astore #14
    //   962: aload_2
    //   963: astore #12
    //   965: aload #22
    //   967: athrow
    //   968: aload_2
    //   969: astore #14
    //   971: aload_2
    //   972: astore #12
    //   974: new java/io/IOException
    //   977: astore #22
    //   979: aload_2
    //   980: astore #14
    //   982: aload_2
    //   983: astore #12
    //   985: aload #22
    //   987: ldc_w 'Missing Location header in redirect'
    //   990: invokespecial <init> : (Ljava/lang/String;)V
    //   993: aload_2
    //   994: astore #14
    //   996: aload_2
    //   997: astore #12
    //   999: aload #22
    //   1001: athrow
    //   1002: astore_2
    //   1003: goto -> 1011
    //   1006: astore_2
    //   1007: aload #12
    //   1009: astore #14
    //   1011: aconst_null
    //   1012: astore #22
    //   1014: aload #14
    //   1016: astore #12
    //   1018: aload #22
    //   1020: astore #14
    //   1022: aload #13
    //   1024: astore #22
    //   1026: aload_2
    //   1027: astore #13
    //   1029: aload #22
    //   1031: astore_2
    //   1032: aload_3
    //   1033: astore #22
    //   1035: goto -> 2851
    //   1038: aload #23
    //   1040: invokevirtual getResponseCode : ()I
    //   1043: istore #8
    //   1045: iload #8
    //   1047: sipush #400
    //   1050: if_icmplt -> 1222
    //   1053: ldc_w 'badUrl'
    //   1056: astore #22
    //   1058: aload #22
    //   1060: astore #14
    //   1062: aload #22
    //   1064: astore #12
    //   1066: iload #8
    //   1068: invokestatic toString : (I)Ljava/lang/String;
    //   1071: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1074: astore_2
    //   1075: aload #22
    //   1077: astore #14
    //   1079: aload #22
    //   1081: astore #12
    //   1083: aload_2
    //   1084: invokevirtual length : ()I
    //   1087: ifeq -> 1112
    //   1090: aload #22
    //   1092: astore #14
    //   1094: aload #22
    //   1096: astore #12
    //   1098: ldc_w 'HTTP request failed. Code: '
    //   1101: aload_2
    //   1102: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   1105: astore_2
    //   1106: aload_2
    //   1107: astore #14
    //   1109: goto -> 1134
    //   1112: aload #22
    //   1114: astore #14
    //   1116: aload #22
    //   1118: astore #12
    //   1120: new java/lang/String
    //   1123: dup
    //   1124: ldc_w 'HTTP request failed. Code: '
    //   1127: invokespecial <init> : (Ljava/lang/String;)V
    //   1130: astore_2
    //   1131: aload_2
    //   1132: astore #14
    //   1134: new java/io/IOException
    //   1137: astore_2
    //   1138: aload_1
    //   1139: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1142: invokevirtual length : ()I
    //   1145: istore #7
    //   1147: new java/lang/StringBuilder
    //   1150: astore #12
    //   1152: aload #12
    //   1154: iload #7
    //   1156: bipush #32
    //   1158: iadd
    //   1159: invokespecial <init> : (I)V
    //   1162: aload #12
    //   1164: ldc_w 'HTTP status code '
    //   1167: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1170: pop
    //   1171: aload #12
    //   1173: iload #8
    //   1175: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1178: pop
    //   1179: aload #12
    //   1181: ldc_w ' at '
    //   1184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1187: pop
    //   1188: aload #12
    //   1190: aload_1
    //   1191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1194: pop
    //   1195: aload_2
    //   1196: aload #12
    //   1198: invokevirtual toString : ()Ljava/lang/String;
    //   1201: invokespecial <init> : (Ljava/lang/String;)V
    //   1204: aload_2
    //   1205: athrow
    //   1206: astore_2
    //   1207: aload #22
    //   1209: astore #12
    //   1211: goto -> 1022
    //   1214: astore_2
    //   1215: aload #22
    //   1217: astore #12
    //   1219: goto -> 1022
    //   1222: aload #23
    //   1224: invokevirtual getContentLength : ()I
    //   1227: istore #7
    //   1229: iload #7
    //   1231: ifge -> 1347
    //   1234: aload_2
    //   1235: astore #14
    //   1237: aload_2
    //   1238: astore #12
    //   1240: aload_1
    //   1241: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1244: astore #22
    //   1246: aload_2
    //   1247: astore #14
    //   1249: aload_2
    //   1250: astore #12
    //   1252: aload #22
    //   1254: invokevirtual length : ()I
    //   1257: ifeq -> 1279
    //   1260: aload_2
    //   1261: astore #14
    //   1263: aload_2
    //   1264: astore #12
    //   1266: ldc_w 'Stream cache aborted, missing content-length header at '
    //   1269: aload #22
    //   1271: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   1274: astore #22
    //   1276: goto -> 1297
    //   1279: aload_2
    //   1280: astore #14
    //   1282: aload_2
    //   1283: astore #12
    //   1285: new java/lang/String
    //   1288: dup
    //   1289: ldc_w 'Stream cache aborted, missing content-length header at '
    //   1292: invokespecial <init> : (Ljava/lang/String;)V
    //   1295: astore #22
    //   1297: aload_2
    //   1298: astore #14
    //   1300: aload_2
    //   1301: astore #12
    //   1303: aload #22
    //   1305: invokestatic i : (Ljava/lang/String;)V
    //   1308: aload_2
    //   1309: astore #14
    //   1311: aload_2
    //   1312: astore #12
    //   1314: aload_0
    //   1315: aload_1
    //   1316: aload #20
    //   1318: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   1321: ldc_w 'contentLengthMissing'
    //   1324: aconst_null
    //   1325: invokevirtual n : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   1328: aload_2
    //   1329: astore #14
    //   1331: aload_2
    //   1332: astore #12
    //   1334: getstatic com/google/android/gms/internal/ads/fq.e : Ljava/util/Set;
    //   1337: aload #13
    //   1339: invokeinterface remove : (Ljava/lang/Object;)Z
    //   1344: pop
    //   1345: iconst_0
    //   1346: ireturn
    //   1347: getstatic com/google/android/gms/internal/ads/fq.f : Ljava/text/DecimalFormat;
    //   1350: iload #7
    //   1352: i2l
    //   1353: invokevirtual format : (J)Ljava/lang/String;
    //   1356: astore #22
    //   1358: getstatic com/google/android/gms/internal/ads/m0.p : Lcom/google/android/gms/internal/ads/x;
    //   1361: astore #14
    //   1363: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   1366: aload #14
    //   1368: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   1371: checkcast java/lang/Integer
    //   1374: invokevirtual intValue : ()I
    //   1377: istore #5
    //   1379: iload #7
    //   1381: iload #5
    //   1383: if_icmple -> 1622
    //   1386: aload_2
    //   1387: astore #14
    //   1389: aload_2
    //   1390: astore #12
    //   1392: aload #22
    //   1394: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1397: invokevirtual length : ()I
    //   1400: istore #7
    //   1402: aload_2
    //   1403: astore #14
    //   1405: aload_2
    //   1406: astore #12
    //   1408: aload_1
    //   1409: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1412: invokevirtual length : ()I
    //   1415: istore #8
    //   1417: aload_2
    //   1418: astore #14
    //   1420: aload_2
    //   1421: astore #12
    //   1423: new java/lang/StringBuilder
    //   1426: astore #25
    //   1428: aload_2
    //   1429: astore #14
    //   1431: aload_2
    //   1432: astore #12
    //   1434: aload #25
    //   1436: iload #7
    //   1438: bipush #33
    //   1440: iadd
    //   1441: iload #8
    //   1443: iadd
    //   1444: invokespecial <init> : (I)V
    //   1447: aload_2
    //   1448: astore #14
    //   1450: aload_2
    //   1451: astore #12
    //   1453: aload #25
    //   1455: ldc_w 'Content length '
    //   1458: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1461: pop
    //   1462: aload_2
    //   1463: astore #14
    //   1465: aload_2
    //   1466: astore #12
    //   1468: aload #25
    //   1470: aload #22
    //   1472: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1475: pop
    //   1476: aload_2
    //   1477: astore #14
    //   1479: aload_2
    //   1480: astore #12
    //   1482: aload #25
    //   1484: ldc_w ' exceeds limit at '
    //   1487: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1490: pop
    //   1491: aload_2
    //   1492: astore #14
    //   1494: aload_2
    //   1495: astore #12
    //   1497: aload #25
    //   1499: aload_1
    //   1500: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1503: pop
    //   1504: aload_2
    //   1505: astore #14
    //   1507: aload_2
    //   1508: astore #12
    //   1510: aload #25
    //   1512: invokevirtual toString : ()Ljava/lang/String;
    //   1515: invokestatic i : (Ljava/lang/String;)V
    //   1518: aload_2
    //   1519: astore #14
    //   1521: aload_2
    //   1522: astore #12
    //   1524: aload #22
    //   1526: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1529: astore #22
    //   1531: aload_2
    //   1532: astore #14
    //   1534: aload_2
    //   1535: astore #12
    //   1537: aload #22
    //   1539: invokevirtual length : ()I
    //   1542: ifeq -> 1564
    //   1545: aload_2
    //   1546: astore #14
    //   1548: aload_2
    //   1549: astore #12
    //   1551: ldc_w 'File too big for full file cache. Size: '
    //   1554: aload #22
    //   1556: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   1559: astore #22
    //   1561: goto -> 1582
    //   1564: aload_2
    //   1565: astore #14
    //   1567: aload_2
    //   1568: astore #12
    //   1570: new java/lang/String
    //   1573: dup
    //   1574: ldc_w 'File too big for full file cache. Size: '
    //   1577: invokespecial <init> : (Ljava/lang/String;)V
    //   1580: astore #22
    //   1582: aload_2
    //   1583: astore #14
    //   1585: aload_2
    //   1586: astore #12
    //   1588: aload_0
    //   1589: aload_1
    //   1590: aload #20
    //   1592: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   1595: ldc_w 'sizeExceeded'
    //   1598: aload #22
    //   1600: invokevirtual n : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   1603: aload_2
    //   1604: astore #14
    //   1606: aload_2
    //   1607: astore #12
    //   1609: getstatic com/google/android/gms/internal/ads/fq.e : Ljava/util/Set;
    //   1612: aload #13
    //   1614: invokeinterface remove : (Ljava/lang/Object;)Z
    //   1619: pop
    //   1620: iconst_0
    //   1621: ireturn
    //   1622: aload #22
    //   1624: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1627: invokevirtual length : ()I
    //   1630: istore #6
    //   1632: aload_1
    //   1633: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1636: invokevirtual length : ()I
    //   1639: istore #8
    //   1641: new java/lang/StringBuilder
    //   1644: astore #14
    //   1646: aload #14
    //   1648: iload #6
    //   1650: bipush #20
    //   1652: iadd
    //   1653: iload #8
    //   1655: iadd
    //   1656: invokespecial <init> : (I)V
    //   1659: aload #14
    //   1661: ldc_w 'Caching '
    //   1664: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1667: pop
    //   1668: aload #14
    //   1670: aload #22
    //   1672: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1675: pop
    //   1676: aload #14
    //   1678: ldc_w ' bytes from '
    //   1681: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1684: pop
    //   1685: aload #14
    //   1687: aload_1
    //   1688: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1691: pop
    //   1692: aload #14
    //   1694: invokevirtual toString : ()Ljava/lang/String;
    //   1697: invokestatic e : (Ljava/lang/String;)V
    //   1700: aload #23
    //   1702: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   1705: invokestatic newChannel : (Ljava/io/InputStream;)Ljava/nio/channels/ReadableByteChannel;
    //   1708: astore #26
    //   1710: new java/io/FileOutputStream
    //   1713: astore #12
    //   1715: aload #12
    //   1717: aload #20
    //   1719: invokespecial <init> : (Ljava/io/File;)V
    //   1722: aload #12
    //   1724: invokevirtual getChannel : ()Ljava/nio/channels/FileChannel;
    //   1727: astore #27
    //   1729: ldc_w 1048576
    //   1732: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   1735: astore #28
    //   1737: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   1740: astore #29
    //   1742: aload #29
    //   1744: invokeinterface a : ()J
    //   1749: lstore #15
    //   1751: getstatic com/google/android/gms/internal/ads/m0.s : Lcom/google/android/gms/internal/ads/x;
    //   1754: astore #14
    //   1756: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   1759: aload #14
    //   1761: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   1764: checkcast java/lang/Long
    //   1767: astore #14
    //   1769: aload #12
    //   1771: astore #23
    //   1773: aload #13
    //   1775: astore_3
    //   1776: aload_2
    //   1777: astore #22
    //   1779: aload #12
    //   1781: astore #25
    //   1783: aload #13
    //   1785: astore #24
    //   1787: aload_2
    //   1788: astore #30
    //   1790: aload #14
    //   1792: invokevirtual longValue : ()J
    //   1795: lstore #10
    //   1797: aload #12
    //   1799: astore #23
    //   1801: aload #13
    //   1803: astore_3
    //   1804: aload_2
    //   1805: astore #22
    //   1807: aload #12
    //   1809: astore #25
    //   1811: aload #13
    //   1813: astore #24
    //   1815: aload_2
    //   1816: astore #30
    //   1818: new com/google/android/gms/ads/internal/util/p0
    //   1821: astore #31
    //   1823: aload #12
    //   1825: astore #23
    //   1827: aload #13
    //   1829: astore_3
    //   1830: aload_2
    //   1831: astore #22
    //   1833: aload #12
    //   1835: astore #25
    //   1837: aload #13
    //   1839: astore #24
    //   1841: aload_2
    //   1842: astore #30
    //   1844: aload #31
    //   1846: lload #10
    //   1848: invokespecial <init> : (J)V
    //   1851: aload #12
    //   1853: astore #23
    //   1855: aload #13
    //   1857: astore_3
    //   1858: aload_2
    //   1859: astore #22
    //   1861: aload #12
    //   1863: astore #25
    //   1865: aload #13
    //   1867: astore #24
    //   1869: aload_2
    //   1870: astore #30
    //   1872: getstatic com/google/android/gms/internal/ads/m0.r : Lcom/google/android/gms/internal/ads/x;
    //   1875: astore #14
    //   1877: aload #12
    //   1879: astore #23
    //   1881: aload #13
    //   1883: astore_3
    //   1884: aload_2
    //   1885: astore #22
    //   1887: aload #12
    //   1889: astore #25
    //   1891: aload #13
    //   1893: astore #24
    //   1895: aload_2
    //   1896: astore #30
    //   1898: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   1901: aload #14
    //   1903: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   1906: checkcast java/lang/Long
    //   1909: invokevirtual longValue : ()J
    //   1912: lstore #10
    //   1914: aload_2
    //   1915: astore #14
    //   1917: iload #4
    //   1919: istore #8
    //   1921: aload #13
    //   1923: astore_2
    //   1924: aload #12
    //   1926: astore #13
    //   1928: aload #27
    //   1930: astore #12
    //   1932: aload #13
    //   1934: astore #23
    //   1936: aload_2
    //   1937: astore_3
    //   1938: aload #14
    //   1940: astore #22
    //   1942: aload #13
    //   1944: astore #25
    //   1946: aload_2
    //   1947: astore #24
    //   1949: aload #14
    //   1951: astore #30
    //   1953: aload #26
    //   1955: aload #28
    //   1957: invokeinterface read : (Ljava/nio/ByteBuffer;)I
    //   1962: istore #4
    //   1964: iload #4
    //   1966: iflt -> 2491
    //   1969: iload #8
    //   1971: iload #4
    //   1973: iadd
    //   1974: istore #8
    //   1976: iload #8
    //   1978: iload #5
    //   1980: if_icmple -> 2126
    //   1983: ldc_w 'sizeExceeded'
    //   1986: astore #14
    //   1988: aload #14
    //   1990: astore #12
    //   1992: aload #14
    //   1994: astore #22
    //   1996: iload #8
    //   1998: invokestatic toString : (I)Ljava/lang/String;
    //   2001: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   2004: astore_3
    //   2005: aload #14
    //   2007: astore #12
    //   2009: aload #14
    //   2011: astore #22
    //   2013: aload_3
    //   2014: invokevirtual length : ()I
    //   2017: ifeq -> 2042
    //   2020: aload #14
    //   2022: astore #12
    //   2024: aload #14
    //   2026: astore #22
    //   2028: ldc_w 'File too big for full file cache. Size: '
    //   2031: aload_3
    //   2032: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   2035: astore_3
    //   2036: aload_3
    //   2037: astore #12
    //   2039: goto -> 2064
    //   2042: aload #14
    //   2044: astore #12
    //   2046: aload #14
    //   2048: astore #22
    //   2050: new java/lang/String
    //   2053: dup
    //   2054: ldc_w 'File too big for full file cache. Size: '
    //   2057: invokespecial <init> : (Ljava/lang/String;)V
    //   2060: astore_3
    //   2061: aload_3
    //   2062: astore #12
    //   2064: new java/io/IOException
    //   2067: astore #22
    //   2069: aload #22
    //   2071: ldc_w 'stream cache file size limit exceeded'
    //   2074: invokespecial <init> : (Ljava/lang/String;)V
    //   2077: aload #22
    //   2079: athrow
    //   2080: astore_3
    //   2081: goto -> 2085
    //   2084: astore_3
    //   2085: aload #12
    //   2087: astore #22
    //   2089: aload #14
    //   2091: astore #12
    //   2093: goto -> 2108
    //   2096: astore_3
    //   2097: goto -> 2105
    //   2100: astore_3
    //   2101: aload #22
    //   2103: astore #12
    //   2105: aconst_null
    //   2106: astore #22
    //   2108: aload #13
    //   2110: astore #25
    //   2112: aload_3
    //   2113: astore #13
    //   2115: aload #22
    //   2117: astore #14
    //   2119: aload #25
    //   2121: astore #22
    //   2123: goto -> 2851
    //   2126: aload #28
    //   2128: invokevirtual flip : ()Ljava/nio/Buffer;
    //   2131: pop
    //   2132: aload #12
    //   2134: aload #28
    //   2136: invokevirtual write : (Ljava/nio/ByteBuffer;)I
    //   2139: ifgt -> 2132
    //   2142: aload #28
    //   2144: invokevirtual clear : ()Ljava/nio/Buffer;
    //   2147: pop
    //   2148: aload #29
    //   2150: invokeinterface a : ()J
    //   2155: lload #15
    //   2157: lsub
    //   2158: ldc2_w 1000
    //   2161: lload #10
    //   2163: lmul
    //   2164: lcmp
    //   2165: ifgt -> 2278
    //   2168: aload_0
    //   2169: getfield h : Z
    //   2172: ifne -> 2236
    //   2175: aload #31
    //   2177: invokevirtual a : ()Z
    //   2180: ifeq -> 2233
    //   2183: aload #20
    //   2185: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   2188: astore #22
    //   2190: getstatic com/google/android/gms/internal/ads/sl.a : Landroid/os/Handler;
    //   2193: astore_3
    //   2194: new com/google/android/gms/internal/ads/xp
    //   2197: astore #25
    //   2199: aload #25
    //   2201: aload_0
    //   2202: aload_1
    //   2203: aload #22
    //   2205: iload #8
    //   2207: iload #7
    //   2209: iconst_0
    //   2210: invokespecial <init> : (Lcom/google/android/gms/internal/ads/up;Ljava/lang/String;Ljava/lang/String;IIZ)V
    //   2213: aload_3
    //   2214: aload #25
    //   2216: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   2219: pop
    //   2220: goto -> 2233
    //   2223: astore #12
    //   2225: goto -> 2230
    //   2228: astore #12
    //   2230: goto -> 2709
    //   2233: goto -> 1932
    //   2236: ldc_w 'externalAbort'
    //   2239: astore #14
    //   2241: aload #14
    //   2243: astore #22
    //   2245: aload #14
    //   2247: astore_3
    //   2248: new java/io/IOException
    //   2251: astore #12
    //   2253: aload #14
    //   2255: astore #22
    //   2257: aload #14
    //   2259: astore_3
    //   2260: aload #12
    //   2262: ldc_w 'abort requested'
    //   2265: invokespecial <init> : (Ljava/lang/String;)V
    //   2268: aload #14
    //   2270: astore #22
    //   2272: aload #14
    //   2274: astore_3
    //   2275: aload #12
    //   2277: athrow
    //   2278: ldc_w 'downloadTimeout'
    //   2281: astore #12
    //   2283: aload #12
    //   2285: astore #22
    //   2287: aload #12
    //   2289: astore_3
    //   2290: lload #10
    //   2292: invokestatic toString : (J)Ljava/lang/String;
    //   2295: astore #14
    //   2297: aload #12
    //   2299: astore #22
    //   2301: aload #12
    //   2303: astore_3
    //   2304: aload #14
    //   2306: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   2309: invokevirtual length : ()I
    //   2312: istore #8
    //   2314: aload #12
    //   2316: astore #22
    //   2318: aload #12
    //   2320: astore_3
    //   2321: new java/lang/StringBuilder
    //   2324: astore #25
    //   2326: aload #12
    //   2328: astore #22
    //   2330: aload #12
    //   2332: astore_3
    //   2333: aload #25
    //   2335: iload #8
    //   2337: bipush #29
    //   2339: iadd
    //   2340: invokespecial <init> : (I)V
    //   2343: aload #12
    //   2345: astore #22
    //   2347: aload #12
    //   2349: astore_3
    //   2350: aload #25
    //   2352: ldc_w 'Timeout exceeded. Limit: '
    //   2355: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2358: pop
    //   2359: aload #12
    //   2361: astore #22
    //   2363: aload #12
    //   2365: astore_3
    //   2366: aload #25
    //   2368: aload #14
    //   2370: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2373: pop
    //   2374: aload #12
    //   2376: astore #22
    //   2378: aload #12
    //   2380: astore_3
    //   2381: aload #25
    //   2383: ldc_w ' sec'
    //   2386: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2389: pop
    //   2390: aload #12
    //   2392: astore #22
    //   2394: aload #12
    //   2396: astore_3
    //   2397: aload #25
    //   2399: invokevirtual toString : ()Ljava/lang/String;
    //   2402: astore #25
    //   2404: new java/io/IOException
    //   2407: astore #14
    //   2409: aload #14
    //   2411: ldc_w 'stream cache time limit exceeded'
    //   2414: invokespecial <init> : (Ljava/lang/String;)V
    //   2417: aload #14
    //   2419: athrow
    //   2420: astore #14
    //   2422: goto -> 2427
    //   2425: astore #14
    //   2427: aload #25
    //   2429: astore #22
    //   2431: aload #13
    //   2433: astore_3
    //   2434: aload #14
    //   2436: astore #13
    //   2438: aload #22
    //   2440: astore #14
    //   2442: aload_3
    //   2443: astore #22
    //   2445: goto -> 2851
    //   2448: astore #14
    //   2450: aload #22
    //   2452: astore #12
    //   2454: goto -> 2610
    //   2457: astore #14
    //   2459: aload_3
    //   2460: astore #12
    //   2462: goto -> 2610
    //   2465: astore #12
    //   2467: goto -> 2472
    //   2470: astore #12
    //   2472: aload #13
    //   2474: astore #22
    //   2476: aload #12
    //   2478: astore #13
    //   2480: aload #14
    //   2482: astore #12
    //   2484: aload #22
    //   2486: astore #14
    //   2488: goto -> 2784
    //   2491: aload_2
    //   2492: astore #12
    //   2494: aload #13
    //   2496: invokevirtual close : ()V
    //   2499: iconst_3
    //   2500: invokestatic a : (I)Z
    //   2503: istore #9
    //   2505: iload #9
    //   2507: ifeq -> 2625
    //   2510: getstatic com/google/android/gms/internal/ads/fq.f : Ljava/text/DecimalFormat;
    //   2513: iload #8
    //   2515: i2l
    //   2516: invokevirtual format : (J)Ljava/lang/String;
    //   2519: astore #22
    //   2521: aload #22
    //   2523: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   2526: invokevirtual length : ()I
    //   2529: istore #5
    //   2531: aload_1
    //   2532: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   2535: invokevirtual length : ()I
    //   2538: istore #7
    //   2540: new java/lang/StringBuilder
    //   2543: astore_3
    //   2544: aload_3
    //   2545: iload #5
    //   2547: bipush #22
    //   2549: iadd
    //   2550: iload #7
    //   2552: iadd
    //   2553: invokespecial <init> : (I)V
    //   2556: aload_3
    //   2557: ldc_w 'Preloaded '
    //   2560: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2563: pop
    //   2564: aload_3
    //   2565: aload #22
    //   2567: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2570: pop
    //   2571: aload_3
    //   2572: ldc_w ' bytes from '
    //   2575: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2578: pop
    //   2579: aload_3
    //   2580: aload_1
    //   2581: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2584: pop
    //   2585: aload_3
    //   2586: invokevirtual toString : ()Ljava/lang/String;
    //   2589: invokestatic e : (Ljava/lang/String;)V
    //   2592: goto -> 2625
    //   2595: astore #22
    //   2597: goto -> 2602
    //   2600: astore #22
    //   2602: aload #14
    //   2604: astore #12
    //   2606: aload #22
    //   2608: astore #14
    //   2610: aload #13
    //   2612: astore #22
    //   2614: aload #14
    //   2616: astore #13
    //   2618: aload #22
    //   2620: astore #14
    //   2622: goto -> 2784
    //   2625: aload #20
    //   2627: iconst_1
    //   2628: iconst_0
    //   2629: invokevirtual setReadable : (ZZ)Z
    //   2632: pop
    //   2633: aload #21
    //   2635: invokevirtual isFile : ()Z
    //   2638: istore #9
    //   2640: iload #9
    //   2642: ifeq -> 2657
    //   2645: aload #21
    //   2647: invokestatic currentTimeMillis : ()J
    //   2650: invokevirtual setLastModified : (J)Z
    //   2653: pop
    //   2654: goto -> 2663
    //   2657: aload #21
    //   2659: invokevirtual createNewFile : ()Z
    //   2662: pop
    //   2663: aload_0
    //   2664: aload_1
    //   2665: aload #20
    //   2667: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   2670: iload #8
    //   2672: invokevirtual j : (Ljava/lang/String;Ljava/lang/String;I)V
    //   2675: getstatic com/google/android/gms/internal/ads/fq.e : Ljava/util/Set;
    //   2678: astore #22
    //   2680: aload #22
    //   2682: aload #12
    //   2684: invokeinterface remove : (Ljava/lang/Object;)Z
    //   2689: pop
    //   2690: iconst_1
    //   2691: ireturn
    //   2692: astore #12
    //   2694: goto -> 2709
    //   2697: astore #12
    //   2699: goto -> 2709
    //   2702: astore #12
    //   2704: goto -> 2709
    //   2707: astore #12
    //   2709: aload #13
    //   2711: astore #22
    //   2713: aload #12
    //   2715: astore #13
    //   2717: aload #14
    //   2719: astore #12
    //   2721: aload #22
    //   2723: astore #14
    //   2725: goto -> 2784
    //   2728: astore #13
    //   2730: aload #23
    //   2732: astore #25
    //   2734: goto -> 2746
    //   2737: astore #13
    //   2739: aload #30
    //   2741: astore #22
    //   2743: aload #24
    //   2745: astore_3
    //   2746: aload_3
    //   2747: astore_2
    //   2748: aload #22
    //   2750: astore #12
    //   2752: aload #25
    //   2754: astore #22
    //   2756: goto -> 2780
    //   2759: astore #14
    //   2761: goto -> 2766
    //   2764: astore #14
    //   2766: aload #12
    //   2768: astore #22
    //   2770: aload_2
    //   2771: astore #12
    //   2773: aload #13
    //   2775: astore_2
    //   2776: aload #14
    //   2778: astore #13
    //   2780: aload #22
    //   2782: astore #14
    //   2784: aload #14
    //   2786: astore #22
    //   2788: aconst_null
    //   2789: astore #14
    //   2791: goto -> 2851
    //   2794: new java/io/IOException
    //   2797: astore_2
    //   2798: aload_2
    //   2799: ldc_w 'Invalid protocol.'
    //   2802: invokespecial <init> : (Ljava/lang/String;)V
    //   2805: aload_2
    //   2806: athrow
    //   2807: new java/io/IOException
    //   2810: astore_2
    //   2811: aload_2
    //   2812: ldc_w 'Too many redirects (20)'
    //   2815: invokespecial <init> : (Ljava/lang/String;)V
    //   2818: aload_2
    //   2819: athrow
    //   2820: astore_3
    //   2821: goto -> 2825
    //   2824: astore_3
    //   2825: ldc 'error'
    //   2827: astore_2
    //   2828: goto -> 2836
    //   2831: astore_3
    //   2832: goto -> 2836
    //   2835: astore_3
    //   2836: aconst_null
    //   2837: astore #14
    //   2839: aconst_null
    //   2840: astore #22
    //   2842: aload_2
    //   2843: astore #12
    //   2845: aload #13
    //   2847: astore_2
    //   2848: aload_3
    //   2849: astore #13
    //   2851: aload #13
    //   2853: instanceof java/lang/RuntimeException
    //   2856: ifeq -> 2870
    //   2859: invokestatic g : ()Lcom/google/android/gms/internal/ads/fl;
    //   2862: aload #13
    //   2864: ldc_w 'VideoStreamFullFileCache.preload'
    //   2867: invokevirtual e : (Ljava/lang/Throwable;Ljava/lang/String;)V
    //   2870: aload #22
    //   2872: invokevirtual close : ()V
    //   2875: goto -> 2880
    //   2878: astore #22
    //   2880: aload_0
    //   2881: getfield h : Z
    //   2884: ifeq -> 2942
    //   2887: new java/lang/StringBuilder
    //   2890: dup
    //   2891: aload_1
    //   2892: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   2895: invokevirtual length : ()I
    //   2898: bipush #26
    //   2900: iadd
    //   2901: invokespecial <init> : (I)V
    //   2904: astore #13
    //   2906: aload #13
    //   2908: ldc_w 'Preload aborted for URL "'
    //   2911: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2914: pop
    //   2915: aload #13
    //   2917: aload_1
    //   2918: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2921: pop
    //   2922: aload #13
    //   2924: ldc_w '"'
    //   2927: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2930: pop
    //   2931: aload #13
    //   2933: invokevirtual toString : ()Ljava/lang/String;
    //   2936: invokestatic h : (Ljava/lang/String;)V
    //   2939: goto -> 2996
    //   2942: new java/lang/StringBuilder
    //   2945: dup
    //   2946: aload_1
    //   2947: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   2950: invokevirtual length : ()I
    //   2953: bipush #25
    //   2955: iadd
    //   2956: invokespecial <init> : (I)V
    //   2959: astore #22
    //   2961: aload #22
    //   2963: ldc_w 'Preload failed for URL "'
    //   2966: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2969: pop
    //   2970: aload #22
    //   2972: aload_1
    //   2973: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2976: pop
    //   2977: aload #22
    //   2979: ldc_w '"'
    //   2982: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2985: pop
    //   2986: aload #22
    //   2988: invokevirtual toString : ()Ljava/lang/String;
    //   2991: aload #13
    //   2993: invokestatic d : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2996: aload #20
    //   2998: invokevirtual exists : ()Z
    //   3001: ifeq -> 3060
    //   3004: aload #20
    //   3006: invokevirtual delete : ()Z
    //   3009: ifne -> 3060
    //   3012: aload #20
    //   3014: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   3017: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   3020: astore #13
    //   3022: aload #13
    //   3024: invokevirtual length : ()I
    //   3027: ifeq -> 3043
    //   3030: ldc_w 'Could not delete partial cache file at '
    //   3033: aload #13
    //   3035: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   3038: astore #13
    //   3040: goto -> 3055
    //   3043: new java/lang/String
    //   3046: dup
    //   3047: ldc_w 'Could not delete partial cache file at '
    //   3050: invokespecial <init> : (Ljava/lang/String;)V
    //   3053: astore #13
    //   3055: aload #13
    //   3057: invokestatic i : (Ljava/lang/String;)V
    //   3060: aload_0
    //   3061: aload_1
    //   3062: aload #20
    //   3064: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   3067: aload #12
    //   3069: aload #14
    //   3071: invokevirtual n : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   3074: getstatic com/google/android/gms/internal/ads/fq.e : Ljava/util/Set;
    //   3077: aload_2
    //   3078: invokeinterface remove : (Ljava/lang/Object;)Z
    //   3083: pop
    //   3084: iconst_0
    //   3085: ireturn
    //   3086: astore_1
    //   3087: aload #14
    //   3089: monitorexit
    //   3090: goto -> 3095
    //   3093: aload_1
    //   3094: athrow
    //   3095: goto -> 3093
    //   3098: astore #22
    //   3100: goto -> 2663
    // Exception table:
    //   from	to	target	type
    //   452	483	3086	finally
    //   486	496	3086	finally
    //   496	516	3086	finally
    //   518	531	3086	finally
    //   534	570	2835	java/io/IOException
    //   534	570	2831	java/lang/RuntimeException
    //   583	666	2835	java/io/IOException
    //   583	666	2831	java/lang/RuntimeException
    //   678	687	1006	java/io/IOException
    //   678	687	1002	java/lang/RuntimeException
    //   698	703	1006	java/io/IOException
    //   698	703	1002	java/lang/RuntimeException
    //   709	718	1006	java/io/IOException
    //   709	718	1002	java/lang/RuntimeException
    //   724	731	1006	java/io/IOException
    //   724	731	1002	java/lang/RuntimeException
    //   742	753	1006	java/io/IOException
    //   742	753	1002	java/lang/RuntimeException
    //   759	770	1006	java/io/IOException
    //   759	770	1002	java/lang/RuntimeException
    //   776	781	1006	java/io/IOException
    //   776	781	1002	java/lang/RuntimeException
    //   787	795	1006	java/io/IOException
    //   787	795	1002	java/lang/RuntimeException
    //   801	811	1006	java/io/IOException
    //   801	811	1002	java/lang/RuntimeException
    //   820	832	1006	java/io/IOException
    //   820	832	1002	java/lang/RuntimeException
    //   838	845	1006	java/io/IOException
    //   838	845	1002	java/lang/RuntimeException
    //   851	854	1006	java/io/IOException
    //   851	854	1002	java/lang/RuntimeException
    //   860	868	1006	java/io/IOException
    //   860	868	1002	java/lang/RuntimeException
    //   874	884	1006	java/io/IOException
    //   874	884	1002	java/lang/RuntimeException
    //   893	905	1006	java/io/IOException
    //   893	905	1002	java/lang/RuntimeException
    //   911	916	1006	java/io/IOException
    //   911	916	1002	java/lang/RuntimeException
    //   922	927	1006	java/io/IOException
    //   922	927	1002	java/lang/RuntimeException
    //   940	945	1006	java/io/IOException
    //   940	945	1002	java/lang/RuntimeException
    //   951	959	1006	java/io/IOException
    //   951	959	1002	java/lang/RuntimeException
    //   965	968	1006	java/io/IOException
    //   965	968	1002	java/lang/RuntimeException
    //   974	979	1006	java/io/IOException
    //   974	979	1002	java/lang/RuntimeException
    //   985	993	1006	java/io/IOException
    //   985	993	1002	java/lang/RuntimeException
    //   999	1002	1006	java/io/IOException
    //   999	1002	1002	java/lang/RuntimeException
    //   1038	1045	2835	java/io/IOException
    //   1038	1045	2831	java/lang/RuntimeException
    //   1066	1075	1006	java/io/IOException
    //   1066	1075	1002	java/lang/RuntimeException
    //   1083	1090	1006	java/io/IOException
    //   1083	1090	1002	java/lang/RuntimeException
    //   1098	1106	1006	java/io/IOException
    //   1098	1106	1002	java/lang/RuntimeException
    //   1120	1131	1006	java/io/IOException
    //   1120	1131	1002	java/lang/RuntimeException
    //   1134	1206	1214	java/io/IOException
    //   1134	1206	1206	java/lang/RuntimeException
    //   1222	1229	2835	java/io/IOException
    //   1222	1229	2831	java/lang/RuntimeException
    //   1240	1246	1006	java/io/IOException
    //   1240	1246	1002	java/lang/RuntimeException
    //   1252	1260	1006	java/io/IOException
    //   1252	1260	1002	java/lang/RuntimeException
    //   1266	1276	1006	java/io/IOException
    //   1266	1276	1002	java/lang/RuntimeException
    //   1285	1297	1006	java/io/IOException
    //   1285	1297	1002	java/lang/RuntimeException
    //   1303	1308	1006	java/io/IOException
    //   1303	1308	1002	java/lang/RuntimeException
    //   1314	1328	1006	java/io/IOException
    //   1314	1328	1002	java/lang/RuntimeException
    //   1334	1345	1006	java/io/IOException
    //   1334	1345	1002	java/lang/RuntimeException
    //   1347	1379	2835	java/io/IOException
    //   1347	1379	2831	java/lang/RuntimeException
    //   1392	1402	1006	java/io/IOException
    //   1392	1402	1002	java/lang/RuntimeException
    //   1408	1417	1006	java/io/IOException
    //   1408	1417	1002	java/lang/RuntimeException
    //   1423	1428	1006	java/io/IOException
    //   1423	1428	1002	java/lang/RuntimeException
    //   1434	1447	1006	java/io/IOException
    //   1434	1447	1002	java/lang/RuntimeException
    //   1453	1462	1006	java/io/IOException
    //   1453	1462	1002	java/lang/RuntimeException
    //   1468	1476	1006	java/io/IOException
    //   1468	1476	1002	java/lang/RuntimeException
    //   1482	1491	1006	java/io/IOException
    //   1482	1491	1002	java/lang/RuntimeException
    //   1497	1504	1006	java/io/IOException
    //   1497	1504	1002	java/lang/RuntimeException
    //   1510	1518	1006	java/io/IOException
    //   1510	1518	1002	java/lang/RuntimeException
    //   1524	1531	1006	java/io/IOException
    //   1524	1531	1002	java/lang/RuntimeException
    //   1537	1545	1006	java/io/IOException
    //   1537	1545	1002	java/lang/RuntimeException
    //   1551	1561	1006	java/io/IOException
    //   1551	1561	1002	java/lang/RuntimeException
    //   1570	1582	1006	java/io/IOException
    //   1570	1582	1002	java/lang/RuntimeException
    //   1588	1603	1006	java/io/IOException
    //   1588	1603	1002	java/lang/RuntimeException
    //   1609	1620	1006	java/io/IOException
    //   1609	1620	1002	java/lang/RuntimeException
    //   1622	1722	2835	java/io/IOException
    //   1622	1722	2831	java/lang/RuntimeException
    //   1722	1769	2764	java/io/IOException
    //   1722	1769	2759	java/lang/RuntimeException
    //   1790	1797	2737	java/io/IOException
    //   1790	1797	2728	java/lang/RuntimeException
    //   1818	1823	2737	java/io/IOException
    //   1818	1823	2728	java/lang/RuntimeException
    //   1844	1851	2737	java/io/IOException
    //   1844	1851	2728	java/lang/RuntimeException
    //   1872	1877	2737	java/io/IOException
    //   1872	1877	2728	java/lang/RuntimeException
    //   1898	1914	2737	java/io/IOException
    //   1898	1914	2728	java/lang/RuntimeException
    //   1953	1964	2737	java/io/IOException
    //   1953	1964	2728	java/lang/RuntimeException
    //   1996	2005	2100	java/io/IOException
    //   1996	2005	2096	java/lang/RuntimeException
    //   2013	2020	2100	java/io/IOException
    //   2013	2020	2096	java/lang/RuntimeException
    //   2028	2036	2100	java/io/IOException
    //   2028	2036	2096	java/lang/RuntimeException
    //   2050	2061	2100	java/io/IOException
    //   2050	2061	2096	java/lang/RuntimeException
    //   2064	2080	2084	java/io/IOException
    //   2064	2080	2080	java/lang/RuntimeException
    //   2126	2132	2470	java/io/IOException
    //   2126	2132	2465	java/lang/RuntimeException
    //   2132	2194	2470	java/io/IOException
    //   2132	2194	2465	java/lang/RuntimeException
    //   2194	2199	2228	java/io/IOException
    //   2194	2199	2223	java/lang/RuntimeException
    //   2199	2220	2600	java/io/IOException
    //   2199	2220	2595	java/lang/RuntimeException
    //   2248	2253	2457	java/io/IOException
    //   2248	2253	2448	java/lang/RuntimeException
    //   2260	2268	2457	java/io/IOException
    //   2260	2268	2448	java/lang/RuntimeException
    //   2275	2278	2457	java/io/IOException
    //   2275	2278	2448	java/lang/RuntimeException
    //   2290	2297	2457	java/io/IOException
    //   2290	2297	2448	java/lang/RuntimeException
    //   2304	2314	2457	java/io/IOException
    //   2304	2314	2448	java/lang/RuntimeException
    //   2321	2326	2457	java/io/IOException
    //   2321	2326	2448	java/lang/RuntimeException
    //   2333	2343	2457	java/io/IOException
    //   2333	2343	2448	java/lang/RuntimeException
    //   2350	2359	2457	java/io/IOException
    //   2350	2359	2448	java/lang/RuntimeException
    //   2366	2374	2457	java/io/IOException
    //   2366	2374	2448	java/lang/RuntimeException
    //   2381	2390	2457	java/io/IOException
    //   2381	2390	2448	java/lang/RuntimeException
    //   2397	2404	2457	java/io/IOException
    //   2397	2404	2448	java/lang/RuntimeException
    //   2404	2420	2425	java/io/IOException
    //   2404	2420	2420	java/lang/RuntimeException
    //   2494	2505	2707	java/io/IOException
    //   2494	2505	2702	java/lang/RuntimeException
    //   2510	2592	2600	java/io/IOException
    //   2510	2592	2595	java/lang/RuntimeException
    //   2625	2640	2707	java/io/IOException
    //   2625	2640	2702	java/lang/RuntimeException
    //   2645	2654	2600	java/io/IOException
    //   2645	2654	2595	java/lang/RuntimeException
    //   2657	2663	3098	java/io/IOException
    //   2657	2663	2595	java/lang/RuntimeException
    //   2663	2680	2707	java/io/IOException
    //   2663	2680	2702	java/lang/RuntimeException
    //   2680	2690	2697	java/io/IOException
    //   2680	2690	2692	java/lang/RuntimeException
    //   2794	2807	2824	java/io/IOException
    //   2794	2807	2820	java/lang/RuntimeException
    //   2807	2820	2824	java/io/IOException
    //   2807	2820	2820	java/lang/RuntimeException
    //   2870	2875	2878	java/io/IOException
    //   2870	2875	2878	java/lang/NullPointerException
    //   3087	3090	3086	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */