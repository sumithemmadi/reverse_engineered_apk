package b.h.e;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

public class c {
  private static void a(ArrayList<b> paramArrayList, char paramChar, float[] paramArrayOffloat) {
    paramArrayList.add(new b(paramChar, paramArrayOffloat));
  }
  
  public static boolean b(b[] paramArrayOfb1, b[] paramArrayOfb2) {
    if (paramArrayOfb1 == null || paramArrayOfb2 == null)
      return false; 
    if (paramArrayOfb1.length != paramArrayOfb2.length)
      return false; 
    for (byte b1 = 0; b1 < paramArrayOfb1.length; b1++) {
      if ((paramArrayOfb1[b1]).a != (paramArrayOfb2[b1]).a || (paramArrayOfb1[b1]).b.length != (paramArrayOfb2[b1]).b.length)
        return false; 
    } 
    return true;
  }
  
  static float[] c(float[] paramArrayOffloat, int paramInt1, int paramInt2) {
    if (paramInt1 <= paramInt2) {
      int i = paramArrayOffloat.length;
      if (paramInt1 >= 0 && paramInt1 <= i) {
        paramInt2 -= paramInt1;
        i = Math.min(paramInt2, i - paramInt1);
        float[] arrayOfFloat = new float[paramInt2];
        System.arraycopy(paramArrayOffloat, paramInt1, arrayOfFloat, 0, i);
        return arrayOfFloat;
      } 
      throw new ArrayIndexOutOfBoundsException();
    } 
    throw new IllegalArgumentException();
  }
  
  public static b[] d(String paramString) {
    if (paramString == null)
      return null; 
    ArrayList<b> arrayList = new ArrayList();
    int i = 1;
    int j = 0;
    while (i < paramString.length()) {
      i = i(paramString, i);
      String str = paramString.substring(j, i).trim();
      if (str.length() > 0) {
        float[] arrayOfFloat = h(str);
        a(arrayList, str.charAt(0), arrayOfFloat);
      } 
      j = i;
      i++;
    } 
    if (i - j == 1 && j < paramString.length())
      a(arrayList, paramString.charAt(j), new float[0]); 
    return arrayList.<b>toArray(new b[arrayList.size()]);
  }
  
  public static Path e(String paramString) {
    Path path = new Path();
    b[] arrayOfB = d(paramString);
    if (arrayOfB != null)
      try {
        b.e(arrayOfB, path);
        return path;
      } catch (RuntimeException runtimeException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error in parsing ");
        stringBuilder.append(paramString);
        throw new RuntimeException(stringBuilder.toString(), runtimeException);
      }  
    return null;
  }
  
  public static b[] f(b[] paramArrayOfb) {
    if (paramArrayOfb == null)
      return null; 
    b[] arrayOfB = new b[paramArrayOfb.length];
    for (byte b1 = 0; b1 < paramArrayOfb.length; b1++)
      arrayOfB[b1] = new b(paramArrayOfb[b1]); 
    return arrayOfB;
  }
  
  private static void g(String paramString, int paramInt, a parama) {
    parama.b = false;
    int i = paramInt;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    while (i < paramString.length()) {
      char c1 = paramString.charAt(i);
      if (c1 != ' ') {
        if (c1 != 'E' && c1 != 'e') {
          switch (c1) {
            default:
              bool1 = false;
              break;
            case '.':
              if (!bool2) {
                bool1 = false;
                bool2 = true;
                break;
              } 
              parama.b = true;
            case '-':
            
            case ',':
              bool1 = false;
              bool3 = true;
              break;
          } 
        } else {
          bool1 = true;
        } 
        if (bool3)
          break; 
        continue;
      } 
      i++;
    } 
    parama.a = i;
  }
  
  private static float[] h(String paramString) {
    if (paramString.charAt(0) == 'z' || paramString.charAt(0) == 'Z')
      return new float[0]; 
    try {
      null = new float[paramString.length()];
      a a = new a();
      this();
      int i = paramString.length();
      int j = 1;
      int k;
      for (k = 0; j < i; k = n) {
        g(paramString, j, a);
        int m = a.a;
        int n = k;
        if (j < m) {
          null[k] = Float.parseFloat(paramString.substring(j, m));
          n = k + 1;
        } 
        if (a.b) {
          j = m;
          k = n;
          continue;
        } 
        j = m + 1;
      } 
      return c(null, 0, k);
    } catch (NumberFormatException numberFormatException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("error in parsing \"");
      stringBuilder.append(paramString);
      stringBuilder.append("\"");
      throw new RuntimeException(stringBuilder.toString(), numberFormatException);
    } 
  }
  
  private static int i(String paramString, int paramInt) {
    while (paramInt < paramString.length()) {
      char c1 = paramString.charAt(paramInt);
      if (((c1 - 65) * (c1 - 90) <= 0 || (c1 - 97) * (c1 - 122) <= 0) && c1 != 'e' && c1 != 'E')
        return paramInt; 
      paramInt++;
    } 
    return paramInt;
  }
  
  public static void j(b[] paramArrayOfb1, b[] paramArrayOfb2) {
    for (byte b1 = 0; b1 < paramArrayOfb2.length; b1++) {
      (paramArrayOfb1[b1]).a = (char)(paramArrayOfb2[b1]).a;
      for (byte b2 = 0; b2 < (paramArrayOfb2[b1]).b.length; b2++)
        (paramArrayOfb1[b1]).b[b2] = (paramArrayOfb2[b1]).b[b2]; 
    } 
  }
  
  private static class a {
    int a;
    
    boolean b;
  }
  
  public static class b {
    public char a;
    
    public float[] b;
    
    b(char param1Char, float[] param1ArrayOffloat) {
      this.a = (char)param1Char;
      this.b = param1ArrayOffloat;
    }
    
    b(b param1b) {
      this.a = (char)param1b.a;
      float[] arrayOfFloat = param1b.b;
      this.b = c.c(arrayOfFloat, 0, arrayOfFloat.length);
    }
    
    private static void a(Path param1Path, float[] param1ArrayOffloat1, char param1Char1, char param1Char2, float[] param1ArrayOffloat2) {
      // Byte code:
      //   0: aload_1
      //   1: iconst_0
      //   2: faload
      //   3: fstore #5
      //   5: aload_1
      //   6: iconst_1
      //   7: faload
      //   8: fstore #6
      //   10: aload_1
      //   11: iconst_2
      //   12: faload
      //   13: fstore #7
      //   15: aload_1
      //   16: iconst_3
      //   17: faload
      //   18: fstore #8
      //   20: aload_1
      //   21: iconst_4
      //   22: faload
      //   23: fstore #9
      //   25: aload_1
      //   26: iconst_5
      //   27: faload
      //   28: fstore #10
      //   30: fload #5
      //   32: fstore #11
      //   34: fload #6
      //   36: fstore #12
      //   38: fload #7
      //   40: fstore #13
      //   42: fload #8
      //   44: fstore #14
      //   46: iload_3
      //   47: lookupswitch default -> 216, 65 -> 336, 67 -> 313, 72 -> 291, 76 -> 232, 77 -> 232, 81 -> 269, 83 -> 269, 84 -> 232, 86 -> 291, 90 -> 238, 97 -> 336, 99 -> 313, 104 -> 291, 108 -> 232, 109 -> 232, 113 -> 269, 115 -> 269, 116 -> 232, 118 -> 291, 122 -> 238
      //   216: fload #8
      //   218: fstore #14
      //   220: fload #7
      //   222: fstore #13
      //   224: fload #6
      //   226: fstore #12
      //   228: fload #5
      //   230: fstore #11
      //   232: iconst_2
      //   233: istore #15
      //   235: goto -> 356
      //   238: aload_0
      //   239: invokevirtual close : ()V
      //   242: aload_0
      //   243: fload #9
      //   245: fload #10
      //   247: invokevirtual moveTo : (FF)V
      //   250: fload #9
      //   252: fstore #11
      //   254: fload #11
      //   256: fstore #13
      //   258: fload #10
      //   260: fstore #12
      //   262: fload #12
      //   264: fstore #14
      //   266: goto -> 232
      //   269: iconst_4
      //   270: istore #15
      //   272: fload #5
      //   274: fstore #11
      //   276: fload #6
      //   278: fstore #12
      //   280: fload #7
      //   282: fstore #13
      //   284: fload #8
      //   286: fstore #14
      //   288: goto -> 356
      //   291: iconst_1
      //   292: istore #15
      //   294: fload #5
      //   296: fstore #11
      //   298: fload #6
      //   300: fstore #12
      //   302: fload #7
      //   304: fstore #13
      //   306: fload #8
      //   308: fstore #14
      //   310: goto -> 356
      //   313: bipush #6
      //   315: istore #15
      //   317: fload #5
      //   319: fstore #11
      //   321: fload #6
      //   323: fstore #12
      //   325: fload #7
      //   327: fstore #13
      //   329: fload #8
      //   331: fstore #14
      //   333: goto -> 356
      //   336: bipush #7
      //   338: istore #15
      //   340: fload #8
      //   342: fstore #14
      //   344: fload #7
      //   346: fstore #13
      //   348: fload #6
      //   350: fstore #12
      //   352: fload #5
      //   354: fstore #11
      //   356: fload #12
      //   358: fstore #7
      //   360: iconst_0
      //   361: istore #16
      //   363: iload_2
      //   364: istore #17
      //   366: fload #10
      //   368: fstore #5
      //   370: fload #9
      //   372: fstore #8
      //   374: fload #11
      //   376: fstore #12
      //   378: fload #7
      //   380: fstore #11
      //   382: iload #16
      //   384: istore_2
      //   385: iload_3
      //   386: istore #16
      //   388: iload_2
      //   389: aload #4
      //   391: arraylength
      //   392: if_icmpge -> 2153
      //   395: iload #16
      //   397: bipush #65
      //   399: if_icmpeq -> 1999
      //   402: iload #16
      //   404: bipush #67
      //   406: if_icmpeq -> 1886
      //   409: iload #16
      //   411: bipush #72
      //   413: if_icmpeq -> 1860
      //   416: iload #16
      //   418: bipush #81
      //   420: if_icmpeq -> 1769
      //   423: iload #16
      //   425: bipush #86
      //   427: if_icmpeq -> 1743
      //   430: iload #16
      //   432: bipush #97
      //   434: if_icmpeq -> 1603
      //   437: iload #16
      //   439: bipush #99
      //   441: if_icmpeq -> 1460
      //   444: iload #16
      //   446: bipush #104
      //   448: if_icmpeq -> 1432
      //   451: iload #16
      //   453: bipush #113
      //   455: if_icmpeq -> 1332
      //   458: iload #16
      //   460: bipush #118
      //   462: if_icmpeq -> 1307
      //   465: iload #16
      //   467: bipush #76
      //   469: if_icmpeq -> 1262
      //   472: iload #16
      //   474: bipush #77
      //   476: if_icmpeq -> 1192
      //   479: iload #16
      //   481: bipush #83
      //   483: if_icmpeq -> 1047
      //   486: iload #16
      //   488: bipush #84
      //   490: if_icmpeq -> 936
      //   493: iload #16
      //   495: bipush #108
      //   497: if_icmpeq -> 881
      //   500: iload #16
      //   502: bipush #109
      //   504: if_icmpeq -> 813
      //   507: iload #16
      //   509: bipush #115
      //   511: if_icmpeq -> 655
      //   514: iload #16
      //   516: bipush #116
      //   518: if_icmpeq -> 524
      //   521: goto -> 2142
      //   524: iload #17
      //   526: bipush #113
      //   528: if_icmpeq -> 564
      //   531: iload #17
      //   533: bipush #116
      //   535: if_icmpeq -> 564
      //   538: iload #17
      //   540: bipush #81
      //   542: if_icmpeq -> 564
      //   545: iload #17
      //   547: bipush #84
      //   549: if_icmpne -> 555
      //   552: goto -> 564
      //   555: fconst_0
      //   556: fstore #14
      //   558: fconst_0
      //   559: fstore #13
      //   561: goto -> 578
      //   564: fload #12
      //   566: fload #13
      //   568: fsub
      //   569: fstore #13
      //   571: fload #11
      //   573: fload #14
      //   575: fsub
      //   576: fstore #14
      //   578: iload_2
      //   579: iconst_0
      //   580: iadd
      //   581: istore #17
      //   583: aload #4
      //   585: iload #17
      //   587: faload
      //   588: fstore #10
      //   590: iload_2
      //   591: iconst_1
      //   592: iadd
      //   593: istore #16
      //   595: aload_0
      //   596: fload #13
      //   598: fload #14
      //   600: fload #10
      //   602: aload #4
      //   604: iload #16
      //   606: faload
      //   607: invokevirtual rQuadTo : (FFFF)V
      //   610: fload #12
      //   612: aload #4
      //   614: iload #17
      //   616: faload
      //   617: fadd
      //   618: fstore #10
      //   620: fload #11
      //   622: aload #4
      //   624: iload #16
      //   626: faload
      //   627: fadd
      //   628: fstore #9
      //   630: fload #14
      //   632: fload #11
      //   634: fadd
      //   635: fstore #14
      //   637: fload #13
      //   639: fload #12
      //   641: fadd
      //   642: fstore #13
      //   644: fload #9
      //   646: fstore #11
      //   648: fload #10
      //   650: fstore #12
      //   652: goto -> 521
      //   655: iload #17
      //   657: bipush #99
      //   659: if_icmpeq -> 695
      //   662: iload #17
      //   664: bipush #115
      //   666: if_icmpeq -> 695
      //   669: iload #17
      //   671: bipush #67
      //   673: if_icmpeq -> 695
      //   676: iload #17
      //   678: bipush #83
      //   680: if_icmpne -> 686
      //   683: goto -> 695
      //   686: fconst_0
      //   687: fstore #13
      //   689: fconst_0
      //   690: fstore #14
      //   692: goto -> 709
      //   695: fload #11
      //   697: fload #14
      //   699: fsub
      //   700: fstore #14
      //   702: fload #12
      //   704: fload #13
      //   706: fsub
      //   707: fstore #13
      //   709: iload_2
      //   710: iconst_0
      //   711: iadd
      //   712: istore #18
      //   714: aload #4
      //   716: iload #18
      //   718: faload
      //   719: fstore #10
      //   721: iload_2
      //   722: iconst_1
      //   723: iadd
      //   724: istore #17
      //   726: aload #4
      //   728: iload #17
      //   730: faload
      //   731: fstore #7
      //   733: iload_2
      //   734: iconst_2
      //   735: iadd
      //   736: istore #16
      //   738: aload #4
      //   740: iload #16
      //   742: faload
      //   743: fstore #9
      //   745: iload_2
      //   746: iconst_3
      //   747: iadd
      //   748: istore #19
      //   750: aload_0
      //   751: fload #13
      //   753: fload #14
      //   755: fload #10
      //   757: fload #7
      //   759: fload #9
      //   761: aload #4
      //   763: iload #19
      //   765: faload
      //   766: invokevirtual rCubicTo : (FFFFFF)V
      //   769: aload #4
      //   771: iload #18
      //   773: faload
      //   774: fload #12
      //   776: fadd
      //   777: fstore #9
      //   779: aload #4
      //   781: iload #17
      //   783: faload
      //   784: fload #11
      //   786: fadd
      //   787: fstore #13
      //   789: fload #12
      //   791: aload #4
      //   793: iload #16
      //   795: faload
      //   796: fadd
      //   797: fstore #14
      //   799: aload #4
      //   801: iload #19
      //   803: faload
      //   804: fstore #10
      //   806: fload #9
      //   808: fstore #12
      //   810: goto -> 1577
      //   813: iload_2
      //   814: iconst_0
      //   815: iadd
      //   816: istore #16
      //   818: fload #12
      //   820: aload #4
      //   822: iload #16
      //   824: faload
      //   825: fadd
      //   826: fstore #12
      //   828: iload_2
      //   829: iconst_1
      //   830: iadd
      //   831: istore #17
      //   833: fload #11
      //   835: aload #4
      //   837: iload #17
      //   839: faload
      //   840: fadd
      //   841: fstore #11
      //   843: iload_2
      //   844: ifle -> 864
      //   847: aload_0
      //   848: aload #4
      //   850: iload #16
      //   852: faload
      //   853: aload #4
      //   855: iload #17
      //   857: faload
      //   858: invokevirtual rLineTo : (FF)V
      //   861: goto -> 521
      //   864: aload_0
      //   865: aload #4
      //   867: iload #16
      //   869: faload
      //   870: aload #4
      //   872: iload #17
      //   874: faload
      //   875: invokevirtual rMoveTo : (FF)V
      //   878: goto -> 1251
      //   881: iload_2
      //   882: iconst_0
      //   883: iadd
      //   884: istore #16
      //   886: aload #4
      //   888: iload #16
      //   890: faload
      //   891: fstore #10
      //   893: iload_2
      //   894: iconst_1
      //   895: iadd
      //   896: istore #17
      //   898: aload_0
      //   899: fload #10
      //   901: aload #4
      //   903: iload #17
      //   905: faload
      //   906: invokevirtual rLineTo : (FF)V
      //   909: fload #12
      //   911: aload #4
      //   913: iload #16
      //   915: faload
      //   916: fadd
      //   917: fstore #12
      //   919: aload #4
      //   921: iload #17
      //   923: faload
      //   924: fstore #10
      //   926: fload #11
      //   928: fload #10
      //   930: fadd
      //   931: fstore #11
      //   933: goto -> 521
      //   936: iload #17
      //   938: bipush #113
      //   940: if_icmpeq -> 972
      //   943: iload #17
      //   945: bipush #116
      //   947: if_icmpeq -> 972
      //   950: iload #17
      //   952: bipush #81
      //   954: if_icmpeq -> 972
      //   957: fload #11
      //   959: fstore #9
      //   961: fload #12
      //   963: fstore #10
      //   965: iload #17
      //   967: bipush #84
      //   969: if_icmpne -> 990
      //   972: fload #12
      //   974: fconst_2
      //   975: fmul
      //   976: fload #13
      //   978: fsub
      //   979: fstore #10
      //   981: fload #11
      //   983: fconst_2
      //   984: fmul
      //   985: fload #14
      //   987: fsub
      //   988: fstore #9
      //   990: iload_2
      //   991: iconst_0
      //   992: iadd
      //   993: istore #17
      //   995: aload #4
      //   997: iload #17
      //   999: faload
      //   1000: fstore #12
      //   1002: iload_2
      //   1003: iconst_1
      //   1004: iadd
      //   1005: istore #16
      //   1007: aload_0
      //   1008: fload #10
      //   1010: fload #9
      //   1012: fload #12
      //   1014: aload #4
      //   1016: iload #16
      //   1018: faload
      //   1019: invokevirtual quadTo : (FFFF)V
      //   1022: aload #4
      //   1024: iload #17
      //   1026: faload
      //   1027: fstore #12
      //   1029: aload #4
      //   1031: iload #16
      //   1033: faload
      //   1034: fstore #11
      //   1036: fload #9
      //   1038: fstore #14
      //   1040: fload #10
      //   1042: fstore #13
      //   1044: goto -> 2142
      //   1047: iload #17
      //   1049: bipush #99
      //   1051: if_icmpeq -> 1083
      //   1054: iload #17
      //   1056: bipush #115
      //   1058: if_icmpeq -> 1083
      //   1061: iload #17
      //   1063: bipush #67
      //   1065: if_icmpeq -> 1083
      //   1068: fload #11
      //   1070: fstore #9
      //   1072: fload #12
      //   1074: fstore #10
      //   1076: iload #17
      //   1078: bipush #83
      //   1080: if_icmpne -> 1101
      //   1083: fload #12
      //   1085: fconst_2
      //   1086: fmul
      //   1087: fload #13
      //   1089: fsub
      //   1090: fstore #10
      //   1092: fload #11
      //   1094: fconst_2
      //   1095: fmul
      //   1096: fload #14
      //   1098: fsub
      //   1099: fstore #9
      //   1101: iload_2
      //   1102: iconst_0
      //   1103: iadd
      //   1104: istore #16
      //   1106: aload #4
      //   1108: iload #16
      //   1110: faload
      //   1111: fstore #11
      //   1113: iload_2
      //   1114: iconst_1
      //   1115: iadd
      //   1116: istore #19
      //   1118: aload #4
      //   1120: iload #19
      //   1122: faload
      //   1123: fstore #13
      //   1125: iload_2
      //   1126: iconst_2
      //   1127: iadd
      //   1128: istore #18
      //   1130: aload #4
      //   1132: iload #18
      //   1134: faload
      //   1135: fstore #12
      //   1137: iload_2
      //   1138: iconst_3
      //   1139: iadd
      //   1140: istore #17
      //   1142: aload_0
      //   1143: fload #10
      //   1145: fload #9
      //   1147: fload #11
      //   1149: fload #13
      //   1151: fload #12
      //   1153: aload #4
      //   1155: iload #17
      //   1157: faload
      //   1158: invokevirtual cubicTo : (FFFFFF)V
      //   1161: aload #4
      //   1163: iload #16
      //   1165: faload
      //   1166: fstore #12
      //   1168: aload #4
      //   1170: iload #19
      //   1172: faload
      //   1173: fstore #13
      //   1175: aload #4
      //   1177: iload #18
      //   1179: faload
      //   1180: fstore #10
      //   1182: aload #4
      //   1184: iload #17
      //   1186: faload
      //   1187: fstore #11
      //   1189: goto -> 1588
      //   1192: iload_2
      //   1193: iconst_0
      //   1194: iadd
      //   1195: istore #17
      //   1197: aload #4
      //   1199: iload #17
      //   1201: faload
      //   1202: fstore #12
      //   1204: iload_2
      //   1205: iconst_1
      //   1206: iadd
      //   1207: istore #16
      //   1209: aload #4
      //   1211: iload #16
      //   1213: faload
      //   1214: fstore #11
      //   1216: iload_2
      //   1217: ifle -> 1237
      //   1220: aload_0
      //   1221: aload #4
      //   1223: iload #17
      //   1225: faload
      //   1226: aload #4
      //   1228: iload #16
      //   1230: faload
      //   1231: invokevirtual lineTo : (FF)V
      //   1234: goto -> 521
      //   1237: aload_0
      //   1238: aload #4
      //   1240: iload #17
      //   1242: faload
      //   1243: aload #4
      //   1245: iload #16
      //   1247: faload
      //   1248: invokevirtual moveTo : (FF)V
      //   1251: fload #11
      //   1253: fstore #5
      //   1255: fload #12
      //   1257: fstore #8
      //   1259: goto -> 2142
      //   1262: iload_2
      //   1263: iconst_0
      //   1264: iadd
      //   1265: istore #16
      //   1267: aload #4
      //   1269: iload #16
      //   1271: faload
      //   1272: fstore #12
      //   1274: iload_2
      //   1275: iconst_1
      //   1276: iadd
      //   1277: istore #17
      //   1279: aload_0
      //   1280: fload #12
      //   1282: aload #4
      //   1284: iload #17
      //   1286: faload
      //   1287: invokevirtual lineTo : (FF)V
      //   1290: aload #4
      //   1292: iload #16
      //   1294: faload
      //   1295: fstore #12
      //   1297: aload #4
      //   1299: iload #17
      //   1301: faload
      //   1302: fstore #11
      //   1304: goto -> 521
      //   1307: iload_2
      //   1308: iconst_0
      //   1309: iadd
      //   1310: istore #17
      //   1312: aload_0
      //   1313: fconst_0
      //   1314: aload #4
      //   1316: iload #17
      //   1318: faload
      //   1319: invokevirtual rLineTo : (FF)V
      //   1322: aload #4
      //   1324: iload #17
      //   1326: faload
      //   1327: fstore #10
      //   1329: goto -> 926
      //   1332: iload_2
      //   1333: iconst_0
      //   1334: iadd
      //   1335: istore #19
      //   1337: aload #4
      //   1339: iload #19
      //   1341: faload
      //   1342: fstore #10
      //   1344: iload_2
      //   1345: iconst_1
      //   1346: iadd
      //   1347: istore #16
      //   1349: aload #4
      //   1351: iload #16
      //   1353: faload
      //   1354: fstore #13
      //   1356: iload_2
      //   1357: iconst_2
      //   1358: iadd
      //   1359: istore #17
      //   1361: aload #4
      //   1363: iload #17
      //   1365: faload
      //   1366: fstore #14
      //   1368: iload_2
      //   1369: iconst_3
      //   1370: iadd
      //   1371: istore #18
      //   1373: aload_0
      //   1374: fload #10
      //   1376: fload #13
      //   1378: fload #14
      //   1380: aload #4
      //   1382: iload #18
      //   1384: faload
      //   1385: invokevirtual rQuadTo : (FFFF)V
      //   1388: aload #4
      //   1390: iload #19
      //   1392: faload
      //   1393: fload #12
      //   1395: fadd
      //   1396: fstore #9
      //   1398: aload #4
      //   1400: iload #16
      //   1402: faload
      //   1403: fload #11
      //   1405: fadd
      //   1406: fstore #13
      //   1408: fload #12
      //   1410: aload #4
      //   1412: iload #17
      //   1414: faload
      //   1415: fadd
      //   1416: fstore #14
      //   1418: aload #4
      //   1420: iload #18
      //   1422: faload
      //   1423: fstore #10
      //   1425: fload #9
      //   1427: fstore #12
      //   1429: goto -> 1577
      //   1432: iload_2
      //   1433: iconst_0
      //   1434: iadd
      //   1435: istore #17
      //   1437: aload_0
      //   1438: aload #4
      //   1440: iload #17
      //   1442: faload
      //   1443: fconst_0
      //   1444: invokevirtual rLineTo : (FF)V
      //   1447: fload #12
      //   1449: aload #4
      //   1451: iload #17
      //   1453: faload
      //   1454: fadd
      //   1455: fstore #12
      //   1457: goto -> 521
      //   1460: aload #4
      //   1462: iload_2
      //   1463: iconst_0
      //   1464: iadd
      //   1465: faload
      //   1466: fstore #7
      //   1468: aload #4
      //   1470: iload_2
      //   1471: iconst_1
      //   1472: iadd
      //   1473: faload
      //   1474: fstore #9
      //   1476: iload_2
      //   1477: iconst_2
      //   1478: iadd
      //   1479: istore #18
      //   1481: aload #4
      //   1483: iload #18
      //   1485: faload
      //   1486: fstore #14
      //   1488: iload_2
      //   1489: iconst_3
      //   1490: iadd
      //   1491: istore #17
      //   1493: aload #4
      //   1495: iload #17
      //   1497: faload
      //   1498: fstore #10
      //   1500: iload_2
      //   1501: iconst_4
      //   1502: iadd
      //   1503: istore #16
      //   1505: aload #4
      //   1507: iload #16
      //   1509: faload
      //   1510: fstore #13
      //   1512: iload_2
      //   1513: iconst_5
      //   1514: iadd
      //   1515: istore #19
      //   1517: aload_0
      //   1518: fload #7
      //   1520: fload #9
      //   1522: fload #14
      //   1524: fload #10
      //   1526: fload #13
      //   1528: aload #4
      //   1530: iload #19
      //   1532: faload
      //   1533: invokevirtual rCubicTo : (FFFFFF)V
      //   1536: aload #4
      //   1538: iload #18
      //   1540: faload
      //   1541: fload #12
      //   1543: fadd
      //   1544: fstore #9
      //   1546: aload #4
      //   1548: iload #17
      //   1550: faload
      //   1551: fload #11
      //   1553: fadd
      //   1554: fstore #13
      //   1556: fload #12
      //   1558: aload #4
      //   1560: iload #16
      //   1562: faload
      //   1563: fadd
      //   1564: fstore #14
      //   1566: aload #4
      //   1568: iload #19
      //   1570: faload
      //   1571: fstore #10
      //   1573: fload #9
      //   1575: fstore #12
      //   1577: fload #11
      //   1579: fload #10
      //   1581: fadd
      //   1582: fstore #11
      //   1584: fload #14
      //   1586: fstore #10
      //   1588: fload #13
      //   1590: fstore #14
      //   1592: fload #12
      //   1594: fstore #13
      //   1596: fload #10
      //   1598: fstore #12
      //   1600: goto -> 521
      //   1603: iload_2
      //   1604: iconst_5
      //   1605: iadd
      //   1606: istore #16
      //   1608: aload #4
      //   1610: iload #16
      //   1612: faload
      //   1613: fstore #7
      //   1615: iload_2
      //   1616: bipush #6
      //   1618: iadd
      //   1619: istore #17
      //   1621: aload #4
      //   1623: iload #17
      //   1625: faload
      //   1626: fstore #9
      //   1628: aload #4
      //   1630: iload_2
      //   1631: iconst_0
      //   1632: iadd
      //   1633: faload
      //   1634: fstore #13
      //   1636: aload #4
      //   1638: iload_2
      //   1639: iconst_1
      //   1640: iadd
      //   1641: faload
      //   1642: fstore #14
      //   1644: aload #4
      //   1646: iload_2
      //   1647: iconst_2
      //   1648: iadd
      //   1649: faload
      //   1650: fstore #10
      //   1652: aload #4
      //   1654: iload_2
      //   1655: iconst_3
      //   1656: iadd
      //   1657: faload
      //   1658: fconst_0
      //   1659: fcmpl
      //   1660: ifeq -> 1669
      //   1663: iconst_1
      //   1664: istore #20
      //   1666: goto -> 1672
      //   1669: iconst_0
      //   1670: istore #20
      //   1672: aload #4
      //   1674: iload_2
      //   1675: iconst_4
      //   1676: iadd
      //   1677: faload
      //   1678: fconst_0
      //   1679: fcmpl
      //   1680: ifeq -> 1689
      //   1683: iconst_1
      //   1684: istore #21
      //   1686: goto -> 1692
      //   1689: iconst_0
      //   1690: istore #21
      //   1692: aload_0
      //   1693: fload #12
      //   1695: fload #11
      //   1697: fload #7
      //   1699: fload #12
      //   1701: fadd
      //   1702: fload #9
      //   1704: fload #11
      //   1706: fadd
      //   1707: fload #13
      //   1709: fload #14
      //   1711: fload #10
      //   1713: iload #20
      //   1715: iload #21
      //   1717: invokestatic c : (Landroid/graphics/Path;FFFFFFFZZ)V
      //   1720: fload #12
      //   1722: aload #4
      //   1724: iload #16
      //   1726: faload
      //   1727: fadd
      //   1728: fstore #12
      //   1730: fload #11
      //   1732: aload #4
      //   1734: iload #17
      //   1736: faload
      //   1737: fadd
      //   1738: fstore #11
      //   1740: goto -> 2134
      //   1743: iload_2
      //   1744: iconst_0
      //   1745: iadd
      //   1746: istore #17
      //   1748: aload_0
      //   1749: fload #12
      //   1751: aload #4
      //   1753: iload #17
      //   1755: faload
      //   1756: invokevirtual lineTo : (FF)V
      //   1759: aload #4
      //   1761: iload #17
      //   1763: faload
      //   1764: fstore #11
      //   1766: goto -> 2142
      //   1769: iload_2
      //   1770: istore #17
      //   1772: iload #17
      //   1774: iconst_0
      //   1775: iadd
      //   1776: istore #16
      //   1778: aload #4
      //   1780: iload #16
      //   1782: faload
      //   1783: fstore #12
      //   1785: iload #17
      //   1787: iconst_1
      //   1788: iadd
      //   1789: istore #18
      //   1791: aload #4
      //   1793: iload #18
      //   1795: faload
      //   1796: fstore #13
      //   1798: iload #17
      //   1800: iconst_2
      //   1801: iadd
      //   1802: istore #19
      //   1804: aload #4
      //   1806: iload #19
      //   1808: faload
      //   1809: fstore #11
      //   1811: iinc #17, 3
      //   1814: aload_0
      //   1815: fload #12
      //   1817: fload #13
      //   1819: fload #11
      //   1821: aload #4
      //   1823: iload #17
      //   1825: faload
      //   1826: invokevirtual quadTo : (FFFF)V
      //   1829: aload #4
      //   1831: iload #16
      //   1833: faload
      //   1834: fstore #13
      //   1836: aload #4
      //   1838: iload #18
      //   1840: faload
      //   1841: fstore #14
      //   1843: aload #4
      //   1845: iload #19
      //   1847: faload
      //   1848: fstore #12
      //   1850: aload #4
      //   1852: iload #17
      //   1854: faload
      //   1855: fstore #11
      //   1857: goto -> 2142
      //   1860: iload_2
      //   1861: iconst_0
      //   1862: iadd
      //   1863: istore #17
      //   1865: aload_0
      //   1866: aload #4
      //   1868: iload #17
      //   1870: faload
      //   1871: fload #11
      //   1873: invokevirtual lineTo : (FF)V
      //   1876: aload #4
      //   1878: iload #17
      //   1880: faload
      //   1881: fstore #12
      //   1883: goto -> 2142
      //   1886: iload_2
      //   1887: istore #17
      //   1889: aload #4
      //   1891: iload #17
      //   1893: iconst_0
      //   1894: iadd
      //   1895: faload
      //   1896: fstore #14
      //   1898: aload #4
      //   1900: iload #17
      //   1902: iconst_1
      //   1903: iadd
      //   1904: faload
      //   1905: fstore #10
      //   1907: iload #17
      //   1909: iconst_2
      //   1910: iadd
      //   1911: istore #16
      //   1913: aload #4
      //   1915: iload #16
      //   1917: faload
      //   1918: fstore #11
      //   1920: iload #17
      //   1922: iconst_3
      //   1923: iadd
      //   1924: istore #18
      //   1926: aload #4
      //   1928: iload #18
      //   1930: faload
      //   1931: fstore #13
      //   1933: iload #17
      //   1935: iconst_4
      //   1936: iadd
      //   1937: istore #19
      //   1939: aload #4
      //   1941: iload #19
      //   1943: faload
      //   1944: fstore #12
      //   1946: iinc #17, 5
      //   1949: aload_0
      //   1950: fload #14
      //   1952: fload #10
      //   1954: fload #11
      //   1956: fload #13
      //   1958: fload #12
      //   1960: aload #4
      //   1962: iload #17
      //   1964: faload
      //   1965: invokevirtual cubicTo : (FFFFFF)V
      //   1968: aload #4
      //   1970: iload #19
      //   1972: faload
      //   1973: fstore #12
      //   1975: aload #4
      //   1977: iload #17
      //   1979: faload
      //   1980: fstore #11
      //   1982: aload #4
      //   1984: iload #16
      //   1986: faload
      //   1987: fstore #13
      //   1989: aload #4
      //   1991: iload #18
      //   1993: faload
      //   1994: fstore #14
      //   1996: goto -> 2142
      //   1999: iload_2
      //   2000: istore #17
      //   2002: iload #17
      //   2004: iconst_5
      //   2005: iadd
      //   2006: istore #16
      //   2008: aload #4
      //   2010: iload #16
      //   2012: faload
      //   2013: fstore #13
      //   2015: iload #17
      //   2017: bipush #6
      //   2019: iadd
      //   2020: istore #18
      //   2022: aload #4
      //   2024: iload #18
      //   2026: faload
      //   2027: fstore #14
      //   2029: aload #4
      //   2031: iload #17
      //   2033: iconst_0
      //   2034: iadd
      //   2035: faload
      //   2036: fstore #9
      //   2038: aload #4
      //   2040: iload #17
      //   2042: iconst_1
      //   2043: iadd
      //   2044: faload
      //   2045: fstore #10
      //   2047: aload #4
      //   2049: iload #17
      //   2051: iconst_2
      //   2052: iadd
      //   2053: faload
      //   2054: fstore #7
      //   2056: aload #4
      //   2058: iload #17
      //   2060: iconst_3
      //   2061: iadd
      //   2062: faload
      //   2063: fconst_0
      //   2064: fcmpl
      //   2065: ifeq -> 2074
      //   2068: iconst_1
      //   2069: istore #20
      //   2071: goto -> 2077
      //   2074: iconst_0
      //   2075: istore #20
      //   2077: aload #4
      //   2079: iload #17
      //   2081: iconst_4
      //   2082: iadd
      //   2083: faload
      //   2084: fconst_0
      //   2085: fcmpl
      //   2086: ifeq -> 2095
      //   2089: iconst_1
      //   2090: istore #21
      //   2092: goto -> 2098
      //   2095: iconst_0
      //   2096: istore #21
      //   2098: aload_0
      //   2099: fload #12
      //   2101: fload #11
      //   2103: fload #13
      //   2105: fload #14
      //   2107: fload #9
      //   2109: fload #10
      //   2111: fload #7
      //   2113: iload #20
      //   2115: iload #21
      //   2117: invokestatic c : (Landroid/graphics/Path;FFFFFFFZZ)V
      //   2120: aload #4
      //   2122: iload #16
      //   2124: faload
      //   2125: fstore #12
      //   2127: aload #4
      //   2129: iload #18
      //   2131: faload
      //   2132: fstore #11
      //   2134: fload #11
      //   2136: fstore #14
      //   2138: fload #12
      //   2140: fstore #13
      //   2142: iload_2
      //   2143: iload #15
      //   2145: iadd
      //   2146: istore_2
      //   2147: iload_3
      //   2148: istore #17
      //   2150: goto -> 385
      //   2153: aload_1
      //   2154: iconst_0
      //   2155: fload #12
      //   2157: fastore
      //   2158: aload_1
      //   2159: iconst_1
      //   2160: fload #11
      //   2162: fastore
      //   2163: aload_1
      //   2164: iconst_2
      //   2165: fload #13
      //   2167: fastore
      //   2168: aload_1
      //   2169: iconst_3
      //   2170: fload #14
      //   2172: fastore
      //   2173: aload_1
      //   2174: iconst_4
      //   2175: fload #8
      //   2177: fastore
      //   2178: aload_1
      //   2179: iconst_5
      //   2180: fload #5
      //   2182: fastore
      //   2183: return
    }
    
    private static void b(Path param1Path, double param1Double1, double param1Double2, double param1Double3, double param1Double4, double param1Double5, double param1Double6, double param1Double7, double param1Double8, double param1Double9) {
      int i = (int)Math.ceil(Math.abs(param1Double9 * 4.0D / Math.PI));
      double d1 = Math.cos(param1Double7);
      double d2 = Math.sin(param1Double7);
      double d3 = Math.cos(param1Double8);
      double d4 = Math.sin(param1Double8);
      param1Double7 = -param1Double3;
      double d5 = param1Double7 * d1;
      double d6 = param1Double4 * d2;
      param1Double7 *= d2;
      double d7 = param1Double4 * d1;
      param1Double4 = i;
      Double.isNaN(param1Double4);
      double d8 = param1Double9 / param1Double4;
      double d9 = param1Double8;
      double d10 = d4 * param1Double7 + d3 * d7;
      param1Double8 = d5 * d4 - d6 * d3;
      byte b1 = 0;
      d4 = param1Double6;
      param1Double4 = param1Double7;
      param1Double9 = param1Double5;
      param1Double7 = d8;
      param1Double6 = d2;
      param1Double5 = d1;
      while (true) {
        d1 = param1Double3;
        if (b1 < i) {
          d8 = d9 + param1Double7;
          d3 = Math.sin(d8);
          double d11 = Math.cos(d8);
          double d12 = param1Double1 + d1 * param1Double5 * d11 - d6 * d3;
          d1 = param1Double2 + d1 * param1Double6 * d11 + d7 * d3;
          d2 = d5 * d3 - d6 * d11;
          d3 = d3 * param1Double4 + d11 * d7;
          d11 = d8 - d9;
          d9 = Math.tan(d11 / 2.0D);
          d9 = Math.sin(d11) * (Math.sqrt(d9 * 3.0D * d9 + 4.0D) - 1.0D) / 3.0D;
          param1Path.rLineTo(0.0F, 0.0F);
          param1Path.cubicTo((float)(param1Double9 + param1Double8 * d9), (float)(d4 + d10 * d9), (float)(d12 - d9 * d2), (float)(d1 - d9 * d3), (float)d12, (float)d1);
          b1++;
          param1Double9 = d12;
          d9 = d8;
          d10 = d3;
          param1Double8 = d2;
          d4 = d1;
          continue;
        } 
        break;
      } 
    }
    
    private static void c(Path param1Path, float param1Float1, float param1Float2, float param1Float3, float param1Float4, float param1Float5, float param1Float6, float param1Float7, boolean param1Boolean1, boolean param1Boolean2) {
      double d1 = Math.toRadians(param1Float7);
      double d2 = Math.cos(d1);
      double d3 = Math.sin(d1);
      double d4 = param1Float1;
      Double.isNaN(d4);
      double d5 = param1Float2;
      Double.isNaN(d5);
      double d6 = param1Float5;
      Double.isNaN(d6);
      double d7 = (d4 * d2 + d5 * d3) / d6;
      double d8 = -param1Float1;
      Double.isNaN(d8);
      Double.isNaN(d5);
      double d9 = param1Float6;
      Double.isNaN(d9);
      double d10 = (d8 * d3 + d5 * d2) / d9;
      double d11 = param1Float3;
      Double.isNaN(d11);
      d8 = param1Float4;
      Double.isNaN(d8);
      Double.isNaN(d6);
      double d12 = (d11 * d2 + d8 * d3) / d6;
      d11 = -param1Float3;
      Double.isNaN(d11);
      Double.isNaN(d8);
      Double.isNaN(d9);
      double d13 = (d11 * d3 + d8 * d2) / d9;
      double d14 = d7 - d12;
      double d15 = d10 - d13;
      d11 = (d7 + d12) / 2.0D;
      d8 = (d10 + d13) / 2.0D;
      double d16 = d14 * d14 + d15 * d15;
      if (d16 == 0.0D) {
        Log.w("PathParser", " Points are coincident");
        return;
      } 
      double d17 = 1.0D / d16 - 0.25D;
      if (d17 < 0.0D) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Points are too far apart ");
        stringBuilder.append(d16);
        Log.w("PathParser", stringBuilder.toString());
        float f = (float)(Math.sqrt(d16) / 1.99999D);
        c(param1Path, param1Float1, param1Float2, param1Float3, param1Float4, param1Float5 * f, param1Float6 * f, param1Float7, param1Boolean1, param1Boolean2);
        return;
      } 
      d17 = Math.sqrt(d17);
      d14 *= d17;
      d15 = d17 * d15;
      if (param1Boolean1 == param1Boolean2) {
        d11 -= d15;
        d8 += d14;
      } else {
        d11 += d15;
        d8 -= d14;
      } 
      d15 = Math.atan2(d10 - d8, d7 - d11);
      d10 = Math.atan2(d13 - d8, d12 - d11) - d15;
      if (d10 >= 0.0D) {
        param1Boolean1 = true;
      } else {
        param1Boolean1 = false;
      } 
      d7 = d10;
      if (param1Boolean2 != param1Boolean1)
        if (d10 > 0.0D) {
          d7 = d10 - 6.283185307179586D;
        } else {
          d7 = d10 + 6.283185307179586D;
        }  
      Double.isNaN(d6);
      d11 *= d6;
      Double.isNaN(d9);
      d8 *= d9;
      b(param1Path, d11 * d2 - d8 * d3, d11 * d3 + d8 * d2, d6, d9, d4, d5, d1, d15, d7);
    }
    
    public static void e(b[] param1ArrayOfb, Path param1Path) {
      float[] arrayOfFloat = new float[6];
      char c1 = 'm';
      byte b1 = 0;
      char c2;
      for (c2 = c1; b1 < param1ArrayOfb.length; c2 = c1) {
        a(param1Path, arrayOfFloat, c2, (param1ArrayOfb[b1]).a, (param1ArrayOfb[b1]).b);
        c1 = (param1ArrayOfb[b1]).a;
        b1++;
      } 
    }
    
    public void d(b param1b1, b param1b2, float param1Float) {
      this.a = (char)param1b1.a;
      byte b1 = 0;
      while (true) {
        float[] arrayOfFloat = param1b1.b;
        if (b1 < arrayOfFloat.length) {
          this.b[b1] = arrayOfFloat[b1] * (1.0F - param1Float) + param1b2.b[b1] * param1Float;
          b1++;
          continue;
        } 
        break;
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */