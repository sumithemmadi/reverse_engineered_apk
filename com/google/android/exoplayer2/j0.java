package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.source.u;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.trackselection.h;
import com.google.android.exoplayer2.trackselection.i;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.util.e;

final class j0 {
  private final y0.b a = new y0.b();
  
  private final y0.c b = new y0.c();
  
  private long c;
  
  private y0 d = y0.a;
  
  private int e;
  
  private boolean f;
  
  private h0 g;
  
  private h0 h;
  
  private h0 i;
  
  private int j;
  
  private Object k;
  
  private long l;
  
  private boolean A() {
    h0 h01 = this.g;
    if (h01 == null)
      return true; 
    int i = this.d.b(h01.b);
    while (true) {
      i = this.d.d(i, this.a, this.b, this.e, this.f);
      while (h01.j() != null && !h01.f.f)
        h01 = h01.j(); 
      h0 h02 = h01.j();
      if (i == -1 || h02 == null || this.d.b(h02.b) != i)
        break; 
      h01 = h02;
    } 
    boolean bool = u(h01);
    h01.f = p(h01.f);
    return bool ^ true;
  }
  
  private boolean c(long paramLong1, long paramLong2) {
    return (paramLong1 == -9223372036854775807L || paramLong1 == paramLong2);
  }
  
  private boolean d(i0 parami01, i0 parami02) {
    boolean bool;
    if (parami01.b == parami02.b && parami01.a.equals(parami02.a)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private i0 g(k0 paramk0) {
    return j(paramk0.c, paramk0.e, paramk0.d);
  }
  
  private i0 h(h0 paramh0, long paramLong) {
    Object<Object, Long> object1;
    y0 y01;
    y0.c c1;
    i0 i0 = paramh0.f;
    long l1 = paramh0.l() + i0.e - paramLong;
    boolean bool = i0.f;
    long l2 = 0L;
    Pair<Object, Long> pair = null;
    Object<Object, Long> object2 = null;
    if (bool) {
      int k = this.d.b(i0.a.a);
      int m = this.d.d(k, this.a, this.b, this.e, this.f);
      if (m == -1)
        return null; 
      k = (this.d.g(m, this.a, true)).c;
      object2 = (Object<Object, Long>)this.a.b;
      paramLong = i0.a.d;
      if ((this.d.n(k, this.b)).j == m) {
        pair = this.d.k(this.b, this.a, k, -9223372036854775807L, Math.max(0L, l1));
        if (pair == null)
          return null; 
        object2 = (Object<Object, Long>)pair.first;
        l1 = ((Long)pair.second).longValue();
        paramh0 = paramh0.j();
        if (paramh0 != null && paramh0.b.equals(object2)) {
          paramLong = paramh0.f.a.d;
        } else {
          paramLong = this.c;
          this.c = 1L + paramLong;
        } 
        l2 = -9223372036854775807L;
        object1 = object2;
      } else {
        object1 = object2;
        l1 = 0L;
      } 
      return j(w(object1, l1, paramLong), l2, l1);
    } 
    v.a a = i0.a;
    this.d.h(a.a, this.a);
    if (a.a()) {
      int m = a.b;
      int k = this.a.a(m);
      if (k == -1)
        return null; 
      int n = this.a.j(m, a.c);
      if (n < k) {
        if (!this.a.n(m, n)) {
          object1 = object2;
        } else {
          object1 = (Object<Object, Long>)k(((v.a)object1).a, m, n, i0.c, ((v.a)object1).d);
        } 
        return (i0)object1;
      } 
      paramLong = i0.c;
      if (paramLong == -9223372036854775807L) {
        y01 = this.d;
        c1 = this.b;
        object2 = (Object<Object, Long>)this.a;
        object2 = (Object<Object, Long>)y01.k(c1, (y0.b)object2, ((y0.b)object2).c, -9223372036854775807L, Math.max(0L, l1));
        if (object2 == null)
          return null; 
        paramLong = ((Long)((Pair)object2).second).longValue();
      } 
      return l(((v.a)object1).a, paramLong, ((v.a)object1).d);
    } 
    int j = this.a.e(((i0)y01).d);
    if (j == -1)
      return l(((v.a)object1).a, ((i0)y01).e, ((v.a)object1).d); 
    int i = this.a.i(j);
    if (!this.a.n(j, i)) {
      object1 = (Object<Object, Long>)c1;
    } else {
      object1 = (Object<Object, Long>)k(((v.a)object1).a, j, i, ((i0)y01).e, ((v.a)object1).d);
    } 
    return (i0)object1;
  }
  
  private i0 j(v.a parama, long paramLong1, long paramLong2) {
    this.d.h(parama.a, this.a);
    return parama.a() ? (!this.a.n(parama.b, parama.c) ? null : k(parama.a, parama.b, parama.c, paramLong1, parama.d)) : l(parama.a, paramLong2, parama.d);
  }
  
  private i0 k(Object paramObject, int paramInt1, int paramInt2, long paramLong1, long paramLong2) {
    paramObject = new v.a(paramObject, paramInt1, paramInt2, paramLong2);
    long l = this.d.h(((v.a)paramObject).a, this.a).b(((v.a)paramObject).b, ((v.a)paramObject).c);
    if (paramInt2 == this.a.i(paramInt1)) {
      paramLong2 = this.a.g();
    } else {
      paramLong2 = 0L;
    } 
    return new i0((v.a)paramObject, paramLong2, paramLong1, -9223372036854775807L, l, false, false);
  }
  
  private i0 l(Object paramObject, long paramLong1, long paramLong2) {
    int i = this.a.d(paramLong1);
    paramObject = new v.a(paramObject, paramLong2, i);
    boolean bool1 = q((v.a)paramObject);
    boolean bool2 = r((v.a)paramObject, bool1);
    if (i != -1) {
      paramLong2 = this.a.f(i);
    } else {
      paramLong2 = -9223372036854775807L;
    } 
    if (paramLong2 == -9223372036854775807L || paramLong2 == Long.MIN_VALUE) {
      long l1 = this.a.d;
      return new i0((v.a)paramObject, paramLong1, -9223372036854775807L, paramLong2, l1, bool1, bool2);
    } 
    long l = paramLong2;
    return new i0((v.a)paramObject, paramLong1, -9223372036854775807L, paramLong2, l, bool1, bool2);
  }
  
  private boolean q(v.a parama) {
    boolean bool;
    if (!parama.a() && parama.e == -1) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private boolean r(v.a parama, boolean paramBoolean) {
    int i = this.d.b(parama.a);
    int j = (this.d.f(i, this.a)).c;
    if (!(this.d.n(j, this.b)).h && this.d.r(i, this.a, this.b, this.e, this.f) && paramBoolean) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    return paramBoolean;
  }
  
  private v.a w(Object paramObject, long paramLong1, long paramLong2) {
    this.d.h(paramObject, this.a);
    int i = this.a.e(paramLong1);
    return (i == -1) ? new v.a(paramObject, paramLong2, this.a.d(paramLong1)) : new v.a(paramObject, i, this.a.i(i), paramLong2);
  }
  
  private long x(Object paramObject) {
    int i = (this.d.h(paramObject, this.a)).c;
    Object object = this.k;
    if (object != null) {
      int j = this.d.b(object);
      if (j != -1 && (this.d.f(j, this.a)).c == i)
        return this.l; 
    } 
    for (object = this.g; object != null; object = object.j()) {
      if (((h0)object).b.equals(paramObject))
        return ((h0)object).f.a.d; 
    } 
    for (object = this.g; object != null; object = object.j()) {
      int j = this.d.b(((h0)object).b);
      if (j != -1 && (this.d.f(j, this.a)).c == i)
        return ((h0)object).f.a.d; 
    } 
    long l = this.c;
    this.c = 1L + l;
    if (this.g == null) {
      this.k = paramObject;
      this.l = l;
    } 
    return l;
  }
  
  public boolean B(long paramLong1, long paramLong2) {
    h0 h01 = this.g;
    i0 i0 = null;
    while (true) {
      boolean bool = true;
      if (h01 != null) {
        i0 i01 = h01.f;
        if (i0 == null) {
          i0 = p(i01);
        } else {
          i0 i02 = h((h0)i0, paramLong1);
          if (i02 == null)
            return u((h0)i0) ^ true; 
          if (!d(i01, i02))
            return u((h0)i0) ^ true; 
          i0 = i02;
        } 
        h01.f = i0.a(i01.c);
        if (!c(i01.e, i0.e)) {
          boolean bool1;
          paramLong1 = i0.e;
          if (paramLong1 == -9223372036854775807L) {
            paramLong1 = Long.MAX_VALUE;
          } else {
            paramLong1 = h01.z(paramLong1);
          } 
          if (h01 == this.h && (paramLong2 == Long.MIN_VALUE || paramLong2 >= paramLong1)) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          if (u(h01) || bool1)
            bool = false; 
          return bool;
        } 
        h0 h03 = h01.j();
        h0 h02 = h01;
        h01 = h03;
        continue;
      } 
      return true;
    } 
  }
  
  public boolean C(int paramInt) {
    this.e = paramInt;
    return A();
  }
  
  public boolean D(boolean paramBoolean) {
    this.f = paramBoolean;
    return A();
  }
  
  public h0 a() {
    h0 h01 = this.g;
    if (h01 == null)
      return null; 
    if (h01 == this.h)
      this.h = h01.j(); 
    this.g.t();
    int i = this.j - 1;
    this.j = i;
    if (i == 0) {
      this.i = null;
      h01 = this.g;
      this.k = h01.b;
      this.l = h01.f.a.d;
    } 
    h01 = this.g.j();
    this.g = h01;
    return h01;
  }
  
  public h0 b() {
    boolean bool;
    h0 h01 = this.h;
    if (h01 != null && h01.j() != null) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    h01 = this.h.j();
    this.h = h01;
    return h01;
  }
  
  public void e(boolean paramBoolean) {
    h0 h01 = this.g;
    if (h01 != null) {
      Object object;
      if (paramBoolean) {
        object = h01.b;
      } else {
        object = null;
      } 
      this.k = object;
      this.l = h01.f.a.d;
      u(h01);
      h01.t();
    } else if (!paramBoolean) {
      this.k = null;
    } 
    this.g = null;
    this.i = null;
    this.h = null;
    this.j = 0;
  }
  
  public h0 f(t0[] paramArrayOft0, h paramh, e parame, v paramv, i0 parami0, i parami) {
    // Byte code:
    //   0: aload_0
    //   1: getfield i : Lcom/google/android/exoplayer2/h0;
    //   4: astore #7
    //   6: aload #7
    //   8: ifnonnull -> 47
    //   11: aload #5
    //   13: getfield a : Lcom/google/android/exoplayer2/source/v$a;
    //   16: invokevirtual a : ()Z
    //   19: ifeq -> 41
    //   22: aload #5
    //   24: getfield c : J
    //   27: lstore #8
    //   29: lload #8
    //   31: ldc2_w -9223372036854775807
    //   34: lcmp
    //   35: ifeq -> 41
    //   38: goto -> 71
    //   41: lconst_0
    //   42: lstore #8
    //   44: goto -> 71
    //   47: aload #7
    //   49: invokevirtual l : ()J
    //   52: aload_0
    //   53: getfield i : Lcom/google/android/exoplayer2/h0;
    //   56: getfield f : Lcom/google/android/exoplayer2/i0;
    //   59: getfield e : J
    //   62: ladd
    //   63: aload #5
    //   65: getfield b : J
    //   68: lsub
    //   69: lstore #8
    //   71: new com/google/android/exoplayer2/h0
    //   74: dup
    //   75: aload_1
    //   76: lload #8
    //   78: aload_2
    //   79: aload_3
    //   80: aload #4
    //   82: aload #5
    //   84: aload #6
    //   86: invokespecial <init> : ([Lcom/google/android/exoplayer2/t0;JLcom/google/android/exoplayer2/trackselection/h;Lcom/google/android/exoplayer2/upstream/e;Lcom/google/android/exoplayer2/source/v;Lcom/google/android/exoplayer2/i0;Lcom/google/android/exoplayer2/trackselection/i;)V
    //   89: astore_2
    //   90: aload_0
    //   91: getfield i : Lcom/google/android/exoplayer2/h0;
    //   94: astore_1
    //   95: aload_1
    //   96: ifnull -> 107
    //   99: aload_1
    //   100: aload_2
    //   101: invokevirtual w : (Lcom/google/android/exoplayer2/h0;)V
    //   104: goto -> 117
    //   107: aload_0
    //   108: aload_2
    //   109: putfield g : Lcom/google/android/exoplayer2/h0;
    //   112: aload_0
    //   113: aload_2
    //   114: putfield h : Lcom/google/android/exoplayer2/h0;
    //   117: aload_0
    //   118: aconst_null
    //   119: putfield k : Ljava/lang/Object;
    //   122: aload_0
    //   123: aload_2
    //   124: putfield i : Lcom/google/android/exoplayer2/h0;
    //   127: aload_0
    //   128: aload_0
    //   129: getfield j : I
    //   132: iconst_1
    //   133: iadd
    //   134: putfield j : I
    //   137: aload_2
    //   138: areturn
  }
  
  public h0 i() {
    return this.i;
  }
  
  public i0 m(long paramLong, k0 paramk0) {
    i0 i0;
    h0 h01 = this.i;
    if (h01 == null) {
      i0 = g(paramk0);
    } else {
      i0 = h(h01, paramLong);
    } 
    return i0;
  }
  
  public h0 n() {
    return this.g;
  }
  
  public h0 o() {
    return this.h;
  }
  
  public i0 p(i0 parami0) {
    long l;
    v.a a = parami0.a;
    boolean bool1 = q(a);
    boolean bool2 = r(a, bool1);
    this.d.h(parami0.a.a, this.a);
    if (a.a()) {
      l = this.a.b(a.b, a.c);
    } else {
      long l1 = parami0.d;
      if (l1 != -9223372036854775807L) {
        long l2 = l1;
        if (l1 == Long.MIN_VALUE)
          l2 = this.a.h(); 
        return new i0(a, parami0.b, parami0.c, parami0.d, l2, bool1, bool2);
      } 
      l = this.a.h();
    } 
    return new i0(a, parami0.b, parami0.c, parami0.d, l, bool1, bool2);
  }
  
  public boolean s(u paramu) {
    boolean bool;
    h0 h01 = this.i;
    if (h01 != null && h01.a == paramu) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void t(long paramLong) {
    h0 h01 = this.i;
    if (h01 != null)
      h01.s(paramLong); 
  }
  
  public boolean u(h0 paramh0) {
    boolean bool1 = false;
    if (paramh0 != null) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    e.f(bool2);
    this.i = paramh0;
    boolean bool2 = bool1;
    while (paramh0.j() != null) {
      paramh0 = paramh0.j();
      if (paramh0 == this.h) {
        this.h = this.g;
        bool2 = true;
      } 
      paramh0.t();
      this.j--;
    } 
    this.i.w(null);
    return bool2;
  }
  
  public v.a v(Object paramObject, long paramLong) {
    return w(paramObject, paramLong, x(paramObject));
  }
  
  public void y(y0 paramy0) {
    this.d = paramy0;
  }
  
  public boolean z() {
    h0 h01 = this.i;
    return (h01 == null || (!h01.f.g && h01.q() && this.i.f.e != -9223372036854775807L && this.j < 100));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */