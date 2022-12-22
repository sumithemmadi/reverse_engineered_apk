package com.google.android.gms.internal.ads;

public final class ci2 {
  public static void a(long paramLong, qj2 paramqj2, ue2[] paramArrayOfue2) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual q : ()I
    //   4: iconst_1
    //   5: if_icmple -> 266
    //   8: aload_2
    //   9: invokestatic b : (Lcom/google/android/gms/internal/ads/qj2;)I
    //   12: istore #4
    //   14: aload_2
    //   15: invokestatic b : (Lcom/google/android/gms/internal/ads/qj2;)I
    //   18: istore #5
    //   20: iload #5
    //   22: iconst_m1
    //   23: if_icmpeq -> 247
    //   26: iload #5
    //   28: aload_2
    //   29: invokevirtual q : ()I
    //   32: if_icmple -> 38
    //   35: goto -> 247
    //   38: iconst_0
    //   39: istore #6
    //   41: iload #4
    //   43: iconst_4
    //   44: if_icmpne -> 127
    //   47: iload #5
    //   49: bipush #8
    //   51: if_icmpge -> 57
    //   54: goto -> 127
    //   57: aload_2
    //   58: invokevirtual b : ()I
    //   61: istore #7
    //   63: aload_2
    //   64: invokevirtual g : ()I
    //   67: istore #8
    //   69: aload_2
    //   70: invokevirtual h : ()I
    //   73: istore #4
    //   75: aload_2
    //   76: invokevirtual d : ()I
    //   79: istore #9
    //   81: aload_2
    //   82: invokevirtual g : ()I
    //   85: istore #10
    //   87: aload_2
    //   88: iload #7
    //   90: invokevirtual l : (I)V
    //   93: iload #8
    //   95: sipush #181
    //   98: if_icmpne -> 127
    //   101: iload #4
    //   103: bipush #49
    //   105: if_icmpne -> 127
    //   108: iload #9
    //   110: ldc 1195456820
    //   112: if_icmpne -> 127
    //   115: iload #10
    //   117: iconst_3
    //   118: if_icmpne -> 127
    //   121: iconst_1
    //   122: istore #4
    //   124: goto -> 130
    //   127: iconst_0
    //   128: istore #4
    //   130: iload #4
    //   132: ifeq -> 238
    //   135: aload_2
    //   136: bipush #8
    //   138: invokevirtual m : (I)V
    //   141: aload_2
    //   142: invokevirtual g : ()I
    //   145: istore #4
    //   147: aload_2
    //   148: iconst_1
    //   149: invokevirtual m : (I)V
    //   152: iload #4
    //   154: bipush #31
    //   156: iand
    //   157: iconst_3
    //   158: imul
    //   159: istore #10
    //   161: aload_2
    //   162: invokevirtual b : ()I
    //   165: istore #9
    //   167: aload_3
    //   168: arraylength
    //   169: istore #8
    //   171: iload #6
    //   173: istore #4
    //   175: iload #4
    //   177: iload #8
    //   179: if_icmpge -> 223
    //   182: aload_3
    //   183: iload #4
    //   185: aaload
    //   186: astore #11
    //   188: aload_2
    //   189: iload #9
    //   191: invokevirtual l : (I)V
    //   194: aload #11
    //   196: aload_2
    //   197: iload #10
    //   199: invokeinterface c : (Lcom/google/android/gms/internal/ads/qj2;I)V
    //   204: aload #11
    //   206: lload_0
    //   207: iconst_1
    //   208: iload #10
    //   210: iconst_0
    //   211: aconst_null
    //   212: invokeinterface b : (JIIILcom/google/android/gms/internal/ads/xe2;)V
    //   217: iinc #4, 1
    //   220: goto -> 175
    //   223: aload_2
    //   224: iload #5
    //   226: iload #10
    //   228: bipush #10
    //   230: iadd
    //   231: isub
    //   232: invokevirtual m : (I)V
    //   235: goto -> 0
    //   238: aload_2
    //   239: iload #5
    //   241: invokevirtual m : (I)V
    //   244: goto -> 0
    //   247: ldc 'CeaUtil'
    //   249: ldc 'Skipping remainder of malformed SEI NAL unit.'
    //   251: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   254: pop
    //   255: aload_2
    //   256: aload_2
    //   257: invokevirtual c : ()I
    //   260: invokevirtual l : (I)V
    //   263: goto -> 0
    //   266: return
  }
  
  private static int b(qj2 paramqj2) {
    int i = 0;
    while (true) {
      if (paramqj2.q() == 0)
        return -1; 
      int j = paramqj2.g();
      int k = i + j;
      i = k;
      if (j != 255)
        return k; 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ci2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */