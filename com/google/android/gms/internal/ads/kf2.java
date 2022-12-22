package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;

final class kf2 {
  private static final int a = wj2.k("vide");
  
  private static final int b = wj2.k("soun");
  
  private static final int c = wj2.k("text");
  
  private static final int d = wj2.k("sbtl");
  
  private static final int e = wj2.k("subt");
  
  private static final int f = wj2.k("clcp");
  
  private static final int g = wj2.k("cenc");
  
  private static final int h = wj2.k("meta");
  
  private static int a(qj2 paramqj2, int paramInt1, int paramInt2, pf2 parampf2, int paramInt3) {
    int i = paramqj2.b();
    while (true) {
      boolean bool = false;
      if (i - paramInt1 < paramInt2) {
        boolean bool1;
        paramqj2.l(i);
        int j = paramqj2.d();
        if (j > 0) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        jj2.b(bool1, "childAtomSize should be positive");
        if (paramqj2.d() == jf2.V) {
          int k = i + 8;
          Pair pair1 = null;
          byte[] arrayOfByte1 = null;
          byte[] arrayOfByte2 = arrayOfByte1;
          int m = 0;
          while (k - i < j) {
            byte[] arrayOfByte;
            int i2;
            paramqj2.l(k);
            int n = paramqj2.d();
            int i1 = paramqj2.d();
            if (i1 == jf2.b0) {
              Integer integer = Integer.valueOf(paramqj2.d());
              i2 = m;
            } else if (i1 == jf2.W) {
              paramqj2.m(4);
              if (paramqj2.d() == g) {
                i2 = 1;
                arrayOfByte = arrayOfByte1;
              } else {
                i2 = 0;
                arrayOfByte = arrayOfByte1;
              } 
            } else {
              i2 = m;
              arrayOfByte = arrayOfByte1;
              if (i1 == jf2.X) {
                i2 = k + 8;
                while (true) {
                  if (i2 - k < n) {
                    paramqj2.l(i2);
                    i1 = paramqj2.d();
                    if (paramqj2.d() == jf2.Y) {
                      paramqj2.m(6);
                      if (paramqj2.g() == 1) {
                        bool1 = true;
                      } else {
                        bool1 = false;
                      } 
                      i2 = paramqj2.g();
                      arrayOfByte2 = new byte[16];
                      paramqj2.p(arrayOfByte2, 0, 16);
                      eg2 eg2 = new eg2(bool1, i2, arrayOfByte2);
                      i2 = m;
                      arrayOfByte = arrayOfByte1;
                      break;
                    } 
                    i2 += i1;
                    continue;
                  } 
                  arrayOfByte2 = null;
                  arrayOfByte = arrayOfByte1;
                  i2 = m;
                  break;
                } 
              } 
            } 
            k += n;
            m = i2;
            arrayOfByte1 = arrayOfByte;
          } 
          Pair pair2 = pair1;
          if (m != 0) {
            if (arrayOfByte1 != null) {
              bool1 = true;
            } else {
              bool1 = false;
            } 
            jj2.b(bool1, "frma atom is mandatory");
            bool1 = bool;
            if (arrayOfByte2 != null)
              bool1 = true; 
            jj2.b(bool1, "schi->tenc atom is mandatory");
            pair2 = Pair.create(arrayOfByte1, arrayOfByte2);
          } 
          if (pair2 != null) {
            parampf2.a[paramInt3] = (eg2)pair2.second;
            return ((Integer)pair2.first).intValue();
          } 
        } 
        i += j;
        continue;
      } 
      return 0;
    } 
  }
  
  public static fg2 b(if2 paramif2, lf2 paramlf2, long paramLong, zzjo paramzzjo, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getstatic com/google/android/gms/internal/ads/jf2.E : I
    //   4: invokevirtual g : (I)Lcom/google/android/gms/internal/ads/if2;
    //   7: astore #6
    //   9: aload #6
    //   11: getstatic com/google/android/gms/internal/ads/jf2.S : I
    //   14: invokevirtual f : (I)Lcom/google/android/gms/internal/ads/lf2;
    //   17: getfield Q0 : Lcom/google/android/gms/internal/ads/qj2;
    //   20: astore #7
    //   22: aload #7
    //   24: bipush #16
    //   26: invokevirtual l : (I)V
    //   29: aload #7
    //   31: invokevirtual d : ()I
    //   34: istore #8
    //   36: iload #8
    //   38: getstatic com/google/android/gms/internal/ads/kf2.b : I
    //   41: if_icmpne -> 50
    //   44: iconst_1
    //   45: istore #8
    //   47: goto -> 122
    //   50: iload #8
    //   52: getstatic com/google/android/gms/internal/ads/kf2.a : I
    //   55: if_icmpne -> 64
    //   58: iconst_2
    //   59: istore #8
    //   61: goto -> 122
    //   64: iload #8
    //   66: getstatic com/google/android/gms/internal/ads/kf2.c : I
    //   69: if_icmpeq -> 119
    //   72: iload #8
    //   74: getstatic com/google/android/gms/internal/ads/kf2.d : I
    //   77: if_icmpeq -> 119
    //   80: iload #8
    //   82: getstatic com/google/android/gms/internal/ads/kf2.e : I
    //   85: if_icmpeq -> 119
    //   88: iload #8
    //   90: getstatic com/google/android/gms/internal/ads/kf2.f : I
    //   93: if_icmpne -> 99
    //   96: goto -> 119
    //   99: iload #8
    //   101: getstatic com/google/android/gms/internal/ads/kf2.h : I
    //   104: if_icmpne -> 113
    //   107: iconst_4
    //   108: istore #8
    //   110: goto -> 122
    //   113: iconst_m1
    //   114: istore #8
    //   116: goto -> 122
    //   119: iconst_3
    //   120: istore #8
    //   122: iload #8
    //   124: iconst_m1
    //   125: if_icmpne -> 130
    //   128: aconst_null
    //   129: areturn
    //   130: aload_0
    //   131: getstatic com/google/android/gms/internal/ads/jf2.O : I
    //   134: invokevirtual f : (I)Lcom/google/android/gms/internal/ads/lf2;
    //   137: getfield Q0 : Lcom/google/android/gms/internal/ads/qj2;
    //   140: astore #7
    //   142: aload #7
    //   144: bipush #8
    //   146: invokevirtual l : (I)V
    //   149: aload #7
    //   151: invokevirtual d : ()I
    //   154: invokestatic a : (I)I
    //   157: istore #9
    //   159: iload #9
    //   161: ifne -> 171
    //   164: bipush #8
    //   166: istore #10
    //   168: goto -> 175
    //   171: bipush #16
    //   173: istore #10
    //   175: aload #7
    //   177: iload #10
    //   179: invokevirtual m : (I)V
    //   182: aload #7
    //   184: invokevirtual d : ()I
    //   187: istore #11
    //   189: aload #7
    //   191: iconst_4
    //   192: invokevirtual m : (I)V
    //   195: aload #7
    //   197: invokevirtual b : ()I
    //   200: istore #12
    //   202: iload #9
    //   204: ifne -> 213
    //   207: iconst_4
    //   208: istore #10
    //   210: goto -> 217
    //   213: bipush #8
    //   215: istore #10
    //   217: iconst_0
    //   218: istore #13
    //   220: iload #13
    //   222: iload #10
    //   224: if_icmpge -> 254
    //   227: aload #7
    //   229: getfield a : [B
    //   232: iload #12
    //   234: iload #13
    //   236: iadd
    //   237: baload
    //   238: iconst_m1
    //   239: if_icmpeq -> 248
    //   242: iconst_0
    //   243: istore #13
    //   245: goto -> 257
    //   248: iinc #13, 1
    //   251: goto -> 220
    //   254: iconst_1
    //   255: istore #13
    //   257: iload #13
    //   259: ifeq -> 277
    //   262: aload #7
    //   264: iload #10
    //   266: invokevirtual m : (I)V
    //   269: ldc2_w -9223372036854775807
    //   272: lstore #14
    //   274: goto -> 309
    //   277: iload #9
    //   279: ifne -> 292
    //   282: aload #7
    //   284: invokevirtual s : ()J
    //   287: lstore #14
    //   289: goto -> 299
    //   292: aload #7
    //   294: invokevirtual w : ()J
    //   297: lstore #14
    //   299: lload #14
    //   301: lconst_0
    //   302: lcmp
    //   303: ifne -> 309
    //   306: goto -> 269
    //   309: aload #7
    //   311: bipush #16
    //   313: invokevirtual m : (I)V
    //   316: aload #7
    //   318: invokevirtual d : ()I
    //   321: istore #13
    //   323: aload #7
    //   325: invokevirtual d : ()I
    //   328: istore #12
    //   330: aload #7
    //   332: iconst_4
    //   333: invokevirtual m : (I)V
    //   336: aload #7
    //   338: invokevirtual d : ()I
    //   341: istore #10
    //   343: aload #7
    //   345: invokevirtual d : ()I
    //   348: istore #9
    //   350: iload #13
    //   352: ifne -> 381
    //   355: iload #12
    //   357: ldc 65536
    //   359: if_icmpne -> 381
    //   362: iload #10
    //   364: ldc -65536
    //   366: if_icmpne -> 381
    //   369: iload #9
    //   371: ifne -> 381
    //   374: bipush #90
    //   376: istore #10
    //   378: goto -> 448
    //   381: iload #13
    //   383: ifne -> 413
    //   386: iload #12
    //   388: ldc -65536
    //   390: if_icmpne -> 413
    //   393: iload #10
    //   395: ldc 65536
    //   397: if_icmpne -> 413
    //   400: iload #9
    //   402: ifne -> 413
    //   405: sipush #270
    //   408: istore #10
    //   410: goto -> 448
    //   413: iload #13
    //   415: ldc -65536
    //   417: if_icmpne -> 445
    //   420: iload #12
    //   422: ifne -> 445
    //   425: iload #10
    //   427: ifne -> 445
    //   430: iload #9
    //   432: ldc -65536
    //   434: if_icmpne -> 445
    //   437: sipush #180
    //   440: istore #10
    //   442: goto -> 448
    //   445: iconst_0
    //   446: istore #10
    //   448: new com/google/android/gms/internal/ads/qf2
    //   451: dup
    //   452: iload #11
    //   454: lload #14
    //   456: iload #10
    //   458: invokespecial <init> : (IJI)V
    //   461: astore #16
    //   463: lload_2
    //   464: ldc2_w -9223372036854775807
    //   467: lcmp
    //   468: ifne -> 480
    //   471: aload #16
    //   473: invokestatic a : (Lcom/google/android/gms/internal/ads/qf2;)J
    //   476: lstore_2
    //   477: goto -> 480
    //   480: aload_1
    //   481: getfield Q0 : Lcom/google/android/gms/internal/ads/qj2;
    //   484: astore_1
    //   485: aload_1
    //   486: bipush #8
    //   488: invokevirtual l : (I)V
    //   491: aload_1
    //   492: invokevirtual d : ()I
    //   495: invokestatic a : (I)I
    //   498: ifne -> 508
    //   501: bipush #8
    //   503: istore #10
    //   505: goto -> 512
    //   508: bipush #16
    //   510: istore #10
    //   512: aload_1
    //   513: iload #10
    //   515: invokevirtual m : (I)V
    //   518: aload_1
    //   519: invokevirtual s : ()J
    //   522: lstore #17
    //   524: lload_2
    //   525: ldc2_w -9223372036854775807
    //   528: lcmp
    //   529: ifne -> 540
    //   532: ldc2_w -9223372036854775807
    //   535: lstore #14
    //   537: goto -> 551
    //   540: lload_2
    //   541: ldc2_w 1000000
    //   544: lload #17
    //   546: invokestatic c : (JJJ)J
    //   549: lstore #14
    //   551: aload #6
    //   553: getstatic com/google/android/gms/internal/ads/jf2.F : I
    //   556: invokevirtual g : (I)Lcom/google/android/gms/internal/ads/if2;
    //   559: getstatic com/google/android/gms/internal/ads/jf2.G : I
    //   562: invokevirtual g : (I)Lcom/google/android/gms/internal/ads/if2;
    //   565: astore_1
    //   566: aload #6
    //   568: getstatic com/google/android/gms/internal/ads/jf2.R : I
    //   571: invokevirtual f : (I)Lcom/google/android/gms/internal/ads/lf2;
    //   574: getfield Q0 : Lcom/google/android/gms/internal/ads/qj2;
    //   577: astore #6
    //   579: aload #6
    //   581: bipush #8
    //   583: invokevirtual l : (I)V
    //   586: aload #6
    //   588: invokevirtual d : ()I
    //   591: invokestatic a : (I)I
    //   594: istore #13
    //   596: iload #13
    //   598: ifne -> 608
    //   601: bipush #8
    //   603: istore #10
    //   605: goto -> 612
    //   608: bipush #16
    //   610: istore #10
    //   612: aload #6
    //   614: iload #10
    //   616: invokevirtual m : (I)V
    //   619: aload #6
    //   621: invokevirtual s : ()J
    //   624: lstore_2
    //   625: iload #13
    //   627: ifne -> 636
    //   630: iconst_4
    //   631: istore #10
    //   633: goto -> 640
    //   636: bipush #8
    //   638: istore #10
    //   640: aload #6
    //   642: iload #10
    //   644: invokevirtual m : (I)V
    //   647: aload #6
    //   649: invokevirtual h : ()I
    //   652: istore #10
    //   654: iload #10
    //   656: bipush #10
    //   658: ishr
    //   659: bipush #31
    //   661: iand
    //   662: bipush #96
    //   664: iadd
    //   665: i2c
    //   666: istore #19
    //   668: iload #10
    //   670: iconst_5
    //   671: ishr
    //   672: bipush #31
    //   674: iand
    //   675: bipush #96
    //   677: iadd
    //   678: i2c
    //   679: istore #20
    //   681: iload #10
    //   683: bipush #31
    //   685: iand
    //   686: bipush #96
    //   688: iadd
    //   689: i2c
    //   690: istore #21
    //   692: new java/lang/StringBuilder
    //   695: dup
    //   696: iconst_3
    //   697: invokespecial <init> : (I)V
    //   700: astore #6
    //   702: aload #6
    //   704: iload #19
    //   706: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   709: pop
    //   710: aload #6
    //   712: iload #20
    //   714: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   717: pop
    //   718: aload #6
    //   720: iload #21
    //   722: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   725: pop
    //   726: lload_2
    //   727: invokestatic valueOf : (J)Ljava/lang/Long;
    //   730: aload #6
    //   732: invokevirtual toString : ()Ljava/lang/String;
    //   735: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   738: astore #6
    //   740: aload_1
    //   741: getstatic com/google/android/gms/internal/ads/jf2.T : I
    //   744: invokevirtual f : (I)Lcom/google/android/gms/internal/ads/lf2;
    //   747: getfield Q0 : Lcom/google/android/gms/internal/ads/qj2;
    //   750: astore #7
    //   752: aload #16
    //   754: invokestatic b : (Lcom/google/android/gms/internal/ads/qf2;)I
    //   757: istore #22
    //   759: aload #16
    //   761: invokestatic c : (Lcom/google/android/gms/internal/ads/qf2;)I
    //   764: istore #23
    //   766: aload #6
    //   768: getfield second : Ljava/lang/Object;
    //   771: checkcast java/lang/String
    //   774: astore #24
    //   776: aload #7
    //   778: bipush #12
    //   780: invokevirtual l : (I)V
    //   783: aload #7
    //   785: invokevirtual d : ()I
    //   788: istore #25
    //   790: new com/google/android/gms/internal/ads/pf2
    //   793: dup
    //   794: iload #25
    //   796: invokespecial <init> : (I)V
    //   799: astore_1
    //   800: iconst_0
    //   801: istore #10
    //   803: iload #8
    //   805: istore #26
    //   807: iload #10
    //   809: istore #8
    //   811: iload #8
    //   813: iload #25
    //   815: if_icmpge -> 3300
    //   818: aload #7
    //   820: invokevirtual b : ()I
    //   823: istore #13
    //   825: aload #7
    //   827: invokevirtual d : ()I
    //   830: istore #9
    //   832: iload #9
    //   834: ifle -> 843
    //   837: iconst_1
    //   838: istore #27
    //   840: goto -> 846
    //   843: iconst_0
    //   844: istore #27
    //   846: ldc 'childAtomSize should be positive'
    //   848: astore #28
    //   850: iload #27
    //   852: ldc 'childAtomSize should be positive'
    //   854: invokestatic b : (ZLjava/lang/Object;)V
    //   857: aload #7
    //   859: invokevirtual d : ()I
    //   862: istore #12
    //   864: iload #12
    //   866: getstatic com/google/android/gms/internal/ads/jf2.b : I
    //   869: if_icmpeq -> 2337
    //   872: iload #12
    //   874: getstatic com/google/android/gms/internal/ads/jf2.c : I
    //   877: if_icmpeq -> 2337
    //   880: iload #12
    //   882: getstatic com/google/android/gms/internal/ads/jf2.Z : I
    //   885: if_icmpeq -> 2337
    //   888: iload #12
    //   890: getstatic com/google/android/gms/internal/ads/jf2.l0 : I
    //   893: if_icmpeq -> 2337
    //   896: iload #12
    //   898: getstatic com/google/android/gms/internal/ads/jf2.d : I
    //   901: if_icmpeq -> 2337
    //   904: iload #12
    //   906: getstatic com/google/android/gms/internal/ads/jf2.e : I
    //   909: if_icmpeq -> 2337
    //   912: iload #12
    //   914: getstatic com/google/android/gms/internal/ads/jf2.f : I
    //   917: if_icmpeq -> 2337
    //   920: iload #12
    //   922: getstatic com/google/android/gms/internal/ads/jf2.K0 : I
    //   925: if_icmpeq -> 2337
    //   928: iload #12
    //   930: getstatic com/google/android/gms/internal/ads/jf2.L0 : I
    //   933: if_icmpne -> 939
    //   936: goto -> 2337
    //   939: iload #12
    //   941: getstatic com/google/android/gms/internal/ads/jf2.i : I
    //   944: if_icmpeq -> 1336
    //   947: iload #12
    //   949: getstatic com/google/android/gms/internal/ads/jf2.a0 : I
    //   952: if_icmpeq -> 1336
    //   955: iload #12
    //   957: getstatic com/google/android/gms/internal/ads/jf2.n : I
    //   960: if_icmpeq -> 1336
    //   963: iload #12
    //   965: getstatic com/google/android/gms/internal/ads/jf2.p : I
    //   968: if_icmpeq -> 1336
    //   971: iload #12
    //   973: getstatic com/google/android/gms/internal/ads/jf2.r : I
    //   976: if_icmpeq -> 1336
    //   979: iload #12
    //   981: getstatic com/google/android/gms/internal/ads/jf2.u : I
    //   984: if_icmpeq -> 1336
    //   987: iload #12
    //   989: getstatic com/google/android/gms/internal/ads/jf2.s : I
    //   992: if_icmpeq -> 1336
    //   995: iload #12
    //   997: getstatic com/google/android/gms/internal/ads/jf2.t : I
    //   1000: if_icmpeq -> 1336
    //   1003: iload #12
    //   1005: getstatic com/google/android/gms/internal/ads/jf2.y0 : I
    //   1008: if_icmpeq -> 1336
    //   1011: iload #12
    //   1013: getstatic com/google/android/gms/internal/ads/jf2.z0 : I
    //   1016: if_icmpeq -> 1336
    //   1019: iload #12
    //   1021: getstatic com/google/android/gms/internal/ads/jf2.l : I
    //   1024: if_icmpeq -> 1336
    //   1027: iload #12
    //   1029: getstatic com/google/android/gms/internal/ads/jf2.m : I
    //   1032: if_icmpeq -> 1336
    //   1035: iload #12
    //   1037: getstatic com/google/android/gms/internal/ads/jf2.j : I
    //   1040: if_icmpeq -> 1336
    //   1043: iload #12
    //   1045: getstatic com/google/android/gms/internal/ads/jf2.O0 : I
    //   1048: if_icmpne -> 1054
    //   1051: goto -> 1336
    //   1054: getstatic com/google/android/gms/internal/ads/jf2.j0 : I
    //   1057: istore #10
    //   1059: iload #12
    //   1061: iload #10
    //   1063: if_icmpeq -> 1158
    //   1066: iload #12
    //   1068: getstatic com/google/android/gms/internal/ads/jf2.u0 : I
    //   1071: if_icmpeq -> 1158
    //   1074: iload #12
    //   1076: getstatic com/google/android/gms/internal/ads/jf2.v0 : I
    //   1079: if_icmpeq -> 1158
    //   1082: iload #12
    //   1084: getstatic com/google/android/gms/internal/ads/jf2.w0 : I
    //   1087: if_icmpeq -> 1158
    //   1090: iload #12
    //   1092: getstatic com/google/android/gms/internal/ads/jf2.x0 : I
    //   1095: if_icmpne -> 1101
    //   1098: goto -> 1158
    //   1101: iload #12
    //   1103: getstatic com/google/android/gms/internal/ads/jf2.N0 : I
    //   1106: if_icmpne -> 1131
    //   1109: aload_1
    //   1110: iload #22
    //   1112: invokestatic toString : (I)Ljava/lang/String;
    //   1115: ldc_w 'application/x-camera-motion'
    //   1118: aconst_null
    //   1119: iconst_m1
    //   1120: aload #4
    //   1122: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/google/android/gms/internal/ads/zzjo;)Lcom/google/android/gms/internal/ads/zzht;
    //   1125: putfield b : Lcom/google/android/gms/internal/ads/zzht;
    //   1128: goto -> 1131
    //   1131: iload #8
    //   1133: istore #10
    //   1135: aload #6
    //   1137: astore #28
    //   1139: aload #7
    //   1141: astore #6
    //   1143: iload #9
    //   1145: istore #8
    //   1147: aload #24
    //   1149: astore #7
    //   1151: aload #28
    //   1153: astore #24
    //   1155: goto -> 3265
    //   1158: aload #7
    //   1160: iload #13
    //   1162: bipush #8
    //   1164: iadd
    //   1165: bipush #8
    //   1167: iadd
    //   1168: invokevirtual l : (I)V
    //   1171: ldc2_w 9223372036854775807
    //   1174: lstore_2
    //   1175: iload #12
    //   1177: iload #10
    //   1179: if_icmpne -> 1193
    //   1182: ldc_w 'application/ttml+xml'
    //   1185: astore #28
    //   1187: aconst_null
    //   1188: astore #29
    //   1190: goto -> 1300
    //   1193: iload #12
    //   1195: getstatic com/google/android/gms/internal/ads/jf2.u0 : I
    //   1198: if_icmpne -> 1242
    //   1201: iload #9
    //   1203: bipush #8
    //   1205: isub
    //   1206: bipush #8
    //   1208: isub
    //   1209: istore #10
    //   1211: iload #10
    //   1213: newarray byte
    //   1215: astore #28
    //   1217: aload #7
    //   1219: aload #28
    //   1221: iconst_0
    //   1222: iload #10
    //   1224: invokevirtual p : ([BII)V
    //   1227: aload #28
    //   1229: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   1232: astore #29
    //   1234: ldc_w 'application/x-quicktime-tx3g'
    //   1237: astore #28
    //   1239: goto -> 1190
    //   1242: iload #12
    //   1244: getstatic com/google/android/gms/internal/ads/jf2.v0 : I
    //   1247: if_icmpne -> 1261
    //   1250: ldc_w 'application/x-mp4-vtt'
    //   1253: astore #28
    //   1255: aconst_null
    //   1256: astore #29
    //   1258: goto -> 1300
    //   1261: iload #12
    //   1263: getstatic com/google/android/gms/internal/ads/jf2.w0 : I
    //   1266: if_icmpne -> 1279
    //   1269: ldc_w 'application/ttml+xml'
    //   1272: astore #28
    //   1274: lconst_0
    //   1275: lstore_2
    //   1276: goto -> 1255
    //   1279: iload #12
    //   1281: getstatic com/google/android/gms/internal/ads/jf2.x0 : I
    //   1284: if_icmpne -> 1328
    //   1287: aload_1
    //   1288: iconst_1
    //   1289: putfield d : I
    //   1292: ldc_w 'application/x-mp4-cea-608'
    //   1295: astore #28
    //   1297: aconst_null
    //   1298: astore #29
    //   1300: aload_1
    //   1301: iload #22
    //   1303: invokestatic toString : (I)Ljava/lang/String;
    //   1306: aload #28
    //   1308: aconst_null
    //   1309: iconst_m1
    //   1310: iconst_0
    //   1311: aload #24
    //   1313: iconst_m1
    //   1314: aload #4
    //   1316: lload_2
    //   1317: aload #29
    //   1319: invokestatic g : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILcom/google/android/gms/internal/ads/zzjo;JLjava/util/List;)Lcom/google/android/gms/internal/ads/zzht;
    //   1322: putfield b : Lcom/google/android/gms/internal/ads/zzht;
    //   1325: goto -> 1454
    //   1328: new java/lang/IllegalStateException
    //   1331: dup
    //   1332: invokespecial <init> : ()V
    //   1335: athrow
    //   1336: iload #8
    //   1338: istore #30
    //   1340: iload #9
    //   1342: istore #31
    //   1344: aload_1
    //   1345: astore #29
    //   1347: iload #13
    //   1349: istore #11
    //   1351: aload #7
    //   1353: iload #11
    //   1355: bipush #8
    //   1357: iadd
    //   1358: bipush #8
    //   1360: iadd
    //   1361: invokevirtual l : (I)V
    //   1364: iload #5
    //   1366: ifeq -> 1386
    //   1369: aload #7
    //   1371: invokevirtual h : ()I
    //   1374: istore #10
    //   1376: aload #7
    //   1378: bipush #6
    //   1380: invokevirtual m : (I)V
    //   1383: goto -> 1396
    //   1386: aload #7
    //   1388: bipush #8
    //   1390: invokevirtual m : (I)V
    //   1393: iconst_0
    //   1394: istore #10
    //   1396: iload #10
    //   1398: ifeq -> 1495
    //   1401: iload #10
    //   1403: iconst_1
    //   1404: if_icmpne -> 1410
    //   1407: goto -> 1495
    //   1410: iload #10
    //   1412: iconst_2
    //   1413: if_icmpne -> 1454
    //   1416: aload #7
    //   1418: bipush #16
    //   1420: invokevirtual m : (I)V
    //   1423: aload #7
    //   1425: invokevirtual e : ()J
    //   1428: invokestatic longBitsToDouble : (J)D
    //   1431: invokestatic round : (D)J
    //   1434: l2i
    //   1435: istore #13
    //   1437: aload #7
    //   1439: invokevirtual v : ()I
    //   1442: istore #10
    //   1444: aload #7
    //   1446: bipush #20
    //   1448: invokevirtual m : (I)V
    //   1451: goto -> 1533
    //   1454: aload #6
    //   1456: astore #28
    //   1458: aload #24
    //   1460: astore #6
    //   1462: aload #7
    //   1464: astore #29
    //   1466: aload #28
    //   1468: astore #24
    //   1470: iload #8
    //   1472: istore #10
    //   1474: aload #6
    //   1476: astore #7
    //   1478: aload #29
    //   1480: astore #6
    //   1482: aload_1
    //   1483: astore #28
    //   1485: iload #9
    //   1487: istore #8
    //   1489: aload #28
    //   1491: astore_1
    //   1492: goto -> 3265
    //   1495: aload #7
    //   1497: invokevirtual h : ()I
    //   1500: istore #32
    //   1502: aload #7
    //   1504: bipush #6
    //   1506: invokevirtual m : (I)V
    //   1509: aload #7
    //   1511: invokevirtual u : ()I
    //   1514: istore #13
    //   1516: iload #10
    //   1518: iconst_1
    //   1519: if_icmpne -> 1529
    //   1522: aload #7
    //   1524: bipush #16
    //   1526: invokevirtual m : (I)V
    //   1529: iload #32
    //   1531: istore #10
    //   1533: aload #7
    //   1535: invokevirtual b : ()I
    //   1538: istore #32
    //   1540: iload #12
    //   1542: getstatic com/google/android/gms/internal/ads/jf2.a0 : I
    //   1545: if_icmpne -> 1573
    //   1548: aload #7
    //   1550: iload #11
    //   1552: iload #31
    //   1554: aload #29
    //   1556: iload #30
    //   1558: invokestatic a : (Lcom/google/android/gms/internal/ads/qj2;IILcom/google/android/gms/internal/ads/pf2;I)I
    //   1561: istore #12
    //   1563: aload #7
    //   1565: iload #32
    //   1567: invokevirtual l : (I)V
    //   1570: goto -> 1573
    //   1573: getstatic com/google/android/gms/internal/ads/jf2.n : I
    //   1576: istore #30
    //   1578: ldc_w 'audio/raw'
    //   1581: astore #33
    //   1583: iload #12
    //   1585: iload #30
    //   1587: if_icmpne -> 1597
    //   1590: ldc_w 'audio/ac3'
    //   1593: astore_1
    //   1594: goto -> 1756
    //   1597: iload #12
    //   1599: getstatic com/google/android/gms/internal/ads/jf2.p : I
    //   1602: if_icmpne -> 1612
    //   1605: ldc_w 'audio/eac3'
    //   1608: astore_1
    //   1609: goto -> 1756
    //   1612: iload #12
    //   1614: getstatic com/google/android/gms/internal/ads/jf2.r : I
    //   1617: if_icmpne -> 1627
    //   1620: ldc_w 'audio/vnd.dts'
    //   1623: astore_1
    //   1624: goto -> 1756
    //   1627: iload #12
    //   1629: getstatic com/google/android/gms/internal/ads/jf2.s : I
    //   1632: if_icmpeq -> 1752
    //   1635: iload #12
    //   1637: getstatic com/google/android/gms/internal/ads/jf2.t : I
    //   1640: if_icmpne -> 1646
    //   1643: goto -> 1752
    //   1646: iload #12
    //   1648: getstatic com/google/android/gms/internal/ads/jf2.u : I
    //   1651: if_icmpne -> 1661
    //   1654: ldc_w 'audio/vnd.dts.hd;profile=lbr'
    //   1657: astore_1
    //   1658: goto -> 1756
    //   1661: iload #12
    //   1663: getstatic com/google/android/gms/internal/ads/jf2.y0 : I
    //   1666: if_icmpne -> 1676
    //   1669: ldc_w 'audio/3gpp'
    //   1672: astore_1
    //   1673: goto -> 1756
    //   1676: iload #12
    //   1678: getstatic com/google/android/gms/internal/ads/jf2.z0 : I
    //   1681: if_icmpne -> 1691
    //   1684: ldc_w 'audio/amr-wb'
    //   1687: astore_1
    //   1688: goto -> 1756
    //   1691: iload #12
    //   1693: getstatic com/google/android/gms/internal/ads/jf2.l : I
    //   1696: if_icmpeq -> 1745
    //   1699: iload #12
    //   1701: getstatic com/google/android/gms/internal/ads/jf2.m : I
    //   1704: if_icmpne -> 1710
    //   1707: goto -> 1745
    //   1710: iload #12
    //   1712: getstatic com/google/android/gms/internal/ads/jf2.j : I
    //   1715: if_icmpne -> 1725
    //   1718: ldc_w 'audio/mpeg'
    //   1721: astore_1
    //   1722: goto -> 1756
    //   1725: iload #12
    //   1727: getstatic com/google/android/gms/internal/ads/jf2.O0 : I
    //   1730: if_icmpne -> 1740
    //   1733: ldc_w 'audio/alac'
    //   1736: astore_1
    //   1737: goto -> 1756
    //   1740: aconst_null
    //   1741: astore_1
    //   1742: goto -> 1756
    //   1745: ldc_w 'audio/raw'
    //   1748: astore_1
    //   1749: goto -> 1756
    //   1752: ldc_w 'audio/vnd.dts.hd'
    //   1755: astore_1
    //   1756: aconst_null
    //   1757: astore #34
    //   1759: iload #13
    //   1761: istore #12
    //   1763: iload #10
    //   1765: istore #30
    //   1767: iload #11
    //   1769: istore #13
    //   1771: iload #8
    //   1773: istore #11
    //   1775: iload #32
    //   1777: istore #8
    //   1779: aload #4
    //   1781: astore #35
    //   1783: iload #8
    //   1785: iload #13
    //   1787: isub
    //   1788: iload #31
    //   1790: if_icmpge -> 2223
    //   1793: aload #7
    //   1795: iload #8
    //   1797: invokevirtual l : (I)V
    //   1800: aload #7
    //   1802: invokevirtual d : ()I
    //   1805: istore #10
    //   1807: iload #10
    //   1809: ifle -> 1818
    //   1812: iconst_1
    //   1813: istore #27
    //   1815: goto -> 1821
    //   1818: iconst_0
    //   1819: istore #27
    //   1821: iload #27
    //   1823: aload #28
    //   1825: invokestatic b : (ZLjava/lang/Object;)V
    //   1828: aload #7
    //   1830: invokevirtual d : ()I
    //   1833: istore #36
    //   1835: getstatic com/google/android/gms/internal/ads/jf2.J : I
    //   1838: istore #37
    //   1840: iload #36
    //   1842: iload #37
    //   1844: if_icmpeq -> 2018
    //   1847: iload #5
    //   1849: ifeq -> 1863
    //   1852: iload #36
    //   1854: getstatic com/google/android/gms/internal/ads/jf2.k : I
    //   1857: if_icmpne -> 1863
    //   1860: goto -> 2018
    //   1863: iload #36
    //   1865: getstatic com/google/android/gms/internal/ads/jf2.o : I
    //   1868: if_icmpne -> 1903
    //   1871: aload #7
    //   1873: iload #8
    //   1875: bipush #8
    //   1877: iadd
    //   1878: invokevirtual l : (I)V
    //   1881: aload #29
    //   1883: aload #7
    //   1885: iload #22
    //   1887: invokestatic toString : (I)Ljava/lang/String;
    //   1890: aload #24
    //   1892: aload #35
    //   1894: invokestatic a : (Lcom/google/android/gms/internal/ads/qj2;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzjo;)Lcom/google/android/gms/internal/ads/zzht;
    //   1897: putfield b : Lcom/google/android/gms/internal/ads/zzht;
    //   1900: goto -> 2015
    //   1903: iload #36
    //   1905: getstatic com/google/android/gms/internal/ads/jf2.q : I
    //   1908: if_icmpne -> 1943
    //   1911: aload #7
    //   1913: iload #8
    //   1915: bipush #8
    //   1917: iadd
    //   1918: invokevirtual l : (I)V
    //   1921: aload #29
    //   1923: aload #7
    //   1925: iload #22
    //   1927: invokestatic toString : (I)Ljava/lang/String;
    //   1930: aload #24
    //   1932: aload #35
    //   1934: invokestatic b : (Lcom/google/android/gms/internal/ads/qj2;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzjo;)Lcom/google/android/gms/internal/ads/zzht;
    //   1937: putfield b : Lcom/google/android/gms/internal/ads/zzht;
    //   1940: goto -> 1900
    //   1943: iload #36
    //   1945: getstatic com/google/android/gms/internal/ads/jf2.v : I
    //   1948: if_icmpne -> 1981
    //   1951: aload #29
    //   1953: iload #22
    //   1955: invokestatic toString : (I)Ljava/lang/String;
    //   1958: aload_1
    //   1959: aconst_null
    //   1960: iconst_m1
    //   1961: iconst_m1
    //   1962: iload #30
    //   1964: iload #12
    //   1966: aconst_null
    //   1967: aload #4
    //   1969: iconst_0
    //   1970: aload #24
    //   1972: invokestatic f : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/util/List;Lcom/google/android/gms/internal/ads/zzjo;ILjava/lang/String;)Lcom/google/android/gms/internal/ads/zzht;
    //   1975: putfield b : Lcom/google/android/gms/internal/ads/zzht;
    //   1978: goto -> 2015
    //   1981: iload #36
    //   1983: getstatic com/google/android/gms/internal/ads/jf2.O0 : I
    //   1986: if_icmpne -> 2015
    //   1989: iload #10
    //   1991: newarray byte
    //   1993: astore #34
    //   1995: aload #7
    //   1997: iload #8
    //   1999: invokevirtual l : (I)V
    //   2002: aload #7
    //   2004: aload #34
    //   2006: iconst_0
    //   2007: iload #10
    //   2009: invokevirtual p : ([BII)V
    //   2012: goto -> 2015
    //   2015: goto -> 2213
    //   2018: iload #10
    //   2020: istore #32
    //   2022: iload #36
    //   2024: iload #37
    //   2026: if_icmpne -> 2036
    //   2029: iload #8
    //   2031: istore #10
    //   2033: goto -> 2118
    //   2036: aload #7
    //   2038: invokevirtual b : ()I
    //   2041: istore #10
    //   2043: iload #10
    //   2045: iload #8
    //   2047: isub
    //   2048: iload #32
    //   2050: if_icmpge -> 2112
    //   2053: aload #7
    //   2055: iload #10
    //   2057: invokevirtual l : (I)V
    //   2060: aload #7
    //   2062: invokevirtual d : ()I
    //   2065: istore #36
    //   2067: iload #36
    //   2069: ifle -> 2078
    //   2072: iconst_1
    //   2073: istore #27
    //   2075: goto -> 2081
    //   2078: iconst_0
    //   2079: istore #27
    //   2081: iload #27
    //   2083: aload #28
    //   2085: invokestatic b : (ZLjava/lang/Object;)V
    //   2088: aload #7
    //   2090: invokevirtual d : ()I
    //   2093: getstatic com/google/android/gms/internal/ads/jf2.J : I
    //   2096: if_icmpne -> 2102
    //   2099: goto -> 2033
    //   2102: iload #10
    //   2104: iload #36
    //   2106: iadd
    //   2107: istore #10
    //   2109: goto -> 2043
    //   2112: iconst_m1
    //   2113: istore #10
    //   2115: goto -> 2033
    //   2118: iload #10
    //   2120: iconst_m1
    //   2121: if_icmpeq -> 2209
    //   2124: aload #7
    //   2126: iload #10
    //   2128: invokestatic e : (Lcom/google/android/gms/internal/ads/qj2;I)Landroid/util/Pair;
    //   2131: astore #34
    //   2133: aload #34
    //   2135: getfield first : Ljava/lang/Object;
    //   2138: checkcast java/lang/String
    //   2141: astore_1
    //   2142: aload #34
    //   2144: getfield second : Ljava/lang/Object;
    //   2147: checkcast [B
    //   2150: astore #34
    //   2152: ldc_w 'audio/mp4a-latm'
    //   2155: aload_1
    //   2156: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2159: ifeq -> 2202
    //   2162: aload #34
    //   2164: invokestatic d : ([B)Landroid/util/Pair;
    //   2167: astore #35
    //   2169: aload #35
    //   2171: getfield first : Ljava/lang/Object;
    //   2174: checkcast java/lang/Integer
    //   2177: invokevirtual intValue : ()I
    //   2180: istore #12
    //   2182: aload #35
    //   2184: getfield second : Ljava/lang/Object;
    //   2187: checkcast java/lang/Integer
    //   2190: invokevirtual intValue : ()I
    //   2193: istore #30
    //   2195: iload #32
    //   2197: istore #10
    //   2199: goto -> 2213
    //   2202: iload #32
    //   2204: istore #10
    //   2206: goto -> 2213
    //   2209: iload #32
    //   2211: istore #10
    //   2213: iload #8
    //   2215: iload #10
    //   2217: iadd
    //   2218: istore #8
    //   2220: goto -> 1779
    //   2223: aload #29
    //   2225: getfield b : Lcom/google/android/gms/internal/ads/zzht;
    //   2228: ifnonnull -> 2308
    //   2231: aload_1
    //   2232: ifnull -> 2308
    //   2235: aload #33
    //   2237: aload_1
    //   2238: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2241: ifeq -> 2250
    //   2244: iconst_2
    //   2245: istore #8
    //   2247: goto -> 2253
    //   2250: iconst_m1
    //   2251: istore #8
    //   2253: iload #22
    //   2255: invokestatic toString : (I)Ljava/lang/String;
    //   2258: astore #33
    //   2260: aload #34
    //   2262: ifnonnull -> 2271
    //   2265: aconst_null
    //   2266: astore #28
    //   2268: goto -> 2278
    //   2271: aload #34
    //   2273: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   2276: astore #28
    //   2278: aload #29
    //   2280: aload #33
    //   2282: aload_1
    //   2283: aconst_null
    //   2284: iconst_m1
    //   2285: iconst_m1
    //   2286: iload #30
    //   2288: iload #12
    //   2290: iload #8
    //   2292: aload #28
    //   2294: aload #4
    //   2296: iconst_0
    //   2297: aload #24
    //   2299: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILjava/util/List;Lcom/google/android/gms/internal/ads/zzjo;ILjava/lang/String;)Lcom/google/android/gms/internal/ads/zzht;
    //   2302: putfield b : Lcom/google/android/gms/internal/ads/zzht;
    //   2305: goto -> 2308
    //   2308: aload #6
    //   2310: astore_1
    //   2311: aload #7
    //   2313: astore #6
    //   2315: iload #11
    //   2317: istore #10
    //   2319: aload #24
    //   2321: astore #7
    //   2323: aload #29
    //   2325: astore #24
    //   2327: aload #24
    //   2329: astore #28
    //   2331: aload_1
    //   2332: astore #24
    //   2334: goto -> 1485
    //   2337: aload #24
    //   2339: astore #33
    //   2341: iload #9
    //   2343: istore #32
    //   2345: ldc 'childAtomSize should be positive'
    //   2347: astore #24
    //   2349: aload #7
    //   2351: iload #13
    //   2353: bipush #8
    //   2355: iadd
    //   2356: bipush #8
    //   2358: iadd
    //   2359: invokevirtual l : (I)V
    //   2362: aload #7
    //   2364: bipush #16
    //   2366: invokevirtual m : (I)V
    //   2369: aload #7
    //   2371: invokevirtual h : ()I
    //   2374: istore #36
    //   2376: aload #7
    //   2378: invokevirtual h : ()I
    //   2381: istore #37
    //   2383: aload #7
    //   2385: bipush #50
    //   2387: invokevirtual m : (I)V
    //   2390: aload #7
    //   2392: invokevirtual b : ()I
    //   2395: istore #31
    //   2397: iload #12
    //   2399: istore #10
    //   2401: iload #12
    //   2403: getstatic com/google/android/gms/internal/ads/jf2.Z : I
    //   2406: if_icmpne -> 2430
    //   2409: aload #7
    //   2411: iload #13
    //   2413: iload #32
    //   2415: aload_1
    //   2416: iload #8
    //   2418: invokestatic a : (Lcom/google/android/gms/internal/ads/qj2;IILcom/google/android/gms/internal/ads/pf2;I)I
    //   2421: istore #10
    //   2423: aload #7
    //   2425: iload #31
    //   2427: invokevirtual l : (I)V
    //   2430: aconst_null
    //   2431: astore #34
    //   2433: iconst_0
    //   2434: istore #12
    //   2436: aconst_null
    //   2437: astore #28
    //   2439: fconst_1
    //   2440: fstore #38
    //   2442: aconst_null
    //   2443: astore #29
    //   2445: iconst_m1
    //   2446: istore #11
    //   2448: iload #31
    //   2450: iload #13
    //   2452: isub
    //   2453: iload #32
    //   2455: if_icmpge -> 3171
    //   2458: aload #7
    //   2460: iload #31
    //   2462: invokevirtual l : (I)V
    //   2465: aload #7
    //   2467: invokevirtual b : ()I
    //   2470: istore #39
    //   2472: aload #7
    //   2474: invokevirtual d : ()I
    //   2477: istore #40
    //   2479: iload #40
    //   2481: ifne -> 2497
    //   2484: aload #7
    //   2486: invokevirtual b : ()I
    //   2489: iload #13
    //   2491: isub
    //   2492: iload #32
    //   2494: if_icmpeq -> 3171
    //   2497: iload #40
    //   2499: ifle -> 2508
    //   2502: iconst_1
    //   2503: istore #27
    //   2505: goto -> 2511
    //   2508: iconst_0
    //   2509: istore #27
    //   2511: iload #27
    //   2513: aload #24
    //   2515: invokestatic b : (ZLjava/lang/Object;)V
    //   2518: aload #7
    //   2520: invokevirtual d : ()I
    //   2523: istore #41
    //   2525: iload #41
    //   2527: getstatic com/google/android/gms/internal/ads/jf2.H : I
    //   2530: if_icmpne -> 2605
    //   2533: aload #34
    //   2535: ifnonnull -> 2544
    //   2538: iconst_1
    //   2539: istore #27
    //   2541: goto -> 2547
    //   2544: iconst_0
    //   2545: istore #27
    //   2547: iload #27
    //   2549: invokestatic e : (Z)V
    //   2552: aload #7
    //   2554: iload #39
    //   2556: bipush #8
    //   2558: iadd
    //   2559: invokevirtual l : (I)V
    //   2562: aload #7
    //   2564: invokestatic a : (Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/yj2;
    //   2567: astore #28
    //   2569: aload #28
    //   2571: getfield a : Ljava/util/List;
    //   2574: astore #34
    //   2576: aload_1
    //   2577: aload #28
    //   2579: getfield b : I
    //   2582: putfield c : I
    //   2585: iload #12
    //   2587: ifne -> 2597
    //   2590: aload #28
    //   2592: getfield e : F
    //   2595: fstore #38
    //   2597: ldc_w 'video/avc'
    //   2600: astore #28
    //   2602: goto -> 2670
    //   2605: iload #41
    //   2607: getstatic com/google/android/gms/internal/ads/jf2.I : I
    //   2610: if_icmpne -> 2685
    //   2613: aload #34
    //   2615: ifnonnull -> 2624
    //   2618: iconst_1
    //   2619: istore #27
    //   2621: goto -> 2627
    //   2624: iconst_0
    //   2625: istore #27
    //   2627: iload #27
    //   2629: invokestatic e : (Z)V
    //   2632: aload #7
    //   2634: iload #39
    //   2636: bipush #8
    //   2638: iadd
    //   2639: invokevirtual l : (I)V
    //   2642: aload #7
    //   2644: invokestatic a : (Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/dk2;
    //   2647: astore #28
    //   2649: aload #28
    //   2651: getfield a : Ljava/util/List;
    //   2654: astore #34
    //   2656: aload_1
    //   2657: aload #28
    //   2659: getfield b : I
    //   2662: putfield c : I
    //   2665: ldc_w 'video/hevc'
    //   2668: astore #28
    //   2670: aload #34
    //   2672: astore #35
    //   2674: aload #28
    //   2676: astore #34
    //   2678: aload #35
    //   2680: astore #28
    //   2682: goto -> 3161
    //   2685: iload #41
    //   2687: getstatic com/google/android/gms/internal/ads/jf2.M0 : I
    //   2690: if_icmpne -> 2736
    //   2693: aload #34
    //   2695: ifnonnull -> 2704
    //   2698: iconst_1
    //   2699: istore #27
    //   2701: goto -> 2707
    //   2704: iconst_0
    //   2705: istore #27
    //   2707: iload #27
    //   2709: invokestatic e : (Z)V
    //   2712: iload #10
    //   2714: getstatic com/google/android/gms/internal/ads/jf2.K0 : I
    //   2717: if_icmpne -> 2728
    //   2720: ldc_w 'video/x-vnd.on2.vp8'
    //   2723: astore #34
    //   2725: goto -> 2733
    //   2728: ldc_w 'video/x-vnd.on2.vp9'
    //   2731: astore #34
    //   2733: goto -> 2768
    //   2736: iload #41
    //   2738: getstatic com/google/android/gms/internal/ads/jf2.g : I
    //   2741: if_icmpne -> 2795
    //   2744: aload #34
    //   2746: ifnonnull -> 2755
    //   2749: iconst_1
    //   2750: istore #27
    //   2752: goto -> 2758
    //   2755: iconst_0
    //   2756: istore #27
    //   2758: iload #27
    //   2760: invokestatic e : (Z)V
    //   2763: ldc_w 'video/3gpp'
    //   2766: astore #34
    //   2768: aload #29
    //   2770: astore #35
    //   2772: aload #28
    //   2774: astore #42
    //   2776: aload #34
    //   2778: astore #43
    //   2780: aload #43
    //   2782: astore #34
    //   2784: aload #42
    //   2786: astore #28
    //   2788: aload #35
    //   2790: astore #29
    //   2792: goto -> 2901
    //   2795: iload #41
    //   2797: getstatic com/google/android/gms/internal/ads/jf2.J : I
    //   2800: if_icmpne -> 2857
    //   2803: aload #34
    //   2805: ifnonnull -> 2814
    //   2808: iconst_1
    //   2809: istore #27
    //   2811: goto -> 2817
    //   2814: iconst_0
    //   2815: istore #27
    //   2817: iload #27
    //   2819: invokestatic e : (Z)V
    //   2822: aload #7
    //   2824: iload #39
    //   2826: invokestatic e : (Lcom/google/android/gms/internal/ads/qj2;I)Landroid/util/Pair;
    //   2829: astore #28
    //   2831: aload #28
    //   2833: getfield first : Ljava/lang/Object;
    //   2836: checkcast java/lang/String
    //   2839: astore #34
    //   2841: aload #28
    //   2843: getfield second : Ljava/lang/Object;
    //   2846: checkcast [B
    //   2849: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   2852: astore #28
    //   2854: goto -> 2768
    //   2857: iload #41
    //   2859: getstatic com/google/android/gms/internal/ads/jf2.i0 : I
    //   2862: if_icmpne -> 2904
    //   2865: aload #7
    //   2867: iload #39
    //   2869: bipush #8
    //   2871: iadd
    //   2872: invokevirtual l : (I)V
    //   2875: aload #7
    //   2877: invokevirtual v : ()I
    //   2880: istore #12
    //   2882: aload #7
    //   2884: invokevirtual v : ()I
    //   2887: istore #30
    //   2889: iload #12
    //   2891: i2f
    //   2892: iload #30
    //   2894: i2f
    //   2895: fdiv
    //   2896: fstore #38
    //   2898: iconst_1
    //   2899: istore #12
    //   2901: goto -> 3161
    //   2904: iload #41
    //   2906: getstatic com/google/android/gms/internal/ads/jf2.I0 : I
    //   2909: if_icmpne -> 3002
    //   2912: iload #39
    //   2914: bipush #8
    //   2916: iadd
    //   2917: istore #30
    //   2919: iload #30
    //   2921: iload #39
    //   2923: isub
    //   2924: iload #40
    //   2926: if_icmpge -> 2984
    //   2929: aload #7
    //   2931: iload #30
    //   2933: invokevirtual l : (I)V
    //   2936: aload #7
    //   2938: invokevirtual d : ()I
    //   2941: istore #41
    //   2943: aload #7
    //   2945: invokevirtual d : ()I
    //   2948: getstatic com/google/android/gms/internal/ads/jf2.J0 : I
    //   2951: if_icmpne -> 2974
    //   2954: aload #7
    //   2956: getfield a : [B
    //   2959: iload #30
    //   2961: iload #41
    //   2963: iload #30
    //   2965: iadd
    //   2966: invokestatic copyOfRange : ([BII)[B
    //   2969: astore #29
    //   2971: goto -> 2987
    //   2974: iload #30
    //   2976: iload #41
    //   2978: iadd
    //   2979: istore #30
    //   2981: goto -> 2919
    //   2984: aconst_null
    //   2985: astore #29
    //   2987: aload #34
    //   2989: astore #43
    //   2991: aload #28
    //   2993: astore #42
    //   2995: aload #29
    //   2997: astore #35
    //   2999: goto -> 2780
    //   3002: iload #10
    //   3004: istore #30
    //   3006: aload #24
    //   3008: astore #44
    //   3010: aload #34
    //   3012: astore #43
    //   3014: aload #28
    //   3016: astore #42
    //   3018: aload #29
    //   3020: astore #35
    //   3022: iload #30
    //   3024: istore #10
    //   3026: aload #44
    //   3028: astore #24
    //   3030: iload #41
    //   3032: getstatic com/google/android/gms/internal/ads/jf2.H0 : I
    //   3035: if_icmpne -> 2780
    //   3038: aload #7
    //   3040: invokevirtual g : ()I
    //   3043: istore #10
    //   3045: aload #7
    //   3047: iconst_3
    //   3048: invokevirtual m : (I)V
    //   3051: iload #10
    //   3053: ifne -> 3153
    //   3056: aload #7
    //   3058: invokevirtual g : ()I
    //   3061: istore #10
    //   3063: iload #10
    //   3065: ifeq -> 3139
    //   3068: iload #10
    //   3070: iconst_1
    //   3071: if_icmpeq -> 3125
    //   3074: iload #10
    //   3076: iconst_2
    //   3077: if_icmpeq -> 3111
    //   3080: iload #10
    //   3082: iconst_3
    //   3083: if_icmpeq -> 3097
    //   3086: iload #30
    //   3088: istore #10
    //   3090: aload #44
    //   3092: astore #24
    //   3094: goto -> 3161
    //   3097: iconst_3
    //   3098: istore #11
    //   3100: iload #30
    //   3102: istore #10
    //   3104: aload #44
    //   3106: astore #24
    //   3108: goto -> 3161
    //   3111: iconst_2
    //   3112: istore #11
    //   3114: iload #30
    //   3116: istore #10
    //   3118: aload #44
    //   3120: astore #24
    //   3122: goto -> 3161
    //   3125: iconst_1
    //   3126: istore #11
    //   3128: iload #30
    //   3130: istore #10
    //   3132: aload #44
    //   3134: astore #24
    //   3136: goto -> 3161
    //   3139: iconst_0
    //   3140: istore #11
    //   3142: iload #30
    //   3144: istore #10
    //   3146: aload #44
    //   3148: astore #24
    //   3150: goto -> 3161
    //   3153: aload #44
    //   3155: astore #24
    //   3157: iload #30
    //   3159: istore #10
    //   3161: iload #31
    //   3163: iload #40
    //   3165: iadd
    //   3166: istore #31
    //   3168: goto -> 2448
    //   3171: aload #34
    //   3173: ifnull -> 3240
    //   3176: iload #22
    //   3178: invokestatic toString : (I)Ljava/lang/String;
    //   3181: astore #35
    //   3183: iload #8
    //   3185: istore #10
    //   3187: aload #6
    //   3189: astore #24
    //   3191: iload #32
    //   3193: istore #8
    //   3195: aload #7
    //   3197: astore #6
    //   3199: aload_1
    //   3200: aload #35
    //   3202: aload #34
    //   3204: aconst_null
    //   3205: iconst_m1
    //   3206: iconst_m1
    //   3207: iload #36
    //   3209: iload #37
    //   3211: ldc_w -1.0
    //   3214: aload #28
    //   3216: iload #23
    //   3218: fload #38
    //   3220: aload #29
    //   3222: iload #11
    //   3224: aconst_null
    //   3225: aload #4
    //   3227: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIFLjava/util/List;IF[BILcom/google/android/gms/internal/ads/zzpy;Lcom/google/android/gms/internal/ads/zzjo;)Lcom/google/android/gms/internal/ads/zzht;
    //   3230: putfield b : Lcom/google/android/gms/internal/ads/zzht;
    //   3233: aload #33
    //   3235: astore #7
    //   3237: goto -> 3265
    //   3240: aload #6
    //   3242: astore #28
    //   3244: aload #7
    //   3246: astore #6
    //   3248: aload_1
    //   3249: astore #24
    //   3251: aload #33
    //   3253: astore #7
    //   3255: iload #8
    //   3257: istore #10
    //   3259: aload #28
    //   3261: astore_1
    //   3262: goto -> 2327
    //   3265: aload #6
    //   3267: iload #13
    //   3269: iload #8
    //   3271: iadd
    //   3272: invokevirtual l : (I)V
    //   3275: iload #10
    //   3277: iconst_1
    //   3278: iadd
    //   3279: istore #8
    //   3281: aload #24
    //   3283: astore #28
    //   3285: aload #7
    //   3287: astore #24
    //   3289: aload #6
    //   3291: astore #7
    //   3293: aload #28
    //   3295: astore #6
    //   3297: goto -> 811
    //   3300: aload_0
    //   3301: getstatic com/google/android/gms/internal/ads/jf2.P : I
    //   3304: invokevirtual g : (I)Lcom/google/android/gms/internal/ads/if2;
    //   3307: astore_0
    //   3308: aload_0
    //   3309: ifnull -> 3467
    //   3312: aload_0
    //   3313: getstatic com/google/android/gms/internal/ads/jf2.Q : I
    //   3316: invokevirtual f : (I)Lcom/google/android/gms/internal/ads/lf2;
    //   3319: astore_0
    //   3320: aload_0
    //   3321: ifnonnull -> 3327
    //   3324: goto -> 3467
    //   3327: aload_0
    //   3328: getfield Q0 : Lcom/google/android/gms/internal/ads/qj2;
    //   3331: astore_0
    //   3332: aload_0
    //   3333: bipush #8
    //   3335: invokevirtual l : (I)V
    //   3338: aload_0
    //   3339: invokevirtual d : ()I
    //   3342: invokestatic a : (I)I
    //   3345: istore #10
    //   3347: aload_0
    //   3348: invokevirtual v : ()I
    //   3351: istore #13
    //   3353: iload #13
    //   3355: newarray long
    //   3357: astore #4
    //   3359: iload #13
    //   3361: newarray long
    //   3363: astore #7
    //   3365: iconst_0
    //   3366: istore #8
    //   3368: iload #8
    //   3370: iload #13
    //   3372: if_icmpge -> 3456
    //   3375: iload #10
    //   3377: iconst_1
    //   3378: if_icmpne -> 3389
    //   3381: aload_0
    //   3382: invokevirtual w : ()J
    //   3385: lstore_2
    //   3386: goto -> 3394
    //   3389: aload_0
    //   3390: invokevirtual s : ()J
    //   3393: lstore_2
    //   3394: aload #4
    //   3396: iload #8
    //   3398: lload_2
    //   3399: lastore
    //   3400: iload #10
    //   3402: iconst_1
    //   3403: if_icmpne -> 3414
    //   3406: aload_0
    //   3407: invokevirtual e : ()J
    //   3410: lstore_2
    //   3411: goto -> 3420
    //   3414: aload_0
    //   3415: invokevirtual d : ()I
    //   3418: i2l
    //   3419: lstore_2
    //   3420: aload #7
    //   3422: iload #8
    //   3424: lload_2
    //   3425: lastore
    //   3426: aload_0
    //   3427: invokevirtual f : ()S
    //   3430: iconst_1
    //   3431: if_icmpne -> 3445
    //   3434: aload_0
    //   3435: iconst_2
    //   3436: invokevirtual m : (I)V
    //   3439: iinc #8, 1
    //   3442: goto -> 3368
    //   3445: new java/lang/IllegalArgumentException
    //   3448: dup
    //   3449: ldc_w 'Unsupported media rate.'
    //   3452: invokespecial <init> : (Ljava/lang/String;)V
    //   3455: athrow
    //   3456: aload #4
    //   3458: aload #7
    //   3460: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   3463: astore_0
    //   3464: goto -> 3473
    //   3467: aconst_null
    //   3468: aconst_null
    //   3469: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   3472: astore_0
    //   3473: aload_1
    //   3474: getfield b : Lcom/google/android/gms/internal/ads/zzht;
    //   3477: ifnonnull -> 3482
    //   3480: aconst_null
    //   3481: areturn
    //   3482: new com/google/android/gms/internal/ads/fg2
    //   3485: dup
    //   3486: aload #16
    //   3488: invokestatic b : (Lcom/google/android/gms/internal/ads/qf2;)I
    //   3491: iload #26
    //   3493: aload #6
    //   3495: getfield first : Ljava/lang/Object;
    //   3498: checkcast java/lang/Long
    //   3501: invokevirtual longValue : ()J
    //   3504: lload #17
    //   3506: lload #14
    //   3508: aload_1
    //   3509: getfield b : Lcom/google/android/gms/internal/ads/zzht;
    //   3512: aload_1
    //   3513: getfield d : I
    //   3516: aload_1
    //   3517: getfield a : [Lcom/google/android/gms/internal/ads/eg2;
    //   3520: aload_1
    //   3521: getfield c : I
    //   3524: aload_0
    //   3525: getfield first : Ljava/lang/Object;
    //   3528: checkcast [J
    //   3531: aload_0
    //   3532: getfield second : Ljava/lang/Object;
    //   3535: checkcast [J
    //   3538: invokespecial <init> : (IIJJJLcom/google/android/gms/internal/ads/zzht;I[Lcom/google/android/gms/internal/ads/eg2;I[J[J)V
    //   3541: areturn
  }
  
  public static gg2 c(fg2 paramfg2, if2 paramif2, re2 paramre2) {
    zzhw zzhw1;
    long[] arrayOfLong2;
    int[] arrayOfInt1;
    rf2 rf2;
    int[] arrayOfInt2;
    boolean bool;
    long[] arrayOfLong3;
    qj2 qj24;
    int i3;
    long l2;
    lf2 lf22 = paramif2.f(jf2.q0);
    if (lf22 != null) {
      of2 of2 = new of2(lf22);
    } else {
      lf22 = paramif2.f(jf2.r0);
      if (lf22 != null) {
        rf2 = new rf2(lf22);
      } else {
        zzhw1 = new zzhw("Track has no sample table size information");
        throw zzhw1;
      } 
    } 
    int i = rf2.b();
    if (i == 0)
      return new gg2(new long[0], new int[0], 0, new long[0], new int[0]); 
    lf22 = paramif2.f(jf2.s0);
    if (lf22 == null) {
      lf22 = paramif2.f(jf2.t0);
      bool = true;
    } else {
      bool = false;
    } 
    qj2 qj21 = lf22.Q0;
    qj2 qj22 = (paramif2.f(jf2.p0)).Q0;
    qj2 qj23 = (paramif2.f(jf2.m0)).Q0;
    lf22 = paramif2.f(jf2.n0);
    lf2 lf23 = null;
    if (lf22 != null) {
      qj2 qj2 = lf22.Q0;
    } else {
      lf22 = null;
    } 
    lf2 lf21 = paramif2.f(jf2.o0);
    if (lf21 != null) {
      qj24 = lf21.Q0;
    } else {
      qj24 = null;
    } 
    nf2 nf2 = new nf2(qj22, qj21, bool);
    qj23.l(12);
    int j = qj23.v() - 1;
    int k = qj23.v();
    int m = qj23.v();
    if (qj24 != null) {
      qj24.l(12);
      n = qj24.v();
    } else {
      n = 0;
    } 
    int i1 = -1;
    if (lf22 != null) {
      lf22.l(12);
      i2 = lf22.v();
      i3 = i2;
      lf21 = lf23;
      if (i2 > 0) {
        i1 = lf22.v() - 1;
        lf21 = lf22;
        i3 = i2;
      } 
    } else {
      lf21 = lf22;
      i3 = 0;
    } 
    if (rf2.a() && "audio/raw".equals(((fg2)zzhw1).f.g) && j == 0 && !n && !i3) {
      i2 = 1;
    } else {
      i2 = 0;
    } 
    long l1 = 0L;
    if (!i2) {
      long[] arrayOfLong = new long[i];
      int[] arrayOfInt4 = new int[i];
      arrayOfLong3 = new long[i];
      int[] arrayOfInt3 = new int[i];
      int i4 = i1;
      long l = 0L;
      l2 = l;
      int i5 = 0;
      i2 = 0;
      int i6 = 0;
      int i7 = 0;
      int i8 = 0;
      i1 = n;
      int i9 = i3;
      n = i8;
      i3 = i1;
      i1 = i;
      i = i4;
      i4 = i5;
      while (i4 < i1) {
        int i10 = i7;
        i7 = m;
        m = k;
        while (i10 == 0) {
          jj2.e(nf2.a());
          l = nf2.d;
          i10 = nf2.c;
        } 
        i8 = i3;
        i5 = i6;
        k = n;
        if (qj24 != null) {
          while (!i6 && i3 > 0) {
            i6 = qj24.v();
            n = qj24.d();
            i3--;
          } 
          i5 = i6 - 1;
          k = n;
          i8 = i3;
        } 
        arrayOfLong[i4] = l;
        arrayOfInt4[i4] = rf2.c();
        i6 = i2;
        if (arrayOfInt4[i4] > i2)
          i6 = arrayOfInt4[i4]; 
        arrayOfLong3[i4] = l2 + k;
        if (lf21 == null) {
          i3 = 1;
        } else {
          i3 = 0;
        } 
        arrayOfInt3[i4] = i3;
        i3 = i;
        i2 = i9;
        if (i4 == i) {
          arrayOfInt3[i4] = 1;
          n = i9 - 1;
          i3 = i;
          i2 = n;
          if (n > 0) {
            i3 = lf21.v() - 1;
            i2 = n;
          } 
        } 
        l2 += i7;
        i = m - 1;
        if (i == 0 && j > 0) {
          i = qj23.v();
          n = qj23.v();
          j--;
        } else {
          n = i7;
        } 
        l += arrayOfInt4[i4];
        i7 = i10 - 1;
        i4++;
        i10 = k;
        k = i;
        i = i3;
        i9 = i2;
        i2 = i6;
        m = n;
        i3 = i8;
        i6 = i5;
        n = i10;
      } 
      if (i6 == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      jj2.a(bool);
      while (i3 > 0) {
        if (qj24.v() == 0) {
          bool = true;
        } else {
          bool = false;
        } 
        jj2.a(bool);
        qj24.d();
        i3--;
      } 
      if (i9 != 0 || k != 0 || i7 != 0 || j != 0) {
        i3 = ((fg2)zzhw1).a;
        StringBuilder stringBuilder = new StringBuilder(215);
        stringBuilder.append("Inconsistent stbl box for track ");
        stringBuilder.append(i3);
        stringBuilder.append(": remainingSynchronizationSamples ");
        stringBuilder.append(i9);
        stringBuilder.append(", remainingSamplesAtTimestampDelta ");
        stringBuilder.append(k);
        stringBuilder.append(", remainingSamplesInChunk ");
        stringBuilder.append(i7);
        stringBuilder.append(", remainingTimestampDeltaChanges ");
        stringBuilder.append(j);
        Log.w("AtomParsers", stringBuilder.toString());
      } 
      arrayOfLong2 = arrayOfLong;
      arrayOfInt1 = arrayOfInt3;
      i3 = i2;
      arrayOfInt2 = arrayOfInt4;
      i = i1;
    } else {
      int i5 = nf2.a;
      long[] arrayOfLong4 = new long[i5];
      int[] arrayOfInt3 = new int[i5];
      while (nf2.a()) {
        i3 = nf2.b;
        arrayOfLong4[i3] = nf2.d;
        arrayOfInt3[i3] = nf2.c;
      } 
      int i4 = arrayOfInt2.c();
      long l = m;
      m = 8192 / i4;
      i3 = 0;
      n = 0;
      while (i3 < i5) {
        n += wj2.p(arrayOfInt3[i3], m);
        i3++;
      } 
      arrayOfLong3 = new long[n];
      arrayOfInt2 = new int[n];
      long[] arrayOfLong5 = new long[n];
      int[] arrayOfInt4 = new int[n];
      n = 0;
      i2 = 0;
      i1 = 0;
      k = 0;
      i3 = i5;
      while (n < i3) {
        i5 = arrayOfInt3[n];
        long l3 = arrayOfLong4[n];
        while (i5 > 0) {
          j = Math.min(m, i5);
          arrayOfLong3[i1] = l3;
          arrayOfInt2[i1] = i4 * j;
          k = Math.max(k, arrayOfInt2[i1]);
          arrayOfLong5[i1] = i2 * l;
          arrayOfInt4[i1] = 1;
          l3 += arrayOfInt2[i1];
          i2 += j;
          i5 -= j;
          i1++;
        } 
        n++;
      } 
      vf2 vf2 = new vf2(arrayOfLong3, arrayOfInt2, k, arrayOfLong5, arrayOfInt4, null);
      arrayOfLong2 = vf2.a;
      arrayOfInt2 = vf2.b;
      i3 = vf2.c;
      arrayOfLong3 = vf2.d;
      arrayOfInt1 = vf2.e;
      l2 = 0L;
    } 
    zzhw zzhw2 = zzhw1;
    if (((fg2)zzhw2).i == null || paramre2.c()) {
      wj2.f(arrayOfLong3, 1000000L, ((fg2)zzhw2).c);
      return new gg2(arrayOfLong2, arrayOfInt2, i3, arrayOfLong3, arrayOfInt1);
    } 
    long[] arrayOfLong1 = ((fg2)zzhw2).i;
    if (arrayOfLong1.length == 1 && ((fg2)zzhw2).b == 1 && arrayOfLong3.length >= 2) {
      long l3 = ((fg2)zzhw2).j[0];
      long l4 = wj2.c(arrayOfLong1[0], ((fg2)zzhw2).c, ((fg2)zzhw2).d) + l3;
      if (arrayOfLong3[0] <= l3 && l3 < arrayOfLong3[1] && arrayOfLong3[arrayOfLong3.length - 1] < l4 && l4 <= l2) {
        l3 = wj2.c(l3 - arrayOfLong3[0], ((fg2)zzhw2).f.t, ((fg2)zzhw2).c);
        l2 = wj2.c(l2 - l4, ((fg2)zzhw2).f.t, ((fg2)zzhw2).c);
        if ((l3 != 0L || l2 != 0L) && l3 <= 2147483647L && l2 <= 2147483647L) {
          paramre2.c = (int)l3;
          paramre2.d = (int)l2;
          wj2.f(arrayOfLong3, 1000000L, ((fg2)zzhw2).c);
          return new gg2(arrayOfLong2, arrayOfInt2, i3, arrayOfLong3, arrayOfInt1);
        } 
      } 
    } 
    arrayOfLong1 = ((fg2)zzhw2).i;
    if (arrayOfLong1.length == 1 && arrayOfLong1[0] == 0L) {
      for (n = 0; n < arrayOfLong3.length; n++)
        arrayOfLong3[n] = wj2.c(arrayOfLong3[n] - ((fg2)zzhw2).j[0], 1000000L, ((fg2)zzhw2).c); 
      return new gg2(arrayOfLong2, arrayOfInt2, i3, arrayOfLong3, arrayOfInt1);
    } 
    if (((fg2)zzhw2).b == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    int i2 = 0;
    i1 = 0;
    k = 0;
    int n = 0;
    while (true) {
      int[] arrayOfInt3;
      long[] arrayOfLong4;
      int[] arrayOfInt5;
      arrayOfLong1 = ((fg2)zzhw2).i;
      if (n < arrayOfLong1.length) {
        l2 = ((fg2)zzhw2).j[n];
        if (l2 != -1L) {
          long l = wj2.c(arrayOfLong1[n], ((fg2)zzhw2).c, ((fg2)zzhw2).d);
          m = wj2.h(arrayOfLong3, l2, true, true);
          int i4 = wj2.h(arrayOfLong3, l2 + l, bool, false);
          int i5 = i1 + i4 - m;
          if (k != m) {
            i1 = 1;
          } else {
            i1 = 0;
          } 
          i2 |= i1;
          k = i4;
          i1 = i5;
        } 
        n++;
        continue;
      } 
      if (i1 != i) {
        n = 1;
      } else {
        n = 0;
      } 
      k = i2 | n;
      if (k != 0) {
        arrayOfLong4 = new long[i1];
      } else {
        arrayOfLong4 = arrayOfLong2;
      } 
      if (k != 0) {
        arrayOfInt5 = new int[i1];
      } else {
        arrayOfInt5 = arrayOfInt2;
      } 
      if (k != 0)
        i3 = 0; 
      if (k != 0) {
        arrayOfInt3 = new int[i1];
      } else {
        arrayOfInt3 = arrayOfInt1;
      } 
      long[] arrayOfLong5 = new long[i1];
      i1 = 0;
      n = 0;
      l2 = l1;
      int[] arrayOfInt4 = arrayOfInt5;
      long[] arrayOfLong6 = arrayOfLong2;
      while (true) {
        long[] arrayOfLong = ((fg2)zzhw2).i;
        if (i1 < arrayOfLong.length) {
          long[] arrayOfLong7 = ((fg2)zzhw2).j;
          int[] arrayOfInt = arrayOfInt3;
          long l = arrayOfLong7[i1];
          l1 = arrayOfLong[i1];
          if (l != -1L) {
            long l3 = wj2.c(l1, ((fg2)zzhw2).c, ((fg2)zzhw2).d);
            i = wj2.h(arrayOfLong3, l, true, true);
            int i4 = wj2.h(arrayOfLong3, l3 + l, bool, false);
            if (k != 0) {
              i2 = i4 - i;
              System.arraycopy(arrayOfLong6, i, arrayOfLong4, n, i2);
              System.arraycopy(arrayOfInt2, i, arrayOfInt4, n, i2);
              System.arraycopy(arrayOfInt1, i, arrayOfInt, n, i2);
            } 
            arrayOfInt = arrayOfInt3;
            arrayOfInt3 = arrayOfInt2;
            while (i < i4) {
              arrayOfLong5[n] = wj2.c(l2, 1000000L, ((fg2)zzhw2).d) + wj2.c(arrayOfLong3[i] - l, 1000000L, ((fg2)zzhw2).c);
              i2 = i3;
              if (k != 0) {
                i2 = i3;
                if (arrayOfInt4[n] > i3)
                  i2 = arrayOfInt3[i]; 
              } 
              n++;
              i++;
              i3 = i2;
            } 
            arrayOfInt2 = arrayOfInt3;
            arrayOfInt3 = arrayOfInt;
          } else {
            arrayOfInt3 = arrayOfInt;
          } 
          l2 += l1;
          i1++;
          continue;
        } 
        i1 = 0;
        for (n = 0; n < arrayOfInt3.length && i1 == 0; n++) {
          if ((arrayOfInt3[n] & 0x1) != 0) {
            i = 1;
          } else {
            i = 0;
          } 
          i1 |= i;
        } 
        if (i1 != 0)
          return new gg2(arrayOfLong4, arrayOfInt4, i3, arrayOfLong5, arrayOfInt3); 
        throw new zzhw("The edited sample sequence does not contain a sync sample.");
      } 
      break;
    } 
  }
  
  public static zzmh d(lf2 paramlf2, boolean paramBoolean) {
    if (paramBoolean)
      return null; 
    qj2 qj2 = paramlf2.Q0;
    qj2.l(8);
    while (qj2.q() >= 8) {
      int i = qj2.b();
      int j = qj2.d();
      if (qj2.d() == jf2.B0) {
        qj2.l(i);
        qj2.m(12);
        while (qj2.b() < i + j) {
          int k = qj2.b();
          int m = qj2.d();
          if (qj2.d() == jf2.C0) {
            qj2.l(k);
            qj2.m(8);
            ArrayList<zzmh.zza> arrayList = new ArrayList();
            while (qj2.b() < k + m) {
              zzmh.zza zza = yf2.d(qj2);
              if (zza != null)
                arrayList.add(zza); 
            } 
            if (!arrayList.isEmpty())
              return new zzmh(arrayList); 
            break;
          } 
          qj2.m(m - 8);
        } 
        return null;
      } 
      qj2.m(j - 8);
    } 
    return null;
  }
  
  private static Pair<String, byte[]> e(qj2 paramqj2, int paramInt) {
    paramqj2.l(paramInt + 8 + 4);
    paramqj2.m(1);
    f(paramqj2);
    paramqj2.m(2);
    paramInt = paramqj2.g();
    if ((paramInt & 0x80) != 0)
      paramqj2.m(2); 
    if ((paramInt & 0x40) != 0)
      paramqj2.m(paramqj2.h()); 
    if ((paramInt & 0x20) != 0)
      paramqj2.m(2); 
    paramqj2.m(1);
    f(paramqj2);
    paramInt = paramqj2.g();
    String str = null;
    if (paramInt != 32) {
      if (paramInt != 33) {
        if (paramInt != 35) {
          if (paramInt != 64)
            if (paramInt != 107) {
              if (paramInt != 165) {
                if (paramInt != 166) {
                  byte[] arrayOfByte;
                  switch (paramInt) {
                    default:
                      switch (paramInt) {
                        default:
                          paramqj2.m(12);
                          paramqj2.m(1);
                          paramInt = f(paramqj2);
                          arrayOfByte = new byte[paramInt];
                          paramqj2.p(arrayOfByte, 0, paramInt);
                          return Pair.create(str, arrayOfByte);
                        case 170:
                        case 171:
                          return Pair.create("audio/vnd.dts.hd", null);
                        case 169:
                        case 172:
                          break;
                      } 
                      return Pair.create("audio/vnd.dts", null);
                    case 102:
                    case 103:
                    case 104:
                      break;
                  } 
                } else {
                  str = "audio/eac3";
                } 
              } else {
                str = "audio/ac3";
              } 
            } else {
              return Pair.create("audio/mpeg", null);
            }  
          str = "audio/mp4a-latm";
        } 
        str = "video/hevc";
      } 
      str = "video/avc";
    } 
    str = "video/mp4v-es";
  }
  
  private static int f(qj2 paramqj2) {
    int i = paramqj2.g();
    int j;
    for (j = i & 0x7F; (i & 0x80) == 128; j = j << 7 | i & 0x7F)
      i = paramqj2.g(); 
    return j;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kf2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */