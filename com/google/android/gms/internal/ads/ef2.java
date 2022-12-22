package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class ef2 {
  public float A = -1.0F;
  
  public float B = -1.0F;
  
  public float C = -1.0F;
  
  public float D = -1.0F;
  
  public float E = -1.0F;
  
  public float F = -1.0F;
  
  public int G = 1;
  
  public int H = -1;
  
  public int I = 8000;
  
  public long J = 0L;
  
  public long K = 0L;
  
  public boolean L;
  
  public boolean M = true;
  
  private String N = "eng";
  
  public ue2 O;
  
  public int P;
  
  public String a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public boolean e;
  
  public byte[] f;
  
  public xe2 g;
  
  public byte[] h;
  
  public zzjo i;
  
  public int j = -1;
  
  public int k = -1;
  
  public int l = -1;
  
  public int m = -1;
  
  public int n = 0;
  
  public byte[] o = null;
  
  public int p = -1;
  
  public boolean q = false;
  
  public int r = -1;
  
  public int s = -1;
  
  public int t = -1;
  
  public int u = 1000;
  
  public int v = 200;
  
  public float w = -1.0F;
  
  public float x = -1.0F;
  
  public float y = -1.0F;
  
  public float z = -1.0F;
  
  private ef2() {}
  
  private static List<byte[]> b(qj2 paramqj2) {
    try {
      paramqj2.m(16);
      if (paramqj2.t() != 826496599L)
        return null; 
      int i = paramqj2.b() + 20;
      byte[] arrayOfByte = paramqj2.a;
      while (i < arrayOfByte.length - 4) {
        if (arrayOfByte[i] == 0 && arrayOfByte[i + 1] == 0 && arrayOfByte[i + 2] == 1 && arrayOfByte[i + 3] == 15)
          return (List)Collections.singletonList(Arrays.copyOfRange(arrayOfByte, i, arrayOfByte.length)); 
        i++;
      } 
      zzhw zzhw = new zzhw();
      this("Failed to find FourCC VC1 initialization data");
      throw zzhw;
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      zzhw zzhw = new zzhw("Error parsing FourCC VC1 codec private");
      throw zzhw;
    } 
  }
  
  private static boolean d(qj2 paramqj2) {
    try {
      int i = paramqj2.r();
      if (i == 1)
        return true; 
      if (i == 65534) {
        paramqj2.l(24);
        if (paramqj2.e() == df2.u().getMostSignificantBits()) {
          long l1 = paramqj2.e();
          long l2 = df2.u().getLeastSignificantBits();
          if (l1 == l2)
            return true; 
        } 
      } 
      return false;
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw new zzhw("Error parsing MS/ACM codec private");
    } 
  }
  
  private static List<byte[]> e(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte[0] == 2) {
      int i = 1;
      int j = 0;
      while (paramArrayOfbyte[i] == -1) {
        j += true;
        i++;
      } 
      int k = i + 1;
      int m = j + paramArrayOfbyte[i];
      j = 0;
      for (i = k; paramArrayOfbyte[i] == -1; i++)
        j += 255; 
      k = i + 1;
      i = paramArrayOfbyte[i];
      if (paramArrayOfbyte[k] == 1)
        try {
          byte[] arrayOfByte = new byte[m];
          System.arraycopy(paramArrayOfbyte, k, arrayOfByte, 0, m);
          k += m;
          if (paramArrayOfbyte[k] == 3) {
            j = k + j + i;
            if (paramArrayOfbyte[j] == 5) {
              byte[] arrayOfByte1 = new byte[paramArrayOfbyte.length - j];
              System.arraycopy(paramArrayOfbyte, j, arrayOfByte1, 0, paramArrayOfbyte.length - j);
              ArrayList<byte[]> arrayList = new ArrayList();
              this(2);
              arrayList.add(arrayOfByte);
              arrayList.add(arrayOfByte1);
              return (List<byte[]>)arrayList;
            } 
            zzhw zzhw3 = new zzhw();
            this("Error parsing vorbis codec private");
            throw zzhw3;
          } 
          zzhw zzhw2 = new zzhw();
          this("Error parsing vorbis codec private");
          throw zzhw2;
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
          zzhw zzhw2 = new zzhw("Error parsing vorbis codec private");
          throw zzhw2;
        }  
      zzhw zzhw1 = new zzhw();
      this("Error parsing vorbis codec private");
      throw zzhw1;
    } 
    zzhw zzhw = new zzhw();
    this("Error parsing vorbis codec private");
    throw zzhw;
  }
  
  public final void c(pe2 parampe2, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Ljava/lang/String;
    //   4: astore_3
    //   5: aload_3
    //   6: invokevirtual hashCode : ()I
    //   9: pop
    //   10: aload_3
    //   11: invokevirtual hashCode : ()I
    //   14: istore #4
    //   16: iconst_1
    //   17: istore #5
    //   19: iload #4
    //   21: lookupswitch default -> 256, -2095576542 -> 779, -2095575984 -> 760, -1985379776 -> 741, -1784763192 -> 722, -1730367663 -> 703, -1482641358 -> 684, -1482641357 -> 664, -1373388978 -> 644, -933872740 -> 624, -538363189 -> 604, -538363109 -> 585, -425012669 -> 566, -356037306 -> 547, 62923557 -> 528, 62923603 -> 509, 62927045 -> 490, 82338133 -> 471, 82338134 -> 452, 99146302 -> 433, 444813526 -> 414, 542569478 -> 395, 725957860 -> 376, 855502857 -> 357, 1422270023 -> 338, 1809237540 -> 319, 1950749482 -> 300, 1950789798 -> 281, 1951062397 -> 262
    //   256: iconst_m1
    //   257: istore #4
    //   259: goto -> 795
    //   262: aload_3
    //   263: ldc 'A_OPUS'
    //   265: invokevirtual equals : (Ljava/lang/Object;)Z
    //   268: ifne -> 274
    //   271: goto -> 256
    //   274: bipush #27
    //   276: istore #4
    //   278: goto -> 795
    //   281: aload_3
    //   282: ldc 'A_FLAC'
    //   284: invokevirtual equals : (Ljava/lang/Object;)Z
    //   287: ifne -> 293
    //   290: goto -> 256
    //   293: bipush #26
    //   295: istore #4
    //   297: goto -> 795
    //   300: aload_3
    //   301: ldc 'A_EAC3'
    //   303: invokevirtual equals : (Ljava/lang/Object;)Z
    //   306: ifne -> 312
    //   309: goto -> 256
    //   312: bipush #25
    //   314: istore #4
    //   316: goto -> 795
    //   319: aload_3
    //   320: ldc 'V_MPEG2'
    //   322: invokevirtual equals : (Ljava/lang/Object;)Z
    //   325: ifne -> 331
    //   328: goto -> 256
    //   331: bipush #24
    //   333: istore #4
    //   335: goto -> 795
    //   338: aload_3
    //   339: ldc 'S_TEXT/UTF8'
    //   341: invokevirtual equals : (Ljava/lang/Object;)Z
    //   344: ifne -> 350
    //   347: goto -> 256
    //   350: bipush #23
    //   352: istore #4
    //   354: goto -> 795
    //   357: aload_3
    //   358: ldc 'V_MPEGH/ISO/HEVC'
    //   360: invokevirtual equals : (Ljava/lang/Object;)Z
    //   363: ifne -> 369
    //   366: goto -> 256
    //   369: bipush #22
    //   371: istore #4
    //   373: goto -> 795
    //   376: aload_3
    //   377: ldc 'A_PCM/INT/LIT'
    //   379: invokevirtual equals : (Ljava/lang/Object;)Z
    //   382: ifne -> 388
    //   385: goto -> 256
    //   388: bipush #21
    //   390: istore #4
    //   392: goto -> 795
    //   395: aload_3
    //   396: ldc 'A_DTS/EXPRESS'
    //   398: invokevirtual equals : (Ljava/lang/Object;)Z
    //   401: ifne -> 407
    //   404: goto -> 256
    //   407: bipush #20
    //   409: istore #4
    //   411: goto -> 795
    //   414: aload_3
    //   415: ldc 'V_THEORA'
    //   417: invokevirtual equals : (Ljava/lang/Object;)Z
    //   420: ifne -> 426
    //   423: goto -> 256
    //   426: bipush #19
    //   428: istore #4
    //   430: goto -> 795
    //   433: aload_3
    //   434: ldc 'S_HDMV/PGS'
    //   436: invokevirtual equals : (Ljava/lang/Object;)Z
    //   439: ifne -> 445
    //   442: goto -> 256
    //   445: bipush #18
    //   447: istore #4
    //   449: goto -> 795
    //   452: aload_3
    //   453: ldc 'V_VP9'
    //   455: invokevirtual equals : (Ljava/lang/Object;)Z
    //   458: ifne -> 464
    //   461: goto -> 256
    //   464: bipush #17
    //   466: istore #4
    //   468: goto -> 795
    //   471: aload_3
    //   472: ldc 'V_VP8'
    //   474: invokevirtual equals : (Ljava/lang/Object;)Z
    //   477: ifne -> 483
    //   480: goto -> 256
    //   483: bipush #16
    //   485: istore #4
    //   487: goto -> 795
    //   490: aload_3
    //   491: ldc 'A_DTS'
    //   493: invokevirtual equals : (Ljava/lang/Object;)Z
    //   496: ifne -> 502
    //   499: goto -> 256
    //   502: bipush #15
    //   504: istore #4
    //   506: goto -> 795
    //   509: aload_3
    //   510: ldc 'A_AC3'
    //   512: invokevirtual equals : (Ljava/lang/Object;)Z
    //   515: ifne -> 521
    //   518: goto -> 256
    //   521: bipush #14
    //   523: istore #4
    //   525: goto -> 795
    //   528: aload_3
    //   529: ldc 'A_AAC'
    //   531: invokevirtual equals : (Ljava/lang/Object;)Z
    //   534: ifne -> 540
    //   537: goto -> 256
    //   540: bipush #13
    //   542: istore #4
    //   544: goto -> 795
    //   547: aload_3
    //   548: ldc 'A_DTS/LOSSLESS'
    //   550: invokevirtual equals : (Ljava/lang/Object;)Z
    //   553: ifne -> 559
    //   556: goto -> 256
    //   559: bipush #12
    //   561: istore #4
    //   563: goto -> 795
    //   566: aload_3
    //   567: ldc 'S_VOBSUB'
    //   569: invokevirtual equals : (Ljava/lang/Object;)Z
    //   572: ifne -> 578
    //   575: goto -> 256
    //   578: bipush #11
    //   580: istore #4
    //   582: goto -> 795
    //   585: aload_3
    //   586: ldc 'V_MPEG4/ISO/AVC'
    //   588: invokevirtual equals : (Ljava/lang/Object;)Z
    //   591: ifne -> 597
    //   594: goto -> 256
    //   597: bipush #10
    //   599: istore #4
    //   601: goto -> 795
    //   604: aload_3
    //   605: ldc_w 'V_MPEG4/ISO/ASP'
    //   608: invokevirtual equals : (Ljava/lang/Object;)Z
    //   611: ifne -> 617
    //   614: goto -> 256
    //   617: bipush #9
    //   619: istore #4
    //   621: goto -> 795
    //   624: aload_3
    //   625: ldc_w 'S_DVBSUB'
    //   628: invokevirtual equals : (Ljava/lang/Object;)Z
    //   631: ifne -> 637
    //   634: goto -> 256
    //   637: bipush #8
    //   639: istore #4
    //   641: goto -> 795
    //   644: aload_3
    //   645: ldc_w 'V_MS/VFW/FOURCC'
    //   648: invokevirtual equals : (Ljava/lang/Object;)Z
    //   651: ifne -> 657
    //   654: goto -> 256
    //   657: bipush #7
    //   659: istore #4
    //   661: goto -> 795
    //   664: aload_3
    //   665: ldc_w 'A_MPEG/L3'
    //   668: invokevirtual equals : (Ljava/lang/Object;)Z
    //   671: ifne -> 677
    //   674: goto -> 256
    //   677: bipush #6
    //   679: istore #4
    //   681: goto -> 795
    //   684: aload_3
    //   685: ldc_w 'A_MPEG/L2'
    //   688: invokevirtual equals : (Ljava/lang/Object;)Z
    //   691: ifne -> 697
    //   694: goto -> 256
    //   697: iconst_5
    //   698: istore #4
    //   700: goto -> 795
    //   703: aload_3
    //   704: ldc_w 'A_VORBIS'
    //   707: invokevirtual equals : (Ljava/lang/Object;)Z
    //   710: ifne -> 716
    //   713: goto -> 256
    //   716: iconst_4
    //   717: istore #4
    //   719: goto -> 795
    //   722: aload_3
    //   723: ldc_w 'A_TRUEHD'
    //   726: invokevirtual equals : (Ljava/lang/Object;)Z
    //   729: ifne -> 735
    //   732: goto -> 256
    //   735: iconst_3
    //   736: istore #4
    //   738: goto -> 795
    //   741: aload_3
    //   742: ldc_w 'A_MS/ACM'
    //   745: invokevirtual equals : (Ljava/lang/Object;)Z
    //   748: ifne -> 754
    //   751: goto -> 256
    //   754: iconst_2
    //   755: istore #4
    //   757: goto -> 795
    //   760: aload_3
    //   761: ldc_w 'V_MPEG4/ISO/SP'
    //   764: invokevirtual equals : (Ljava/lang/Object;)Z
    //   767: ifne -> 773
    //   770: goto -> 256
    //   773: iconst_1
    //   774: istore #4
    //   776: goto -> 795
    //   779: aload_3
    //   780: ldc_w 'V_MPEG4/ISO/AP'
    //   783: invokevirtual equals : (Ljava/lang/Object;)Z
    //   786: ifne -> 792
    //   789: goto -> 256
    //   792: iconst_0
    //   793: istore #4
    //   795: ldc_w 'audio/raw'
    //   798: astore #6
    //   800: iload #4
    //   802: tableswitch default -> 928, 0 -> 1635, 1 -> 1635, 2 -> 1488, 3 -> 1481, 4 -> 1457, 5 -> 1439, 6 -> 1431, 7 -> 1386, 8 -> 1342, 9 -> 1635, 10 -> 1306, 11 -> 1290, 12 -> 1283, 13 -> 1267, 14 -> 1260, 15 -> 1253, 16 -> 1227, 17 -> 1220, 18 -> 1210, 19 -> 1203, 20 -> 1253, 21 -> 1104, 22 -> 1068, 23 -> 1061, 24 -> 1054, 25 -> 1047, 26 -> 1031, 27 -> 939
    //   928: new com/google/android/gms/internal/ads/zzhw
    //   931: dup
    //   932: ldc_w 'Unrecognized codec identifier.'
    //   935: invokespecial <init> : (Ljava/lang/String;)V
    //   938: athrow
    //   939: new java/util/ArrayList
    //   942: dup
    //   943: iconst_3
    //   944: invokespecial <init> : (I)V
    //   947: astore_3
    //   948: aload_3
    //   949: aload_0
    //   950: getfield h : [B
    //   953: invokeinterface add : (Ljava/lang/Object;)Z
    //   958: pop
    //   959: aload_3
    //   960: bipush #8
    //   962: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   965: invokestatic nativeOrder : ()Ljava/nio/ByteOrder;
    //   968: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   971: aload_0
    //   972: getfield J : J
    //   975: invokevirtual putLong : (J)Ljava/nio/ByteBuffer;
    //   978: invokevirtual array : ()[B
    //   981: invokeinterface add : (Ljava/lang/Object;)Z
    //   986: pop
    //   987: aload_3
    //   988: bipush #8
    //   990: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   993: invokestatic nativeOrder : ()Ljava/nio/ByteOrder;
    //   996: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   999: aload_0
    //   1000: getfield K : J
    //   1003: invokevirtual putLong : (J)Ljava/nio/ByteBuffer;
    //   1006: invokevirtual array : ()[B
    //   1009: invokeinterface add : (Ljava/lang/Object;)Z
    //   1014: pop
    //   1015: ldc_w 'audio/opus'
    //   1018: astore #7
    //   1020: iconst_m1
    //   1021: istore #8
    //   1023: sipush #5760
    //   1026: istore #4
    //   1028: goto -> 1663
    //   1031: aload_0
    //   1032: getfield h : [B
    //   1035: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   1038: astore #7
    //   1040: ldc_w 'audio/x-flac'
    //   1043: astore_3
    //   1044: goto -> 1234
    //   1047: ldc_w 'audio/eac3'
    //   1050: astore_3
    //   1051: goto -> 1231
    //   1054: ldc_w 'video/mpeg2'
    //   1057: astore_3
    //   1058: goto -> 1231
    //   1061: ldc_w 'application/x-subrip'
    //   1064: astore_3
    //   1065: goto -> 1231
    //   1068: new com/google/android/gms/internal/ads/qj2
    //   1071: dup
    //   1072: aload_0
    //   1073: getfield h : [B
    //   1076: invokespecial <init> : ([B)V
    //   1079: invokestatic a : (Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/dk2;
    //   1082: astore_3
    //   1083: aload_3
    //   1084: getfield a : Ljava/util/List;
    //   1087: astore #7
    //   1089: aload_0
    //   1090: aload_3
    //   1091: getfield b : I
    //   1094: putfield P : I
    //   1097: ldc_w 'video/hevc'
    //   1100: astore_3
    //   1101: goto -> 1339
    //   1104: aload_0
    //   1105: getfield H : I
    //   1108: invokestatic m : (I)I
    //   1111: istore #8
    //   1113: iload #8
    //   1115: istore #4
    //   1117: iload #8
    //   1119: ifne -> 1194
    //   1122: aload_0
    //   1123: getfield H : I
    //   1126: istore #4
    //   1128: new java/lang/StringBuilder
    //   1131: dup
    //   1132: ldc_w 'audio/x-unknown'
    //   1135: invokevirtual length : ()I
    //   1138: bipush #60
    //   1140: iadd
    //   1141: invokespecial <init> : (I)V
    //   1144: astore_3
    //   1145: aload_3
    //   1146: ldc_w 'Unsupported PCM bit depth: '
    //   1149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1152: pop
    //   1153: aload_3
    //   1154: iload #4
    //   1156: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1159: pop
    //   1160: aload_3
    //   1161: ldc_w '. Setting mimeType to '
    //   1164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1167: pop
    //   1168: aload_3
    //   1169: ldc_w 'audio/x-unknown'
    //   1172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1175: pop
    //   1176: ldc_w 'MatroskaExtractor'
    //   1179: aload_3
    //   1180: invokevirtual toString : ()Ljava/lang/String;
    //   1183: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   1186: pop
    //   1187: ldc_w 'audio/x-unknown'
    //   1190: astore_3
    //   1191: goto -> 1231
    //   1194: aconst_null
    //   1195: astore_3
    //   1196: iload #4
    //   1198: istore #8
    //   1200: goto -> 1243
    //   1203: ldc_w 'video/x-unknown'
    //   1206: astore_3
    //   1207: goto -> 1231
    //   1210: aconst_null
    //   1211: astore #7
    //   1213: ldc_w 'application/pgs'
    //   1216: astore_3
    //   1217: goto -> 1234
    //   1220: ldc_w 'video/x-vnd.on2.vp9'
    //   1223: astore_3
    //   1224: goto -> 1231
    //   1227: ldc_w 'video/x-vnd.on2.vp8'
    //   1230: astore_3
    //   1231: aconst_null
    //   1232: astore #7
    //   1234: iconst_m1
    //   1235: istore #8
    //   1237: aload_3
    //   1238: astore #6
    //   1240: aload #7
    //   1242: astore_3
    //   1243: iconst_m1
    //   1244: istore #4
    //   1246: aload #6
    //   1248: astore #7
    //   1250: goto -> 1663
    //   1253: ldc_w 'audio/vnd.dts'
    //   1256: astore_3
    //   1257: goto -> 1231
    //   1260: ldc_w 'audio/ac3'
    //   1263: astore_3
    //   1264: goto -> 1231
    //   1267: aload_0
    //   1268: getfield h : [B
    //   1271: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   1274: astore #7
    //   1276: ldc_w 'audio/mp4a-latm'
    //   1279: astore_3
    //   1280: goto -> 1234
    //   1283: ldc_w 'audio/vnd.dts.hd'
    //   1286: astore_3
    //   1287: goto -> 1231
    //   1290: aload_0
    //   1291: getfield h : [B
    //   1294: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   1297: astore #7
    //   1299: ldc_w 'application/vobsub'
    //   1302: astore_3
    //   1303: goto -> 1234
    //   1306: new com/google/android/gms/internal/ads/qj2
    //   1309: dup
    //   1310: aload_0
    //   1311: getfield h : [B
    //   1314: invokespecial <init> : ([B)V
    //   1317: invokestatic a : (Lcom/google/android/gms/internal/ads/qj2;)Lcom/google/android/gms/internal/ads/yj2;
    //   1320: astore_3
    //   1321: aload_3
    //   1322: getfield a : Ljava/util/List;
    //   1325: astore #7
    //   1327: aload_0
    //   1328: aload_3
    //   1329: getfield b : I
    //   1332: putfield P : I
    //   1335: ldc_w 'video/avc'
    //   1338: astore_3
    //   1339: goto -> 1234
    //   1342: aload_0
    //   1343: getfield h : [B
    //   1346: astore_3
    //   1347: iconst_4
    //   1348: newarray byte
    //   1350: dup
    //   1351: iconst_0
    //   1352: aload_3
    //   1353: iconst_0
    //   1354: baload
    //   1355: bastore
    //   1356: dup
    //   1357: iconst_1
    //   1358: aload_3
    //   1359: iconst_1
    //   1360: baload
    //   1361: bastore
    //   1362: dup
    //   1363: iconst_2
    //   1364: aload_3
    //   1365: iconst_2
    //   1366: baload
    //   1367: bastore
    //   1368: dup
    //   1369: iconst_3
    //   1370: aload_3
    //   1371: iconst_3
    //   1372: baload
    //   1373: bastore
    //   1374: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   1377: astore #7
    //   1379: ldc_w 'application/dvbsubs'
    //   1382: astore_3
    //   1383: goto -> 1234
    //   1386: new com/google/android/gms/internal/ads/qj2
    //   1389: dup
    //   1390: aload_0
    //   1391: getfield h : [B
    //   1394: invokespecial <init> : ([B)V
    //   1397: invokestatic b : (Lcom/google/android/gms/internal/ads/qj2;)Ljava/util/List;
    //   1400: astore #7
    //   1402: aload #7
    //   1404: ifnull -> 1414
    //   1407: ldc_w 'video/wvc1'
    //   1410: astore_3
    //   1411: goto -> 1234
    //   1414: ldc_w 'MatroskaExtractor'
    //   1417: ldc_w 'Unsupported FourCC. Setting mimeType to video/x-unknown'
    //   1420: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   1423: pop
    //   1424: ldc_w 'video/x-unknown'
    //   1427: astore_3
    //   1428: goto -> 1234
    //   1431: ldc_w 'audio/mpeg'
    //   1434: astore #7
    //   1436: goto -> 1444
    //   1439: ldc_w 'audio/mpeg-L2'
    //   1442: astore #7
    //   1444: aconst_null
    //   1445: astore_3
    //   1446: iconst_m1
    //   1447: istore #8
    //   1449: sipush #4096
    //   1452: istore #4
    //   1454: goto -> 1663
    //   1457: aload_0
    //   1458: getfield h : [B
    //   1461: invokestatic e : ([B)Ljava/util/List;
    //   1464: astore_3
    //   1465: ldc_w 'audio/vorbis'
    //   1468: astore #7
    //   1470: iconst_m1
    //   1471: istore #8
    //   1473: sipush #8192
    //   1476: istore #4
    //   1478: goto -> 1663
    //   1481: ldc_w 'audio/true-hd'
    //   1484: astore_3
    //   1485: goto -> 1231
    //   1488: new com/google/android/gms/internal/ads/qj2
    //   1491: dup
    //   1492: aload_0
    //   1493: getfield h : [B
    //   1496: invokespecial <init> : ([B)V
    //   1499: invokestatic d : (Lcom/google/android/gms/internal/ads/qj2;)Z
    //   1502: ifeq -> 1591
    //   1505: aload_0
    //   1506: getfield H : I
    //   1509: invokestatic m : (I)I
    //   1512: istore #8
    //   1514: iload #8
    //   1516: istore #4
    //   1518: iload #8
    //   1520: ifne -> 1194
    //   1523: aload_0
    //   1524: getfield H : I
    //   1527: istore #4
    //   1529: new java/lang/StringBuilder
    //   1532: dup
    //   1533: ldc_w 'audio/x-unknown'
    //   1536: invokevirtual length : ()I
    //   1539: bipush #60
    //   1541: iadd
    //   1542: invokespecial <init> : (I)V
    //   1545: astore_3
    //   1546: aload_3
    //   1547: ldc_w 'Unsupported PCM bit depth: '
    //   1550: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1553: pop
    //   1554: aload_3
    //   1555: iload #4
    //   1557: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1560: pop
    //   1561: aload_3
    //   1562: ldc_w '. Setting mimeType to '
    //   1565: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1568: pop
    //   1569: aload_3
    //   1570: ldc_w 'audio/x-unknown'
    //   1573: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1576: pop
    //   1577: ldc_w 'MatroskaExtractor'
    //   1580: aload_3
    //   1581: invokevirtual toString : ()Ljava/lang/String;
    //   1584: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   1587: pop
    //   1588: goto -> 1187
    //   1591: ldc_w 'audio/x-unknown'
    //   1594: invokevirtual length : ()I
    //   1597: ifeq -> 1613
    //   1600: ldc_w 'Non-PCM MS/ACM is unsupported. Setting mimeType to '
    //   1603: ldc_w 'audio/x-unknown'
    //   1606: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   1609: astore_3
    //   1610: goto -> 1624
    //   1613: new java/lang/String
    //   1616: dup
    //   1617: ldc_w 'Non-PCM MS/ACM is unsupported. Setting mimeType to '
    //   1620: invokespecial <init> : (Ljava/lang/String;)V
    //   1623: astore_3
    //   1624: ldc_w 'MatroskaExtractor'
    //   1627: aload_3
    //   1628: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   1631: pop
    //   1632: goto -> 1187
    //   1635: aload_0
    //   1636: getfield h : [B
    //   1639: astore_3
    //   1640: aload_3
    //   1641: ifnonnull -> 1650
    //   1644: aconst_null
    //   1645: astore #7
    //   1647: goto -> 1656
    //   1650: aload_3
    //   1651: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   1654: astore #7
    //   1656: ldc_w 'video/mp4v-es'
    //   1659: astore_3
    //   1660: goto -> 1234
    //   1663: aload_0
    //   1664: getfield M : Z
    //   1667: istore #9
    //   1669: aload_0
    //   1670: getfield L : Z
    //   1673: ifeq -> 1682
    //   1676: iconst_2
    //   1677: istore #10
    //   1679: goto -> 1685
    //   1682: iconst_0
    //   1683: istore #10
    //   1685: iload #9
    //   1687: iconst_0
    //   1688: ior
    //   1689: iload #10
    //   1691: ior
    //   1692: istore #10
    //   1694: aload #7
    //   1696: invokestatic a : (Ljava/lang/String;)Z
    //   1699: ifeq -> 1743
    //   1702: iload_2
    //   1703: invokestatic toString : (I)Ljava/lang/String;
    //   1706: aload #7
    //   1708: aconst_null
    //   1709: iconst_m1
    //   1710: iload #4
    //   1712: aload_0
    //   1713: getfield G : I
    //   1716: aload_0
    //   1717: getfield I : I
    //   1720: iload #8
    //   1722: aload_3
    //   1723: aload_0
    //   1724: getfield i : Lcom/google/android/gms/internal/ads/zzjo;
    //   1727: iload #10
    //   1729: aload_0
    //   1730: getfield N : Ljava/lang/String;
    //   1733: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILjava/util/List;Lcom/google/android/gms/internal/ads/zzjo;ILjava/lang/String;)Lcom/google/android/gms/internal/ads/zzht;
    //   1736: astore_3
    //   1737: iload #5
    //   1739: istore_2
    //   1740: goto -> 2402
    //   1743: aload #7
    //   1745: invokestatic b : (Ljava/lang/String;)Z
    //   1748: ifeq -> 2293
    //   1751: aload_0
    //   1752: getfield n : I
    //   1755: ifne -> 1817
    //   1758: aload_0
    //   1759: getfield l : I
    //   1762: istore #10
    //   1764: iload #10
    //   1766: istore #8
    //   1768: iload #10
    //   1770: iconst_m1
    //   1771: if_icmpne -> 1780
    //   1774: aload_0
    //   1775: getfield j : I
    //   1778: istore #8
    //   1780: aload_0
    //   1781: iload #8
    //   1783: putfield l : I
    //   1786: aload_0
    //   1787: getfield m : I
    //   1790: istore #10
    //   1792: iload #10
    //   1794: istore #8
    //   1796: iload #10
    //   1798: iconst_m1
    //   1799: if_icmpne -> 1808
    //   1802: aload_0
    //   1803: getfield k : I
    //   1806: istore #8
    //   1808: aload_0
    //   1809: iload #8
    //   1811: putfield m : I
    //   1814: goto -> 1817
    //   1817: aload_0
    //   1818: getfield l : I
    //   1821: istore #10
    //   1823: iload #10
    //   1825: iconst_m1
    //   1826: if_icmpeq -> 1863
    //   1829: aload_0
    //   1830: getfield m : I
    //   1833: istore #8
    //   1835: iload #8
    //   1837: iconst_m1
    //   1838: if_icmpeq -> 1863
    //   1841: aload_0
    //   1842: getfield k : I
    //   1845: iload #10
    //   1847: imul
    //   1848: i2f
    //   1849: aload_0
    //   1850: getfield j : I
    //   1853: iload #8
    //   1855: imul
    //   1856: i2f
    //   1857: fdiv
    //   1858: fstore #11
    //   1860: goto -> 1867
    //   1863: ldc -1.0
    //   1865: fstore #11
    //   1867: aload_0
    //   1868: getfield q : Z
    //   1871: ifeq -> 2243
    //   1874: aload_0
    //   1875: getfield w : F
    //   1878: ldc -1.0
    //   1880: fcmpl
    //   1881: ifeq -> 2214
    //   1884: aload_0
    //   1885: getfield x : F
    //   1888: ldc -1.0
    //   1890: fcmpl
    //   1891: ifeq -> 2214
    //   1894: aload_0
    //   1895: getfield y : F
    //   1898: ldc -1.0
    //   1900: fcmpl
    //   1901: ifeq -> 2214
    //   1904: aload_0
    //   1905: getfield z : F
    //   1908: ldc -1.0
    //   1910: fcmpl
    //   1911: ifeq -> 2214
    //   1914: aload_0
    //   1915: getfield A : F
    //   1918: ldc -1.0
    //   1920: fcmpl
    //   1921: ifeq -> 2214
    //   1924: aload_0
    //   1925: getfield B : F
    //   1928: ldc -1.0
    //   1930: fcmpl
    //   1931: ifeq -> 2214
    //   1934: aload_0
    //   1935: getfield C : F
    //   1938: ldc -1.0
    //   1940: fcmpl
    //   1941: ifeq -> 2214
    //   1944: aload_0
    //   1945: getfield D : F
    //   1948: ldc -1.0
    //   1950: fcmpl
    //   1951: ifeq -> 2214
    //   1954: aload_0
    //   1955: getfield E : F
    //   1958: ldc -1.0
    //   1960: fcmpl
    //   1961: ifeq -> 2214
    //   1964: aload_0
    //   1965: getfield F : F
    //   1968: ldc -1.0
    //   1970: fcmpl
    //   1971: ifne -> 1977
    //   1974: goto -> 2214
    //   1977: bipush #25
    //   1979: newarray byte
    //   1981: astore #6
    //   1983: aload #6
    //   1985: invokestatic wrap : ([B)Ljava/nio/ByteBuffer;
    //   1988: astore #12
    //   1990: aload #12
    //   1992: iconst_0
    //   1993: invokevirtual put : (B)Ljava/nio/ByteBuffer;
    //   1996: pop
    //   1997: aload #12
    //   1999: aload_0
    //   2000: getfield w : F
    //   2003: ldc_w 50000.0
    //   2006: fmul
    //   2007: ldc_w 0.5
    //   2010: fadd
    //   2011: f2i
    //   2012: i2s
    //   2013: invokevirtual putShort : (S)Ljava/nio/ByteBuffer;
    //   2016: pop
    //   2017: aload #12
    //   2019: aload_0
    //   2020: getfield x : F
    //   2023: ldc_w 50000.0
    //   2026: fmul
    //   2027: ldc_w 0.5
    //   2030: fadd
    //   2031: f2i
    //   2032: i2s
    //   2033: invokevirtual putShort : (S)Ljava/nio/ByteBuffer;
    //   2036: pop
    //   2037: aload #12
    //   2039: aload_0
    //   2040: getfield y : F
    //   2043: ldc_w 50000.0
    //   2046: fmul
    //   2047: ldc_w 0.5
    //   2050: fadd
    //   2051: f2i
    //   2052: i2s
    //   2053: invokevirtual putShort : (S)Ljava/nio/ByteBuffer;
    //   2056: pop
    //   2057: aload #12
    //   2059: aload_0
    //   2060: getfield z : F
    //   2063: ldc_w 50000.0
    //   2066: fmul
    //   2067: ldc_w 0.5
    //   2070: fadd
    //   2071: f2i
    //   2072: i2s
    //   2073: invokevirtual putShort : (S)Ljava/nio/ByteBuffer;
    //   2076: pop
    //   2077: aload #12
    //   2079: aload_0
    //   2080: getfield A : F
    //   2083: ldc_w 50000.0
    //   2086: fmul
    //   2087: ldc_w 0.5
    //   2090: fadd
    //   2091: f2i
    //   2092: i2s
    //   2093: invokevirtual putShort : (S)Ljava/nio/ByteBuffer;
    //   2096: pop
    //   2097: aload #12
    //   2099: aload_0
    //   2100: getfield B : F
    //   2103: ldc_w 50000.0
    //   2106: fmul
    //   2107: ldc_w 0.5
    //   2110: fadd
    //   2111: f2i
    //   2112: i2s
    //   2113: invokevirtual putShort : (S)Ljava/nio/ByteBuffer;
    //   2116: pop
    //   2117: aload #12
    //   2119: aload_0
    //   2120: getfield C : F
    //   2123: ldc_w 50000.0
    //   2126: fmul
    //   2127: ldc_w 0.5
    //   2130: fadd
    //   2131: f2i
    //   2132: i2s
    //   2133: invokevirtual putShort : (S)Ljava/nio/ByteBuffer;
    //   2136: pop
    //   2137: aload #12
    //   2139: aload_0
    //   2140: getfield D : F
    //   2143: ldc_w 50000.0
    //   2146: fmul
    //   2147: ldc_w 0.5
    //   2150: fadd
    //   2151: f2i
    //   2152: i2s
    //   2153: invokevirtual putShort : (S)Ljava/nio/ByteBuffer;
    //   2156: pop
    //   2157: aload #12
    //   2159: aload_0
    //   2160: getfield E : F
    //   2163: ldc_w 0.5
    //   2166: fadd
    //   2167: f2i
    //   2168: i2s
    //   2169: invokevirtual putShort : (S)Ljava/nio/ByteBuffer;
    //   2172: pop
    //   2173: aload #12
    //   2175: aload_0
    //   2176: getfield F : F
    //   2179: ldc_w 0.5
    //   2182: fadd
    //   2183: f2i
    //   2184: i2s
    //   2185: invokevirtual putShort : (S)Ljava/nio/ByteBuffer;
    //   2188: pop
    //   2189: aload #12
    //   2191: aload_0
    //   2192: getfield u : I
    //   2195: i2s
    //   2196: invokevirtual putShort : (S)Ljava/nio/ByteBuffer;
    //   2199: pop
    //   2200: aload #12
    //   2202: aload_0
    //   2203: getfield v : I
    //   2206: i2s
    //   2207: invokevirtual putShort : (S)Ljava/nio/ByteBuffer;
    //   2210: pop
    //   2211: goto -> 2217
    //   2214: aconst_null
    //   2215: astore #6
    //   2217: new com/google/android/gms/internal/ads/zzpy
    //   2220: dup
    //   2221: aload_0
    //   2222: getfield r : I
    //   2225: aload_0
    //   2226: getfield t : I
    //   2229: aload_0
    //   2230: getfield s : I
    //   2233: aload #6
    //   2235: invokespecial <init> : (III[B)V
    //   2238: astore #6
    //   2240: goto -> 2246
    //   2243: aconst_null
    //   2244: astore #6
    //   2246: iload_2
    //   2247: invokestatic toString : (I)Ljava/lang/String;
    //   2250: aload #7
    //   2252: aconst_null
    //   2253: iconst_m1
    //   2254: iload #4
    //   2256: aload_0
    //   2257: getfield j : I
    //   2260: aload_0
    //   2261: getfield k : I
    //   2264: ldc -1.0
    //   2266: aload_3
    //   2267: iconst_m1
    //   2268: fload #11
    //   2270: aload_0
    //   2271: getfield o : [B
    //   2274: aload_0
    //   2275: getfield p : I
    //   2278: aload #6
    //   2280: aload_0
    //   2281: getfield i : Lcom/google/android/gms/internal/ads/zzjo;
    //   2284: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIFLjava/util/List;IF[BILcom/google/android/gms/internal/ads/zzpy;Lcom/google/android/gms/internal/ads/zzjo;)Lcom/google/android/gms/internal/ads/zzht;
    //   2287: astore_3
    //   2288: iconst_2
    //   2289: istore_2
    //   2290: goto -> 2402
    //   2293: ldc_w 'application/x-subrip'
    //   2296: aload #7
    //   2298: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2301: ifeq -> 2331
    //   2304: iload_2
    //   2305: invokestatic toString : (I)Ljava/lang/String;
    //   2308: aload #7
    //   2310: aconst_null
    //   2311: iconst_m1
    //   2312: iload #10
    //   2314: aload_0
    //   2315: getfield N : Ljava/lang/String;
    //   2318: aload_0
    //   2319: getfield i : Lcom/google/android/gms/internal/ads/zzjo;
    //   2322: invokestatic h : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/google/android/gms/internal/ads/zzjo;)Lcom/google/android/gms/internal/ads/zzht;
    //   2325: astore_3
    //   2326: iconst_3
    //   2327: istore_2
    //   2328: goto -> 2402
    //   2331: ldc_w 'application/vobsub'
    //   2334: aload #7
    //   2336: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2339: ifne -> 2378
    //   2342: ldc_w 'application/pgs'
    //   2345: aload #7
    //   2347: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2350: ifne -> 2378
    //   2353: ldc_w 'application/dvbsubs'
    //   2356: aload #7
    //   2358: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2361: ifeq -> 2367
    //   2364: goto -> 2378
    //   2367: new com/google/android/gms/internal/ads/zzhw
    //   2370: dup
    //   2371: ldc_w 'Unexpected MIME type.'
    //   2374: invokespecial <init> : (Ljava/lang/String;)V
    //   2377: athrow
    //   2378: iload_2
    //   2379: invokestatic toString : (I)Ljava/lang/String;
    //   2382: aload #7
    //   2384: aconst_null
    //   2385: iconst_m1
    //   2386: aload_3
    //   2387: aload_0
    //   2388: getfield N : Ljava/lang/String;
    //   2391: aload_0
    //   2392: getfield i : Lcom/google/android/gms/internal/ads/zzjo;
    //   2395: invokestatic j : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzjo;)Lcom/google/android/gms/internal/ads/zzht;
    //   2398: astore_3
    //   2399: goto -> 2326
    //   2402: aload_1
    //   2403: aload_0
    //   2404: getfield b : I
    //   2407: iload_2
    //   2408: invokeinterface e : (II)Lcom/google/android/gms/internal/ads/ue2;
    //   2413: astore_1
    //   2414: aload_0
    //   2415: aload_1
    //   2416: putfield O : Lcom/google/android/gms/internal/ads/ue2;
    //   2419: aload_1
    //   2420: aload_3
    //   2421: invokeinterface a : (Lcom/google/android/gms/internal/ads/zzht;)V
    //   2426: return
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ef2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */