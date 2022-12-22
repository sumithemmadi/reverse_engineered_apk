package com.google.android.exoplayer2.text.m;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.util.SparseArray;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class b {
  private static final byte[] a = new byte[] { 0, 7, 8, 15 };
  
  private static final byte[] b = new byte[] { 0, 119, -120, -1 };
  
  private static final byte[] c = new byte[] { 
      0, 17, 34, 51, 68, 85, 102, 119, -120, -103, 
      -86, -69, -52, -35, -18, -1 };
  
  private final Paint d;
  
  private final Paint e;
  
  private final Canvas f;
  
  private final b g;
  
  private final a h;
  
  private final h i;
  
  private Bitmap j;
  
  public b(int paramInt1, int paramInt2) {
    Paint paint = new Paint();
    this.d = paint;
    paint.setStyle(Paint.Style.FILL_AND_STROKE);
    paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.SRC));
    paint.setPathEffect(null);
    paint = new Paint();
    this.e = paint;
    paint.setStyle(Paint.Style.FILL);
    paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
    paint.setPathEffect(null);
    this.f = new Canvas();
    this.g = new b(719, 575, 0, 719, 0, 575);
    this.h = new a(0, c(), d(), e());
    this.i = new h(paramInt1, paramInt2);
  }
  
  private static byte[] a(int paramInt1, int paramInt2, u paramu) {
    byte[] arrayOfByte = new byte[paramInt1];
    for (byte b1 = 0; b1 < paramInt1; b1++)
      arrayOfByte[b1] = (byte)(byte)paramu.h(paramInt2); 
    return arrayOfByte;
  }
  
  private static int[] c() {
    return new int[] { 0, -1, -16777216, -8421505 };
  }
  
  private static int[] d() {
    int[] arrayOfInt = new int[16];
    arrayOfInt[0] = 0;
    for (byte b1 = 1; b1 < 16; b1++) {
      if (b1 < 8) {
        boolean bool1;
        boolean bool2;
        boolean bool3;
        if ((b1 & 0x1) != 0) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        if ((b1 & 0x2) != 0) {
          bool2 = true;
        } else {
          bool2 = false;
        } 
        if ((b1 & 0x4) != 0) {
          bool3 = true;
        } else {
          bool3 = false;
        } 
        arrayOfInt[b1] = f(255, bool1, bool2, bool3);
      } else {
        boolean bool1;
        boolean bool2;
        byte b2 = 127;
        if ((b1 & 0x1) != 0) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        if ((b1 & 0x2) != 0) {
          bool2 = true;
        } else {
          bool2 = false;
        } 
        if ((b1 & 0x4) == 0)
          b2 = 0; 
        arrayOfInt[b1] = f(255, bool1, bool2, b2);
      } 
    } 
    return arrayOfInt;
  }
  
  private static int[] e() {
    int[] arrayOfInt = new int[256];
    arrayOfInt[0] = 0;
    for (byte b1 = 0; b1 < 'Ā'; b1++) {
      int i = 255;
      if (b1 < 8) {
        boolean bool1;
        boolean bool2;
        if ((b1 & 0x1) != 0) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        if ((b1 & 0x2) != 0) {
          bool2 = true;
        } else {
          bool2 = false;
        } 
        if ((b1 & 0x4) == 0)
          i = 0; 
        arrayOfInt[b1] = f(63, bool1, bool2, i);
      } else {
        i = b1 & 0x88;
        char c = 'ª';
        byte b2 = 85;
        if (i != 0) {
          if (i != 8) {
            c = '+';
            if (i != 128) {
              if (i == 136) {
                byte b3;
                byte b4;
                byte b5;
                if ((b1 & 0x1) != 0) {
                  i = 43;
                } else {
                  i = 0;
                } 
                if ((b1 & 0x10) != 0) {
                  b3 = 85;
                } else {
                  b3 = 0;
                } 
                if ((b1 & 0x2) != 0) {
                  b4 = 43;
                } else {
                  b4 = 0;
                } 
                if ((b1 & 0x20) != 0) {
                  b5 = 85;
                } else {
                  b5 = 0;
                } 
                if ((b1 & 0x4) == 0)
                  c = Character.MIN_VALUE; 
                if ((b1 & 0x40) == 0)
                  b2 = 0; 
                arrayOfInt[b1] = f(255, i + b3, b4 + b5, c + b2);
              } 
            } else {
              byte b3;
              byte b4;
              byte b5;
              if ((b1 & 0x1) != 0) {
                i = 43;
              } else {
                i = 0;
              } 
              if ((b1 & 0x10) != 0) {
                b3 = 85;
              } else {
                b3 = 0;
              } 
              if ((b1 & 0x2) != 0) {
                b4 = 43;
              } else {
                b4 = 0;
              } 
              if ((b1 & 0x20) != 0) {
                b5 = 85;
              } else {
                b5 = 0;
              } 
              if ((b1 & 0x4) == 0)
                c = Character.MIN_VALUE; 
              if ((b1 & 0x40) == 0)
                b2 = 0; 
              arrayOfInt[b1] = f(255, i + 127 + b3, b4 + 127 + b5, c + 127 + b2);
            } 
          } else {
            byte b3;
            byte b4;
            byte b5;
            if ((b1 & 0x1) != 0) {
              i = 85;
            } else {
              i = 0;
            } 
            if ((b1 & 0x10) != 0) {
              b3 = 170;
            } else {
              b3 = 0;
            } 
            if ((b1 & 0x2) != 0) {
              b4 = 85;
            } else {
              b4 = 0;
            } 
            if ((b1 & 0x20) != 0) {
              b5 = 170;
            } else {
              b5 = 0;
            } 
            if ((b1 & 0x4) == 0)
              b2 = 0; 
            if ((b1 & 0x40) == 0)
              c = Character.MIN_VALUE; 
            arrayOfInt[b1] = f(127, i + b3, b4 + b5, b2 + c);
          } 
        } else {
          byte b3;
          byte b4;
          byte b5;
          if ((b1 & 0x1) != 0) {
            i = 85;
          } else {
            i = 0;
          } 
          if ((b1 & 0x10) != 0) {
            b3 = 170;
          } else {
            b3 = 0;
          } 
          if ((b1 & 0x2) != 0) {
            b4 = 85;
          } else {
            b4 = 0;
          } 
          if ((b1 & 0x20) != 0) {
            b5 = 170;
          } else {
            b5 = 0;
          } 
          if ((b1 & 0x4) == 0)
            b2 = 0; 
          if ((b1 & 0x40) == 0)
            c = Character.MIN_VALUE; 
          arrayOfInt[b1] = f(255, i + b3, b4 + b5, b2 + c);
        } 
      } 
    } 
    return arrayOfInt;
  }
  
  private static int f(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return paramInt1 << 24 | paramInt2 << 16 | paramInt3 << 8 | paramInt4;
  }
  
  private static int g(u paramu, int[] paramArrayOfint, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, Paint paramPaint, Canvas paramCanvas) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #7
    //   3: iload_3
    //   4: istore #8
    //   6: iload #7
    //   8: istore_3
    //   9: aload_0
    //   10: iconst_2
    //   11: invokevirtual h : (I)I
    //   14: istore #7
    //   16: iload #7
    //   18: ifeq -> 41
    //   21: iload_3
    //   22: istore #9
    //   24: iconst_1
    //   25: istore #10
    //   27: iload #7
    //   29: istore_3
    //   30: iload #9
    //   32: istore #7
    //   34: iload #10
    //   36: istore #9
    //   38: goto -> 189
    //   41: aload_0
    //   42: invokevirtual g : ()Z
    //   45: ifeq -> 77
    //   48: aload_0
    //   49: iconst_3
    //   50: invokevirtual h : (I)I
    //   53: iconst_3
    //   54: iadd
    //   55: istore #9
    //   57: aload_0
    //   58: iconst_2
    //   59: invokevirtual h : (I)I
    //   62: istore #7
    //   64: iload_3
    //   65: istore #10
    //   67: iload #7
    //   69: istore_3
    //   70: iload #10
    //   72: istore #7
    //   74: goto -> 189
    //   77: aload_0
    //   78: invokevirtual g : ()Z
    //   81: ifeq -> 90
    //   84: iconst_0
    //   85: istore #7
    //   87: goto -> 21
    //   90: aload_0
    //   91: iconst_2
    //   92: invokevirtual h : (I)I
    //   95: istore #7
    //   97: iload #7
    //   99: ifeq -> 183
    //   102: iload #7
    //   104: iconst_1
    //   105: if_icmpeq -> 172
    //   108: iload #7
    //   110: iconst_2
    //   111: if_icmpeq -> 152
    //   114: iload #7
    //   116: iconst_3
    //   117: if_icmpeq -> 131
    //   120: iload_3
    //   121: istore #7
    //   123: iconst_0
    //   124: istore_3
    //   125: iconst_0
    //   126: istore #9
    //   128: goto -> 189
    //   131: aload_0
    //   132: bipush #8
    //   134: invokevirtual h : (I)I
    //   137: bipush #29
    //   139: iadd
    //   140: istore #9
    //   142: aload_0
    //   143: iconst_2
    //   144: invokevirtual h : (I)I
    //   147: istore #7
    //   149: goto -> 64
    //   152: aload_0
    //   153: iconst_4
    //   154: invokevirtual h : (I)I
    //   157: bipush #12
    //   159: iadd
    //   160: istore #9
    //   162: aload_0
    //   163: iconst_2
    //   164: invokevirtual h : (I)I
    //   167: istore #7
    //   169: goto -> 64
    //   172: iload_3
    //   173: istore #7
    //   175: iconst_0
    //   176: istore_3
    //   177: iconst_2
    //   178: istore #9
    //   180: goto -> 189
    //   183: iconst_1
    //   184: istore #7
    //   186: goto -> 123
    //   189: iload #9
    //   191: ifeq -> 244
    //   194: aload #5
    //   196: ifnull -> 244
    //   199: iload_3
    //   200: istore #10
    //   202: aload_2
    //   203: ifnull -> 211
    //   206: aload_2
    //   207: iload_3
    //   208: baload
    //   209: istore #10
    //   211: aload #5
    //   213: aload_1
    //   214: iload #10
    //   216: iaload
    //   217: invokevirtual setColor : (I)V
    //   220: aload #6
    //   222: iload #8
    //   224: i2f
    //   225: iload #4
    //   227: i2f
    //   228: iload #8
    //   230: iload #9
    //   232: iadd
    //   233: i2f
    //   234: iload #4
    //   236: iconst_1
    //   237: iadd
    //   238: i2f
    //   239: aload #5
    //   241: invokevirtual drawRect : (FFFFLandroid/graphics/Paint;)V
    //   244: iload #8
    //   246: iload #9
    //   248: iadd
    //   249: istore #8
    //   251: iload #7
    //   253: ifeq -> 259
    //   256: iload #8
    //   258: ireturn
    //   259: iload #7
    //   261: istore_3
    //   262: goto -> 9
  }
  
  private static int h(u paramu, int[] paramArrayOfint, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, Paint paramPaint, Canvas paramCanvas) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #7
    //   3: iload_3
    //   4: istore #8
    //   6: iload #7
    //   8: istore_3
    //   9: aload_0
    //   10: iconst_4
    //   11: invokevirtual h : (I)I
    //   14: istore #7
    //   16: iload #7
    //   18: ifeq -> 41
    //   21: iload_3
    //   22: istore #9
    //   24: iconst_1
    //   25: istore #10
    //   27: iload #7
    //   29: istore_3
    //   30: iload #9
    //   32: istore #7
    //   34: iload #10
    //   36: istore #9
    //   38: goto -> 212
    //   41: aload_0
    //   42: invokevirtual g : ()Z
    //   45: ifne -> 77
    //   48: aload_0
    //   49: iconst_3
    //   50: invokevirtual h : (I)I
    //   53: istore #9
    //   55: iload #9
    //   57: ifeq -> 71
    //   60: iload_3
    //   61: istore #7
    //   63: iinc #9, 2
    //   66: iconst_0
    //   67: istore_3
    //   68: goto -> 212
    //   71: iconst_1
    //   72: istore #7
    //   74: goto -> 146
    //   77: aload_0
    //   78: invokevirtual g : ()Z
    //   81: ifne -> 113
    //   84: aload_0
    //   85: iconst_2
    //   86: invokevirtual h : (I)I
    //   89: iconst_4
    //   90: iadd
    //   91: istore #9
    //   93: aload_0
    //   94: iconst_4
    //   95: invokevirtual h : (I)I
    //   98: istore #7
    //   100: iload_3
    //   101: istore #10
    //   103: iload #7
    //   105: istore_3
    //   106: iload #10
    //   108: istore #7
    //   110: goto -> 212
    //   113: aload_0
    //   114: iconst_2
    //   115: invokevirtual h : (I)I
    //   118: istore #7
    //   120: iload #7
    //   122: ifeq -> 206
    //   125: iload #7
    //   127: iconst_1
    //   128: if_icmpeq -> 195
    //   131: iload #7
    //   133: iconst_2
    //   134: if_icmpeq -> 175
    //   137: iload #7
    //   139: iconst_3
    //   140: if_icmpeq -> 154
    //   143: iload_3
    //   144: istore #7
    //   146: iconst_0
    //   147: istore_3
    //   148: iconst_0
    //   149: istore #9
    //   151: goto -> 212
    //   154: aload_0
    //   155: bipush #8
    //   157: invokevirtual h : (I)I
    //   160: bipush #25
    //   162: iadd
    //   163: istore #9
    //   165: aload_0
    //   166: iconst_4
    //   167: invokevirtual h : (I)I
    //   170: istore #7
    //   172: goto -> 100
    //   175: aload_0
    //   176: iconst_4
    //   177: invokevirtual h : (I)I
    //   180: bipush #9
    //   182: iadd
    //   183: istore #9
    //   185: aload_0
    //   186: iconst_4
    //   187: invokevirtual h : (I)I
    //   190: istore #7
    //   192: goto -> 100
    //   195: iload_3
    //   196: istore #7
    //   198: iconst_0
    //   199: istore_3
    //   200: iconst_2
    //   201: istore #9
    //   203: goto -> 212
    //   206: iconst_0
    //   207: istore #7
    //   209: goto -> 21
    //   212: iload #9
    //   214: ifeq -> 267
    //   217: aload #5
    //   219: ifnull -> 267
    //   222: iload_3
    //   223: istore #10
    //   225: aload_2
    //   226: ifnull -> 234
    //   229: aload_2
    //   230: iload_3
    //   231: baload
    //   232: istore #10
    //   234: aload #5
    //   236: aload_1
    //   237: iload #10
    //   239: iaload
    //   240: invokevirtual setColor : (I)V
    //   243: aload #6
    //   245: iload #8
    //   247: i2f
    //   248: iload #4
    //   250: i2f
    //   251: iload #8
    //   253: iload #9
    //   255: iadd
    //   256: i2f
    //   257: iload #4
    //   259: iconst_1
    //   260: iadd
    //   261: i2f
    //   262: aload #5
    //   264: invokevirtual drawRect : (FFFFLandroid/graphics/Paint;)V
    //   267: iload #8
    //   269: iload #9
    //   271: iadd
    //   272: istore #8
    //   274: iload #7
    //   276: ifeq -> 282
    //   279: iload #8
    //   281: ireturn
    //   282: iload #7
    //   284: istore_3
    //   285: goto -> 9
  }
  
  private static int i(u paramu, int[] paramArrayOfint, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, Paint paramPaint, Canvas paramCanvas) {
    int i = 0;
    int j = paramInt1;
    for (paramInt1 = i;; paramInt1 = i) {
      int m;
      int k = paramu.h(8);
      if (k != 0) {
        i = paramInt1;
        m = 1;
        paramInt1 = k;
      } else if (!paramu.g()) {
        m = paramu.h(7);
        if (m != 0) {
          i = paramInt1;
          paramInt1 = 0;
        } else {
          paramInt1 = 0;
          i = 1;
          m = 0;
        } 
      } else {
        m = paramu.h(7);
        k = paramu.h(8);
        i = paramInt1;
        paramInt1 = k;
      } 
      if (m != 0 && paramPaint != null) {
        k = paramInt1;
        if (paramArrayOfbyte != null)
          k = paramArrayOfbyte[paramInt1]; 
        paramPaint.setColor(paramArrayOfint[k]);
        paramCanvas.drawRect(j, paramInt2, (j + m), (paramInt2 + 1), paramPaint);
      } 
      j += m;
      if (i != 0)
        return j; 
    } 
  }
  
  private static void j(byte[] paramArrayOfbyte, int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, Paint paramPaint, Canvas paramCanvas) {
    u u = new u(paramArrayOfbyte);
    int i = paramInt2;
    byte[] arrayOfByte1 = null;
    byte[] arrayOfByte2 = arrayOfByte1;
    byte[] arrayOfByte3 = arrayOfByte2;
    int j = paramInt3;
    for (paramInt3 = i; u.b() != 0; paramInt3 = paramInt2) {
      i = u.h(8);
      if (i != 240) {
        switch (i) {
          default:
            switch (i) {
              default:
                continue;
              case 34:
                arrayOfByte2 = a(16, 8, u);
                continue;
              case 33:
                arrayOfByte1 = a(4, 8, u);
                continue;
              case 32:
                break;
            } 
            arrayOfByte3 = a(4, 4, u);
            continue;
          case 18:
            paramInt3 = i(u, paramArrayOfint, null, paramInt3, j, paramPaint, paramCanvas);
            continue;
          case 17:
            if (paramInt1 == 3) {
              if (arrayOfByte2 == null) {
                paramArrayOfbyte = c;
              } else {
                paramArrayOfbyte = arrayOfByte2;
              } 
            } else {
              paramArrayOfbyte = null;
            } 
            paramInt3 = h(u, paramArrayOfint, paramArrayOfbyte, paramInt3, j, paramPaint, paramCanvas);
            u.c();
            continue;
          case 16:
            break;
        } 
        if (paramInt1 == 3) {
          if (arrayOfByte1 == null) {
            paramArrayOfbyte = b;
          } else {
            paramArrayOfbyte = arrayOfByte1;
          } 
        } else if (paramInt1 == 2) {
          if (arrayOfByte3 == null) {
            paramArrayOfbyte = a;
          } else {
            paramArrayOfbyte = arrayOfByte3;
          } 
        } else {
          paramArrayOfbyte = null;
        } 
        paramInt3 = g(u, paramArrayOfint, paramArrayOfbyte, paramInt3, j, paramPaint, paramCanvas);
        u.c();
        continue;
      } 
      j += 2;
    } 
  }
  
  private static void k(c paramc, a parama, int paramInt1, int paramInt2, int paramInt3, Paint paramPaint, Canvas paramCanvas) {
    int[] arrayOfInt;
    if (paramInt1 == 3) {
      arrayOfInt = parama.d;
    } else if (paramInt1 == 2) {
      arrayOfInt = ((a)arrayOfInt).c;
    } else {
      arrayOfInt = ((a)arrayOfInt).b;
    } 
    j(paramc.c, arrayOfInt, paramInt1, paramInt2, paramInt3, paramPaint, paramCanvas);
    j(paramc.d, arrayOfInt, paramInt1, paramInt2, paramInt3 + 1, paramPaint, paramCanvas);
  }
  
  private static a l(u paramu, int paramInt) {
    int i = paramu.h(8);
    paramu.q(8);
    paramInt -= 2;
    int[] arrayOfInt1 = c();
    int[] arrayOfInt2 = d();
    int[] arrayOfInt3 = e();
    while (paramInt > 0) {
      int[] arrayOfInt;
      int j = paramu.h(8);
      int k = paramu.h(8);
      paramInt -= 2;
      if ((k & 0x80) != 0) {
        arrayOfInt = arrayOfInt1;
      } else if ((k & 0x40) != 0) {
        arrayOfInt = arrayOfInt2;
      } else {
        arrayOfInt = arrayOfInt3;
      } 
      if ((k & 0x1) != 0) {
        m = paramu.h(8);
        n = paramu.h(8);
        i1 = paramu.h(8);
        k = paramu.h(8);
        paramInt -= 4;
      } else {
        m = paramu.h(6);
        n = paramu.h(4);
        i1 = paramu.h(4) << 4;
        k = paramu.h(2);
        paramInt -= 2;
        k <<= 6;
        m <<= 2;
        n <<= 4;
      } 
      if (m == 0) {
        n = 0;
        i1 = 0;
        k = 255;
      } 
      k = (byte)(255 - (k & 0xFF));
      double d1 = m;
      double d2 = (n - 128);
      Double.isNaN(d2);
      Double.isNaN(d1);
      int n = (int)(d1 + 1.402D * d2);
      double d3 = (i1 - 128);
      Double.isNaN(d3);
      Double.isNaN(d1);
      Double.isNaN(d2);
      int m = (int)(d1 - 0.34414D * d3 - d2 * 0.71414D);
      Double.isNaN(d3);
      Double.isNaN(d1);
      int i1 = (int)(d1 + d3 * 1.772D);
      arrayOfInt[j] = f(k, h0.n(n, 0, 255), h0.n(m, 0, 255), h0.n(i1, 0, 255));
    } 
    return new a(i, arrayOfInt1, arrayOfInt2, arrayOfInt3);
  }
  
  private static b m(u paramu) {
    boolean bool1;
    int k;
    boolean bool2;
    int m;
    paramu.q(4);
    boolean bool = paramu.g();
    paramu.q(3);
    int i = paramu.h(16);
    int j = paramu.h(16);
    if (bool) {
      bool1 = paramu.h(16);
      k = paramu.h(16);
      bool2 = paramu.h(16);
      int n = paramu.h(16);
      m = k;
      k = n;
    } else {
      m = i;
      k = j;
      bool1 = false;
      bool2 = false;
    } 
    return new b(i, j, bool1, m, bool2, k);
  }
  
  private static c n(u paramu) {
    int i = paramu.h(16);
    paramu.q(4);
    int j = paramu.h(2);
    boolean bool = paramu.g();
    paramu.q(1);
    byte[] arrayOfByte2 = null;
    byte[] arrayOfByte3 = null;
    if (j == 1) {
      paramu.q(paramu.h(8) * 16);
    } else if (j == 0) {
      int k = paramu.h(16);
      j = paramu.h(16);
      if (k > 0) {
        arrayOfByte3 = new byte[k];
        paramu.k(arrayOfByte3, 0, k);
      } 
      arrayOfByte2 = arrayOfByte3;
      if (j > 0) {
        arrayOfByte2 = new byte[j];
        paramu.k(arrayOfByte2, 0, j);
        byte[] arrayOfByte = arrayOfByte2;
        arrayOfByte2 = arrayOfByte3;
        return new c(i, bool, arrayOfByte2, arrayOfByte);
      } 
    } 
    byte[] arrayOfByte1 = arrayOfByte2;
    return new c(i, bool, arrayOfByte2, arrayOfByte1);
  }
  
  private static d o(u paramu, int paramInt) {
    int i = paramu.h(8);
    int j = paramu.h(4);
    int k = paramu.h(2);
    paramu.q(2);
    paramInt -= 2;
    SparseArray<e> sparseArray = new SparseArray();
    while (paramInt > 0) {
      int m = paramu.h(8);
      paramu.q(8);
      int n = paramu.h(16);
      int i1 = paramu.h(16);
      paramInt -= 6;
      sparseArray.put(m, new e(n, i1));
    } 
    return new d(i, j, k, sparseArray);
  }
  
  private static f p(u paramu, int paramInt) {
    int i = paramu.h(8);
    paramu.q(4);
    boolean bool = paramu.g();
    paramu.q(3);
    int j = paramu.h(16);
    int k = paramu.h(16);
    int m = paramu.h(3);
    int n = paramu.h(3);
    paramu.q(2);
    int i1 = paramu.h(8);
    int i2 = paramu.h(8);
    int i3 = paramu.h(4);
    int i4 = paramu.h(2);
    paramu.q(2);
    paramInt -= 10;
    SparseArray<g> sparseArray = new SparseArray();
    while (paramInt > 0) {
      boolean bool1;
      boolean bool2;
      int i5 = paramu.h(16);
      int i6 = paramu.h(2);
      int i7 = paramu.h(2);
      int i8 = paramu.h(12);
      paramu.q(4);
      int i9 = paramu.h(12);
      paramInt -= 6;
      if (i6 == 1 || i6 == 2) {
        bool1 = paramu.h(8);
        bool2 = paramu.h(8);
        paramInt -= 2;
      } else {
        bool1 = false;
        bool2 = false;
      } 
      sparseArray.put(i5, new g(i6, i7, i8, i9, bool1, bool2));
    } 
    return new f(i, bool, j, k, m, n, i1, i2, i3, i4, sparseArray);
  }
  
  private static void q(u paramu, h paramh) {
    d d;
    int i = paramu.h(8);
    int j = paramu.h(16);
    int k = paramu.h(16);
    int m = paramu.d();
    if (k * 8 > paramu.b()) {
      o.f("DvbParser", "Data field length exceeds limit");
      paramu.q(paramu.b());
      return;
    } 
    switch (i) {
      case 20:
        if (j == paramh.a)
          paramh.h = m(paramu); 
        break;
      case 19:
        if (j == paramh.a) {
          c c = n(paramu);
          paramh.e.put(c.a, c);
          break;
        } 
        if (j == paramh.b) {
          c c = n(paramu);
          paramh.g.put(c.a, c);
        } 
        break;
      case 18:
        if (j == paramh.a) {
          a a1 = l(paramu, k);
          paramh.d.put(a1.a, a1);
          break;
        } 
        if (j == paramh.b) {
          a a1 = l(paramu, k);
          paramh.f.put(a1.a, a1);
        } 
        break;
      case 17:
        d = paramh.i;
        if (j == paramh.a && d != null) {
          f f = p(paramu, k);
          if (d.c == 0) {
            f f1 = (f)paramh.c.get(f.a);
            if (f1 != null)
              f.a(f1); 
          } 
          paramh.c.put(f.a, f);
        } 
        break;
      case 16:
        if (j == paramh.a) {
          d d1 = paramh.i;
          d = o(paramu, k);
          if (d.c != 0) {
            paramh.i = d;
            paramh.c.clear();
            paramh.d.clear();
            paramh.e.clear();
            break;
          } 
          if (d1 != null && d1.b != d.b)
            paramh.i = d; 
        } 
        break;
    } 
    paramu.r(m + k - paramu.d());
  }
  
  public List<com.google.android.exoplayer2.text.b> b(byte[] paramArrayOfbyte, int paramInt) {
    u u = new u(paramArrayOfbyte, paramInt);
    while (u.b() >= 48 && u.h(8) == 15)
      q(u, this.i); 
    h h1 = this.i;
    d d = h1.i;
    if (d == null)
      return Collections.emptyList(); 
    b b1 = h1.h;
    if (b1 == null)
      b1 = this.g; 
    Bitmap bitmap = this.j;
    if (bitmap == null || b1.a + 1 != bitmap.getWidth() || b1.b + 1 != this.j.getHeight()) {
      bitmap = Bitmap.createBitmap(b1.a + 1, b1.b + 1, Bitmap.Config.ARGB_8888);
      this.j = bitmap;
      this.f.setBitmap(bitmap);
    } 
    ArrayList<com.google.android.exoplayer2.text.b> arrayList = new ArrayList();
    SparseArray<e> sparseArray = d.d;
    for (byte b2 = 0; b2 < sparseArray.size(); b2++) {
      this.f.save();
      e e = (e)sparseArray.valueAt(b2);
      paramInt = sparseArray.keyAt(b2);
      f f = (f)this.i.c.get(paramInt);
      int i = e.a + b1.c;
      int j = e.b + b1.e;
      int k = Math.min(f.c + i, b1.d);
      paramInt = Math.min(f.d + j, b1.f);
      this.f.clipRect(i, j, k, paramInt);
      a a2 = (a)this.i.d.get(f.g);
      a a1 = a2;
      if (a2 == null) {
        a2 = (a)this.i.f.get(f.g);
        a1 = a2;
        if (a2 == null)
          a1 = this.h; 
      } 
      SparseArray<g> sparseArray1 = f.k;
      for (paramInt = 0; paramInt < sparseArray1.size(); paramInt++) {
        k = sparseArray1.keyAt(paramInt);
        g g = (g)sparseArray1.valueAt(paramInt);
        c c = (c)this.i.e.get(k);
        if (c == null)
          c = (c)this.i.g.get(k); 
        if (c != null) {
          Paint paint;
          if (c.b) {
            paint = null;
          } else {
            paint = this.d;
          } 
          k(c, a1, f.f, g.c + i, j + g.d, paint, this.f);
        } 
      } 
      if (f.b) {
        paramInt = f.f;
        if (paramInt == 3) {
          paramInt = a1.d[f.h];
        } else if (paramInt == 2) {
          paramInt = a1.c[f.i];
        } else {
          paramInt = a1.b[f.j];
        } 
        this.e.setColor(paramInt);
        this.f.drawRect(i, j, (f.c + i), (f.d + j), this.e);
      } 
      Bitmap bitmap1 = Bitmap.createBitmap(this.j, i, j, f.c, f.d);
      float f1 = i;
      paramInt = b1.a;
      float f2 = f1 / paramInt;
      f1 = j;
      j = b1.b;
      arrayList.add(new com.google.android.exoplayer2.text.b(bitmap1, f2, 0, f1 / j, 0, f.c / paramInt, f.d / j));
      this.f.drawColor(0, PorterDuff.Mode.CLEAR);
      this.f.restore();
    } 
    return Collections.unmodifiableList(arrayList);
  }
  
  public void r() {
    this.i.a();
  }
  
  private static final class a {
    public final int a;
    
    public final int[] b;
    
    public final int[] c;
    
    public final int[] d;
    
    public a(int param1Int, int[] param1ArrayOfint1, int[] param1ArrayOfint2, int[] param1ArrayOfint3) {
      this.a = param1Int;
      this.b = param1ArrayOfint1;
      this.c = param1ArrayOfint2;
      this.d = param1ArrayOfint3;
    }
  }
  
  private static final class b {
    public final int a;
    
    public final int b;
    
    public final int c;
    
    public final int d;
    
    public final int e;
    
    public final int f;
    
    public b(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1Int3;
      this.d = param1Int4;
      this.e = param1Int5;
      this.f = param1Int6;
    }
  }
  
  private static final class c {
    public final int a;
    
    public final boolean b;
    
    public final byte[] c;
    
    public final byte[] d;
    
    public c(int param1Int, boolean param1Boolean, byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2) {
      this.a = param1Int;
      this.b = param1Boolean;
      this.c = param1ArrayOfbyte1;
      this.d = param1ArrayOfbyte2;
    }
  }
  
  private static final class d {
    public final int a;
    
    public final int b;
    
    public final int c;
    
    public final SparseArray<b.e> d;
    
    public d(int param1Int1, int param1Int2, int param1Int3, SparseArray<b.e> param1SparseArray) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1Int3;
      this.d = param1SparseArray;
    }
  }
  
  private static final class e {
    public final int a;
    
    public final int b;
    
    public e(int param1Int1, int param1Int2) {
      this.a = param1Int1;
      this.b = param1Int2;
    }
  }
  
  private static final class f {
    public final int a;
    
    public final boolean b;
    
    public final int c;
    
    public final int d;
    
    public final int e;
    
    public final int f;
    
    public final int g;
    
    public final int h;
    
    public final int i;
    
    public final int j;
    
    public final SparseArray<b.g> k;
    
    public f(int param1Int1, boolean param1Boolean, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8, int param1Int9, SparseArray<b.g> param1SparseArray) {
      this.a = param1Int1;
      this.b = param1Boolean;
      this.c = param1Int2;
      this.d = param1Int3;
      this.e = param1Int4;
      this.f = param1Int5;
      this.g = param1Int6;
      this.h = param1Int7;
      this.i = param1Int8;
      this.j = param1Int9;
      this.k = param1SparseArray;
    }
    
    public void a(f param1f) {
      SparseArray<b.g> sparseArray = param1f.k;
      for (byte b = 0; b < sparseArray.size(); b++)
        this.k.put(sparseArray.keyAt(b), sparseArray.valueAt(b)); 
    }
  }
  
  private static final class g {
    public final int a;
    
    public final int b;
    
    public final int c;
    
    public final int d;
    
    public final int e;
    
    public final int f;
    
    public g(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1Int3;
      this.d = param1Int4;
      this.e = param1Int5;
      this.f = param1Int6;
    }
  }
  
  private static final class h {
    public final int a;
    
    public final int b;
    
    public final SparseArray<b.f> c;
    
    public final SparseArray<b.a> d;
    
    public final SparseArray<b.c> e;
    
    public final SparseArray<b.a> f;
    
    public final SparseArray<b.c> g;
    
    public b.b h;
    
    public b.d i;
    
    public h(int param1Int1, int param1Int2) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = new SparseArray();
      this.d = new SparseArray();
      this.e = new SparseArray();
      this.f = new SparseArray();
      this.g = new SparseArray();
    }
    
    public void a() {
      this.c.clear();
      this.d.clear();
      this.e.clear();
      this.f.clear();
      this.g.clear();
      this.h = null;
      this.i = null;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/m/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */