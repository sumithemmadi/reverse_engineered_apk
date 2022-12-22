package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.u;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.trackselection.f;
import com.google.android.exoplayer2.trackselection.h;
import com.google.android.exoplayer2.trackselection.i;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.f;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.n;
import com.google.android.exoplayer2.util.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

final class d0 implements Handler.Callback, u.a, h.a, v.b, z.a, p0.a {
  private boolean A;
  
  private int B;
  
  private boolean C;
  
  private boolean D;
  
  private int E;
  
  private e F;
  
  private long G;
  
  private int H;
  
  private boolean I;
  
  private final r0[] b;
  
  private final t0[] c;
  
  private final h d;
  
  private final i e;
  
  private final g0 f;
  
  private final f g;
  
  private final n h;
  
  private final HandlerThread i;
  
  private final Handler j;
  
  private final y0.c k;
  
  private final y0.b l;
  
  private final long m;
  
  private final boolean n;
  
  private final z o;
  
  private final d p;
  
  private final ArrayList<c> q;
  
  private final f r;
  
  private final j0 s;
  
  private w0 t;
  
  private k0 u;
  
  private v v;
  
  private r0[] w;
  
  private boolean x;
  
  private boolean y;
  
  private boolean z;
  
  public d0(r0[] paramArrayOfr0, h paramh, i parami, g0 paramg0, f paramf, boolean paramBoolean1, int paramInt, boolean paramBoolean2, Handler paramHandler, f paramf1) {
    this.b = paramArrayOfr0;
    this.d = paramh;
    this.e = parami;
    this.f = paramg0;
    this.g = paramf;
    this.y = paramBoolean1;
    this.B = paramInt;
    this.C = paramBoolean2;
    this.j = paramHandler;
    this.r = paramf1;
    this.s = new j0();
    this.m = paramg0.d();
    this.n = paramg0.c();
    this.t = w0.e;
    this.u = k0.h(-9223372036854775807L, parami);
    this.p = new d(null);
    this.c = new t0[paramArrayOfr0.length];
    for (paramInt = 0; paramInt < paramArrayOfr0.length; paramInt++) {
      paramArrayOfr0[paramInt].q(paramInt);
      this.c[paramInt] = paramArrayOfr0[paramInt].v();
    } 
    this.o = new z(this, paramf1);
    this.q = new ArrayList<c>();
    this.w = new r0[0];
    this.k = new y0.c();
    this.l = new y0.b();
    paramh.b(this, paramf);
    HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
    this.i = handlerThread;
    handlerThread.start();
    this.h = paramf1.d(handlerThread.getLooper(), this);
    this.I = true;
  }
  
  private boolean A() {
    h0 h0 = this.s.o();
    if (!h0.d)
      return false; 
    byte b1 = 0;
    while (true) {
      r0[] arrayOfR0 = this.b;
      if (b1 < arrayOfR0.length) {
        r0 r01 = arrayOfR0[b1];
        b0 b0 = h0.c[b1];
        if (r01.r() == b0) {
          if (b0 != null && !r01.s())
            continue; 
          b1++;
          continue;
        } 
        return false;
      } 
      return true;
    } 
  }
  
  private void A0() {
    this.o.g();
    r0[] arrayOfR0 = this.w;
    int j = arrayOfR0.length;
    for (byte b1 = 0; b1 < j; b1++)
      m(arrayOfR0[b1]); 
  }
  
  private boolean B() {
    h0 h0 = this.s.i();
    return (h0 == null) ? false : (!(h0.k() == Long.MIN_VALUE));
  }
  
  private void B0() {
    boolean bool;
    h0 h0 = this.s.i();
    if (this.A || (h0 != null && h0.a.r())) {
      bool = true;
    } else {
      bool = false;
    } 
    k0 k01 = this.u;
    if (bool != k01.h)
      this.u = k01.a(bool); 
  }
  
  private boolean C() {
    boolean bool;
    h0 h0 = this.s.n();
    long l = h0.f.e;
    if (h0.d && (l == -9223372036854775807L || this.u.n < l)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void C0(TrackGroupArray paramTrackGroupArray, i parami) {
    this.f.g(this.b, paramTrackGroupArray, parami.c);
  }
  
  private void D0() {
    v v1 = this.v;
    if (v1 == null)
      return; 
    if (this.E > 0) {
      v1.h();
      return;
    } 
    J();
    L();
    K();
  }
  
  private void E0() {
    k0 k01;
    long l;
    h0 h02 = this.s.n();
    if (h02 == null)
      return; 
    if (h02.d) {
      l = h02.a.A();
    } else {
      l = -9223372036854775807L;
    } 
    if (l != -9223372036854775807L) {
      U(l);
      if (l != this.u.n) {
        k01 = this.u;
        this.u = g(k01.c, l, k01.e);
        this.p.g(4);
      } 
    } else {
      boolean bool;
      z z1 = this.o;
      if (k01 != this.s.o()) {
        bool = true;
      } else {
        bool = false;
      } 
      l = z1.h(bool);
      this.G = l;
      l = k01.y(l);
      I(this.u.n, l);
      this.u.n = l;
    } 
    h0 h01 = this.s.i();
    this.u.l = h01.i();
    this.u.m = s();
  }
  
  private void F() {
    boolean bool = w0();
    this.A = bool;
    if (bool)
      this.s.i().d(this.G); 
    B0();
  }
  
  private void F0(h0 paramh0) {
    h0 h01 = this.s.n();
    if (h01 != null && paramh0 != h01) {
      boolean[] arrayOfBoolean = new boolean[this.b.length];
      byte b1 = 0;
      int j = 0;
      while (true) {
        r0[] arrayOfR0 = this.b;
        if (b1 < arrayOfR0.length) {
          boolean bool;
          r0 r01 = arrayOfR0[b1];
          if (r01.getState() != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          arrayOfBoolean[b1] = bool;
          int k = j;
          if (h01.o().c(b1))
            k = j + 1; 
          if (arrayOfBoolean[b1] && (!h01.o().c(b1) || (r01.B() && r01.r() == paramh0.c[b1])))
            i(r01); 
          b1++;
          j = k;
          continue;
        } 
        this.u = this.u.g(h01.n(), h01.o());
        l(arrayOfBoolean, j);
        break;
      } 
    } 
  }
  
  private void G() {
    if (this.p.d(this.u)) {
      byte b1;
      Handler handler = this.j;
      int j = d.a(this.p);
      if (d.b(this.p)) {
        b1 = d.c(this.p);
      } else {
        b1 = -1;
      } 
      handler.obtainMessage(0, j, b1, this.u).sendToTarget();
      this.p.f(this.u);
    } 
  }
  
  private void G0(float paramFloat) {
    for (h0 h0 = this.s.n(); h0 != null; h0 = h0.j()) {
      for (f f1 : (h0.o()).c.b()) {
        if (f1 != null)
          f1.k(paramFloat); 
      } 
    } 
  }
  
  private void H() {
    if (this.s.i() != null) {
      r0[] arrayOfR0 = this.w;
      int j = arrayOfR0.length;
      for (byte b1 = 0; b1 < j; b1++) {
        if (!arrayOfR0[b1].s())
          return; 
      } 
    } 
    this.v.h();
  }
  
  private void I(long paramLong1, long paramLong2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield q : Ljava/util/ArrayList;
    //   4: invokevirtual isEmpty : ()Z
    //   7: ifne -> 546
    //   10: aload_0
    //   11: getfield u : Lcom/google/android/exoplayer2/k0;
    //   14: getfield c : Lcom/google/android/exoplayer2/source/v$a;
    //   17: invokevirtual a : ()Z
    //   20: ifeq -> 26
    //   23: goto -> 546
    //   26: aload_0
    //   27: getfield u : Lcom/google/android/exoplayer2/k0;
    //   30: astore #5
    //   32: lload_1
    //   33: lstore #6
    //   35: aload #5
    //   37: getfield d : J
    //   40: lload_1
    //   41: lcmp
    //   42: ifne -> 60
    //   45: lload_1
    //   46: lstore #6
    //   48: aload_0
    //   49: getfield I : Z
    //   52: ifeq -> 60
    //   55: lload_1
    //   56: lconst_1
    //   57: lsub
    //   58: lstore #6
    //   60: aload_0
    //   61: iconst_0
    //   62: putfield I : Z
    //   65: aload #5
    //   67: getfield b : Lcom/google/android/exoplayer2/y0;
    //   70: aload #5
    //   72: getfield c : Lcom/google/android/exoplayer2/source/v$a;
    //   75: getfield a : Ljava/lang/Object;
    //   78: invokevirtual b : (Ljava/lang/Object;)I
    //   81: istore #8
    //   83: aload_0
    //   84: getfield H : I
    //   87: istore #9
    //   89: lload #6
    //   91: lstore_1
    //   92: iload #9
    //   94: ifle -> 116
    //   97: aload_0
    //   98: getfield q : Ljava/util/ArrayList;
    //   101: iload #9
    //   103: iconst_1
    //   104: isub
    //   105: invokevirtual get : (I)Ljava/lang/Object;
    //   108: checkcast com/google/android/exoplayer2/d0$c
    //   111: astore #5
    //   113: goto -> 122
    //   116: aconst_null
    //   117: astore #5
    //   119: lload_1
    //   120: lstore #6
    //   122: aload #5
    //   124: ifnull -> 200
    //   127: aload #5
    //   129: getfield c : I
    //   132: istore #9
    //   134: iload #9
    //   136: iload #8
    //   138: if_icmpgt -> 159
    //   141: iload #9
    //   143: iload #8
    //   145: if_icmpne -> 200
    //   148: aload #5
    //   150: getfield d : J
    //   153: lload #6
    //   155: lcmp
    //   156: ifle -> 200
    //   159: aload_0
    //   160: getfield H : I
    //   163: iconst_1
    //   164: isub
    //   165: istore #9
    //   167: aload_0
    //   168: iload #9
    //   170: putfield H : I
    //   173: lload #6
    //   175: lstore_1
    //   176: iload #9
    //   178: ifle -> 116
    //   181: aload_0
    //   182: getfield q : Ljava/util/ArrayList;
    //   185: iload #9
    //   187: iconst_1
    //   188: isub
    //   189: invokevirtual get : (I)Ljava/lang/Object;
    //   192: checkcast com/google/android/exoplayer2/d0$c
    //   195: astore #5
    //   197: goto -> 122
    //   200: lload #6
    //   202: lstore_1
    //   203: aload_0
    //   204: getfield H : I
    //   207: aload_0
    //   208: getfield q : Ljava/util/ArrayList;
    //   211: invokevirtual size : ()I
    //   214: if_icmpge -> 236
    //   217: aload_0
    //   218: getfield q : Ljava/util/ArrayList;
    //   221: aload_0
    //   222: getfield H : I
    //   225: invokevirtual get : (I)Ljava/lang/Object;
    //   228: checkcast com/google/android/exoplayer2/d0$c
    //   231: astore #5
    //   233: goto -> 242
    //   236: aconst_null
    //   237: astore #5
    //   239: lload_1
    //   240: lstore #6
    //   242: aload #5
    //   244: astore #10
    //   246: aload #5
    //   248: ifnull -> 351
    //   251: aload #5
    //   253: astore #10
    //   255: aload #5
    //   257: getfield e : Ljava/lang/Object;
    //   260: ifnull -> 351
    //   263: aload #5
    //   265: getfield c : I
    //   268: istore #9
    //   270: iload #9
    //   272: iload #8
    //   274: if_icmplt -> 303
    //   277: aload #5
    //   279: astore #10
    //   281: iload #9
    //   283: iload #8
    //   285: if_icmpne -> 351
    //   288: aload #5
    //   290: astore #10
    //   292: aload #5
    //   294: getfield d : J
    //   297: lload #6
    //   299: lcmp
    //   300: ifgt -> 351
    //   303: aload_0
    //   304: getfield H : I
    //   307: iconst_1
    //   308: iadd
    //   309: istore #9
    //   311: aload_0
    //   312: iload #9
    //   314: putfield H : I
    //   317: lload #6
    //   319: lstore_1
    //   320: iload #9
    //   322: aload_0
    //   323: getfield q : Ljava/util/ArrayList;
    //   326: invokevirtual size : ()I
    //   329: if_icmpge -> 236
    //   332: aload_0
    //   333: getfield q : Ljava/util/ArrayList;
    //   336: aload_0
    //   337: getfield H : I
    //   340: invokevirtual get : (I)Ljava/lang/Object;
    //   343: checkcast com/google/android/exoplayer2/d0$c
    //   346: astore #5
    //   348: goto -> 242
    //   351: aload #10
    //   353: ifnull -> 546
    //   356: aload #10
    //   358: getfield e : Ljava/lang/Object;
    //   361: ifnull -> 546
    //   364: aload #10
    //   366: getfield c : I
    //   369: iload #8
    //   371: if_icmpne -> 546
    //   374: aload #10
    //   376: getfield d : J
    //   379: lstore_1
    //   380: lload_1
    //   381: lload #6
    //   383: lcmp
    //   384: ifle -> 546
    //   387: lload_1
    //   388: lload_3
    //   389: lcmp
    //   390: ifgt -> 546
    //   393: aload_0
    //   394: aload #10
    //   396: getfield b : Lcom/google/android/exoplayer2/p0;
    //   399: invokespecial g0 : (Lcom/google/android/exoplayer2/p0;)V
    //   402: aload #10
    //   404: getfield b : Lcom/google/android/exoplayer2/p0;
    //   407: invokevirtual b : ()Z
    //   410: ifne -> 440
    //   413: aload #10
    //   415: getfield b : Lcom/google/android/exoplayer2/p0;
    //   418: invokevirtual j : ()Z
    //   421: ifeq -> 427
    //   424: goto -> 440
    //   427: aload_0
    //   428: aload_0
    //   429: getfield H : I
    //   432: iconst_1
    //   433: iadd
    //   434: putfield H : I
    //   437: goto -> 452
    //   440: aload_0
    //   441: getfield q : Ljava/util/ArrayList;
    //   444: aload_0
    //   445: getfield H : I
    //   448: invokevirtual remove : (I)Ljava/lang/Object;
    //   451: pop
    //   452: aload_0
    //   453: getfield H : I
    //   456: aload_0
    //   457: getfield q : Ljava/util/ArrayList;
    //   460: invokevirtual size : ()I
    //   463: if_icmpge -> 485
    //   466: aload_0
    //   467: getfield q : Ljava/util/ArrayList;
    //   470: aload_0
    //   471: getfield H : I
    //   474: invokevirtual get : (I)Ljava/lang/Object;
    //   477: checkcast com/google/android/exoplayer2/d0$c
    //   480: astore #10
    //   482: goto -> 351
    //   485: aconst_null
    //   486: astore #10
    //   488: goto -> 351
    //   491: astore #5
    //   493: aload #10
    //   495: getfield b : Lcom/google/android/exoplayer2/p0;
    //   498: invokevirtual b : ()Z
    //   501: ifne -> 531
    //   504: aload #10
    //   506: getfield b : Lcom/google/android/exoplayer2/p0;
    //   509: invokevirtual j : ()Z
    //   512: ifeq -> 518
    //   515: goto -> 531
    //   518: aload_0
    //   519: aload_0
    //   520: getfield H : I
    //   523: iconst_1
    //   524: iadd
    //   525: putfield H : I
    //   528: goto -> 543
    //   531: aload_0
    //   532: getfield q : Ljava/util/ArrayList;
    //   535: aload_0
    //   536: getfield H : I
    //   539: invokevirtual remove : (I)Ljava/lang/Object;
    //   542: pop
    //   543: aload #5
    //   545: athrow
    //   546: return
    // Exception table:
    //   from	to	target	type
    //   393	402	491	finally
  }
  
  private void J() {
    this.s.t(this.G);
    if (this.s.z()) {
      i0 i0 = this.s.m(this.G, this.u);
      if (i0 == null) {
        H();
      } else {
        h0 h0 = this.s.f(this.c, this.d, this.f.i(), this.v, i0, this.e);
        h0.a.B(this, i0.b);
        if (this.s.n() == h0)
          U(h0.m()); 
        v(false);
      } 
    } 
    if (this.A) {
      this.A = B();
      B0();
    } else {
      F();
    } 
  }
  
  private void K() {
    for (byte b1 = 0; v0(); b1 = 1) {
      if (b1)
        G(); 
      h0 h01 = this.s.n();
      if (h01 == this.s.o())
        j0(); 
      h0 h02 = this.s.a();
      F0(h01);
      i0 i0 = h02.f;
      this.u = g(i0.a, i0.b, i0.c);
      if (h01.f.f) {
        b1 = 0;
      } else {
        b1 = 3;
      } 
      this.p.g(b1);
      E0();
    } 
  }
  
  private void L() {
    h0 h01 = this.s.o();
    if (h01 == null)
      return; 
    h0 h02 = h01.j();
    byte b1 = 0;
    if (h02 == null) {
      if (h01.f.g)
        while (true) {
          r0[] arrayOfR0 = this.b;
          if (b1 < arrayOfR0.length) {
            r0 r01 = arrayOfR0[b1];
            b0 b0 = h01.c[b1];
            if (b0 != null && r01.r() == b0 && r01.s())
              r01.u(); 
            b1++;
            continue;
          } 
          break;
        }  
      return;
    } 
    if (!A())
      return; 
    if (!(h01.j()).d)
      return; 
    i i1 = h01.o();
    h02 = this.s.b();
    i i2 = h02.o();
    if (h02.a.A() != -9223372036854775807L) {
      j0();
      return;
    } 
    b1 = 0;
    while (true) {
      r0[] arrayOfR0 = this.b;
      if (b1 < arrayOfR0.length) {
        r0 r01 = arrayOfR0[b1];
        if (i1.c(b1) && !r01.B()) {
          boolean bool1;
          f f1 = i2.c.a(b1);
          boolean bool = i2.c(b1);
          if (this.c[b1].n() == 6) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          u0 u01 = i1.b[b1];
          u0 u02 = i2.b[b1];
          if (bool && u02.equals(u01) && !bool1) {
            r01.D(o(f1), h02.c[b1], h02.l());
          } else {
            r01.u();
          } 
        } 
        b1++;
        continue;
      } 
      break;
    } 
  }
  
  private void M() {
    for (h0 h0 = this.s.n(); h0 != null; h0 = h0.j()) {
      for (f f1 : (h0.o()).c.b()) {
        if (f1 != null)
          f1.m(); 
      } 
    } 
  }
  
  private void P(v paramv, boolean paramBoolean1, boolean paramBoolean2) {
    this.E++;
    T(false, true, paramBoolean1, paramBoolean2, true);
    this.f.a();
    this.v = paramv;
    u0(2);
    paramv.j(this, this.g.c());
    this.h.b(2);
  }
  
  private void R() {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: iconst_1
    //   3: iconst_1
    //   4: iconst_1
    //   5: iconst_0
    //   6: invokespecial T : (ZZZZZ)V
    //   9: aload_0
    //   10: getfield f : Lcom/google/android/exoplayer2/g0;
    //   13: invokeinterface h : ()V
    //   18: aload_0
    //   19: iconst_1
    //   20: invokespecial u0 : (I)V
    //   23: aload_0
    //   24: getfield i : Landroid/os/HandlerThread;
    //   27: invokevirtual quit : ()Z
    //   30: pop
    //   31: aload_0
    //   32: monitorenter
    //   33: aload_0
    //   34: iconst_1
    //   35: putfield x : Z
    //   38: aload_0
    //   39: invokevirtual notifyAll : ()V
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: astore_1
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_1
    //   49: athrow
    // Exception table:
    //   from	to	target	type
    //   33	44	45	finally
    //   46	48	45	finally
  }
  
  private void S() {
    float f1 = (this.o.W()).b;
    h0 h01 = this.s.n();
    h0 h02 = this.s.o();
    byte b1 = 1;
    while (h01 != null && h01.d) {
      boolean[] arrayOfBoolean;
      i i1 = h01.v(f1, this.u.b);
      if (!i1.a(h01.o())) {
        boolean[] arrayOfBoolean1;
        if (b1) {
          h01 = this.s.n();
          boolean bool = this.s.u(h01);
          arrayOfBoolean = new boolean[this.b.length];
          long l = h01.b(i1, this.u.n, bool, arrayOfBoolean);
          k0 k01 = this.u;
          if (k01.f != 4 && l != k01.n) {
            k01 = this.u;
            this.u = g(k01.c, l, k01.e);
            this.p.g(4);
            U(l);
          } 
          arrayOfBoolean1 = new boolean[this.b.length];
          b1 = 0;
          int j = 0;
          while (true) {
            r0[] arrayOfR0 = this.b;
            if (b1 < arrayOfR0.length) {
              r0 r01 = arrayOfR0[b1];
              if (r01.getState() != 0) {
                bool = true;
              } else {
                bool = false;
              } 
              arrayOfBoolean1[b1] = bool;
              b0 b0 = h01.c[b1];
              int k = j;
              if (b0 != null)
                k = j + 1; 
              if (arrayOfBoolean1[b1])
                if (b0 != r01.r()) {
                  i(r01);
                } else if (arrayOfBoolean[b1]) {
                  r01.A(this.G);
                }  
              b1++;
              j = k;
              continue;
            } 
            this.u = this.u.g(h01.n(), h01.o());
            l(arrayOfBoolean1, j);
            v(true);
            if (this.u.f != 4) {
              F();
              E0();
              this.h.b(2);
            } 
            return;
          } 
        } 
        this.s.u(h01);
        if (h01.d) {
          h01.a((i)arrayOfBoolean1, Math.max(h01.f.b, h01.y(this.G)), false);
          continue;
        } 
        continue;
      } 
      if (h01 == arrayOfBoolean)
        b1 = 0; 
      h01 = h01.j();
    } 
  }
  
  private void T(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5) {
    y0 y0;
    v.a a1;
    long l1;
    long l2;
    i i1;
    ExoPlaybackException exoPlaybackException;
    TrackGroupArray trackGroupArray;
    this.h.e(2);
    this.z = false;
    this.o.g();
    this.G = 0L;
    for (r0 r01 : this.w) {
      try {
        i(r01);
      } catch (ExoPlaybackException exoPlaybackException1) {
        o.d("ExoPlayerImplInternal", "Disable failed.", exoPlaybackException1);
      } catch (RuntimeException runtimeException) {}
    } 
    if (paramBoolean1)
      for (r0 r01 : this.b) {
        try {
          r01.a();
        } catch (RuntimeException runtimeException) {
          o.d("ExoPlayerImplInternal", "Reset failed.", runtimeException);
        } 
      }  
    this.w = new r0[0];
    if (paramBoolean3) {
      this.F = null;
    } else if (paramBoolean4) {
      if (this.F == null && !this.u.b.q()) {
        k0 k02 = this.u;
        k02.b.h(k02.c.a, this.l);
        l1 = this.u.n;
        l2 = this.l.l();
        this.F = new e(y0.a, this.l.c, l1 + l2);
      } 
      paramBoolean3 = true;
    } 
    this.s.e(paramBoolean4 ^ true);
    this.A = false;
    if (paramBoolean4) {
      this.s.y(y0.a);
      Iterator<c> iterator = this.q.iterator();
      while (iterator.hasNext())
        ((c)iterator.next()).b.k(false); 
      this.q.clear();
      this.H = 0;
    } 
    if (paramBoolean3) {
      a1 = this.u.i(this.C, this.k, this.l);
    } else {
      a1 = this.u.c;
    } 
    if (paramBoolean3) {
      l2 = -9223372036854775807L;
    } else {
      l2 = this.u.n;
    } 
    if (paramBoolean3) {
      l1 = -9223372036854775807L;
    } else {
      l1 = this.u.e;
    } 
    if (paramBoolean4) {
      y0 = y0.a;
    } else {
      y0 = this.u.b;
    } 
    k0 k01 = this.u;
    int j = k01.f;
    if (paramBoolean5) {
      exoPlaybackException = null;
    } else {
      exoPlaybackException = k01.g;
    } 
    if (paramBoolean4) {
      trackGroupArray = TrackGroupArray.b;
    } else {
      trackGroupArray = k01.i;
    } 
    if (paramBoolean4) {
      i1 = this.e;
    } else {
      i1 = ((k0)i1).j;
    } 
    this.u = new k0(y0, a1, l2, l1, j, exoPlaybackException, false, trackGroupArray, i1, a1, l2, 0L, l2);
    if (paramBoolean2) {
      v v1 = this.v;
      if (v1 != null) {
        v1.b(this);
        this.v = null;
      } 
    } 
  }
  
  private void U(long paramLong) {
    h0 h0 = this.s.n();
    if (h0 != null)
      paramLong = h0.z(paramLong); 
    this.G = paramLong;
    this.o.d(paramLong);
    r0[] arrayOfR0 = this.w;
    int j = arrayOfR0.length;
    for (byte b1 = 0; b1 < j; b1++)
      arrayOfR0[b1].A(this.G); 
    M();
  }
  
  private boolean V(c paramc) {
    Object<Object, Long> object = (Object<Object, Long>)paramc.e;
    if (object == null) {
      object = (Object<Object, Long>)X(new e(paramc.b.g(), paramc.b.i(), v.a(paramc.b.e())), false);
      if (object == null)
        return false; 
      paramc.e(this.u.b.b(((Pair)object).first), ((Long)((Pair)object).second).longValue(), ((Pair)object).first);
    } else {
      int j = this.u.b.b(object);
      if (j == -1)
        return false; 
      paramc.c = j;
    } 
    return true;
  }
  
  private void W() {
    for (int j = this.q.size() - 1; j >= 0; j--) {
      if (!V(this.q.get(j))) {
        ((c)this.q.get(j)).b.k(false);
        this.q.remove(j);
      } 
    } 
    Collections.sort(this.q);
  }
  
  private Pair<Object, Long> X(e parame, boolean paramBoolean) {
    y0 y01 = this.u.b;
    y0 y02 = parame.a;
    if (y01.q())
      return null; 
    y0 y03 = y02;
    if (y02.q())
      y03 = y01; 
    try {
      Pair<Object, Long> pair = y03.j(this.k, this.l, parame.b, parame.c);
      if (y01 == y03)
        return pair; 
      if (y01.b(pair.first) != -1)
        return pair; 
      if (paramBoolean) {
        Object object = Y(pair.first, y03, y01);
        if (object != null)
          return q(y01, (y01.h(object, this.l)).c, -9223372036854775807L); 
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
    return null;
  }
  
  private Object Y(Object paramObject, y0 paramy01, y0 paramy02) {
    int j = paramy01.b(paramObject);
    int k = paramy01.i();
    byte b1 = 0;
    int m = -1;
    while (b1 < k && m == -1) {
      j = paramy01.d(j, this.l, this.k, this.B, this.C);
      if (j == -1)
        break; 
      m = paramy02.b(paramy01.m(j));
      b1++;
    } 
    if (m == -1) {
      paramObject = null;
    } else {
      paramObject = paramy02.m(m);
    } 
    return paramObject;
  }
  
  private void Z(long paramLong1, long paramLong2) {
    this.h.e(2);
    this.h.d(2, paramLong1 + paramLong2);
  }
  
  private void b0(boolean paramBoolean) {
    v.a a1 = (this.s.n()).f.a;
    long l = e0(a1, this.u.n, true);
    if (l != this.u.n) {
      this.u = g(a1, l, this.u.e);
      if (paramBoolean)
        this.p.g(4); 
    } 
  }
  
  private void c0(e parame) {
    Object object;
    long l1;
    long l2;
    int j;
    this.p.e(1);
    Pair<Object, Long> pair = X(parame, true);
    if (pair == null) {
      object = this.u.i(this.C, this.k, this.l);
      l1 = -9223372036854775807L;
      l2 = l1;
      j = 1;
    } else {
      object = pair.first;
      l2 = ((Long)pair.second).longValue();
      object = this.s.v(object, l2);
      if (object.a()) {
        l1 = 0L;
        j = 1;
      } else {
        l1 = ((Long)pair.second).longValue();
        if (parame.c == -9223372036854775807L) {
          j = 1;
        } else {
          j = 0;
        } 
      } 
    } 
    try {
      if (this.v == null || this.E > 0) {
        this.F = parame;
      } else {
        if (l1 == -9223372036854775807L) {
          u0(4);
          try {
            T(false, false, true, false, true);
            this.u = g((v.a)object, l1, l2);
          } finally {}
        } else {
          long l4;
          byte b1;
          if (object.equals(this.u.c)) {
            long l;
            h0 h0 = this.s.n();
            if (h0 != null && h0.d && l1 != 0L) {
              l = h0.a.z(l1, this.t);
            } else {
              l = l1;
            } 
            l4 = l;
            if (v.b(l) == v.b(this.u.n)) {
              l = this.u.n;
              this.u = g((v.a)object, l, l2);
              if (j)
                this.p.g(2); 
              return;
            } 
          } else {
            l4 = l1;
          } 
          long l3 = d0((v.a)object, l4);
          if (l1 != l3) {
            b1 = 1;
          } else {
            b1 = 0;
          } 
          j |= b1;
          l1 = l3;
          this.u = g((v.a)object, l1, l2);
        } 
        this.u = g((v.a)object, l1, l2);
      } 
      this.u = g((v.a)object, l1, l2);
    } finally {}
    this.u = g((v.a)object, l1, l2);
  }
  
  private long d0(v.a parama, long paramLong) {
    boolean bool;
    if (this.s.n() != this.s.o()) {
      bool = true;
    } else {
      bool = false;
    } 
    return e0(parama, paramLong, bool);
  }
  
  private long e0(v.a parama, long paramLong, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial A0 : ()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield z : Z
    //   9: aload_0
    //   10: getfield u : Lcom/google/android/exoplayer2/k0;
    //   13: astore #5
    //   15: aload #5
    //   17: getfield f : I
    //   20: iconst_1
    //   21: if_icmpeq -> 40
    //   24: aload #5
    //   26: getfield b : Lcom/google/android/exoplayer2/y0;
    //   29: invokevirtual q : ()Z
    //   32: ifne -> 40
    //   35: aload_0
    //   36: iconst_2
    //   37: invokespecial u0 : (I)V
    //   40: aload_0
    //   41: getfield s : Lcom/google/android/exoplayer2/j0;
    //   44: invokevirtual n : ()Lcom/google/android/exoplayer2/h0;
    //   47: astore #6
    //   49: aload #6
    //   51: astore #5
    //   53: aload #5
    //   55: ifnull -> 106
    //   58: aload_1
    //   59: aload #5
    //   61: getfield f : Lcom/google/android/exoplayer2/i0;
    //   64: getfield a : Lcom/google/android/exoplayer2/source/v$a;
    //   67: invokevirtual equals : (Ljava/lang/Object;)Z
    //   70: ifeq -> 94
    //   73: aload #5
    //   75: getfield d : Z
    //   78: ifeq -> 94
    //   81: aload_0
    //   82: getfield s : Lcom/google/android/exoplayer2/j0;
    //   85: aload #5
    //   87: invokevirtual u : (Lcom/google/android/exoplayer2/h0;)Z
    //   90: pop
    //   91: goto -> 106
    //   94: aload_0
    //   95: getfield s : Lcom/google/android/exoplayer2/j0;
    //   98: invokevirtual a : ()Lcom/google/android/exoplayer2/h0;
    //   101: astore #5
    //   103: goto -> 53
    //   106: iload #4
    //   108: ifne -> 140
    //   111: aload #6
    //   113: aload #5
    //   115: if_acmpne -> 140
    //   118: aload #6
    //   120: astore_1
    //   121: aload #5
    //   123: ifnull -> 201
    //   126: aload #6
    //   128: astore_1
    //   129: aload #5
    //   131: lload_2
    //   132: invokevirtual z : (J)J
    //   135: lconst_0
    //   136: lcmp
    //   137: ifge -> 201
    //   140: aload_0
    //   141: getfield w : [Lcom/google/android/exoplayer2/r0;
    //   144: astore_1
    //   145: aload_1
    //   146: arraylength
    //   147: istore #7
    //   149: iconst_0
    //   150: istore #8
    //   152: iload #8
    //   154: iload #7
    //   156: if_icmpge -> 173
    //   159: aload_0
    //   160: aload_1
    //   161: iload #8
    //   163: aaload
    //   164: invokespecial i : (Lcom/google/android/exoplayer2/r0;)V
    //   167: iinc #8, 1
    //   170: goto -> 152
    //   173: aload_0
    //   174: iconst_0
    //   175: anewarray com/google/android/exoplayer2/r0
    //   178: putfield w : [Lcom/google/android/exoplayer2/r0;
    //   181: aconst_null
    //   182: astore #6
    //   184: aload #6
    //   186: astore_1
    //   187: aload #5
    //   189: ifnull -> 201
    //   192: aload #5
    //   194: lconst_0
    //   195: invokevirtual x : (J)V
    //   198: aload #6
    //   200: astore_1
    //   201: aload #5
    //   203: ifnull -> 272
    //   206: aload_0
    //   207: aload_1
    //   208: invokespecial F0 : (Lcom/google/android/exoplayer2/h0;)V
    //   211: lload_2
    //   212: lstore #9
    //   214: aload #5
    //   216: getfield e : Z
    //   219: ifeq -> 256
    //   222: aload #5
    //   224: getfield a : Lcom/google/android/exoplayer2/source/u;
    //   227: lload_2
    //   228: invokeinterface y : (J)J
    //   233: lstore #9
    //   235: aload #5
    //   237: getfield a : Lcom/google/android/exoplayer2/source/u;
    //   240: lload #9
    //   242: aload_0
    //   243: getfield m : J
    //   246: lsub
    //   247: aload_0
    //   248: getfield n : Z
    //   251: invokeinterface D : (JZ)V
    //   256: aload_0
    //   257: lload #9
    //   259: invokespecial U : (J)V
    //   262: aload_0
    //   263: invokespecial F : ()V
    //   266: lload #9
    //   268: lstore_2
    //   269: goto -> 303
    //   272: aload_0
    //   273: getfield s : Lcom/google/android/exoplayer2/j0;
    //   276: iconst_1
    //   277: invokevirtual e : (Z)V
    //   280: aload_0
    //   281: aload_0
    //   282: getfield u : Lcom/google/android/exoplayer2/k0;
    //   285: getstatic com/google/android/exoplayer2/source/TrackGroupArray.b : Lcom/google/android/exoplayer2/source/TrackGroupArray;
    //   288: aload_0
    //   289: getfield e : Lcom/google/android/exoplayer2/trackselection/i;
    //   292: invokevirtual g : (Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/google/android/exoplayer2/trackselection/i;)Lcom/google/android/exoplayer2/k0;
    //   295: putfield u : Lcom/google/android/exoplayer2/k0;
    //   298: aload_0
    //   299: lload_2
    //   300: invokespecial U : (J)V
    //   303: aload_0
    //   304: iconst_0
    //   305: invokespecial v : (Z)V
    //   308: aload_0
    //   309: getfield h : Lcom/google/android/exoplayer2/util/n;
    //   312: iconst_2
    //   313: invokeinterface b : (I)Z
    //   318: pop
    //   319: lload_2
    //   320: lreturn
  }
  
  private void f0(p0 paramp0) {
    if (paramp0.e() == -9223372036854775807L) {
      g0(paramp0);
    } else {
      if (this.v == null || this.E > 0) {
        this.q.add(new c(paramp0));
        return;
      } 
      c c1 = new c(paramp0);
      if (V(c1)) {
        this.q.add(c1);
        Collections.sort(this.q);
      } else {
        paramp0.k(false);
      } 
    } 
  }
  
  private k0 g(v.a parama, long paramLong1, long paramLong2) {
    this.I = true;
    return this.u.c(parama, paramLong1, paramLong2, s());
  }
  
  private void g0(p0 paramp0) {
    if (paramp0.c().getLooper() == this.h.g()) {
      h(paramp0);
      int j = this.u.f;
      if (j == 3 || j == 2)
        this.h.b(2); 
    } else {
      this.h.f(16, paramp0).sendToTarget();
    } 
  }
  
  private void h(p0 paramp0) {
    if (paramp0.j())
      return; 
    try {
      paramp0.f().e(paramp0.h(), paramp0.d());
      return;
    } finally {
      paramp0.k(true);
    } 
  }
  
  private void h0(p0 paramp0) {
    Handler handler = paramp0.c();
    if (!handler.getLooper().getThread().isAlive()) {
      o.f("TAG", "Trying to send message on a dead thread.");
      paramp0.k(false);
      return;
    } 
    handler.post(new p(this, paramp0));
  }
  
  private void i(r0 paramr0) {
    this.o.a(paramr0);
    m(paramr0);
    paramr0.p();
  }
  
  private void i0(l0 paraml0, boolean paramBoolean) {
    this.h.c(17, paramBoolean, 0, paraml0).sendToTarget();
  }
  
  private void j() {
    // Byte code:
    //   0: aload_0
    //   1: getfield r : Lcom/google/android/exoplayer2/util/f;
    //   4: invokeinterface c : ()J
    //   9: lstore_1
    //   10: aload_0
    //   11: invokespecial D0 : ()V
    //   14: aload_0
    //   15: getfield u : Lcom/google/android/exoplayer2/k0;
    //   18: getfield f : I
    //   21: istore_3
    //   22: iload_3
    //   23: iconst_1
    //   24: if_icmpeq -> 664
    //   27: iload_3
    //   28: iconst_4
    //   29: if_icmpne -> 35
    //   32: goto -> 664
    //   35: aload_0
    //   36: getfield s : Lcom/google/android/exoplayer2/j0;
    //   39: invokevirtual n : ()Lcom/google/android/exoplayer2/h0;
    //   42: astore #4
    //   44: aload #4
    //   46: ifnonnull -> 58
    //   49: aload_0
    //   50: lload_1
    //   51: ldc2_w 10
    //   54: invokespecial Z : (JJ)V
    //   57: return
    //   58: ldc_w 'doSomeWork'
    //   61: invokestatic a : (Ljava/lang/String;)V
    //   64: aload_0
    //   65: invokespecial E0 : ()V
    //   68: aload #4
    //   70: getfield d : Z
    //   73: istore #5
    //   75: iconst_0
    //   76: istore #6
    //   78: iload #5
    //   80: ifeq -> 363
    //   83: invokestatic elapsedRealtime : ()J
    //   86: lstore #7
    //   88: aload #4
    //   90: getfield a : Lcom/google/android/exoplayer2/source/u;
    //   93: aload_0
    //   94: getfield u : Lcom/google/android/exoplayer2/k0;
    //   97: getfield n : J
    //   100: aload_0
    //   101: getfield m : J
    //   104: lsub
    //   105: aload_0
    //   106: getfield n : Z
    //   109: invokeinterface D : (JZ)V
    //   114: iconst_0
    //   115: istore #9
    //   117: iconst_1
    //   118: istore_3
    //   119: iconst_1
    //   120: istore #5
    //   122: aload_0
    //   123: getfield b : [Lcom/google/android/exoplayer2/r0;
    //   126: astore #10
    //   128: iload #9
    //   130: aload #10
    //   132: arraylength
    //   133: if_icmpge -> 360
    //   136: aload #10
    //   138: iload #9
    //   140: aaload
    //   141: astore #10
    //   143: aload #10
    //   145: invokeinterface getState : ()I
    //   150: ifne -> 163
    //   153: iload_3
    //   154: istore #11
    //   156: iload #5
    //   158: istore #12
    //   160: goto -> 347
    //   163: aload #10
    //   165: aload_0
    //   166: getfield G : J
    //   169: lload #7
    //   171: ldc2_w 1000
    //   174: lmul
    //   175: invokeinterface w : (JJ)V
    //   180: iload_3
    //   181: ifeq -> 199
    //   184: aload #10
    //   186: invokeinterface o : ()Z
    //   191: ifeq -> 199
    //   194: iconst_1
    //   195: istore_3
    //   196: goto -> 201
    //   199: iconst_0
    //   200: istore_3
    //   201: aload #4
    //   203: getfield c : [Lcom/google/android/exoplayer2/source/b0;
    //   206: iload #9
    //   208: aaload
    //   209: aload #10
    //   211: invokeinterface r : ()Lcom/google/android/exoplayer2/source/b0;
    //   216: if_acmpeq -> 225
    //   219: iconst_1
    //   220: istore #11
    //   222: goto -> 228
    //   225: iconst_0
    //   226: istore #11
    //   228: iload #11
    //   230: ifne -> 257
    //   233: aload #4
    //   235: invokevirtual j : ()Lcom/google/android/exoplayer2/h0;
    //   238: ifnull -> 257
    //   241: aload #10
    //   243: invokeinterface s : ()Z
    //   248: ifeq -> 257
    //   251: iconst_1
    //   252: istore #13
    //   254: goto -> 260
    //   257: iconst_0
    //   258: istore #13
    //   260: iload #11
    //   262: ifne -> 299
    //   265: iload #13
    //   267: ifne -> 299
    //   270: aload #10
    //   272: invokeinterface m : ()Z
    //   277: ifne -> 299
    //   280: aload #10
    //   282: invokeinterface o : ()Z
    //   287: ifeq -> 293
    //   290: goto -> 299
    //   293: iconst_0
    //   294: istore #13
    //   296: goto -> 302
    //   299: iconst_1
    //   300: istore #13
    //   302: iload #5
    //   304: ifeq -> 318
    //   307: iload #13
    //   309: ifeq -> 318
    //   312: iconst_1
    //   313: istore #5
    //   315: goto -> 321
    //   318: iconst_0
    //   319: istore #5
    //   321: iload_3
    //   322: istore #11
    //   324: iload #5
    //   326: istore #12
    //   328: iload #13
    //   330: ifne -> 347
    //   333: aload #10
    //   335: invokeinterface y : ()V
    //   340: iload #5
    //   342: istore #12
    //   344: iload_3
    //   345: istore #11
    //   347: iinc #9, 1
    //   350: iload #11
    //   352: istore_3
    //   353: iload #12
    //   355: istore #5
    //   357: goto -> 122
    //   360: goto -> 378
    //   363: aload #4
    //   365: getfield a : Lcom/google/android/exoplayer2/source/u;
    //   368: invokeinterface x : ()V
    //   373: iconst_1
    //   374: istore_3
    //   375: iconst_1
    //   376: istore #5
    //   378: aload #4
    //   380: getfield f : Lcom/google/android/exoplayer2/i0;
    //   383: getfield e : J
    //   386: lstore #7
    //   388: iload_3
    //   389: ifeq -> 445
    //   392: aload #4
    //   394: getfield d : Z
    //   397: ifeq -> 445
    //   400: lload #7
    //   402: ldc2_w -9223372036854775807
    //   405: lcmp
    //   406: ifeq -> 422
    //   409: lload #7
    //   411: aload_0
    //   412: getfield u : Lcom/google/android/exoplayer2/k0;
    //   415: getfield n : J
    //   418: lcmp
    //   419: ifgt -> 445
    //   422: aload #4
    //   424: getfield f : Lcom/google/android/exoplayer2/i0;
    //   427: getfield g : Z
    //   430: ifeq -> 445
    //   433: aload_0
    //   434: iconst_4
    //   435: invokespecial u0 : (I)V
    //   438: aload_0
    //   439: invokespecial A0 : ()V
    //   442: goto -> 538
    //   445: aload_0
    //   446: getfield u : Lcom/google/android/exoplayer2/k0;
    //   449: getfield f : I
    //   452: iconst_2
    //   453: if_icmpne -> 484
    //   456: aload_0
    //   457: iload #5
    //   459: invokespecial x0 : (Z)Z
    //   462: ifeq -> 484
    //   465: aload_0
    //   466: iconst_3
    //   467: invokespecial u0 : (I)V
    //   470: aload_0
    //   471: getfield y : Z
    //   474: ifeq -> 538
    //   477: aload_0
    //   478: invokespecial y0 : ()V
    //   481: goto -> 538
    //   484: aload_0
    //   485: getfield u : Lcom/google/android/exoplayer2/k0;
    //   488: getfield f : I
    //   491: iconst_3
    //   492: if_icmpne -> 538
    //   495: aload_0
    //   496: getfield w : [Lcom/google/android/exoplayer2/r0;
    //   499: arraylength
    //   500: ifne -> 513
    //   503: aload_0
    //   504: invokespecial C : ()Z
    //   507: ifeq -> 518
    //   510: goto -> 538
    //   513: iload #5
    //   515: ifne -> 538
    //   518: aload_0
    //   519: aload_0
    //   520: getfield y : Z
    //   523: putfield z : Z
    //   526: aload_0
    //   527: iconst_2
    //   528: invokespecial u0 : (I)V
    //   531: aload_0
    //   532: invokespecial A0 : ()V
    //   535: goto -> 538
    //   538: aload_0
    //   539: getfield u : Lcom/google/android/exoplayer2/k0;
    //   542: getfield f : I
    //   545: iconst_2
    //   546: if_icmpne -> 584
    //   549: aload_0
    //   550: getfield w : [Lcom/google/android/exoplayer2/r0;
    //   553: astore #4
    //   555: aload #4
    //   557: arraylength
    //   558: istore #9
    //   560: iload #6
    //   562: istore_3
    //   563: iload_3
    //   564: iload #9
    //   566: if_icmpge -> 584
    //   569: aload #4
    //   571: iload_3
    //   572: aaload
    //   573: invokeinterface y : ()V
    //   578: iinc #3, 1
    //   581: goto -> 563
    //   584: aload_0
    //   585: getfield y : Z
    //   588: ifeq -> 602
    //   591: aload_0
    //   592: getfield u : Lcom/google/android/exoplayer2/k0;
    //   595: getfield f : I
    //   598: iconst_3
    //   599: if_icmpeq -> 615
    //   602: aload_0
    //   603: getfield u : Lcom/google/android/exoplayer2/k0;
    //   606: getfield f : I
    //   609: istore_3
    //   610: iload_3
    //   611: iconst_2
    //   612: if_icmpne -> 626
    //   615: aload_0
    //   616: lload_1
    //   617: ldc2_w 10
    //   620: invokespecial Z : (JJ)V
    //   623: goto -> 660
    //   626: aload_0
    //   627: getfield w : [Lcom/google/android/exoplayer2/r0;
    //   630: arraylength
    //   631: ifeq -> 650
    //   634: iload_3
    //   635: iconst_4
    //   636: if_icmpeq -> 650
    //   639: aload_0
    //   640: lload_1
    //   641: ldc2_w 1000
    //   644: invokespecial Z : (JJ)V
    //   647: goto -> 660
    //   650: aload_0
    //   651: getfield h : Lcom/google/android/exoplayer2/util/n;
    //   654: iconst_2
    //   655: invokeinterface e : (I)V
    //   660: invokestatic c : ()V
    //   663: return
    //   664: aload_0
    //   665: getfield h : Lcom/google/android/exoplayer2/util/n;
    //   668: iconst_2
    //   669: invokeinterface e : (I)V
    //   674: return
  }
  
  private void j0() {
    for (r0 r01 : this.b) {
      if (r01.r() != null)
        r01.u(); 
    } 
  }
  
  private void k(int paramInt1, boolean paramBoolean, int paramInt2) {
    h0 h0 = this.s.n();
    r0 r01 = this.b[paramInt1];
    this.w[paramInt2] = r01;
    if (r01.getState() == 0) {
      i i1 = h0.o();
      u0 u0 = i1.b[paramInt1];
      Format[] arrayOfFormat = o(i1.c.a(paramInt1));
      if (this.y && this.u.f == 3) {
        paramInt2 = 1;
      } else {
        paramInt2 = 0;
      } 
      if (!paramBoolean && paramInt2 != 0) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      } 
      r01.t(u0, arrayOfFormat, h0.c[paramInt1], this.G, paramBoolean, h0.l());
      this.o.b(r01);
      if (paramInt2 != 0)
        r01.start(); 
    } 
  }
  
  private void k0(boolean paramBoolean, AtomicBoolean paramAtomicBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield D : Z
    //   4: iload_1
    //   5: if_icmpeq -> 65
    //   8: aload_0
    //   9: iload_1
    //   10: putfield D : Z
    //   13: iload_1
    //   14: ifne -> 65
    //   17: aload_0
    //   18: getfield b : [Lcom/google/android/exoplayer2/r0;
    //   21: astore_3
    //   22: aload_3
    //   23: arraylength
    //   24: istore #4
    //   26: iconst_0
    //   27: istore #5
    //   29: iload #5
    //   31: iload #4
    //   33: if_icmpge -> 65
    //   36: aload_3
    //   37: iload #5
    //   39: aaload
    //   40: astore #6
    //   42: aload #6
    //   44: invokeinterface getState : ()I
    //   49: ifne -> 59
    //   52: aload #6
    //   54: invokeinterface a : ()V
    //   59: iinc #5, 1
    //   62: goto -> 29
    //   65: aload_2
    //   66: ifnull -> 90
    //   69: aload_0
    //   70: monitorenter
    //   71: aload_2
    //   72: iconst_1
    //   73: invokevirtual set : (Z)V
    //   76: aload_0
    //   77: invokevirtual notifyAll : ()V
    //   80: aload_0
    //   81: monitorexit
    //   82: goto -> 90
    //   85: astore_2
    //   86: aload_0
    //   87: monitorexit
    //   88: aload_2
    //   89: athrow
    //   90: return
    // Exception table:
    //   from	to	target	type
    //   71	82	85	finally
    //   86	88	85	finally
  }
  
  private void l(boolean[] paramArrayOfboolean, int paramInt) {
    this.w = new r0[paramInt];
    i i1 = this.s.n().o();
    byte b1 = 0;
    for (paramInt = 0; paramInt < this.b.length; paramInt++) {
      if (!i1.c(paramInt))
        this.b[paramInt].a(); 
    } 
    int j;
    for (j = 0; b1 < this.b.length; j = paramInt) {
      paramInt = j;
      if (i1.c(b1)) {
        k(b1, paramArrayOfboolean[b1], j);
        paramInt = j + 1;
      } 
      b1++;
    } 
  }
  
  private void m(r0 paramr0) {
    if (paramr0.getState() == 2)
      paramr0.stop(); 
  }
  
  private void m0(boolean paramBoolean) {
    this.z = false;
    this.y = paramBoolean;
    if (!paramBoolean) {
      A0();
      E0();
    } else {
      int j = this.u.f;
      if (j == 3) {
        y0();
        this.h.b(2);
      } else if (j == 2) {
        this.h.b(2);
      } 
    } 
  }
  
  private String n(ExoPlaybackException paramExoPlaybackException) {
    if (paramExoPlaybackException.type != 1)
      return "Playback error."; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Renderer error: index=");
    stringBuilder.append(paramExoPlaybackException.rendererIndex);
    stringBuilder.append(", type=");
    stringBuilder.append(h0.P(this.b[paramExoPlaybackException.rendererIndex].n()));
    stringBuilder.append(", format=");
    stringBuilder.append(paramExoPlaybackException.rendererFormat);
    stringBuilder.append(", rendererSupport=");
    stringBuilder.append(s0.e(paramExoPlaybackException.rendererFormatSupport));
    return stringBuilder.toString();
  }
  
  private static Format[] o(f paramf) {
    byte b2;
    byte b1 = 0;
    if (paramf != null) {
      b2 = paramf.length();
    } else {
      b2 = 0;
    } 
    Format[] arrayOfFormat = new Format[b2];
    while (b1 < b2) {
      arrayOfFormat[b1] = paramf.d(b1);
      b1++;
    } 
    return arrayOfFormat;
  }
  
  private void o0(l0 paraml0) {
    this.o.d1(paraml0);
    i0(this.o.W(), true);
  }
  
  private long p() {
    h0 h0 = this.s.o();
    if (h0 == null)
      return 0L; 
    long l = h0.l();
    if (!h0.d)
      return l; 
    byte b1 = 0;
    while (true) {
      r0[] arrayOfR0 = this.b;
      if (b1 < arrayOfR0.length) {
        long l1 = l;
        if (arrayOfR0[b1].getState() != 0)
          if (this.b[b1].r() != h0.c[b1]) {
            l1 = l;
          } else {
            l1 = this.b[b1].z();
            if (l1 == Long.MIN_VALUE)
              return Long.MIN_VALUE; 
            l1 = Math.max(l1, l);
          }  
        b1++;
        l = l1;
        continue;
      } 
      return l;
    } 
  }
  
  private Pair<Object, Long> q(y0 paramy0, int paramInt, long paramLong) {
    return paramy0.j(this.k, this.l, paramInt, paramLong);
  }
  
  private void q0(int paramInt) {
    this.B = paramInt;
    if (!this.s.C(paramInt))
      b0(true); 
    v(false);
  }
  
  private void r0(w0 paramw0) {
    this.t = paramw0;
  }
  
  private long s() {
    return t(this.u.l);
  }
  
  private long t(long paramLong) {
    h0 h0 = this.s.i();
    return (h0 == null) ? 0L : Math.max(0L, paramLong - h0.y(this.G));
  }
  
  private void t0(boolean paramBoolean) {
    this.C = paramBoolean;
    if (!this.s.D(paramBoolean))
      b0(true); 
    v(false);
  }
  
  private void u(u paramu) {
    if (!this.s.s(paramu))
      return; 
    this.s.t(this.G);
    F();
  }
  
  private void u0(int paramInt) {
    k0 k01 = this.u;
    if (k01.f != paramInt)
      this.u = k01.e(paramInt); 
  }
  
  private void v(boolean paramBoolean) {
    v.a a1;
    long l;
    h0 h0 = this.s.i();
    if (h0 == null) {
      a1 = this.u.c;
    } else {
      a1 = h0.f.a;
    } 
    int j = this.u.k.equals(a1) ^ true;
    if (j != 0)
      this.u = this.u.b(a1); 
    k0 k01 = this.u;
    if (h0 == null) {
      l = k01.n;
    } else {
      l = h0.i();
    } 
    k01.l = l;
    this.u.m = s();
    if ((j != 0 || paramBoolean) && h0 != null && h0.d)
      C0(h0.n(), h0.o()); 
  }
  
  private boolean v0() {
    boolean bool = this.y;
    boolean bool1 = false;
    if (!bool)
      return false; 
    h0 h01 = this.s.n();
    if (h01 == null)
      return false; 
    h0 h02 = h01.j();
    if (h02 == null)
      return false; 
    if (h01 == this.s.o() && !A())
      return false; 
    if (this.G >= h02.m())
      bool1 = true; 
    return bool1;
  }
  
  private void w(u paramu) {
    if (!this.s.s(paramu))
      return; 
    h0 h0 = this.s.i();
    h0.p((this.o.W()).b, this.u.b);
    C0(h0.n(), h0.o());
    if (h0 == this.s.n()) {
      U(h0.f.b);
      F0(null);
    } 
    F();
  }
  
  private boolean w0() {
    if (!B())
      return false; 
    long l = t(this.s.i().k());
    float f1 = (this.o.W()).b;
    return this.f.f(l, f1);
  }
  
  private void x(l0 paraml0, boolean paramBoolean) {
    Handler handler = this.j;
    boolean bool = false;
    handler.obtainMessage(1, paramBoolean, 0, paraml0).sendToTarget();
    G0(paraml0.b);
    r0[] arrayOfR0 = this.b;
    int j = arrayOfR0.length;
    for (paramBoolean = bool; paramBoolean < j; paramBoolean++) {
      r0 r01 = arrayOfR0[paramBoolean];
      if (r01 != null)
        r01.x(paraml0.b); 
    } 
  }
  
  private boolean x0(boolean paramBoolean) {
    boolean bool2;
    if (this.w.length == 0)
      return C(); 
    boolean bool1 = false;
    if (!paramBoolean)
      return false; 
    if (!this.u.h)
      return true; 
    h0 h0 = this.s.i();
    if (h0.q() && h0.f.g) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (!bool2) {
      paramBoolean = bool1;
      return this.f.e(s(), (this.o.W()).b, this.z) ? true : paramBoolean;
    } 
    return true;
  }
  
  private void y() {
    if (this.u.f != 1)
      u0(4); 
    T(false, false, true, false, true);
  }
  
  private void y0() {
    byte b1 = 0;
    this.z = false;
    this.o.f();
    r0[] arrayOfR0 = this.w;
    int j = arrayOfR0.length;
    while (b1 < j) {
      arrayOfR0[b1].start();
      b1++;
    } 
  }
  
  private void z(b paramb) {
    v.a a1;
    long l1;
    long l2;
    if (paramb.a != this.v)
      return; 
    this.p.e(this.E);
    this.E = 0;
    y0 y02 = this.u.b;
    y0 y01 = paramb.b;
    this.s.y(y01);
    this.u = this.u.f(y01);
    W();
    v.a a2 = this.u.c;
    if (a2.a()) {
      l1 = this.u.e;
    } else {
      l1 = this.u.n;
    } 
    e e1 = this.F;
    if (e1 != null) {
      Pair<Object, Long> pair = X(e1, true);
      this.F = null;
      if (pair == null) {
        y();
        return;
      } 
      l2 = ((Long)pair.second).longValue();
      a1 = this.s.v(pair.first, l2);
    } else {
      Pair<Object, Long> pair;
      if (l1 == -9223372036854775807L && !a1.q()) {
        pair = q((y0)a1, a1.a(this.C), -9223372036854775807L);
        a1 = this.s.v(pair.first, ((Long)pair.second).longValue());
        if (!a1.a()) {
          l2 = ((Long)pair.second).longValue();
        } else {
          l2 = l1;
        } 
      } else if (a1.b(a2.a) == -1) {
        Object object = Y(a2.a, (y0)pair, (y0)a1);
        if (object == null) {
          y();
          return;
        } 
        Pair<Object, Long> pair1 = q((y0)a1, (a1.h(object, this.l)).c, -9223372036854775807L);
        l2 = ((Long)pair1.second).longValue();
        v.a a3 = this.s.v(pair1.first, l2);
      } else {
        v.a a3 = this.s.v(this.u.c.a, l1);
        a1 = a3;
        if (!this.u.c.a()) {
          a1 = a3;
          if (!a3.a())
            a1 = this.u.c; 
        } 
        l2 = l1;
      } 
    } 
    if (this.u.c.equals(a1) && l1 == l2) {
      if (!this.s.B(this.G, p()))
        b0(false); 
    } else {
      h0 h0 = this.s.n();
      if (h0 != null)
        while (h0.j() != null) {
          h0 h01 = h0.j();
          h0 = h01;
          if (h01.f.a.equals(a1)) {
            h01.f = this.s.p(h01.f);
            h0 = h01;
          } 
        }  
      if (a1.a()) {
        l1 = 0L;
      } else {
        l1 = l2;
      } 
      this.u = g(a1, d0(a1, l1), l2);
    } 
    v(false);
  }
  
  private void z0(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    if (paramBoolean1 || !this.D) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    } 
    T(paramBoolean1, true, paramBoolean2, paramBoolean2, paramBoolean2);
    this.p.e(this.E + paramBoolean3);
    this.E = 0;
    this.f.b();
    u0(1);
  }
  
  public void N(u paramu) {
    this.h.f(10, paramu).sendToTarget();
  }
  
  public void O(v paramv, boolean paramBoolean1, boolean paramBoolean2) {
    this.h.c(0, paramBoolean1, paramBoolean2, paramv).sendToTarget();
  }
  
  public void Q() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield x : Z
    //   6: ifne -> 71
    //   9: aload_0
    //   10: getfield i : Landroid/os/HandlerThread;
    //   13: invokevirtual isAlive : ()Z
    //   16: ifne -> 22
    //   19: goto -> 71
    //   22: aload_0
    //   23: getfield h : Lcom/google/android/exoplayer2/util/n;
    //   26: bipush #7
    //   28: invokeinterface b : (I)Z
    //   33: pop
    //   34: iconst_0
    //   35: istore_1
    //   36: aload_0
    //   37: getfield x : Z
    //   40: istore_2
    //   41: iload_2
    //   42: ifne -> 58
    //   45: aload_0
    //   46: invokevirtual wait : ()V
    //   49: goto -> 36
    //   52: astore_3
    //   53: iconst_1
    //   54: istore_1
    //   55: goto -> 36
    //   58: iload_1
    //   59: ifeq -> 68
    //   62: invokestatic currentThread : ()Ljava/lang/Thread;
    //   65: invokevirtual interrupt : ()V
    //   68: aload_0
    //   69: monitorexit
    //   70: return
    //   71: aload_0
    //   72: monitorexit
    //   73: return
    //   74: astore_3
    //   75: aload_0
    //   76: monitorexit
    //   77: goto -> 82
    //   80: aload_3
    //   81: athrow
    //   82: goto -> 80
    // Exception table:
    //   from	to	target	type
    //   2	19	74	finally
    //   22	34	74	finally
    //   36	41	74	finally
    //   45	49	52	java/lang/InterruptedException
    //   45	49	74	finally
    //   62	68	74	finally
  }
  
  public void a0(y0 paramy0, int paramInt, long paramLong) {
    this.h.f(3, new e(paramy0, paramInt, paramLong)).sendToTarget();
  }
  
  public void b(v paramv, y0 paramy0) {
    this.h.f(8, new b(paramv, paramy0)).sendToTarget();
  }
  
  public void c(p0 paramp0) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield x : Z
    //   6: ifne -> 40
    //   9: aload_0
    //   10: getfield i : Landroid/os/HandlerThread;
    //   13: invokevirtual isAlive : ()Z
    //   16: ifne -> 22
    //   19: goto -> 40
    //   22: aload_0
    //   23: getfield h : Lcom/google/android/exoplayer2/util/n;
    //   26: bipush #15
    //   28: aload_1
    //   29: invokeinterface f : (ILjava/lang/Object;)Landroid/os/Message;
    //   34: invokevirtual sendToTarget : ()V
    //   37: aload_0
    //   38: monitorexit
    //   39: return
    //   40: ldc_w 'ExoPlayerImplInternal'
    //   43: ldc_w 'Ignoring messages sent after release.'
    //   46: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   49: aload_1
    //   50: iconst_0
    //   51: invokevirtual k : (Z)V
    //   54: aload_0
    //   55: monitorexit
    //   56: return
    //   57: astore_1
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_1
    //   61: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	57	finally
    //   22	37	57	finally
    //   40	54	57	finally
  }
  
  public void f(u paramu) {
    this.h.f(9, paramu).sendToTarget();
  }
  
  public boolean handleMessage(Message paramMessage) {
    // Byte code:
    //   0: aload_1
    //   1: getfield what : I
    //   4: tableswitch default -> 92, 0 -> 365, 1 -> 343, 2 -> 336, 3 -> 322, 4 -> 308, 5 -> 294, 6 -> 270, 7 -> 264, 8 -> 250, 9 -> 236, 10 -> 222, 11 -> 215, 12 -> 204, 13 -> 182, 14 -> 153, 15 -> 139, 16 -> 125, 17 -> 94
    //   92: iconst_0
    //   93: ireturn
    //   94: aload_1
    //   95: getfield obj : Ljava/lang/Object;
    //   98: checkcast com/google/android/exoplayer2/l0
    //   101: astore_2
    //   102: aload_1
    //   103: getfield arg1 : I
    //   106: ifeq -> 114
    //   109: iconst_1
    //   110: istore_3
    //   111: goto -> 116
    //   114: iconst_0
    //   115: istore_3
    //   116: aload_0
    //   117: aload_2
    //   118: iload_3
    //   119: invokespecial x : (Lcom/google/android/exoplayer2/l0;Z)V
    //   122: goto -> 411
    //   125: aload_0
    //   126: aload_1
    //   127: getfield obj : Ljava/lang/Object;
    //   130: checkcast com/google/android/exoplayer2/p0
    //   133: invokespecial h0 : (Lcom/google/android/exoplayer2/p0;)V
    //   136: goto -> 411
    //   139: aload_0
    //   140: aload_1
    //   141: getfield obj : Ljava/lang/Object;
    //   144: checkcast com/google/android/exoplayer2/p0
    //   147: invokespecial f0 : (Lcom/google/android/exoplayer2/p0;)V
    //   150: goto -> 411
    //   153: aload_1
    //   154: getfield arg1 : I
    //   157: ifeq -> 165
    //   160: iconst_1
    //   161: istore_3
    //   162: goto -> 167
    //   165: iconst_0
    //   166: istore_3
    //   167: aload_0
    //   168: iload_3
    //   169: aload_1
    //   170: getfield obj : Ljava/lang/Object;
    //   173: checkcast java/util/concurrent/atomic/AtomicBoolean
    //   176: invokespecial k0 : (ZLjava/util/concurrent/atomic/AtomicBoolean;)V
    //   179: goto -> 411
    //   182: aload_1
    //   183: getfield arg1 : I
    //   186: ifeq -> 194
    //   189: iconst_1
    //   190: istore_3
    //   191: goto -> 196
    //   194: iconst_0
    //   195: istore_3
    //   196: aload_0
    //   197: iload_3
    //   198: invokespecial t0 : (Z)V
    //   201: goto -> 411
    //   204: aload_0
    //   205: aload_1
    //   206: getfield arg1 : I
    //   209: invokespecial q0 : (I)V
    //   212: goto -> 411
    //   215: aload_0
    //   216: invokespecial S : ()V
    //   219: goto -> 411
    //   222: aload_0
    //   223: aload_1
    //   224: getfield obj : Ljava/lang/Object;
    //   227: checkcast com/google/android/exoplayer2/source/u
    //   230: invokespecial u : (Lcom/google/android/exoplayer2/source/u;)V
    //   233: goto -> 411
    //   236: aload_0
    //   237: aload_1
    //   238: getfield obj : Ljava/lang/Object;
    //   241: checkcast com/google/android/exoplayer2/source/u
    //   244: invokespecial w : (Lcom/google/android/exoplayer2/source/u;)V
    //   247: goto -> 411
    //   250: aload_0
    //   251: aload_1
    //   252: getfield obj : Ljava/lang/Object;
    //   255: checkcast com/google/android/exoplayer2/d0$b
    //   258: invokespecial z : (Lcom/google/android/exoplayer2/d0$b;)V
    //   261: goto -> 411
    //   264: aload_0
    //   265: invokespecial R : ()V
    //   268: iconst_1
    //   269: ireturn
    //   270: aload_1
    //   271: getfield arg1 : I
    //   274: ifeq -> 282
    //   277: iconst_1
    //   278: istore_3
    //   279: goto -> 284
    //   282: iconst_0
    //   283: istore_3
    //   284: aload_0
    //   285: iconst_0
    //   286: iload_3
    //   287: iconst_1
    //   288: invokespecial z0 : (ZZZ)V
    //   291: goto -> 411
    //   294: aload_0
    //   295: aload_1
    //   296: getfield obj : Ljava/lang/Object;
    //   299: checkcast com/google/android/exoplayer2/w0
    //   302: invokespecial r0 : (Lcom/google/android/exoplayer2/w0;)V
    //   305: goto -> 411
    //   308: aload_0
    //   309: aload_1
    //   310: getfield obj : Ljava/lang/Object;
    //   313: checkcast com/google/android/exoplayer2/l0
    //   316: invokespecial o0 : (Lcom/google/android/exoplayer2/l0;)V
    //   319: goto -> 411
    //   322: aload_0
    //   323: aload_1
    //   324: getfield obj : Ljava/lang/Object;
    //   327: checkcast com/google/android/exoplayer2/d0$e
    //   330: invokespecial c0 : (Lcom/google/android/exoplayer2/d0$e;)V
    //   333: goto -> 411
    //   336: aload_0
    //   337: invokespecial j : ()V
    //   340: goto -> 411
    //   343: aload_1
    //   344: getfield arg1 : I
    //   347: ifeq -> 355
    //   350: iconst_1
    //   351: istore_3
    //   352: goto -> 357
    //   355: iconst_0
    //   356: istore_3
    //   357: aload_0
    //   358: iload_3
    //   359: invokespecial m0 : (Z)V
    //   362: goto -> 411
    //   365: aload_1
    //   366: getfield obj : Ljava/lang/Object;
    //   369: checkcast com/google/android/exoplayer2/source/v
    //   372: astore_2
    //   373: aload_1
    //   374: getfield arg1 : I
    //   377: ifeq -> 385
    //   380: iconst_1
    //   381: istore_3
    //   382: goto -> 387
    //   385: iconst_0
    //   386: istore_3
    //   387: aload_1
    //   388: getfield arg2 : I
    //   391: ifeq -> 400
    //   394: iconst_1
    //   395: istore #4
    //   397: goto -> 403
    //   400: iconst_0
    //   401: istore #4
    //   403: aload_0
    //   404: aload_2
    //   405: iload_3
    //   406: iload #4
    //   408: invokespecial P : (Lcom/google/android/exoplayer2/source/v;ZZ)V
    //   411: aload_0
    //   412: invokespecial G : ()V
    //   415: goto -> 561
    //   418: astore_1
    //   419: goto -> 423
    //   422: astore_1
    //   423: ldc_w 'ExoPlayerImplInternal'
    //   426: ldc_w 'Internal runtime error.'
    //   429: aload_1
    //   430: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   433: aload_1
    //   434: instanceof java/lang/OutOfMemoryError
    //   437: ifeq -> 451
    //   440: aload_1
    //   441: checkcast java/lang/OutOfMemoryError
    //   444: invokestatic createForOutOfMemoryError : (Ljava/lang/OutOfMemoryError;)Lcom/google/android/exoplayer2/ExoPlaybackException;
    //   447: astore_1
    //   448: goto -> 459
    //   451: aload_1
    //   452: checkcast java/lang/RuntimeException
    //   455: invokestatic createForUnexpected : (Ljava/lang/RuntimeException;)Lcom/google/android/exoplayer2/ExoPlaybackException;
    //   458: astore_1
    //   459: aload_0
    //   460: iconst_1
    //   461: iconst_0
    //   462: iconst_0
    //   463: invokespecial z0 : (ZZZ)V
    //   466: aload_0
    //   467: aload_0
    //   468: getfield u : Lcom/google/android/exoplayer2/k0;
    //   471: aload_1
    //   472: invokevirtual d : (Lcom/google/android/exoplayer2/ExoPlaybackException;)Lcom/google/android/exoplayer2/k0;
    //   475: putfield u : Lcom/google/android/exoplayer2/k0;
    //   478: aload_0
    //   479: invokespecial G : ()V
    //   482: goto -> 561
    //   485: astore_1
    //   486: ldc_w 'ExoPlayerImplInternal'
    //   489: ldc_w 'Source error.'
    //   492: aload_1
    //   493: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   496: aload_0
    //   497: iconst_0
    //   498: iconst_0
    //   499: iconst_0
    //   500: invokespecial z0 : (ZZZ)V
    //   503: aload_0
    //   504: aload_0
    //   505: getfield u : Lcom/google/android/exoplayer2/k0;
    //   508: aload_1
    //   509: invokestatic createForSource : (Ljava/io/IOException;)Lcom/google/android/exoplayer2/ExoPlaybackException;
    //   512: invokevirtual d : (Lcom/google/android/exoplayer2/ExoPlaybackException;)Lcom/google/android/exoplayer2/k0;
    //   515: putfield u : Lcom/google/android/exoplayer2/k0;
    //   518: aload_0
    //   519: invokespecial G : ()V
    //   522: goto -> 561
    //   525: astore_1
    //   526: ldc_w 'ExoPlayerImplInternal'
    //   529: aload_0
    //   530: aload_1
    //   531: invokespecial n : (Lcom/google/android/exoplayer2/ExoPlaybackException;)Ljava/lang/String;
    //   534: aload_1
    //   535: invokestatic d : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   538: aload_0
    //   539: iconst_1
    //   540: iconst_0
    //   541: iconst_0
    //   542: invokespecial z0 : (ZZZ)V
    //   545: aload_0
    //   546: aload_0
    //   547: getfield u : Lcom/google/android/exoplayer2/k0;
    //   550: aload_1
    //   551: invokevirtual d : (Lcom/google/android/exoplayer2/ExoPlaybackException;)Lcom/google/android/exoplayer2/k0;
    //   554: putfield u : Lcom/google/android/exoplayer2/k0;
    //   557: aload_0
    //   558: invokespecial G : ()V
    //   561: iconst_1
    //   562: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	92	525	com/google/android/exoplayer2/ExoPlaybackException
    //   0	92	485	java/io/IOException
    //   0	92	422	java/lang/RuntimeException
    //   0	92	418	java/lang/OutOfMemoryError
    //   94	109	525	com/google/android/exoplayer2/ExoPlaybackException
    //   94	109	485	java/io/IOException
    //   94	109	422	java/lang/RuntimeException
    //   94	109	418	java/lang/OutOfMemoryError
    //   116	122	525	com/google/android/exoplayer2/ExoPlaybackException
    //   116	122	485	java/io/IOException
    //   116	122	422	java/lang/RuntimeException
    //   116	122	418	java/lang/OutOfMemoryError
    //   125	136	525	com/google/android/exoplayer2/ExoPlaybackException
    //   125	136	485	java/io/IOException
    //   125	136	422	java/lang/RuntimeException
    //   125	136	418	java/lang/OutOfMemoryError
    //   139	150	525	com/google/android/exoplayer2/ExoPlaybackException
    //   139	150	485	java/io/IOException
    //   139	150	422	java/lang/RuntimeException
    //   139	150	418	java/lang/OutOfMemoryError
    //   153	160	525	com/google/android/exoplayer2/ExoPlaybackException
    //   153	160	485	java/io/IOException
    //   153	160	422	java/lang/RuntimeException
    //   153	160	418	java/lang/OutOfMemoryError
    //   167	179	525	com/google/android/exoplayer2/ExoPlaybackException
    //   167	179	485	java/io/IOException
    //   167	179	422	java/lang/RuntimeException
    //   167	179	418	java/lang/OutOfMemoryError
    //   182	189	525	com/google/android/exoplayer2/ExoPlaybackException
    //   182	189	485	java/io/IOException
    //   182	189	422	java/lang/RuntimeException
    //   182	189	418	java/lang/OutOfMemoryError
    //   196	201	525	com/google/android/exoplayer2/ExoPlaybackException
    //   196	201	485	java/io/IOException
    //   196	201	422	java/lang/RuntimeException
    //   196	201	418	java/lang/OutOfMemoryError
    //   204	212	525	com/google/android/exoplayer2/ExoPlaybackException
    //   204	212	485	java/io/IOException
    //   204	212	422	java/lang/RuntimeException
    //   204	212	418	java/lang/OutOfMemoryError
    //   215	219	525	com/google/android/exoplayer2/ExoPlaybackException
    //   215	219	485	java/io/IOException
    //   215	219	422	java/lang/RuntimeException
    //   215	219	418	java/lang/OutOfMemoryError
    //   222	233	525	com/google/android/exoplayer2/ExoPlaybackException
    //   222	233	485	java/io/IOException
    //   222	233	422	java/lang/RuntimeException
    //   222	233	418	java/lang/OutOfMemoryError
    //   236	247	525	com/google/android/exoplayer2/ExoPlaybackException
    //   236	247	485	java/io/IOException
    //   236	247	422	java/lang/RuntimeException
    //   236	247	418	java/lang/OutOfMemoryError
    //   250	261	525	com/google/android/exoplayer2/ExoPlaybackException
    //   250	261	485	java/io/IOException
    //   250	261	422	java/lang/RuntimeException
    //   250	261	418	java/lang/OutOfMemoryError
    //   264	268	525	com/google/android/exoplayer2/ExoPlaybackException
    //   264	268	485	java/io/IOException
    //   264	268	422	java/lang/RuntimeException
    //   264	268	418	java/lang/OutOfMemoryError
    //   270	277	525	com/google/android/exoplayer2/ExoPlaybackException
    //   270	277	485	java/io/IOException
    //   270	277	422	java/lang/RuntimeException
    //   270	277	418	java/lang/OutOfMemoryError
    //   284	291	525	com/google/android/exoplayer2/ExoPlaybackException
    //   284	291	485	java/io/IOException
    //   284	291	422	java/lang/RuntimeException
    //   284	291	418	java/lang/OutOfMemoryError
    //   294	305	525	com/google/android/exoplayer2/ExoPlaybackException
    //   294	305	485	java/io/IOException
    //   294	305	422	java/lang/RuntimeException
    //   294	305	418	java/lang/OutOfMemoryError
    //   308	319	525	com/google/android/exoplayer2/ExoPlaybackException
    //   308	319	485	java/io/IOException
    //   308	319	422	java/lang/RuntimeException
    //   308	319	418	java/lang/OutOfMemoryError
    //   322	333	525	com/google/android/exoplayer2/ExoPlaybackException
    //   322	333	485	java/io/IOException
    //   322	333	422	java/lang/RuntimeException
    //   322	333	418	java/lang/OutOfMemoryError
    //   336	340	525	com/google/android/exoplayer2/ExoPlaybackException
    //   336	340	485	java/io/IOException
    //   336	340	422	java/lang/RuntimeException
    //   336	340	418	java/lang/OutOfMemoryError
    //   343	350	525	com/google/android/exoplayer2/ExoPlaybackException
    //   343	350	485	java/io/IOException
    //   343	350	422	java/lang/RuntimeException
    //   343	350	418	java/lang/OutOfMemoryError
    //   357	362	525	com/google/android/exoplayer2/ExoPlaybackException
    //   357	362	485	java/io/IOException
    //   357	362	422	java/lang/RuntimeException
    //   357	362	418	java/lang/OutOfMemoryError
    //   365	380	525	com/google/android/exoplayer2/ExoPlaybackException
    //   365	380	485	java/io/IOException
    //   365	380	422	java/lang/RuntimeException
    //   365	380	418	java/lang/OutOfMemoryError
    //   387	394	525	com/google/android/exoplayer2/ExoPlaybackException
    //   387	394	485	java/io/IOException
    //   387	394	422	java/lang/RuntimeException
    //   387	394	418	java/lang/OutOfMemoryError
    //   403	411	525	com/google/android/exoplayer2/ExoPlaybackException
    //   403	411	485	java/io/IOException
    //   403	411	422	java/lang/RuntimeException
    //   403	411	418	java/lang/OutOfMemoryError
    //   411	415	525	com/google/android/exoplayer2/ExoPlaybackException
    //   411	415	485	java/io/IOException
    //   411	415	422	java/lang/RuntimeException
    //   411	415	418	java/lang/OutOfMemoryError
  }
  
  public void l0(boolean paramBoolean) {
    this.h.a(1, paramBoolean, 0).sendToTarget();
  }
  
  public void n0(l0 paraml0) {
    this.h.f(4, paraml0).sendToTarget();
  }
  
  public void onPlaybackParametersChanged(l0 paraml0) {
    i0(paraml0, false);
  }
  
  public void p0(int paramInt) {
    this.h.a(12, paramInt, 0).sendToTarget();
  }
  
  public Looper r() {
    return this.i.getLooper();
  }
  
  public void s0(boolean paramBoolean) {
    this.h.a(13, paramBoolean, 0).sendToTarget();
  }
  
  private static final class b {
    public final v a;
    
    public final y0 b;
    
    public b(v param1v, y0 param1y0) {
      this.a = param1v;
      this.b = param1y0;
    }
  }
  
  private static final class c implements Comparable<c> {
    public final p0 b;
    
    public int c;
    
    public long d;
    
    public Object e;
    
    public c(p0 param1p0) {
      this.b = param1p0;
    }
    
    public int a(c param1c) {
      byte b2;
      Object object = this.e;
      byte b1 = 1;
      if (object == null) {
        i = 1;
      } else {
        i = 0;
      } 
      if (param1c.e == null) {
        b2 = 1;
      } else {
        b2 = 0;
      } 
      if (i != b2) {
        i = b1;
        if (object != null)
          i = -1; 
        return i;
      } 
      if (object == null)
        return 0; 
      int i = this.c - param1c.c;
      return (i != 0) ? i : h0.l(this.d, param1c.d);
    }
    
    public void e(int param1Int, long param1Long, Object param1Object) {
      this.c = param1Int;
      this.d = param1Long;
      this.e = param1Object;
    }
  }
  
  private static final class d {
    private k0 a;
    
    private int b;
    
    private boolean c;
    
    private int d;
    
    private d() {}
    
    public boolean d(k0 param1k0) {
      return (param1k0 != this.a || this.b > 0 || this.c);
    }
    
    public void e(int param1Int) {
      this.b += param1Int;
    }
    
    public void f(k0 param1k0) {
      this.a = param1k0;
      this.b = 0;
      this.c = false;
    }
    
    public void g(int param1Int) {
      boolean bool = this.c;
      boolean bool1 = true;
      if (bool && this.d != 4) {
        if (param1Int != 4)
          bool1 = false; 
        e.a(bool1);
        return;
      } 
      this.c = true;
      this.d = param1Int;
    }
  }
  
  private static final class e {
    public final y0 a;
    
    public final int b;
    
    public final long c;
    
    public e(y0 param1y0, int param1Int, long param1Long) {
      this.a = param1y0;
      this.b = param1Int;
      this.c = param1Long;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */