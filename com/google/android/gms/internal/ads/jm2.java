package com.google.android.gms.internal.ads;

import java.util.ArrayList;

public final class jm2 {
  private final yl2 a;
  
  private final int b;
  
  private String c;
  
  private String d;
  
  private final boolean e;
  
  private final int f;
  
  private final int g;
  
  public jm2(int paramInt1, int paramInt2, int paramInt3) {
    this.b = paramInt1;
    this.e = false;
    if (paramInt2 > 64 || paramInt2 < 0) {
      this.f = 64;
    } else {
      this.f = paramInt2;
    } 
    if (paramInt3 <= 0) {
      this.g = 1;
    } else {
      this.g = paramInt3;
    } 
    this.a = new gm2(this.f);
  }
  
  public final String a(ArrayList<String> paramArrayList, ArrayList<vl2> paramArrayList1) {
    // Byte code:
    //   0: aload_2
    //   1: new com/google/android/gms/internal/ads/im2
    //   4: dup
    //   5: aload_0
    //   6: invokespecial <init> : (Lcom/google/android/gms/internal/ads/jm2;)V
    //   9: invokestatic sort : (Ljava/util/List;Ljava/util/Comparator;)V
    //   12: new java/util/HashSet
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: astore_3
    //   20: iconst_0
    //   21: istore #4
    //   23: iload #4
    //   25: aload_2
    //   26: invokevirtual size : ()I
    //   29: if_icmpge -> 508
    //   32: aload_1
    //   33: aload_2
    //   34: iload #4
    //   36: invokevirtual get : (I)Ljava/lang/Object;
    //   39: checkcast com/google/android/gms/internal/ads/vl2
    //   42: invokevirtual e : ()I
    //   45: invokevirtual get : (I)Ljava/lang/Object;
    //   48: checkcast java/lang/CharSequence
    //   51: getstatic java/text/Normalizer$Form.NFKC : Ljava/text/Normalizer$Form;
    //   54: invokestatic normalize : (Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;
    //   57: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   60: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   63: ldc '\\n'
    //   65: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   68: astore #5
    //   70: aload #5
    //   72: arraylength
    //   73: ifeq -> 494
    //   76: iconst_0
    //   77: istore #6
    //   79: iload #6
    //   81: aload #5
    //   83: arraylength
    //   84: if_icmpge -> 494
    //   87: aload #5
    //   89: iload #6
    //   91: aaload
    //   92: astore #7
    //   94: aload #7
    //   96: astore #8
    //   98: aload #7
    //   100: ldc '''
    //   102: invokevirtual indexOf : (Ljava/lang/String;)I
    //   105: iconst_m1
    //   106: if_icmpeq -> 295
    //   109: new java/lang/StringBuilder
    //   112: dup
    //   113: aload #7
    //   115: invokespecial <init> : (Ljava/lang/String;)V
    //   118: astore #9
    //   120: iconst_1
    //   121: istore #10
    //   123: iconst_0
    //   124: istore #11
    //   126: iload #10
    //   128: iconst_2
    //   129: iadd
    //   130: istore #12
    //   132: iload #12
    //   134: aload #9
    //   136: invokevirtual length : ()I
    //   139: if_icmpgt -> 258
    //   142: aload #9
    //   144: iload #10
    //   146: invokevirtual charAt : (I)C
    //   149: bipush #39
    //   151: if_icmpne -> 252
    //   154: aload #9
    //   156: iload #10
    //   158: iconst_1
    //   159: isub
    //   160: invokevirtual charAt : (I)C
    //   163: bipush #32
    //   165: if_icmpeq -> 237
    //   168: iload #10
    //   170: iconst_1
    //   171: iadd
    //   172: istore #11
    //   174: aload #9
    //   176: iload #11
    //   178: invokevirtual charAt : (I)C
    //   181: bipush #115
    //   183: if_icmpeq -> 198
    //   186: aload #9
    //   188: iload #11
    //   190: invokevirtual charAt : (I)C
    //   193: bipush #83
    //   195: if_icmpne -> 237
    //   198: iload #12
    //   200: aload #9
    //   202: invokevirtual length : ()I
    //   205: if_icmpeq -> 220
    //   208: aload #9
    //   210: iload #12
    //   212: invokevirtual charAt : (I)C
    //   215: bipush #32
    //   217: if_icmpne -> 237
    //   220: aload #9
    //   222: iload #10
    //   224: bipush #32
    //   226: invokevirtual insert : (IC)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: iload #12
    //   232: istore #10
    //   234: goto -> 246
    //   237: aload #9
    //   239: iload #10
    //   241: bipush #32
    //   243: invokevirtual setCharAt : (IC)V
    //   246: iconst_1
    //   247: istore #11
    //   249: goto -> 252
    //   252: iinc #10, 1
    //   255: goto -> 126
    //   258: iload #11
    //   260: ifeq -> 273
    //   263: aload #9
    //   265: invokevirtual toString : ()Ljava/lang/String;
    //   268: astore #9
    //   270: goto -> 276
    //   273: aconst_null
    //   274: astore #9
    //   276: aload #7
    //   278: astore #8
    //   280: aload #9
    //   282: ifnull -> 295
    //   285: aload_0
    //   286: aload #9
    //   288: putfield d : Ljava/lang/String;
    //   291: aload #9
    //   293: astore #8
    //   295: aload #8
    //   297: iconst_1
    //   298: invokestatic b : (Ljava/lang/String;Z)[Ljava/lang/String;
    //   301: astore #7
    //   303: aload #7
    //   305: arraylength
    //   306: aload_0
    //   307: getfield g : I
    //   310: if_icmplt -> 488
    //   313: iconst_0
    //   314: istore #10
    //   316: iload #10
    //   318: aload #7
    //   320: arraylength
    //   321: if_icmpge -> 471
    //   324: ldc ''
    //   326: astore #9
    //   328: iconst_0
    //   329: istore #11
    //   331: iload #11
    //   333: aload_0
    //   334: getfield g : I
    //   337: if_icmpge -> 436
    //   340: iload #10
    //   342: iload #11
    //   344: iadd
    //   345: istore #12
    //   347: iload #12
    //   349: aload #7
    //   351: arraylength
    //   352: if_icmplt -> 361
    //   355: iconst_0
    //   356: istore #11
    //   358: goto -> 439
    //   361: aload #9
    //   363: astore #8
    //   365: iload #11
    //   367: ifle -> 382
    //   370: aload #9
    //   372: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   375: ldc ' '
    //   377: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   380: astore #8
    //   382: aload #8
    //   384: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   387: astore #8
    //   389: aload #7
    //   391: iload #12
    //   393: aaload
    //   394: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   397: astore #9
    //   399: aload #9
    //   401: invokevirtual length : ()I
    //   404: ifeq -> 419
    //   407: aload #8
    //   409: aload #9
    //   411: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   414: astore #9
    //   416: goto -> 430
    //   419: new java/lang/String
    //   422: dup
    //   423: aload #8
    //   425: invokespecial <init> : (Ljava/lang/String;)V
    //   428: astore #9
    //   430: iinc #11, 1
    //   433: goto -> 331
    //   436: iconst_1
    //   437: istore #11
    //   439: iload #11
    //   441: ifeq -> 471
    //   444: aload_3
    //   445: aload #9
    //   447: invokevirtual add : (Ljava/lang/Object;)Z
    //   450: pop
    //   451: aload_3
    //   452: invokevirtual size : ()I
    //   455: aload_0
    //   456: getfield b : I
    //   459: if_icmplt -> 465
    //   462: goto -> 482
    //   465: iinc #10, 1
    //   468: goto -> 316
    //   471: aload_3
    //   472: invokevirtual size : ()I
    //   475: aload_0
    //   476: getfield b : I
    //   479: if_icmplt -> 488
    //   482: iconst_0
    //   483: istore #10
    //   485: goto -> 497
    //   488: iinc #6, 1
    //   491: goto -> 79
    //   494: iconst_1
    //   495: istore #10
    //   497: iload #10
    //   499: ifeq -> 508
    //   502: iinc #4, 1
    //   505: goto -> 23
    //   508: new com/google/android/gms/internal/ads/zl2
    //   511: dup
    //   512: invokespecial <init> : ()V
    //   515: astore_1
    //   516: aload_0
    //   517: ldc ''
    //   519: putfield c : Ljava/lang/String;
    //   522: aload_3
    //   523: invokevirtual iterator : ()Ljava/util/Iterator;
    //   526: astore #9
    //   528: aload #9
    //   530: invokeinterface hasNext : ()Z
    //   535: ifeq -> 571
    //   538: aload #9
    //   540: invokeinterface next : ()Ljava/lang/Object;
    //   545: checkcast java/lang/String
    //   548: astore_2
    //   549: aload_1
    //   550: aload_0
    //   551: getfield a : Lcom/google/android/gms/internal/ads/yl2;
    //   554: aload_2
    //   555: invokevirtual a : (Ljava/lang/String;)[B
    //   558: invokevirtual a : ([B)V
    //   561: goto -> 528
    //   564: astore_2
    //   565: ldc 'Error while writing hash to byteStream'
    //   567: aload_2
    //   568: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   571: aload_1
    //   572: invokevirtual toString : ()Ljava/lang/String;
    //   575: areturn
    // Exception table:
    //   from	to	target	type
    //   549	561	564	java/io/IOException
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */