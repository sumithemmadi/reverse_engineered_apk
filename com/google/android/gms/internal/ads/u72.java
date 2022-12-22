package com.google.android.gms.internal.ads;

final class u72 extends q72 {
  private static int e(byte[] paramArrayOfbyte, int paramInt1, long paramLong, int paramInt2) {
    if (paramInt2 != 0) {
      if (paramInt2 != 1) {
        if (paramInt2 == 2)
          return p72.i(paramInt1, m72.a(paramArrayOfbyte, paramLong), m72.a(paramArrayOfbyte, paramLong + 1L)); 
        throw new AssertionError();
      } 
      return p72.c(paramInt1, m72.a(paramArrayOfbyte, paramLong));
    } 
    return p72.g(paramInt1);
  }
  
  final int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iload_3
    //   1: iload #4
    //   3: ior
    //   4: aload_2
    //   5: arraylength
    //   6: iload #4
    //   8: isub
    //   9: ior
    //   10: iflt -> 683
    //   13: iload_3
    //   14: i2l
    //   15: lstore #5
    //   17: iload #4
    //   19: i2l
    //   20: lstore #7
    //   22: lload #5
    //   24: lstore #9
    //   26: iload_1
    //   27: ifeq -> 338
    //   30: lload #5
    //   32: lload #7
    //   34: lcmp
    //   35: iflt -> 40
    //   38: iload_1
    //   39: ireturn
    //   40: iload_1
    //   41: i2b
    //   42: istore #11
    //   44: iload #11
    //   46: bipush #-32
    //   48: if_icmpge -> 83
    //   51: iload #11
    //   53: bipush #-62
    //   55: if_icmplt -> 81
    //   58: lload #5
    //   60: lconst_1
    //   61: ladd
    //   62: lstore #9
    //   64: aload_2
    //   65: lload #5
    //   67: invokestatic a : ([BJ)B
    //   70: bipush #-65
    //   72: if_icmple -> 78
    //   75: goto -> 81
    //   78: goto -> 338
    //   81: iconst_m1
    //   82: ireturn
    //   83: iload #11
    //   85: bipush #-16
    //   87: if_icmpge -> 187
    //   90: iload_1
    //   91: bipush #8
    //   93: ishr
    //   94: iconst_m1
    //   95: ixor
    //   96: i2b
    //   97: istore_3
    //   98: iload_3
    //   99: istore_1
    //   100: lload #5
    //   102: lstore #12
    //   104: iload_3
    //   105: ifne -> 136
    //   108: lload #5
    //   110: lconst_1
    //   111: ladd
    //   112: lstore #12
    //   114: aload_2
    //   115: lload #5
    //   117: invokestatic a : ([BJ)B
    //   120: istore_1
    //   121: lload #12
    //   123: lload #7
    //   125: lcmp
    //   126: iflt -> 136
    //   129: iload #11
    //   131: iload_1
    //   132: invokestatic c : (II)I
    //   135: ireturn
    //   136: iload_1
    //   137: bipush #-65
    //   139: if_icmpgt -> 185
    //   142: iload #11
    //   144: bipush #-32
    //   146: if_icmpne -> 155
    //   149: iload_1
    //   150: bipush #-96
    //   152: if_icmplt -> 185
    //   155: iload #11
    //   157: bipush #-19
    //   159: if_icmpne -> 168
    //   162: iload_1
    //   163: bipush #-96
    //   165: if_icmpge -> 185
    //   168: lload #12
    //   170: lconst_1
    //   171: ladd
    //   172: lstore #9
    //   174: aload_2
    //   175: lload #12
    //   177: invokestatic a : ([BJ)B
    //   180: bipush #-65
    //   182: if_icmple -> 78
    //   185: iconst_m1
    //   186: ireturn
    //   187: iload_1
    //   188: bipush #8
    //   190: ishr
    //   191: iconst_m1
    //   192: ixor
    //   193: i2b
    //   194: istore_3
    //   195: iload_3
    //   196: ifne -> 236
    //   199: lload #5
    //   201: lconst_1
    //   202: ladd
    //   203: lstore #9
    //   205: aload_2
    //   206: lload #5
    //   208: invokestatic a : ([BJ)B
    //   211: istore_3
    //   212: lload #9
    //   214: lload #7
    //   216: lcmp
    //   217: iflt -> 227
    //   220: iload #11
    //   222: iload_3
    //   223: invokestatic c : (II)I
    //   226: ireturn
    //   227: lload #9
    //   229: lstore #5
    //   231: iconst_0
    //   232: istore_1
    //   233: goto -> 242
    //   236: iload_1
    //   237: bipush #16
    //   239: ishr
    //   240: i2b
    //   241: istore_1
    //   242: iload_1
    //   243: istore #4
    //   245: lload #5
    //   247: lstore #9
    //   249: iload_1
    //   250: ifne -> 284
    //   253: lload #5
    //   255: lconst_1
    //   256: ladd
    //   257: lstore #9
    //   259: aload_2
    //   260: lload #5
    //   262: invokestatic a : ([BJ)B
    //   265: istore #4
    //   267: lload #9
    //   269: lload #7
    //   271: lcmp
    //   272: iflt -> 284
    //   275: iload #11
    //   277: iload_3
    //   278: iload #4
    //   280: invokestatic i : (III)I
    //   283: ireturn
    //   284: iload_3
    //   285: bipush #-65
    //   287: if_icmpgt -> 336
    //   290: iload #11
    //   292: bipush #28
    //   294: ishl
    //   295: iload_3
    //   296: bipush #112
    //   298: iadd
    //   299: iadd
    //   300: bipush #30
    //   302: ishr
    //   303: ifne -> 336
    //   306: iload #4
    //   308: bipush #-65
    //   310: if_icmpgt -> 336
    //   313: aload_2
    //   314: lload #9
    //   316: invokestatic a : ([BJ)B
    //   319: bipush #-65
    //   321: if_icmple -> 327
    //   324: goto -> 336
    //   327: lload #9
    //   329: lconst_1
    //   330: ladd
    //   331: lstore #9
    //   333: goto -> 338
    //   336: iconst_m1
    //   337: ireturn
    //   338: lload #7
    //   340: lload #9
    //   342: lsub
    //   343: l2i
    //   344: istore_3
    //   345: iload_3
    //   346: bipush #16
    //   348: if_icmpge -> 356
    //   351: iconst_0
    //   352: istore_1
    //   353: goto -> 393
    //   356: lload #9
    //   358: lstore #5
    //   360: iconst_0
    //   361: istore_1
    //   362: iload_1
    //   363: iload_3
    //   364: if_icmpge -> 391
    //   367: aload_2
    //   368: lload #5
    //   370: invokestatic a : ([BJ)B
    //   373: ifge -> 379
    //   376: goto -> 393
    //   379: iinc #1, 1
    //   382: lload #5
    //   384: lconst_1
    //   385: ladd
    //   386: lstore #5
    //   388: goto -> 362
    //   391: iload_3
    //   392: istore_1
    //   393: iload_3
    //   394: iload_1
    //   395: isub
    //   396: istore_3
    //   397: lload #9
    //   399: iload_1
    //   400: i2l
    //   401: ladd
    //   402: lstore #9
    //   404: iload_3
    //   405: istore_1
    //   406: iconst_0
    //   407: istore_3
    //   408: lload #9
    //   410: lstore #5
    //   412: iload_1
    //   413: ifle -> 443
    //   416: lload #9
    //   418: lconst_1
    //   419: ladd
    //   420: lstore #5
    //   422: aload_2
    //   423: lload #9
    //   425: invokestatic a : ([BJ)B
    //   428: istore_3
    //   429: iload_3
    //   430: iflt -> 443
    //   433: iinc #1, -1
    //   436: lload #5
    //   438: lstore #9
    //   440: goto -> 408
    //   443: iload_1
    //   444: ifne -> 449
    //   447: iconst_0
    //   448: ireturn
    //   449: iinc #1, -1
    //   452: iload_3
    //   453: bipush #-32
    //   455: if_icmpge -> 498
    //   458: iload_1
    //   459: ifne -> 464
    //   462: iload_3
    //   463: ireturn
    //   464: iinc #1, -1
    //   467: iload_3
    //   468: bipush #-62
    //   470: if_icmplt -> 496
    //   473: aload_2
    //   474: lload #5
    //   476: invokestatic a : ([BJ)B
    //   479: bipush #-65
    //   481: if_icmple -> 487
    //   484: goto -> 496
    //   487: lload #5
    //   489: lconst_1
    //   490: ladd
    //   491: lstore #9
    //   493: goto -> 406
    //   496: iconst_m1
    //   497: ireturn
    //   498: iload_3
    //   499: bipush #-16
    //   501: if_icmpge -> 587
    //   504: iload_1
    //   505: iconst_2
    //   506: if_icmpge -> 518
    //   509: aload_2
    //   510: iload_3
    //   511: lload #5
    //   513: iload_1
    //   514: invokestatic e : ([BIJI)I
    //   517: ireturn
    //   518: iinc #1, -2
    //   521: lload #5
    //   523: lconst_1
    //   524: ladd
    //   525: lstore #12
    //   527: aload_2
    //   528: lload #5
    //   530: invokestatic a : ([BJ)B
    //   533: istore #4
    //   535: iload #4
    //   537: bipush #-65
    //   539: if_icmpgt -> 585
    //   542: iload_3
    //   543: bipush #-32
    //   545: if_icmpne -> 555
    //   548: iload #4
    //   550: bipush #-96
    //   552: if_icmplt -> 585
    //   555: iload_3
    //   556: bipush #-19
    //   558: if_icmpne -> 568
    //   561: iload #4
    //   563: bipush #-96
    //   565: if_icmpge -> 585
    //   568: lload #12
    //   570: lconst_1
    //   571: ladd
    //   572: lstore #9
    //   574: aload_2
    //   575: lload #12
    //   577: invokestatic a : ([BJ)B
    //   580: bipush #-65
    //   582: if_icmple -> 406
    //   585: iconst_m1
    //   586: ireturn
    //   587: iload_1
    //   588: iconst_3
    //   589: if_icmpge -> 601
    //   592: aload_2
    //   593: iload_3
    //   594: lload #5
    //   596: iload_1
    //   597: invokestatic e : ([BIJI)I
    //   600: ireturn
    //   601: iinc #1, -3
    //   604: lload #5
    //   606: lconst_1
    //   607: ladd
    //   608: lstore #9
    //   610: aload_2
    //   611: lload #5
    //   613: invokestatic a : ([BJ)B
    //   616: istore #4
    //   618: iload #4
    //   620: bipush #-65
    //   622: if_icmpgt -> 681
    //   625: iload_3
    //   626: bipush #28
    //   628: ishl
    //   629: iload #4
    //   631: bipush #112
    //   633: iadd
    //   634: iadd
    //   635: bipush #30
    //   637: ishr
    //   638: ifne -> 681
    //   641: lload #9
    //   643: lconst_1
    //   644: ladd
    //   645: lstore #5
    //   647: aload_2
    //   648: lload #9
    //   650: invokestatic a : ([BJ)B
    //   653: bipush #-65
    //   655: if_icmpgt -> 681
    //   658: aload_2
    //   659: lload #5
    //   661: invokestatic a : ([BJ)B
    //   664: bipush #-65
    //   666: if_icmple -> 672
    //   669: goto -> 681
    //   672: lload #5
    //   674: lconst_1
    //   675: ladd
    //   676: lstore #9
    //   678: goto -> 406
    //   681: iconst_m1
    //   682: ireturn
    //   683: new java/lang/ArrayIndexOutOfBoundsException
    //   686: dup
    //   687: ldc 'Array length=%d, index=%d, limit=%d'
    //   689: iconst_3
    //   690: anewarray java/lang/Object
    //   693: dup
    //   694: iconst_0
    //   695: aload_2
    //   696: arraylength
    //   697: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   700: aastore
    //   701: dup
    //   702: iconst_1
    //   703: iload_3
    //   704: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   707: aastore
    //   708: dup
    //   709: iconst_2
    //   710: iload #4
    //   712: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   715: aastore
    //   716: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   719: invokespecial <init> : (Ljava/lang/String;)V
    //   722: astore_2
    //   723: goto -> 728
    //   726: aload_2
    //   727: athrow
    //   728: goto -> 726
  }
  
  final int b(CharSequence paramCharSequence, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l1 = paramInt1;
    long l2 = paramInt2 + l1;
    int i = paramCharSequence.length();
    if (i <= paramInt2 && paramArrayOfbyte.length - paramInt2 >= paramInt1) {
      long l3;
      paramInt2 = 0;
      while (true) {
        l3 = 1L;
        if (paramInt2 < i) {
          paramInt1 = paramCharSequence.charAt(paramInt2);
          if (paramInt1 < 128) {
            m72.h(paramArrayOfbyte, l1, (byte)paramInt1);
            paramInt2++;
            l1 = 1L + l1;
            continue;
          } 
        } 
        break;
      } 
      paramInt1 = paramInt2;
      long l4 = l1;
      if (paramInt2 == i)
        return (int)l1; 
      while (paramInt1 < i) {
        char c1 = paramCharSequence.charAt(paramInt1);
        if (c1 < '' && l4 < l2) {
          m72.h(paramArrayOfbyte, l4, (byte)c1);
          long l = l3;
          l1 = l4 + l3;
          l3 = l;
        } else if (c1 < 'ࠀ' && l4 <= l2 - 2L) {
          l1 = l4 + l3;
          m72.h(paramArrayOfbyte, l4, (byte)(c1 >>> 6 | 0x3C0));
          m72.h(paramArrayOfbyte, l1, (byte)(c1 & 0x3F | 0x80));
          l1 += l3;
        } else if ((c1 < '?' || '?' < c1) && l4 <= l2 - 3L) {
          l1 = l4 + l3;
          m72.h(paramArrayOfbyte, l4, (byte)(c1 >>> 12 | 0x1E0));
          l3 = l1 + l3;
          m72.h(paramArrayOfbyte, l1, (byte)(c1 >>> 6 & 0x3F | 0x80));
          m72.h(paramArrayOfbyte, l3, (byte)(c1 & 0x3F | 0x80));
          l1 = l3 + 1L;
          l3 = 1L;
        } else if (l4 <= l2 - 4L) {
          paramInt2 = paramInt1 + 1;
          if (paramInt2 != i) {
            char c2 = paramCharSequence.charAt(paramInt2);
            if (Character.isSurrogatePair(c1, c2)) {
              paramInt1 = Character.toCodePoint(c1, c2);
              l3 = l4 + 1L;
              m72.h(paramArrayOfbyte, l4, (byte)(paramInt1 >>> 18 | 0xF0));
              l1 = l3 + 1L;
              m72.h(paramArrayOfbyte, l3, (byte)(paramInt1 >>> 12 & 0x3F | 0x80));
              l4 = l1 + 1L;
              m72.h(paramArrayOfbyte, l1, (byte)(paramInt1 >>> 6 & 0x3F | 0x80));
              l3 = 1L;
              l1 = l4 + 1L;
              m72.h(paramArrayOfbyte, l4, (byte)(paramInt1 & 0x3F | 0x80));
              paramInt1 = paramInt2;
            } else {
              paramInt1 = paramInt2;
              throw new zzeon(paramInt1 - 1, i);
            } 
          } else {
            throw new zzeon(paramInt1 - 1, i);
          } 
        } else {
          if ('?' <= c1 && c1 <= '?') {
            paramInt2 = paramInt1 + 1;
            if (paramInt2 == i || !Character.isSurrogatePair(c1, paramCharSequence.charAt(paramInt2)))
              throw new zzeon(paramInt1, i); 
          } 
          paramCharSequence = new StringBuilder(46);
          paramCharSequence.append("Failed writing ");
          paramCharSequence.append(c1);
          paramCharSequence.append(" at index ");
          paramCharSequence.append(l4);
          throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
        } 
        paramInt1++;
        l4 = l1;
      } 
      return (int)l4;
    } 
    char c = paramCharSequence.charAt(i - 1);
    paramCharSequence = new StringBuilder(37);
    paramCharSequence.append("Failed writing ");
    paramCharSequence.append(c);
    paramCharSequence.append(" at index ");
    paramCharSequence.append(paramInt1 + paramInt2);
    ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
    throw arrayIndexOutOfBoundsException;
  }
  
  final String d(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if ((paramInt1 | paramInt2 | paramArrayOfbyte.length - paramInt1 - paramInt2) >= 0) {
      int i = paramInt1 + paramInt2;
      char[] arrayOfChar = new char[paramInt2];
      paramInt2 = 0;
      while (paramInt1 < i) {
        byte b = m72.a(paramArrayOfbyte, paramInt1);
        if (r72.m(b)) {
          paramInt1++;
          r72.h(b, arrayOfChar, paramInt2);
          paramInt2++;
        } 
      } 
      int j = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = j;
      while (paramInt2 < i) {
        j = paramInt2 + 1;
        byte b = m72.a(paramArrayOfbyte, paramInt2);
        if (r72.m(b)) {
          paramInt2 = paramInt1 + 1;
          r72.h(b, arrayOfChar, paramInt1);
          paramInt1 = paramInt2;
          paramInt2 = j;
          while (paramInt2 < i) {
            b = m72.a(paramArrayOfbyte, paramInt2);
            if (r72.m(b)) {
              paramInt2++;
              r72.h(b, arrayOfChar, paramInt1);
              paramInt1++;
            } 
          } 
          continue;
        } 
        if (r72.n(b)) {
          if (j < i) {
            r72.g(b, m72.a(paramArrayOfbyte, j), arrayOfChar, paramInt1);
            paramInt2 = j + 1;
            paramInt1++;
            continue;
          } 
          throw zzelo.zzbji();
        } 
        if (r72.o(b)) {
          if (j < i - 1) {
            paramInt2 = j + 1;
            r72.f(b, m72.a(paramArrayOfbyte, j), m72.a(paramArrayOfbyte, paramInt2), arrayOfChar, paramInt1);
            paramInt2++;
            paramInt1++;
            continue;
          } 
          throw zzelo.zzbji();
        } 
        if (j < i - 2) {
          paramInt2 = j + 1;
          byte b1 = m72.a(paramArrayOfbyte, j);
          j = paramInt2 + 1;
          r72.e(b, b1, m72.a(paramArrayOfbyte, paramInt2), m72.a(paramArrayOfbyte, j), arrayOfChar, paramInt1);
          paramInt2 = j + 1;
          paramInt1 = paramInt1 + 1 + 1;
          continue;
        } 
        throw zzelo.zzbji();
      } 
      return new String(arrayOfChar, 0, paramInt1);
    } 
    ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] { Integer.valueOf(paramArrayOfbyte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
    throw arrayIndexOutOfBoundsException;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/u72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */