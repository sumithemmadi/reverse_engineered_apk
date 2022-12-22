package com.google.android.exoplayer2.c1.c0;

import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.c1.u;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import java.io.EOFException;
import java.io.IOException;

final class b implements g {
  private final f a;
  
  private final long b;
  
  private final long c;
  
  private final i d;
  
  private int e;
  
  private long f;
  
  private long g;
  
  private long h;
  
  private long i;
  
  private long j;
  
  private long k;
  
  private long l;
  
  public b(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean) {
    boolean bool;
    this.a = new f();
    if (paramLong1 >= 0L && paramLong2 > paramLong1) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    this.d = parami;
    this.b = paramLong1;
    this.c = paramLong2;
    if (paramLong3 == paramLong2 - paramLong1 || paramBoolean) {
      this.f = paramLong4;
      this.e = 4;
      return;
    } 
    this.e = 0;
  }
  
  private long i(i parami) {
    if (this.i == this.j)
      return -1L; 
    long l1 = parami.a();
    if (!l(parami, this.j)) {
      long l = this.i;
      if (l != l1)
        return l; 
      throw new IOException("No ogg page can be found.");
    } 
    this.a.a(parami, false);
    parami.h();
    long l2 = this.h;
    f f1 = this.a;
    long l3 = f1.c;
    l2 -= l3;
    int j = f1.h + f1.i;
    if (0L <= l2 && l2 < 72000L)
      return -1L; 
    if (l2 < 0L) {
      this.j = l1;
      this.l = l3;
    } else {
      this.i = parami.a() + j;
      this.k = this.a.c;
    } 
    l1 = this.j;
    l3 = this.i;
    if (l1 - l3 < 100000L) {
      this.j = l3;
      return l3;
    } 
    l3 = j;
    if (l2 <= 0L) {
      l1 = 2L;
    } else {
      l1 = 1L;
    } 
    long l4 = parami.a();
    long l5 = this.j;
    long l6 = this.i;
    return h0.o(l4 - l3 * l1 + l2 * (l5 - l6) / (this.l - this.k), l6, l5 - 1L);
  }
  
  private boolean l(i parami, long paramLong) {
    long l = Math.min(paramLong + 3L, this.c);
    int j = 2048;
    byte[] arrayOfByte = new byte[2048];
    while (true) {
      paramLong = parami.a();
      long l1 = j;
      byte b1 = 0;
      if (paramLong + l1 > l) {
        int k = (int)(l - parami.a());
        j = k;
        if (k < 4)
          return false; 
      } 
      parami.c(arrayOfByte, 0, j, false);
      while (true) {
        int k = j - 3;
        if (b1 < k) {
          if (arrayOfByte[b1] == 79 && arrayOfByte[b1 + 1] == 103 && arrayOfByte[b1 + 2] == 103 && arrayOfByte[b1 + 3] == 83) {
            parami.i(b1);
            return true;
          } 
          b1++;
          continue;
        } 
        parami.i(k);
      } 
      break;
    } 
  }
  
  private void m(i parami) {
    this.a.a(parami, false);
    while (true) {
      f f1 = this.a;
      if (f1.c <= this.h) {
        parami.i(f1.h + f1.i);
        this.i = parami.a();
        f1 = this.a;
        this.k = f1.c;
        f1.a(parami, false);
        continue;
      } 
      parami.h();
      return;
    } 
  }
  
  public long b(i parami) {
    int j = this.e;
    if (j != 0) {
      if (j != 1) {
        if (j != 2) {
          if (j != 3) {
            if (j == 4)
              return -1L; 
            throw new IllegalStateException();
          } 
        } else {
          long l = i(parami);
          if (l != -1L)
            return l; 
          this.e = 3;
        } 
        m(parami);
        this.e = 4;
        return -(this.k + 2L);
      } 
    } else {
      long l1 = parami.a();
      this.g = l1;
      this.e = 1;
      long l2 = this.c - 65307L;
      if (l2 > l1)
        return l2; 
    } 
    this.f = j(parami);
    this.e = 4;
    return this.g;
  }
  
  public void c(long paramLong) {
    this.h = h0.o(paramLong, 0L, this.f - 1L);
    this.e = 2;
    this.i = this.b;
    this.j = this.c;
    this.k = 0L;
    this.l = this.f;
  }
  
  public b h() {
    long l = this.f;
    b b1 = null;
    if (l != 0L)
      b1 = new b(null); 
    return b1;
  }
  
  long j(i parami) {
    k(parami);
    this.a.b();
    while ((this.a.b & 0x4) != 4 && parami.a() < this.c) {
      this.a.a(parami, false);
      f f1 = this.a;
      parami.i(f1.h + f1.i);
    } 
    return this.a.c;
  }
  
  void k(i parami) {
    if (l(parami, this.c))
      return; 
    throw new EOFException();
  }
  
  private final class b implements t {
    private b(b this$0) {}
    
    public boolean b() {
      return true;
    }
    
    public long c() {
      return b.d(this.a).a(b.g(this.a));
    }
    
    public t.a j(long param1Long) {
      long l = b.d(this.a).b(param1Long);
      return new t.a(new u(param1Long, h0.o(b.e(this.a) + l * (b.f(this.a) - b.e(this.a)) / b.g(this.a) - 30000L, b.e(this.a), b.f(this.a) - 1L)));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/c0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */