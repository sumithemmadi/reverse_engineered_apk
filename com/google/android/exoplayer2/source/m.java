package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.b1.e;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.trackselection.f;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.r;
import com.google.android.exoplayer2.w0;

public final class m implements u, u.a {
  public final u b;
  
  private u.a c;
  
  private a[] d;
  
  private long e;
  
  long f;
  
  long g;
  
  public m(u paramu, boolean paramBoolean, long paramLong1, long paramLong2) {
    long l;
    this.b = paramu;
    this.d = new a[0];
    if (paramBoolean) {
      l = paramLong1;
    } else {
      l = -9223372036854775807L;
    } 
    this.e = l;
    this.f = paramLong1;
    this.g = paramLong2;
  }
  
  private w0 b(long paramLong, w0 paramw0) {
    long l1 = h0.o(paramw0.f, 0L, paramLong - this.f);
    long l2 = paramw0.g;
    long l3 = this.g;
    if (l3 == Long.MIN_VALUE) {
      paramLong = Long.MAX_VALUE;
    } else {
      paramLong = l3 - paramLong;
    } 
    paramLong = h0.o(l2, 0L, paramLong);
    return (l1 == paramw0.f && paramLong == paramw0.g) ? paramw0 : new w0(l1, paramLong);
  }
  
  private static boolean h(long paramLong, f[] paramArrayOff) {
    if (paramLong != 0L) {
      int i = paramArrayOff.length;
      for (byte b = 0; b < i; b++) {
        f f1 = paramArrayOff[b];
        if (f1 != null && !r.l((f1.i()).j))
          return true; 
      } 
    } 
    return false;
  }
  
  public long A() {
    if (c()) {
      long l3 = this.e;
      this.e = -9223372036854775807L;
      long l4 = A();
      if (l4 != -9223372036854775807L)
        l3 = l4; 
      return l3;
    } 
    long l1 = this.b.A();
    if (l1 == -9223372036854775807L)
      return -9223372036854775807L; 
    long l2 = this.f;
    boolean bool1 = true;
    if (l1 >= l2) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    e.f(bool2);
    l2 = this.g;
    boolean bool2 = bool1;
    if (l2 != Long.MIN_VALUE)
      if (l1 <= l2) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }  
    e.f(bool2);
    return l1;
  }
  
  public void B(u.a parama, long paramLong) {
    this.c = parama;
    this.b.B(this, paramLong);
  }
  
  public TrackGroupArray C() {
    return this.b.C();
  }
  
  public void D(long paramLong, boolean paramBoolean) {
    this.b.D(paramLong, paramBoolean);
  }
  
  boolean c() {
    boolean bool;
    if (this.e != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void f(u paramu) {
    ((u.a)e.e(this.c)).f(this);
  }
  
  public void g(u paramu) {
    ((u.a<m>)e.e(this.c)).d(this);
  }
  
  public boolean r() {
    return this.b.r();
  }
  
  public long s() {
    long l = this.b.s();
    if (l != Long.MIN_VALUE) {
      long l1 = this.g;
      if (l1 == Long.MIN_VALUE || l < l1)
        return l; 
    } 
    return Long.MIN_VALUE;
  }
  
  public boolean t(long paramLong) {
    return this.b.t(paramLong);
  }
  
  public long u() {
    long l = this.b.u();
    if (l != Long.MIN_VALUE) {
      long l1 = this.g;
      if (l1 == Long.MIN_VALUE || l < l1)
        return l; 
    } 
    return Long.MIN_VALUE;
  }
  
  public void v(long paramLong) {
    this.b.v(paramLong);
  }
  
  public long w(f[] paramArrayOff, boolean[] paramArrayOfboolean1, b0[] paramArrayOfb0, boolean[] paramArrayOfboolean2, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: aload_3
    //   2: arraylength
    //   3: anewarray com/google/android/exoplayer2/source/m$a
    //   6: putfield d : [Lcom/google/android/exoplayer2/source/m$a;
    //   9: aload_3
    //   10: arraylength
    //   11: anewarray com/google/android/exoplayer2/source/b0
    //   14: astore #7
    //   16: iconst_0
    //   17: istore #8
    //   19: iconst_0
    //   20: istore #9
    //   22: aload_3
    //   23: arraylength
    //   24: istore #10
    //   26: aconst_null
    //   27: astore #11
    //   29: iload #9
    //   31: iload #10
    //   33: if_icmpge -> 85
    //   36: aload_0
    //   37: getfield d : [Lcom/google/android/exoplayer2/source/m$a;
    //   40: astore #12
    //   42: aload #12
    //   44: iload #9
    //   46: aload_3
    //   47: iload #9
    //   49: aaload
    //   50: checkcast com/google/android/exoplayer2/source/m$a
    //   53: aastore
    //   54: aload #12
    //   56: iload #9
    //   58: aaload
    //   59: ifnull -> 72
    //   62: aload #12
    //   64: iload #9
    //   66: aaload
    //   67: getfield a : Lcom/google/android/exoplayer2/source/b0;
    //   70: astore #11
    //   72: aload #7
    //   74: iload #9
    //   76: aload #11
    //   78: aastore
    //   79: iinc #9, 1
    //   82: goto -> 22
    //   85: aload_0
    //   86: getfield b : Lcom/google/android/exoplayer2/source/u;
    //   89: aload_1
    //   90: aload_2
    //   91: aload #7
    //   93: aload #4
    //   95: lload #5
    //   97: invokeinterface w : ([Lcom/google/android/exoplayer2/trackselection/f;[Z[Lcom/google/android/exoplayer2/source/b0;[ZJ)J
    //   102: lstore #13
    //   104: aload_0
    //   105: invokevirtual c : ()Z
    //   108: ifeq -> 141
    //   111: aload_0
    //   112: getfield f : J
    //   115: lstore #15
    //   117: lload #5
    //   119: lload #15
    //   121: lcmp
    //   122: ifne -> 141
    //   125: lload #15
    //   127: aload_1
    //   128: invokestatic h : (J[Lcom/google/android/exoplayer2/trackselection/f;)Z
    //   131: ifeq -> 141
    //   134: lload #13
    //   136: lstore #15
    //   138: goto -> 146
    //   141: ldc2_w -9223372036854775807
    //   144: lstore #15
    //   146: aload_0
    //   147: lload #15
    //   149: putfield e : J
    //   152: lload #13
    //   154: lload #5
    //   156: lcmp
    //   157: ifeq -> 202
    //   160: lload #13
    //   162: aload_0
    //   163: getfield f : J
    //   166: lcmp
    //   167: iflt -> 196
    //   170: aload_0
    //   171: getfield g : J
    //   174: lstore #5
    //   176: lload #5
    //   178: ldc2_w -9223372036854775808
    //   181: lcmp
    //   182: ifeq -> 202
    //   185: lload #13
    //   187: lload #5
    //   189: lcmp
    //   190: ifgt -> 196
    //   193: goto -> 202
    //   196: iconst_0
    //   197: istore #17
    //   199: goto -> 205
    //   202: iconst_1
    //   203: istore #17
    //   205: iload #17
    //   207: invokestatic f : (Z)V
    //   210: iload #8
    //   212: istore #9
    //   214: iload #9
    //   216: aload_3
    //   217: arraylength
    //   218: if_icmpge -> 301
    //   221: aload #7
    //   223: iload #9
    //   225: aaload
    //   226: ifnonnull -> 240
    //   229: aload_0
    //   230: getfield d : [Lcom/google/android/exoplayer2/source/m$a;
    //   233: iload #9
    //   235: aconst_null
    //   236: aastore
    //   237: goto -> 284
    //   240: aload_0
    //   241: getfield d : [Lcom/google/android/exoplayer2/source/m$a;
    //   244: astore_1
    //   245: aload_1
    //   246: iload #9
    //   248: aaload
    //   249: ifnull -> 267
    //   252: aload_1
    //   253: iload #9
    //   255: aaload
    //   256: getfield a : Lcom/google/android/exoplayer2/source/b0;
    //   259: aload #7
    //   261: iload #9
    //   263: aaload
    //   264: if_acmpeq -> 284
    //   267: aload_1
    //   268: iload #9
    //   270: new com/google/android/exoplayer2/source/m$a
    //   273: dup
    //   274: aload_0
    //   275: aload #7
    //   277: iload #9
    //   279: aaload
    //   280: invokespecial <init> : (Lcom/google/android/exoplayer2/source/m;Lcom/google/android/exoplayer2/source/b0;)V
    //   283: aastore
    //   284: aload_3
    //   285: iload #9
    //   287: aload_0
    //   288: getfield d : [Lcom/google/android/exoplayer2/source/m$a;
    //   291: iload #9
    //   293: aaload
    //   294: aastore
    //   295: iinc #9, 1
    //   298: goto -> 214
    //   301: lload #13
    //   303: lreturn
  }
  
  public void x() {
    this.b.x();
  }
  
  public long y(long paramLong) {
    this.e = -9223372036854775807L;
    a[] arrayOfA = this.d;
    int i = arrayOfA.length;
    boolean bool1 = false;
    for (byte b = 0; b < i; b++) {
      a a1 = arrayOfA[b];
      if (a1 != null)
        a1.d(); 
    } 
    long l = this.b.y(paramLong);
    if (l != paramLong) {
      boolean bool = bool1;
      if (l >= this.f) {
        paramLong = this.g;
        if (paramLong != Long.MIN_VALUE) {
          bool = bool1;
          if (l <= paramLong) {
            bool = true;
            e.f(bool);
            return l;
          } 
          e.f(bool);
          return l;
        } 
      } else {
        e.f(bool);
        return l;
      } 
    } 
    boolean bool2 = true;
    e.f(bool2);
    return l;
  }
  
  public long z(long paramLong, w0 paramw0) {
    long l = this.f;
    if (paramLong == l)
      return l; 
    paramw0 = b(paramLong, paramw0);
    return this.b.z(paramLong, paramw0);
  }
  
  private final class a implements b0 {
    public final b0 a;
    
    private boolean b;
    
    public a(m this$0, b0 param1b0) {
      this.a = param1b0;
    }
    
    public int a(f0 param1f0, e param1e, boolean param1Boolean) {
      Format format;
      if (this.c.c())
        return -3; 
      if (this.b) {
        param1e.setFlags(4);
        return -4;
      } 
      int i = this.a.a(param1f0, param1e, param1Boolean);
      if (i == -5) {
        format = (Format)e.e(param1f0.c);
        i = format.z;
        if (i != 0 || format.A != 0) {
          m m2 = this.c;
          long l1 = m2.f;
          int j = 0;
          if (l1 != 0L)
            i = 0; 
          if (m2.g == Long.MIN_VALUE)
            j = format.A; 
          param1f0.c = format.g(i, j);
        } 
        return -5;
      } 
      m m1 = this.c;
      long l = m1.g;
      if (l != Long.MIN_VALUE && ((i == -4 && ((e)format).d >= l) || (i == -3 && m1.u() == Long.MIN_VALUE))) {
        format.clear();
        format.setFlags(4);
        this.b = true;
        return -4;
      } 
      return i;
    }
    
    public void b() {
      this.a.b();
    }
    
    public int c(long param1Long) {
      return this.c.c() ? -3 : this.a.c(param1Long);
    }
    
    public void d() {
      this.b = false;
    }
    
    public boolean m() {
      boolean bool;
      if (!this.c.c() && this.a.m()) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */