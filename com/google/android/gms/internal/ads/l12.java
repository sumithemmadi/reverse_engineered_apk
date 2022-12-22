package com.google.android.gms.internal.ads;

import java.security.interfaces.ECPublicKey;

public final class l12 {
  private ECPublicKey a;
  
  public l12(ECPublicKey paramECPublicKey) {
    this.a = paramECPublicKey;
  }
  
  public final o12 a(String paramString, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt, zzeic paramzzeic) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Ljava/security/interfaces/ECPublicKey;
    //   4: invokeinterface getParams : ()Ljava/security/spec/ECParameterSpec;
    //   9: invokestatic b : (Ljava/security/spec/ECParameterSpec;)Ljava/security/KeyPair;
    //   12: astore #6
    //   14: aload #6
    //   16: invokevirtual getPublic : ()Ljava/security/PublicKey;
    //   19: checkcast java/security/interfaces/ECPublicKey
    //   22: astore #7
    //   24: aload #6
    //   26: invokevirtual getPrivate : ()Ljava/security/PrivateKey;
    //   29: checkcast java/security/interfaces/ECPrivateKey
    //   32: astore #8
    //   34: aload_0
    //   35: getfield a : Ljava/security/interfaces/ECPublicKey;
    //   38: astore #9
    //   40: aload #9
    //   42: invokeinterface getParams : ()Ljava/security/spec/ECParameterSpec;
    //   47: astore #6
    //   49: aload #8
    //   51: invokeinterface getParams : ()Ljava/security/spec/ECParameterSpec;
    //   56: astore #10
    //   58: aload #6
    //   60: invokevirtual getCurve : ()Ljava/security/spec/EllipticCurve;
    //   63: aload #10
    //   65: invokevirtual getCurve : ()Ljava/security/spec/EllipticCurve;
    //   68: invokevirtual equals : (Ljava/lang/Object;)Z
    //   71: istore #11
    //   73: iconst_1
    //   74: istore #12
    //   76: iload #11
    //   78: ifeq -> 140
    //   81: aload #6
    //   83: invokevirtual getGenerator : ()Ljava/security/spec/ECPoint;
    //   86: aload #10
    //   88: invokevirtual getGenerator : ()Ljava/security/spec/ECPoint;
    //   91: invokevirtual equals : (Ljava/lang/Object;)Z
    //   94: ifeq -> 140
    //   97: aload #6
    //   99: invokevirtual getOrder : ()Ljava/math/BigInteger;
    //   102: aload #10
    //   104: invokevirtual getOrder : ()Ljava/math/BigInteger;
    //   107: invokevirtual equals : (Ljava/lang/Object;)Z
    //   110: ifeq -> 140
    //   113: aload #6
    //   115: invokevirtual getCofactor : ()I
    //   118: istore #13
    //   120: aload #10
    //   122: invokevirtual getCofactor : ()I
    //   125: istore #14
    //   127: iload #13
    //   129: iload #14
    //   131: if_icmpne -> 140
    //   134: iconst_1
    //   135: istore #14
    //   137: goto -> 143
    //   140: iconst_0
    //   141: istore #14
    //   143: iload #14
    //   145: ifeq -> 787
    //   148: aload #8
    //   150: aload #9
    //   152: invokeinterface getW : ()Ljava/security/spec/ECPoint;
    //   157: invokestatic g : (Ljava/security/interfaces/ECPrivateKey;Ljava/security/spec/ECPoint;)[B
    //   160: astore #10
    //   162: aload #7
    //   164: invokeinterface getParams : ()Ljava/security/spec/ECParameterSpec;
    //   169: invokevirtual getCurve : ()Ljava/security/spec/EllipticCurve;
    //   172: astore #6
    //   174: aload #7
    //   176: invokeinterface getW : ()Ljava/security/spec/ECPoint;
    //   181: astore #8
    //   183: aload #8
    //   185: aload #6
    //   187: invokestatic f : (Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V
    //   190: aload #6
    //   192: invokestatic a : (Ljava/security/spec/EllipticCurve;)Ljava/math/BigInteger;
    //   195: getstatic java/math/BigInteger.ONE : Ljava/math/BigInteger;
    //   198: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   201: invokevirtual bitLength : ()I
    //   204: bipush #7
    //   206: iadd
    //   207: bipush #8
    //   209: idiv
    //   210: istore #13
    //   212: getstatic com/google/android/gms/internal/ads/q12.a : [I
    //   215: aload #5
    //   217: invokevirtual ordinal : ()I
    //   220: iaload
    //   221: istore #15
    //   223: iload #15
    //   225: iconst_1
    //   226: if_icmpeq -> 484
    //   229: iload #15
    //   231: iconst_2
    //   232: if_icmpeq -> 355
    //   235: iconst_3
    //   236: istore #14
    //   238: iload #15
    //   240: iconst_3
    //   241: if_icmpne -> 309
    //   244: iinc #13, 1
    //   247: iload #13
    //   249: newarray byte
    //   251: astore #5
    //   253: aload #8
    //   255: invokevirtual getAffineX : ()Ljava/math/BigInteger;
    //   258: invokevirtual toByteArray : ()[B
    //   261: astore #7
    //   263: aload #7
    //   265: iconst_0
    //   266: aload #5
    //   268: iload #13
    //   270: aload #7
    //   272: arraylength
    //   273: isub
    //   274: aload #7
    //   276: arraylength
    //   277: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   280: aload #8
    //   282: invokevirtual getAffineY : ()Ljava/math/BigInteger;
    //   285: iconst_0
    //   286: invokevirtual testBit : (I)Z
    //   289: ifeq -> 295
    //   292: goto -> 298
    //   295: iconst_2
    //   296: istore #14
    //   298: aload #5
    //   300: iconst_0
    //   301: iload #14
    //   303: i2b
    //   304: i2b
    //   305: bastore
    //   306: goto -> 560
    //   309: aload #5
    //   311: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   314: astore_1
    //   315: new java/lang/StringBuilder
    //   318: dup
    //   319: aload_1
    //   320: invokevirtual length : ()I
    //   323: bipush #15
    //   325: iadd
    //   326: invokespecial <init> : (I)V
    //   329: astore_2
    //   330: aload_2
    //   331: ldc 'invalid format:'
    //   333: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   336: pop
    //   337: aload_2
    //   338: aload_1
    //   339: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   342: pop
    //   343: new java/security/GeneralSecurityException
    //   346: dup
    //   347: aload_2
    //   348: invokevirtual toString : ()Ljava/lang/String;
    //   351: invokespecial <init> : (Ljava/lang/String;)V
    //   354: athrow
    //   355: iload #13
    //   357: iconst_2
    //   358: imul
    //   359: istore #14
    //   361: iload #14
    //   363: newarray byte
    //   365: astore #6
    //   367: aload #8
    //   369: invokevirtual getAffineX : ()Ljava/math/BigInteger;
    //   372: invokevirtual toByteArray : ()[B
    //   375: astore #7
    //   377: aload #7
    //   379: astore #5
    //   381: aload #7
    //   383: arraylength
    //   384: iload #13
    //   386: if_icmple -> 405
    //   389: aload #7
    //   391: aload #7
    //   393: arraylength
    //   394: iload #13
    //   396: isub
    //   397: aload #7
    //   399: arraylength
    //   400: invokestatic copyOfRange : ([BII)[B
    //   403: astore #5
    //   405: aload #8
    //   407: invokevirtual getAffineY : ()Ljava/math/BigInteger;
    //   410: invokevirtual toByteArray : ()[B
    //   413: astore #8
    //   415: aload #8
    //   417: astore #7
    //   419: aload #8
    //   421: arraylength
    //   422: iload #13
    //   424: if_icmple -> 443
    //   427: aload #8
    //   429: aload #8
    //   431: arraylength
    //   432: iload #13
    //   434: isub
    //   435: aload #8
    //   437: arraylength
    //   438: invokestatic copyOfRange : ([BII)[B
    //   441: astore #7
    //   443: aload #7
    //   445: iconst_0
    //   446: aload #6
    //   448: iload #14
    //   450: aload #7
    //   452: arraylength
    //   453: isub
    //   454: aload #7
    //   456: arraylength
    //   457: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   460: aload #5
    //   462: iconst_0
    //   463: aload #6
    //   465: iload #13
    //   467: aload #5
    //   469: arraylength
    //   470: isub
    //   471: aload #5
    //   473: arraylength
    //   474: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   477: aload #6
    //   479: astore #5
    //   481: goto -> 560
    //   484: iload #13
    //   486: iconst_2
    //   487: imul
    //   488: iconst_1
    //   489: iadd
    //   490: istore #14
    //   492: iload #14
    //   494: newarray byte
    //   496: astore #5
    //   498: aload #8
    //   500: invokevirtual getAffineX : ()Ljava/math/BigInteger;
    //   503: invokevirtual toByteArray : ()[B
    //   506: astore #7
    //   508: aload #8
    //   510: invokevirtual getAffineY : ()Ljava/math/BigInteger;
    //   513: invokevirtual toByteArray : ()[B
    //   516: astore #6
    //   518: aload #6
    //   520: iconst_0
    //   521: aload #5
    //   523: iload #14
    //   525: aload #6
    //   527: arraylength
    //   528: isub
    //   529: aload #6
    //   531: arraylength
    //   532: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   535: aload #7
    //   537: iconst_0
    //   538: aload #5
    //   540: iload #13
    //   542: iconst_1
    //   543: iadd
    //   544: aload #7
    //   546: arraylength
    //   547: isub
    //   548: aload #7
    //   550: arraylength
    //   551: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   554: aload #5
    //   556: iconst_0
    //   557: iconst_4
    //   558: i2b
    //   559: bastore
    //   560: iconst_2
    //   561: anewarray [B
    //   564: dup
    //   565: iconst_0
    //   566: aload #5
    //   568: aastore
    //   569: dup
    //   570: iconst_1
    //   571: aload #10
    //   573: aastore
    //   574: invokestatic c : ([[B)[B
    //   577: astore #6
    //   579: getstatic com/google/android/gms/internal/ads/t12.d : Lcom/google/android/gms/internal/ads/t12;
    //   582: aload_1
    //   583: invokevirtual a : (Ljava/lang/String;)Ljava/lang/Object;
    //   586: checkcast javax/crypto/Mac
    //   589: astore #7
    //   591: iload #4
    //   593: aload #7
    //   595: invokevirtual getMacLength : ()I
    //   598: sipush #255
    //   601: imul
    //   602: if_icmpgt -> 777
    //   605: aload_2
    //   606: ifnull -> 634
    //   609: aload_2
    //   610: arraylength
    //   611: ifne -> 617
    //   614: goto -> 634
    //   617: aload #7
    //   619: new javax/crypto/spec/SecretKeySpec
    //   622: dup
    //   623: aload_2
    //   624: aload_1
    //   625: invokespecial <init> : ([BLjava/lang/String;)V
    //   628: invokevirtual init : (Ljava/security/Key;)V
    //   631: goto -> 654
    //   634: aload #7
    //   636: new javax/crypto/spec/SecretKeySpec
    //   639: dup
    //   640: aload #7
    //   642: invokevirtual getMacLength : ()I
    //   645: newarray byte
    //   647: aload_1
    //   648: invokespecial <init> : ([BLjava/lang/String;)V
    //   651: invokevirtual init : (Ljava/security/Key;)V
    //   654: aload #7
    //   656: aload #6
    //   658: invokevirtual doFinal : ([B)[B
    //   661: astore #6
    //   663: iload #4
    //   665: newarray byte
    //   667: astore_2
    //   668: aload #7
    //   670: new javax/crypto/spec/SecretKeySpec
    //   673: dup
    //   674: aload #6
    //   676: aload_1
    //   677: invokespecial <init> : ([BLjava/lang/String;)V
    //   680: invokevirtual init : (Ljava/security/Key;)V
    //   683: iconst_0
    //   684: newarray byte
    //   686: astore_1
    //   687: iconst_0
    //   688: istore #13
    //   690: iload #12
    //   692: istore #14
    //   694: aload #7
    //   696: aload_1
    //   697: invokevirtual update : ([B)V
    //   700: aload #7
    //   702: aload_3
    //   703: invokevirtual update : ([B)V
    //   706: aload #7
    //   708: iload #14
    //   710: i2b
    //   711: invokevirtual update : (B)V
    //   714: aload #7
    //   716: invokevirtual doFinal : ()[B
    //   719: astore_1
    //   720: aload_1
    //   721: arraylength
    //   722: iload #13
    //   724: iadd
    //   725: iload #4
    //   727: if_icmpge -> 753
    //   730: aload_1
    //   731: iconst_0
    //   732: aload_2
    //   733: iload #13
    //   735: aload_1
    //   736: arraylength
    //   737: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   740: iload #13
    //   742: aload_1
    //   743: arraylength
    //   744: iadd
    //   745: istore #13
    //   747: iinc #14, 1
    //   750: goto -> 694
    //   753: aload_1
    //   754: iconst_0
    //   755: aload_2
    //   756: iload #13
    //   758: iload #4
    //   760: iload #13
    //   762: isub
    //   763: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   766: new com/google/android/gms/internal/ads/o12
    //   769: dup
    //   770: aload #5
    //   772: aload_2
    //   773: invokespecial <init> : ([B[B)V
    //   776: areturn
    //   777: new java/security/GeneralSecurityException
    //   780: dup
    //   781: ldc 'size too large'
    //   783: invokespecial <init> : (Ljava/lang/String;)V
    //   786: athrow
    //   787: new java/security/GeneralSecurityException
    //   790: astore_1
    //   791: aload_1
    //   792: ldc 'invalid public key spec'
    //   794: invokespecial <init> : (Ljava/lang/String;)V
    //   797: aload_1
    //   798: athrow
    //   799: astore_1
    //   800: goto -> 804
    //   803: astore_1
    //   804: new java/security/GeneralSecurityException
    //   807: dup
    //   808: aload_1
    //   809: invokevirtual toString : ()Ljava/lang/String;
    //   812: invokespecial <init> : (Ljava/lang/String;)V
    //   815: astore_1
    //   816: goto -> 821
    //   819: aload_1
    //   820: athrow
    //   821: goto -> 819
    // Exception table:
    //   from	to	target	type
    //   40	73	803	java/lang/IllegalArgumentException
    //   40	73	799	java/lang/NullPointerException
    //   81	127	803	java/lang/IllegalArgumentException
    //   81	127	799	java/lang/NullPointerException
    //   787	799	803	java/lang/IllegalArgumentException
    //   787	799	799	java/lang/NullPointerException
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/l12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */