package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.c1.d;
import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.l;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;

public final class j implements h {
  public static final l a = c.a;
  
  private final int b;
  
  private final k c;
  
  private final v d;
  
  private final v e;
  
  private final u f;
  
  private com.google.android.exoplayer2.c1.j g;
  
  private long h;
  
  private long i;
  
  private int j;
  
  private boolean k;
  
  private boolean l;
  
  private boolean m;
  
  public j() {
    this(0);
  }
  
  public j(int paramInt) {
    this.b = paramInt;
    this.c = new k(true);
    this.d = new v(2048);
    this.j = -1;
    this.i = -1L;
    v v1 = new v(10);
    this.e = v1;
    this.f = new u(v1.a);
  }
  
  private void b(i parami) {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : Z
    //   4: ifeq -> 8
    //   7: return
    //   8: aload_0
    //   9: iconst_m1
    //   10: putfield j : I
    //   13: aload_1
    //   14: invokeinterface h : ()V
    //   19: aload_1
    //   20: invokeinterface a : ()J
    //   25: lstore_2
    //   26: lconst_0
    //   27: lstore #4
    //   29: lload_2
    //   30: lconst_0
    //   31: lcmp
    //   32: ifne -> 41
    //   35: aload_0
    //   36: aload_1
    //   37: invokespecial k : (Lcom/google/android/exoplayer2/c1/i;)I
    //   40: pop
    //   41: iconst_0
    //   42: istore #6
    //   44: iconst_0
    //   45: istore #7
    //   47: iload #7
    //   49: istore #8
    //   51: lload #4
    //   53: lstore_2
    //   54: iload #7
    //   56: istore #9
    //   58: lload #4
    //   60: lstore #10
    //   62: aload_1
    //   63: aload_0
    //   64: getfield e : Lcom/google/android/exoplayer2/util/v;
    //   67: getfield a : [B
    //   70: iconst_0
    //   71: iconst_2
    //   72: iconst_1
    //   73: invokeinterface c : ([BIIZ)Z
    //   78: ifeq -> 313
    //   81: iload #7
    //   83: istore #9
    //   85: lload #4
    //   87: lstore #10
    //   89: aload_0
    //   90: getfield e : Lcom/google/android/exoplayer2/util/v;
    //   93: iconst_0
    //   94: invokevirtual M : (I)V
    //   97: iload #7
    //   99: istore #9
    //   101: lload #4
    //   103: lstore #10
    //   105: aload_0
    //   106: getfield e : Lcom/google/android/exoplayer2/util/v;
    //   109: invokevirtual F : ()I
    //   112: invokestatic l : (I)Z
    //   115: ifne -> 125
    //   118: iload #6
    //   120: istore #7
    //   122: goto -> 320
    //   125: iload #7
    //   127: istore #9
    //   129: lload #4
    //   131: lstore #10
    //   133: aload_1
    //   134: aload_0
    //   135: getfield e : Lcom/google/android/exoplayer2/util/v;
    //   138: getfield a : [B
    //   141: iconst_0
    //   142: iconst_4
    //   143: iconst_1
    //   144: invokeinterface c : ([BIIZ)Z
    //   149: ifne -> 162
    //   152: iload #7
    //   154: istore #8
    //   156: lload #4
    //   158: lstore_2
    //   159: goto -> 313
    //   162: iload #7
    //   164: istore #9
    //   166: lload #4
    //   168: lstore #10
    //   170: aload_0
    //   171: getfield f : Lcom/google/android/exoplayer2/util/u;
    //   174: bipush #14
    //   176: invokevirtual o : (I)V
    //   179: iload #7
    //   181: istore #9
    //   183: lload #4
    //   185: lstore #10
    //   187: aload_0
    //   188: getfield f : Lcom/google/android/exoplayer2/util/u;
    //   191: bipush #13
    //   193: invokevirtual h : (I)I
    //   196: istore #12
    //   198: iload #12
    //   200: bipush #6
    //   202: if_icmple -> 261
    //   205: lload #4
    //   207: iload #12
    //   209: i2l
    //   210: ladd
    //   211: lstore_2
    //   212: iload #7
    //   214: iconst_1
    //   215: iadd
    //   216: istore #8
    //   218: iload #8
    //   220: sipush #1000
    //   223: if_icmpne -> 229
    //   226: goto -> 258
    //   229: iload #8
    //   231: istore #7
    //   233: lload_2
    //   234: lstore #4
    //   236: iload #8
    //   238: istore #9
    //   240: lload_2
    //   241: lstore #10
    //   243: aload_1
    //   244: iload #12
    //   246: bipush #6
    //   248: isub
    //   249: iconst_1
    //   250: invokeinterface j : (IZ)Z
    //   255: ifne -> 47
    //   258: goto -> 313
    //   261: iload #7
    //   263: istore #9
    //   265: lload #4
    //   267: lstore #10
    //   269: aload_0
    //   270: iconst_1
    //   271: putfield k : Z
    //   274: iload #7
    //   276: istore #9
    //   278: lload #4
    //   280: lstore #10
    //   282: new com/google/android/exoplayer2/ParserException
    //   285: astore #13
    //   287: iload #7
    //   289: istore #9
    //   291: lload #4
    //   293: lstore #10
    //   295: aload #13
    //   297: ldc 'Malformed ADTS stream'
    //   299: invokespecial <init> : (Ljava/lang/String;)V
    //   302: iload #7
    //   304: istore #9
    //   306: lload #4
    //   308: lstore #10
    //   310: aload #13
    //   312: athrow
    //   313: iload #8
    //   315: istore #7
    //   317: lload_2
    //   318: lstore #4
    //   320: aload_1
    //   321: invokeinterface h : ()V
    //   326: iload #7
    //   328: ifle -> 345
    //   331: aload_0
    //   332: lload #4
    //   334: iload #7
    //   336: i2l
    //   337: ldiv
    //   338: l2i
    //   339: putfield j : I
    //   342: goto -> 350
    //   345: aload_0
    //   346: iconst_m1
    //   347: putfield j : I
    //   350: aload_0
    //   351: iconst_1
    //   352: putfield k : Z
    //   355: return
    //   356: astore #13
    //   358: iload #9
    //   360: istore #8
    //   362: lload #10
    //   364: lstore_2
    //   365: goto -> 313
    // Exception table:
    //   from	to	target	type
    //   62	81	356	java/io/EOFException
    //   89	97	356	java/io/EOFException
    //   105	118	356	java/io/EOFException
    //   133	152	356	java/io/EOFException
    //   170	179	356	java/io/EOFException
    //   187	198	356	java/io/EOFException
    //   243	258	356	java/io/EOFException
    //   269	274	356	java/io/EOFException
    //   282	287	356	java/io/EOFException
    //   295	302	356	java/io/EOFException
    //   310	313	356	java/io/EOFException
  }
  
  private static int c(int paramInt, long paramLong) {
    return (int)((paramInt * 8) * 1000000L / paramLong);
  }
  
  private t d(long paramLong) {
    int i = c(this.j, this.c.j());
    return (t)new d(paramLong, this.i, i, this.j);
  }
  
  private void j(long paramLong, boolean paramBoolean1, boolean paramBoolean2) {
    boolean bool;
    if (this.m)
      return; 
    if (paramBoolean1 && this.j > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool && this.c.j() == -9223372036854775807L && !paramBoolean2)
      return; 
    com.google.android.exoplayer2.c1.j j1 = (com.google.android.exoplayer2.c1.j)e.e(this.g);
    if (bool && this.c.j() != -9223372036854775807L) {
      j1.a(d(paramLong));
    } else {
      j1.a((t)new t.b(-9223372036854775807L));
    } 
    this.m = true;
  }
  
  private int k(i parami) {
    int m = 0;
    while (true) {
      parami.k(this.e.a, 0, 10);
      this.e.M(0);
      if (this.e.C() != 4801587) {
        parami.h();
        parami.e(m);
        if (this.i == -1L)
          this.i = m; 
        return m;
      } 
      this.e.N(3);
      int n = this.e.y();
      m += n + 10;
      parami.e(n);
    } 
  }
  
  public void a() {}
  
  public boolean e(i parami) {
    int m = k(parami);
    int n = m;
    label20: while (true) {
      byte b = 0;
      int i1;
      for (i1 = 0;; i1 += i2) {
        parami.k(this.e.a, 0, 2);
        this.e.M(0);
        if (!k.l(this.e.F())) {
          parami.h();
          if (++n - m >= 8192)
            return false; 
          parami.e(n);
          continue label20;
        } 
        if (++b >= 4 && i1 > 188)
          return true; 
        parami.k(this.e.a, 0, 4);
        this.f.o(14);
        int i2 = this.f.h(13);
        if (i2 <= 6)
          return false; 
        parami.e(i2 - 6);
      } 
      break;
    } 
  }
  
  public int g(i parami, s params) {
    boolean bool1;
    boolean bool2;
    long l1 = parami.getLength();
    if ((this.b & 0x1) != 0 && l1 != -1L) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool1)
      b(parami); 
    int m = parami.read(this.d.a, 0, 2048);
    if (m == -1) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    j(l1, bool1, bool2);
    if (bool2)
      return -1; 
    this.d.M(0);
    this.d.L(m);
    if (!this.l) {
      this.c.f(this.h, 4);
      this.l = true;
    } 
    this.c.b(this.d);
    return 0;
  }
  
  public void h(com.google.android.exoplayer2.c1.j paramj) {
    this.g = paramj;
    this.c.e(paramj, new h0.d(0, 1));
    paramj.f();
  }
  
  public void i(long paramLong1, long paramLong2) {
    this.l = false;
    this.c.c();
    this.h = paramLong2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */