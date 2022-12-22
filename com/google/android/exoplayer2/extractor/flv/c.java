package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.l;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.util.v;

public final class c implements h {
  public static final l a = a.a;
  
  private final v b = new v(4);
  
  private final v c = new v(9);
  
  private final v d = new v(11);
  
  private final v e = new v();
  
  private final d f = new d();
  
  private j g;
  
  private int h = 1;
  
  private boolean i;
  
  private long j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private long n;
  
  private boolean o;
  
  private b p;
  
  private e q;
  
  private void b() {
    if (!this.o) {
      this.g.a((t)new t.b(-9223372036854775807L));
      this.o = true;
    } 
  }
  
  private long c() {
    long l1;
    if (this.i) {
      l1 = this.j + this.n;
    } else if (this.f.d() == -9223372036854775807L) {
      l1 = 0L;
    } else {
      l1 = this.n;
    } 
    return l1;
  }
  
  private v f(i parami) {
    if (this.m > this.e.b()) {
      v v1 = this.e;
      v1.K(new byte[Math.max(v1.b() * 2, this.m)], 0);
    } else {
      this.e.M(0);
    } 
    this.e.L(this.m);
    parami.readFully(this.e.a, 0, this.m);
    return this.e;
  }
  
  private boolean j(i parami) {
    boolean bool2;
    byte[] arrayOfByte = this.c.a;
    boolean bool1 = false;
    if (!parami.b(arrayOfByte, 0, 9, true))
      return false; 
    this.c.M(0);
    this.c.N(4);
    int k = this.c.z();
    if ((k & 0x4) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if ((k & 0x1) != 0)
      bool1 = true; 
    if (bool2 && this.p == null)
      this.p = new b(this.g.g(8, 1)); 
    if (bool1 && this.q == null)
      this.q = new e(this.g.g(9, 2)); 
    this.g.f();
    this.k = this.c.k() - 9 + 4;
    this.h = 2;
    return true;
  }
  
  private boolean k(i parami) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial c : ()J
    //   4: lstore_2
    //   5: aload_0
    //   6: getfield l : I
    //   9: istore #4
    //   11: iconst_0
    //   12: istore #5
    //   14: iload #4
    //   16: bipush #8
    //   18: if_icmpne -> 61
    //   21: aload_0
    //   22: getfield p : Lcom/google/android/exoplayer2/extractor/flv/b;
    //   25: ifnull -> 61
    //   28: aload_0
    //   29: invokespecial b : ()V
    //   32: aload_0
    //   33: getfield p : Lcom/google/android/exoplayer2/extractor/flv/b;
    //   36: aload_0
    //   37: aload_1
    //   38: invokespecial f : (Lcom/google/android/exoplayer2/c1/i;)Lcom/google/android/exoplayer2/util/v;
    //   41: lload_2
    //   42: invokevirtual a : (Lcom/google/android/exoplayer2/util/v;J)Z
    //   45: istore #6
    //   47: iconst_1
    //   48: istore #7
    //   50: iload #6
    //   52: istore #5
    //   54: iload #7
    //   56: istore #6
    //   58: goto -> 188
    //   61: iload #4
    //   63: bipush #9
    //   65: if_icmpne -> 97
    //   68: aload_0
    //   69: getfield q : Lcom/google/android/exoplayer2/extractor/flv/e;
    //   72: ifnull -> 97
    //   75: aload_0
    //   76: invokespecial b : ()V
    //   79: aload_0
    //   80: getfield q : Lcom/google/android/exoplayer2/extractor/flv/e;
    //   83: aload_0
    //   84: aload_1
    //   85: invokespecial f : (Lcom/google/android/exoplayer2/c1/i;)Lcom/google/android/exoplayer2/util/v;
    //   88: lload_2
    //   89: invokevirtual a : (Lcom/google/android/exoplayer2/util/v;J)Z
    //   92: istore #6
    //   94: goto -> 47
    //   97: iload #4
    //   99: bipush #18
    //   101: if_icmpne -> 175
    //   104: aload_0
    //   105: getfield o : Z
    //   108: ifne -> 175
    //   111: aload_0
    //   112: getfield f : Lcom/google/android/exoplayer2/extractor/flv/d;
    //   115: aload_0
    //   116: aload_1
    //   117: invokespecial f : (Lcom/google/android/exoplayer2/c1/i;)Lcom/google/android/exoplayer2/util/v;
    //   120: lload_2
    //   121: invokevirtual a : (Lcom/google/android/exoplayer2/util/v;J)Z
    //   124: istore #5
    //   126: aload_0
    //   127: getfield f : Lcom/google/android/exoplayer2/extractor/flv/d;
    //   130: invokevirtual d : ()J
    //   133: lstore_2
    //   134: iload #5
    //   136: istore #6
    //   138: lload_2
    //   139: ldc2_w -9223372036854775807
    //   142: lcmp
    //   143: ifeq -> 47
    //   146: aload_0
    //   147: getfield g : Lcom/google/android/exoplayer2/c1/j;
    //   150: new com/google/android/exoplayer2/c1/t$b
    //   153: dup
    //   154: lload_2
    //   155: invokespecial <init> : (J)V
    //   158: invokeinterface a : (Lcom/google/android/exoplayer2/c1/t;)V
    //   163: aload_0
    //   164: iconst_1
    //   165: putfield o : Z
    //   168: iload #5
    //   170: istore #6
    //   172: goto -> 47
    //   175: aload_1
    //   176: aload_0
    //   177: getfield m : I
    //   180: invokeinterface i : (I)V
    //   185: iconst_0
    //   186: istore #6
    //   188: aload_0
    //   189: getfield i : Z
    //   192: ifne -> 235
    //   195: iload #5
    //   197: ifeq -> 235
    //   200: aload_0
    //   201: iconst_1
    //   202: putfield i : Z
    //   205: aload_0
    //   206: getfield f : Lcom/google/android/exoplayer2/extractor/flv/d;
    //   209: invokevirtual d : ()J
    //   212: ldc2_w -9223372036854775807
    //   215: lcmp
    //   216: ifne -> 228
    //   219: aload_0
    //   220: getfield n : J
    //   223: lneg
    //   224: lstore_2
    //   225: goto -> 230
    //   228: lconst_0
    //   229: lstore_2
    //   230: aload_0
    //   231: lload_2
    //   232: putfield j : J
    //   235: aload_0
    //   236: iconst_4
    //   237: putfield k : I
    //   240: aload_0
    //   241: iconst_2
    //   242: putfield h : I
    //   245: iload #6
    //   247: ireturn
  }
  
  private boolean l(i parami) {
    if (!parami.b(this.d.a, 0, 11, true))
      return false; 
    this.d.M(0);
    this.l = this.d.z();
    this.m = this.d.C();
    this.n = this.d.C();
    this.n = ((this.d.z() << 24) | this.n) * 1000L;
    this.d.N(3);
    this.h = 4;
    return true;
  }
  
  private void m(i parami) {
    parami.i(this.k);
    this.k = 0;
    this.h = 3;
  }
  
  public void a() {}
  
  public boolean e(i parami) {
    byte[] arrayOfByte = this.b.a;
    boolean bool = false;
    parami.k(arrayOfByte, 0, 3);
    this.b.M(0);
    if (this.b.C() != 4607062)
      return false; 
    parami.k(this.b.a, 0, 2);
    this.b.M(0);
    if ((this.b.F() & 0xFA) != 0)
      return false; 
    parami.k(this.b.a, 0, 4);
    this.b.M(0);
    int k = this.b.k();
    parami.h();
    parami.e(k);
    parami.k(this.b.a, 0, 4);
    this.b.M(0);
    if (this.b.k() == 0)
      bool = true; 
    return bool;
  }
  
  public int g(i parami, s params) {
    while (true) {
      int k = this.h;
      if (k != 1) {
        if (k != 2) {
          if (k != 3) {
            if (k == 4) {
              if (k(parami))
                return 0; 
              continue;
            } 
            throw new IllegalStateException();
          } 
          if (!l(parami))
            return -1; 
          continue;
        } 
        m(parami);
        continue;
      } 
      if (!j(parami))
        return -1; 
    } 
  }
  
  public void h(j paramj) {
    this.g = paramj;
  }
  
  public void i(long paramLong1, long paramLong2) {
    this.h = 1;
    this.i = false;
    this.k = 0;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/extractor/flv/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */