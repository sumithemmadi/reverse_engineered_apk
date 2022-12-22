package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.b1.e;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.upstream.d;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.util.v;
import java.io.EOFException;
import java.nio.ByteBuffer;

class z {
  private final e a;
  
  private final int b;
  
  private final v c;
  
  private a d;
  
  private a e;
  
  private a f;
  
  private long g;
  
  public z(e parame) {
    this.a = parame;
    int i = parame.e();
    this.b = i;
    this.c = new v(32);
    a a1 = new a(0L, i);
    this.d = a1;
    this.e = a1;
    this.f = a1;
  }
  
  private void a(long paramLong) {
    while (true) {
      a a1 = this.e;
      if (paramLong >= a1.b) {
        this.e = a1.e;
        continue;
      } 
      break;
    } 
  }
  
  private void b(a parama) {
    if (!parama.c)
      return; 
    a a1 = this.f;
    int i = a1.c + (int)(a1.a - parama.a) / this.b;
    d[] arrayOfD = new d[i];
    for (byte b = 0; b < i; b++) {
      arrayOfD[b] = parama.d;
      parama = parama.a();
    } 
    this.a.d(arrayOfD);
  }
  
  private void e(int paramInt) {
    long l = this.g + paramInt;
    this.g = l;
    a a1 = this.f;
    if (l == a1.b)
      this.f = a1.e; 
  }
  
  private int f(int paramInt) {
    a a1 = this.f;
    if (!a1.c)
      a1.b(this.a.b(), new a(this.f.b, this.b)); 
    return Math.min(paramInt, (int)(this.f.b - this.g));
  }
  
  private void g(long paramLong, ByteBuffer paramByteBuffer, int paramInt) {
    a(paramLong);
    while (paramInt > 0) {
      int i = Math.min(paramInt, (int)(this.e.b - paramLong));
      a a1 = this.e;
      paramByteBuffer.put(a1.d.a, a1.c(paramLong), i);
      int j = paramInt - i;
      long l = paramLong + i;
      a1 = this.e;
      paramLong = l;
      paramInt = j;
      if (l == a1.b) {
        this.e = a1.e;
        paramLong = l;
        paramInt = j;
      } 
    } 
  }
  
  private void h(long paramLong, byte[] paramArrayOfbyte, int paramInt) {
    a(paramLong);
    int i = paramInt;
    while (i > 0) {
      int j = Math.min(i, (int)(this.e.b - paramLong));
      a a1 = this.e;
      System.arraycopy(a1.d.a, a1.c(paramLong), paramArrayOfbyte, paramInt - i, j);
      int k = i - j;
      long l = paramLong + j;
      a1 = this.e;
      i = k;
      paramLong = l;
      if (l == a1.b) {
        this.e = a1.e;
        i = k;
        paramLong = l;
      } 
    } 
  }
  
  private void i(e parame, a0.a parama) {
    // Byte code:
    //   0: aload_2
    //   1: getfield b : J
    //   4: lstore_3
    //   5: aload_0
    //   6: getfield c : Lcom/google/android/exoplayer2/util/v;
    //   9: iconst_1
    //   10: invokevirtual I : (I)V
    //   13: aload_0
    //   14: lload_3
    //   15: aload_0
    //   16: getfield c : Lcom/google/android/exoplayer2/util/v;
    //   19: getfield a : [B
    //   22: iconst_1
    //   23: invokespecial h : (J[BI)V
    //   26: lload_3
    //   27: lconst_1
    //   28: ladd
    //   29: lstore_3
    //   30: aload_0
    //   31: getfield c : Lcom/google/android/exoplayer2/util/v;
    //   34: getfield a : [B
    //   37: astore #5
    //   39: iconst_0
    //   40: istore #6
    //   42: aload #5
    //   44: iconst_0
    //   45: baload
    //   46: istore #7
    //   48: iload #7
    //   50: sipush #128
    //   53: iand
    //   54: ifeq -> 63
    //   57: iconst_1
    //   58: istore #8
    //   60: goto -> 66
    //   63: iconst_0
    //   64: istore #8
    //   66: iload #7
    //   68: bipush #127
    //   70: iand
    //   71: istore #7
    //   73: aload_1
    //   74: getfield b : Lcom/google/android/exoplayer2/b1/b;
    //   77: astore #9
    //   79: aload #9
    //   81: getfield a : [B
    //   84: astore_1
    //   85: aload_1
    //   86: ifnonnull -> 101
    //   89: aload #9
    //   91: bipush #16
    //   93: newarray byte
    //   95: putfield a : [B
    //   98: goto -> 106
    //   101: aload_1
    //   102: iconst_0
    //   103: invokestatic fill : ([BB)V
    //   106: aload_0
    //   107: lload_3
    //   108: aload #9
    //   110: getfield a : [B
    //   113: iload #7
    //   115: invokespecial h : (J[BI)V
    //   118: lload_3
    //   119: iload #7
    //   121: i2l
    //   122: ladd
    //   123: lstore_3
    //   124: iload #8
    //   126: ifeq -> 168
    //   129: aload_0
    //   130: getfield c : Lcom/google/android/exoplayer2/util/v;
    //   133: iconst_2
    //   134: invokevirtual I : (I)V
    //   137: aload_0
    //   138: lload_3
    //   139: aload_0
    //   140: getfield c : Lcom/google/android/exoplayer2/util/v;
    //   143: getfield a : [B
    //   146: iconst_2
    //   147: invokespecial h : (J[BI)V
    //   150: lload_3
    //   151: ldc2_w 2
    //   154: ladd
    //   155: lstore_3
    //   156: aload_0
    //   157: getfield c : Lcom/google/android/exoplayer2/util/v;
    //   160: invokevirtual F : ()I
    //   163: istore #7
    //   165: goto -> 171
    //   168: iconst_1
    //   169: istore #7
    //   171: aload #9
    //   173: getfield d : [I
    //   176: astore #5
    //   178: aload #5
    //   180: ifnull -> 194
    //   183: aload #5
    //   185: astore_1
    //   186: aload #5
    //   188: arraylength
    //   189: iload #7
    //   191: if_icmpge -> 199
    //   194: iload #7
    //   196: newarray int
    //   198: astore_1
    //   199: aload #9
    //   201: getfield e : [I
    //   204: astore #10
    //   206: aload #10
    //   208: ifnull -> 223
    //   211: aload #10
    //   213: astore #5
    //   215: aload #10
    //   217: arraylength
    //   218: iload #7
    //   220: if_icmpge -> 229
    //   223: iload #7
    //   225: newarray int
    //   227: astore #5
    //   229: iload #8
    //   231: ifeq -> 322
    //   234: iload #7
    //   236: bipush #6
    //   238: imul
    //   239: istore #8
    //   241: aload_0
    //   242: getfield c : Lcom/google/android/exoplayer2/util/v;
    //   245: iload #8
    //   247: invokevirtual I : (I)V
    //   250: aload_0
    //   251: lload_3
    //   252: aload_0
    //   253: getfield c : Lcom/google/android/exoplayer2/util/v;
    //   256: getfield a : [B
    //   259: iload #8
    //   261: invokespecial h : (J[BI)V
    //   264: lload_3
    //   265: iload #8
    //   267: i2l
    //   268: ladd
    //   269: lstore #11
    //   271: aload_0
    //   272: getfield c : Lcom/google/android/exoplayer2/util/v;
    //   275: iconst_0
    //   276: invokevirtual M : (I)V
    //   279: iload #6
    //   281: istore #8
    //   283: lload #11
    //   285: lstore_3
    //   286: iload #8
    //   288: iload #7
    //   290: if_icmpge -> 342
    //   293: aload_1
    //   294: iload #8
    //   296: aload_0
    //   297: getfield c : Lcom/google/android/exoplayer2/util/v;
    //   300: invokevirtual F : ()I
    //   303: iastore
    //   304: aload #5
    //   306: iload #8
    //   308: aload_0
    //   309: getfield c : Lcom/google/android/exoplayer2/util/v;
    //   312: invokevirtual D : ()I
    //   315: iastore
    //   316: iinc #8, 1
    //   319: goto -> 283
    //   322: aload_1
    //   323: iconst_0
    //   324: iconst_0
    //   325: iastore
    //   326: aload #5
    //   328: iconst_0
    //   329: aload_2
    //   330: getfield a : I
    //   333: lload_3
    //   334: aload_2
    //   335: getfield b : J
    //   338: lsub
    //   339: l2i
    //   340: isub
    //   341: iastore
    //   342: aload_2
    //   343: getfield c : Lcom/google/android/exoplayer2/c1/v$a;
    //   346: astore #10
    //   348: aload #9
    //   350: iload #7
    //   352: aload_1
    //   353: aload #5
    //   355: aload #10
    //   357: getfield b : [B
    //   360: aload #9
    //   362: getfield a : [B
    //   365: aload #10
    //   367: getfield a : I
    //   370: aload #10
    //   372: getfield c : I
    //   375: aload #10
    //   377: getfield d : I
    //   380: invokevirtual b : (I[I[I[B[BIII)V
    //   383: aload_2
    //   384: getfield b : J
    //   387: lstore #11
    //   389: lload_3
    //   390: lload #11
    //   392: lsub
    //   393: l2i
    //   394: istore #8
    //   396: aload_2
    //   397: lload #11
    //   399: iload #8
    //   401: i2l
    //   402: ladd
    //   403: putfield b : J
    //   406: aload_2
    //   407: aload_2
    //   408: getfield a : I
    //   411: iload #8
    //   413: isub
    //   414: putfield a : I
    //   417: return
  }
  
  public void c(long paramLong) {
    if (paramLong == -1L)
      return; 
    while (true) {
      a a1 = this.d;
      if (paramLong >= a1.b) {
        this.a.a(a1.d);
        this.d = this.d.a();
        continue;
      } 
      if (this.e.a < a1.a)
        this.e = a1; 
      return;
    } 
  }
  
  public long d() {
    return this.g;
  }
  
  public void j(e parame, a0.a parama) {
    if (parame.n())
      i(parame, parama); 
    if (parame.hasSupplementalData()) {
      this.c.I(4);
      h(parama.b, this.c.a, 4);
      int i = this.c.D();
      parama.b += 4L;
      parama.a -= 4;
      parame.l(i);
      g(parama.b, parame.c, i);
      parama.b += i;
      i = parama.a - i;
      parama.a = i;
      parame.s(i);
      g(parama.b, parame.e, parama.a);
    } else {
      parame.l(parama.a);
      g(parama.b, parame.c, parama.a);
    } 
  }
  
  public void k() {
    b(this.d);
    a a1 = new a(0L, this.b);
    this.d = a1;
    this.e = a1;
    this.f = a1;
    this.g = 0L;
    this.a.c();
  }
  
  public void l() {
    this.e = this.d;
  }
  
  public int m(i parami, int paramInt, boolean paramBoolean) {
    paramInt = f(paramInt);
    a a1 = this.f;
    paramInt = parami.read(a1.d.a, a1.c(this.g), paramInt);
    if (paramInt == -1) {
      if (paramBoolean)
        return -1; 
      throw new EOFException();
    } 
    e(paramInt);
    return paramInt;
  }
  
  public void n(v paramv, int paramInt) {
    while (paramInt > 0) {
      int i = f(paramInt);
      a a1 = this.f;
      paramv.h(a1.d.a, a1.c(this.g), i);
      paramInt -= i;
      e(i);
    } 
  }
  
  private static final class a {
    public final long a;
    
    public final long b;
    
    public boolean c;
    
    public d d;
    
    public a e;
    
    public a(long param1Long, int param1Int) {
      this.a = param1Long;
      this.b = param1Long + param1Int;
    }
    
    public a a() {
      this.d = null;
      a a1 = this.e;
      this.e = null;
      return a1;
    }
    
    public void b(d param1d, a param1a) {
      this.d = param1d;
      this.e = param1a;
      this.c = true;
    }
    
    public int c(long param1Long) {
      return (int)(param1Long - this.a) + this.d.b;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */