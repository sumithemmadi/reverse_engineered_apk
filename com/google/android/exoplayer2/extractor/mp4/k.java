package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.c1.i;

final class k {
  private static final int[] a = new int[] { 
      1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1635148593, 1752589105, 1751479857, 1635135537, 
      1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 
      1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153 };
  
  private static boolean a(int paramInt) {
    if (paramInt >>> 8 == 3368816)
      return true; 
    int[] arrayOfInt = a;
    int i = arrayOfInt.length;
    for (byte b = 0; b < i; b++) {
      if (arrayOfInt[b] == paramInt)
        return true; 
    } 
    return false;
  }
  
  public static boolean b(i parami) {
    return c(parami, true);
  }
  
  private static boolean c(i parami, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface getLength : ()J
    //   6: lstore_2
    //   7: ldc2_w 4096
    //   10: lstore #4
    //   12: lload #4
    //   14: lstore #6
    //   16: lload_2
    //   17: ldc2_w -1
    //   20: lcmp
    //   21: ifeq -> 42
    //   24: lload_2
    //   25: ldc2_w 4096
    //   28: lcmp
    //   29: ifle -> 39
    //   32: lload #4
    //   34: lstore #6
    //   36: goto -> 42
    //   39: lload_2
    //   40: lstore #6
    //   42: lload #6
    //   44: l2i
    //   45: istore #8
    //   47: new com/google/android/exoplayer2/util/v
    //   50: dup
    //   51: bipush #64
    //   53: invokespecial <init> : (I)V
    //   56: astore #9
    //   58: iconst_0
    //   59: istore #10
    //   61: iconst_0
    //   62: istore #11
    //   64: iload #10
    //   66: iload #8
    //   68: if_icmpge -> 478
    //   71: aload #9
    //   73: bipush #8
    //   75: invokevirtual I : (I)V
    //   78: aload_0
    //   79: aload #9
    //   81: getfield a : [B
    //   84: iconst_0
    //   85: bipush #8
    //   87: invokeinterface k : ([BII)V
    //   92: aload #9
    //   94: invokevirtual B : ()J
    //   97: lstore #4
    //   99: aload #9
    //   101: invokevirtual k : ()I
    //   104: istore #12
    //   106: bipush #16
    //   108: istore #13
    //   110: lload #4
    //   112: lconst_1
    //   113: lcmp
    //   114: ifne -> 149
    //   117: aload_0
    //   118: aload #9
    //   120: getfield a : [B
    //   123: bipush #8
    //   125: bipush #8
    //   127: invokeinterface k : ([BII)V
    //   132: aload #9
    //   134: bipush #16
    //   136: invokevirtual L : (I)V
    //   139: aload #9
    //   141: invokevirtual s : ()J
    //   144: lstore #6
    //   146: goto -> 204
    //   149: lload #4
    //   151: lstore #6
    //   153: lload #4
    //   155: lconst_0
    //   156: lcmp
    //   157: ifne -> 200
    //   160: aload_0
    //   161: invokeinterface getLength : ()J
    //   166: lstore #14
    //   168: lload #4
    //   170: lstore #6
    //   172: lload #14
    //   174: ldc2_w -1
    //   177: lcmp
    //   178: ifeq -> 200
    //   181: aload_0
    //   182: invokeinterface d : ()J
    //   187: lstore #6
    //   189: bipush #8
    //   191: i2l
    //   192: lload #14
    //   194: lload #6
    //   196: lsub
    //   197: ladd
    //   198: lstore #6
    //   200: bipush #8
    //   202: istore #13
    //   204: iload #13
    //   206: i2l
    //   207: lstore #4
    //   209: lload #6
    //   211: lload #4
    //   213: lcmp
    //   214: ifge -> 219
    //   217: iconst_0
    //   218: ireturn
    //   219: iload #10
    //   221: iload #13
    //   223: iadd
    //   224: istore #13
    //   226: iload #12
    //   228: ldc 1836019574
    //   230: if_icmpne -> 280
    //   233: iload #8
    //   235: lload #6
    //   237: l2i
    //   238: iadd
    //   239: istore #8
    //   241: iload #8
    //   243: istore #10
    //   245: lload_2
    //   246: ldc2_w -1
    //   249: lcmp
    //   250: ifeq -> 269
    //   253: iload #8
    //   255: istore #10
    //   257: iload #8
    //   259: i2l
    //   260: lload_2
    //   261: lcmp
    //   262: ifle -> 269
    //   265: lload_2
    //   266: l2i
    //   267: istore #10
    //   269: iload #10
    //   271: istore #8
    //   273: iload #13
    //   275: istore #10
    //   277: goto -> 64
    //   280: iload #12
    //   282: ldc 1836019558
    //   284: if_icmpeq -> 472
    //   287: iload #12
    //   289: ldc 1836475768
    //   291: if_icmpne -> 297
    //   294: goto -> 472
    //   297: iload #13
    //   299: i2l
    //   300: lload #6
    //   302: ladd
    //   303: lload #4
    //   305: lsub
    //   306: iload #8
    //   308: i2l
    //   309: lcmp
    //   310: iflt -> 316
    //   313: goto -> 478
    //   316: lload #6
    //   318: lload #4
    //   320: lsub
    //   321: l2i
    //   322: istore #10
    //   324: iload #13
    //   326: iload #10
    //   328: iadd
    //   329: istore #16
    //   331: iload #12
    //   333: ldc 1718909296
    //   335: if_icmpne -> 440
    //   338: iload #10
    //   340: bipush #8
    //   342: if_icmpge -> 347
    //   345: iconst_0
    //   346: ireturn
    //   347: aload #9
    //   349: iload #10
    //   351: invokevirtual I : (I)V
    //   354: aload_0
    //   355: aload #9
    //   357: getfield a : [B
    //   360: iconst_0
    //   361: iload #10
    //   363: invokeinterface k : ([BII)V
    //   368: iload #10
    //   370: iconst_4
    //   371: idiv
    //   372: istore #12
    //   374: iconst_0
    //   375: istore #13
    //   377: iload #11
    //   379: istore #10
    //   381: iload #13
    //   383: iload #12
    //   385: if_icmpge -> 426
    //   388: iload #13
    //   390: iconst_1
    //   391: if_icmpne -> 403
    //   394: aload #9
    //   396: iconst_4
    //   397: invokevirtual N : (I)V
    //   400: goto -> 420
    //   403: aload #9
    //   405: invokevirtual k : ()I
    //   408: invokestatic a : (I)Z
    //   411: ifeq -> 420
    //   414: iconst_1
    //   415: istore #10
    //   417: goto -> 426
    //   420: iinc #13, 1
    //   423: goto -> 377
    //   426: iload #10
    //   428: ifne -> 433
    //   431: iconst_0
    //   432: ireturn
    //   433: iload #10
    //   435: istore #13
    //   437: goto -> 461
    //   440: iload #11
    //   442: istore #13
    //   444: iload #10
    //   446: ifeq -> 461
    //   449: aload_0
    //   450: iload #10
    //   452: invokeinterface e : (I)V
    //   457: iload #11
    //   459: istore #13
    //   461: iload #16
    //   463: istore #10
    //   465: iload #13
    //   467: istore #11
    //   469: goto -> 64
    //   472: iconst_1
    //   473: istore #17
    //   475: goto -> 481
    //   478: iconst_0
    //   479: istore #17
    //   481: iload #11
    //   483: ifeq -> 497
    //   486: iload_1
    //   487: iload #17
    //   489: if_icmpne -> 497
    //   492: iconst_1
    //   493: istore_1
    //   494: goto -> 499
    //   497: iconst_0
    //   498: istore_1
    //   499: iload_1
    //   500: ireturn
  }
  
  public static boolean d(i parami) {
    return c(parami, false);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/extractor/mp4/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */