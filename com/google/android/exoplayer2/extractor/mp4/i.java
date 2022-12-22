package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.h;
import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.l;
import com.google.android.exoplayer2.c1.p;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.s;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayDeque;
import java.util.ArrayList;

public final class i implements h, t {
  public static final l a = b.a;
  
  private final int b;
  
  private final v c;
  
  private final v d;
  
  private final v e;
  
  private final v f;
  
  private final ArrayDeque<c.a> g;
  
  private int h;
  
  private int i;
  
  private long j;
  
  private int k;
  
  private v l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private j q;
  
  private a[] r;
  
  private long[][] s;
  
  private int t;
  
  private long u;
  
  private boolean v;
  
  public i() {
    this(0);
  }
  
  public i(int paramInt) {
    this.b = paramInt;
    this.f = new v(16);
    this.g = new ArrayDeque<c.a>();
    this.c = new v(s.a);
    this.d = new v(4);
    this.e = new v();
    this.m = -1;
  }
  
  private void A(long paramLong) {
    for (a a1 : this.r) {
      o o = a1.b;
      int k = o.a(paramLong);
      int m = k;
      if (k == -1)
        m = o.b(paramLong); 
      a1.d = m;
    } 
  }
  
  private static long[][] k(a[] paramArrayOfa) {
    long[][] arrayOfLong = new long[paramArrayOfa.length][];
    int[] arrayOfInt = new int[paramArrayOfa.length];
    long[] arrayOfLong1 = new long[paramArrayOfa.length];
    boolean[] arrayOfBoolean = new boolean[paramArrayOfa.length];
    int k;
    for (k = 0; k < paramArrayOfa.length; k++) {
      arrayOfLong[k] = new long[(paramArrayOfa[k]).b.b];
      arrayOfLong1[k] = (paramArrayOfa[k]).b.f[0];
    } 
    long l1 = 0L;
    for (byte b = 0; b < paramArrayOfa.length; b++) {
      long l2 = Long.MAX_VALUE;
      int m = -1;
      k = 0;
      while (k < paramArrayOfa.length) {
        long l3 = l2;
        int n = m;
        if (!arrayOfBoolean[k]) {
          l3 = l2;
          n = m;
          if (arrayOfLong1[k] <= l2) {
            l3 = arrayOfLong1[k];
            n = k;
          } 
        } 
        k++;
        l2 = l3;
        m = n;
      } 
      k = arrayOfInt[m];
      arrayOfLong[m][k] = l1;
      l1 += (paramArrayOfa[m]).b.d[k];
      arrayOfInt[m] = ++k;
      if (k < (arrayOfLong[m]).length) {
        arrayOfLong1[m] = (paramArrayOfa[m]).b.f[k];
        continue;
      } 
      arrayOfBoolean[m] = true;
    } 
    return arrayOfLong;
  }
  
  private void l() {
    this.h = 0;
    this.k = 0;
  }
  
  private static int m(o paramo, long paramLong) {
    int k = paramo.a(paramLong);
    int m = k;
    if (k == -1)
      m = paramo.b(paramLong); 
    return m;
  }
  
  private int n(long paramLong) {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_3
    //   2: iconst_m1
    //   3: istore #4
    //   5: iconst_0
    //   6: istore #5
    //   8: ldc2_w 9223372036854775807
    //   11: lstore #6
    //   13: iconst_1
    //   14: istore #8
    //   16: ldc2_w 9223372036854775807
    //   19: lstore #9
    //   21: iconst_1
    //   22: istore #11
    //   24: ldc2_w 9223372036854775807
    //   27: lstore #12
    //   29: aload_0
    //   30: getfield r : [Lcom/google/android/exoplayer2/extractor/mp4/i$a;
    //   33: astore #14
    //   35: iload #5
    //   37: aload #14
    //   39: arraylength
    //   40: if_icmpge -> 275
    //   43: aload #14
    //   45: iload #5
    //   47: aaload
    //   48: astore #14
    //   50: aload #14
    //   52: getfield d : I
    //   55: istore #15
    //   57: aload #14
    //   59: getfield b : Lcom/google/android/exoplayer2/extractor/mp4/o;
    //   62: astore #14
    //   64: iload #15
    //   66: aload #14
    //   68: getfield b : I
    //   71: if_icmpne -> 81
    //   74: lload #6
    //   76: lstore #16
    //   78: goto -> 265
    //   81: aload #14
    //   83: getfield c : [J
    //   86: iload #15
    //   88: laload
    //   89: lstore #18
    //   91: aload_0
    //   92: getfield s : [[J
    //   95: iload #5
    //   97: aaload
    //   98: iload #15
    //   100: laload
    //   101: lstore #20
    //   103: lload #18
    //   105: lload_1
    //   106: lsub
    //   107: lstore #16
    //   109: lload #16
    //   111: lconst_0
    //   112: lcmp
    //   113: iflt -> 134
    //   116: lload #16
    //   118: ldc2_w 262144
    //   121: lcmp
    //   122: iflt -> 128
    //   125: goto -> 134
    //   128: iconst_0
    //   129: istore #15
    //   131: goto -> 137
    //   134: iconst_1
    //   135: istore #15
    //   137: iload #15
    //   139: ifne -> 147
    //   142: iload #11
    //   144: ifne -> 194
    //   147: iload #4
    //   149: istore #22
    //   151: lload #9
    //   153: lstore #23
    //   155: iload #11
    //   157: istore #25
    //   159: lload #12
    //   161: lstore #18
    //   163: iload #15
    //   165: iload #11
    //   167: if_icmpne -> 210
    //   170: iload #4
    //   172: istore #22
    //   174: lload #9
    //   176: lstore #23
    //   178: iload #11
    //   180: istore #25
    //   182: lload #12
    //   184: lstore #18
    //   186: lload #16
    //   188: lload #12
    //   190: lcmp
    //   191: ifge -> 210
    //   194: iload #15
    //   196: istore #25
    //   198: lload #16
    //   200: lstore #18
    //   202: iload #5
    //   204: istore #22
    //   206: lload #20
    //   208: lstore #23
    //   210: iload #22
    //   212: istore #4
    //   214: lload #6
    //   216: lstore #16
    //   218: lload #23
    //   220: lstore #9
    //   222: iload #25
    //   224: istore #11
    //   226: lload #18
    //   228: lstore #12
    //   230: lload #20
    //   232: lload #6
    //   234: lcmp
    //   235: ifge -> 265
    //   238: iload #5
    //   240: istore_3
    //   241: lload #18
    //   243: lstore #12
    //   245: iload #25
    //   247: istore #11
    //   249: lload #23
    //   251: lstore #9
    //   253: iload #15
    //   255: istore #8
    //   257: lload #20
    //   259: lstore #16
    //   261: iload #22
    //   263: istore #4
    //   265: iinc #5, 1
    //   268: lload #16
    //   270: lstore #6
    //   272: goto -> 29
    //   275: lload #6
    //   277: ldc2_w 9223372036854775807
    //   280: lcmp
    //   281: ifeq -> 301
    //   284: iload #8
    //   286: ifeq -> 301
    //   289: lload #9
    //   291: lload #6
    //   293: ldc2_w 10485760
    //   296: ladd
    //   297: lcmp
    //   298: ifge -> 304
    //   301: iload #4
    //   303: istore_3
    //   304: iload_3
    //   305: ireturn
  }
  
  private ArrayList<o> o(c.a parama, p paramp, boolean paramBoolean) {
    ArrayList<o> arrayList = new ArrayList();
    for (byte b = 0; b < parama.d.size(); b++) {
      c.a a1 = parama.d.get(b);
      if (a1.a == 1953653099) {
        l l1 = d.v(a1, parama.g(1836476516), -9223372036854775807L, null, paramBoolean, this.v);
        if (l1 != null) {
          o o = d.r(l1, a1.f(1835297121).f(1835626086).f(1937007212), paramp);
          if (o.b != 0)
            arrayList.add(o); 
        } 
      } 
    } 
    return arrayList;
  }
  
  private static long q(o paramo, long paramLong1, long paramLong2) {
    int k = m(paramo, paramLong1);
    return (k == -1) ? paramLong2 : Math.min(paramo.c[k], paramLong2);
  }
  
  private void r(com.google.android.exoplayer2.c1.i parami) {
    this.e.I(8);
    parami.k(this.e.a, 0, 8);
    this.e.N(4);
    if (this.e.k() == 1751411826) {
      parami.h();
    } else {
      parami.i(4);
    } 
  }
  
  private void s(long paramLong) {
    while (!this.g.isEmpty() && ((c.a)this.g.peek()).b == paramLong) {
      c.a a1 = this.g.pop();
      if (a1.a == 1836019574) {
        u(a1);
        this.g.clear();
        this.h = 2;
        continue;
      } 
      if (!this.g.isEmpty())
        ((c.a)this.g.peek()).d(a1); 
    } 
    if (this.h != 2)
      l(); 
  }
  
  private static boolean t(v paramv) {
    paramv.M(8);
    if (paramv.k() == 1903435808)
      return true; 
    paramv.N(4);
    while (paramv.a() > 0) {
      if (paramv.k() == 1903435808)
        return true; 
    } 
    return false;
  }
  
  private void u(c.a parama) {
    boolean bool;
    ArrayList<a> arrayList1 = new ArrayList();
    p p = new p();
    c.b b = parama.g(1969517665);
    Metadata metadata = null;
    if (b != null) {
      Metadata metadata2 = d.w(b, this.v);
      Metadata metadata1 = metadata2;
      if (metadata2 != null) {
        p.c(metadata2);
        metadata1 = metadata2;
      } 
    } else {
      b = null;
    } 
    c.a a1 = parama.f(1835365473);
    if (a1 != null)
      metadata = d.l(a1); 
    if ((this.b & 0x1) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    ArrayList<o> arrayList = o(parama, p, bool);
    int k = arrayList.size();
    long l1 = -9223372036854775807L;
    byte b1 = 0;
    int m;
    for (m = -1; b1 < k; m = n) {
      o o = arrayList.get(b1);
      l l2 = o.a;
      long l3 = l2.e;
      if (l3 == -9223372036854775807L)
        l3 = o.h; 
      l1 = Math.max(l1, l3);
      a a2 = new a(l2, o, this.q.g(b1, l2.b));
      int n = o.e;
      Format format2 = l2.f.i(n + 30);
      if (l2.b == 2 && l3 > 0L) {
        n = o.b;
        format1 = format2;
        if (n > 1)
          format1 = format2.f(n / (float)l3 / 1000000.0F); 
      } else {
        format1 = format2;
      } 
      Format format1 = h.a(l2.b, format1, (Metadata)b, metadata, p);
      a2.c.d(format1);
      if (l2.b == 2) {
        n = m;
        if (m == -1)
          n = arrayList1.size(); 
      } else {
        n = m;
      } 
      arrayList1.add(a2);
      b1++;
    } 
    this.t = m;
    this.u = l1;
    a[] arrayOfA = arrayList1.<a>toArray(new a[0]);
    this.r = arrayOfA;
    this.s = k(arrayOfA);
    this.q.f();
    this.q.a(this);
  }
  
  private boolean v(com.google.android.exoplayer2.c1.i parami) {
    if (this.k == 0) {
      if (!parami.b(this.f.a, 0, 8, true))
        return false; 
      this.k = 8;
      this.f.M(0);
      this.j = this.f.B();
      this.i = this.f.k();
    } 
    long l1 = this.j;
    if (l1 == 1L) {
      parami.readFully(this.f.a, 8, 8);
      this.k += 8;
      this.j = this.f.E();
    } else if (l1 == 0L) {
      long l2 = parami.getLength();
      l1 = l2;
      if (l2 == -1L) {
        l1 = l2;
        if (!this.g.isEmpty())
          l1 = ((c.a)this.g.peek()).b; 
      } 
      if (l1 != -1L)
        this.j = l1 - parami.a() + this.k; 
    } 
    if (this.j >= this.k) {
      if (y(this.i)) {
        long l2 = parami.a();
        l1 = this.j;
        int k = this.k;
        l2 = l2 + l1 - k;
        if (l1 != k && this.i == 1835365473)
          r(parami); 
        this.g.push(new c.a(this.i, l2));
        if (this.j == this.k) {
          s(l2);
        } else {
          l();
        } 
      } else if (z(this.i)) {
        boolean bool;
        if (this.k == 8) {
          bool = true;
        } else {
          bool = false;
        } 
        e.f(bool);
        if (this.j <= 2147483647L) {
          bool = true;
        } else {
          bool = false;
        } 
        e.f(bool);
        v v1 = new v((int)this.j);
        this.l = v1;
        System.arraycopy(this.f.a, 0, v1.a, 0, 8);
        this.h = 1;
      } else {
        this.l = null;
        this.h = 1;
      } 
      return true;
    } 
    throw new ParserException("Atom size less than header length (unsupported).");
  }
  
  private boolean w(com.google.android.exoplayer2.c1.i parami, s params) {
    long l1 = this.j - this.k;
    long l2 = parami.a();
    v v1 = this.l;
    boolean bool1 = true;
    if (v1 != null) {
      parami.readFully(v1.a, this.k, (int)l1);
      if (this.i == 1718909296) {
        this.v = t(this.l);
      } else if (!this.g.isEmpty()) {
        ((c.a)this.g.peek()).e(new c.b(this.i, this.l));
      } 
    } else if (l1 < 262144L) {
      parami.i((int)l1);
    } else {
      params.a = parami.a() + l1;
      boolean bool = true;
      s(l2 + l1);
    } 
    boolean bool2 = false;
    s(l2 + l1);
  }
  
  private int x(com.google.android.exoplayer2.c1.i parami, s params) {
    byte[] arrayOfByte;
    int i2;
    long l2 = parami.a();
    if (this.m == -1) {
      int i3 = n(l2);
      this.m = i3;
      if (i3 == -1)
        return -1; 
    } 
    a a1 = this.r[this.m];
    v v1 = a1.c;
    int m = a1.d;
    o o2 = a1.b;
    long l3 = o2.c[m];
    int n = o2.d[m];
    l2 = l3 - l2 + this.n;
    if (l2 < 0L || l2 >= 262144L) {
      params.a = l3;
      return 1;
    } 
    l3 = l2;
    int k = n;
    if (a1.a.g == 1) {
      l3 = l2 + 8L;
      k = n - 8;
    } 
    parami.i((int)l3);
    l l1 = a1.a;
    int i1 = l1.j;
    if (i1 != 0) {
      arrayOfByte = this.d.a;
      arrayOfByte[0] = (byte)0;
      arrayOfByte[1] = (byte)0;
      arrayOfByte[2] = (byte)0;
      n = 4 - i1;
      while (true) {
        i2 = k;
        if (this.o < k) {
          i2 = this.p;
          if (i2 == 0) {
            parami.readFully(arrayOfByte, n, i1);
            this.n += i1;
            this.d.M(0);
            i2 = this.d.k();
            if (i2 >= 0) {
              this.p = i2;
              this.c.M(0);
              v1.b(this.c, 4);
              this.o += 4;
              k += n;
              continue;
            } 
            throw new ParserException("Invalid NAL length");
          } 
          i2 = v1.a(parami, i2, false);
          this.n += i2;
          this.o += i2;
          this.p -= i2;
          continue;
        } 
        break;
      } 
    } else {
      n = k;
      if ("audio/ac4".equals(((l)arrayOfByte).f.j)) {
        if (this.o == 0) {
          h.a(k, this.e);
          v1.b(this.e, 7);
          this.o += 7;
        } 
        n = k + 7;
      } 
      while (true) {
        k = this.o;
        i2 = n;
        if (k < n) {
          k = v1.a(parami, n - k, false);
          this.n += k;
          this.o += k;
          this.p -= k;
          continue;
        } 
        break;
      } 
    } 
    o o1 = a1.b;
    v1.c(o1.f[m], o1.g[m], i2, 0, null);
    a1.d++;
    this.m = -1;
    this.n = 0;
    this.o = 0;
    this.p = 0;
    return 0;
  }
  
  private static boolean y(int paramInt) {
    return (paramInt == 1836019574 || paramInt == 1953653099 || paramInt == 1835297121 || paramInt == 1835626086 || paramInt == 1937007212 || paramInt == 1701082227 || paramInt == 1835365473);
  }
  
  private static boolean z(int paramInt) {
    return (paramInt == 1835296868 || paramInt == 1836476516 || paramInt == 1751411826 || paramInt == 1937011556 || paramInt == 1937011827 || paramInt == 1937011571 || paramInt == 1668576371 || paramInt == 1701606260 || paramInt == 1937011555 || paramInt == 1937011578 || paramInt == 1937013298 || paramInt == 1937007471 || paramInt == 1668232756 || paramInt == 1953196132 || paramInt == 1718909296 || paramInt == 1969517665 || paramInt == 1801812339 || paramInt == 1768715124);
  }
  
  public void a() {}
  
  public boolean b() {
    return true;
  }
  
  public long c() {
    return this.u;
  }
  
  public boolean e(com.google.android.exoplayer2.c1.i parami) {
    return k.d(parami);
  }
  
  public int g(com.google.android.exoplayer2.c1.i parami, s params) {
    while (true) {
      int k = this.h;
      if (k != 0) {
        if (k != 1) {
          if (k == 2)
            return x(parami, params); 
          throw new IllegalStateException();
        } 
        if (w(parami, params))
          return 1; 
        continue;
      } 
      if (!v(parami))
        return -1; 
    } 
  }
  
  public void h(j paramj) {
    this.q = paramj;
  }
  
  public void i(long paramLong1, long paramLong2) {
    this.g.clear();
    this.k = 0;
    this.m = -1;
    this.n = 0;
    this.o = 0;
    this.p = 0;
    if (paramLong1 == 0L) {
      l();
    } else if (this.r != null) {
      A(paramLong2);
    } 
  }
  
  public t.a j(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: getfield r : [Lcom/google/android/exoplayer2/extractor/mp4/i$a;
    //   4: astore_3
    //   5: aload_3
    //   6: arraylength
    //   7: ifne -> 21
    //   10: new com/google/android/exoplayer2/c1/t$a
    //   13: dup
    //   14: getstatic com/google/android/exoplayer2/c1/u.a : Lcom/google/android/exoplayer2/c1/u;
    //   17: invokespecial <init> : (Lcom/google/android/exoplayer2/c1/u;)V
    //   20: areturn
    //   21: aload_0
    //   22: getfield t : I
    //   25: istore #4
    //   27: iload #4
    //   29: iconst_m1
    //   30: if_icmpeq -> 163
    //   33: aload_3
    //   34: iload #4
    //   36: aaload
    //   37: getfield b : Lcom/google/android/exoplayer2/extractor/mp4/o;
    //   40: astore_3
    //   41: aload_3
    //   42: lload_1
    //   43: invokestatic m : (Lcom/google/android/exoplayer2/extractor/mp4/o;J)I
    //   46: istore #4
    //   48: iload #4
    //   50: iconst_m1
    //   51: if_icmpne -> 65
    //   54: new com/google/android/exoplayer2/c1/t$a
    //   57: dup
    //   58: getstatic com/google/android/exoplayer2/c1/u.a : Lcom/google/android/exoplayer2/c1/u;
    //   61: invokespecial <init> : (Lcom/google/android/exoplayer2/c1/u;)V
    //   64: areturn
    //   65: aload_3
    //   66: getfield f : [J
    //   69: iload #4
    //   71: laload
    //   72: lstore #5
    //   74: aload_3
    //   75: getfield c : [J
    //   78: iload #4
    //   80: laload
    //   81: lstore #7
    //   83: lload #5
    //   85: lload_1
    //   86: lcmp
    //   87: ifge -> 141
    //   90: iload #4
    //   92: aload_3
    //   93: getfield b : I
    //   96: iconst_1
    //   97: isub
    //   98: if_icmpge -> 141
    //   101: aload_3
    //   102: lload_1
    //   103: invokevirtual b : (J)I
    //   106: istore #9
    //   108: iload #9
    //   110: iconst_m1
    //   111: if_icmpeq -> 141
    //   114: iload #9
    //   116: iload #4
    //   118: if_icmpeq -> 141
    //   121: aload_3
    //   122: getfield f : [J
    //   125: iload #9
    //   127: laload
    //   128: lstore_1
    //   129: aload_3
    //   130: getfield c : [J
    //   133: iload #9
    //   135: laload
    //   136: lstore #10
    //   138: goto -> 150
    //   141: ldc2_w -1
    //   144: lstore #10
    //   146: ldc2_w -9223372036854775807
    //   149: lstore_1
    //   150: lload_1
    //   151: lstore #12
    //   153: lload #10
    //   155: lstore_1
    //   156: lload #7
    //   158: lstore #10
    //   160: goto -> 184
    //   163: ldc2_w 9223372036854775807
    //   166: lstore #10
    //   168: ldc2_w -1
    //   171: lstore #7
    //   173: ldc2_w -9223372036854775807
    //   176: lstore #12
    //   178: lload_1
    //   179: lstore #5
    //   181: lload #7
    //   183: lstore_1
    //   184: iconst_0
    //   185: istore #4
    //   187: aload_0
    //   188: getfield r : [Lcom/google/android/exoplayer2/extractor/mp4/i$a;
    //   191: astore_3
    //   192: iload #4
    //   194: aload_3
    //   195: arraylength
    //   196: if_icmpge -> 271
    //   199: lload_1
    //   200: lstore #14
    //   202: lload #10
    //   204: lstore #7
    //   206: iload #4
    //   208: aload_0
    //   209: getfield t : I
    //   212: if_icmpeq -> 258
    //   215: aload_3
    //   216: iload #4
    //   218: aaload
    //   219: getfield b : Lcom/google/android/exoplayer2/extractor/mp4/o;
    //   222: astore_3
    //   223: aload_3
    //   224: lload #5
    //   226: lload #10
    //   228: invokestatic q : (Lcom/google/android/exoplayer2/extractor/mp4/o;JJ)J
    //   231: lstore #7
    //   233: lload_1
    //   234: lstore #10
    //   236: lload #12
    //   238: ldc2_w -9223372036854775807
    //   241: lcmp
    //   242: ifeq -> 254
    //   245: aload_3
    //   246: lload #12
    //   248: lload_1
    //   249: invokestatic q : (Lcom/google/android/exoplayer2/extractor/mp4/o;JJ)J
    //   252: lstore #10
    //   254: lload #10
    //   256: lstore #14
    //   258: iinc #4, 1
    //   261: lload #14
    //   263: lstore_1
    //   264: lload #7
    //   266: lstore #10
    //   268: goto -> 187
    //   271: new com/google/android/exoplayer2/c1/u
    //   274: dup
    //   275: lload #5
    //   277: lload #10
    //   279: invokespecial <init> : (JJ)V
    //   282: astore_3
    //   283: lload #12
    //   285: ldc2_w -9223372036854775807
    //   288: lcmp
    //   289: ifne -> 301
    //   292: new com/google/android/exoplayer2/c1/t$a
    //   295: dup
    //   296: aload_3
    //   297: invokespecial <init> : (Lcom/google/android/exoplayer2/c1/u;)V
    //   300: areturn
    //   301: new com/google/android/exoplayer2/c1/t$a
    //   304: dup
    //   305: aload_3
    //   306: new com/google/android/exoplayer2/c1/u
    //   309: dup
    //   310: lload #12
    //   312: lload_1
    //   313: invokespecial <init> : (JJ)V
    //   316: invokespecial <init> : (Lcom/google/android/exoplayer2/c1/u;Lcom/google/android/exoplayer2/c1/u;)V
    //   319: areturn
  }
  
  private static final class a {
    public final l a;
    
    public final o b;
    
    public final v c;
    
    public int d;
    
    public a(l param1l, o param1o, v param1v) {
      this.a = param1l;
      this.b = param1o;
      this.c = param1v;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/extractor/mp4/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */