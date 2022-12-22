package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.n;
import java.io.UnsupportedEncodingException;

public final class cm2 {
  public static int a(String paramString) {
    byte[] arrayOfByte;
    try {
      byte[] arrayOfByte1 = paramString.getBytes("UTF-8");
      arrayOfByte = arrayOfByte1;
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      arrayOfByte = arrayOfByte.getBytes();
    } 
    return n.a(arrayOfByte, 0, arrayOfByte.length, 0);
  }
  
  public static String[] b(String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: new java/util/ArrayList
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: astore_2
    //   14: aload_0
    //   15: invokevirtual toCharArray : ()[C
    //   18: astore_3
    //   19: aload_0
    //   20: invokevirtual length : ()I
    //   23: istore #4
    //   25: iconst_0
    //   26: istore #5
    //   28: iconst_0
    //   29: istore #6
    //   31: iconst_0
    //   32: istore #7
    //   34: iload #5
    //   36: iload #4
    //   38: if_icmpge -> 427
    //   41: aload_3
    //   42: iload #5
    //   44: invokestatic codePointAt : ([CI)I
    //   47: istore #8
    //   49: iload #8
    //   51: invokestatic charCount : (I)I
    //   54: istore #9
    //   56: iload #8
    //   58: invokestatic isLetter : (I)Z
    //   61: ifeq -> 233
    //   64: iload #8
    //   66: invokestatic of : (I)Ljava/lang/Character$UnicodeBlock;
    //   69: astore_0
    //   70: aload_0
    //   71: getstatic java/lang/Character$UnicodeBlock.BOPOMOFO : Ljava/lang/Character$UnicodeBlock;
    //   74: if_acmpeq -> 177
    //   77: aload_0
    //   78: getstatic java/lang/Character$UnicodeBlock.BOPOMOFO_EXTENDED : Ljava/lang/Character$UnicodeBlock;
    //   81: if_acmpeq -> 177
    //   84: aload_0
    //   85: getstatic java/lang/Character$UnicodeBlock.CJK_COMPATIBILITY : Ljava/lang/Character$UnicodeBlock;
    //   88: if_acmpeq -> 177
    //   91: aload_0
    //   92: getstatic java/lang/Character$UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS : Ljava/lang/Character$UnicodeBlock;
    //   95: if_acmpeq -> 177
    //   98: aload_0
    //   99: getstatic java/lang/Character$UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT : Ljava/lang/Character$UnicodeBlock;
    //   102: if_acmpeq -> 177
    //   105: aload_0
    //   106: getstatic java/lang/Character$UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS : Ljava/lang/Character$UnicodeBlock;
    //   109: if_acmpeq -> 177
    //   112: aload_0
    //   113: getstatic java/lang/Character$UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A : Ljava/lang/Character$UnicodeBlock;
    //   116: if_acmpeq -> 177
    //   119: aload_0
    //   120: getstatic java/lang/Character$UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B : Ljava/lang/Character$UnicodeBlock;
    //   123: if_acmpeq -> 177
    //   126: aload_0
    //   127: getstatic java/lang/Character$UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS : Ljava/lang/Character$UnicodeBlock;
    //   130: if_acmpeq -> 177
    //   133: aload_0
    //   134: getstatic java/lang/Character$UnicodeBlock.HANGUL_JAMO : Ljava/lang/Character$UnicodeBlock;
    //   137: if_acmpeq -> 177
    //   140: aload_0
    //   141: getstatic java/lang/Character$UnicodeBlock.HANGUL_SYLLABLES : Ljava/lang/Character$UnicodeBlock;
    //   144: if_acmpeq -> 177
    //   147: aload_0
    //   148: getstatic java/lang/Character$UnicodeBlock.HIRAGANA : Ljava/lang/Character$UnicodeBlock;
    //   151: if_acmpeq -> 177
    //   154: aload_0
    //   155: getstatic java/lang/Character$UnicodeBlock.KATAKANA : Ljava/lang/Character$UnicodeBlock;
    //   158: if_acmpeq -> 177
    //   161: aload_0
    //   162: getstatic java/lang/Character$UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS : Ljava/lang/Character$UnicodeBlock;
    //   165: if_acmpne -> 171
    //   168: goto -> 177
    //   171: iconst_0
    //   172: istore #10
    //   174: goto -> 180
    //   177: iconst_1
    //   178: istore #10
    //   180: iload #10
    //   182: ifne -> 227
    //   185: iload #8
    //   187: ldc 65382
    //   189: if_icmplt -> 199
    //   192: iload #8
    //   194: ldc 65437
    //   196: if_icmple -> 213
    //   199: iload #8
    //   201: ldc 65441
    //   203: if_icmplt -> 219
    //   206: iload #8
    //   208: ldc 65500
    //   210: if_icmpgt -> 219
    //   213: iconst_1
    //   214: istore #10
    //   216: goto -> 222
    //   219: iconst_0
    //   220: istore #10
    //   222: iload #10
    //   224: ifeq -> 233
    //   227: iconst_1
    //   228: istore #10
    //   230: goto -> 236
    //   233: iconst_0
    //   234: istore #10
    //   236: iload #10
    //   238: ifeq -> 293
    //   241: iload #6
    //   243: ifeq -> 266
    //   246: aload_2
    //   247: new java/lang/String
    //   250: dup
    //   251: aload_3
    //   252: iload #7
    //   254: iload #5
    //   256: iload #7
    //   258: isub
    //   259: invokespecial <init> : ([CII)V
    //   262: invokevirtual add : (Ljava/lang/Object;)Z
    //   265: pop
    //   266: aload_2
    //   267: new java/lang/String
    //   270: dup
    //   271: aload_3
    //   272: iload #5
    //   274: iload #9
    //   276: invokespecial <init> : ([CII)V
    //   279: invokevirtual add : (Ljava/lang/Object;)Z
    //   282: pop
    //   283: iconst_0
    //   284: istore #10
    //   286: iload #7
    //   288: istore #8
    //   290: goto -> 409
    //   293: iload #8
    //   295: invokestatic isLetterOrDigit : (I)Z
    //   298: ifne -> 393
    //   301: iload #8
    //   303: invokestatic getType : (I)I
    //   306: bipush #6
    //   308: if_icmpeq -> 393
    //   311: iload #8
    //   313: invokestatic getType : (I)I
    //   316: bipush #8
    //   318: if_icmpne -> 324
    //   321: goto -> 393
    //   324: iload_1
    //   325: ifeq -> 357
    //   328: iload #8
    //   330: invokestatic charCount : (I)I
    //   333: iconst_1
    //   334: if_icmpne -> 357
    //   337: iload #8
    //   339: invokestatic toChars : (I)[C
    //   342: iconst_0
    //   343: caload
    //   344: bipush #39
    //   346: if_icmpne -> 357
    //   349: iload #6
    //   351: ifne -> 402
    //   354: goto -> 398
    //   357: iload #6
    //   359: istore #10
    //   361: iload #7
    //   363: istore #8
    //   365: iload #6
    //   367: ifeq -> 409
    //   370: aload_2
    //   371: new java/lang/String
    //   374: dup
    //   375: aload_3
    //   376: iload #7
    //   378: iload #5
    //   380: iload #7
    //   382: isub
    //   383: invokespecial <init> : ([CII)V
    //   386: invokevirtual add : (Ljava/lang/Object;)Z
    //   389: pop
    //   390: goto -> 283
    //   393: iload #6
    //   395: ifne -> 402
    //   398: iload #5
    //   400: istore #7
    //   402: iconst_1
    //   403: istore #10
    //   405: iload #7
    //   407: istore #8
    //   409: iload #5
    //   411: iload #9
    //   413: iadd
    //   414: istore #5
    //   416: iload #10
    //   418: istore #6
    //   420: iload #8
    //   422: istore #7
    //   424: goto -> 34
    //   427: iload #6
    //   429: ifeq -> 452
    //   432: aload_2
    //   433: new java/lang/String
    //   436: dup
    //   437: aload_3
    //   438: iload #7
    //   440: iload #5
    //   442: iload #7
    //   444: isub
    //   445: invokespecial <init> : ([CII)V
    //   448: invokevirtual add : (Ljava/lang/Object;)Z
    //   451: pop
    //   452: aload_2
    //   453: aload_2
    //   454: invokevirtual size : ()I
    //   457: anewarray java/lang/String
    //   460: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   463: checkcast [Ljava/lang/String;
    //   466: areturn
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */