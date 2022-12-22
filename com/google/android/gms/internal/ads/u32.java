package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

final class u32 implements j62 {
  private final o32 a;
  
  private int b;
  
  private int c;
  
  private int d = 0;
  
  private u32(o32 paramo32) {
    paramo32 = m42.<o32>d(paramo32, "input");
    this.a = paramo32;
    paramo32.d = this;
  }
  
  public static u32 N(o32 paramo32) {
    u32 u321 = paramo32.d;
    return (u321 != null) ? u321 : new u32(paramo32);
  }
  
  private final void O(List<String> paramList, boolean paramBoolean) {
    if ((this.b & 0x7) == 2) {
      if (paramList instanceof b52 && !paramBoolean) {
        paramList = paramList;
        while (true) {
          paramList.L(n());
          if (this.a.u())
            return; 
          int i = this.a.e();
          if (i != this.b) {
            this.d = i;
            return;
          } 
        } 
      } 
      while (true) {
        String str;
        if (paramBoolean) {
          str = C();
        } else {
          str = B();
        } 
        paramList.add(str);
        if (this.a.u())
          return; 
        int i = this.a.e();
        if (i != this.b) {
          this.d = i;
          return;
        } 
      } 
    } 
    zzeln zzeln = zzelo.zzbjf();
    throw zzeln;
  }
  
  private final <T> T P(o62<T> paramo62, y32 paramy32) {
    int i = this.a.n();
    o32 o321 = this.a;
    if (o321.a < o321.b) {
      i = o321.z(i);
      o321 = (o32)paramo62.i();
      o32 o323 = this.a;
      o323.a++;
      paramo62.d((T)o321, this, paramy32);
      paramo62.e((T)o321);
      this.a.x(0);
      o32 o322 = this.a;
      o322.a--;
      o322.A(i);
      return (T)o321;
    } 
    throw new zzelo("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
  }
  
  private final <T> T Q(o62<T> paramo62, y32 paramy32) {
    int i = this.c;
    this.c = this.b >>> 3 << 3 | 0x4;
    try {
      T t = paramo62.i();
      paramo62.d(t, this, paramy32);
      paramo62.e(t);
      int j = this.b;
      int k = this.c;
      if (j == k)
        return t; 
      throw zzelo.zzbjh();
    } finally {
      this.c = i;
    } 
  }
  
  private final void R(int paramInt) {
    if ((this.b & 0x7) == paramInt)
      return; 
    throw zzelo.zzbjf();
  }
  
  private static void S(int paramInt) {
    if ((paramInt & 0x7) == 0)
      return; 
    throw zzelo.zzbjh();
  }
  
  private static void T(int paramInt) {
    if ((paramInt & 0x3) == 0)
      return; 
    throw zzelo.zzbjh();
  }
  
  private final void U(int paramInt) {
    if (this.a.v() == paramInt)
      return; 
    throw zzelo.zzbja();
  }
  
  public final int A() {
    R(5);
    return this.a.p();
  }
  
  public final String B() {
    R(2);
    return this.a.c();
  }
  
  public final String C() {
    R(2);
    return this.a.l();
  }
  
  public final void D(List<Integer> paramList) {
    if (paramList instanceof n42) {
      paramList = paramList;
      int k = this.b & 0x7;
      if (k != 2) {
        if (k == 5)
          while (true) {
            paramList.M(this.a.j());
            if (this.a.u())
              return; 
            k = this.a.e();
            if (k != this.b) {
              this.d = k;
              return;
            } 
          }  
        throw zzelo.zzbjf();
      } 
      int m = this.a.n();
      T(m);
      k = this.a.v();
      do {
        paramList.M(this.a.j());
      } while (this.a.v() < k + m);
      return;
    } 
    int i = this.b & 0x7;
    if (i != 2) {
      if (i == 5)
        while (true) {
          paramList.add(Integer.valueOf(this.a.j()));
          if (this.a.u())
            return; 
          i = this.a.e();
          if (i != this.b) {
            this.d = i;
            return;
          } 
        }  
      throw zzelo.zzbjf();
    } 
    int j = this.a.n();
    T(j);
    i = this.a.v();
    do {
      paramList.add(Integer.valueOf(this.a.j()));
    } while (this.a.v() < i + j);
  }
  
  public final void E(List<String> paramList) {
    O(paramList, false);
  }
  
  public final void F(List<Float> paramList) {
    if (paramList instanceof j42) {
      paramList = paramList;
      int k = this.b & 0x7;
      if (k != 2) {
        if (k == 5)
          while (true) {
            paramList.i(this.a.b());
            if (this.a.u())
              return; 
            k = this.a.e();
            if (k != this.b) {
              this.d = k;
              return;
            } 
          }  
        throw zzelo.zzbjf();
      } 
      k = this.a.n();
      T(k);
      int m = this.a.v();
      do {
        paramList.i(this.a.b());
      } while (this.a.v() < m + k);
      return;
    } 
    int i = this.b & 0x7;
    if (i != 2) {
      if (i == 5)
        while (true) {
          paramList.add(Float.valueOf(this.a.b()));
          if (this.a.u())
            return; 
          i = this.a.e();
          if (i != this.b) {
            this.d = i;
            return;
          } 
        }  
      throw zzelo.zzbjf();
    } 
    int j = this.a.n();
    T(j);
    i = this.a.v();
    do {
      paramList.add(Float.valueOf(this.a.b()));
    } while (this.a.v() < i + j);
  }
  
  public final long G() {
    R(1);
    return this.a.q();
  }
  
  public final void H(List<zzejr> paramList) {
    if ((this.b & 0x7) == 2)
      while (true) {
        paramList.add(n());
        if (this.a.u())
          return; 
        int i = this.a.e();
        if (i != this.b) {
          this.d = i;
          return;
        } 
      }  
    zzeln zzeln = zzelo.zzbjf();
    throw zzeln;
  }
  
  public final void I(List<Long> paramList) {
    if (paramList instanceof j52) {
      paramList = paramList;
      int j = this.b & 0x7;
      if (j != 0) {
        if (j == 2) {
          j = this.a.n();
          j = this.a.v() + j;
          while (true) {
            paramList.i(this.a.s());
            if (this.a.v() >= j) {
              U(j);
              return;
            } 
          } 
        } 
        throw zzelo.zzbjf();
      } 
      while (true) {
        paramList.i(this.a.s());
        if (this.a.u())
          return; 
        j = this.a.e();
        if (j != this.b) {
          this.d = j;
          return;
        } 
      } 
    } 
    int i = this.b & 0x7;
    if (i != 0) {
      if (i == 2) {
        i = this.a.n();
        i = this.a.v() + i;
        while (true) {
          paramList.add(Long.valueOf(this.a.s()));
          if (this.a.v() >= i) {
            U(i);
            return;
          } 
        } 
      } 
      throw zzelo.zzbjf();
    } 
    while (true) {
      paramList.add(Long.valueOf(this.a.s()));
      if (this.a.u())
        return; 
      i = this.a.e();
      if (i != this.b) {
        this.d = i;
        return;
      } 
    } 
  }
  
  public final void J(List<Double> paramList) {
    if (paramList instanceof w32) {
      paramList = paramList;
      int j = this.b & 0x7;
      if (j != 1) {
        if (j == 2) {
          int k = this.a.n();
          S(k);
          j = this.a.v();
          do {
            paramList.c(this.a.a());
          } while (this.a.v() < j + k);
          return;
        } 
        throw zzelo.zzbjf();
      } 
      while (true) {
        paramList.c(this.a.a());
        if (this.a.u())
          return; 
        j = this.a.e();
        if (j != this.b) {
          this.d = j;
          return;
        } 
      } 
    } 
    int i = this.b & 0x7;
    if (i != 1) {
      if (i == 2) {
        i = this.a.n();
        S(i);
        int j = this.a.v();
        do {
          paramList.add(Double.valueOf(this.a.a()));
        } while (this.a.v() < j + i);
        return;
      } 
      throw zzelo.zzbjf();
    } 
    while (true) {
      paramList.add(Double.valueOf(this.a.a()));
      if (this.a.u())
        return; 
      i = this.a.e();
      if (i != this.b) {
        this.d = i;
        return;
      } 
    } 
  }
  
  public final long K() {
    R(0);
    return this.a.f();
  }
  
  public final int L() {
    R(0);
    return this.a.r();
  }
  
  public final void M(List<String> paramList) {
    O(paramList, true);
  }
  
  public final <T> T a(o62<T> paramo62, y32 paramy32) {
    R(3);
    return Q(paramo62, paramy32);
  }
  
  public final long b() {
    R(0);
    return this.a.s();
  }
  
  public final <T> void c(List<T> paramList, o62<T> paramo62, y32 paramy32) {
    int i = this.b;
    if ((i & 0x7) == 2) {
      while (true) {
        paramList.add(P(paramo62, paramy32));
        if (this.a.u() || this.d != 0)
          break; 
        int j = this.a.e();
        if (j != i) {
          this.d = j;
          break;
        } 
      } 
      return;
    } 
    zzeln zzeln = zzelo.zzbjf();
    throw zzeln;
  }
  
  public final void d(List<Integer> paramList) {
    if (paramList instanceof n42) {
      paramList = paramList;
      int k = this.b & 0x7;
      if (k != 2) {
        if (k == 5)
          while (true) {
            paramList.M(this.a.p());
            if (this.a.u())
              return; 
            k = this.a.e();
            if (k != this.b) {
              this.d = k;
              return;
            } 
          }  
        throw zzelo.zzbjf();
      } 
      int m = this.a.n();
      T(m);
      k = this.a.v();
      do {
        paramList.M(this.a.p());
      } while (this.a.v() < k + m);
      return;
    } 
    int i = this.b & 0x7;
    if (i != 2) {
      if (i == 5)
        while (true) {
          paramList.add(Integer.valueOf(this.a.p()));
          if (this.a.u())
            return; 
          i = this.a.e();
          if (i != this.b) {
            this.d = i;
            return;
          } 
        }  
      throw zzelo.zzbjf();
    } 
    i = this.a.n();
    T(i);
    int j = this.a.v();
    do {
      paramList.add(Integer.valueOf(this.a.p()));
    } while (this.a.v() < j + i);
  }
  
  public final long e() {
    R(0);
    return this.a.g();
  }
  
  public final <T> void f(List<T> paramList, o62<T> paramo62, y32 paramy32) {
    int i = this.b;
    if ((i & 0x7) == 3) {
      while (true) {
        paramList.add(Q(paramo62, paramy32));
        if (this.a.u() || this.d != 0)
          break; 
        int j = this.a.e();
        if (j != i) {
          this.d = j;
          break;
        } 
      } 
      return;
    } 
    zzeln zzeln = zzelo.zzbjf();
    throw zzeln;
  }
  
  public final void g(List<Long> paramList) {
    if (paramList instanceof j52) {
      paramList = paramList;
      int j = this.b & 0x7;
      if (j != 0) {
        if (j == 2) {
          j = this.a.n();
          j = this.a.v() + j;
          while (true) {
            paramList.i(this.a.g());
            if (this.a.v() >= j) {
              U(j);
              return;
            } 
          } 
        } 
        throw zzelo.zzbjf();
      } 
      while (true) {
        paramList.i(this.a.g());
        if (this.a.u())
          return; 
        j = this.a.e();
        if (j != this.b) {
          this.d = j;
          return;
        } 
      } 
    } 
    int i = this.b & 0x7;
    if (i != 0) {
      if (i == 2) {
        i = this.a.n();
        i = this.a.v() + i;
        while (true) {
          paramList.add(Long.valueOf(this.a.g()));
          if (this.a.v() >= i) {
            U(i);
            return;
          } 
        } 
      } 
      throw zzelo.zzbjf();
    } 
    while (true) {
      paramList.add(Long.valueOf(this.a.g()));
      if (this.a.u())
        return; 
      i = this.a.e();
      if (i != this.b) {
        this.d = i;
        return;
      } 
    } 
  }
  
  public final int getTag() {
    return this.b;
  }
  
  public final void h(List<Long> paramList) {
    if (paramList instanceof j52) {
      paramList = paramList;
      int j = this.b & 0x7;
      if (j != 0) {
        if (j == 2) {
          j = this.a.n();
          j = this.a.v() + j;
          while (true) {
            paramList.i(this.a.f());
            if (this.a.v() >= j) {
              U(j);
              return;
            } 
          } 
        } 
        throw zzelo.zzbjf();
      } 
      while (true) {
        paramList.i(this.a.f());
        if (this.a.u())
          return; 
        j = this.a.e();
        if (j != this.b) {
          this.d = j;
          return;
        } 
      } 
    } 
    int i = this.b & 0x7;
    if (i != 0) {
      if (i == 2) {
        i = this.a.n();
        i = this.a.v() + i;
        while (true) {
          paramList.add(Long.valueOf(this.a.f()));
          if (this.a.v() >= i) {
            U(i);
            return;
          } 
        } 
      } 
      throw zzelo.zzbjf();
    } 
    while (true) {
      paramList.add(Long.valueOf(this.a.f()));
      if (this.a.u())
        return; 
      i = this.a.e();
      if (i != this.b) {
        this.d = i;
        return;
      } 
    } 
  }
  
  public final int i() {
    R(0);
    return this.a.h();
  }
  
  public final void j(List<Integer> paramList) {
    if (paramList instanceof n42) {
      paramList = paramList;
      int j = this.b & 0x7;
      if (j != 0) {
        if (j == 2) {
          j = this.a.n();
          j = this.a.v() + j;
          while (true) {
            paramList.M(this.a.o());
            if (this.a.v() >= j) {
              U(j);
              return;
            } 
          } 
        } 
        throw zzelo.zzbjf();
      } 
      while (true) {
        paramList.M(this.a.o());
        if (this.a.u())
          return; 
        j = this.a.e();
        if (j != this.b) {
          this.d = j;
          return;
        } 
      } 
    } 
    int i = this.b & 0x7;
    if (i != 0) {
      if (i == 2) {
        i = this.a.n();
        i = this.a.v() + i;
        while (true) {
          paramList.add(Integer.valueOf(this.a.o()));
          if (this.a.v() >= i) {
            U(i);
            return;
          } 
        } 
      } 
      throw zzelo.zzbjf();
    } 
    while (true) {
      paramList.add(Integer.valueOf(this.a.o()));
      if (this.a.u())
        return; 
      i = this.a.e();
      if (i != this.b) {
        this.d = i;
        return;
      } 
    } 
  }
  
  public final void k(List<Integer> paramList) {
    if (paramList instanceof n42) {
      paramList = paramList;
      int j = this.b & 0x7;
      if (j != 0) {
        if (j == 2) {
          j = this.a.n();
          j = this.a.v() + j;
          while (true) {
            paramList.M(this.a.n());
            if (this.a.v() >= j) {
              U(j);
              return;
            } 
          } 
        } 
        throw zzelo.zzbjf();
      } 
      while (true) {
        paramList.M(this.a.n());
        if (this.a.u())
          return; 
        j = this.a.e();
        if (j != this.b) {
          this.d = j;
          return;
        } 
      } 
    } 
    int i = this.b & 0x7;
    if (i != 0) {
      if (i == 2) {
        i = this.a.n();
        i = this.a.v() + i;
        while (true) {
          paramList.add(Integer.valueOf(this.a.n()));
          if (this.a.v() >= i) {
            U(i);
            return;
          } 
        } 
      } 
      throw zzelo.zzbjf();
    } 
    while (true) {
      paramList.add(Integer.valueOf(this.a.n()));
      if (this.a.u())
        return; 
      i = this.a.e();
      if (i != this.b) {
        this.d = i;
        return;
      } 
    } 
  }
  
  public final void l(List<Integer> paramList) {
    if (paramList instanceof n42) {
      paramList = paramList;
      int j = this.b & 0x7;
      if (j != 0) {
        if (j == 2) {
          j = this.a.n();
          j = this.a.v() + j;
          while (true) {
            paramList.M(this.a.r());
            if (this.a.v() >= j) {
              U(j);
              return;
            } 
          } 
        } 
        throw zzelo.zzbjf();
      } 
      while (true) {
        paramList.M(this.a.r());
        if (this.a.u())
          return; 
        j = this.a.e();
        if (j != this.b) {
          this.d = j;
          return;
        } 
      } 
    } 
    int i = this.b & 0x7;
    if (i != 0) {
      if (i == 2) {
        i = this.a.n();
        i = this.a.v() + i;
        while (true) {
          paramList.add(Integer.valueOf(this.a.r()));
          if (this.a.v() >= i) {
            U(i);
            return;
          } 
        } 
      } 
      throw zzelo.zzbjf();
    } 
    while (true) {
      paramList.add(Integer.valueOf(this.a.r()));
      if (this.a.u())
        return; 
      i = this.a.e();
      if (i != this.b) {
        this.d = i;
        return;
      } 
    } 
  }
  
  public final boolean m() {
    if (!this.a.u()) {
      int i = this.b;
      if (i != this.c)
        return this.a.y(i); 
    } 
    return false;
  }
  
  public final zzejr n() {
    R(2);
    return this.a.m();
  }
  
  public final <K, V> void o(Map<K, V> paramMap, m52<K, V> paramm52, y32 paramy32) {
    R(2);
    int i = this.a.n();
    this.a.z(i);
    throw null;
  }
  
  public final long p() {
    R(1);
    return this.a.i();
  }
  
  public final void q(List<Long> paramList) {
    if (paramList instanceof j52) {
      paramList = paramList;
      int j = this.b & 0x7;
      if (j != 1) {
        if (j == 2) {
          j = this.a.n();
          S(j);
          int k = this.a.v();
          do {
            paramList.i(this.a.i());
          } while (this.a.v() < k + j);
          return;
        } 
        throw zzelo.zzbjf();
      } 
      while (true) {
        paramList.i(this.a.i());
        if (this.a.u())
          return; 
        j = this.a.e();
        if (j != this.b) {
          this.d = j;
          return;
        } 
      } 
    } 
    int i = this.b & 0x7;
    if (i != 1) {
      if (i == 2) {
        i = this.a.n();
        S(i);
        int j = this.a.v();
        do {
          paramList.add(Long.valueOf(this.a.i()));
        } while (this.a.v() < j + i);
        return;
      } 
      throw zzelo.zzbjf();
    } 
    while (true) {
      paramList.add(Long.valueOf(this.a.i()));
      if (this.a.u())
        return; 
      i = this.a.e();
      if (i != this.b) {
        this.d = i;
        return;
      } 
    } 
  }
  
  public final int r() {
    int i = this.d;
    if (i != 0) {
      this.b = i;
      this.d = 0;
    } else {
      this.b = this.a.e();
    } 
    i = this.b;
    return (i == 0 || i == this.c) ? Integer.MAX_VALUE : (i >>> 3);
  }
  
  public final double readDouble() {
    R(1);
    return this.a.a();
  }
  
  public final float readFloat() {
    R(5);
    return this.a.b();
  }
  
  public final <T> T s(o62<T> paramo62, y32 paramy32) {
    R(2);
    return P(paramo62, paramy32);
  }
  
  public final int t() {
    R(0);
    return this.a.n();
  }
  
  public final void u(List<Long> paramList) {
    if (paramList instanceof j52) {
      paramList = paramList;
      int j = this.b & 0x7;
      if (j != 1) {
        if (j == 2) {
          int k = this.a.n();
          S(k);
          j = this.a.v();
          do {
            paramList.i(this.a.q());
          } while (this.a.v() < j + k);
          return;
        } 
        throw zzelo.zzbjf();
      } 
      while (true) {
        paramList.i(this.a.q());
        if (this.a.u())
          return; 
        j = this.a.e();
        if (j != this.b) {
          this.d = j;
          return;
        } 
      } 
    } 
    int i = this.b & 0x7;
    if (i != 1) {
      if (i == 2) {
        int j = this.a.n();
        S(j);
        i = this.a.v();
        do {
          paramList.add(Long.valueOf(this.a.q()));
        } while (this.a.v() < i + j);
        return;
      } 
      throw zzelo.zzbjf();
    } 
    while (true) {
      paramList.add(Long.valueOf(this.a.q()));
      if (this.a.u())
        return; 
      i = this.a.e();
      if (i != this.b) {
        this.d = i;
        return;
      } 
    } 
  }
  
  public final int v() {
    R(5);
    return this.a.j();
  }
  
  public final void w(List<Integer> paramList) {
    if (paramList instanceof n42) {
      paramList = paramList;
      int j = this.b & 0x7;
      if (j != 0) {
        if (j == 2) {
          j = this.a.n();
          j = this.a.v() + j;
          while (true) {
            paramList.M(this.a.h());
            if (this.a.v() >= j) {
              U(j);
              return;
            } 
          } 
        } 
        throw zzelo.zzbjf();
      } 
      while (true) {
        paramList.M(this.a.h());
        if (this.a.u())
          return; 
        j = this.a.e();
        if (j != this.b) {
          this.d = j;
          return;
        } 
      } 
    } 
    int i = this.b & 0x7;
    if (i != 0) {
      if (i == 2) {
        i = this.a.n();
        i = this.a.v() + i;
        while (true) {
          paramList.add(Integer.valueOf(this.a.h()));
          if (this.a.v() >= i) {
            U(i);
            return;
          } 
        } 
      } 
      throw zzelo.zzbjf();
    } 
    while (true) {
      paramList.add(Integer.valueOf(this.a.h()));
      if (this.a.u())
        return; 
      i = this.a.e();
      if (i != this.b) {
        this.d = i;
        return;
      } 
    } 
  }
  
  public final int x() {
    R(0);
    return this.a.o();
  }
  
  public final void y(List<Boolean> paramList) {
    if (paramList instanceof e32) {
      paramList = paramList;
      int j = this.b & 0x7;
      if (j != 0) {
        if (j == 2) {
          j = this.a.n();
          j = this.a.v() + j;
          while (true) {
            paramList.c(this.a.k());
            if (this.a.v() >= j) {
              U(j);
              return;
            } 
          } 
        } 
        throw zzelo.zzbjf();
      } 
      while (true) {
        paramList.c(this.a.k());
        if (this.a.u())
          return; 
        j = this.a.e();
        if (j != this.b) {
          this.d = j;
          return;
        } 
      } 
    } 
    int i = this.b & 0x7;
    if (i != 0) {
      if (i == 2) {
        i = this.a.n();
        i = this.a.v() + i;
        while (true) {
          paramList.add(Boolean.valueOf(this.a.k()));
          if (this.a.v() >= i) {
            U(i);
            return;
          } 
        } 
      } 
      throw zzelo.zzbjf();
    } 
    while (true) {
      paramList.add(Boolean.valueOf(this.a.k()));
      if (this.a.u())
        return; 
      i = this.a.e();
      if (i != this.b) {
        this.d = i;
        return;
      } 
    } 
  }
  
  public final boolean z() {
    R(0);
    return this.a.k();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/u32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */