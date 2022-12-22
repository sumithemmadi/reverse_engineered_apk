package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;

public final class pj2 {
  public static final byte[] a = new byte[] { 0, 0, 0, 1 };
  
  private static final float[] b = new float[] { 
      1.0F, 1.0F, 1.0909091F, 0.90909094F, 1.4545455F, 1.2121212F, 2.1818182F, 1.8181819F, 2.909091F, 2.4242425F, 
      1.6363636F, 1.3636364F, 1.939394F, 1.6161616F, 1.3333334F, 1.5F, 2.0F };
  
  private static final Object c = new Object();
  
  private static int[] d = new int[10];
  
  public static boolean a(String paramString, byte paramByte) {
    return (("video/avc".equals(paramString) && (paramByte & 0x1F) == 6) || ("video/hevc".equals(paramString) && (paramByte & 0x7E) >> 1 == 39));
  }
  
  public static int b(byte[] paramArrayOfbyte, int paramInt) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/pj2.c : Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_2
    //   5: monitorenter
    //   6: iconst_0
    //   7: istore_3
    //   8: iconst_0
    //   9: istore #4
    //   11: iload_3
    //   12: iload_1
    //   13: if_icmpge -> 115
    //   16: iload_3
    //   17: iload_1
    //   18: iconst_2
    //   19: isub
    //   20: if_icmpge -> 58
    //   23: aload_0
    //   24: iload_3
    //   25: baload
    //   26: ifne -> 52
    //   29: aload_0
    //   30: iload_3
    //   31: iconst_1
    //   32: iadd
    //   33: baload
    //   34: ifne -> 52
    //   37: aload_0
    //   38: iload_3
    //   39: iconst_2
    //   40: iadd
    //   41: baload
    //   42: iconst_3
    //   43: if_icmpne -> 52
    //   46: iload_3
    //   47: istore #5
    //   49: goto -> 61
    //   52: iinc #3, 1
    //   55: goto -> 16
    //   58: iload_1
    //   59: istore #5
    //   61: iload #5
    //   63: istore_3
    //   64: iload #5
    //   66: iload_1
    //   67: if_icmpge -> 11
    //   70: getstatic com/google/android/gms/internal/ads/pj2.d : [I
    //   73: astore #6
    //   75: aload #6
    //   77: arraylength
    //   78: iload #4
    //   80: if_icmpgt -> 96
    //   83: aload #6
    //   85: aload #6
    //   87: arraylength
    //   88: iconst_1
    //   89: ishl
    //   90: invokestatic copyOf : ([II)[I
    //   93: putstatic com/google/android/gms/internal/ads/pj2.d : [I
    //   96: getstatic com/google/android/gms/internal/ads/pj2.d : [I
    //   99: iload #4
    //   101: iload #5
    //   103: iastore
    //   104: iload #5
    //   106: iconst_3
    //   107: iadd
    //   108: istore_3
    //   109: iinc #4, 1
    //   112: goto -> 11
    //   115: iload_1
    //   116: iload #4
    //   118: isub
    //   119: istore #7
    //   121: iconst_0
    //   122: istore_3
    //   123: iconst_0
    //   124: istore #5
    //   126: iconst_0
    //   127: istore_1
    //   128: iload_3
    //   129: iload #4
    //   131: if_icmpge -> 197
    //   134: getstatic com/google/android/gms/internal/ads/pj2.d : [I
    //   137: iload_3
    //   138: iaload
    //   139: iload_1
    //   140: isub
    //   141: istore #8
    //   143: aload_0
    //   144: iload_1
    //   145: aload_0
    //   146: iload #5
    //   148: iload #8
    //   150: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   153: iload #5
    //   155: iload #8
    //   157: iadd
    //   158: istore #5
    //   160: iload #5
    //   162: iconst_1
    //   163: iadd
    //   164: istore #9
    //   166: aload_0
    //   167: iload #5
    //   169: iconst_0
    //   170: i2b
    //   171: bastore
    //   172: iload #9
    //   174: iconst_1
    //   175: iadd
    //   176: istore #5
    //   178: aload_0
    //   179: iload #9
    //   181: iconst_0
    //   182: i2b
    //   183: bastore
    //   184: iload_1
    //   185: iload #8
    //   187: iconst_3
    //   188: iadd
    //   189: iadd
    //   190: istore_1
    //   191: iinc #3, 1
    //   194: goto -> 128
    //   197: aload_0
    //   198: iload_1
    //   199: aload_0
    //   200: iload #5
    //   202: iload #7
    //   204: iload #5
    //   206: isub
    //   207: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   210: aload_2
    //   211: monitorexit
    //   212: iload #7
    //   214: ireturn
    //   215: astore_0
    //   216: aload_2
    //   217: monitorexit
    //   218: goto -> 223
    //   221: aload_0
    //   222: athrow
    //   223: goto -> 221
    // Exception table:
    //   from	to	target	type
    //   70	96	215	finally
    //   96	104	215	finally
    //   134	153	215	finally
    //   197	212	215	finally
    //   216	218	215	finally
  }
  
  public static oj2 c(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int j;
    boolean bool2;
    tj2 tj2 = new tj2(paramArrayOfbyte, paramInt1, paramInt2);
    tj2.b(8);
    paramInt1 = tj2.a(8);
    tj2.b(16);
    int i = tj2.e();
    byte b = 1;
    boolean bool1 = true;
    if (paramInt1 == 100 || paramInt1 == 110 || paramInt1 == 122 || paramInt1 == 244 || paramInt1 == 44 || paramInt1 == 83 || paramInt1 == 86 || paramInt1 == 118 || paramInt1 == 128 || paramInt1 == 138) {
      int n = tj2.e();
      if (n == 3) {
        bool2 = tj2.d();
      } else {
        bool2 = false;
      } 
      tj2.e();
      tj2.e();
      tj2.b(1);
      if (tj2.d()) {
        if (n != 3) {
          paramInt2 = 8;
        } else {
          paramInt2 = 12;
        } 
        for (byte b1 = 0; b1 < paramInt2; b1++) {
          if (tj2.d()) {
            byte b2;
            if (b1 < 6) {
              b2 = 16;
            } else {
              b2 = 64;
            } 
            byte b3 = 0;
            int i1 = 8;
            int i2 = 8;
            while (b3 < b2) {
              paramInt1 = i1;
              if (i1 != 0)
                paramInt1 = (tj2.f() + i2 + 256) % 256; 
              if (paramInt1 != 0)
                i2 = paramInt1; 
              b3++;
              i1 = paramInt1;
            } 
          } 
        } 
      } 
      j = n;
    } else {
      j = 1;
      bool2 = false;
    } 
    int m = tj2.e();
    int k = tj2.e();
    if (k == 0) {
      paramInt1 = tj2.e() + 4;
    } else {
      boolean bool;
      if (k == 1) {
        bool = tj2.d();
        tj2.f();
        tj2.f();
        long l = tj2.e();
        for (paramInt1 = 0; paramInt1 < l; paramInt1++)
          tj2.e(); 
        paramInt2 = 0;
      } else {
        paramInt1 = 0;
        bool = false;
        paramInt2 = paramInt1;
      } 
      tj2.e();
      tj2.b(1);
      int n = tj2.e();
      paramInt1 = tj2.e();
      boolean bool4 = tj2.d();
      if (!bool4)
        tj2.b(1); 
      tj2.b(1);
      int i1 = n + 1 << 4;
      int i2 = (2 - bool4) * (paramInt1 + 1) << 4;
      n = i1;
      paramInt1 = i2;
      if (tj2.d()) {
        int i3 = tj2.e();
        int i4 = tj2.e();
        int i5 = tj2.e();
        int i6 = tj2.e();
        if (!j) {
          paramInt1 = 2 - bool4;
          j = b;
        } else {
          if (j == 3) {
            paramInt1 = 1;
          } else {
            paramInt1 = 2;
          } 
          n = bool1;
          if (j == 1)
            n = 2; 
          n = (2 - bool4) * n;
          j = paramInt1;
          paramInt1 = n;
        } 
        n = i1 - (i3 + i4) * j;
        paramInt1 = i2 - (i5 + i6) * paramInt1;
      } 
      float f1 = 1.0F;
      if (tj2.d() && tj2.d()) {
        float f;
        j = tj2.a(8);
        if (j == 255) {
          i1 = tj2.a(16);
          j = tj2.a(16);
          f = f1;
          if (i1 != 0) {
            f = f1;
            if (j != 0)
              f = i1 / j; 
          } 
        } else {
          float[] arrayOfFloat = b;
          if (j < arrayOfFloat.length) {
            f = arrayOfFloat[j];
          } else {
            StringBuilder stringBuilder = new StringBuilder(46);
            stringBuilder.append("Unexpected aspect_ratio_idc value: ");
            stringBuilder.append(j);
            Log.w("NalUnitUtil", stringBuilder.toString());
            f = 1.0F;
          } 
        } 
        return new oj2(i, n, paramInt1, f, bool2, bool4, m + 4, k, paramInt2, bool);
      } 
      float f2 = 1.0F;
    } 
    boolean bool3 = false;
    paramInt2 = paramInt1;
  }
  
  public static void d(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.position();
    int j = 0;
    int k = 0;
    while (true) {
      int m = j + 1;
      if (m < i) {
        int i1;
        int n = paramByteBuffer.get(j) & 0xFF;
        if (k == 3) {
          i1 = k;
          if (n == 1) {
            i1 = k;
            if ((paramByteBuffer.get(m) & 0x1F) == 7) {
              ByteBuffer byteBuffer = paramByteBuffer.duplicate();
              byteBuffer.position(j - 3);
              byteBuffer.limit(i);
              paramByteBuffer.position(0);
              paramByteBuffer.put(byteBuffer);
              return;
            } 
          } 
        } else {
          i1 = k;
          if (n == 0)
            i1 = k + 1; 
        } 
        k = i1;
        if (n != 0)
          k = 0; 
        j = m;
        continue;
      } 
      paramByteBuffer.clear();
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */