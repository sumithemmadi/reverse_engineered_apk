package com.google.android.exoplayer2.c1.d0;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.l;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class g0 implements h {
  public static final l a = e.a;
  
  private final int b;
  
  private final List<e0> c;
  
  private final v d;
  
  private final SparseIntArray e;
  
  private final h0.c f;
  
  private final SparseArray<h0> g;
  
  private final SparseBooleanArray h;
  
  private final SparseBooleanArray i;
  
  private final f0 j;
  
  private e0 k;
  
  private j l;
  
  private int m;
  
  private boolean n;
  
  private boolean o;
  
  private boolean p;
  
  private h0 q;
  
  private int r;
  
  private int s;
  
  public g0() {
    this(0);
  }
  
  public g0(int paramInt) {
    this(1, paramInt);
  }
  
  public g0(int paramInt1, int paramInt2) {
    this(paramInt1, new e0(0L), new l(paramInt2));
  }
  
  public g0(int paramInt, e0 parame0, h0.c paramc) {
    this.f = (h0.c)e.e(paramc);
    this.b = paramInt;
    if (paramInt == 1 || paramInt == 2) {
      this.c = Collections.singletonList(parame0);
    } else {
      ArrayList<e0> arrayList = new ArrayList();
      this.c = arrayList;
      arrayList.add(parame0);
    } 
    this.d = new v(new byte[9400], 0);
    this.h = new SparseBooleanArray();
    this.i = new SparseBooleanArray();
    this.g = new SparseArray();
    this.e = new SparseIntArray();
    this.j = new f0();
    this.s = -1;
    y();
  }
  
  private boolean u(i parami) {
    v v1 = this.d;
    byte[] arrayOfByte = v1.a;
    if (9400 - v1.c() < 188) {
      int k = this.d.a();
      if (k > 0)
        System.arraycopy(arrayOfByte, this.d.c(), arrayOfByte, 0, k); 
      this.d.K(arrayOfByte, k);
    } 
    while (this.d.a() < 188) {
      int k = this.d.d();
      int m = parami.read(arrayOfByte, k, 9400 - k);
      if (m == -1)
        return false; 
      this.d.L(k + m);
    } 
    return true;
  }
  
  private int v() {
    int i = this.d.c();
    int k = this.d.d();
    int m = i0.a(this.d.a, i, k);
    this.d.M(m);
    int n = m + 188;
    if (n > k) {
      i = this.r + m - i;
      this.r = i;
      if (this.b == 2 && i > 376)
        throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream."); 
    } else {
      this.r = 0;
    } 
    return n;
  }
  
  private void x(long paramLong) {
    if (!this.o) {
      this.o = true;
      if (this.j.b() != -9223372036854775807L) {
        e0 e01 = new e0(this.j.c(), this.j.b(), paramLong, this.s);
        this.k = e01;
        this.l.a(e01.b());
      } else {
        this.l.a((t)new t.b(this.j.b()));
      } 
    } 
  }
  
  private void y() {
    this.h.clear();
    this.g.clear();
    SparseArray<h0> sparseArray = this.f.b();
    int i = sparseArray.size();
    for (byte b = 0; b < i; b++)
      this.g.put(sparseArray.keyAt(b), sparseArray.valueAt(b)); 
    this.g.put(0, new b0(new a(this)));
    this.q = null;
  }
  
  private boolean z(int paramInt) {
    int i = this.b;
    boolean bool = false;
    if (i == 2 || this.n || !this.i.get(paramInt, false))
      bool = true; 
    return bool;
  }
  
  public void a() {}
  
  public boolean e(i parami) {
    byte[] arrayOfByte = this.d.a;
    parami.k(arrayOfByte, 0, 940);
    for (byte b = 0; b < '¼'; b++) {
      byte b1 = 0;
      while (true) {
        if (b1 < 5) {
          if (arrayOfByte[b1 * 188 + b] != 71) {
            b1 = 0;
            break;
          } 
          b1++;
          continue;
        } 
        b1 = 1;
        break;
      } 
      if (b1 != 0) {
        parami.i(b);
        return true;
      } 
    } 
    return false;
  }
  
  public int g(i parami, s params) {
    byte b;
    long l1 = parami.getLength();
    if (this.n) {
      if (l1 != -1L && this.b != 2) {
        b = 1;
      } else {
        b = 0;
      } 
      if (b && !this.j.d())
        return this.j.e(parami, params, this.s); 
      x(l1);
      if (this.p) {
        this.p = false;
        i(0L, 0L);
        if (parami.a() != 0L) {
          params.a = 0L;
          return 1;
        } 
      } 
      e0 e01 = this.k;
      if (e01 != null && e01.d())
        return this.k.c(parami, params); 
    } 
    if (!u(parami))
      return -1; 
    int k = v();
    int m = this.d.d();
    if (k > m)
      return 0; 
    int n = this.d.k();
    if ((0x800000 & n) != 0) {
      this.d.M(k);
      return 0;
    } 
    if ((0x400000 & n) != 0) {
      b = 1;
    } else {
      b = 0;
    } 
    int i1 = b | 0x0;
    int i2 = (0x1FFF00 & n) >> 8;
    if ((n & 0x20) != 0) {
      b = 1;
    } else {
      b = 0;
    } 
    if ((n & 0x10) != 0) {
      i3 = 1;
    } else {
      i3 = 0;
    } 
    if (i3) {
      h0 h01 = (h0)this.g.get(i2);
    } else {
      parami = null;
    } 
    if (parami == null) {
      this.d.M(k);
      return 0;
    } 
    if (this.b != 2) {
      n &= 0xF;
      i3 = this.e.get(i2, n - 1);
      this.e.put(i2, n);
      if (i3 == n) {
        this.d.M(k);
        return 0;
      } 
      if (n != (i3 + 1 & 0xF))
        parami.c(); 
    } 
    int i3 = i1;
    if (b) {
      n = this.d.z();
      if ((this.d.z() & 0x40) != 0) {
        b = 2;
      } else {
        b = 0;
      } 
      i3 = i1 | b;
      this.d.N(n - 1);
    } 
    boolean bool = this.n;
    if (z(i2)) {
      this.d.L(k);
      parami.b(this.d, i3);
      this.d.L(m);
    } 
    if (this.b != 2 && !bool && this.n && l1 != -1L)
      this.p = true; 
    this.d.M(k);
    return 0;
  }
  
  public void h(j paramj) {
    this.l = paramj;
  }
  
  public void i(long paramLong1, long paramLong2) {
    boolean bool;
    if (this.b != 2) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    int i = this.c.size();
    byte b;
    for (b = 0; b < i; b++) {
      boolean bool1;
      e0 e01 = this.c.get(b);
      if (e01.e() == -9223372036854775807L) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (bool1 || (e01.e() != 0L && e01.c() != paramLong2)) {
        e01.g();
        e01.h(paramLong2);
      } 
    } 
    if (paramLong2 != 0L) {
      e0 e01 = this.k;
      if (e01 != null)
        e01.h(paramLong2); 
    } 
    this.d.H();
    this.e.clear();
    for (b = 0; b < this.g.size(); b++)
      ((h0)this.g.valueAt(b)).c(); 
    this.r = 0;
  }
  
  private class a implements a0 {
    private final u a = new u(new byte[4]);
    
    public a(g0 this$0) {}
    
    public void a(e0 param1e0, j param1j, h0.d param1d) {}
    
    public void b(v param1v) {
      if (param1v.z() != 0)
        return; 
      param1v.N(7);
      int i = param1v.a() / 4;
      for (byte b = 0; b < i; b++) {
        param1v.g(this.a, 4);
        int j = this.a.h(16);
        this.a.q(3);
        if (j == 0) {
          this.a.q(13);
        } else {
          j = this.a.h(13);
          g0.b(this.b).put(j, new b0(new g0.b(this.b, j)));
          g0.k(this.b);
        } 
      } 
      if (g0.l(this.b) != 2)
        g0.b(this.b).remove(0); 
    }
  }
  
  private class b implements a0 {
    private final u a = new u(new byte[5]);
    
    private final SparseArray<h0> b = new SparseArray();
    
    private final SparseIntArray c = new SparseIntArray();
    
    private final int d;
    
    public b(g0 this$0, int param1Int) {
      this.d = param1Int;
    }
    
    private h0.b c(v param1v, int param1Int) {
      // Byte code:
      //   0: aload_1
      //   1: invokevirtual c : ()I
      //   4: istore_3
      //   5: iload_2
      //   6: iload_3
      //   7: iadd
      //   8: istore #4
      //   10: aconst_null
      //   11: astore #5
      //   13: aconst_null
      //   14: astore #6
      //   16: iconst_m1
      //   17: istore_2
      //   18: aload_1
      //   19: invokevirtual c : ()I
      //   22: iload #4
      //   24: if_icmpge -> 369
      //   27: aload_1
      //   28: invokevirtual z : ()I
      //   31: istore #7
      //   33: aload_1
      //   34: invokevirtual z : ()I
      //   37: istore #8
      //   39: aload_1
      //   40: invokevirtual c : ()I
      //   43: iload #8
      //   45: iadd
      //   46: istore #8
      //   48: iload #7
      //   50: iconst_5
      //   51: if_icmpne -> 139
      //   54: aload_1
      //   55: invokevirtual B : ()J
      //   58: lstore #9
      //   60: lload #9
      //   62: ldc2_w 1094921523
      //   65: lcmp
      //   66: ifne -> 72
      //   69: goto -> 146
      //   72: lload #9
      //   74: ldc2_w 1161904947
      //   77: lcmp
      //   78: ifne -> 84
      //   81: goto -> 168
      //   84: lload #9
      //   86: ldc2_w 1094921524
      //   89: lcmp
      //   90: ifne -> 108
      //   93: sipush #172
      //   96: istore_2
      //   97: aload #5
      //   99: astore #11
      //   101: aload #6
      //   103: astore #12
      //   105: goto -> 347
      //   108: aload #5
      //   110: astore #11
      //   112: aload #6
      //   114: astore #12
      //   116: lload #9
      //   118: ldc2_w 1212503619
      //   121: lcmp
      //   122: ifne -> 347
      //   125: bipush #36
      //   127: istore_2
      //   128: aload #5
      //   130: astore #11
      //   132: aload #6
      //   134: astore #12
      //   136: goto -> 347
      //   139: iload #7
      //   141: bipush #106
      //   143: if_icmpne -> 161
      //   146: sipush #129
      //   149: istore_2
      //   150: aload #5
      //   152: astore #11
      //   154: aload #6
      //   156: astore #12
      //   158: goto -> 347
      //   161: iload #7
      //   163: bipush #122
      //   165: if_icmpne -> 183
      //   168: sipush #135
      //   171: istore_2
      //   172: aload #5
      //   174: astore #11
      //   176: aload #6
      //   178: astore #12
      //   180: goto -> 347
      //   183: iload #7
      //   185: bipush #127
      //   187: if_icmpne -> 210
      //   190: aload #5
      //   192: astore #11
      //   194: aload #6
      //   196: astore #12
      //   198: aload_1
      //   199: invokevirtual z : ()I
      //   202: bipush #21
      //   204: if_icmpne -> 347
      //   207: goto -> 93
      //   210: iload #7
      //   212: bipush #123
      //   214: if_icmpne -> 232
      //   217: sipush #138
      //   220: istore_2
      //   221: aload #5
      //   223: astore #11
      //   225: aload #6
      //   227: astore #12
      //   229: goto -> 347
      //   232: iload #7
      //   234: bipush #10
      //   236: if_icmpne -> 256
      //   239: aload_1
      //   240: iconst_3
      //   241: invokevirtual w : (I)Ljava/lang/String;
      //   244: invokevirtual trim : ()Ljava/lang/String;
      //   247: astore #11
      //   249: aload #6
      //   251: astore #12
      //   253: goto -> 347
      //   256: aload #5
      //   258: astore #11
      //   260: aload #6
      //   262: astore #12
      //   264: iload #7
      //   266: bipush #89
      //   268: if_icmpne -> 347
      //   271: new java/util/ArrayList
      //   274: dup
      //   275: invokespecial <init> : ()V
      //   278: astore #12
      //   280: aload_1
      //   281: invokevirtual c : ()I
      //   284: iload #8
      //   286: if_icmpge -> 340
      //   289: aload_1
      //   290: iconst_3
      //   291: invokevirtual w : (I)Ljava/lang/String;
      //   294: invokevirtual trim : ()Ljava/lang/String;
      //   297: astore #11
      //   299: aload_1
      //   300: invokevirtual z : ()I
      //   303: istore_2
      //   304: iconst_4
      //   305: newarray byte
      //   307: astore #6
      //   309: aload_1
      //   310: aload #6
      //   312: iconst_0
      //   313: iconst_4
      //   314: invokevirtual h : ([BII)V
      //   317: aload #12
      //   319: new com/google/android/exoplayer2/c1/d0/h0$a
      //   322: dup
      //   323: aload #11
      //   325: iload_2
      //   326: aload #6
      //   328: invokespecial <init> : (Ljava/lang/String;I[B)V
      //   331: invokeinterface add : (Ljava/lang/Object;)Z
      //   336: pop
      //   337: goto -> 280
      //   340: bipush #89
      //   342: istore_2
      //   343: aload #5
      //   345: astore #11
      //   347: aload_1
      //   348: iload #8
      //   350: aload_1
      //   351: invokevirtual c : ()I
      //   354: isub
      //   355: invokevirtual N : (I)V
      //   358: aload #11
      //   360: astore #5
      //   362: aload #12
      //   364: astore #6
      //   366: goto -> 18
      //   369: aload_1
      //   370: iload #4
      //   372: invokevirtual M : (I)V
      //   375: new com/google/android/exoplayer2/c1/d0/h0$b
      //   378: dup
      //   379: iload_2
      //   380: aload #5
      //   382: aload #6
      //   384: aload_1
      //   385: getfield a : [B
      //   388: iload_3
      //   389: iload #4
      //   391: invokestatic copyOfRange : ([BII)[B
      //   394: invokespecial <init> : (ILjava/lang/String;Ljava/util/List;[B)V
      //   397: areturn
    }
    
    public void a(e0 param1e0, j param1j, h0.d param1d) {}
    
    public void b(v param1v) {
      e0 e0;
      if (param1v.z() != 2)
        return; 
      int i = g0.l(this.e);
      boolean bool = false;
      if (i == 1 || g0.l(this.e) == 2 || g0.c(this.e) == 1) {
        e0 = g0.m(this.e).get(0);
      } else {
        e0 = new e0(((e0)g0.m(this.e).get(0)).c());
        g0.m(this.e).add(e0);
      } 
      param1v.N(2);
      int j = param1v.F();
      param1v.N(3);
      param1v.g(this.a, 2);
      this.a.q(3);
      g0.n(this.e, this.a.h(13));
      param1v.g(this.a, 2);
      this.a.q(4);
      param1v.N(this.a.h(12));
      if (g0.l(this.e) == 2 && g0.o(this.e) == null) {
        h0.b b1 = new h0.b(21, null, null, h0.f);
        g0 g01 = this.e;
        g0.p(g01, g0.q(g01).a(21, b1));
        g0.o(this.e).a(e0, g0.r(this.e), new h0.d(j, 21, 8192));
      } 
      this.b.clear();
      this.c.clear();
      int k;
      for (k = param1v.a(); k > 0; k = m) {
        param1v.g(this.a, 5);
        int m = this.a.h(8);
        this.a.q(3);
        int n = this.a.h(13);
        this.a.q(4);
        int i1 = this.a.h(12);
        h0.b b1 = c(param1v, i1);
        i = m;
        if (m == 6)
          i = b1.a; 
        m = k - i1 + 5;
        if (g0.l(this.e) == 2) {
          k = i;
        } else {
          k = n;
        } 
        if (!g0.s(this.e).get(k)) {
          h0 h0;
          if (g0.l(this.e) == 2 && i == 21) {
            h0 = g0.o(this.e);
          } else {
            h0 = g0.q(this.e).a(i, (h0.b)h0);
          } 
          if (g0.l(this.e) != 2 || n < this.c.get(k, 8192)) {
            this.c.put(k, n);
            this.b.put(k, h0);
          } 
        } 
      } 
      k = this.c.size();
      for (i = 0; i < k; i++) {
        int m = this.c.keyAt(i);
        int n = this.c.valueAt(i);
        g0.s(this.e).put(m, true);
        g0.t(this.e).put(n, true);
        h0 h0 = (h0)this.b.valueAt(i);
        if (h0 != null) {
          if (h0 != g0.o(this.e))
            h0.a(e0, g0.r(this.e), new h0.d(j, m, 8192)); 
          g0.b(this.e).put(n, h0);
        } 
      } 
      if (g0.l(this.e) == 2) {
        if (!g0.d(this.e)) {
          g0.r(this.e).f();
          g0.j(this.e, 0);
          g0.f(this.e, true);
        } 
      } else {
        g0.b(this.e).remove(this.d);
        g0 g01 = this.e;
        if (g0.l(g01) == 1) {
          i = bool;
        } else {
          i = g0.c(this.e) - 1;
        } 
        g0.j(g01, i);
        if (g0.c(this.e) == 0) {
          g0.r(this.e).f();
          g0.f(this.e, true);
        } 
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */