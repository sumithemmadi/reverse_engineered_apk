package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.h;
import com.google.android.exoplayer2.c1.c;
import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.l;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.s;
import com.google.android.exoplayer2.util.v;
import com.google.android.exoplayer2.v;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class g implements h {
  public static final l a = a.a;
  
  private static final byte[] b = new byte[] { 
      -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 
      108, 66, 124, 100, -115, -12 };
  
  private static final Format c = Format.t(null, "application/x-emsg", Long.MAX_VALUE);
  
  private long A;
  
  private long B;
  
  private b C;
  
  private int D;
  
  private int E;
  
  private int F;
  
  private boolean G;
  
  private j H;
  
  private v[] I;
  
  private v[] J;
  
  private boolean K;
  
  private final int d;
  
  private final l e;
  
  private final List<Format> f;
  
  private final SparseArray<b> g;
  
  private final v h;
  
  private final v i;
  
  private final v j;
  
  private final byte[] k;
  
  private final v l;
  
  private final e0 m;
  
  private final com.google.android.exoplayer2.metadata.emsg.b n;
  
  private final v o;
  
  private final ArrayDeque<c.a> p;
  
  private final ArrayDeque<a> q;
  
  private final v r;
  
  private int s;
  
  private int t;
  
  private long u;
  
  private int v;
  
  private v w;
  
  private long x;
  
  private int y;
  
  private long z;
  
  public g() {
    this(0);
  }
  
  public g(int paramInt) {
    this(paramInt, null);
  }
  
  public g(int paramInt, e0 parame0) {
    this(paramInt, parame0, null, Collections.emptyList());
  }
  
  public g(int paramInt, e0 parame0, l paraml, List<Format> paramList) {
    this(paramInt, parame0, paraml, paramList, null);
  }
  
  public g(int paramInt, e0 parame0, l paraml, List<Format> paramList, v paramv) {
    byte b1;
    if (paraml != null) {
      b1 = 8;
    } else {
      b1 = 0;
    } 
    this.d = paramInt | b1;
    this.m = parame0;
    this.e = paraml;
    this.f = Collections.unmodifiableList(paramList);
    this.r = paramv;
    this.n = new com.google.android.exoplayer2.metadata.emsg.b();
    this.o = new v(16);
    this.h = new v(s.a);
    this.i = new v(5);
    this.j = new v();
    byte[] arrayOfByte = new byte[16];
    this.k = arrayOfByte;
    this.l = new v(arrayOfByte);
    this.p = new ArrayDeque<c.a>();
    this.q = new ArrayDeque<a>();
    this.g = new SparseArray();
    this.A = -9223372036854775807L;
    this.z = -9223372036854775807L;
    this.B = -9223372036854775807L;
    b();
  }
  
  private static Pair<Long, c> A(v paramv, long paramLong) {
    long l2;
    paramv.M(8);
    int i = c.c(paramv.k());
    paramv.N(4);
    long l1 = paramv.B();
    if (i == 0) {
      l2 = paramv.B();
      l3 = paramv.B();
    } else {
      l2 = paramv.E();
      l3 = paramv.E();
    } 
    paramLong += l3;
    long l4 = h0.l0(l2, 1000000L, l1);
    paramv.N(2);
    int k = paramv.F();
    int[] arrayOfInt = new int[k];
    long[] arrayOfLong1 = new long[k];
    long[] arrayOfLong2 = new long[k];
    long[] arrayOfLong3 = new long[k];
    long l3 = l4;
    i = 0;
    while (i < k) {
      int m = paramv.k();
      if ((m & Integer.MIN_VALUE) == 0) {
        long l5 = paramv.B();
        arrayOfInt[i] = m & Integer.MAX_VALUE;
        arrayOfLong1[i] = paramLong;
        arrayOfLong3[i] = l3;
        l2 += l5;
        l3 = h0.l0(l2, 1000000L, l1);
        arrayOfLong2[i] = l3 - arrayOfLong3[i];
        paramv.N(4);
        paramLong += arrayOfInt[i];
        i++;
        continue;
      } 
      throw new ParserException("Unhandled indirect reference");
    } 
    return Pair.create(Long.valueOf(l4), new c(arrayOfInt, arrayOfLong1, arrayOfLong2, arrayOfLong3));
  }
  
  private static long B(v paramv) {
    long l1;
    paramv.M(8);
    if (c.c(paramv.k()) == 1) {
      l1 = paramv.E();
    } else {
      l1 = paramv.B();
    } 
    return l1;
  }
  
  private static b C(v paramv, SparseArray<b> paramSparseArray) {
    int k;
    int m;
    int n;
    paramv.M(8);
    int i = c.b(paramv.k());
    b b1 = j(paramSparseArray, paramv.k());
    if (b1 == null)
      return null; 
    if ((i & 0x1) != 0) {
      long l1 = paramv.E();
      n n1 = b1.b;
      n1.c = l1;
      n1.d = l1;
    } 
    e e = b1.e;
    if ((i & 0x2) != 0) {
      k = paramv.D() - 1;
    } else {
      k = e.a;
    } 
    if ((i & 0x8) != 0) {
      m = paramv.D();
    } else {
      m = e.b;
    } 
    if ((i & 0x10) != 0) {
      n = paramv.D();
    } else {
      n = e.c;
    } 
    if ((i & 0x20) != 0) {
      i = paramv.D();
    } else {
      i = e.d;
    } 
    b1.b.a = new e(k, m, n, i);
    return b1;
  }
  
  private static void D(c.a parama, SparseArray<b> paramSparseArray, int paramInt, byte[] paramArrayOfbyte) {
    b b1 = C((parama.g(1952868452)).b, paramSparseArray);
    if (b1 == null)
      return; 
    n n = b1.b;
    long l1 = n.s;
    b1.g();
    long l2 = l1;
    if (parama.g(1952867444) != null) {
      l2 = l1;
      if ((paramInt & 0x2) == 0)
        l2 = B((parama.g(1952867444)).b); 
    } 
    G(parama, b1, l2, paramInt);
    m m = b1.d.a(n.a.a);
    c.b b2 = parama.g(1935763834);
    if (b2 != null)
      w(m, b2.b, n); 
    b2 = parama.g(1935763823);
    if (b2 != null)
      v(b2.b, n); 
    b2 = parama.g(1936027235);
    if (b2 != null)
      y(b2.b, n); 
    b2 = parama.g(1935828848);
    c.b b3 = parama.g(1936158820);
    if (b2 != null && b3 != null) {
      v v1 = b2.b;
      v v2 = b3.b;
      if (m != null) {
        String str = m.b;
      } else {
        m = null;
      } 
      z(v1, v2, (String)m, n);
    } 
    int i = parama.c.size();
    for (paramInt = 0; paramInt < i; paramInt++) {
      c.b b4 = parama.c.get(paramInt);
      if (b4.a == 1970628964)
        H(b4.b, n, paramArrayOfbyte); 
    } 
  }
  
  private static Pair<Integer, e> E(v paramv) {
    paramv.M(12);
    return Pair.create(Integer.valueOf(paramv.k()), new e(paramv.D() - 1, paramv.D(), paramv.D(), paramv.k()));
  }
  
  private static int F(b paramb, int paramInt1, long paramLong, int paramInt2, v paramv, int paramInt3) {
    boolean bool1;
    boolean bool2;
    boolean bool3;
    boolean bool4;
    paramv.M(8);
    int i = c.b(paramv.k());
    l l1 = paramb.d;
    n n = paramb.b;
    e e = n.a;
    n.h[paramInt1] = paramv.D();
    long[] arrayOfLong1 = n.g;
    arrayOfLong1[paramInt1] = n.c;
    if ((i & 0x1) != 0)
      arrayOfLong1[paramInt1] = arrayOfLong1[paramInt1] + paramv.k(); 
    if ((i & 0x4) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    int k = e.d;
    if (bool1)
      k = paramv.D(); 
    if ((i & 0x100) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if ((i & 0x200) != 0) {
      bool3 = true;
    } else {
      bool3 = false;
    } 
    if ((i & 0x400) != 0) {
      bool4 = true;
    } else {
      bool4 = false;
    } 
    if ((i & 0x800) != 0) {
      i = 1;
    } else {
      i = 0;
    } 
    arrayOfLong1 = l1.h;
    long l2 = 0L;
    long l3 = l2;
    if (arrayOfLong1 != null) {
      l3 = l2;
      if (arrayOfLong1.length == 1) {
        l3 = l2;
        if (arrayOfLong1[0] == 0L)
          l3 = h0.l0(l1.i[0], 1000L, l1.c); 
      } 
    } 
    int[] arrayOfInt2 = n.i;
    int[] arrayOfInt1 = n.j;
    long[] arrayOfLong2 = n.k;
    boolean[] arrayOfBoolean = n.l;
    if (l1.b == 2 && (paramInt2 & 0x1) != 0) {
      paramInt2 = 1;
    } else {
      paramInt2 = 0;
    } 
    int m = paramInt3 + n.h[paramInt1];
    long l4 = l1.c;
    if (paramInt1 > 0)
      paramLong = n.s; 
    l2 = paramLong;
    paramLong = l4;
    while (paramInt3 < m) {
      int i1;
      int i2;
      boolean bool;
      if (bool2) {
        i1 = paramv.D();
      } else {
        i1 = e.b;
      } 
      if (bool3) {
        i2 = paramv.D();
      } else {
        i2 = e.c;
      } 
      if (paramInt3 == 0 && bool1) {
        paramInt1 = k;
      } else if (bool4) {
        paramInt1 = paramv.k();
      } else {
        paramInt1 = e.d;
      } 
      if (i != 0) {
        arrayOfInt1[paramInt3] = (int)(paramv.k() * 1000L / paramLong);
      } else {
        arrayOfInt1[paramInt3] = 0;
      } 
      arrayOfLong2[paramInt3] = h0.l0(l2, 1000L, paramLong) - l3;
      arrayOfInt2[paramInt3] = i2;
      if ((paramInt1 >> 16 & 0x1) == 0 && (paramInt2 == 0 || paramInt3 == 0)) {
        bool = true;
      } else {
        bool = false;
      } 
      arrayOfBoolean[paramInt3] = bool;
      l4 = i1;
      paramInt3++;
      l2 += l4;
    } 
    n.s = l2;
    return m;
  }
  
  private static void G(c.a parama, b paramb, long paramLong, int paramInt) {
    List<c.b> list = parama.c;
    int i = list.size();
    int k = 0;
    int m = 0;
    int n;
    for (n = 0; k < i; n = i2) {
      c.b b1 = list.get(k);
      int i1 = m;
      int i2 = n;
      if (b1.a == 1953658222) {
        v v1 = b1.b;
        v1.M(12);
        int i3 = v1.D();
        i1 = m;
        i2 = n;
        if (i3 > 0) {
          i2 = n + i3;
          i1 = m + 1;
        } 
      } 
      k++;
      m = i1;
    } 
    paramb.h = 0;
    paramb.g = 0;
    paramb.f = 0;
    paramb.b.e(m, n);
    m = 0;
    k = 0;
    n = 0;
    while (n < i) {
      c.b b1 = list.get(n);
      int i1 = m;
      int i2 = k;
      if (b1.a == 1953658222) {
        i2 = F(paramb, m, paramLong, paramInt, b1.b, k);
        i1 = m + 1;
      } 
      n++;
      m = i1;
      k = i2;
    } 
  }
  
  private static void H(v paramv, n paramn, byte[] paramArrayOfbyte) {
    paramv.M(8);
    paramv.h(paramArrayOfbyte, 0, 16);
    if (!Arrays.equals(paramArrayOfbyte, b))
      return; 
    x(paramv, 16, paramn);
  }
  
  private void I(long paramLong) {
    while (!this.p.isEmpty() && ((c.a)this.p.peek()).b == paramLong)
      n(this.p.pop()); 
    b();
  }
  
  private boolean J(i parami) {
    if (this.v == 0) {
      if (!parami.b(this.o.a, 0, 8, true))
        return false; 
      this.v = 8;
      this.o.M(0);
      this.u = this.o.B();
      this.t = this.o.k();
    } 
    long l1 = this.u;
    if (l1 == 1L) {
      parami.readFully(this.o.a, 8, 8);
      this.v += 8;
      this.u = this.o.E();
    } else if (l1 == 0L) {
      long l2 = parami.getLength();
      l1 = l2;
      if (l2 == -1L) {
        l1 = l2;
        if (!this.p.isEmpty())
          l1 = ((c.a)this.p.peek()).b; 
      } 
      if (l1 != -1L)
        this.u = l1 - parami.a() + this.v; 
    } 
    if (this.u >= this.v) {
      l1 = parami.a() - this.v;
      if (this.t == 1836019558) {
        int m = this.g.size();
        for (byte b1 = 0; b1 < m; b1++) {
          n n = ((b)this.g.valueAt(b1)).b;
          n.b = l1;
          n.d = l1;
          n.c = l1;
        } 
      } 
      int k = this.t;
      if (k == 1835295092) {
        this.C = null;
        this.x = this.u + l1;
        if (!this.K) {
          this.H.a((t)new t.b(this.A, l1));
          this.K = true;
        } 
        this.s = 2;
        return true;
      } 
      if (N(k)) {
        l1 = parami.a() + this.u - 8L;
        this.p.push(new c.a(this.t, l1));
        if (this.u == this.v) {
          I(l1);
        } else {
          b();
        } 
      } else if (O(this.t)) {
        if (this.v == 8) {
          l1 = this.u;
          if (l1 <= 2147483647L) {
            v v1 = new v((int)l1);
            this.w = v1;
            System.arraycopy(this.o.a, 0, v1.a, 0, 8);
            this.s = 1;
          } else {
            throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
          } 
        } else {
          throw new ParserException("Leaf atom defines extended atom size (unsupported).");
        } 
      } else {
        if (this.u <= 2147483647L) {
          this.w = null;
          this.s = 1;
          return true;
        } 
        throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
      } 
      return true;
    } 
    ParserException parserException = new ParserException("Atom size less than header length (unsupported).");
    throw parserException;
  }
  
  private void K(i parami) {
    int k = (int)this.u - this.v;
    v v1 = this.w;
    if (v1 != null) {
      parami.readFully(v1.a, 8, k);
      p(new c.b(this.t, this.w), parami.a());
    } else {
      parami.i(k);
    } 
    I(parami.a());
  }
  
  private void L(i parami) {
    int k = this.g.size();
    b b1 = null;
    long l1 = Long.MAX_VALUE;
    int m = 0;
    while (m < k) {
      n n = ((b)this.g.valueAt(m)).b;
      b b2 = b1;
      long l2 = l1;
      if (n.r) {
        long l3 = n.d;
        b2 = b1;
        l2 = l1;
        if (l3 < l1) {
          b2 = (b)this.g.valueAt(m);
          l2 = l3;
        } 
      } 
      m++;
      b1 = b2;
      l1 = l2;
    } 
    if (b1 == null) {
      this.s = 3;
      return;
    } 
    m = (int)(l1 - parami.a());
    if (m >= 0) {
      parami.i(m);
      b1.b.a(parami);
      return;
    } 
    ParserException parserException = new ParserException("Offset to encryption data was negative.");
    throw parserException;
  }
  
  private boolean M(i parami) {
    int k;
    if (this.s == 3) {
      if (this.C == null) {
        b b3 = f(this.g);
        if (b3 == null) {
          int i5 = (int)(this.x - parami.a());
          if (i5 >= 0) {
            parami.i(i5);
            b();
            return false;
          } 
          throw new ParserException("Offset to end of mdat was negative.");
        } 
        int i4 = (int)(b3.b.g[b3.h] - parami.a());
        int i3 = i4;
        if (i4 < 0) {
          o.f("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
          i3 = 0;
        } 
        parami.i(i3);
        this.C = b3;
      } 
      b b2 = this.C;
      int[] arrayOfInt = b2.b.i;
      k = b2.f;
      int i2 = arrayOfInt[k];
      this.D = i2;
      if (k < b2.i) {
        parami.i(i2);
        b.a(this.C);
        if (!this.C.e())
          this.C = null; 
        this.s = 3;
        return true;
      } 
      if (b2.d.g == 1) {
        this.D = i2 - 8;
        parami.i(8);
      } 
      if ("audio/ac4".equals(this.C.d.f.j)) {
        this.E = this.C.f(this.D, 7);
        h.a(this.D, this.l);
        this.C.a.b(this.l, 7);
        this.E += 7;
      } else {
        this.E = this.C.f(this.D, 0);
      } 
      this.D += this.E;
      this.s = 4;
      this.F = 0;
    } 
    b b1 = this.C;
    n n1 = b1.b;
    l l1 = b1.d;
    v v1 = b1.a;
    int n = b1.f;
    long l2 = n1.c(n) * 1000L;
    e0 e01 = this.m;
    long l3 = l2;
    if (e01 != null)
      l3 = e01.a(l2); 
    int i1 = l1.j;
    if (i1 != 0) {
      byte[] arrayOfByte = this.i.a;
      arrayOfByte[0] = (byte)0;
      arrayOfByte[1] = (byte)0;
      arrayOfByte[2] = (byte)0;
      int i2 = 4 - i1;
      while (this.E < this.D) {
        k = this.F;
        if (k == 0) {
          parami.readFully(arrayOfByte, i2, i1 + 1);
          this.i.M(0);
          k = this.i.k();
          if (k >= 1) {
            boolean bool1;
            this.F = k - 1;
            this.h.M(0);
            v1.b(this.h, 4);
            v1.b(this.i, 1);
            if (this.J.length > 0 && s.g(l1.f.j, arrayOfByte[4])) {
              bool1 = true;
            } else {
              bool1 = false;
            } 
            this.G = bool1;
            this.E += 5;
            this.D += i2;
            continue;
          } 
          throw new ParserException("Invalid NAL length");
        } 
        if (this.G) {
          this.j.I(k);
          parami.readFully(this.j.a, 0, this.F);
          v1.b(this.j, this.F);
          k = this.F;
          v v2 = this.j;
          int i3 = s.k(v2.a, v2.d());
          this.j.M("video/hevc".equals(l1.f.j));
          this.j.L(i3);
          com.google.android.exoplayer2.text.l.g.a(l3, this.j, this.J);
        } else {
          k = v1.a(parami, k, false);
        } 
        this.E += k;
        this.F -= k;
      } 
    } else {
      while (true) {
        k = this.E;
        i1 = this.D;
        if (k < i1) {
          k = v1.a(parami, i1 - k, false);
          this.E += k;
          continue;
        } 
        break;
      } 
    } 
    boolean bool = n1.l[n];
    m m = b.b(this.C);
    if (m != null) {
      v.a a = m.c;
      k = bool | 0x40000000;
    } else {
      m = null;
    } 
    v1.c(l3, k, this.D, 0, (v.a)m);
    s(l3);
    if (!this.C.e())
      this.C = null; 
    this.s = 3;
    return true;
  }
  
  private static boolean N(int paramInt) {
    return (paramInt == 1836019574 || paramInt == 1953653099 || paramInt == 1835297121 || paramInt == 1835626086 || paramInt == 1937007212 || paramInt == 1836019558 || paramInt == 1953653094 || paramInt == 1836475768 || paramInt == 1701082227);
  }
  
  private static boolean O(int paramInt) {
    return (paramInt == 1751411826 || paramInt == 1835296868 || paramInt == 1836476516 || paramInt == 1936286840 || paramInt == 1937011556 || paramInt == 1952867444 || paramInt == 1952868452 || paramInt == 1953196132 || paramInt == 1953654136 || paramInt == 1953658222 || paramInt == 1886614376 || paramInt == 1935763834 || paramInt == 1935763823 || paramInt == 1936027235 || paramInt == 1970628964 || paramInt == 1935828848 || paramInt == 1936158820 || paramInt == 1701606260 || paramInt == 1835362404 || paramInt == 1701671783);
  }
  
  private void b() {
    this.s = 0;
    this.v = 0;
  }
  
  private e c(SparseArray<e> paramSparseArray, int paramInt) {
    return (paramSparseArray.size() == 1) ? (e)paramSparseArray.valueAt(0) : (e)e.e(paramSparseArray.get(paramInt));
  }
  
  private static DrmInitData d(List<c.b> paramList) {
    DrmInitData drmInitData;
    int i = paramList.size();
    List list = null;
    byte b1 = 0;
    ArrayList<DrmInitData.SchemeData> arrayList;
    for (arrayList = null; b1 < i; arrayList = arrayList1) {
      c.b b2 = paramList.get(b1);
      ArrayList<DrmInitData.SchemeData> arrayList1 = arrayList;
      if (b2.a == 1886614376) {
        arrayList1 = arrayList;
        if (arrayList == null)
          arrayList1 = new ArrayList(); 
        byte[] arrayOfByte = b2.b.a;
        UUID uUID = j.d(arrayOfByte);
        if (uUID == null) {
          o.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
        } else {
          arrayList1.add(new DrmInitData.SchemeData(uUID, "video/mp4", arrayOfByte));
        } 
      } 
      b1++;
    } 
    if (arrayList == null) {
      paramList = list;
    } else {
      drmInitData = new DrmInitData(arrayList);
    } 
    return drmInitData;
  }
  
  private static b f(SparseArray<b> paramSparseArray) {
    int i = paramSparseArray.size();
    b b1 = null;
    long l1 = Long.MAX_VALUE;
    byte b2 = 0;
    while (b2 < i) {
      long l2;
      b b3 = (b)paramSparseArray.valueAt(b2);
      int k = b3.h;
      n n = b3.b;
      if (k == n.e) {
        l2 = l1;
      } else {
        long l3 = n.g[k];
        l2 = l1;
        if (l3 < l1) {
          b1 = b3;
          l2 = l3;
        } 
      } 
      b2++;
      l1 = l2;
    } 
    return b1;
  }
  
  private static b j(SparseArray<b> paramSparseArray, int paramInt) {
    return (paramSparseArray.size() == 1) ? (b)paramSparseArray.valueAt(0) : (b)paramSparseArray.get(paramInt);
  }
  
  private void l() {
    v[] arrayOfV = this.I;
    byte b1 = 0;
    if (arrayOfV == null) {
      arrayOfV = new v[2];
      this.I = arrayOfV;
      v v1 = this.r;
      if (v1 != null) {
        arrayOfV[0] = v1;
        b2 = 1;
      } else {
        b2 = 0;
      } 
      int i = b2;
      if ((this.d & 0x4) != 0) {
        arrayOfV[b2] = this.H.g(this.g.size(), 4);
        i = b2 + 1;
      } 
      arrayOfV = Arrays.<v>copyOf(this.I, i);
      this.I = arrayOfV;
      i = arrayOfV.length;
      for (byte b2 = 0; b2 < i; b2++)
        arrayOfV[b2].d(c); 
    } 
    if (this.J == null) {
      this.J = new v[this.f.size()];
      for (byte b2 = b1; b2 < this.J.length; b2++) {
        v v1 = this.H.g(this.g.size() + 1 + b2, 3);
        v1.d(this.f.get(b2));
        this.J[b2] = v1;
      } 
    } 
  }
  
  private void n(c.a parama) {
    int i = parama.a;
    if (i == 1836019574) {
      r(parama);
    } else if (i == 1836019558) {
      q(parama);
    } else if (!this.p.isEmpty()) {
      ((c.a)this.p.peek()).d(parama);
    } 
  }
  
  private void o(v paramv) {
    v[] arrayOfV = this.I;
    if (arrayOfV != null && arrayOfV.length != 0) {
      StringBuilder stringBuilder;
      String str1;
      long l1;
      long l2;
      long l3;
      String str2;
      long l4;
      paramv.M(8);
      null = c.c(paramv.k());
      if (null != 0) {
        if (null != 1) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Skipping unsupported emsg version: ");
          stringBuilder.append(null);
          o.f("FragmentedMp4Extractor", stringBuilder.toString());
          return;
        } 
        l1 = stringBuilder.B();
        l2 = h0.l0(stringBuilder.E(), 1000000L, l1);
        l3 = h0.l0(stringBuilder.B(), 1000L, l1);
        l1 = stringBuilder.B();
        str1 = (String)e.e(stringBuilder.t());
        str2 = (String)e.e(stringBuilder.t());
        l4 = -9223372036854775807L;
      } else {
        str1 = (String)e.e(stringBuilder.t());
        str2 = (String)e.e(stringBuilder.t());
        l1 = stringBuilder.B();
        l4 = h0.l0(stringBuilder.B(), 1000000L, l1);
        l2 = this.B;
        if (l2 != -9223372036854775807L) {
          l2 += l4;
        } else {
          l2 = -9223372036854775807L;
        } 
        l3 = h0.l0(stringBuilder.B(), 1000L, l1);
        l1 = stringBuilder.B();
      } 
      byte[] arrayOfByte = new byte[stringBuilder.a()];
      null = stringBuilder.a();
      byte b1 = 0;
      stringBuilder.h(arrayOfByte, 0, null);
      EventMessage eventMessage = new EventMessage(str1, str2, l3, l1, arrayOfByte);
      v v1 = new v(this.n.a(eventMessage));
      int i = v1.a();
      for (v v2 : this.I) {
        v1.M(0);
        v2.b(v1, i);
      } 
      if (l2 == -9223372036854775807L) {
        this.q.addLast(new a(l4, i));
        this.y += i;
      } else {
        e0 e01 = this.m;
        l1 = l2;
        if (e01 != null)
          l1 = e01.a(l2); 
        v[] arrayOfV1 = this.I;
        int k = arrayOfV1.length;
        for (byte b2 = b1; b2 < k; b2++)
          arrayOfV1[b2].c(l1, 1, i, 0, null); 
      } 
    } 
  }
  
  private void p(c.b paramb, long paramLong) {
    if (!this.p.isEmpty()) {
      ((c.a)this.p.peek()).e(paramb);
    } else {
      Pair<Long, c> pair;
      int i = paramb.a;
      if (i == 1936286840) {
        pair = A(paramb.b, paramLong);
        this.B = ((Long)pair.first).longValue();
        this.H.a((t)pair.second);
        this.K = true;
      } else if (i == 1701671783) {
        o(((c.b)pair).b);
      } 
    } 
  }
  
  private void q(c.a parama) {
    u(parama, this.g, this.d, this.k);
    DrmInitData drmInitData = d(parama.c);
    byte b1 = 0;
    if (drmInitData != null) {
      int i = this.g.size();
      for (byte b2 = 0; b2 < i; b2++)
        ((b)this.g.valueAt(b2)).j(drmInitData); 
    } 
    if (this.z != -9223372036854775807L) {
      int i = this.g.size();
      for (byte b2 = b1; b2 < i; b2++)
        ((b)this.g.valueAt(b2)).h(this.z); 
      this.z = -9223372036854775807L;
    } 
  }
  
  private void r(c.a parama) {
    boolean bool4;
    l l1 = this.e;
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = false;
    if (l1 == null) {
      bool4 = true;
    } else {
      bool4 = false;
    } 
    e.g(bool4, "Unexpected moov box.");
    DrmInitData drmInitData = d(parama.c);
    c.a a1 = parama.f(1836475768);
    SparseArray<e> sparseArray = new SparseArray();
    int i = a1.c.size();
    long l2 = -9223372036854775807L;
    int k;
    for (k = 0; k < i; k++) {
      Pair<Integer, e> pair;
      c.b b1 = a1.c.get(k);
      int m = b1.a;
      if (m == 1953654136) {
        pair = E(b1.b);
        sparseArray.put(((Integer)pair.first).intValue(), pair.second);
      } else if (m == 1835362404) {
        l2 = t(((c.b)pair).b);
      } 
    } 
    SparseArray sparseArray1 = new SparseArray();
    k = parama.d.size();
    for (i = 0; i < k; i++) {
      c.a a2 = parama.d.get(i);
      if (a2.a == 1953653099) {
        c.b b1 = parama.g(1836476516);
        if ((this.d & 0x10) != 0) {
          bool4 = true;
        } else {
          bool4 = false;
        } 
        l l3 = m(d.v(a2, b1, l2, drmInitData, bool4, false));
        if (l3 != null)
          sparseArray1.put(l3.a, l3); 
      } 
    } 
    i = sparseArray1.size();
    if (this.g.size() == 0) {
      for (k = bool3; k < i; k++) {
        l l3 = (l)sparseArray1.valueAt(k);
        b b1 = new b(this.H.g(k, l3.b));
        b1.d(l3, c(sparseArray, l3.a));
        this.g.put(l3.a, b1);
        this.A = Math.max(this.A, l3.e);
      } 
      l();
      this.H.f();
    } else {
      if (this.g.size() == i) {
        bool4 = bool1;
      } else {
        bool4 = false;
      } 
      e.f(bool4);
      for (k = bool2; k < i; k++) {
        l l3 = (l)sparseArray1.valueAt(k);
        ((b)this.g.get(l3.a)).d(l3, c(sparseArray, l3.a));
      } 
    } 
  }
  
  private void s(long paramLong) {
    while (!this.q.isEmpty()) {
      a a = this.q.removeFirst();
      this.y -= a.b;
      long l1 = a.a + paramLong;
      e0 e01 = this.m;
      long l2 = l1;
      if (e01 != null)
        l2 = e01.a(l1); 
      v[] arrayOfV = this.I;
      int i = arrayOfV.length;
      for (byte b1 = 0; b1 < i; b1++)
        arrayOfV[b1].c(l2, 1, a.b, this.y, null); 
    } 
  }
  
  private static long t(v paramv) {
    long l1;
    paramv.M(8);
    if (c.c(paramv.k()) == 0) {
      l1 = paramv.B();
    } else {
      l1 = paramv.E();
    } 
    return l1;
  }
  
  private static void u(c.a parama, SparseArray<b> paramSparseArray, int paramInt, byte[] paramArrayOfbyte) {
    int i = parama.d.size();
    for (byte b1 = 0; b1 < i; b1++) {
      c.a a1 = parama.d.get(b1);
      if (a1.a == 1953653094)
        D(a1, paramSparseArray, paramInt, paramArrayOfbyte); 
    } 
  }
  
  private static void v(v paramv, n paramn) {
    paramv.M(8);
    int i = paramv.k();
    if ((c.b(i) & 0x1) == 1)
      paramv.N(8); 
    int k = paramv.D();
    if (k == 1) {
      long l2;
      i = c.c(i);
      long l1 = paramn.d;
      if (i == 0) {
        l2 = paramv.B();
      } else {
        l2 = paramv.E();
      } 
      paramn.d = l1 + l2;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unexpected saio entry count: ");
    stringBuilder.append(k);
    throw new ParserException(stringBuilder.toString());
  }
  
  private static void w(m paramm, v paramv, n paramn) {
    int i = paramm.d;
    paramv.M(8);
    int k = c.b(paramv.k());
    boolean bool = true;
    if ((k & 0x1) == 1)
      paramv.N(8); 
    k = paramv.z();
    int i1 = paramv.D();
    if (i1 == paramn.f) {
      int i2;
      if (k == 0) {
        boolean[] arrayOfBoolean = paramn.n;
        byte b1 = 0;
        k = 0;
        while (true) {
          i2 = k;
          if (b1 < i1) {
            i2 = paramv.z();
            k += i2;
            if (i2 > i) {
              bool = true;
            } else {
              bool = false;
            } 
            arrayOfBoolean[b1] = bool;
            b1++;
            continue;
          } 
          break;
        } 
      } else {
        if (k <= i)
          bool = false; 
        i2 = k * i1 + 0;
        Arrays.fill(paramn.n, 0, i1, bool);
      } 
      paramn.d(i2);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Length mismatch: ");
    stringBuilder.append(i1);
    stringBuilder.append(", ");
    stringBuilder.append(paramn.f);
    ParserException parserException = new ParserException(stringBuilder.toString());
    throw parserException;
  }
  
  private static void x(v paramv, int paramInt, n paramn) {
    paramv.M(paramInt + 8);
    paramInt = c.b(paramv.k());
    if ((paramInt & 0x1) == 0) {
      boolean bool;
      if ((paramInt & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      paramInt = paramv.D();
      if (paramInt == paramn.f) {
        Arrays.fill(paramn.n, 0, paramInt, bool);
        paramn.d(paramv.a());
        paramn.b(paramv);
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Length mismatch: ");
      stringBuilder.append(paramInt);
      stringBuilder.append(", ");
      stringBuilder.append(paramn.f);
      throw new ParserException(stringBuilder.toString());
    } 
    throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
  }
  
  private static void y(v paramv, n paramn) {
    x(paramv, 0, paramn);
  }
  
  private static void z(v paramv1, v paramv2, String paramString, n paramn) {
    paramv1.M(8);
    int i = paramv1.k();
    if (paramv1.k() != 1936025959)
      return; 
    if (c.c(i) == 1)
      paramv1.N(4); 
    if (paramv1.k() == 1) {
      paramv2.M(8);
      i = paramv2.k();
      if (paramv2.k() != 1936025959)
        return; 
      i = c.c(i);
      if (i == 1) {
        if (paramv2.B() == 0L)
          throw new ParserException("Variable length description in sgpd found (unsupported)"); 
      } else if (i >= 2) {
        paramv2.N(4);
      } 
      if (paramv2.B() == 1L) {
        boolean bool;
        paramv2.N(1);
        int k = paramv2.z();
        if (paramv2.z() == 1) {
          bool = true;
        } else {
          bool = false;
        } 
        if (!bool)
          return; 
        i = paramv2.z();
        byte[] arrayOfByte = new byte[16];
        paramv2.h(arrayOfByte, 0, 16);
        if (i == 0) {
          int m = paramv2.z();
          byte[] arrayOfByte1 = new byte[m];
          paramv2.h(arrayOfByte1, 0, m);
        } else {
          paramv1 = null;
        } 
        paramn.m = true;
        paramn.o = new m(bool, paramString, i, arrayOfByte, (k & 0xF0) >> 4, k & 0xF, (byte[])paramv1);
        return;
      } 
      throw new ParserException("Entry count in sgpd != 1 (unsupported).");
    } 
    throw new ParserException("Entry count in sbgp != 1 (unsupported).");
  }
  
  public void a() {}
  
  public boolean e(i parami) {
    return k.b(parami);
  }
  
  public int g(i parami, s params) {
    while (true) {
      int k = this.s;
      if (k != 0) {
        if (k != 1) {
          if (k != 2) {
            if (M(parami))
              return 0; 
            continue;
          } 
          L(parami);
          continue;
        } 
        K(parami);
        continue;
      } 
      if (!J(parami))
        return -1; 
    } 
  }
  
  public void h(j paramj) {
    this.H = paramj;
    l l1 = this.e;
    if (l1 != null) {
      b b1 = new b(paramj.g(0, l1.b));
      b1.d(this.e, new e(0, 0, 0, 0));
      this.g.put(0, b1);
      l();
      this.H.f();
    } 
  }
  
  public void i(long paramLong1, long paramLong2) {
    int i = this.g.size();
    for (byte b1 = 0; b1 < i; b1++)
      ((b)this.g.valueAt(b1)).g(); 
    this.q.clear();
    this.y = 0;
    this.z = paramLong2;
    this.p.clear();
    b();
  }
  
  protected l m(l paraml) {
    return paraml;
  }
  
  private static final class a {
    public final long a;
    
    public final int b;
    
    public a(long param1Long, int param1Int) {
      this.a = param1Long;
      this.b = param1Int;
    }
  }
  
  private static final class b {
    public final v a;
    
    public final n b;
    
    public final v c;
    
    public l d;
    
    public e e;
    
    public int f;
    
    public int g;
    
    public int h;
    
    public int i;
    
    private final v j;
    
    private final v k;
    
    public b(v param1v) {
      this.a = param1v;
      this.b = new n();
      this.c = new v();
      this.j = new v(1);
      this.k = new v();
    }
    
    private m c() {
      n n1 = this.b;
      int i = n1.a.a;
      m m = n1.o;
      if (m == null)
        m = this.d.a(i); 
      if (m == null || !m.a)
        m = null; 
      return m;
    }
    
    private void i() {
      m m = c();
      if (m == null)
        return; 
      v v1 = this.b.q;
      int i = m.d;
      if (i != 0)
        v1.N(i); 
      if (this.b.g(this.f))
        v1.N(v1.F() * 6); 
    }
    
    public void d(l param1l, e param1e) {
      this.d = (l)e.e(param1l);
      this.e = (e)e.e(param1e);
      this.a.d(param1l.f);
      g();
    }
    
    public boolean e() {
      this.f++;
      int i = this.g + 1;
      this.g = i;
      int[] arrayOfInt = this.b.h;
      int j = this.h;
      if (i == arrayOfInt[j]) {
        this.h = j + 1;
        this.g = 0;
        return false;
      } 
      return true;
    }
    
    public int f(int param1Int1, int param1Int2) {
      boolean bool1;
      int j;
      m m = c();
      if (m == null)
        return 0; 
      int i = m.d;
      if (i != 0) {
        v1 = this.b.q;
      } else {
        byte[] arrayOfByte1 = ((m)v1).e;
        this.k.K(arrayOfByte1, arrayOfByte1.length);
        v1 = this.k;
        i = arrayOfByte1.length;
      } 
      boolean bool = this.b.g(this.f);
      if (bool || param1Int2 != 0) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      v v3 = this.j;
      byte[] arrayOfByte = v3.a;
      if (bool1) {
        j = 128;
      } else {
        j = 0;
      } 
      arrayOfByte[0] = (byte)(byte)(j | i);
      v3.M(0);
      this.a.b(this.j, 1);
      this.a.b(v1, i);
      if (!bool1)
        return i + 1; 
      if (!bool) {
        this.c.I(8);
        v1 = this.c;
        arrayOfByte = v1.a;
        arrayOfByte[0] = (byte)0;
        arrayOfByte[1] = (byte)1;
        arrayOfByte[2] = (byte)(byte)(param1Int2 >> 8 & 0xFF);
        arrayOfByte[3] = (byte)(byte)(param1Int2 & 0xFF);
        arrayOfByte[4] = (byte)(byte)(param1Int1 >> 24 & 0xFF);
        arrayOfByte[5] = (byte)(byte)(param1Int1 >> 16 & 0xFF);
        arrayOfByte[6] = (byte)(byte)(param1Int1 >> 8 & 0xFF);
        arrayOfByte[7] = (byte)(byte)(param1Int1 & 0xFF);
        this.a.b(v1, 8);
        return i + 1 + 8;
      } 
      v v2 = this.b.q;
      param1Int1 = v2.F();
      v2.N(-2);
      param1Int1 = param1Int1 * 6 + 2;
      v v1 = v2;
      if (param1Int2 != 0) {
        this.c.I(param1Int1);
        this.c.h(v2.a, 0, param1Int1);
        v2.N(param1Int1);
        v1 = this.c;
        byte[] arrayOfByte1 = v1.a;
        param1Int2 = ((arrayOfByte1[2] & 0xFF) << 8 | arrayOfByte1[3] & 0xFF) + param1Int2;
        arrayOfByte1[2] = (byte)(byte)(param1Int2 >> 8 & 0xFF);
        arrayOfByte1[3] = (byte)(byte)(param1Int2 & 0xFF);
      } 
      this.a.b(v1, param1Int1);
      return i + 1 + param1Int1;
    }
    
    public void g() {
      this.b.f();
      this.f = 0;
      this.h = 0;
      this.g = 0;
      this.i = 0;
    }
    
    public void h(long param1Long) {
      param1Long = v.b(param1Long);
      int i = this.f;
      while (true) {
        n n1 = this.b;
        if (i < n1.f && n1.c(i) < param1Long) {
          if (this.b.l[i])
            this.i = i; 
          i++;
          continue;
        } 
        break;
      } 
    }
    
    public void j(DrmInitData param1DrmInitData) {
      m m = this.d.a(this.b.a.a);
      if (m != null) {
        String str = m.b;
      } else {
        m = null;
      } 
      this.a.d(this.d.f.d(param1DrmInitData.c((String)m)));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/extractor/mp4/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */