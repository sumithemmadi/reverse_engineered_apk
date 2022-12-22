package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;

public final class n12 {
  public static BigInteger a(EllipticCurve paramEllipticCurve) {
    ECField eCField = paramEllipticCurve.getField();
    if (eCField instanceof ECFieldFp)
      return ((ECFieldFp)eCField).getP(); 
    throw new GeneralSecurityException("Only curves over prime order fields are supported");
  }
  
  public static KeyPair b(ECParameterSpec paramECParameterSpec) {
    KeyPairGenerator keyPairGenerator = t12.h.a("EC");
    keyPairGenerator.initialize(paramECParameterSpec);
    return keyPairGenerator.generateKeyPair();
  }
  
  public static ECPublicKey c(zzehz paramzzehz, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    ECParameterSpec eCParameterSpec = d(paramzzehz);
    ECPoint eCPoint = new ECPoint(new BigInteger(1, paramArrayOfbyte1), new BigInteger(1, paramArrayOfbyte2));
    f(eCPoint, eCParameterSpec.getCurve());
    ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(eCPoint, eCParameterSpec);
    return (ECPublicKey)((KeyFactory)t12.i.a("EC")).generatePublic(eCPublicKeySpec);
  }
  
  public static ECParameterSpec d(zzehz paramzzehz) {
    int i = q12.b[paramzzehz.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i == 3)
          return e("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650"); 
        String str = String.valueOf(paramzzehz);
        StringBuilder stringBuilder = new StringBuilder(str.length() + 22);
        stringBuilder.append("curve not implemented:");
        stringBuilder.append(str);
        throw new NoSuchAlgorithmException(stringBuilder.toString());
      } 
      return e("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    } 
    return e("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
  }
  
  private static ECParameterSpec e(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
    BigInteger bigInteger1 = new BigInteger(paramString1);
    BigInteger bigInteger6 = new BigInteger(paramString2);
    BigInteger bigInteger2 = bigInteger1.subtract(new BigInteger("3"));
    BigInteger bigInteger3 = new BigInteger(paramString3, 16);
    BigInteger bigInteger4 = new BigInteger(paramString4, 16);
    BigInteger bigInteger5 = new BigInteger(paramString5, 16);
    return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger1), bigInteger2, bigInteger3), new ECPoint(bigInteger4, bigInteger5), bigInteger6, 1);
  }
  
  static void f(ECPoint paramECPoint, EllipticCurve paramEllipticCurve) {
    BigInteger bigInteger2 = a(paramEllipticCurve);
    BigInteger bigInteger3 = paramECPoint.getAffineX();
    BigInteger bigInteger1 = paramECPoint.getAffineY();
    if (bigInteger3 != null && bigInteger1 != null) {
      if (bigInteger3.signum() != -1 && bigInteger3.compareTo(bigInteger2) < 0) {
        if (bigInteger1.signum() != -1 && bigInteger1.compareTo(bigInteger2) < 0) {
          if (bigInteger1.multiply(bigInteger1).mod(bigInteger2).equals(bigInteger3.multiply(bigInteger3).add(paramEllipticCurve.getA()).multiply(bigInteger3).add(paramEllipticCurve.getB()).mod(bigInteger2)))
            return; 
          throw new GeneralSecurityException("Point is not on curve");
        } 
        throw new GeneralSecurityException("y is out of range");
      } 
      throw new GeneralSecurityException("x is out of range");
    } 
    throw new GeneralSecurityException("point is at infinity");
  }
  
  public static byte[] g(ECPrivateKey paramECPrivateKey, ECPoint paramECPoint) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: invokeinterface getParams : ()Ljava/security/spec/ECParameterSpec;
    //   7: invokevirtual getCurve : ()Ljava/security/spec/EllipticCurve;
    //   10: invokestatic f : (Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V
    //   13: new java/security/spec/ECPublicKeySpec
    //   16: dup
    //   17: aload_1
    //   18: aload_0
    //   19: invokeinterface getParams : ()Ljava/security/spec/ECParameterSpec;
    //   24: invokespecial <init> : (Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V
    //   27: astore_1
    //   28: getstatic com/google/android/gms/internal/ads/t12.i : Lcom/google/android/gms/internal/ads/t12;
    //   31: ldc 'EC'
    //   33: invokevirtual a : (Ljava/lang/String;)Ljava/lang/Object;
    //   36: checkcast java/security/KeyFactory
    //   39: aload_1
    //   40: invokevirtual generatePublic : (Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //   43: astore_1
    //   44: getstatic com/google/android/gms/internal/ads/t12.g : Lcom/google/android/gms/internal/ads/t12;
    //   47: ldc 'ECDH'
    //   49: invokevirtual a : (Ljava/lang/String;)Ljava/lang/Object;
    //   52: checkcast javax/crypto/KeyAgreement
    //   55: astore_2
    //   56: aload_2
    //   57: aload_0
    //   58: invokevirtual init : (Ljava/security/Key;)V
    //   61: aload_2
    //   62: aload_1
    //   63: iconst_1
    //   64: invokevirtual doPhase : (Ljava/security/Key;Z)Ljava/security/Key;
    //   67: pop
    //   68: aload_2
    //   69: invokevirtual generateSecret : ()[B
    //   72: astore_3
    //   73: aload_0
    //   74: invokeinterface getParams : ()Ljava/security/spec/ECParameterSpec;
    //   79: invokevirtual getCurve : ()Ljava/security/spec/EllipticCurve;
    //   82: astore_2
    //   83: new java/math/BigInteger
    //   86: astore_1
    //   87: aload_1
    //   88: iconst_1
    //   89: aload_3
    //   90: invokespecial <init> : (I[B)V
    //   93: aload_1
    //   94: invokevirtual signum : ()I
    //   97: iconst_m1
    //   98: if_icmpeq -> 636
    //   101: aload_1
    //   102: aload_2
    //   103: invokestatic a : (Ljava/security/spec/EllipticCurve;)Ljava/math/BigInteger;
    //   106: invokevirtual compareTo : (Ljava/math/BigInteger;)I
    //   109: ifge -> 636
    //   112: aload_2
    //   113: invokestatic a : (Ljava/security/spec/EllipticCurve;)Ljava/math/BigInteger;
    //   116: astore #4
    //   118: aload_2
    //   119: invokevirtual getA : ()Ljava/math/BigInteger;
    //   122: astore_0
    //   123: aload_2
    //   124: invokevirtual getB : ()Ljava/math/BigInteger;
    //   127: astore_2
    //   128: aload_1
    //   129: aload_1
    //   130: invokevirtual multiply : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   133: aload_0
    //   134: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   137: aload_1
    //   138: invokevirtual multiply : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   141: aload_2
    //   142: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   145: aload #4
    //   147: invokevirtual mod : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   150: astore_0
    //   151: aload #4
    //   153: invokevirtual signum : ()I
    //   156: iconst_1
    //   157: if_icmpne -> 623
    //   160: aload_0
    //   161: aload #4
    //   163: invokevirtual mod : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   166: astore #5
    //   168: aconst_null
    //   169: astore_1
    //   170: getstatic java/math/BigInteger.ZERO : Ljava/math/BigInteger;
    //   173: astore_0
    //   174: aload #5
    //   176: aload_0
    //   177: invokevirtual equals : (Ljava/lang/Object;)Z
    //   180: ifeq -> 186
    //   183: goto -> 600
    //   186: aload #4
    //   188: iconst_0
    //   189: invokevirtual testBit : (I)Z
    //   192: ifeq -> 227
    //   195: aload #4
    //   197: iconst_1
    //   198: invokevirtual testBit : (I)Z
    //   201: ifeq -> 227
    //   204: aload #5
    //   206: aload #4
    //   208: getstatic java/math/BigInteger.ONE : Ljava/math/BigInteger;
    //   211: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   214: iconst_2
    //   215: invokevirtual shiftRight : (I)Ljava/math/BigInteger;
    //   218: aload #4
    //   220: invokevirtual modPow : (Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   223: astore_0
    //   224: goto -> 556
    //   227: aload_1
    //   228: astore_0
    //   229: aload #4
    //   231: iconst_0
    //   232: invokevirtual testBit : (I)Z
    //   235: ifeq -> 556
    //   238: aload_1
    //   239: astore_0
    //   240: aload #4
    //   242: iconst_1
    //   243: invokevirtual testBit : (I)Z
    //   246: ifne -> 556
    //   249: getstatic java/math/BigInteger.ONE : Ljava/math/BigInteger;
    //   252: astore_0
    //   253: aload #4
    //   255: aload_0
    //   256: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   259: iconst_1
    //   260: invokevirtual shiftRight : (I)Ljava/math/BigInteger;
    //   263: astore #6
    //   265: iconst_0
    //   266: istore #7
    //   268: aload_0
    //   269: aload_0
    //   270: invokevirtual multiply : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   273: aload #5
    //   275: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   278: aload #4
    //   280: invokevirtual mod : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   283: astore #8
    //   285: aload #8
    //   287: getstatic java/math/BigInteger.ZERO : Ljava/math/BigInteger;
    //   290: invokevirtual equals : (Ljava/lang/Object;)Z
    //   293: ifeq -> 301
    //   296: aload_0
    //   297: astore_1
    //   298: goto -> 598
    //   301: aload #8
    //   303: aload #6
    //   305: aload #4
    //   307: invokevirtual modPow : (Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   310: astore_1
    //   311: getstatic java/math/BigInteger.ONE : Ljava/math/BigInteger;
    //   314: astore_2
    //   315: aload_1
    //   316: aload_2
    //   317: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   320: aload #4
    //   322: invokevirtual equals : (Ljava/lang/Object;)Z
    //   325: ifne -> 411
    //   328: aload_1
    //   329: aload_2
    //   330: invokevirtual equals : (Ljava/lang/Object;)Z
    //   333: istore #9
    //   335: iload #9
    //   337: ifeq -> 398
    //   340: aload_0
    //   341: aload_2
    //   342: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   345: astore_1
    //   346: iload #7
    //   348: iconst_1
    //   349: iadd
    //   350: istore #10
    //   352: aload_1
    //   353: astore_0
    //   354: iload #10
    //   356: istore #7
    //   358: iload #10
    //   360: sipush #128
    //   363: if_icmpne -> 268
    //   366: aload #4
    //   368: bipush #80
    //   370: invokevirtual isProbablePrime : (I)Z
    //   373: ifeq -> 385
    //   376: aload_1
    //   377: astore_0
    //   378: iload #10
    //   380: istore #7
    //   382: goto -> 268
    //   385: new java/security/InvalidAlgorithmParameterException
    //   388: astore_0
    //   389: aload_0
    //   390: ldc_w 'p is not prime'
    //   393: invokespecial <init> : (Ljava/lang/String;)V
    //   396: aload_0
    //   397: athrow
    //   398: new java/security/InvalidAlgorithmParameterException
    //   401: astore_0
    //   402: aload_0
    //   403: ldc_w 'p is not prime'
    //   406: invokespecial <init> : (Ljava/lang/String;)V
    //   409: aload_0
    //   410: athrow
    //   411: aload #4
    //   413: aload_2
    //   414: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   417: iconst_1
    //   418: invokevirtual shiftRight : (I)Ljava/math/BigInteger;
    //   421: astore #11
    //   423: aload #11
    //   425: invokevirtual bitLength : ()I
    //   428: iconst_2
    //   429: isub
    //   430: istore #7
    //   432: aload_0
    //   433: astore_1
    //   434: iload #7
    //   436: iflt -> 554
    //   439: aload_1
    //   440: aload_2
    //   441: invokevirtual multiply : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   444: astore #6
    //   446: aload_1
    //   447: aload_1
    //   448: invokevirtual multiply : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   451: aload_2
    //   452: aload_2
    //   453: invokevirtual multiply : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   456: aload #4
    //   458: invokevirtual mod : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   461: aload #8
    //   463: invokevirtual multiply : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   466: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   469: aload #4
    //   471: invokevirtual mod : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   474: astore_1
    //   475: aload #6
    //   477: aload #6
    //   479: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   482: aload #4
    //   484: invokevirtual mod : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   487: astore #6
    //   489: aload #11
    //   491: iload #7
    //   493: invokevirtual testBit : (I)Z
    //   496: ifeq -> 545
    //   499: aload_1
    //   500: aload_0
    //   501: invokevirtual multiply : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   504: aload #6
    //   506: aload #8
    //   508: invokevirtual multiply : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   511: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   514: aload #4
    //   516: invokevirtual mod : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   519: astore_2
    //   520: aload_0
    //   521: aload #6
    //   523: invokevirtual multiply : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   526: aload_1
    //   527: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   530: aload #4
    //   532: invokevirtual mod : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   535: astore #6
    //   537: aload_2
    //   538: astore_1
    //   539: aload #6
    //   541: astore_2
    //   542: goto -> 548
    //   545: aload #6
    //   547: astore_2
    //   548: iinc #7, -1
    //   551: goto -> 434
    //   554: aload_1
    //   555: astore_0
    //   556: aload_0
    //   557: astore_1
    //   558: aload_0
    //   559: ifnull -> 598
    //   562: aload_0
    //   563: aload_0
    //   564: invokevirtual multiply : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   567: aload #4
    //   569: invokevirtual mod : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   572: aload #5
    //   574: invokevirtual compareTo : (Ljava/math/BigInteger;)I
    //   577: ifne -> 585
    //   580: aload_0
    //   581: astore_1
    //   582: goto -> 598
    //   585: new java/security/GeneralSecurityException
    //   588: astore_0
    //   589: aload_0
    //   590: ldc_w 'Could not find a modular square root'
    //   593: invokespecial <init> : (Ljava/lang/String;)V
    //   596: aload_0
    //   597: athrow
    //   598: aload_1
    //   599: astore_0
    //   600: iconst_1
    //   601: aload_0
    //   602: iconst_0
    //   603: invokevirtual testBit : (I)Z
    //   606: if_icmpeq -> 621
    //   609: aload #4
    //   611: aload_0
    //   612: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   615: aload #4
    //   617: invokevirtual mod : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   620: pop
    //   621: aload_3
    //   622: areturn
    //   623: new java/security/InvalidAlgorithmParameterException
    //   626: astore_0
    //   627: aload_0
    //   628: ldc_w 'p must be positive'
    //   631: invokespecial <init> : (Ljava/lang/String;)V
    //   634: aload_0
    //   635: athrow
    //   636: new java/security/GeneralSecurityException
    //   639: astore_0
    //   640: aload_0
    //   641: ldc_w 'shared secret is out of range'
    //   644: invokespecial <init> : (Ljava/lang/String;)V
    //   647: aload_0
    //   648: athrow
    //   649: astore_0
    //   650: new java/security/GeneralSecurityException
    //   653: dup
    //   654: aload_0
    //   655: invokevirtual toString : ()Ljava/lang/String;
    //   658: invokespecial <init> : (Ljava/lang/String;)V
    //   661: astore_0
    //   662: goto -> 667
    //   665: aload_0
    //   666: athrow
    //   667: goto -> 665
    // Exception table:
    //   from	to	target	type
    //   61	168	649	java/lang/IllegalStateException
    //   170	183	649	java/lang/IllegalStateException
    //   186	224	649	java/lang/IllegalStateException
    //   229	238	649	java/lang/IllegalStateException
    //   240	265	649	java/lang/IllegalStateException
    //   268	296	649	java/lang/IllegalStateException
    //   301	335	649	java/lang/IllegalStateException
    //   340	346	649	java/lang/IllegalStateException
    //   366	376	649	java/lang/IllegalStateException
    //   385	398	649	java/lang/IllegalStateException
    //   398	411	649	java/lang/IllegalStateException
    //   411	432	649	java/lang/IllegalStateException
    //   439	537	649	java/lang/IllegalStateException
    //   562	580	649	java/lang/IllegalStateException
    //   585	598	649	java/lang/IllegalStateException
    //   600	621	649	java/lang/IllegalStateException
    //   623	636	649	java/lang/IllegalStateException
    //   636	649	649	java/lang/IllegalStateException
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/n12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */