package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.j;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.u;
import com.google.android.exoplayer2.upstream.w;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.i;
import com.google.android.exoplayer2.util.r;
import com.google.android.exoplayer2.util.v;
import com.google.android.exoplayer2.w0;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class x implements u, j, Loader.b<x.a>, Loader.f, a0.b {
  private static final Map<String, String> b = G();
  
  private static final Format c = Format.t("icy", "application/x-icy", Long.MAX_VALUE);
  
  private boolean A;
  
  private int B;
  
  private boolean C;
  
  private boolean D;
  
  private boolean E;
  
  private int F;
  
  private long G;
  
  private long H;
  
  private boolean I;
  
  private long J;
  
  private long K;
  
  private boolean L;
  
  private int M;
  
  private boolean N;
  
  private boolean O;
  
  private final Uri d;
  
  private final j e;
  
  private final k<?> f;
  
  private final u g;
  
  private final w.a h;
  
  private final c i;
  
  private final com.google.android.exoplayer2.upstream.e j;
  
  private final String k;
  
  private final long l;
  
  private final Loader m;
  
  private final b n;
  
  private final i o;
  
  private final Runnable p;
  
  private final Runnable q;
  
  private final Handler r;
  
  private u.a s;
  
  private t t;
  
  private IcyHeaders u;
  
  private a0[] v;
  
  private f[] w;
  
  private boolean x;
  
  private boolean y;
  
  private d z;
  
  public x(Uri paramUri, j paramj, h[] paramArrayOfh, k<?> paramk, u paramu, w.a parama, c paramc, com.google.android.exoplayer2.upstream.e parame, String paramString, int paramInt) {
    this.d = paramUri;
    this.e = paramj;
    this.f = paramk;
    this.g = paramu;
    this.h = parama;
    this.i = paramc;
    this.j = parame;
    this.k = paramString;
    this.l = paramInt;
    this.m = new Loader("Loader:ProgressiveMediaPeriod");
    this.n = new b(paramArrayOfh);
    this.o = new i();
    this.p = new j(this);
    this.q = new k(this);
    this.r = new Handler();
    this.w = new f[0];
    this.v = new a0[0];
    this.K = -9223372036854775807L;
    this.H = -1L;
    this.G = -9223372036854775807L;
    this.B = 1;
    parama.G();
  }
  
  private boolean E(a parama, int paramInt) {
    if (this.H == -1L) {
      t t1 = this.t;
      if (t1 == null || t1.c() == -9223372036854775807L) {
        boolean bool = this.y;
        paramInt = 0;
        if (bool && !e0()) {
          this.L = true;
          return false;
        } 
        this.D = this.y;
        this.J = 0L;
        this.M = 0;
        a0[] arrayOfA0 = this.v;
        int m = arrayOfA0.length;
        while (paramInt < m) {
          arrayOfA0[paramInt].J();
          paramInt++;
        } 
        a.h(parama, 0L, 0L);
        return true;
      } 
    } 
    this.M = paramInt;
    return true;
  }
  
  private void F(a parama) {
    if (this.H == -1L)
      this.H = a.g(parama); 
  }
  
  private static Map<String, String> G() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("Icy-MetaData", "1");
    return (Map)Collections.unmodifiableMap(hashMap);
  }
  
  private int H() {
    a0[] arrayOfA0 = this.v;
    int m = arrayOfA0.length;
    byte b1 = 0;
    int n = 0;
    while (b1 < m) {
      n += arrayOfA0[b1].v();
      b1++;
    } 
    return n;
  }
  
  private long I() {
    a0[] arrayOfA0 = this.v;
    int m = arrayOfA0.length;
    long l = Long.MIN_VALUE;
    for (byte b1 = 0; b1 < m; b1++)
      l = Math.max(l, arrayOfA0[b1].q()); 
    return l;
  }
  
  private d J() {
    return (d)com.google.android.exoplayer2.util.e.e(this.z);
  }
  
  private boolean L() {
    boolean bool;
    if (this.K != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void Q() {
    // Byte code:
    //   0: aload_0
    //   1: getfield t : Lcom/google/android/exoplayer2/c1/t;
    //   4: astore_1
    //   5: aload_0
    //   6: getfield O : Z
    //   9: ifne -> 466
    //   12: aload_0
    //   13: getfield y : Z
    //   16: ifne -> 466
    //   19: aload_0
    //   20: getfield x : Z
    //   23: ifeq -> 466
    //   26: aload_1
    //   27: ifnonnull -> 33
    //   30: goto -> 466
    //   33: aload_0
    //   34: getfield v : [Lcom/google/android/exoplayer2/source/a0;
    //   37: astore_2
    //   38: aload_2
    //   39: arraylength
    //   40: istore_3
    //   41: iconst_0
    //   42: istore #4
    //   44: iconst_0
    //   45: istore #5
    //   47: iload #5
    //   49: iload_3
    //   50: if_icmpge -> 70
    //   53: aload_2
    //   54: iload #5
    //   56: aaload
    //   57: invokevirtual u : ()Lcom/google/android/exoplayer2/Format;
    //   60: ifnonnull -> 64
    //   63: return
    //   64: iinc #5, 1
    //   67: goto -> 47
    //   70: aload_0
    //   71: getfield o : Lcom/google/android/exoplayer2/util/i;
    //   74: invokevirtual b : ()Z
    //   77: pop
    //   78: aload_0
    //   79: getfield v : [Lcom/google/android/exoplayer2/source/a0;
    //   82: arraylength
    //   83: istore_3
    //   84: iload_3
    //   85: anewarray com/google/android/exoplayer2/source/TrackGroup
    //   88: astore #6
    //   90: iload_3
    //   91: newarray boolean
    //   93: astore #7
    //   95: aload_0
    //   96: aload_1
    //   97: invokeinterface c : ()J
    //   102: putfield G : J
    //   105: iconst_0
    //   106: istore #5
    //   108: iload #5
    //   110: iload_3
    //   111: if_icmpge -> 337
    //   114: aload_0
    //   115: getfield v : [Lcom/google/android/exoplayer2/source/a0;
    //   118: iload #5
    //   120: aaload
    //   121: invokevirtual u : ()Lcom/google/android/exoplayer2/Format;
    //   124: astore #8
    //   126: aload #8
    //   128: getfield j : Ljava/lang/String;
    //   131: astore_2
    //   132: aload_2
    //   133: invokestatic l : (Ljava/lang/String;)Z
    //   136: istore #9
    //   138: iload #9
    //   140: ifne -> 159
    //   143: aload_2
    //   144: invokestatic n : (Ljava/lang/String;)Z
    //   147: ifeq -> 153
    //   150: goto -> 159
    //   153: iconst_0
    //   154: istore #10
    //   156: goto -> 162
    //   159: iconst_1
    //   160: istore #10
    //   162: aload #7
    //   164: iload #5
    //   166: iload #10
    //   168: bastore
    //   169: aload_0
    //   170: iload #10
    //   172: aload_0
    //   173: getfield A : Z
    //   176: ior
    //   177: putfield A : Z
    //   180: aload_0
    //   181: getfield u : Lcom/google/android/exoplayer2/metadata/icy/IcyHeaders;
    //   184: astore #11
    //   186: aload #8
    //   188: astore #12
    //   190: aload #11
    //   192: ifnull -> 310
    //   195: iload #9
    //   197: ifne -> 216
    //   200: aload #8
    //   202: astore_2
    //   203: aload_0
    //   204: getfield w : [Lcom/google/android/exoplayer2/source/x$f;
    //   207: iload #5
    //   209: aaload
    //   210: getfield b : Z
    //   213: ifeq -> 267
    //   216: aload #8
    //   218: getfield h : Lcom/google/android/exoplayer2/metadata/Metadata;
    //   221: astore_2
    //   222: aload_2
    //   223: ifnonnull -> 246
    //   226: new com/google/android/exoplayer2/metadata/Metadata
    //   229: dup
    //   230: iconst_1
    //   231: anewarray com/google/android/exoplayer2/metadata/Metadata$Entry
    //   234: dup
    //   235: iconst_0
    //   236: aload #11
    //   238: aastore
    //   239: invokespecial <init> : ([Lcom/google/android/exoplayer2/metadata/Metadata$Entry;)V
    //   242: astore_2
    //   243: goto -> 260
    //   246: aload_2
    //   247: iconst_1
    //   248: anewarray com/google/android/exoplayer2/metadata/Metadata$Entry
    //   251: dup
    //   252: iconst_0
    //   253: aload #11
    //   255: aastore
    //   256: invokevirtual a : ([Lcom/google/android/exoplayer2/metadata/Metadata$Entry;)Lcom/google/android/exoplayer2/metadata/Metadata;
    //   259: astore_2
    //   260: aload #8
    //   262: aload_2
    //   263: invokevirtual j : (Lcom/google/android/exoplayer2/metadata/Metadata;)Lcom/google/android/exoplayer2/Format;
    //   266: astore_2
    //   267: aload_2
    //   268: astore #12
    //   270: iload #9
    //   272: ifeq -> 310
    //   275: aload_2
    //   276: astore #12
    //   278: aload_2
    //   279: getfield f : I
    //   282: iconst_m1
    //   283: if_icmpne -> 310
    //   286: aload #11
    //   288: getfield b : I
    //   291: istore #13
    //   293: aload_2
    //   294: astore #12
    //   296: iload #13
    //   298: iconst_m1
    //   299: if_icmpeq -> 310
    //   302: aload_2
    //   303: iload #13
    //   305: invokevirtual b : (I)Lcom/google/android/exoplayer2/Format;
    //   308: astore #12
    //   310: aload #6
    //   312: iload #5
    //   314: new com/google/android/exoplayer2/source/TrackGroup
    //   317: dup
    //   318: iconst_1
    //   319: anewarray com/google/android/exoplayer2/Format
    //   322: dup
    //   323: iconst_0
    //   324: aload #12
    //   326: aastore
    //   327: invokespecial <init> : ([Lcom/google/android/exoplayer2/Format;)V
    //   330: aastore
    //   331: iinc #5, 1
    //   334: goto -> 108
    //   337: iload #4
    //   339: istore #10
    //   341: aload_0
    //   342: getfield H : J
    //   345: ldc2_w -1
    //   348: lcmp
    //   349: ifne -> 372
    //   352: iload #4
    //   354: istore #10
    //   356: aload_1
    //   357: invokeinterface c : ()J
    //   362: ldc2_w -9223372036854775807
    //   365: lcmp
    //   366: ifne -> 372
    //   369: iconst_1
    //   370: istore #10
    //   372: aload_0
    //   373: iload #10
    //   375: putfield I : Z
    //   378: iload #10
    //   380: ifeq -> 390
    //   383: bipush #7
    //   385: istore #5
    //   387: goto -> 393
    //   390: iconst_1
    //   391: istore #5
    //   393: aload_0
    //   394: iload #5
    //   396: putfield B : I
    //   399: aload_0
    //   400: new com/google/android/exoplayer2/source/x$d
    //   403: dup
    //   404: aload_1
    //   405: new com/google/android/exoplayer2/source/TrackGroupArray
    //   408: dup
    //   409: aload #6
    //   411: invokespecial <init> : ([Lcom/google/android/exoplayer2/source/TrackGroup;)V
    //   414: aload #7
    //   416: invokespecial <init> : (Lcom/google/android/exoplayer2/c1/t;Lcom/google/android/exoplayer2/source/TrackGroupArray;[Z)V
    //   419: putfield z : Lcom/google/android/exoplayer2/source/x$d;
    //   422: aload_0
    //   423: iconst_1
    //   424: putfield y : Z
    //   427: aload_0
    //   428: getfield i : Lcom/google/android/exoplayer2/source/x$c;
    //   431: aload_0
    //   432: getfield G : J
    //   435: aload_1
    //   436: invokeinterface b : ()Z
    //   441: aload_0
    //   442: getfield I : Z
    //   445: invokeinterface g : (JZZ)V
    //   450: aload_0
    //   451: getfield s : Lcom/google/android/exoplayer2/source/u$a;
    //   454: invokestatic e : (Ljava/lang/Object;)Ljava/lang/Object;
    //   457: checkcast com/google/android/exoplayer2/source/u$a
    //   460: aload_0
    //   461: invokeinterface f : (Lcom/google/android/exoplayer2/source/u;)V
    //   466: return
  }
  
  private void R(int paramInt) {
    d d1 = J();
    boolean[] arrayOfBoolean = d1.e;
    if (!arrayOfBoolean[paramInt]) {
      Format format = d1.b.a(paramInt).a(0);
      this.h.c(r.h(format.j), format, 0, null, this.J);
      arrayOfBoolean[paramInt] = true;
    } 
  }
  
  private void S(int paramInt) {
    boolean[] arrayOfBoolean = (J()).c;
    if (this.L && arrayOfBoolean[paramInt]) {
      a0 a01 = this.v[paramInt];
      paramInt = 0;
      if (!a01.z(false)) {
        this.K = 0L;
        this.L = false;
        this.D = true;
        this.J = 0L;
        this.M = 0;
        a0[] arrayOfA0 = this.v;
        int m = arrayOfA0.length;
        while (paramInt < m) {
          arrayOfA0[paramInt].J();
          paramInt++;
        } 
        ((u.a<x>)com.google.android.exoplayer2.util.e.e(this.s)).d(this);
      } 
    } 
  }
  
  private v Y(f paramf) {
    int m = this.v.length;
    int n;
    for (n = 0; n < m; n++) {
      if (paramf.equals(this.w[n]))
        return this.v[n]; 
    } 
    a0 a01 = new a0(this.j, this.f);
    a01.P(this);
    f[] arrayOfF = this.w;
    n = m + 1;
    arrayOfF = Arrays.<f>copyOf(arrayOfF, n);
    arrayOfF[m] = paramf;
    this.w = (f[])h0.h((Object[])arrayOfF);
    a0[] arrayOfA0 = Arrays.<a0>copyOf(this.v, n);
    arrayOfA0[m] = a01;
    this.v = (a0[])h0.h((Object[])arrayOfA0);
    return a01;
  }
  
  private boolean b0(boolean[] paramArrayOfboolean, long paramLong) {
    int m = this.v.length;
    for (byte b1 = 0; b1 < m; b1++) {
      if (!this.v[b1].M(paramLong, false) && (paramArrayOfboolean[b1] || !this.A))
        return false; 
    } 
    return true;
  }
  
  private void d0() {
    a a1 = new a(this, this.d, this.e, this.n, this, this.o);
    if (this.y) {
      t t1 = (J()).a;
      com.google.android.exoplayer2.util.e.f(L());
      long l1 = this.G;
      if (l1 != -9223372036854775807L && this.K > l1) {
        this.N = true;
        this.K = -9223372036854775807L;
        return;
      } 
      a.h(a1, (t1.j(this.K)).a.c, this.K);
      this.K = -9223372036854775807L;
    } 
    this.M = H();
    long l = this.m.n(a1, this, this.g.c(this.B));
    this.h.E(a.d(a1), 1, -1, null, 0, null, a.f(a1), this.G, l);
  }
  
  private boolean e0() {
    return (this.D || L());
  }
  
  public long A() {
    if (!this.E) {
      this.h.J();
      this.E = true;
    } 
    if (this.D && (this.N || H() > this.M)) {
      this.D = false;
      return this.J;
    } 
    return -9223372036854775807L;
  }
  
  public void B(u.a parama, long paramLong) {
    this.s = parama;
    this.o.d();
    d0();
  }
  
  public TrackGroupArray C() {
    return (J()).b;
  }
  
  public void D(long paramLong, boolean paramBoolean) {
    if (L())
      return; 
    boolean[] arrayOfBoolean = (J()).d;
    int m = this.v.length;
    for (byte b1 = 0; b1 < m; b1++)
      this.v[b1].l(paramLong, paramBoolean, arrayOfBoolean[b1]); 
  }
  
  v K() {
    return Y(new f(0, true));
  }
  
  boolean M(int paramInt) {
    boolean bool;
    if (!e0() && this.v[paramInt].z(this.N)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  void T() {
    this.m.k(this.g.c(this.B));
  }
  
  void U(int paramInt) {
    this.v[paramInt].B();
    T();
  }
  
  public void V(a parama, long paramLong1, long paramLong2, boolean paramBoolean) {
    this.h.v(a.d(parama), a.e(parama).b(), a.e(parama).c(), 1, -1, null, 0, null, a.f(parama), this.G, paramLong1, paramLong2, a.e(parama).a());
    if (!paramBoolean) {
      F(parama);
      a0[] arrayOfA0 = this.v;
      int m = arrayOfA0.length;
      for (byte b1 = 0; b1 < m; b1++)
        arrayOfA0[b1].J(); 
      if (this.F > 0)
        ((u.a<x>)com.google.android.exoplayer2.util.e.e(this.s)).d(this); 
    } 
  }
  
  public void W(a parama, long paramLong1, long paramLong2) {
    if (this.G == -9223372036854775807L) {
      t t1 = this.t;
      if (t1 != null) {
        boolean bool = t1.b();
        long l = I();
        if (l == Long.MIN_VALUE) {
          l = 0L;
        } else {
          l += 10000L;
        } 
        this.G = l;
        this.i.g(l, bool, this.I);
      } 
    } 
    this.h.y(a.d(parama), a.e(parama).b(), a.e(parama).c(), 1, -1, null, 0, null, a.f(parama), this.G, paramLong1, paramLong2, a.e(parama).a());
    F(parama);
    this.N = true;
    ((u.a<x>)com.google.android.exoplayer2.util.e.e(this.s)).d(this);
  }
  
  public Loader.c X(a parama, long paramLong1, long paramLong2, IOException paramIOException, int paramInt) {
    Loader.c c1;
    F(parama);
    long l = this.g.a(this.B, paramLong2, paramIOException, paramInt);
    if (l == -9223372036854775807L) {
      c1 = Loader.d;
    } else {
      boolean bool;
      paramInt = H();
      if (paramInt > this.M) {
        bool = true;
      } else {
        bool = false;
      } 
      if (E(parama, paramInt)) {
        c1 = Loader.g(bool, l);
      } else {
        c1 = Loader.c;
      } 
    } 
    this.h.B(a.d(parama), a.e(parama).b(), a.e(parama).c(), 1, -1, null, 0, null, a.f(parama), this.G, paramLong1, paramLong2, a.e(parama).a(), paramIOException, c1.c() ^ true);
    return c1;
  }
  
  int Z(int paramInt, f0 paramf0, com.google.android.exoplayer2.b1.e parame, boolean paramBoolean) {
    if (e0())
      return -3; 
    R(paramInt);
    int m = this.v[paramInt].F(paramf0, parame, paramBoolean, this.N, this.J);
    if (m == -3)
      S(paramInt); 
    return m;
  }
  
  public void a(t paramt) {
    t.b b1;
    if (this.u != null)
      b1 = new t.b(-9223372036854775807L); 
    this.t = (t)b1;
    this.r.post(this.p);
  }
  
  public void a0() {
    if (this.y) {
      a0[] arrayOfA0 = this.v;
      int m = arrayOfA0.length;
      for (byte b1 = 0; b1 < m; b1++)
        arrayOfA0[b1].E(); 
    } 
    this.m.m(this);
    this.r.removeCallbacksAndMessages(null);
    this.s = null;
    this.O = true;
    this.h.H();
  }
  
  public void b() {
    a0[] arrayOfA0 = this.v;
    int m = arrayOfA0.length;
    for (byte b1 = 0; b1 < m; b1++)
      arrayOfA0[b1].H(); 
    this.n.a();
  }
  
  int c0(int paramInt, long paramLong) {
    int m;
    if (e0())
      return 0; 
    R(paramInt);
    a0 a01 = this.v[paramInt];
    if (this.N && paramLong > a01.q()) {
      m = a01.f();
    } else {
      m = a01.e(paramLong);
    } 
    if (m == 0)
      S(paramInt); 
    return m;
  }
  
  public void d(Format paramFormat) {
    this.r.post(this.p);
  }
  
  public void f() {
    this.x = true;
    this.r.post(this.p);
  }
  
  public v g(int paramInt1, int paramInt2) {
    return Y(new f(paramInt1, false));
  }
  
  public boolean r() {
    boolean bool;
    if (this.m.i() && this.o.c()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public long s() {
    long l;
    if (this.F == 0) {
      l = Long.MIN_VALUE;
    } else {
      l = u();
    } 
    return l;
  }
  
  public boolean t(long paramLong) {
    if (this.N || this.m.h() || this.L || (this.y && this.F == 0))
      return false; 
    boolean bool = this.o.d();
    if (!this.m.i()) {
      d0();
      bool = true;
    } 
    return bool;
  }
  
  public long u() {
    boolean[] arrayOfBoolean = (J()).c;
    if (this.N)
      return Long.MIN_VALUE; 
    if (L())
      return this.K; 
    if (this.A) {
      int m = this.v.length;
      byte b1 = 0;
      long l = Long.MAX_VALUE;
      while (true) {
        l2 = l;
        if (b1 < m) {
          l2 = l;
          if (arrayOfBoolean[b1]) {
            l2 = l;
            if (!this.v[b1].y())
              l2 = Math.min(l, this.v[b1].q()); 
          } 
          b1++;
          l = l2;
          continue;
        } 
        break;
      } 
    } else {
      l2 = Long.MAX_VALUE;
    } 
    long l1 = l2;
    if (l2 == Long.MAX_VALUE)
      l1 = I(); 
    long l2 = l1;
    if (l1 == Long.MIN_VALUE)
      l2 = this.J; 
    return l2;
  }
  
  public void v(long paramLong) {}
  
  public long w(com.google.android.exoplayer2.trackselection.f[] paramArrayOff, boolean[] paramArrayOfboolean1, b0[] paramArrayOfb0, boolean[] paramArrayOfboolean2, long paramLong) {
    long l;
    d d1 = J();
    TrackGroupArray trackGroupArray = d1.b;
    boolean[] arrayOfBoolean = d1.d;
    int m = this.F;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    byte b1;
    for (b1 = 0; b1 < paramArrayOff.length; b1++) {
      if (paramArrayOfb0[b1] != null && (paramArrayOff[b1] == null || !paramArrayOfboolean1[b1])) {
        int n = e.d((e)paramArrayOfb0[b1]);
        com.google.android.exoplayer2.util.e.f(arrayOfBoolean[n]);
        this.F--;
        arrayOfBoolean[n] = false;
        paramArrayOfb0[b1] = null;
      } 
    } 
    if (this.C ? (m == 0) : (paramLong != 0L)) {
      b1 = 1;
    } else {
      b1 = 0;
    } 
    m = 0;
    byte b2;
    for (b2 = b1; m < paramArrayOff.length; b2 = b1) {
      b1 = b2;
      if (paramArrayOfb0[m] == null) {
        b1 = b2;
        if (paramArrayOff[m] != null) {
          boolean bool;
          com.google.android.exoplayer2.trackselection.f f1 = paramArrayOff[m];
          if (f1.length() == 1) {
            bool = true;
          } else {
            bool = false;
          } 
          com.google.android.exoplayer2.util.e.f(bool);
          if (f1.f(0) == 0) {
            bool = true;
          } else {
            bool = false;
          } 
          com.google.android.exoplayer2.util.e.f(bool);
          int n = trackGroupArray.b(f1.a());
          com.google.android.exoplayer2.util.e.f(arrayOfBoolean[n] ^ true);
          this.F++;
          arrayOfBoolean[n] = true;
          paramArrayOfb0[m] = new e(this, n);
          paramArrayOfboolean2[m] = true;
          b1 = b2;
          if (b2 == 0) {
            a0 a01 = this.v[n];
            if (!a01.M(paramLong, true) && a01.s() != 0) {
              b1 = 1;
            } else {
              b1 = 0;
            } 
          } 
        } 
      } 
      m++;
    } 
    if (this.F == 0) {
      this.L = false;
      this.D = false;
      if (this.m.i()) {
        a0[] arrayOfA0 = this.v;
        m = arrayOfA0.length;
        for (b1 = bool3; b1 < m; b1++)
          arrayOfA0[b1].m(); 
        this.m.e();
        l = paramLong;
      } else {
        a0[] arrayOfA0 = this.v;
        m = arrayOfA0.length;
        b1 = bool1;
        while (true) {
          l = paramLong;
          if (b1 < m) {
            arrayOfA0[b1].J();
            b1++;
            continue;
          } 
          break;
        } 
      } 
    } else {
      l = paramLong;
      if (b2 != 0) {
        paramLong = y(paramLong);
        b1 = bool2;
        while (true) {
          l = paramLong;
          if (b1 < paramArrayOfb0.length) {
            if (paramArrayOfb0[b1] != null)
              paramArrayOfboolean2[b1] = true; 
            b1++;
            continue;
          } 
          break;
        } 
      } 
    } 
    this.C = true;
    return l;
  }
  
  public void x() {
    T();
    if (!this.N || this.y)
      return; 
    throw new ParserException("Loading finished before preparation is complete.");
  }
  
  public long y(long paramLong) {
    d d1 = J();
    t t1 = d1.a;
    boolean[] arrayOfBoolean = d1.c;
    if (!t1.b())
      paramLong = 0L; 
    byte b1 = 0;
    this.D = false;
    this.J = paramLong;
    if (L()) {
      this.K = paramLong;
      return paramLong;
    } 
    if (this.B != 7 && b0(arrayOfBoolean, paramLong))
      return paramLong; 
    this.L = false;
    this.K = paramLong;
    this.N = false;
    if (this.m.i()) {
      this.m.e();
    } else {
      this.m.f();
      a0[] arrayOfA0 = this.v;
      int m = arrayOfA0.length;
      while (b1 < m) {
        arrayOfA0[b1].J();
        b1++;
      } 
    } 
    return paramLong;
  }
  
  public long z(long paramLong, w0 paramw0) {
    t t1 = (J()).a;
    if (!t1.b())
      return 0L; 
    t.a a1 = t1.j(paramLong);
    return h0.k0(paramLong, paramw0, a1.a.b, a1.b.b);
  }
  
  final class a implements Loader.e, t.a {
    private final Uri a;
    
    private final w b;
    
    private final x.b c;
    
    private final j d;
    
    private final i e;
    
    private final s f;
    
    private volatile boolean g;
    
    private boolean h;
    
    private long i;
    
    private l j;
    
    private long k;
    
    private v l;
    
    private boolean m;
    
    public a(x this$0, Uri param1Uri, j param1j, x.b param1b, j param1j1, i param1i) {
      this.a = param1Uri;
      this.b = new w(param1j);
      this.c = param1b;
      this.d = param1j1;
      this.e = param1i;
      this.f = new s();
      this.h = true;
      this.k = -1L;
      this.j = i(0L);
    }
    
    private l i(long param1Long) {
      return new l(this.a, param1Long, -1L, x.j(this.n), 6, x.k());
    }
    
    private void j(long param1Long1, long param1Long2) {
      this.f.a = param1Long1;
      this.i = param1Long2;
      this.h = true;
      this.m = false;
    }
    
    public void a() {
      this.g = true;
    }
    
    public void b() {
      int k = 0;
      while (!k && !this.g) {
        Exception exception;
        com.google.android.exoplayer2.c1.e e1 = null;
        try {
          t t;
          long l1 = this.f.a;
          l l2 = i(l1);
          this.j = l2;
          long l3 = this.b.g0(l2);
          this.k = l3;
          if (l3 != -1L)
            this.k = l3 + l1; 
          Uri uri = (Uri)com.google.android.exoplayer2.util.e.e(this.b.e0());
          x.m(this.n, IcyHeaders.a(this.b.getResponseHeaders()));
          w w2 = this.b;
          w w1 = w2;
          if (x.l(this.n) != null) {
            w1 = w2;
            if ((x.l(this.n)).g != -1) {
              t = new t();
              this((j)this.b, (x.l(this.n)).g, this);
              v v1 = this.n.K();
              this.l = v1;
              v1.d(x.o());
            } 
          } 
          com.google.android.exoplayer2.c1.e e2 = new com.google.android.exoplayer2.c1.e();
          this(t, l1, this.k);
          int m = k;
          try {
            h h = this.c.b((i)e2, this.d, uri);
            m = k;
            if (x.l(this.n) != null) {
              m = k;
              if (h instanceof com.google.android.exoplayer2.c1.b0.e) {
                m = k;
                ((com.google.android.exoplayer2.c1.b0.e)h).b();
              } 
            } 
            int n = k;
            l3 = l1;
            m = k;
            if (this.h) {
              m = k;
              h.i(l1, this.i);
              m = k;
              this.h = false;
              l3 = l1;
              n = k;
            } 
            while (!n) {
              m = n;
              if (!this.g) {
                m = n;
                this.e.a();
                m = n;
                k = h.g((i)e2, this.f);
                n = k;
                m = k;
                if (e2.a() > x.p(this.n) + l3) {
                  m = k;
                  l3 = e2.a();
                  m = k;
                  this.e.b();
                  m = k;
                  x.h(this.n).post(x.q(this.n));
                  n = k;
                } 
              } 
            } 
            continue;
          } finally {
            t = null;
            e1 = e2;
          } 
        } finally {}
        if (k != 1 && e1 != null)
          this.f.a = e1.a(); 
        h0.j((j)this.b);
        throw exception;
      } 
    }
    
    public void c(v param1v) {
      long l1;
      if (!this.m) {
        l1 = this.i;
      } else {
        l1 = Math.max(x.i(this.n), this.i);
      } 
      int k = param1v.a();
      v v1 = (v)com.google.android.exoplayer2.util.e.e(this.l);
      v1.b(param1v, k);
      v1.c(l1, 1, k, 0, null);
      this.m = true;
    }
  }
  
  private static final class b {
    private final h[] a;
    
    private h b;
    
    public b(h[] param1ArrayOfh) {
      this.a = param1ArrayOfh;
    }
    
    public void a() {
      h h1 = this.b;
      if (h1 != null) {
        h1.a();
        this.b = null;
      } 
    }
    
    public h b(i param1i, j param1j, Uri param1Uri) {
      h h1 = this.b;
      if (h1 != null)
        return h1; 
      h[] arrayOfH = this.a;
      int k = arrayOfH.length;
      byte b1 = 0;
      if (k == 1) {
        this.b = arrayOfH[0];
      } else {
        k = arrayOfH.length;
        while (true) {
          if (b1 < k) {
            UnrecognizedInputFormatException unrecognizedInputFormatException;
            h h2 = arrayOfH[b1];
            try {
              if (h2.e(param1i)) {
                this.b = h2;
                param1i.h();
              } else {
                continue;
              } 
              if (this.b == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("None of the available extractors (");
                stringBuilder.append(h0.z((Object[])this.a));
                stringBuilder.append(") could read the stream.");
                unrecognizedInputFormatException = new UnrecognizedInputFormatException(stringBuilder.toString(), param1Uri);
                throw unrecognizedInputFormatException;
              } 
              return this.b;
            } catch (EOFException eOFException) {
              continue;
            } finally {
              unrecognizedInputFormatException.h();
            } 
          } 
          if (this.b == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("None of the available extractors (");
            stringBuilder.append(h0.z((Object[])this.a));
            stringBuilder.append(") could read the stream.");
            UnrecognizedInputFormatException unrecognizedInputFormatException = new UnrecognizedInputFormatException(stringBuilder.toString(), param1Uri);
            throw unrecognizedInputFormatException;
          } 
          this.b.h(param1j);
          return this.b;
          param1i.h();
          b1++;
        } 
      } 
      this.b.h(param1j);
      return this.b;
    }
  }
  
  static interface c {
    void g(long param1Long, boolean param1Boolean1, boolean param1Boolean2);
  }
  
  private static final class d {
    public final t a;
    
    public final TrackGroupArray b;
    
    public final boolean[] c;
    
    public final boolean[] d;
    
    public final boolean[] e;
    
    public d(t param1t, TrackGroupArray param1TrackGroupArray, boolean[] param1ArrayOfboolean) {
      this.a = param1t;
      this.b = param1TrackGroupArray;
      this.c = param1ArrayOfboolean;
      int i = param1TrackGroupArray.c;
      this.d = new boolean[i];
      this.e = new boolean[i];
    }
  }
  
  private final class e implements b0 {
    private final int a;
    
    public e(x this$0, int param1Int) {
      this.a = param1Int;
    }
    
    public int a(f0 param1f0, com.google.android.exoplayer2.b1.e param1e, boolean param1Boolean) {
      return this.b.Z(this.a, param1f0, param1e, param1Boolean);
    }
    
    public void b() {
      this.b.U(this.a);
    }
    
    public int c(long param1Long) {
      return this.b.c0(this.a, param1Long);
    }
    
    public boolean m() {
      return this.b.M(this.a);
    }
  }
  
  private static final class f {
    public final int a;
    
    public final boolean b;
    
    public f(int param1Int, boolean param1Boolean) {
      this.a = param1Int;
      this.b = param1Boolean;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (param1Object == null || f.class != param1Object.getClass())
        return false; 
      param1Object = param1Object;
      if (this.a != ((f)param1Object).a || this.b != ((f)param1Object).b)
        bool = false; 
      return bool;
    }
    
    public int hashCode() {
      return this.a * 31 + this.b;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */