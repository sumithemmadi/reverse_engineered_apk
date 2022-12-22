package com.google.android.gms.internal.ads;

import android.util.Log;

final class yf2 {
  private static final int A;
  
  private static final int B;
  
  private static final int C;
  
  private static final String[] D;
  
  private static final int a = wj2.k("nam");
  
  private static final int b = wj2.k("trk");
  
  private static final int c = wj2.k("cmt");
  
  private static final int d = wj2.k("day");
  
  private static final int e = wj2.k("ART");
  
  private static final int f = wj2.k("too");
  
  private static final int g = wj2.k("alb");
  
  private static final int h = wj2.k("com");
  
  private static final int i = wj2.k("wrt");
  
  private static final int j = wj2.k("lyr");
  
  private static final int k = wj2.k("gen");
  
  private static final int l = wj2.k("covr");
  
  private static final int m = wj2.k("gnre");
  
  private static final int n = wj2.k("grp");
  
  private static final int o = wj2.k("disk");
  
  private static final int p = wj2.k("trkn");
  
  private static final int q = wj2.k("tmpo");
  
  private static final int r = wj2.k("cpil");
  
  private static final int s = wj2.k("aART");
  
  private static final int t = wj2.k("sonm");
  
  private static final int u = wj2.k("soal");
  
  private static final int v = wj2.k("soar");
  
  private static final int w = wj2.k("soaa");
  
  private static final int x = wj2.k("soco");
  
  private static final int y = wj2.k("rtng");
  
  private static final int z = wj2.k("pgap");
  
  static {
    A = wj2.k("sosn");
    B = wj2.k("tvsh");
    C = wj2.k("----");
    D = new String[] { 
        "Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", 
        "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", 
        "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", 
        "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", 
        "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", 
        "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", 
        "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", 
        "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", 
        "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", 
        "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", 
        "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", 
        "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", 
        "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", 
        "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", 
        "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop" };
  }
  
  private static zzmn a(int paramInt, String paramString, qj2 paramqj2) {
    int i = paramqj2.d();
    if (paramqj2.d() == jf2.F0) {
      paramqj2.m(8);
      return new zzmn(paramString, null, paramqj2.n(i - 16));
    } 
    paramString = String.valueOf(jf2.c(paramInt));
    if (paramString.length() != 0) {
      paramString = "Failed to parse text attribute: ".concat(paramString);
    } else {
      paramString = new String("Failed to parse text attribute: ");
    } 
    Log.w("MetadataUtil", paramString);
    return null;
  }
  
  private static zzmo b(int paramInt, String paramString, qj2 paramqj2, boolean paramBoolean1, boolean paramBoolean2) {
    int i = e(paramqj2);
    int j = i;
    if (paramBoolean2)
      j = Math.min(1, i); 
    if (j >= 0)
      return (zzmo)(paramBoolean1 ? new zzmn(paramString, null, Integer.toString(j)) : new zzmj("und", paramString, Integer.toString(j))); 
    paramString = String.valueOf(jf2.c(paramInt));
    if (paramString.length() != 0) {
      paramString = "Failed to parse uint8 attribute: ".concat(paramString);
    } else {
      paramString = new String("Failed to parse uint8 attribute: ");
    } 
    Log.w("MetadataUtil", paramString);
    return null;
  }
  
  private static zzmn c(int paramInt, String paramString, qj2 paramqj2) {
    int i = paramqj2.d();
    if (paramqj2.d() == jf2.F0 && i >= 22) {
      paramqj2.m(10);
      i = paramqj2.h();
      if (i > 0) {
        StringBuilder stringBuilder = new StringBuilder(11);
        stringBuilder.append(i);
        String str2 = stringBuilder.toString();
        paramInt = paramqj2.h();
        String str1 = str2;
        if (paramInt > 0) {
          str2 = String.valueOf(str2);
          StringBuilder stringBuilder1 = new StringBuilder(str2.length() + 12);
          stringBuilder1.append(str2);
          stringBuilder1.append("/");
          stringBuilder1.append(paramInt);
          str1 = stringBuilder1.toString();
        } 
        return new zzmn(paramString, null, str1);
      } 
    } 
    paramString = String.valueOf(jf2.c(paramInt));
    if (paramString.length() != 0) {
      paramString = "Failed to parse index/count attribute: ".concat(paramString);
    } else {
      paramString = new String("Failed to parse index/count attribute: ");
    } 
    Log.w("MetadataUtil", paramString);
    return null;
  }
  
  public static zzmh.zza d(qj2 paramqj2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual b : ()I
    //   4: aload_0
    //   5: invokevirtual d : ()I
    //   8: iadd
    //   9: istore_1
    //   10: aload_0
    //   11: invokevirtual d : ()I
    //   14: istore_2
    //   15: iload_2
    //   16: bipush #24
    //   18: iushr
    //   19: istore_3
    //   20: aconst_null
    //   21: astore #4
    //   23: aconst_null
    //   24: astore #5
    //   26: aconst_null
    //   27: astore #6
    //   29: aconst_null
    //   30: astore #7
    //   32: iload_3
    //   33: sipush #169
    //   36: if_icmpeq -> 872
    //   39: iload_3
    //   40: ldc_w 65533
    //   43: if_icmpne -> 49
    //   46: goto -> 872
    //   49: iload_2
    //   50: getstatic com/google/android/gms/internal/ads/yf2.m : I
    //   53: if_icmpne -> 136
    //   56: aload_0
    //   57: invokestatic e : (Lcom/google/android/gms/internal/ads/qj2;)I
    //   60: istore_2
    //   61: iload_2
    //   62: ifle -> 88
    //   65: getstatic com/google/android/gms/internal/ads/yf2.D : [Ljava/lang/String;
    //   68: astore #8
    //   70: iload_2
    //   71: aload #8
    //   73: arraylength
    //   74: if_icmpgt -> 88
    //   77: aload #8
    //   79: iload_2
    //   80: iconst_1
    //   81: isub
    //   82: aaload
    //   83: astore #8
    //   85: goto -> 91
    //   88: aconst_null
    //   89: astore #8
    //   91: aload #8
    //   93: ifnull -> 114
    //   96: new com/google/android/gms/internal/ads/zzmn
    //   99: dup
    //   100: ldc_w 'TCON'
    //   103: aconst_null
    //   104: aload #8
    //   106: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   109: astore #8
    //   111: goto -> 128
    //   114: ldc_w 'MetadataUtil'
    //   117: ldc_w 'Failed to parse standard genre code'
    //   120: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   123: pop
    //   124: aload #7
    //   126: astore #8
    //   128: aload_0
    //   129: iload_1
    //   130: invokevirtual l : (I)V
    //   133: aload #8
    //   135: areturn
    //   136: iload_2
    //   137: getstatic com/google/android/gms/internal/ads/yf2.o : I
    //   140: if_icmpne -> 161
    //   143: iload_2
    //   144: ldc_w 'TPOS'
    //   147: aload_0
    //   148: invokestatic c : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   151: astore #8
    //   153: aload_0
    //   154: iload_1
    //   155: invokevirtual l : (I)V
    //   158: aload #8
    //   160: areturn
    //   161: iload_2
    //   162: getstatic com/google/android/gms/internal/ads/yf2.p : I
    //   165: if_icmpne -> 186
    //   168: iload_2
    //   169: ldc_w 'TRCK'
    //   172: aload_0
    //   173: invokestatic c : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   176: astore #8
    //   178: aload_0
    //   179: iload_1
    //   180: invokevirtual l : (I)V
    //   183: aload #8
    //   185: areturn
    //   186: iload_2
    //   187: getstatic com/google/android/gms/internal/ads/yf2.q : I
    //   190: if_icmpne -> 213
    //   193: iload_2
    //   194: ldc_w 'TBPM'
    //   197: aload_0
    //   198: iconst_1
    //   199: iconst_0
    //   200: invokestatic b : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;ZZ)Lcom/google/android/gms/internal/ads/zzmo;
    //   203: astore #8
    //   205: aload_0
    //   206: iload_1
    //   207: invokevirtual l : (I)V
    //   210: aload #8
    //   212: areturn
    //   213: iload_2
    //   214: getstatic com/google/android/gms/internal/ads/yf2.r : I
    //   217: if_icmpne -> 240
    //   220: iload_2
    //   221: ldc_w 'TCMP'
    //   224: aload_0
    //   225: iconst_1
    //   226: iconst_1
    //   227: invokestatic b : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;ZZ)Lcom/google/android/gms/internal/ads/zzmo;
    //   230: astore #8
    //   232: aload_0
    //   233: iload_1
    //   234: invokevirtual l : (I)V
    //   237: aload #8
    //   239: areturn
    //   240: iload_2
    //   241: getstatic com/google/android/gms/internal/ads/yf2.l : I
    //   244: if_icmpne -> 416
    //   247: aload_0
    //   248: invokevirtual d : ()I
    //   251: istore_3
    //   252: aload_0
    //   253: invokevirtual d : ()I
    //   256: getstatic com/google/android/gms/internal/ads/jf2.F0 : I
    //   259: if_icmpne -> 394
    //   262: aload_0
    //   263: invokevirtual d : ()I
    //   266: invokestatic b : (I)I
    //   269: istore_2
    //   270: iload_2
    //   271: bipush #13
    //   273: if_icmpne -> 284
    //   276: ldc_w 'image/jpeg'
    //   279: astore #8
    //   281: goto -> 301
    //   284: iload_2
    //   285: bipush #14
    //   287: if_icmpne -> 298
    //   290: ldc_w 'image/png'
    //   293: astore #8
    //   295: goto -> 301
    //   298: aconst_null
    //   299: astore #8
    //   301: aload #8
    //   303: ifnonnull -> 353
    //   306: new java/lang/StringBuilder
    //   309: astore #8
    //   311: aload #8
    //   313: bipush #41
    //   315: invokespecial <init> : (I)V
    //   318: aload #8
    //   320: ldc_w 'Unrecognized cover art flags: '
    //   323: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: pop
    //   327: aload #8
    //   329: iload_2
    //   330: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   333: pop
    //   334: ldc_w 'MetadataUtil'
    //   337: aload #8
    //   339: invokevirtual toString : ()Ljava/lang/String;
    //   342: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   345: pop
    //   346: aload #4
    //   348: astore #8
    //   350: goto -> 408
    //   353: aload_0
    //   354: iconst_4
    //   355: invokevirtual m : (I)V
    //   358: iload_3
    //   359: bipush #16
    //   361: isub
    //   362: istore_2
    //   363: iload_2
    //   364: newarray byte
    //   366: astore #4
    //   368: aload_0
    //   369: aload #4
    //   371: iconst_0
    //   372: iload_2
    //   373: invokevirtual p : ([BII)V
    //   376: new com/google/android/gms/internal/ads/zzmi
    //   379: dup
    //   380: aload #8
    //   382: aconst_null
    //   383: iconst_3
    //   384: aload #4
    //   386: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;I[B)V
    //   389: astore #8
    //   391: goto -> 408
    //   394: ldc_w 'MetadataUtil'
    //   397: ldc_w 'Failed to parse cover art attribute'
    //   400: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   403: pop
    //   404: aload #4
    //   406: astore #8
    //   408: aload_0
    //   409: iload_1
    //   410: invokevirtual l : (I)V
    //   413: aload #8
    //   415: areturn
    //   416: iload_2
    //   417: getstatic com/google/android/gms/internal/ads/yf2.s : I
    //   420: if_icmpne -> 441
    //   423: iload_2
    //   424: ldc_w 'TPE2'
    //   427: aload_0
    //   428: invokestatic a : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   431: astore #8
    //   433: aload_0
    //   434: iload_1
    //   435: invokevirtual l : (I)V
    //   438: aload #8
    //   440: areturn
    //   441: iload_2
    //   442: getstatic com/google/android/gms/internal/ads/yf2.t : I
    //   445: if_icmpne -> 466
    //   448: iload_2
    //   449: ldc_w 'TSOT'
    //   452: aload_0
    //   453: invokestatic a : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   456: astore #8
    //   458: aload_0
    //   459: iload_1
    //   460: invokevirtual l : (I)V
    //   463: aload #8
    //   465: areturn
    //   466: iload_2
    //   467: getstatic com/google/android/gms/internal/ads/yf2.u : I
    //   470: if_icmpne -> 491
    //   473: iload_2
    //   474: ldc_w 'TSO2'
    //   477: aload_0
    //   478: invokestatic a : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   481: astore #8
    //   483: aload_0
    //   484: iload_1
    //   485: invokevirtual l : (I)V
    //   488: aload #8
    //   490: areturn
    //   491: iload_2
    //   492: getstatic com/google/android/gms/internal/ads/yf2.v : I
    //   495: if_icmpne -> 516
    //   498: iload_2
    //   499: ldc_w 'TSOA'
    //   502: aload_0
    //   503: invokestatic a : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   506: astore #8
    //   508: aload_0
    //   509: iload_1
    //   510: invokevirtual l : (I)V
    //   513: aload #8
    //   515: areturn
    //   516: iload_2
    //   517: getstatic com/google/android/gms/internal/ads/yf2.w : I
    //   520: if_icmpne -> 541
    //   523: iload_2
    //   524: ldc_w 'TSOP'
    //   527: aload_0
    //   528: invokestatic a : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   531: astore #8
    //   533: aload_0
    //   534: iload_1
    //   535: invokevirtual l : (I)V
    //   538: aload #8
    //   540: areturn
    //   541: iload_2
    //   542: getstatic com/google/android/gms/internal/ads/yf2.x : I
    //   545: if_icmpne -> 566
    //   548: iload_2
    //   549: ldc_w 'TSOC'
    //   552: aload_0
    //   553: invokestatic a : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   556: astore #8
    //   558: aload_0
    //   559: iload_1
    //   560: invokevirtual l : (I)V
    //   563: aload #8
    //   565: areturn
    //   566: iload_2
    //   567: getstatic com/google/android/gms/internal/ads/yf2.y : I
    //   570: if_icmpne -> 593
    //   573: iload_2
    //   574: ldc_w 'ITUNESADVISORY'
    //   577: aload_0
    //   578: iconst_0
    //   579: iconst_0
    //   580: invokestatic b : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;ZZ)Lcom/google/android/gms/internal/ads/zzmo;
    //   583: astore #8
    //   585: aload_0
    //   586: iload_1
    //   587: invokevirtual l : (I)V
    //   590: aload #8
    //   592: areturn
    //   593: iload_2
    //   594: getstatic com/google/android/gms/internal/ads/yf2.z : I
    //   597: if_icmpne -> 620
    //   600: iload_2
    //   601: ldc_w 'ITUNESGAPLESS'
    //   604: aload_0
    //   605: iconst_0
    //   606: iconst_1
    //   607: invokestatic b : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;ZZ)Lcom/google/android/gms/internal/ads/zzmo;
    //   610: astore #8
    //   612: aload_0
    //   613: iload_1
    //   614: invokevirtual l : (I)V
    //   617: aload #8
    //   619: areturn
    //   620: iload_2
    //   621: getstatic com/google/android/gms/internal/ads/yf2.A : I
    //   624: if_icmpne -> 645
    //   627: iload_2
    //   628: ldc_w 'TVSHOWSORT'
    //   631: aload_0
    //   632: invokestatic a : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   635: astore #8
    //   637: aload_0
    //   638: iload_1
    //   639: invokevirtual l : (I)V
    //   642: aload #8
    //   644: areturn
    //   645: iload_2
    //   646: getstatic com/google/android/gms/internal/ads/yf2.B : I
    //   649: if_icmpne -> 670
    //   652: iload_2
    //   653: ldc_w 'TVSHOW'
    //   656: aload_0
    //   657: invokestatic a : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   660: astore #8
    //   662: aload_0
    //   663: iload_1
    //   664: invokevirtual l : (I)V
    //   667: aload #8
    //   669: areturn
    //   670: iload_2
    //   671: getstatic com/google/android/gms/internal/ads/yf2.C : I
    //   674: if_icmpne -> 1207
    //   677: aconst_null
    //   678: astore #4
    //   680: aload #4
    //   682: astore #8
    //   684: iconst_m1
    //   685: istore_3
    //   686: iconst_m1
    //   687: istore_2
    //   688: aload_0
    //   689: invokevirtual b : ()I
    //   692: iload_1
    //   693: if_icmpge -> 789
    //   696: aload_0
    //   697: invokevirtual b : ()I
    //   700: istore #9
    //   702: aload_0
    //   703: invokevirtual d : ()I
    //   706: istore #10
    //   708: aload_0
    //   709: invokevirtual d : ()I
    //   712: istore #11
    //   714: aload_0
    //   715: iconst_4
    //   716: invokevirtual m : (I)V
    //   719: iload #11
    //   721: getstatic com/google/android/gms/internal/ads/jf2.D0 : I
    //   724: if_icmpne -> 741
    //   727: aload_0
    //   728: iload #10
    //   730: bipush #12
    //   732: isub
    //   733: invokevirtual n : (I)Ljava/lang/String;
    //   736: astore #4
    //   738: goto -> 688
    //   741: iload #11
    //   743: getstatic com/google/android/gms/internal/ads/jf2.E0 : I
    //   746: if_icmpne -> 763
    //   749: aload_0
    //   750: iload #10
    //   752: bipush #12
    //   754: isub
    //   755: invokevirtual n : (I)Ljava/lang/String;
    //   758: astore #8
    //   760: goto -> 688
    //   763: iload #11
    //   765: getstatic com/google/android/gms/internal/ads/jf2.F0 : I
    //   768: if_icmpne -> 777
    //   771: iload #9
    //   773: istore_3
    //   774: iload #10
    //   776: istore_2
    //   777: aload_0
    //   778: iload #10
    //   780: bipush #12
    //   782: isub
    //   783: invokevirtual m : (I)V
    //   786: goto -> 688
    //   789: aload #5
    //   791: astore #7
    //   793: ldc_w 'com.apple.iTunes'
    //   796: aload #4
    //   798: invokevirtual equals : (Ljava/lang/Object;)Z
    //   801: ifeq -> 864
    //   804: aload #5
    //   806: astore #7
    //   808: ldc_w 'iTunSMPB'
    //   811: aload #8
    //   813: invokevirtual equals : (Ljava/lang/Object;)Z
    //   816: ifeq -> 864
    //   819: iload_3
    //   820: iconst_m1
    //   821: if_icmpne -> 831
    //   824: aload #5
    //   826: astore #7
    //   828: goto -> 864
    //   831: aload_0
    //   832: iload_3
    //   833: invokevirtual l : (I)V
    //   836: aload_0
    //   837: bipush #16
    //   839: invokevirtual m : (I)V
    //   842: new com/google/android/gms/internal/ads/zzmj
    //   845: dup
    //   846: ldc_w 'und'
    //   849: aload #8
    //   851: aload_0
    //   852: iload_2
    //   853: bipush #16
    //   855: isub
    //   856: invokevirtual n : (I)Ljava/lang/String;
    //   859: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   862: astore #7
    //   864: aload_0
    //   865: iload_1
    //   866: invokevirtual l : (I)V
    //   869: aload #7
    //   871: areturn
    //   872: ldc_w 16777215
    //   875: iload_2
    //   876: iand
    //   877: istore_3
    //   878: iload_3
    //   879: getstatic com/google/android/gms/internal/ads/yf2.c : I
    //   882: if_icmpne -> 998
    //   885: aload_0
    //   886: invokevirtual d : ()I
    //   889: istore_3
    //   890: aload_0
    //   891: invokevirtual d : ()I
    //   894: getstatic com/google/android/gms/internal/ads/jf2.F0 : I
    //   897: if_icmpne -> 935
    //   900: aload_0
    //   901: bipush #8
    //   903: invokevirtual m : (I)V
    //   906: aload_0
    //   907: iload_3
    //   908: bipush #16
    //   910: isub
    //   911: invokevirtual n : (I)Ljava/lang/String;
    //   914: astore #8
    //   916: new com/google/android/gms/internal/ads/zzmj
    //   919: dup
    //   920: ldc_w 'und'
    //   923: aload #8
    //   925: aload #8
    //   927: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   930: astore #8
    //   932: goto -> 990
    //   935: iload_2
    //   936: invokestatic c : (I)Ljava/lang/String;
    //   939: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   942: astore #8
    //   944: aload #8
    //   946: invokevirtual length : ()I
    //   949: ifeq -> 965
    //   952: ldc_w 'Failed to parse comment attribute: '
    //   955: aload #8
    //   957: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   960: astore #8
    //   962: goto -> 977
    //   965: new java/lang/String
    //   968: dup
    //   969: ldc_w 'Failed to parse comment attribute: '
    //   972: invokespecial <init> : (Ljava/lang/String;)V
    //   975: astore #8
    //   977: ldc_w 'MetadataUtil'
    //   980: aload #8
    //   982: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   985: pop
    //   986: aload #6
    //   988: astore #8
    //   990: aload_0
    //   991: iload_1
    //   992: invokevirtual l : (I)V
    //   995: aload #8
    //   997: areturn
    //   998: iload_3
    //   999: getstatic com/google/android/gms/internal/ads/yf2.a : I
    //   1002: if_icmpeq -> 1283
    //   1005: iload_3
    //   1006: getstatic com/google/android/gms/internal/ads/yf2.b : I
    //   1009: if_icmpne -> 1015
    //   1012: goto -> 1283
    //   1015: iload_3
    //   1016: getstatic com/google/android/gms/internal/ads/yf2.h : I
    //   1019: if_icmpeq -> 1265
    //   1022: iload_3
    //   1023: getstatic com/google/android/gms/internal/ads/yf2.i : I
    //   1026: if_icmpne -> 1032
    //   1029: goto -> 1265
    //   1032: iload_3
    //   1033: getstatic com/google/android/gms/internal/ads/yf2.d : I
    //   1036: if_icmpne -> 1057
    //   1039: iload_2
    //   1040: ldc_w 'TDRC'
    //   1043: aload_0
    //   1044: invokestatic a : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   1047: astore #8
    //   1049: aload_0
    //   1050: iload_1
    //   1051: invokevirtual l : (I)V
    //   1054: aload #8
    //   1056: areturn
    //   1057: iload_3
    //   1058: getstatic com/google/android/gms/internal/ads/yf2.e : I
    //   1061: if_icmpne -> 1082
    //   1064: iload_2
    //   1065: ldc_w 'TPE1'
    //   1068: aload_0
    //   1069: invokestatic a : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   1072: astore #8
    //   1074: aload_0
    //   1075: iload_1
    //   1076: invokevirtual l : (I)V
    //   1079: aload #8
    //   1081: areturn
    //   1082: iload_3
    //   1083: getstatic com/google/android/gms/internal/ads/yf2.f : I
    //   1086: if_icmpne -> 1107
    //   1089: iload_2
    //   1090: ldc_w 'TSSE'
    //   1093: aload_0
    //   1094: invokestatic a : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   1097: astore #8
    //   1099: aload_0
    //   1100: iload_1
    //   1101: invokevirtual l : (I)V
    //   1104: aload #8
    //   1106: areturn
    //   1107: iload_3
    //   1108: getstatic com/google/android/gms/internal/ads/yf2.g : I
    //   1111: if_icmpne -> 1132
    //   1114: iload_2
    //   1115: ldc_w 'TALB'
    //   1118: aload_0
    //   1119: invokestatic a : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   1122: astore #8
    //   1124: aload_0
    //   1125: iload_1
    //   1126: invokevirtual l : (I)V
    //   1129: aload #8
    //   1131: areturn
    //   1132: iload_3
    //   1133: getstatic com/google/android/gms/internal/ads/yf2.j : I
    //   1136: if_icmpne -> 1157
    //   1139: iload_2
    //   1140: ldc_w 'USLT'
    //   1143: aload_0
    //   1144: invokestatic a : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   1147: astore #8
    //   1149: aload_0
    //   1150: iload_1
    //   1151: invokevirtual l : (I)V
    //   1154: aload #8
    //   1156: areturn
    //   1157: iload_3
    //   1158: getstatic com/google/android/gms/internal/ads/yf2.k : I
    //   1161: if_icmpne -> 1182
    //   1164: iload_2
    //   1165: ldc_w 'TCON'
    //   1168: aload_0
    //   1169: invokestatic a : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   1172: astore #8
    //   1174: aload_0
    //   1175: iload_1
    //   1176: invokevirtual l : (I)V
    //   1179: aload #8
    //   1181: areturn
    //   1182: iload_3
    //   1183: getstatic com/google/android/gms/internal/ads/yf2.n : I
    //   1186: if_icmpne -> 1207
    //   1189: iload_2
    //   1190: ldc_w 'TIT1'
    //   1193: aload_0
    //   1194: invokestatic a : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   1197: astore #8
    //   1199: aload_0
    //   1200: iload_1
    //   1201: invokevirtual l : (I)V
    //   1204: aload #8
    //   1206: areturn
    //   1207: iload_2
    //   1208: invokestatic c : (I)Ljava/lang/String;
    //   1211: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1214: astore #8
    //   1216: aload #8
    //   1218: invokevirtual length : ()I
    //   1221: ifeq -> 1237
    //   1224: ldc_w 'Skipped unknown metadata entry: '
    //   1227: aload #8
    //   1229: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   1232: astore #8
    //   1234: goto -> 1249
    //   1237: new java/lang/String
    //   1240: dup
    //   1241: ldc_w 'Skipped unknown metadata entry: '
    //   1244: invokespecial <init> : (Ljava/lang/String;)V
    //   1247: astore #8
    //   1249: ldc_w 'MetadataUtil'
    //   1252: aload #8
    //   1254: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1257: pop
    //   1258: aload_0
    //   1259: iload_1
    //   1260: invokevirtual l : (I)V
    //   1263: aconst_null
    //   1264: areturn
    //   1265: iload_2
    //   1266: ldc_w 'TCOM'
    //   1269: aload_0
    //   1270: invokestatic a : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   1273: astore #8
    //   1275: aload_0
    //   1276: iload_1
    //   1277: invokevirtual l : (I)V
    //   1280: aload #8
    //   1282: areturn
    //   1283: iload_2
    //   1284: ldc_w 'TIT2'
    //   1287: aload_0
    //   1288: invokestatic a : (ILjava/lang/String;Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/zzmn;
    //   1291: astore #8
    //   1293: aload_0
    //   1294: iload_1
    //   1295: invokevirtual l : (I)V
    //   1298: aload #8
    //   1300: areturn
    //   1301: astore #8
    //   1303: aload_0
    //   1304: iload_1
    //   1305: invokevirtual l : (I)V
    //   1308: goto -> 1314
    //   1311: aload #8
    //   1313: athrow
    //   1314: goto -> 1311
    // Exception table:
    //   from	to	target	type
    //   49	61	1301	finally
    //   65	77	1301	finally
    //   96	111	1301	finally
    //   114	124	1301	finally
    //   136	153	1301	finally
    //   161	178	1301	finally
    //   186	205	1301	finally
    //   213	232	1301	finally
    //   240	270	1301	finally
    //   306	346	1301	finally
    //   353	358	1301	finally
    //   363	391	1301	finally
    //   394	404	1301	finally
    //   416	433	1301	finally
    //   441	458	1301	finally
    //   466	483	1301	finally
    //   491	508	1301	finally
    //   516	533	1301	finally
    //   541	558	1301	finally
    //   566	585	1301	finally
    //   593	612	1301	finally
    //   620	637	1301	finally
    //   645	662	1301	finally
    //   670	677	1301	finally
    //   688	738	1301	finally
    //   741	760	1301	finally
    //   763	771	1301	finally
    //   777	786	1301	finally
    //   793	804	1301	finally
    //   808	819	1301	finally
    //   831	864	1301	finally
    //   878	932	1301	finally
    //   935	962	1301	finally
    //   965	977	1301	finally
    //   977	986	1301	finally
    //   998	1012	1301	finally
    //   1015	1029	1301	finally
    //   1032	1049	1301	finally
    //   1057	1074	1301	finally
    //   1082	1099	1301	finally
    //   1107	1124	1301	finally
    //   1132	1149	1301	finally
    //   1157	1174	1301	finally
    //   1182	1199	1301	finally
    //   1207	1234	1301	finally
    //   1237	1249	1301	finally
    //   1249	1258	1301	finally
    //   1265	1275	1301	finally
    //   1283	1293	1301	finally
  }
  
  private static int e(qj2 paramqj2) {
    paramqj2.m(4);
    if (paramqj2.d() == jf2.F0) {
      paramqj2.m(8);
      return paramqj2.g();
    } 
    Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
    return -1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yf2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */