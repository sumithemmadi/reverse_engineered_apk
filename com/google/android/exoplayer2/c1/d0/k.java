package com.google.android.exoplayer2.c1.d0;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.g;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import java.util.Arrays;
import java.util.Collections;

public final class k implements o {
  private static final byte[] a = new byte[] { 73, 68, 51 };
  
  private final boolean b;
  
  private final u c = new u(new byte[7]);
  
  private final v d = new v(Arrays.copyOf(a, 10));
  
  private final String e;
  
  private String f;
  
  private v g;
  
  private v h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private boolean l;
  
  private boolean m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private boolean q;
  
  private long r;
  
  private int s;
  
  private long t;
  
  private v u;
  
  private long v;
  
  public k(boolean paramBoolean) {
    this(paramBoolean, null);
  }
  
  public k(boolean paramBoolean, String paramString) {
    r();
    this.n = -1;
    this.o = -1;
    this.r = -9223372036854775807L;
    this.b = paramBoolean;
    this.e = paramString;
  }
  
  private void a(v paramv) {
    if (paramv.a() == 0)
      return; 
    this.c.a[0] = (byte)paramv.a[paramv.c()];
    this.c.o(2);
    int i = this.c.h(4);
    int j = this.o;
    if (j != -1 && i != j) {
      p();
      return;
    } 
    if (!this.m) {
      this.m = true;
      this.n = this.p;
      this.o = i;
    } 
    s();
  }
  
  private boolean g(v paramv, int paramInt) {
    paramv.M(paramInt + 1);
    byte[] arrayOfByte = this.c.a;
    boolean bool = true;
    if (!v(paramv, arrayOfByte, 1))
      return false; 
    this.c.o(4);
    int i = this.c.h(1);
    int j = this.n;
    if (j != -1 && i != j)
      return false; 
    if (this.o != -1) {
      if (!v(paramv, this.c.a, 1))
        return true; 
      this.c.o(2);
      if (this.c.h(4) != this.o)
        return false; 
      paramv.M(paramInt + 2);
    } 
    if (!v(paramv, this.c.a, 4))
      return true; 
    this.c.o(14);
    j = this.c.h(13);
    if (j <= 6)
      return false; 
    paramInt += j;
    j = paramInt + 1;
    if (j >= paramv.d())
      return true; 
    arrayOfByte = paramv.a;
    if (k(arrayOfByte[paramInt], arrayOfByte[j])) {
      boolean bool1 = bool;
      if (this.n != -1) {
        if ((paramv.a[j] & 0x8) >> 3 == i)
          return bool; 
      } else {
        return bool1;
      } 
    } 
    return false;
  }
  
  private boolean h(v paramv, byte[] paramArrayOfbyte, int paramInt) {
    boolean bool;
    int i = Math.min(paramv.a(), paramInt - this.j);
    paramv.h(paramArrayOfbyte, this.j, i);
    i = this.j + i;
    this.j = i;
    if (i == paramInt) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void i(v paramv) {
    byte[] arrayOfByte = paramv.a;
    int i = paramv.c();
    int j = paramv.d();
    while (i < j) {
      int m = i + 1;
      i = arrayOfByte[i] & 0xFF;
      if (this.k == 512 && k((byte)-1, (byte)i) && (this.m || g(paramv, m - 2))) {
        this.p = (i & 0x8) >> 3;
        boolean bool = true;
        if ((i & 0x1) != 0)
          bool = false; 
        this.l = bool;
        if (!this.m) {
          q();
        } else {
          s();
        } 
        paramv.M(m);
        return;
      } 
      int n = this.k;
      i |= n;
      if (i != 329) {
        if (i != 511) {
          if (i != 836) {
            if (i != 1075) {
              i = m;
              if (n != 256) {
                this.k = 256;
                i = m - 1;
              } 
              continue;
            } 
            t();
            paramv.M(m);
            return;
          } 
          this.k = 1024;
          i = m;
          continue;
        } 
        this.k = 512;
        i = m;
        continue;
      } 
      this.k = 768;
      i = m;
    } 
    paramv.M(i);
  }
  
  private boolean k(byte paramByte1, byte paramByte2) {
    return l((paramByte1 & 0xFF) << 8 | paramByte2 & 0xFF);
  }
  
  public static boolean l(int paramInt) {
    boolean bool;
    if ((paramInt & 0xFFF6) == 65520) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void m() {
    this.c.o(0);
    if (!this.q) {
      int m = this.c.h(2) + 1;
      int n = m;
      if (m != 2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Detected audio object type: ");
        stringBuilder.append(m);
        stringBuilder.append(", but assuming AAC LC.");
        o.f("AdtsReader", stringBuilder.toString());
        n = 2;
      } 
      this.c.q(5);
      m = this.c.h(3);
      byte[] arrayOfByte = g.a(n, this.o, m);
      Pair pair = g.g(arrayOfByte);
      Format format = Format.p(this.f, "audio/mp4a-latm", null, -1, -1, ((Integer)pair.second).intValue(), ((Integer)pair.first).intValue(), Collections.singletonList(arrayOfByte), null, 0, this.e);
      this.r = 1024000000L / format.x;
      this.g.d(format);
      this.q = true;
    } else {
      this.c.q(10);
    } 
    this.c.q(4);
    int i = this.c.h(13) - 2 - 5;
    int j = i;
    if (this.l)
      j = i - 2; 
    u(this.g, this.r, 0, j);
  }
  
  private void n() {
    this.h.b(this.d, 10);
    this.d.M(6);
    u(this.h, 0L, 10, this.d.y() + 10);
  }
  
  private void o(v paramv) {
    int i = Math.min(paramv.a(), this.s - this.j);
    this.u.b(paramv, i);
    i = this.j + i;
    this.j = i;
    int j = this.s;
    if (i == j) {
      this.u.c(this.t, 1, j, 0, null);
      this.t += this.v;
      r();
    } 
  }
  
  private void p() {
    this.m = false;
    r();
  }
  
  private void q() {
    this.i = 1;
    this.j = 0;
  }
  
  private void r() {
    this.i = 0;
    this.j = 0;
    this.k = 256;
  }
  
  private void s() {
    this.i = 3;
    this.j = 0;
  }
  
  private void t() {
    this.i = 2;
    this.j = a.length;
    this.s = 0;
    this.d.M(0);
  }
  
  private void u(v paramv, long paramLong, int paramInt1, int paramInt2) {
    this.i = 4;
    this.j = paramInt1;
    this.u = paramv;
    this.v = paramLong;
    this.s = paramInt2;
  }
  
  private boolean v(v paramv, byte[] paramArrayOfbyte, int paramInt) {
    if (paramv.a() < paramInt)
      return false; 
    paramv.h(paramArrayOfbyte, 0, paramInt);
    return true;
  }
  
  public void b(v paramv) {
    while (paramv.a() > 0) {
      int i = this.i;
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            if (i != 3) {
              if (i == 4) {
                o(paramv);
                continue;
              } 
              throw new IllegalStateException();
            } 
            if (this.l) {
              i = 7;
            } else {
              i = 5;
            } 
            if (h(paramv, this.c.a, i))
              m(); 
            continue;
          } 
          if (h(paramv, this.d.a, 10))
            n(); 
          continue;
        } 
        a(paramv);
        continue;
      } 
      i(paramv);
    } 
  }
  
  public void c() {
    p();
  }
  
  public void d() {}
  
  public void e(j paramj, h0.d paramd) {
    paramd.a();
    this.f = paramd.b();
    this.g = paramj.g(paramd.c(), 1);
    if (this.b) {
      paramd.a();
      v v1 = paramj.g(paramd.c(), 4);
      this.h = v1;
      v1.d(Format.u(paramd.b(), "application/id3", null, -1, null));
    } else {
      this.h = (v)new g();
    } 
  }
  
  public void f(long paramLong, int paramInt) {
    this.t = paramLong;
  }
  
  public long j() {
    return this.r;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */