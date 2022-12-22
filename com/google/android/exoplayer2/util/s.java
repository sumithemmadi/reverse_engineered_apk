package com.google.android.exoplayer2.util;

import java.nio.ByteBuffer;

public final class s {
  public static final byte[] a = new byte[] { 0, 0, 0, 1 };
  
  public static final float[] b = new float[] { 
      1.0F, 1.0F, 1.0909091F, 0.90909094F, 1.4545455F, 1.2121212F, 2.1818182F, 1.8181819F, 2.909091F, 2.4242425F, 
      1.6363636F, 1.3636364F, 1.939394F, 1.6161616F, 1.3333334F, 1.5F, 2.0F };
  
  private static final Object c = new Object();
  
  private static int[] d = new int[10];
  
  public static void a(boolean[] paramArrayOfboolean) {
    paramArrayOfboolean[0] = false;
    paramArrayOfboolean[1] = false;
    paramArrayOfboolean[2] = false;
  }
  
  public static void b(ByteBuffer paramByteBuffer) {
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
  
  public static int c(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean[] paramArrayOfboolean) {
    boolean bool2;
    int i = paramInt2 - paramInt1;
    boolean bool1 = false;
    if (i >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    e.f(bool2);
    if (i == 0)
      return paramInt2; 
    if (paramArrayOfboolean != null) {
      if (paramArrayOfboolean[0]) {
        a(paramArrayOfboolean);
        return paramInt1 - 3;
      } 
      if (i > 1 && paramArrayOfboolean[1] && paramArrayOfbyte[paramInt1] == 1) {
        a(paramArrayOfboolean);
        return paramInt1 - 2;
      } 
      if (i > 2 && paramArrayOfboolean[2] && paramArrayOfbyte[paramInt1] == 0 && paramArrayOfbyte[paramInt1 + 1] == 1) {
        a(paramArrayOfboolean);
        return paramInt1 - 1;
      } 
    } 
    int j = paramInt2 - 1;
    for (paramInt1 += 2; paramInt1 < j; paramInt1 += 3) {
      if ((paramArrayOfbyte[paramInt1] & 0xFE) == 0) {
        int k = paramInt1 - 2;
        if (paramArrayOfbyte[k] == 0 && paramArrayOfbyte[paramInt1 - 1] == 0 && paramArrayOfbyte[paramInt1] == 1) {
          if (paramArrayOfboolean != null)
            a(paramArrayOfboolean); 
          return k;
        } 
        paramInt1 -= 2;
      } 
    } 
    if (paramArrayOfboolean != null) {
      if ((i > 2) ? (paramArrayOfbyte[paramInt2 - 3] == 0 && paramArrayOfbyte[paramInt2 - 2] == 0 && paramArrayOfbyte[j] == 1) : ((i == 2) ? (paramArrayOfboolean[2] && paramArrayOfbyte[paramInt2 - 2] == 0 && paramArrayOfbyte[j] == 1) : (paramArrayOfboolean[1] && paramArrayOfbyte[j] == 1))) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      paramArrayOfboolean[0] = bool2;
      if ((i > 1) ? (paramArrayOfbyte[paramInt2 - 2] == 0 && paramArrayOfbyte[j] == 0) : (paramArrayOfboolean[2] && paramArrayOfbyte[j] == 0)) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      paramArrayOfboolean[1] = bool2;
      bool2 = bool1;
      if (paramArrayOfbyte[j] == 0)
        bool2 = true; 
      paramArrayOfboolean[2] = bool2;
    } 
    return paramInt2;
  }
  
  private static int d(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    while (paramInt1 < paramInt2 - 2) {
      if (paramArrayOfbyte[paramInt1] == 0 && paramArrayOfbyte[paramInt1 + 1] == 0 && paramArrayOfbyte[paramInt1 + 2] == 3)
        return paramInt1; 
      paramInt1++;
    } 
    return paramInt2;
  }
  
  public static int e(byte[] paramArrayOfbyte, int paramInt) {
    return (paramArrayOfbyte[paramInt + 3] & 0x7E) >> 1;
  }
  
  public static int f(byte[] paramArrayOfbyte, int paramInt) {
    return paramArrayOfbyte[paramInt + 3] & 0x1F;
  }
  
  public static boolean g(String paramString, byte paramByte) {
    // Byte code:
    //   0: ldc 'video/avc'
    //   2: aload_0
    //   3: invokevirtual equals : (Ljava/lang/Object;)Z
    //   6: istore_2
    //   7: iconst_1
    //   8: istore_3
    //   9: iload_2
    //   10: ifeq -> 24
    //   13: iload_3
    //   14: istore_2
    //   15: iload_1
    //   16: bipush #31
    //   18: iand
    //   19: bipush #6
    //   21: if_icmpeq -> 51
    //   24: ldc 'video/hevc'
    //   26: aload_0
    //   27: invokevirtual equals : (Ljava/lang/Object;)Z
    //   30: ifeq -> 49
    //   33: iload_1
    //   34: bipush #126
    //   36: iand
    //   37: iconst_1
    //   38: ishr
    //   39: bipush #39
    //   41: if_icmpne -> 49
    //   44: iload_3
    //   45: istore_2
    //   46: goto -> 51
    //   49: iconst_0
    //   50: istore_2
    //   51: iload_2
    //   52: ireturn
  }
  
  public static a h(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    w w = new w(paramArrayOfbyte, paramInt1, paramInt2);
    w.l(8);
    paramInt1 = w.h();
    paramInt2 = w.h();
    w.k();
    return new a(paramInt1, paramInt2, w.d());
  }
  
  public static b i(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i1;
    boolean bool1;
    w w = new w(paramArrayOfbyte, paramInt1, paramInt2);
    w.l(8);
    int i = w.e(8);
    int j = w.e(8);
    int k = w.e(8);
    int m = w.h();
    int n = 1;
    if (i == 100 || i == 110 || i == 122 || i == 244 || i == 44 || i == 83 || i == 86 || i == 118 || i == 128 || i == 138) {
      boolean bool;
      int i4 = w.h();
      if (i4 == 3) {
        bool = w.d();
      } else {
        bool = false;
      } 
      w.h();
      w.h();
      w.k();
      i1 = i4;
      bool1 = bool;
      if (w.d()) {
        if (i4 != 3) {
          paramInt1 = 8;
        } else {
          paramInt1 = 12;
        } 
        paramInt2 = 0;
        while (true) {
          i1 = i4;
          bool1 = bool;
          if (paramInt2 < paramInt1) {
            if (w.d()) {
              if (paramInt2 < 6) {
                i1 = 16;
              } else {
                i1 = 64;
              } 
              j(w, i1);
            } 
            paramInt2++;
            continue;
          } 
          break;
        } 
      } 
    } else {
      i1 = 1;
      bool1 = false;
    } 
    int i2 = w.h();
    int i3 = w.h();
    if (i3 == 0) {
      paramInt1 = w.h() + 4;
    } else {
      boolean bool;
      if (i3 == 1) {
        bool = w.d();
        w.g();
        w.g();
        long l = w.h();
        for (paramInt1 = 0; paramInt1 < l; paramInt1++)
          w.h(); 
        paramInt2 = 0;
      } else {
        paramInt1 = 0;
        bool = false;
        paramInt2 = paramInt1;
      } 
      w.h();
      w.k();
      int i4 = w.h();
      paramInt1 = w.h();
      boolean bool3 = w.d();
      if (!bool3)
        w.k(); 
      w.k();
      int i5 = (i4 + 1) * 16;
      int i6 = (2 - bool3) * (paramInt1 + 1) * 16;
      i4 = i5;
      paramInt1 = i6;
      if (w.d()) {
        int i7 = w.h();
        int i8 = w.h();
        int i9 = w.h();
        int i10 = w.h();
        if (!i1) {
          paramInt1 = 2 - bool3;
          i1 = n;
        } else {
          if (i1 == 3) {
            paramInt1 = 1;
          } else {
            paramInt1 = 2;
          } 
          i4 = 1;
          if (i1 == 1)
            i4 = 2; 
          i4 = (2 - bool3) * i4;
          i1 = paramInt1;
          paramInt1 = i4;
        } 
        i4 = i5 - (i7 + i8) * i1;
        paramInt1 = i6 - (i9 + i10) * paramInt1;
      } 
      float f1 = 1.0F;
      if (w.d() && w.d()) {
        float f;
        i1 = w.e(8);
        if (i1 == 255) {
          i1 = w.e(16);
          n = w.e(16);
          f = f1;
          if (i1 != 0) {
            f = f1;
            if (n != 0)
              f = i1 / n; 
          } 
        } else {
          float[] arrayOfFloat = b;
          if (i1 < arrayOfFloat.length) {
            f = arrayOfFloat[i1];
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected aspect_ratio_idc value: ");
            stringBuilder.append(i1);
            o.f("NalUnitUtil", stringBuilder.toString());
            f = 1.0F;
          } 
        } 
        return new b(i, j, k, m, i4, paramInt1, f, bool1, bool3, i2 + 4, i3, paramInt2, bool);
      } 
      float f2 = 1.0F;
    } 
    boolean bool2 = false;
    paramInt2 = paramInt1;
  }
  
  private static void j(w paramw, int paramInt) {
    int i = 8;
    int j = 8;
    byte b = 0;
    while (b < paramInt) {
      int k = i;
      if (i != 0)
        k = (paramw.g() + j + 256) % 256; 
      if (k != 0)
        j = k; 
      b++;
      i = k;
    } 
  }
  
  public static int k(byte[] paramArrayOfbyte, int paramInt) {
    // Byte code:
    //   0: getstatic com/google/android/exoplayer2/util/s.c : Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_2
    //   5: monitorenter
    //   6: iconst_0
    //   7: istore_3
    //   8: iconst_0
    //   9: istore #4
    //   11: iload_3
    //   12: iload_1
    //   13: if_icmpge -> 82
    //   16: aload_0
    //   17: iload_3
    //   18: iload_1
    //   19: invokestatic d : ([BII)I
    //   22: istore #5
    //   24: iload #5
    //   26: istore_3
    //   27: iload #5
    //   29: iload_1
    //   30: if_icmpge -> 11
    //   33: getstatic com/google/android/exoplayer2/util/s.d : [I
    //   36: astore #6
    //   38: aload #6
    //   40: arraylength
    //   41: iload #4
    //   43: if_icmpgt -> 59
    //   46: aload #6
    //   48: aload #6
    //   50: arraylength
    //   51: iconst_2
    //   52: imul
    //   53: invokestatic copyOf : ([II)[I
    //   56: putstatic com/google/android/exoplayer2/util/s.d : [I
    //   59: getstatic com/google/android/exoplayer2/util/s.d : [I
    //   62: iload #4
    //   64: iload #5
    //   66: iastore
    //   67: iload #5
    //   69: iconst_3
    //   70: iadd
    //   71: istore_3
    //   72: iinc #4, 1
    //   75: goto -> 11
    //   78: astore_0
    //   79: goto -> 182
    //   82: iload_1
    //   83: iload #4
    //   85: isub
    //   86: istore #7
    //   88: iconst_0
    //   89: istore_3
    //   90: iconst_0
    //   91: istore #5
    //   93: iconst_0
    //   94: istore_1
    //   95: iload_3
    //   96: iload #4
    //   98: if_icmpge -> 164
    //   101: getstatic com/google/android/exoplayer2/util/s.d : [I
    //   104: iload_3
    //   105: iaload
    //   106: iload_1
    //   107: isub
    //   108: istore #8
    //   110: aload_0
    //   111: iload_1
    //   112: aload_0
    //   113: iload #5
    //   115: iload #8
    //   117: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   120: iload #5
    //   122: iload #8
    //   124: iadd
    //   125: istore #5
    //   127: iload #5
    //   129: iconst_1
    //   130: iadd
    //   131: istore #9
    //   133: aload_0
    //   134: iload #5
    //   136: iconst_0
    //   137: i2b
    //   138: bastore
    //   139: iload #9
    //   141: iconst_1
    //   142: iadd
    //   143: istore #5
    //   145: aload_0
    //   146: iload #9
    //   148: iconst_0
    //   149: i2b
    //   150: bastore
    //   151: iload_1
    //   152: iload #8
    //   154: iconst_3
    //   155: iadd
    //   156: iadd
    //   157: istore_1
    //   158: iinc #3, 1
    //   161: goto -> 95
    //   164: aload_0
    //   165: iload_1
    //   166: aload_0
    //   167: iload #5
    //   169: iload #7
    //   171: iload #5
    //   173: isub
    //   174: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   177: aload_2
    //   178: monitorexit
    //   179: iload #7
    //   181: ireturn
    //   182: aload_2
    //   183: monitorexit
    //   184: goto -> 189
    //   187: aload_0
    //   188: athrow
    //   189: goto -> 187
    // Exception table:
    //   from	to	target	type
    //   16	24	78	finally
    //   33	59	78	finally
    //   59	67	78	finally
    //   101	120	78	finally
    //   164	179	78	finally
    //   182	184	78	finally
  }
  
  public static final class a {
    public final int a;
    
    public final int b;
    
    public final boolean c;
    
    public a(int param1Int1, int param1Int2, boolean param1Boolean) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1Boolean;
    }
  }
  
  public static final class b {
    public final int a;
    
    public final int b;
    
    public final int c;
    
    public final int d;
    
    public final int e;
    
    public final int f;
    
    public final float g;
    
    public final boolean h;
    
    public final boolean i;
    
    public final int j;
    
    public final int k;
    
    public final int l;
    
    public final boolean m;
    
    public b(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, float param1Float, boolean param1Boolean1, boolean param1Boolean2, int param1Int7, int param1Int8, int param1Int9, boolean param1Boolean3) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1Int3;
      this.d = param1Int4;
      this.e = param1Int5;
      this.f = param1Int6;
      this.g = param1Float;
      this.h = param1Boolean1;
      this.i = param1Boolean2;
      this.j = param1Int7;
      this.k = param1Int8;
      this.l = param1Int9;
      this.m = param1Boolean3;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */