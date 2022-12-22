package com.google.android.exoplayer2.util;

import android.util.Pair;

public final class g {
  private static final byte[] a = new byte[] { 0, 0, 0, 1 };
  
  private static final int[] b = new int[] { 
      96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 
      11025, 8000, 7350 };
  
  private static final int[] c = new int[] { 
      0, 1, 2, 3, 4, 5, 6, 8, -1, -1, 
      -1, 7, 8, -1, 8, -1 };
  
  public static byte[] a(int paramInt1, int paramInt2, int paramInt3) {
    return new byte[] { (byte)(paramInt1 << 3 & 0xF8 | paramInt2 >> 1 & 0x7), (byte)(paramInt2 << 7 & 0x80 | paramInt3 << 3 & 0x78) };
  }
  
  public static String b(int paramInt1, int paramInt2, int paramInt3) {
    return String.format("avc1.%02X%02X%02X", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
  
  public static byte[] c(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte[] arrayOfByte1 = a;
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + paramInt2];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte2, arrayOfByte1.length, paramInt2);
    return arrayOfByte2;
  }
  
  private static int d(u paramu) {
    int i = paramu.h(5);
    int j = i;
    if (i == 31)
      j = paramu.h(6) + 32; 
    return j;
  }
  
  private static int e(u paramu) {
    int i = paramu.h(4);
    if (i == 15) {
      i = paramu.h(24);
    } else {
      boolean bool;
      if (i < 13) {
        bool = true;
      } else {
        bool = false;
      } 
      e.a(bool);
      i = b[i];
    } 
    return i;
  }
  
  public static Pair<Integer, Integer> f(u paramu, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic d : (Lcom/google/android/exoplayer2/util/u;)I
    //   4: istore_2
    //   5: aload_0
    //   6: invokestatic e : (Lcom/google/android/exoplayer2/util/u;)I
    //   9: istore_3
    //   10: aload_0
    //   11: iconst_4
    //   12: invokevirtual h : (I)I
    //   15: istore #4
    //   17: iload_2
    //   18: iconst_5
    //   19: if_icmpeq -> 35
    //   22: iload_2
    //   23: istore #5
    //   25: iload #4
    //   27: istore #6
    //   29: iload_2
    //   30: bipush #29
    //   32: if_icmpne -> 76
    //   35: aload_0
    //   36: invokestatic e : (Lcom/google/android/exoplayer2/util/u;)I
    //   39: istore_2
    //   40: aload_0
    //   41: invokestatic d : (Lcom/google/android/exoplayer2/util/u;)I
    //   44: istore #7
    //   46: iload #7
    //   48: istore #5
    //   50: iload_2
    //   51: istore_3
    //   52: iload #4
    //   54: istore #6
    //   56: iload #7
    //   58: bipush #22
    //   60: if_icmpne -> 76
    //   63: aload_0
    //   64: iconst_4
    //   65: invokevirtual h : (I)I
    //   68: istore #6
    //   70: iload_2
    //   71: istore_3
    //   72: iload #7
    //   74: istore #5
    //   76: iconst_1
    //   77: istore #8
    //   79: iload_1
    //   80: ifeq -> 311
    //   83: iload #5
    //   85: iconst_1
    //   86: if_icmpeq -> 198
    //   89: iload #5
    //   91: iconst_2
    //   92: if_icmpeq -> 198
    //   95: iload #5
    //   97: iconst_3
    //   98: if_icmpeq -> 198
    //   101: iload #5
    //   103: iconst_4
    //   104: if_icmpeq -> 198
    //   107: iload #5
    //   109: bipush #6
    //   111: if_icmpeq -> 198
    //   114: iload #5
    //   116: bipush #7
    //   118: if_icmpeq -> 198
    //   121: iload #5
    //   123: bipush #17
    //   125: if_icmpeq -> 198
    //   128: iload #5
    //   130: tableswitch default -> 164, 19 -> 198, 20 -> 198, 21 -> 198, 22 -> 198, 23 -> 198
    //   164: new java/lang/StringBuilder
    //   167: dup
    //   168: invokespecial <init> : ()V
    //   171: astore_0
    //   172: aload_0
    //   173: ldc 'Unsupported audio object type: '
    //   175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: pop
    //   179: aload_0
    //   180: iload #5
    //   182: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   185: pop
    //   186: new com/google/android/exoplayer2/ParserException
    //   189: dup
    //   190: aload_0
    //   191: invokevirtual toString : ()Ljava/lang/String;
    //   194: invokespecial <init> : (Ljava/lang/String;)V
    //   197: athrow
    //   198: aload_0
    //   199: iload #5
    //   201: iload #6
    //   203: invokestatic i : (Lcom/google/android/exoplayer2/util/u;II)V
    //   206: iload #5
    //   208: tableswitch default -> 252, 17 -> 255, 18 -> 252, 19 -> 255, 20 -> 255, 21 -> 255, 22 -> 255, 23 -> 255
    //   252: goto -> 311
    //   255: aload_0
    //   256: iconst_2
    //   257: invokevirtual h : (I)I
    //   260: istore #5
    //   262: iload #5
    //   264: iconst_2
    //   265: if_icmpeq -> 277
    //   268: iload #5
    //   270: iconst_3
    //   271: if_icmpeq -> 277
    //   274: goto -> 311
    //   277: new java/lang/StringBuilder
    //   280: dup
    //   281: invokespecial <init> : ()V
    //   284: astore_0
    //   285: aload_0
    //   286: ldc 'Unsupported epConfig: '
    //   288: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: pop
    //   292: aload_0
    //   293: iload #5
    //   295: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   298: pop
    //   299: new com/google/android/exoplayer2/ParserException
    //   302: dup
    //   303: aload_0
    //   304: invokevirtual toString : ()Ljava/lang/String;
    //   307: invokespecial <init> : (Ljava/lang/String;)V
    //   310: athrow
    //   311: getstatic com/google/android/exoplayer2/util/g.c : [I
    //   314: iload #6
    //   316: iaload
    //   317: istore #6
    //   319: iload #6
    //   321: iconst_m1
    //   322: if_icmpeq -> 331
    //   325: iload #8
    //   327: istore_1
    //   328: goto -> 333
    //   331: iconst_0
    //   332: istore_1
    //   333: iload_1
    //   334: invokestatic a : (Z)V
    //   337: iload_3
    //   338: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   341: iload #6
    //   343: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   346: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   349: areturn
  }
  
  public static Pair<Integer, Integer> g(byte[] paramArrayOfbyte) {
    return f(new u(paramArrayOfbyte), false);
  }
  
  public static Pair<Integer, Integer> h(byte[] paramArrayOfbyte) {
    v v = new v(paramArrayOfbyte);
    v.M(9);
    int i = v.z();
    v.M(20);
    return Pair.create(Integer.valueOf(v.D()), Integer.valueOf(i));
  }
  
  private static void i(u paramu, int paramInt1, int paramInt2) {
    paramu.q(1);
    if (paramu.g())
      paramu.q(14); 
    boolean bool = paramu.g();
    if (paramInt2 != 0) {
      if (paramInt1 == 6 || paramInt1 == 20)
        paramu.q(3); 
      if (bool) {
        if (paramInt1 == 22)
          paramu.q(16); 
        if (paramInt1 == 17 || paramInt1 == 19 || paramInt1 == 20 || paramInt1 == 23)
          paramu.q(3); 
        paramu.q(1);
      } 
      return;
    } 
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */