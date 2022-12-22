package com.google.android.gms.internal.ads;

final class cg2 {
  private static final int[] a = new int[] { 
      wj2.k("isom"), wj2.k("iso2"), wj2.k("iso3"), wj2.k("iso4"), wj2.k("iso5"), wj2.k("iso6"), wj2.k("avc1"), wj2.k("hvc1"), wj2.k("hev1"), wj2.k("mp41"), 
      wj2.k("mp42"), wj2.k("3g2a"), wj2.k("3g2b"), wj2.k("3gr6"), wj2.k("3gs6"), wj2.k("3ge6"), wj2.k("3gg6"), wj2.k("M4V "), wj2.k("M4A "), wj2.k("f4v "), 
      wj2.k("kddi"), wj2.k("M4VP"), wj2.k("qt  "), wj2.k("MSNV") };
  
  private static boolean a(le2 paramle2, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface getLength : ()J
    //   6: lstore_2
    //   7: lload_2
    //   8: ldc2_w -1
    //   11: lcmp
    //   12: ifeq -> 26
    //   15: lload_2
    //   16: lstore #4
    //   18: lload_2
    //   19: ldc2_w 4096
    //   22: lcmp
    //   23: ifle -> 31
    //   26: ldc2_w 4096
    //   29: lstore #4
    //   31: lload #4
    //   33: l2i
    //   34: istore #6
    //   36: new com/google/android/gms/internal/ads/qj2
    //   39: dup
    //   40: bipush #64
    //   42: invokespecial <init> : (I)V
    //   45: astore #7
    //   47: iconst_0
    //   48: istore #8
    //   50: iconst_0
    //   51: istore #9
    //   53: iload #8
    //   55: iload #6
    //   57: if_icmpge -> 425
    //   60: aload #7
    //   62: bipush #8
    //   64: invokevirtual j : (I)V
    //   67: aload_0
    //   68: aload #7
    //   70: getfield a : [B
    //   73: iconst_0
    //   74: bipush #8
    //   76: invokeinterface c : ([BII)V
    //   81: aload #7
    //   83: invokevirtual s : ()J
    //   86: lstore #4
    //   88: aload #7
    //   90: invokevirtual d : ()I
    //   93: istore #10
    //   95: bipush #16
    //   97: istore #11
    //   99: lload #4
    //   101: lconst_1
    //   102: lcmp
    //   103: ifne -> 138
    //   106: aload_0
    //   107: aload #7
    //   109: getfield a : [B
    //   112: bipush #8
    //   114: bipush #8
    //   116: invokeinterface c : ([BII)V
    //   121: aload #7
    //   123: bipush #16
    //   125: invokevirtual k : (I)V
    //   128: aload #7
    //   130: invokevirtual w : ()J
    //   133: lstore #4
    //   135: goto -> 142
    //   138: bipush #8
    //   140: istore #11
    //   142: iload #11
    //   144: i2l
    //   145: lstore_2
    //   146: lload #4
    //   148: lload_2
    //   149: lcmp
    //   150: ifge -> 155
    //   153: iconst_0
    //   154: ireturn
    //   155: iload #8
    //   157: iload #11
    //   159: iadd
    //   160: istore #11
    //   162: iload #11
    //   164: istore #8
    //   166: iload #10
    //   168: getstatic com/google/android/gms/internal/ads/jf2.B : I
    //   171: if_icmpeq -> 53
    //   174: iload #10
    //   176: getstatic com/google/android/gms/internal/ads/jf2.K : I
    //   179: if_icmpeq -> 419
    //   182: iload #10
    //   184: getstatic com/google/android/gms/internal/ads/jf2.M : I
    //   187: if_icmpne -> 193
    //   190: goto -> 419
    //   193: iload #11
    //   195: i2l
    //   196: lload #4
    //   198: ladd
    //   199: lload_2
    //   200: lsub
    //   201: iload #6
    //   203: i2l
    //   204: lcmp
    //   205: ifge -> 425
    //   208: lload #4
    //   210: lload_2
    //   211: lsub
    //   212: l2i
    //   213: istore #12
    //   215: iload #11
    //   217: iload #12
    //   219: iadd
    //   220: istore #13
    //   222: iload #10
    //   224: getstatic com/google/android/gms/internal/ads/jf2.a : I
    //   227: if_icmpne -> 395
    //   230: iload #12
    //   232: bipush #8
    //   234: if_icmpge -> 239
    //   237: iconst_0
    //   238: ireturn
    //   239: aload #7
    //   241: iload #12
    //   243: invokevirtual j : (I)V
    //   246: aload_0
    //   247: aload #7
    //   249: getfield a : [B
    //   252: iconst_0
    //   253: iload #12
    //   255: invokeinterface c : ([BII)V
    //   260: iload #12
    //   262: iconst_4
    //   263: idiv
    //   264: istore #10
    //   266: iconst_0
    //   267: istore #8
    //   269: iload #9
    //   271: istore #11
    //   273: iload #8
    //   275: iload #10
    //   277: if_icmpge -> 380
    //   280: iload #8
    //   282: iconst_1
    //   283: if_icmpne -> 295
    //   286: aload #7
    //   288: iconst_4
    //   289: invokevirtual m : (I)V
    //   292: goto -> 374
    //   295: aload #7
    //   297: invokevirtual d : ()I
    //   300: istore #12
    //   302: iload #12
    //   304: bipush #8
    //   306: iushr
    //   307: ldc '3gp'
    //   309: invokestatic k : (Ljava/lang/String;)I
    //   312: if_icmpne -> 321
    //   315: iconst_1
    //   316: istore #11
    //   318: goto -> 363
    //   321: getstatic com/google/android/gms/internal/ads/cg2.a : [I
    //   324: astore #14
    //   326: aload #14
    //   328: arraylength
    //   329: istore #15
    //   331: iconst_0
    //   332: istore #11
    //   334: iload #11
    //   336: iload #15
    //   338: if_icmpge -> 360
    //   341: aload #14
    //   343: iload #11
    //   345: iaload
    //   346: iload #12
    //   348: if_icmpne -> 354
    //   351: goto -> 315
    //   354: iinc #11, 1
    //   357: goto -> 334
    //   360: iconst_0
    //   361: istore #11
    //   363: iload #11
    //   365: ifeq -> 374
    //   368: iconst_1
    //   369: istore #11
    //   371: goto -> 380
    //   374: iinc #8, 1
    //   377: goto -> 269
    //   380: iload #13
    //   382: istore #8
    //   384: iload #11
    //   386: istore #9
    //   388: iload #11
    //   390: ifne -> 53
    //   393: iconst_0
    //   394: ireturn
    //   395: iload #13
    //   397: istore #8
    //   399: iload #12
    //   401: ifeq -> 53
    //   404: aload_0
    //   405: iload #12
    //   407: invokeinterface d : (I)V
    //   412: iload #13
    //   414: istore #8
    //   416: goto -> 53
    //   419: iconst_1
    //   420: istore #16
    //   422: goto -> 428
    //   425: iconst_0
    //   426: istore #16
    //   428: iload #9
    //   430: ifeq -> 441
    //   433: iload_1
    //   434: iload #16
    //   436: if_icmpne -> 441
    //   439: iconst_1
    //   440: ireturn
    //   441: iconst_0
    //   442: ireturn
  }
  
  public static boolean b(le2 paramle2) {
    return a(paramle2, true);
  }
  
  public static boolean c(le2 paramle2) {
    return a(paramle2, false);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */