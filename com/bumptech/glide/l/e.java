package com.bumptech.glide.l;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class e implements a {
  private static final String a = "e";
  
  private int[] b;
  
  private final int[] c = new int[256];
  
  private final a.a d;
  
  private ByteBuffer e;
  
  private byte[] f;
  
  private short[] g;
  
  private byte[] h;
  
  private byte[] i;
  
  private byte[] j;
  
  private int[] k;
  
  private int l;
  
  private c m;
  
  private Bitmap n;
  
  private boolean o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private int s;
  
  private Boolean t;
  
  private Bitmap.Config u = Bitmap.Config.ARGB_8888;
  
  public e(a.a parama) {
    this.d = parama;
    this.m = new c();
  }
  
  public e(a.a parama, c paramc, ByteBuffer paramByteBuffer, int paramInt) {
    this(parama);
    r(paramc, paramByteBuffer, paramInt);
  }
  
  private int j(int paramInt1, int paramInt2, int paramInt3) {
    int i1;
    int i = paramInt1;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i2 = 0;
    while (i < this.q + paramInt1) {
      byte[] arrayOfByte = this.j;
      if (i < arrayOfByte.length && i < paramInt2) {
        int i5 = arrayOfByte[i];
        int i6 = this.b[i5 & 0xFF];
        int i7 = j;
        int i8 = k;
        int i9 = m;
        int i10 = n;
        i5 = i2;
        if (i6 != 0) {
          i7 = j + (i6 >> 24 & 0xFF);
          i8 = k + (i6 >> 16 & 0xFF);
          i9 = m + (i6 >> 8 & 0xFF);
          i10 = n + (i6 & 0xFF);
          i5 = i2 + 1;
        } 
        i++;
        j = i7;
        k = i8;
        m = i9;
        n = i10;
        i2 = i5;
      } 
    } 
    int i4 = paramInt1 + paramInt3;
    paramInt1 = i4;
    i = k;
    int i3 = j;
    while (paramInt1 < this.q + i4) {
      byte[] arrayOfByte = this.j;
      if (paramInt1 < arrayOfByte.length && paramInt1 < paramInt2) {
        int i5;
        paramInt3 = arrayOfByte[paramInt1];
        int i7 = this.b[paramInt3 & 0xFF];
        int i8 = i3;
        int i9 = i;
        j = m;
        k = n;
        int i6 = i2;
        if (i7 != 0) {
          i8 = i3 + (i7 >> 24 & 0xFF);
          i9 = i + (i7 >> 16 & 0xFF);
          j = m + (i7 >> 8 & 0xFF);
          k = n + (i7 & 0xFF);
          i5 = i2 + 1;
        } 
        paramInt1++;
        i3 = i8;
        i = i9;
        m = j;
        n = k;
        i1 = i5;
      } 
    } 
    return (i1 == 0) ? 0 : (i3 / i1 << 24 | i / i1 << 16 | m / i1 << 8 | n / i1);
  }
  
  private void k(b paramb) {
    boolean bool;
    int[] arrayOfInt1 = this.k;
    int i = paramb.d;
    int j = this.q;
    int k = i / j;
    int m = paramb.b / j;
    int n = paramb.c / j;
    int i1 = paramb.a / j;
    if (this.l == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    int i2 = this.s;
    int i3 = this.r;
    byte[] arrayOfByte = this.j;
    int[] arrayOfInt2 = this.b;
    Boolean bool1 = this.t;
    byte b1 = 8;
    byte b2 = 0;
    int i4 = 0;
    for (i = 1;; i = i6) {
      int i5;
      int i6;
      Boolean bool2;
      if (b2 < k) {
        if (paramb.e) {
          if (i4 >= k)
            if (++i != 2) {
              if (i != 3) {
                if (i == 4) {
                  i4 = 1;
                  b1 = 2;
                } 
              } else {
                i4 = 2;
                b1 = 4;
              } 
            } else {
              i4 = 4;
            }  
          i5 = i4 + b1;
          i6 = i;
        } else {
          i5 = i4;
          i4 = b2;
          i6 = i;
        } 
        i4 += m;
        if (j == 1) {
          i = 1;
        } else {
          i = 0;
        } 
        if (i4 < i3) {
          int i7 = i4 * i2;
          int i8 = i7 + i1;
          i4 = i8 + n;
          int i9 = i7 + i2;
          i7 = i4;
          if (i9 < i4)
            i7 = i9; 
          i9 = b2 * j * paramb.c;
          if (i != 0) {
            i4 = i8;
            while (true) {
              i = m;
              bool2 = bool1;
              if (i4 < i7) {
                i = arrayOfInt2[arrayOfByte[i9] & 0xFF];
                if (i != 0) {
                  arrayOfInt1[i4] = i;
                  bool2 = bool1;
                } else {
                  bool2 = bool1;
                  if (bool) {
                    bool2 = bool1;
                    if (bool1 == null)
                      bool2 = Boolean.TRUE; 
                  } 
                } 
                i9 += j;
                i4++;
                bool1 = bool2;
                continue;
              } 
              break;
            } 
          } else {
            int i10 = m;
            i4 = i8;
            m = i9;
            i = n;
            n = i4;
            while (true) {
              int i11 = m;
              i4 = i10;
              bool2 = bool1;
              m = i;
              if (n < i7) {
                m = j(i11, (i7 - i8) * j + i9, paramb.c);
                if (m != 0) {
                  arrayOfInt1[n] = m;
                  bool2 = bool1;
                } else {
                  bool2 = bool1;
                  if (bool) {
                    bool2 = bool1;
                    if (bool1 == null)
                      bool2 = Boolean.TRUE; 
                  } 
                } 
                m = i11 + j;
                n++;
                bool1 = bool2;
                continue;
              } 
              break;
            } 
            bool1 = bool2;
            b2++;
            i = i4;
            n = m;
            i4 = i5;
            m = i;
            i = i6;
          } 
        } else {
          bool2 = bool1;
          i = m;
        } 
        m = n;
        i4 = i;
      } else {
        break;
      } 
      bool1 = bool2;
      b2++;
      i = i4;
      n = m;
      i4 = i5;
      m = i;
    } 
    if (this.t == null) {
      boolean bool2;
      if (bool1 == null) {
        bool2 = false;
      } else {
        bool2 = bool1.booleanValue();
      } 
      this.t = Boolean.valueOf(bool2);
    } 
  }
  
  private void l(b paramb) {
    boolean bool1;
    boolean bool2;
    b b1 = paramb;
    int[] arrayOfInt1 = this.k;
    int i = b1.d;
    int j = b1.b;
    int k = b1.c;
    int m = b1.a;
    if (this.l == 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    int n = this.s;
    byte[] arrayOfByte = this.j;
    int[] arrayOfInt2 = this.b;
    byte b2 = 0;
    int i1 = -1;
    while (b2 < i) {
      int i2 = (b2 + j) * n;
      int i3 = i2 + m;
      int i4 = i3 + k;
      int i5 = i2 + n;
      i2 = i4;
      if (i5 < i4)
        i2 = i5; 
      i4 = paramb.c * b2;
      while (i3 < i2) {
        byte b3 = arrayOfByte[i4];
        int i6 = b3 & 0xFF;
        i5 = i1;
        if (i6 != i1) {
          i5 = arrayOfInt2[i6];
          if (i5 != 0) {
            arrayOfInt1[i3] = i5;
            i5 = i1;
          } else {
            i5 = b3;
          } 
        } 
        i4++;
        i3++;
        i1 = i5;
      } 
      b2++;
    } 
    Boolean bool = this.t;
    if ((bool != null && bool.booleanValue()) || (this.t == null && bool1 && i1 != -1)) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.t = Boolean.valueOf(bool2);
  }
  
  private void m(b paramb) {
    c c1;
    e e1 = this;
    if (paramb != null)
      e1.e.position(paramb.j); 
    if (paramb == null) {
      c1 = e1.m;
      i = c1.f;
      j = c1.g;
    } else {
      i = ((b)c1).c;
      j = ((b)c1).d;
    } 
    int k = i * j;
    byte[] arrayOfByte1 = e1.j;
    if (arrayOfByte1 == null || arrayOfByte1.length < k)
      e1.j = e1.d.e(k); 
    byte[] arrayOfByte3 = e1.j;
    if (e1.g == null)
      e1.g = new short[4096]; 
    short[] arrayOfShort = e1.g;
    if (e1.h == null)
      e1.h = new byte[4096]; 
    byte[] arrayOfByte4 = e1.h;
    if (e1.i == null)
      e1.i = new byte[4097]; 
    arrayOfByte1 = e1.i;
    int j = q();
    int m = 1 << j;
    int n = m + 2;
    int i1 = j + 1;
    int i2 = (1 << i1) - 1;
    int i3 = 0;
    for (j = 0; j < m; j++) {
      arrayOfShort[j] = (short)0;
      arrayOfByte4[j] = (byte)(byte)j;
    } 
    byte[] arrayOfByte2 = e1.f;
    int i = i1;
    j = n;
    int i4 = i2;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    byte b1 = 0;
    int i9 = -1;
    int i10 = 0;
    int i11 = 0;
    label76: while (i3 < k) {
      int i12 = i5;
      if (!i5) {
        i12 = p();
        if (i12 <= 0) {
          this.p = 3;
          break;
        } 
        i6 = 0;
      } 
      i8 += (arrayOfByte2[i6] & 0xFF) << i7;
      int i13 = i6 + 1;
      int i14 = i12 - 1;
      i12 = i7 + 8;
      i7 = j;
      j = i9;
      i6 = i10;
      i10 = i;
      i5 = i3;
      i = n;
      i9 = i7;
      n = i6;
      i7 = i12;
      while (i7 >= i10) {
        int i16;
        i6 = i8 & i4;
        i8 >>= i10;
        i7 -= i10;
        if (i6 == m) {
          i4 = i2;
          i10 = i1;
          i6 = i;
          j = -1;
          i9 = i;
          i = i6;
          continue;
        } 
        if (i6 == m + 1) {
          i12 = n;
          i16 = i9;
          n = i;
          i9 = j;
          i = i10;
          i3 = i5;
          i5 = i14;
          i6 = i13;
          j = i16;
          i10 = i12;
          continue label76;
        } 
        if (j == -1) {
          arrayOfByte3[b1] = (byte)arrayOfByte4[i6];
          b1++;
          i5++;
          j = i6;
          n = j;
          continue;
        } 
        if (i6 >= i9) {
          arrayOfByte1[i11] = (byte)(byte)n;
          n = i11 + 1;
          i11 = j;
        } else {
          i3 = i6;
          n = i11;
          i11 = i3;
        } 
        while (i11 >= m) {
          arrayOfByte1[n] = (byte)arrayOfByte4[i11];
          n++;
          i11 = arrayOfShort[i11];
        } 
        int i17 = arrayOfByte4[i11] & 0xFF;
        byte b2 = (byte)i17;
        arrayOfByte3[b1] = (byte)b2;
        i11 = n;
        while (true) {
          b1++;
          i5++;
          if (i11 > 0) {
            arrayOfByte3[b1] = (byte)arrayOfByte1[--i11];
            continue;
          } 
          i16 = i9;
          i12 = i10;
          i3 = i4;
          if (i9 < 4096) {
            arrayOfShort[i9] = (short)(short)j;
            arrayOfByte4[i9] = (byte)b2;
            j = i9 + 1;
            i16 = j;
            i12 = i10;
            i3 = i4;
            if ((j & i4) == 0) {
              i16 = j;
              i12 = i10;
              i3 = i4;
              if (j < 4096) {
                i12 = i10 + 1;
                i3 = i4 + j;
                i16 = j;
              } 
            } 
          } 
          break;
        } 
        j = i6;
        n = i17;
        i9 = i16;
        i10 = i12;
        i4 = i3;
      } 
      i12 = j;
      j = i9;
      int i15 = n;
      n = i;
      i3 = i5;
      i5 = i14;
      i6 = i13;
      i = i10;
      i9 = i12;
      i10 = i15;
    } 
    Arrays.fill(arrayOfByte3, b1, k, (byte)0);
  }
  
  private Bitmap o() {
    Boolean bool = this.t;
    if (bool == null || bool.booleanValue()) {
      Bitmap.Config config1 = Bitmap.Config.ARGB_8888;
      Bitmap bitmap1 = this.d.a(this.s, this.r, config1);
      bitmap1.setHasAlpha(true);
      return bitmap1;
    } 
    Bitmap.Config config = this.u;
    Bitmap bitmap = this.d.a(this.s, this.r, config);
    bitmap.setHasAlpha(true);
    return bitmap;
  }
  
  private int p() {
    int i = q();
    if (i <= 0)
      return i; 
    ByteBuffer byteBuffer = this.e;
    byteBuffer.get(this.f, 0, Math.min(i, byteBuffer.remaining()));
    return i;
  }
  
  private int q() {
    return this.e.get() & 0xFF;
  }
  
  private Bitmap s(b paramb1, b paramb2) {
    int[] arrayOfInt = this.k;
    int i = 0;
    if (paramb2 == null) {
      Bitmap bitmap1 = this.n;
      if (bitmap1 != null)
        this.d.c(bitmap1); 
      this.n = null;
      Arrays.fill(arrayOfInt, 0);
    } 
    if (paramb2 != null && paramb2.g == 3 && this.n == null)
      Arrays.fill(arrayOfInt, 0); 
    if (paramb2 != null) {
      int j = paramb2.g;
      if (j > 0)
        if (j == 2) {
          j = i;
          if (!paramb1.f) {
            c c1 = this.m;
            j = c1.l;
            if (paramb1.k != null && c1.j == paramb1.h)
              j = i; 
          } 
          i = paramb2.d;
          int k = this.q;
          int m = i / k;
          i = paramb2.b / k;
          int n = paramb2.c / k;
          k = paramb2.a / k;
          int i1 = this.s;
          int i2 = i * i1 + k;
          for (i = i2; i < m * i1 + i2; i += this.s) {
            for (k = i; k < i + n; k++)
              arrayOfInt[k] = j; 
          } 
        } else if (j == 3) {
          Bitmap bitmap1 = this.n;
          if (bitmap1 != null) {
            i = this.s;
            bitmap1.getPixels(arrayOfInt, 0, i, 0, 0, i, this.r);
          } 
        }  
    } 
    m(paramb1);
    if (paramb1.e || this.q != 1) {
      k(paramb1);
    } else {
      l(paramb1);
    } 
    if (this.o) {
      i = paramb1.g;
      if (i == 0 || i == 1) {
        if (this.n == null)
          this.n = o(); 
        Bitmap bitmap1 = this.n;
        i = this.s;
        bitmap1.setPixels(arrayOfInt, 0, i, 0, 0, i, this.r);
      } 
    } 
    Bitmap bitmap = o();
    i = this.s;
    bitmap.setPixels(arrayOfInt, 0, i, 0, 0, i, this.r);
    return bitmap;
  }
  
  public Bitmap a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield m : Lcom/bumptech/glide/l/c;
    //   6: getfield c : I
    //   9: ifle -> 19
    //   12: aload_0
    //   13: getfield l : I
    //   16: ifge -> 88
    //   19: getstatic com/bumptech/glide/l/e.a : Ljava/lang/String;
    //   22: astore_1
    //   23: aload_1
    //   24: iconst_3
    //   25: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   28: ifeq -> 83
    //   31: new java/lang/StringBuilder
    //   34: astore_2
    //   35: aload_2
    //   36: invokespecial <init> : ()V
    //   39: aload_2
    //   40: ldc 'Unable to decode frame, frameCount='
    //   42: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: aload_2
    //   47: aload_0
    //   48: getfield m : Lcom/bumptech/glide/l/c;
    //   51: getfield c : I
    //   54: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   57: pop
    //   58: aload_2
    //   59: ldc ', framePointer='
    //   61: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: pop
    //   65: aload_2
    //   66: aload_0
    //   67: getfield l : I
    //   70: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   73: pop
    //   74: aload_1
    //   75: aload_2
    //   76: invokevirtual toString : ()Ljava/lang/String;
    //   79: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   82: pop
    //   83: aload_0
    //   84: iconst_1
    //   85: putfield p : I
    //   88: aload_0
    //   89: getfield p : I
    //   92: istore_3
    //   93: iload_3
    //   94: iconst_1
    //   95: if_icmpeq -> 346
    //   98: iload_3
    //   99: iconst_2
    //   100: if_icmpne -> 106
    //   103: goto -> 346
    //   106: aload_0
    //   107: iconst_0
    //   108: putfield p : I
    //   111: aload_0
    //   112: getfield f : [B
    //   115: ifnonnull -> 134
    //   118: aload_0
    //   119: aload_0
    //   120: getfield d : Lcom/bumptech/glide/l/a$a;
    //   123: sipush #255
    //   126: invokeinterface e : (I)[B
    //   131: putfield f : [B
    //   134: aload_0
    //   135: getfield m : Lcom/bumptech/glide/l/c;
    //   138: getfield e : Ljava/util/List;
    //   141: aload_0
    //   142: getfield l : I
    //   145: invokeinterface get : (I)Ljava/lang/Object;
    //   150: checkcast com/bumptech/glide/l/b
    //   153: astore #4
    //   155: aload_0
    //   156: getfield l : I
    //   159: iconst_1
    //   160: isub
    //   161: istore_3
    //   162: iload_3
    //   163: iflt -> 186
    //   166: aload_0
    //   167: getfield m : Lcom/bumptech/glide/l/c;
    //   170: getfield e : Ljava/util/List;
    //   173: iload_3
    //   174: invokeinterface get : (I)Ljava/lang/Object;
    //   179: checkcast com/bumptech/glide/l/b
    //   182: astore_1
    //   183: goto -> 188
    //   186: aconst_null
    //   187: astore_1
    //   188: aload #4
    //   190: getfield k : [I
    //   193: astore_2
    //   194: aload_2
    //   195: ifnull -> 201
    //   198: goto -> 209
    //   201: aload_0
    //   202: getfield m : Lcom/bumptech/glide/l/c;
    //   205: getfield a : [I
    //   208: astore_2
    //   209: aload_0
    //   210: aload_2
    //   211: putfield b : [I
    //   214: aload_2
    //   215: ifnonnull -> 273
    //   218: getstatic com/bumptech/glide/l/e.a : Ljava/lang/String;
    //   221: astore_2
    //   222: aload_2
    //   223: iconst_3
    //   224: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   227: ifeq -> 264
    //   230: new java/lang/StringBuilder
    //   233: astore_1
    //   234: aload_1
    //   235: invokespecial <init> : ()V
    //   238: aload_1
    //   239: ldc_w 'No valid color table found for frame #'
    //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: pop
    //   246: aload_1
    //   247: aload_0
    //   248: getfield l : I
    //   251: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   254: pop
    //   255: aload_2
    //   256: aload_1
    //   257: invokevirtual toString : ()Ljava/lang/String;
    //   260: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   263: pop
    //   264: aload_0
    //   265: iconst_1
    //   266: putfield p : I
    //   269: aload_0
    //   270: monitorexit
    //   271: aconst_null
    //   272: areturn
    //   273: aload #4
    //   275: getfield f : Z
    //   278: ifeq -> 334
    //   281: aload_2
    //   282: iconst_0
    //   283: aload_0
    //   284: getfield c : [I
    //   287: iconst_0
    //   288: aload_2
    //   289: arraylength
    //   290: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   293: aload_0
    //   294: getfield c : [I
    //   297: astore_2
    //   298: aload_0
    //   299: aload_2
    //   300: putfield b : [I
    //   303: aload_2
    //   304: aload #4
    //   306: getfield h : I
    //   309: iconst_0
    //   310: iastore
    //   311: aload #4
    //   313: getfield g : I
    //   316: iconst_2
    //   317: if_icmpne -> 334
    //   320: aload_0
    //   321: getfield l : I
    //   324: ifne -> 334
    //   327: aload_0
    //   328: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   331: putfield t : Ljava/lang/Boolean;
    //   334: aload_0
    //   335: aload #4
    //   337: aload_1
    //   338: invokespecial s : (Lcom/bumptech/glide/l/b;Lcom/bumptech/glide/l/b;)Landroid/graphics/Bitmap;
    //   341: astore_1
    //   342: aload_0
    //   343: monitorexit
    //   344: aload_1
    //   345: areturn
    //   346: getstatic com/bumptech/glide/l/e.a : Ljava/lang/String;
    //   349: astore_1
    //   350: aload_1
    //   351: iconst_3
    //   352: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   355: ifeq -> 392
    //   358: new java/lang/StringBuilder
    //   361: astore_2
    //   362: aload_2
    //   363: invokespecial <init> : ()V
    //   366: aload_2
    //   367: ldc_w 'Unable to decode frame, status='
    //   370: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: pop
    //   374: aload_2
    //   375: aload_0
    //   376: getfield p : I
    //   379: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   382: pop
    //   383: aload_1
    //   384: aload_2
    //   385: invokevirtual toString : ()Ljava/lang/String;
    //   388: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   391: pop
    //   392: aload_0
    //   393: monitorexit
    //   394: aconst_null
    //   395: areturn
    //   396: astore_1
    //   397: aload_0
    //   398: monitorexit
    //   399: aload_1
    //   400: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	396	finally
    //   19	83	396	finally
    //   83	88	396	finally
    //   88	93	396	finally
    //   106	134	396	finally
    //   134	162	396	finally
    //   166	183	396	finally
    //   188	194	396	finally
    //   201	209	396	finally
    //   209	214	396	finally
    //   218	264	396	finally
    //   264	269	396	finally
    //   273	334	396	finally
    //   334	342	396	finally
    //   346	392	396	finally
  }
  
  public void b() {
    this.l = (this.l + 1) % this.m.c;
  }
  
  public int c() {
    return this.m.c;
  }
  
  public void clear() {
    this.m = null;
    byte[] arrayOfByte2 = this.j;
    if (arrayOfByte2 != null)
      this.d.d(arrayOfByte2); 
    int[] arrayOfInt = this.k;
    if (arrayOfInt != null)
      this.d.f(arrayOfInt); 
    Bitmap bitmap = this.n;
    if (bitmap != null)
      this.d.c(bitmap); 
    this.n = null;
    this.e = null;
    this.t = null;
    byte[] arrayOfByte1 = this.f;
    if (arrayOfByte1 != null)
      this.d.d(arrayOfByte1); 
  }
  
  public int d() {
    if (this.m.c > 0) {
      int i = this.l;
      if (i >= 0)
        return n(i); 
    } 
    return 0;
  }
  
  public void e(Bitmap.Config paramConfig) {
    if (paramConfig == Bitmap.Config.ARGB_8888 || paramConfig == Bitmap.Config.RGB_565) {
      this.u = paramConfig;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unsupported format: ");
    stringBuilder.append(paramConfig);
    stringBuilder.append(", must be one of ");
    stringBuilder.append(Bitmap.Config.ARGB_8888);
    stringBuilder.append(" or ");
    stringBuilder.append(Bitmap.Config.RGB_565);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public ByteBuffer f() {
    return this.e;
  }
  
  public void g() {
    this.l = -1;
  }
  
  public int h() {
    return this.l;
  }
  
  public int i() {
    return this.e.limit() + this.j.length + this.k.length * 4;
  }
  
  public int n(int paramInt) {
    if (paramInt >= 0) {
      c c1 = this.m;
      if (paramInt < c1.c)
        return ((b)c1.e.get(paramInt)).i; 
    } 
    return -1;
  }
  
  public void r(c paramc, ByteBuffer paramByteBuffer, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_3
    //   3: ifle -> 178
    //   6: iload_3
    //   7: invokestatic highestOneBit : (I)I
    //   10: istore_3
    //   11: aload_0
    //   12: iconst_0
    //   13: putfield p : I
    //   16: aload_0
    //   17: aload_1
    //   18: putfield m : Lcom/bumptech/glide/l/c;
    //   21: aload_0
    //   22: iconst_m1
    //   23: putfield l : I
    //   26: aload_2
    //   27: invokevirtual asReadOnlyBuffer : ()Ljava/nio/ByteBuffer;
    //   30: astore_2
    //   31: aload_0
    //   32: aload_2
    //   33: putfield e : Ljava/nio/ByteBuffer;
    //   36: aload_2
    //   37: iconst_0
    //   38: invokevirtual position : (I)Ljava/nio/Buffer;
    //   41: pop
    //   42: aload_0
    //   43: getfield e : Ljava/nio/ByteBuffer;
    //   46: getstatic java/nio/ByteOrder.LITTLE_ENDIAN : Ljava/nio/ByteOrder;
    //   49: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   52: pop
    //   53: aload_0
    //   54: iconst_0
    //   55: putfield o : Z
    //   58: aload_1
    //   59: getfield e : Ljava/util/List;
    //   62: invokeinterface iterator : ()Ljava/util/Iterator;
    //   67: astore_2
    //   68: aload_2
    //   69: invokeinterface hasNext : ()Z
    //   74: ifeq -> 98
    //   77: aload_2
    //   78: invokeinterface next : ()Ljava/lang/Object;
    //   83: checkcast com/bumptech/glide/l/b
    //   86: getfield g : I
    //   89: iconst_3
    //   90: if_icmpne -> 68
    //   93: aload_0
    //   94: iconst_1
    //   95: putfield o : Z
    //   98: aload_0
    //   99: iload_3
    //   100: putfield q : I
    //   103: aload_1
    //   104: getfield f : I
    //   107: istore #4
    //   109: aload_0
    //   110: iload #4
    //   112: iload_3
    //   113: idiv
    //   114: putfield s : I
    //   117: aload_1
    //   118: getfield g : I
    //   121: istore #5
    //   123: aload_0
    //   124: iload #5
    //   126: iload_3
    //   127: idiv
    //   128: putfield r : I
    //   131: aload_0
    //   132: aload_0
    //   133: getfield d : Lcom/bumptech/glide/l/a$a;
    //   136: iload #4
    //   138: iload #5
    //   140: imul
    //   141: invokeinterface e : (I)[B
    //   146: putfield j : [B
    //   149: aload_0
    //   150: aload_0
    //   151: getfield d : Lcom/bumptech/glide/l/a$a;
    //   154: aload_0
    //   155: getfield s : I
    //   158: aload_0
    //   159: getfield r : I
    //   162: imul
    //   163: invokeinterface b : (I)[I
    //   168: putfield k : [I
    //   171: aload_0
    //   172: monitorexit
    //   173: return
    //   174: astore_1
    //   175: goto -> 214
    //   178: new java/lang/IllegalArgumentException
    //   181: astore_1
    //   182: new java/lang/StringBuilder
    //   185: astore_2
    //   186: aload_2
    //   187: invokespecial <init> : ()V
    //   190: aload_2
    //   191: ldc_w 'Sample size must be >=0, not: '
    //   194: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: pop
    //   198: aload_2
    //   199: iload_3
    //   200: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   203: pop
    //   204: aload_1
    //   205: aload_2
    //   206: invokevirtual toString : ()Ljava/lang/String;
    //   209: invokespecial <init> : (Ljava/lang/String;)V
    //   212: aload_1
    //   213: athrow
    //   214: aload_0
    //   215: monitorexit
    //   216: goto -> 221
    //   219: aload_1
    //   220: athrow
    //   221: goto -> 219
    // Exception table:
    //   from	to	target	type
    //   6	68	174	finally
    //   68	98	174	finally
    //   98	171	174	finally
    //   178	214	174	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/l/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */