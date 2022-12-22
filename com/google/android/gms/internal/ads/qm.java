package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class qm {
  private static int a(int paramInt) {
    if (paramInt != 513)
      if (paramInt != 514) {
        if (paramInt != 769) {
          String str;
          switch (paramInt) {
            default:
              str = String.valueOf(Long.toHexString(paramInt));
              if (str.length() != 0) {
                str = "Unknown signature algorithm: 0x".concat(str);
              } else {
                str = new String("Unknown signature algorithm: 0x");
              } 
              throw new IllegalArgumentException(str);
            case 258:
            case 260:
              return 2;
            case 257:
            case 259:
              break;
          } 
        } 
        return 1;
      }  
    return 1;
  }
  
  private static ByteBuffer b(ByteBuffer paramByteBuffer) {
    if (paramByteBuffer.remaining() >= 4) {
      int j = paramByteBuffer.getInt();
      if (j >= 0) {
        if (j <= paramByteBuffer.remaining())
          return c(paramByteBuffer, j); 
        int k = paramByteBuffer.remaining();
        stringBuilder = new StringBuilder(101);
        stringBuilder.append("Length-prefixed field longer than remaining buffer. Field length: ");
        stringBuilder.append(j);
        stringBuilder.append(", remaining: ");
        stringBuilder.append(k);
        throw new IOException(stringBuilder.toString());
      } 
      throw new IllegalArgumentException("Negative length");
    } 
    int i = stringBuilder.remaining();
    StringBuilder stringBuilder = new StringBuilder(93);
    stringBuilder.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
    stringBuilder.append(i);
    throw new IOException(stringBuilder.toString());
  }
  
  private static ByteBuffer c(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt >= 0) {
      int i = paramByteBuffer.limit();
      int j = paramByteBuffer.position();
      paramInt += j;
      if (paramInt >= j && paramInt <= i) {
        paramByteBuffer.limit(paramInt);
        try {
          ByteBuffer byteBuffer = paramByteBuffer.slice();
          byteBuffer.order(paramByteBuffer.order());
          paramByteBuffer.position(paramInt);
          return byteBuffer;
        } finally {
          paramByteBuffer.limit(i);
        } 
      } 
      throw new BufferUnderflowException();
    } 
    StringBuilder stringBuilder = new StringBuilder(17);
    stringBuilder.append("size: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private static ByteBuffer d(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2) {
    if (paramInt2 >= 8) {
      paramInt1 = paramByteBuffer.capacity();
      if (paramInt2 <= paramByteBuffer.capacity()) {
        paramInt1 = paramByteBuffer.limit();
        int i = paramByteBuffer.position();
        try {
          paramByteBuffer.position(0);
          paramByteBuffer.limit(paramInt2);
          paramByteBuffer.position(8);
          ByteBuffer byteBuffer = paramByteBuffer.slice();
          byteBuffer.order(paramByteBuffer.order());
          return byteBuffer;
        } finally {
          paramByteBuffer.position(0);
          paramByteBuffer.limit(paramInt1);
          paramByteBuffer.position(i);
        } 
      } 
      StringBuilder stringBuilder1 = new StringBuilder(41);
      stringBuilder1.append("end > capacity: ");
      stringBuilder1.append(paramInt2);
      stringBuilder1.append(" > ");
      stringBuilder1.append(paramInt1);
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder(38);
    stringBuilder.append("end < start: ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(" < 8");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private static void e(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    paramArrayOfbyte[1] = (byte)(byte)paramInt1;
    paramArrayOfbyte[2] = (byte)(byte)(paramInt1 >>> 8);
    paramArrayOfbyte[3] = (byte)(byte)(paramInt1 >>> 16);
    paramArrayOfbyte[4] = (byte)(byte)(paramInt1 >>> 24);
  }
  
  private static X509Certificate[] f(ByteBuffer paramByteBuffer, Map<Integer, byte[]> paramMap, CertificateFactory paramCertificateFactory) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic b : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   4: astore_3
    //   5: aload_0
    //   6: invokestatic b : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   9: astore #4
    //   11: aload_0
    //   12: invokestatic k : (Ljava/nio/ByteBuffer;)[B
    //   15: astore #5
    //   17: new java/util/ArrayList
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: astore #6
    //   26: iconst_m1
    //   27: istore #7
    //   29: iconst_0
    //   30: istore #8
    //   32: aconst_null
    //   33: astore #9
    //   35: aload #4
    //   37: invokevirtual hasRemaining : ()Z
    //   40: istore #10
    //   42: iconst_1
    //   43: istore #11
    //   45: iload #10
    //   47: ifeq -> 435
    //   50: iload #8
    //   52: iconst_1
    //   53: iadd
    //   54: istore #12
    //   56: aload #4
    //   58: invokestatic b : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   61: astore_0
    //   62: aload_0
    //   63: invokevirtual remaining : ()I
    //   66: bipush #8
    //   68: if_icmplt -> 381
    //   71: aload_0
    //   72: invokevirtual getInt : ()I
    //   75: istore #13
    //   77: aload #6
    //   79: iload #13
    //   81: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   84: invokeinterface add : (Ljava/lang/Object;)Z
    //   89: pop
    //   90: iload #13
    //   92: sipush #513
    //   95: if_icmpeq -> 154
    //   98: iload #13
    //   100: sipush #514
    //   103: if_icmpeq -> 154
    //   106: iload #13
    //   108: sipush #769
    //   111: if_icmpeq -> 154
    //   114: iload #13
    //   116: tableswitch default -> 148, 257 -> 154, 258 -> 154, 259 -> 154, 260 -> 154
    //   148: iconst_0
    //   149: istore #14
    //   151: goto -> 157
    //   154: iconst_1
    //   155: istore #14
    //   157: iload #14
    //   159: ifne -> 169
    //   162: iload #12
    //   164: istore #8
    //   166: goto -> 35
    //   169: iload #7
    //   171: iconst_m1
    //   172: if_icmpeq -> 364
    //   175: iload #13
    //   177: invokestatic a : (I)I
    //   180: istore #14
    //   182: iload #7
    //   184: invokestatic a : (I)I
    //   187: istore #8
    //   189: iload #14
    //   191: iconst_1
    //   192: if_icmpeq -> 296
    //   195: iload #14
    //   197: iconst_2
    //   198: if_icmpne -> 258
    //   201: iload #11
    //   203: istore #14
    //   205: iload #8
    //   207: iconst_1
    //   208: if_icmpeq -> 355
    //   211: iload #8
    //   213: iconst_2
    //   214: if_icmpne -> 220
    //   217: goto -> 352
    //   220: new java/lang/IllegalArgumentException
    //   223: astore_0
    //   224: new java/lang/StringBuilder
    //   227: astore_1
    //   228: aload_1
    //   229: bipush #37
    //   231: invokespecial <init> : (I)V
    //   234: aload_1
    //   235: ldc 'Unknown digestAlgorithm2: '
    //   237: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: pop
    //   241: aload_1
    //   242: iload #8
    //   244: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   247: pop
    //   248: aload_0
    //   249: aload_1
    //   250: invokevirtual toString : ()Ljava/lang/String;
    //   253: invokespecial <init> : (Ljava/lang/String;)V
    //   256: aload_0
    //   257: athrow
    //   258: new java/lang/IllegalArgumentException
    //   261: astore_0
    //   262: new java/lang/StringBuilder
    //   265: astore_1
    //   266: aload_1
    //   267: bipush #37
    //   269: invokespecial <init> : (I)V
    //   272: aload_1
    //   273: ldc 'Unknown digestAlgorithm1: '
    //   275: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: pop
    //   279: aload_1
    //   280: iload #14
    //   282: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   285: pop
    //   286: aload_0
    //   287: aload_1
    //   288: invokevirtual toString : ()Ljava/lang/String;
    //   291: invokespecial <init> : (Ljava/lang/String;)V
    //   294: aload_0
    //   295: athrow
    //   296: iload #8
    //   298: iconst_1
    //   299: if_icmpeq -> 352
    //   302: iload #8
    //   304: iconst_2
    //   305: if_icmpne -> 314
    //   308: iconst_m1
    //   309: istore #14
    //   311: goto -> 355
    //   314: new java/lang/IllegalArgumentException
    //   317: astore_0
    //   318: new java/lang/StringBuilder
    //   321: astore_1
    //   322: aload_1
    //   323: bipush #37
    //   325: invokespecial <init> : (I)V
    //   328: aload_1
    //   329: ldc 'Unknown digestAlgorithm2: '
    //   331: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: pop
    //   335: aload_1
    //   336: iload #8
    //   338: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   341: pop
    //   342: aload_0
    //   343: aload_1
    //   344: invokevirtual toString : ()Ljava/lang/String;
    //   347: invokespecial <init> : (Ljava/lang/String;)V
    //   350: aload_0
    //   351: athrow
    //   352: iconst_0
    //   353: istore #14
    //   355: iload #12
    //   357: istore #8
    //   359: iload #14
    //   361: ifle -> 35
    //   364: aload_0
    //   365: invokestatic k : (Ljava/nio/ByteBuffer;)[B
    //   368: astore #9
    //   370: iload #13
    //   372: istore #7
    //   374: iload #12
    //   376: istore #8
    //   378: goto -> 35
    //   381: new java/lang/SecurityException
    //   384: astore_0
    //   385: aload_0
    //   386: ldc 'Signature record too short'
    //   388: invokespecial <init> : (Ljava/lang/String;)V
    //   391: aload_0
    //   392: athrow
    //   393: astore_0
    //   394: goto -> 398
    //   397: astore_0
    //   398: new java/lang/StringBuilder
    //   401: dup
    //   402: bipush #45
    //   404: invokespecial <init> : (I)V
    //   407: astore_1
    //   408: aload_1
    //   409: ldc 'Failed to parse signature record #'
    //   411: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   414: pop
    //   415: aload_1
    //   416: iload #12
    //   418: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   421: pop
    //   422: new java/lang/SecurityException
    //   425: dup
    //   426: aload_1
    //   427: invokevirtual toString : ()Ljava/lang/String;
    //   430: aload_0
    //   431: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   434: athrow
    //   435: iload #7
    //   437: iconst_m1
    //   438: if_icmpne -> 466
    //   441: iload #8
    //   443: ifne -> 456
    //   446: new java/lang/SecurityException
    //   449: dup
    //   450: ldc 'No signatures found'
    //   452: invokespecial <init> : (Ljava/lang/String;)V
    //   455: athrow
    //   456: new java/lang/SecurityException
    //   459: dup
    //   460: ldc 'No supported signatures found'
    //   462: invokespecial <init> : (Ljava/lang/String;)V
    //   465: athrow
    //   466: iload #7
    //   468: sipush #513
    //   471: if_icmpeq -> 584
    //   474: iload #7
    //   476: sipush #514
    //   479: if_icmpeq -> 584
    //   482: iload #7
    //   484: sipush #769
    //   487: if_icmpeq -> 577
    //   490: iload #7
    //   492: tableswitch default -> 524, 257 -> 570, 258 -> 570, 259 -> 570, 260 -> 570
    //   524: iload #7
    //   526: i2l
    //   527: invokestatic toHexString : (J)Ljava/lang/String;
    //   530: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   533: astore_0
    //   534: aload_0
    //   535: invokevirtual length : ()I
    //   538: ifeq -> 551
    //   541: ldc 'Unknown signature algorithm: 0x'
    //   543: aload_0
    //   544: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   547: astore_0
    //   548: goto -> 561
    //   551: new java/lang/String
    //   554: dup
    //   555: ldc 'Unknown signature algorithm: 0x'
    //   557: invokespecial <init> : (Ljava/lang/String;)V
    //   560: astore_0
    //   561: new java/lang/IllegalArgumentException
    //   564: dup
    //   565: aload_0
    //   566: invokespecial <init> : (Ljava/lang/String;)V
    //   569: athrow
    //   570: ldc 'RSA'
    //   572: astore #4
    //   574: goto -> 588
    //   577: ldc 'DSA'
    //   579: astore #4
    //   581: goto -> 588
    //   584: ldc 'EC'
    //   586: astore #4
    //   588: iload #7
    //   590: sipush #513
    //   593: if_icmpeq -> 782
    //   596: iload #7
    //   598: sipush #514
    //   601: if_icmpeq -> 772
    //   604: iload #7
    //   606: sipush #769
    //   609: if_icmpeq -> 762
    //   612: iload #7
    //   614: tableswitch default -> 644, 257 -> 736, 258 -> 710, 259 -> 700, 260 -> 690
    //   644: iload #7
    //   646: i2l
    //   647: invokestatic toHexString : (J)Ljava/lang/String;
    //   650: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   653: astore_0
    //   654: aload_0
    //   655: invokevirtual length : ()I
    //   658: ifeq -> 671
    //   661: ldc 'Unknown signature algorithm: 0x'
    //   663: aload_0
    //   664: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   667: astore_0
    //   668: goto -> 681
    //   671: new java/lang/String
    //   674: dup
    //   675: ldc 'Unknown signature algorithm: 0x'
    //   677: invokespecial <init> : (Ljava/lang/String;)V
    //   680: astore_0
    //   681: new java/lang/IllegalArgumentException
    //   684: dup
    //   685: aload_0
    //   686: invokespecial <init> : (Ljava/lang/String;)V
    //   689: athrow
    //   690: ldc 'SHA512withRSA'
    //   692: aconst_null
    //   693: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   696: astore_0
    //   697: goto -> 789
    //   700: ldc 'SHA256withRSA'
    //   702: aconst_null
    //   703: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   706: astore_0
    //   707: goto -> 789
    //   710: ldc 'SHA512withRSA/PSS'
    //   712: new java/security/spec/PSSParameterSpec
    //   715: dup
    //   716: ldc 'SHA-512'
    //   718: ldc 'MGF1'
    //   720: getstatic java/security/spec/MGF1ParameterSpec.SHA512 : Ljava/security/spec/MGF1ParameterSpec;
    //   723: bipush #64
    //   725: iconst_1
    //   726: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;II)V
    //   729: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   732: astore_0
    //   733: goto -> 759
    //   736: ldc 'SHA256withRSA/PSS'
    //   738: new java/security/spec/PSSParameterSpec
    //   741: dup
    //   742: ldc 'SHA-256'
    //   744: ldc 'MGF1'
    //   746: getstatic java/security/spec/MGF1ParameterSpec.SHA256 : Ljava/security/spec/MGF1ParameterSpec;
    //   749: bipush #32
    //   751: iconst_1
    //   752: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;II)V
    //   755: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   758: astore_0
    //   759: goto -> 789
    //   762: ldc 'SHA256withDSA'
    //   764: aconst_null
    //   765: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   768: astore_0
    //   769: goto -> 789
    //   772: ldc 'SHA512withECDSA'
    //   774: aconst_null
    //   775: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   778: astore_0
    //   779: goto -> 789
    //   782: ldc 'SHA256withECDSA'
    //   784: aconst_null
    //   785: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   788: astore_0
    //   789: aconst_null
    //   790: astore #15
    //   792: aload_0
    //   793: getfield first : Ljava/lang/Object;
    //   796: checkcast java/lang/String
    //   799: astore #16
    //   801: aload_0
    //   802: getfield second : Ljava/lang/Object;
    //   805: checkcast java/security/spec/AlgorithmParameterSpec
    //   808: astore_0
    //   809: aload #4
    //   811: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/KeyFactory;
    //   814: astore #17
    //   816: new java/security/spec/X509EncodedKeySpec
    //   819: astore #4
    //   821: aload #4
    //   823: aload #5
    //   825: invokespecial <init> : ([B)V
    //   828: aload #17
    //   830: aload #4
    //   832: invokevirtual generatePublic : (Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //   835: astore #4
    //   837: aload #16
    //   839: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/Signature;
    //   842: astore #17
    //   844: aload #17
    //   846: aload #4
    //   848: invokevirtual initVerify : (Ljava/security/PublicKey;)V
    //   851: aload_0
    //   852: ifnull -> 861
    //   855: aload #17
    //   857: aload_0
    //   858: invokevirtual setParameter : (Ljava/security/spec/AlgorithmParameterSpec;)V
    //   861: aload #17
    //   863: aload_3
    //   864: invokevirtual update : (Ljava/nio/ByteBuffer;)V
    //   867: aload #17
    //   869: aload #9
    //   871: invokevirtual verify : ([B)Z
    //   874: istore #10
    //   876: iload #10
    //   878: ifeq -> 1312
    //   881: aload_3
    //   882: invokevirtual clear : ()Ljava/nio/Buffer;
    //   885: pop
    //   886: aload_3
    //   887: invokestatic b : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   890: astore #4
    //   892: new java/util/ArrayList
    //   895: dup
    //   896: invokespecial <init> : ()V
    //   899: astore #9
    //   901: iconst_0
    //   902: istore #14
    //   904: aload #15
    //   906: astore_0
    //   907: aload #4
    //   909: invokevirtual hasRemaining : ()Z
    //   912: ifeq -> 1038
    //   915: iload #14
    //   917: iconst_1
    //   918: iadd
    //   919: istore #8
    //   921: aload #4
    //   923: invokestatic b : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   926: astore #15
    //   928: aload #15
    //   930: invokevirtual remaining : ()I
    //   933: bipush #8
    //   935: if_icmplt -> 982
    //   938: aload #15
    //   940: invokevirtual getInt : ()I
    //   943: istore #12
    //   945: aload #9
    //   947: iload #12
    //   949: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   952: invokeinterface add : (Ljava/lang/Object;)Z
    //   957: pop
    //   958: iload #8
    //   960: istore #14
    //   962: iload #12
    //   964: iload #7
    //   966: if_icmpne -> 907
    //   969: aload #15
    //   971: invokestatic k : (Ljava/nio/ByteBuffer;)[B
    //   974: astore_0
    //   975: iload #8
    //   977: istore #14
    //   979: goto -> 907
    //   982: new java/io/IOException
    //   985: astore_0
    //   986: aload_0
    //   987: ldc_w 'Record too short'
    //   990: invokespecial <init> : (Ljava/lang/String;)V
    //   993: aload_0
    //   994: athrow
    //   995: astore_0
    //   996: goto -> 1000
    //   999: astore_0
    //   1000: new java/lang/StringBuilder
    //   1003: dup
    //   1004: bipush #42
    //   1006: invokespecial <init> : (I)V
    //   1009: astore_1
    //   1010: aload_1
    //   1011: ldc_w 'Failed to parse digest record #'
    //   1014: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1017: pop
    //   1018: aload_1
    //   1019: iload #8
    //   1021: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1024: pop
    //   1025: new java/io/IOException
    //   1028: dup
    //   1029: aload_1
    //   1030: invokevirtual toString : ()Ljava/lang/String;
    //   1033: aload_0
    //   1034: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1037: athrow
    //   1038: aload #6
    //   1040: aload #9
    //   1042: invokeinterface equals : (Ljava/lang/Object;)Z
    //   1047: ifeq -> 1301
    //   1050: iload #7
    //   1052: invokestatic a : (I)I
    //   1055: istore #14
    //   1057: aload_1
    //   1058: iload #14
    //   1060: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1063: aload_0
    //   1064: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1069: checkcast [B
    //   1072: astore_1
    //   1073: aload_1
    //   1074: ifnull -> 1110
    //   1077: aload_1
    //   1078: aload_0
    //   1079: invokestatic isEqual : ([B[B)Z
    //   1082: ifeq -> 1088
    //   1085: goto -> 1110
    //   1088: new java/lang/SecurityException
    //   1091: dup
    //   1092: iload #14
    //   1094: invokestatic j : (I)Ljava/lang/String;
    //   1097: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1100: ldc_w ' contents digest does not match the digest specified by a preceding signer'
    //   1103: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   1106: invokespecial <init> : (Ljava/lang/String;)V
    //   1109: athrow
    //   1110: aload_3
    //   1111: invokestatic b : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   1114: astore_0
    //   1115: new java/util/ArrayList
    //   1118: dup
    //   1119: invokespecial <init> : ()V
    //   1122: astore_1
    //   1123: iconst_0
    //   1124: istore #14
    //   1126: aload_0
    //   1127: invokevirtual hasRemaining : ()Z
    //   1130: ifeq -> 1225
    //   1133: iinc #14, 1
    //   1136: aload_0
    //   1137: invokestatic k : (Ljava/nio/ByteBuffer;)[B
    //   1140: astore #4
    //   1142: new java/io/ByteArrayInputStream
    //   1145: astore #9
    //   1147: aload #9
    //   1149: aload #4
    //   1151: invokespecial <init> : ([B)V
    //   1154: aload_2
    //   1155: aload #9
    //   1157: invokevirtual generateCertificate : (Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    //   1160: checkcast java/security/cert/X509Certificate
    //   1163: astore #9
    //   1165: aload_1
    //   1166: new com/google/android/gms/internal/ads/zzg
    //   1169: dup
    //   1170: aload #9
    //   1172: aload #4
    //   1174: invokespecial <init> : (Ljava/security/cert/X509Certificate;[B)V
    //   1177: invokeinterface add : (Ljava/lang/Object;)Z
    //   1182: pop
    //   1183: goto -> 1126
    //   1186: astore_1
    //   1187: new java/lang/StringBuilder
    //   1190: dup
    //   1191: bipush #41
    //   1193: invokespecial <init> : (I)V
    //   1196: astore_0
    //   1197: aload_0
    //   1198: ldc_w 'Failed to decode certificate #'
    //   1201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1204: pop
    //   1205: aload_0
    //   1206: iload #14
    //   1208: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1211: pop
    //   1212: new java/lang/SecurityException
    //   1215: dup
    //   1216: aload_0
    //   1217: invokevirtual toString : ()Ljava/lang/String;
    //   1220: aload_1
    //   1221: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1224: athrow
    //   1225: aload_1
    //   1226: invokeinterface isEmpty : ()Z
    //   1231: ifne -> 1290
    //   1234: aload #5
    //   1236: aload_1
    //   1237: iconst_0
    //   1238: invokeinterface get : (I)Ljava/lang/Object;
    //   1243: checkcast java/security/cert/X509Certificate
    //   1246: invokevirtual getPublicKey : ()Ljava/security/PublicKey;
    //   1249: invokeinterface getEncoded : ()[B
    //   1254: invokestatic equals : ([B[B)Z
    //   1257: ifeq -> 1279
    //   1260: aload_1
    //   1261: aload_1
    //   1262: invokeinterface size : ()I
    //   1267: anewarray java/security/cert/X509Certificate
    //   1270: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   1275: checkcast [Ljava/security/cert/X509Certificate;
    //   1278: areturn
    //   1279: new java/lang/SecurityException
    //   1282: dup
    //   1283: ldc_w 'Public key mismatch between certificate and signature record'
    //   1286: invokespecial <init> : (Ljava/lang/String;)V
    //   1289: athrow
    //   1290: new java/lang/SecurityException
    //   1293: dup
    //   1294: ldc_w 'No certificates listed'
    //   1297: invokespecial <init> : (Ljava/lang/String;)V
    //   1300: athrow
    //   1301: new java/lang/SecurityException
    //   1304: dup
    //   1305: ldc_w 'Signature algorithms don't match between digests and signatures records'
    //   1308: invokespecial <init> : (Ljava/lang/String;)V
    //   1311: athrow
    //   1312: new java/lang/SecurityException
    //   1315: dup
    //   1316: aload #16
    //   1318: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1321: ldc_w ' signature did not verify'
    //   1324: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   1327: invokespecial <init> : (Ljava/lang/String;)V
    //   1330: athrow
    //   1331: astore_0
    //   1332: goto -> 1348
    //   1335: astore_0
    //   1336: goto -> 1348
    //   1339: astore_0
    //   1340: goto -> 1348
    //   1343: astore_0
    //   1344: goto -> 1348
    //   1347: astore_0
    //   1348: new java/lang/StringBuilder
    //   1351: dup
    //   1352: aload #16
    //   1354: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1357: invokevirtual length : ()I
    //   1360: bipush #27
    //   1362: iadd
    //   1363: invokespecial <init> : (I)V
    //   1366: astore_1
    //   1367: aload_1
    //   1368: ldc_w 'Failed to verify '
    //   1371: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1374: pop
    //   1375: aload_1
    //   1376: aload #16
    //   1378: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1381: pop
    //   1382: aload_1
    //   1383: ldc_w ' signature'
    //   1386: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1389: pop
    //   1390: new java/lang/SecurityException
    //   1393: dup
    //   1394: aload_1
    //   1395: invokevirtual toString : ()Ljava/lang/String;
    //   1398: aload_0
    //   1399: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1402: astore_0
    //   1403: goto -> 1408
    //   1406: aload_0
    //   1407: athrow
    //   1408: goto -> 1406
    // Exception table:
    //   from	to	target	type
    //   56	90	397	java/io/IOException
    //   56	90	393	java/nio/BufferUnderflowException
    //   175	189	397	java/io/IOException
    //   175	189	393	java/nio/BufferUnderflowException
    //   220	258	397	java/io/IOException
    //   220	258	393	java/nio/BufferUnderflowException
    //   258	296	397	java/io/IOException
    //   258	296	393	java/nio/BufferUnderflowException
    //   314	352	397	java/io/IOException
    //   314	352	393	java/nio/BufferUnderflowException
    //   364	370	397	java/io/IOException
    //   364	370	393	java/nio/BufferUnderflowException
    //   381	393	397	java/io/IOException
    //   381	393	393	java/nio/BufferUnderflowException
    //   809	851	1347	java/security/NoSuchAlgorithmException
    //   809	851	1343	java/security/spec/InvalidKeySpecException
    //   809	851	1339	java/security/InvalidKeyException
    //   809	851	1335	java/security/InvalidAlgorithmParameterException
    //   809	851	1331	java/security/SignatureException
    //   855	861	1347	java/security/NoSuchAlgorithmException
    //   855	861	1343	java/security/spec/InvalidKeySpecException
    //   855	861	1339	java/security/InvalidKeyException
    //   855	861	1335	java/security/InvalidAlgorithmParameterException
    //   855	861	1331	java/security/SignatureException
    //   861	876	1347	java/security/NoSuchAlgorithmException
    //   861	876	1343	java/security/spec/InvalidKeySpecException
    //   861	876	1339	java/security/InvalidKeyException
    //   861	876	1335	java/security/InvalidAlgorithmParameterException
    //   861	876	1331	java/security/SignatureException
    //   921	958	999	java/io/IOException
    //   921	958	995	java/nio/BufferUnderflowException
    //   969	975	999	java/io/IOException
    //   969	975	995	java/nio/BufferUnderflowException
    //   982	995	999	java/io/IOException
    //   982	995	995	java/nio/BufferUnderflowException
    //   1142	1165	1186	java/security/cert/CertificateException
  }
  
  private static byte[][] g(int[] paramArrayOfint, hd0[] paramArrayOfhd0) {
    hd0[] arrayOfHd0 = paramArrayOfhd0;
    int i = arrayOfHd0.length;
    byte b1 = 0;
    long l = 0L;
    byte b2;
    for (b2 = 0; b2 < i; b2++)
      l += (arrayOfHd0[b2].size() + 1048576L - 1L) / 1048576L; 
    if (l < 2097151L) {
      StringBuilder stringBuilder1;
      i = (int)l;
      byte[][] arrayOfByte1 = new byte[paramArrayOfint.length][];
      for (b2 = 0; b2 < paramArrayOfint.length; b2++) {
        byte[] arrayOfByte3 = new byte[l(paramArrayOfint[b2]) * i + 5];
        arrayOfByte3[0] = (byte)90;
        e(i, arrayOfByte3, 1);
        arrayOfByte1[b2] = arrayOfByte3;
      } 
      byte[] arrayOfByte = new byte[5];
      arrayOfByte[0] = (byte)-91;
      int j = paramArrayOfint.length;
      MessageDigest[] arrayOfMessageDigest2 = new MessageDigest[j];
      b2 = 0;
      while (b2 < paramArrayOfint.length) {
        String str = j(paramArrayOfint[b2]);
        try {
          arrayOfMessageDigest2[b2] = MessageDigest.getInstance(str);
          b2++;
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
          throw new RuntimeException(String.valueOf(str).concat(" digest not supported"), noSuchAlgorithmException);
        } 
      } 
      i = arrayOfHd0.length;
      byte b = 0;
      b2 = 0;
      MessageDigest[] arrayOfMessageDigest1 = arrayOfMessageDigest2;
      while (b < i) {
        hd0 hd01 = paramArrayOfhd0[b];
        long l1 = hd01.size();
        l = 0L;
        while (l1 > 0L) {
          int k = (int)Math.min(l1, 1048576L);
          e(k, arrayOfByte, 1);
          byte b3;
          for (b3 = 0; b3 < j; b3++)
            arrayOfMessageDigest1[b3].update(arrayOfByte); 
          try {
            hd01.a(arrayOfMessageDigest1, l, k);
            b3 = 0;
            while (b3 < noSuchAlgorithmException.length) {
              NoSuchAlgorithmException noSuchAlgorithmException1 = noSuchAlgorithmException[b3];
              byte[] arrayOfByte3 = arrayOfByte1[b3];
              int m = l(noSuchAlgorithmException1);
              MessageDigest messageDigest = arrayOfMessageDigest1[b3];
              int n = messageDigest.digest(arrayOfByte3, b2 * m + 5, m);
              if (n == m) {
                b3++;
                continue;
              } 
              String str = messageDigest.getAlgorithm();
              stringBuilder1 = new StringBuilder(String.valueOf(str).length() + 46);
              stringBuilder1.append("Unexpected output size of ");
              stringBuilder1.append(str);
              stringBuilder1.append(" digest: ");
              stringBuilder1.append(n);
              throw new RuntimeException(stringBuilder1.toString());
            } 
            long l2 = k;
            l1 -= l2;
            b2++;
            l += l2;
          } catch (IOException iOException) {
            stringBuilder1 = new StringBuilder(59);
            stringBuilder1.append("Failed to digest chunk #");
            stringBuilder1.append(b2);
            stringBuilder1.append(" of section #");
            stringBuilder1.append(b1);
            throw new DigestException(stringBuilder1.toString(), iOException);
          } 
        } 
        b1++;
        b++;
      } 
      byte[][] arrayOfByte2 = new byte[stringBuilder1.length][];
      b2 = 0;
      while (b2 < stringBuilder1.length) {
        StringBuilder stringBuilder2 = stringBuilder1[b2];
        byte[] arrayOfByte3 = arrayOfByte1[b2];
        String str = j(stringBuilder2);
        try {
          MessageDigest messageDigest = MessageDigest.getInstance(str);
          arrayOfByte2[b2] = messageDigest.digest(arrayOfByte3);
          b2++;
        } catch (NoSuchAlgorithmException noSuchAlgorithmException1) {
          throw new RuntimeException(String.valueOf(str).concat(" digest not supported"), noSuchAlgorithmException1);
        } 
      } 
      return arrayOfByte2;
    } 
    StringBuilder stringBuilder = new StringBuilder(37);
    stringBuilder.append("Too many chunks: ");
    stringBuilder.append(l);
    DigestException digestException = new DigestException(stringBuilder.toString());
    throw digestException;
  }
  
  public static X509Certificate[][] h(String paramString) {
    // Byte code:
    //   0: new java/io/RandomAccessFile
    //   3: dup
    //   4: aload_0
    //   5: ldc_w 'r'
    //   8: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   11: astore_0
    //   12: aload_0
    //   13: invokestatic a : (Ljava/io/RandomAccessFile;)Landroid/util/Pair;
    //   16: astore_1
    //   17: aload_1
    //   18: ifnull -> 960
    //   21: aload_1
    //   22: getfield first : Ljava/lang/Object;
    //   25: checkcast java/nio/ByteBuffer
    //   28: astore_2
    //   29: aload_1
    //   30: getfield second : Ljava/lang/Object;
    //   33: checkcast java/lang/Long
    //   36: invokevirtual longValue : ()J
    //   39: lstore_3
    //   40: lload_3
    //   41: ldc2_w 20
    //   44: lsub
    //   45: lstore #5
    //   47: iconst_0
    //   48: istore #7
    //   50: lload #5
    //   52: lconst_0
    //   53: lcmp
    //   54: iflt -> 79
    //   57: aload_0
    //   58: lload #5
    //   60: invokevirtual seek : (J)V
    //   63: aload_0
    //   64: invokevirtual readInt : ()I
    //   67: ldc_w 1347094023
    //   70: if_icmpne -> 79
    //   73: iconst_1
    //   74: istore #8
    //   76: goto -> 82
    //   79: iconst_0
    //   80: istore #8
    //   82: iload #8
    //   84: ifne -> 947
    //   87: aload_2
    //   88: invokestatic e : (Ljava/nio/ByteBuffer;)J
    //   91: lstore #5
    //   93: lload #5
    //   95: lload_3
    //   96: lcmp
    //   97: ifge -> 894
    //   100: aload_2
    //   101: invokestatic f : (Ljava/nio/ByteBuffer;)J
    //   104: lload #5
    //   106: ladd
    //   107: lload_3
    //   108: lcmp
    //   109: ifne -> 881
    //   112: lload #5
    //   114: ldc2_w 32
    //   117: lcmp
    //   118: iflt -> 842
    //   121: bipush #24
    //   123: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   126: astore #9
    //   128: getstatic java/nio/ByteOrder.LITTLE_ENDIAN : Ljava/nio/ByteOrder;
    //   131: astore_1
    //   132: aload #9
    //   134: aload_1
    //   135: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   138: pop
    //   139: aload_0
    //   140: lload #5
    //   142: aload #9
    //   144: invokevirtual capacity : ()I
    //   147: i2l
    //   148: lsub
    //   149: invokevirtual seek : (J)V
    //   152: aload_0
    //   153: aload #9
    //   155: invokevirtual array : ()[B
    //   158: aload #9
    //   160: invokevirtual arrayOffset : ()I
    //   163: aload #9
    //   165: invokevirtual capacity : ()I
    //   168: invokevirtual readFully : ([BII)V
    //   171: aload #9
    //   173: bipush #8
    //   175: invokevirtual getLong : (I)J
    //   178: ldc2_w 2334950737559900225
    //   181: lcmp
    //   182: ifne -> 829
    //   185: aload #9
    //   187: bipush #16
    //   189: invokevirtual getLong : (I)J
    //   192: ldc2_w 3617552046287187010
    //   195: lcmp
    //   196: ifne -> 829
    //   199: aload #9
    //   201: iconst_0
    //   202: invokevirtual getLong : (I)J
    //   205: lstore #10
    //   207: lload #10
    //   209: aload #9
    //   211: invokevirtual capacity : ()I
    //   214: i2l
    //   215: lcmp
    //   216: iflt -> 790
    //   219: lload #10
    //   221: ldc2_w 2147483639
    //   224: lcmp
    //   225: ifgt -> 790
    //   228: ldc2_w 8
    //   231: lload #10
    //   233: ladd
    //   234: l2i
    //   235: istore #8
    //   237: lload #5
    //   239: iload #8
    //   241: i2l
    //   242: lsub
    //   243: lstore #12
    //   245: lload #12
    //   247: lconst_0
    //   248: lcmp
    //   249: iflt -> 751
    //   252: iload #8
    //   254: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   257: astore #9
    //   259: aload #9
    //   261: aload_1
    //   262: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   265: pop
    //   266: aload_0
    //   267: lload #12
    //   269: invokevirtual seek : (J)V
    //   272: aload_0
    //   273: aload #9
    //   275: invokevirtual array : ()[B
    //   278: aload #9
    //   280: invokevirtual arrayOffset : ()I
    //   283: aload #9
    //   285: invokevirtual capacity : ()I
    //   288: invokevirtual readFully : ([BII)V
    //   291: aload #9
    //   293: iconst_0
    //   294: invokevirtual getLong : (I)J
    //   297: lstore #14
    //   299: lload #14
    //   301: lload #10
    //   303: lcmp
    //   304: ifne -> 697
    //   307: aload #9
    //   309: lload #12
    //   311: invokestatic valueOf : (J)Ljava/lang/Long;
    //   314: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   317: astore #16
    //   319: aload #16
    //   321: getfield first : Ljava/lang/Object;
    //   324: checkcast java/nio/ByteBuffer
    //   327: astore #9
    //   329: aload #16
    //   331: getfield second : Ljava/lang/Object;
    //   334: checkcast java/lang/Long
    //   337: invokevirtual longValue : ()J
    //   340: lstore #14
    //   342: aload #9
    //   344: invokevirtual order : ()Ljava/nio/ByteOrder;
    //   347: aload_1
    //   348: if_acmpne -> 684
    //   351: aload #9
    //   353: bipush #8
    //   355: aload #9
    //   357: invokevirtual capacity : ()I
    //   360: bipush #24
    //   362: isub
    //   363: invokestatic d : (Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;
    //   366: astore_1
    //   367: iload #7
    //   369: istore #8
    //   371: aload_1
    //   372: invokevirtual hasRemaining : ()Z
    //   375: ifeq -> 671
    //   378: iinc #8, 1
    //   381: aload_1
    //   382: invokevirtual remaining : ()I
    //   385: bipush #8
    //   387: if_icmplt -> 632
    //   390: aload_1
    //   391: invokevirtual getLong : ()J
    //   394: lstore #12
    //   396: lload #12
    //   398: ldc2_w 4
    //   401: lcmp
    //   402: iflt -> 578
    //   405: lload #12
    //   407: ldc2_w 2147483647
    //   410: lcmp
    //   411: ifgt -> 578
    //   414: lload #12
    //   416: l2i
    //   417: istore #7
    //   419: aload_1
    //   420: invokevirtual position : ()I
    //   423: istore #17
    //   425: iload #7
    //   427: aload_1
    //   428: invokevirtual remaining : ()I
    //   431: if_icmpgt -> 503
    //   434: aload_1
    //   435: invokevirtual getInt : ()I
    //   438: ldc_w 1896449818
    //   441: if_icmpne -> 490
    //   444: aload_1
    //   445: iload #7
    //   447: iconst_4
    //   448: isub
    //   449: invokestatic c : (Ljava/nio/ByteBuffer;I)Ljava/nio/ByteBuffer;
    //   452: astore #9
    //   454: new com/google/android/gms/internal/ads/st1
    //   457: astore_1
    //   458: aload_1
    //   459: aload #9
    //   461: lload #14
    //   463: lload #5
    //   465: lload_3
    //   466: aload_2
    //   467: aconst_null
    //   468: invokespecial <init> : (Ljava/nio/ByteBuffer;JJJLjava/nio/ByteBuffer;Lcom/google/android/gms/internal/ads/a;)V
    //   471: aload_0
    //   472: invokevirtual getChannel : ()Ljava/nio/channels/FileChannel;
    //   475: aload_1
    //   476: invokestatic i : (Ljava/nio/channels/FileChannel;Lcom/google/android/gms/internal/ads/st1;)[[Ljava/security/cert/X509Certificate;
    //   479: astore_2
    //   480: aload_0
    //   481: invokevirtual close : ()V
    //   484: aload_0
    //   485: invokevirtual close : ()V
    //   488: aload_2
    //   489: areturn
    //   490: aload_1
    //   491: iload #17
    //   493: iload #7
    //   495: iadd
    //   496: invokevirtual position : (I)Ljava/nio/Buffer;
    //   499: pop
    //   500: goto -> 371
    //   503: new com/google/android/gms/internal/ads/zzh
    //   506: astore_2
    //   507: aload_1
    //   508: invokevirtual remaining : ()I
    //   511: istore #17
    //   513: new java/lang/StringBuilder
    //   516: astore_1
    //   517: aload_1
    //   518: bipush #91
    //   520: invokespecial <init> : (I)V
    //   523: aload_1
    //   524: ldc_w 'APK Signing Block entry #'
    //   527: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   530: pop
    //   531: aload_1
    //   532: iload #8
    //   534: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   537: pop
    //   538: aload_1
    //   539: ldc_w ' size out of range: '
    //   542: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   545: pop
    //   546: aload_1
    //   547: iload #7
    //   549: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   552: pop
    //   553: aload_1
    //   554: ldc_w ', available: '
    //   557: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   560: pop
    //   561: aload_1
    //   562: iload #17
    //   564: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   567: pop
    //   568: aload_2
    //   569: aload_1
    //   570: invokevirtual toString : ()Ljava/lang/String;
    //   573: invokespecial <init> : (Ljava/lang/String;)V
    //   576: aload_2
    //   577: athrow
    //   578: new com/google/android/gms/internal/ads/zzh
    //   581: astore_2
    //   582: new java/lang/StringBuilder
    //   585: astore_1
    //   586: aload_1
    //   587: bipush #76
    //   589: invokespecial <init> : (I)V
    //   592: aload_1
    //   593: ldc_w 'APK Signing Block entry #'
    //   596: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   599: pop
    //   600: aload_1
    //   601: iload #8
    //   603: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   606: pop
    //   607: aload_1
    //   608: ldc_w ' size out of range: '
    //   611: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   614: pop
    //   615: aload_1
    //   616: lload #12
    //   618: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   621: pop
    //   622: aload_2
    //   623: aload_1
    //   624: invokevirtual toString : ()Ljava/lang/String;
    //   627: invokespecial <init> : (Ljava/lang/String;)V
    //   630: aload_2
    //   631: athrow
    //   632: new com/google/android/gms/internal/ads/zzh
    //   635: astore_2
    //   636: new java/lang/StringBuilder
    //   639: astore_1
    //   640: aload_1
    //   641: bipush #70
    //   643: invokespecial <init> : (I)V
    //   646: aload_1
    //   647: ldc_w 'Insufficient data to read size of APK Signing Block entry #'
    //   650: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   653: pop
    //   654: aload_1
    //   655: iload #8
    //   657: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   660: pop
    //   661: aload_2
    //   662: aload_1
    //   663: invokevirtual toString : ()Ljava/lang/String;
    //   666: invokespecial <init> : (Ljava/lang/String;)V
    //   669: aload_2
    //   670: athrow
    //   671: new com/google/android/gms/internal/ads/zzh
    //   674: astore_2
    //   675: aload_2
    //   676: ldc_w 'No APK Signature Scheme v2 block in APK Signing Block'
    //   679: invokespecial <init> : (Ljava/lang/String;)V
    //   682: aload_2
    //   683: athrow
    //   684: new java/lang/IllegalArgumentException
    //   687: astore_2
    //   688: aload_2
    //   689: ldc_w 'ByteBuffer byte order must be little endian'
    //   692: invokespecial <init> : (Ljava/lang/String;)V
    //   695: aload_2
    //   696: athrow
    //   697: new com/google/android/gms/internal/ads/zzh
    //   700: astore_2
    //   701: new java/lang/StringBuilder
    //   704: astore_1
    //   705: aload_1
    //   706: bipush #103
    //   708: invokespecial <init> : (I)V
    //   711: aload_1
    //   712: ldc_w 'APK Signing Block sizes in header and footer do not match: '
    //   715: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   718: pop
    //   719: aload_1
    //   720: lload #14
    //   722: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   725: pop
    //   726: aload_1
    //   727: ldc_w ' vs '
    //   730: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   733: pop
    //   734: aload_1
    //   735: lload #10
    //   737: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   740: pop
    //   741: aload_2
    //   742: aload_1
    //   743: invokevirtual toString : ()Ljava/lang/String;
    //   746: invokespecial <init> : (Ljava/lang/String;)V
    //   749: aload_2
    //   750: athrow
    //   751: new com/google/android/gms/internal/ads/zzh
    //   754: astore_2
    //   755: new java/lang/StringBuilder
    //   758: astore_1
    //   759: aload_1
    //   760: bipush #59
    //   762: invokespecial <init> : (I)V
    //   765: aload_1
    //   766: ldc_w 'APK Signing Block offset out of range: '
    //   769: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   772: pop
    //   773: aload_1
    //   774: lload #12
    //   776: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   779: pop
    //   780: aload_2
    //   781: aload_1
    //   782: invokevirtual toString : ()Ljava/lang/String;
    //   785: invokespecial <init> : (Ljava/lang/String;)V
    //   788: aload_2
    //   789: athrow
    //   790: new com/google/android/gms/internal/ads/zzh
    //   793: astore_1
    //   794: new java/lang/StringBuilder
    //   797: astore_2
    //   798: aload_2
    //   799: bipush #57
    //   801: invokespecial <init> : (I)V
    //   804: aload_2
    //   805: ldc_w 'APK Signing Block size out of range: '
    //   808: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   811: pop
    //   812: aload_2
    //   813: lload #10
    //   815: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   818: pop
    //   819: aload_1
    //   820: aload_2
    //   821: invokevirtual toString : ()Ljava/lang/String;
    //   824: invokespecial <init> : (Ljava/lang/String;)V
    //   827: aload_1
    //   828: athrow
    //   829: new com/google/android/gms/internal/ads/zzh
    //   832: astore_2
    //   833: aload_2
    //   834: ldc_w 'No APK Signing Block before ZIP Central Directory'
    //   837: invokespecial <init> : (Ljava/lang/String;)V
    //   840: aload_2
    //   841: athrow
    //   842: new com/google/android/gms/internal/ads/zzh
    //   845: astore_1
    //   846: new java/lang/StringBuilder
    //   849: astore_2
    //   850: aload_2
    //   851: bipush #87
    //   853: invokespecial <init> : (I)V
    //   856: aload_2
    //   857: ldc_w 'APK too small for APK Signing Block. ZIP Central Directory offset: '
    //   860: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   863: pop
    //   864: aload_2
    //   865: lload #5
    //   867: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   870: pop
    //   871: aload_1
    //   872: aload_2
    //   873: invokevirtual toString : ()Ljava/lang/String;
    //   876: invokespecial <init> : (Ljava/lang/String;)V
    //   879: aload_1
    //   880: athrow
    //   881: new com/google/android/gms/internal/ads/zzh
    //   884: astore_2
    //   885: aload_2
    //   886: ldc_w 'ZIP Central Directory is not immediately followed by End of Central Directory'
    //   889: invokespecial <init> : (Ljava/lang/String;)V
    //   892: aload_2
    //   893: athrow
    //   894: new com/google/android/gms/internal/ads/zzh
    //   897: astore_1
    //   898: new java/lang/StringBuilder
    //   901: astore_2
    //   902: aload_2
    //   903: bipush #122
    //   905: invokespecial <init> : (I)V
    //   908: aload_2
    //   909: ldc_w 'ZIP Central Directory offset out of range: '
    //   912: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   915: pop
    //   916: aload_2
    //   917: lload #5
    //   919: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   922: pop
    //   923: aload_2
    //   924: ldc_w '. ZIP End of Central Directory offset: '
    //   927: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   930: pop
    //   931: aload_2
    //   932: lload_3
    //   933: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   936: pop
    //   937: aload_1
    //   938: aload_2
    //   939: invokevirtual toString : ()Ljava/lang/String;
    //   942: invokespecial <init> : (Ljava/lang/String;)V
    //   945: aload_1
    //   946: athrow
    //   947: new com/google/android/gms/internal/ads/zzh
    //   950: astore_2
    //   951: aload_2
    //   952: ldc_w 'ZIP64 APK not supported'
    //   955: invokespecial <init> : (Ljava/lang/String;)V
    //   958: aload_2
    //   959: athrow
    //   960: new com/google/android/gms/internal/ads/zzh
    //   963: astore_2
    //   964: aload_0
    //   965: invokevirtual length : ()J
    //   968: lstore_3
    //   969: new java/lang/StringBuilder
    //   972: astore_1
    //   973: aload_1
    //   974: bipush #102
    //   976: invokespecial <init> : (I)V
    //   979: aload_1
    //   980: ldc_w 'Not an APK file: ZIP End of Central Directory record not found in file with '
    //   983: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   986: pop
    //   987: aload_1
    //   988: lload_3
    //   989: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   992: pop
    //   993: aload_1
    //   994: ldc_w ' bytes'
    //   997: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1000: pop
    //   1001: aload_2
    //   1002: aload_1
    //   1003: invokevirtual toString : ()Ljava/lang/String;
    //   1006: invokespecial <init> : (Ljava/lang/String;)V
    //   1009: aload_2
    //   1010: athrow
    //   1011: astore_2
    //   1012: aload_0
    //   1013: invokevirtual close : ()V
    //   1016: goto -> 1021
    //   1019: aload_2
    //   1020: athrow
    //   1021: goto -> 1019
    //   1024: astore_0
    //   1025: goto -> 488
    //   1028: astore_0
    //   1029: goto -> 1016
    // Exception table:
    //   from	to	target	type
    //   12	17	1011	finally
    //   21	40	1011	finally
    //   57	73	1011	finally
    //   87	93	1011	finally
    //   100	112	1011	finally
    //   121	219	1011	finally
    //   252	299	1011	finally
    //   307	367	1011	finally
    //   371	378	1011	finally
    //   381	396	1011	finally
    //   419	484	1011	finally
    //   484	488	1024	java/io/IOException
    //   490	500	1011	finally
    //   503	578	1011	finally
    //   578	632	1011	finally
    //   632	671	1011	finally
    //   671	684	1011	finally
    //   684	697	1011	finally
    //   697	751	1011	finally
    //   751	790	1011	finally
    //   790	829	1011	finally
    //   829	842	1011	finally
    //   842	881	1011	finally
    //   881	894	1011	finally
    //   894	947	1011	finally
    //   947	960	1011	finally
    //   960	1011	1011	finally
    //   1012	1016	1028	java/io/IOException
  }
  
  private static X509Certificate[][] i(FileChannel paramFileChannel, st1 paramst1) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    ArrayList<X509Certificate[]> arrayList = new ArrayList();
    try {
      CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
      try {
        StringBuilder stringBuilder;
        ByteBuffer byteBuffer = b(st1.a(paramst1));
        int i = 0;
        int j = 0;
        while (byteBuffer.hasRemaining()) {
          j++;
          try {
            arrayList.add(f(b(byteBuffer), (Map)hashMap, certificateFactory));
            continue;
          } catch (IOException iOException) {
            continue;
          } catch (BufferUnderflowException bufferUnderflowException) {
            continue;
          } catch (SecurityException securityException) {}
          stringBuilder = new StringBuilder(48);
          stringBuilder.append("Failed to parse/verify signer #");
          stringBuilder.append(j);
          stringBuilder.append(" block");
          throw new SecurityException(stringBuilder.toString(), securityException);
        } 
        if (j > 0) {
          if (!hashMap.isEmpty()) {
            long l1 = st1.b((st1)stringBuilder);
            long l2 = st1.c((st1)stringBuilder);
            long l3 = st1.d((st1)stringBuilder);
            byteBuffer = st1.e((st1)stringBuilder);
            if (!hashMap.isEmpty()) {
              x92 x922 = new x92((FileChannel)securityException, 0L, l1);
              x92 x921 = new x92((FileChannel)securityException, l2, l3 - l2);
              byteBuffer = byteBuffer.duplicate();
              byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
              rc2.c(byteBuffer, l1);
              d41 d41 = new d41(byteBuffer);
              int k = hashMap.size();
              int[] arrayOfInt = new int[k];
              Iterator iterator = hashMap.keySet().iterator();
              for (j = 0; iterator.hasNext(); j++)
                arrayOfInt[j] = ((Integer)iterator.next()).intValue(); 
              try {
                byte[][] arrayOfByte = g(arrayOfInt, new hd0[] { x922, x921, d41 });
                j = i;
                while (j < k) {
                  i = arrayOfInt[j];
                  if (MessageDigest.isEqual((byte[])hashMap.get(Integer.valueOf(i)), arrayOfByte[j])) {
                    j++;
                    continue;
                  } 
                  throw new SecurityException(String.valueOf(j(i)).concat(" digest of contents did not verify"));
                } 
                return arrayList.<X509Certificate[]>toArray(new X509Certificate[arrayList.size()][]);
              } catch (DigestException digestException) {
                throw new SecurityException("Failed to compute digest(s) of contents", digestException);
              } 
            } 
            throw new SecurityException("No digests provided");
          } 
          throw new SecurityException("No content digests found");
        } 
        throw new SecurityException("No signers found");
      } catch (IOException iOException) {
        throw new SecurityException("Failed to read list of signers", iOException);
      } 
    } catch (CertificateException certificateException) {
      RuntimeException runtimeException = new RuntimeException("Failed to obtain X.509 CertificateFactory", certificateException);
      throw runtimeException;
    } 
  }
  
  private static String j(int paramInt) {
    if (paramInt != 1) {
      if (paramInt == 2)
        return "SHA-512"; 
      StringBuilder stringBuilder = new StringBuilder(44);
      stringBuilder.append("Unknown content digest algorthm: ");
      stringBuilder.append(paramInt);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    return "SHA-256";
  }
  
  private static byte[] k(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getInt();
    if (i >= 0) {
      if (i <= paramByteBuffer.remaining()) {
        byte[] arrayOfByte = new byte[i];
        paramByteBuffer.get(arrayOfByte);
        return arrayOfByte;
      } 
      int j = paramByteBuffer.remaining();
      StringBuilder stringBuilder = new StringBuilder(90);
      stringBuilder.append("Underflow while reading length-prefixed value. Length: ");
      stringBuilder.append(i);
      stringBuilder.append(", available: ");
      stringBuilder.append(j);
      throw new IOException(stringBuilder.toString());
    } 
    throw new IOException("Negative length");
  }
  
  private static int l(int paramInt) {
    if (paramInt != 1) {
      if (paramInt == 2)
        return 64; 
      StringBuilder stringBuilder = new StringBuilder(44);
      stringBuilder.append("Unknown content digest algorthm: ");
      stringBuilder.append(paramInt);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    return 32;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */