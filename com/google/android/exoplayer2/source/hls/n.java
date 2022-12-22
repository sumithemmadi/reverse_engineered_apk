package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.b1.e;
import com.google.android.exoplayer2.c1.g;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.a0;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.e0.b;
import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.trackselection.f;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.u;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.r;
import com.google.android.exoplayer2.util.v;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

final class n implements Loader.b<b>, Loader.f, c0, j, a0.b {
  private static final Set<Integer> b = Collections.unmodifiableSet(new HashSet<Integer>(Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(4) })));
  
  private int A;
  
  private boolean B;
  
  private boolean C;
  
  private int D;
  
  private Format E;
  
  private Format F;
  
  private boolean G;
  
  private TrackGroupArray H;
  
  private Set<TrackGroup> I;
  
  private int[] J;
  
  private int K;
  
  private boolean L;
  
  private boolean[] M;
  
  private boolean[] N;
  
  private long O;
  
  private long P;
  
  private boolean Q;
  
  private boolean R;
  
  private boolean S;
  
  private boolean T;
  
  private long U;
  
  private DrmInitData V;
  
  private int W;
  
  private final int c;
  
  private final a d;
  
  private final g e;
  
  private final e f;
  
  private final Format g;
  
  private final k<?> h;
  
  private final u i;
  
  private final Loader j;
  
  private final w.a k;
  
  private final int l;
  
  private final g.b m;
  
  private final ArrayList<k> n;
  
  private final List<k> o;
  
  private final Runnable p;
  
  private final Runnable q;
  
  private final Handler r;
  
  private final ArrayList<m> s;
  
  private final Map<String, DrmInitData> t;
  
  private c[] u;
  
  private int[] v;
  
  private Set<Integer> w;
  
  private SparseIntArray x;
  
  private v y;
  
  private int z;
  
  public n(int paramInt1, a parama, g paramg, Map<String, DrmInitData> paramMap, e parame, long paramLong, Format paramFormat, k<?> paramk, u paramu, w.a parama1, int paramInt2) {
    this.c = paramInt1;
    this.d = parama;
    this.e = paramg;
    this.t = paramMap;
    this.f = parame;
    this.g = paramFormat;
    this.h = paramk;
    this.i = paramu;
    this.k = parama1;
    this.l = paramInt2;
    this.j = new Loader("Loader:HlsSampleStreamWrapper");
    this.m = new g.b();
    this.v = new int[0];
    Set<Integer> set = b;
    this.w = new HashSet<Integer>(set.size());
    this.x = new SparseIntArray(set.size());
    this.u = new c[0];
    this.N = new boolean[0];
    this.M = new boolean[0];
    ArrayList<k> arrayList = new ArrayList();
    this.n = arrayList;
    this.o = Collections.unmodifiableList(arrayList);
    this.s = new ArrayList<m>();
    this.p = new b(this);
    this.q = new a(this);
    this.r = new Handler();
    this.O = paramLong;
    this.P = paramLong;
  }
  
  private static boolean E(Format paramFormat1, Format paramFormat2) {
    String str1 = paramFormat1.j;
    String str2 = paramFormat2.j;
    int i = r.h(str1);
    boolean bool1 = true;
    boolean bool2 = true;
    if (i != 3) {
      if (i != r.h(str2))
        bool2 = false; 
      return bool2;
    } 
    if (!h0.b(str1, str2))
      return false; 
    if ("application/cea-608".equals(str1) || "application/cea-708".equals(str1)) {
      if (paramFormat1.C == paramFormat2.C) {
        bool2 = bool1;
      } else {
        bool2 = false;
      } 
      return bool2;
    } 
    return true;
  }
  
  private k F() {
    ArrayList<k> arrayList = this.n;
    return arrayList.get(arrayList.size() - 1);
  }
  
  private v G(int paramInt1, int paramInt2) {
    g g1;
    e.a(b.contains(Integer.valueOf(paramInt2)));
    int i = this.x.get(paramInt2, -1);
    if (i == -1)
      return null; 
    if (this.w.add(Integer.valueOf(paramInt2)))
      this.v[i] = paramInt1; 
    if (this.v[i] == paramInt1) {
      c c1 = this.u[i];
    } else {
      g1 = l(paramInt1, paramInt2);
    } 
    return (v)g1;
  }
  
  private static int H(int paramInt) {
    return (paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? 0 : 1) : 3) : 2;
  }
  
  private static boolean J(b paramb) {
    return paramb instanceof k;
  }
  
  private boolean K() {
    boolean bool;
    if (this.P != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  @EnsuresNonNull({"trackGroupToSampleQueueIndex"})
  @RequiresNonNull({"trackGroups"})
  private void O() {
    int i = this.H.c;
    int[] arrayOfInt = new int[i];
    this.J = arrayOfInt;
    Arrays.fill(arrayOfInt, -1);
    for (byte b1 = 0; b1 < i; b1++) {
      byte b2 = 0;
      while (true) {
        c[] arrayOfC = this.u;
        if (b2 < arrayOfC.length) {
          if (E(arrayOfC[b2].u(), this.H.a(b1).a(0))) {
            this.J[b1] = b2;
            break;
          } 
          b2++;
          continue;
        } 
        break;
      } 
    } 
    Iterator<m> iterator = this.s.iterator();
    while (iterator.hasNext())
      ((m)iterator.next()).d(); 
  }
  
  private void P() {
    if (!this.G && this.J == null && this.B) {
      c[] arrayOfC = this.u;
      int i = arrayOfC.length;
      for (byte b1 = 0; b1 < i; b1++) {
        if (arrayOfC[b1].u() == null)
          return; 
      } 
      if (this.H != null) {
        O();
      } else {
        j();
        g0();
        this.d.a();
      } 
    } 
  }
  
  private void X() {
    this.B = true;
    P();
  }
  
  private void b0() {
    c[] arrayOfC = this.u;
    int i = arrayOfC.length;
    for (byte b1 = 0; b1 < i; b1++)
      arrayOfC[b1].K(this.Q); 
    this.Q = false;
  }
  
  private boolean c0(long paramLong) {
    int i = this.u.length;
    for (byte b1 = 0; b1 < i; b1++) {
      if (!this.u[b1].M(paramLong, false) && (this.N[b1] || !this.L))
        return false; 
    } 
    return true;
  }
  
  @RequiresNonNull({"trackGroups", "optionalTrackGroups"})
  private void g0() {
    this.C = true;
  }
  
  @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
  private void h() {
    e.f(this.C);
    e.e(this.H);
    e.e(this.I);
  }
  
  @EnsuresNonNull({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
  private void j() {
    int i = this.u.length;
    boolean bool = false;
    byte b1 = 0;
    byte b2 = 6;
    byte b3 = -1;
    while (true) {
      byte b4 = 2;
      if (b1 < i) {
        byte b5;
        byte b6;
        String str = (this.u[b1].u()).j;
        if (!r.n(str))
          if (r.l(str)) {
            b4 = 1;
          } else if (r.m(str)) {
            b4 = 3;
          } else {
            b4 = 6;
          }  
        if (H(b4) > H(b2)) {
          b5 = b1;
          b6 = b4;
        } else {
          b6 = b2;
          b5 = b3;
          if (b4 == b2) {
            b6 = b2;
            b5 = b3;
            if (b3 != -1) {
              b5 = -1;
              b6 = b2;
            } 
          } 
        } 
        b1++;
        b2 = b6;
        b3 = b5;
        continue;
      } 
      TrackGroup trackGroup = this.e.e();
      int m = trackGroup.b;
      this.K = -1;
      this.J = new int[i];
      for (b4 = 0; b4 < i; b4++)
        this.J[b4] = b4; 
      TrackGroup[] arrayOfTrackGroup = new TrackGroup[i];
      for (b4 = 0; b4 < i; b4++) {
        Format format = this.u[b4].u();
        if (b4 == b3) {
          Format[] arrayOfFormat = new Format[m];
          if (m == 1) {
            arrayOfFormat[0] = format.h(trackGroup.a(0));
          } else {
            for (b1 = 0; b1 < m; b1++)
              arrayOfFormat[b1] = p(trackGroup.a(b1), format, true); 
          } 
          arrayOfTrackGroup[b4] = new TrackGroup(arrayOfFormat);
          this.K = b4;
        } else {
          Format format1;
          if (b2 == 2 && r.l(format.j)) {
            format1 = this.g;
          } else {
            format1 = null;
          } 
          arrayOfTrackGroup[b4] = new TrackGroup(new Format[] { p(format1, format, false) });
        } 
      } 
      this.H = o(arrayOfTrackGroup);
      if (this.I == null)
        bool = true; 
      e.f(bool);
      this.I = Collections.emptySet();
      return;
    } 
  }
  
  private static g l(int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unmapped track with id ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" of type ");
    stringBuilder.append(paramInt2);
    o.f("HlsSampleStreamWrapper", stringBuilder.toString());
    return new g();
  }
  
  private void l0(b0[] paramArrayOfb0) {
    this.s.clear();
    int i = paramArrayOfb0.length;
    for (byte b1 = 0; b1 < i; b1++) {
      b0 b01 = paramArrayOfb0[b1];
      if (b01 != null)
        this.s.add((m)b01); 
    } 
  }
  
  private a0 m(int paramInt1, int paramInt2) {
    int i = this.u.length;
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramInt2 != 1)
      if (paramInt2 == 2) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }  
    c c1 = new c(this.f, this.h, this.t);
    if (bool2)
      c1.T(this.V); 
    c1.N(this.U);
    c1.Q(this.W);
    c1.P(this);
    int[] arrayOfInt = this.v;
    int m = i + 1;
    arrayOfInt = Arrays.copyOf(arrayOfInt, m);
    this.v = arrayOfInt;
    arrayOfInt[i] = paramInt1;
    this.u = (c[])h0.d0((Object[])this.u, c1);
    boolean[] arrayOfBoolean = Arrays.copyOf(this.N, m);
    this.N = arrayOfBoolean;
    arrayOfBoolean[i] = bool2;
    bool2 = this.L;
    this.L = arrayOfBoolean[i] | bool2;
    this.w.add(Integer.valueOf(paramInt2));
    this.x.append(paramInt2, i);
    if (H(paramInt2) > H(this.z)) {
      this.A = i;
      this.z = paramInt2;
    } 
    this.M = Arrays.copyOf(this.M, m);
    return c1;
  }
  
  private TrackGroupArray o(TrackGroup[] paramArrayOfTrackGroup) {
    for (byte b1 = 0; b1 < paramArrayOfTrackGroup.length; b1++) {
      TrackGroup trackGroup = paramArrayOfTrackGroup[b1];
      Format[] arrayOfFormat = new Format[trackGroup.b];
      for (byte b2 = 0; b2 < trackGroup.b; b2++) {
        Format format1 = trackGroup.a(b2);
        DrmInitData drmInitData = format1.m;
        Format format2 = format1;
        if (drmInitData != null)
          format2 = format1.e(this.h.b(drmInitData)); 
        arrayOfFormat[b2] = format2;
      } 
      paramArrayOfTrackGroup[b1] = new TrackGroup(arrayOfFormat);
    } 
    return new TrackGroupArray(paramArrayOfTrackGroup);
  }
  
  private static Format p(Format paramFormat1, Format paramFormat2, boolean paramBoolean) {
    byte b1;
    if (paramFormat1 == null)
      return paramFormat2; 
    if (paramBoolean) {
      b1 = paramFormat1.f;
    } else {
      b1 = -1;
    } 
    int i = paramFormat1.w;
    if (i == -1)
      i = paramFormat2.w; 
    int m = r.h(paramFormat2.j);
    String str1 = h0.y(paramFormat1.g, m);
    String str2 = r.e(str1);
    String str3 = str2;
    if (str2 == null)
      str3 = paramFormat2.j; 
    return paramFormat2.c(paramFormat1.b, paramFormat1.c, str3, str1, paramFormat1.h, b1, paramFormat1.o, paramFormat1.p, i, paramFormat1.d, paramFormat1.B);
  }
  
  private boolean q(k paramk) {
    int i = paramk.l;
    int m = this.u.length;
    for (byte b1 = 0; b1 < m; b1++) {
      if (this.M[b1] && this.u[b1].D() == i)
        return false; 
    } 
    return true;
  }
  
  public TrackGroupArray C() {
    h();
    return this.H;
  }
  
  public void D(long paramLong, boolean paramBoolean) {
    if (this.B && !K()) {
      int i = this.u.length;
      for (byte b1 = 0; b1 < i; b1++)
        this.u[b1].l(paramLong, paramBoolean, this.M[b1]); 
    } 
  }
  
  public void I(int paramInt, boolean paramBoolean) {
    this.W = paramInt;
    c[] arrayOfC = this.u;
    int i = arrayOfC.length;
    boolean bool = false;
    int m;
    for (m = 0; m < i; m++)
      arrayOfC[m].Q(paramInt); 
    if (paramBoolean) {
      arrayOfC = this.u;
      m = arrayOfC.length;
      for (paramInt = bool; paramInt < m; paramInt++)
        arrayOfC[paramInt].R(); 
    } 
  }
  
  public boolean L(int paramInt) {
    boolean bool;
    if (!K() && this.u[paramInt].z(this.S)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void Q() {
    this.j.j();
    this.e.i();
  }
  
  public void R(int paramInt) {
    Q();
    this.u[paramInt].B();
  }
  
  public void S(b paramb, long paramLong1, long paramLong2, boolean paramBoolean) {
    this.k.v(paramb.a, paramb.f(), paramb.e(), paramb.b, this.c, paramb.c, paramb.d, paramb.e, paramb.f, paramb.g, paramLong1, paramLong2, paramb.c());
    if (!paramBoolean) {
      b0();
      if (this.D > 0)
        this.d.d(this); 
    } 
  }
  
  public void T(b paramb, long paramLong1, long paramLong2) {
    this.e.j(paramb);
    this.k.y(paramb.a, paramb.f(), paramb.e(), paramb.b, this.c, paramb.c, paramb.d, paramb.e, paramb.f, paramb.g, paramLong1, paramLong2, paramb.c());
    if (!this.C) {
      t(this.O);
    } else {
      this.d.d(this);
    } 
  }
  
  public Loader.c U(b paramb, long paramLong1, long paramLong2, IOException paramIOException, int paramInt) {
    boolean bool2;
    Loader.c c1;
    long l1 = paramb.c();
    boolean bool = J(paramb);
    long l2 = this.i.b(paramb.b, paramLong2, paramIOException, paramInt);
    boolean bool1 = false;
    if (l2 != -9223372036854775807L) {
      bool2 = this.e.g(paramb, l2);
    } else {
      bool2 = false;
    } 
    if (bool2) {
      if (bool && l1 == 0L) {
        ArrayList<k> arrayList = this.n;
        if ((k)arrayList.remove(arrayList.size() - 1) == paramb)
          bool1 = true; 
        e.f(bool1);
        if (this.n.isEmpty())
          this.P = this.O; 
      } 
      c1 = Loader.c;
    } else {
      l2 = this.i.a(paramb.b, paramLong2, paramIOException, paramInt);
      if (l2 != -9223372036854775807L) {
        c1 = Loader.g(false, l2);
      } else {
        c1 = Loader.d;
      } 
    } 
    this.k.B(paramb.a, paramb.f(), paramb.e(), paramb.b, this.c, paramb.c, paramb.d, paramb.e, paramb.f, paramb.g, paramLong1, paramLong2, l1, paramIOException, c1.c() ^ true);
    if (bool2)
      if (!this.C) {
        t(this.O);
      } else {
        this.d.d(this);
      }  
    return c1;
  }
  
  public void V() {
    this.w.clear();
  }
  
  public boolean W(Uri paramUri, long paramLong) {
    return this.e.k(paramUri, paramLong);
  }
  
  public void Y(TrackGroup[] paramArrayOfTrackGroup, int paramInt, int... paramVarArgs) {
    this.H = o(paramArrayOfTrackGroup);
    this.I = new HashSet<TrackGroup>();
    int i = paramVarArgs.length;
    for (byte b1 = 0; b1 < i; b1++) {
      int m = paramVarArgs[b1];
      this.I.add(this.H.a(m));
    } 
    this.K = paramInt;
    Handler handler = this.r;
    a a1 = this.d;
    a1.getClass();
    handler.post(new c(a1));
    g0();
  }
  
  public int Z(int paramInt, f0 paramf0, e parame, boolean paramBoolean) {
    if (K())
      return -3; 
    boolean bool = this.n.isEmpty();
    boolean bool1 = false;
    if (!bool) {
      byte b1;
      for (b1 = 0; b1 < this.n.size() - 1 && q(this.n.get(b1)); b1++);
      h0.j0(this.n, 0, b1);
      k k1 = this.n.get(0);
      Format format = ((b)k1).c;
      if (!format.equals(this.F))
        this.k.c(this.c, format, ((b)k1).d, ((b)k1).e, ((b)k1).f); 
      this.F = format;
    } 
    int i = this.u[paramInt].F(paramf0, parame, paramBoolean, this.S, this.O);
    if (i == -5) {
      Format format2 = (Format)e.e(paramf0.c);
      Format format1 = format2;
      if (paramInt == this.A) {
        int m = this.u[paramInt].D();
        for (paramInt = bool1; paramInt < this.n.size() && ((k)this.n.get(paramInt)).l != m; paramInt++);
        if (paramInt < this.n.size()) {
          format1 = ((b)this.n.get(paramInt)).c;
        } else {
          format1 = (Format)e.e(this.E);
        } 
        format1 = format2.h(format1);
      } 
      paramf0.c = format1;
    } 
    return i;
  }
  
  public void a(t paramt) {}
  
  public void a0() {
    if (this.C) {
      c[] arrayOfC = this.u;
      int i = arrayOfC.length;
      for (byte b1 = 0; b1 < i; b1++)
        arrayOfC[b1].E(); 
    } 
    this.j.m(this);
    this.r.removeCallbacksAndMessages(null);
    this.G = true;
    this.s.clear();
  }
  
  public void b() {
    c[] arrayOfC = this.u;
    int i = arrayOfC.length;
    for (byte b1 = 0; b1 < i; b1++)
      arrayOfC[b1].H(); 
  }
  
  public void d(Format paramFormat) {
    this.r.post(this.p);
  }
  
  public boolean d0(long paramLong, boolean paramBoolean) {
    this.O = paramLong;
    if (K()) {
      this.P = paramLong;
      return true;
    } 
    if (this.B && !paramBoolean && c0(paramLong))
      return false; 
    this.P = paramLong;
    this.S = false;
    this.n.clear();
    if (this.j.i()) {
      this.j.e();
    } else {
      this.j.f();
      b0();
    } 
    return true;
  }
  
  public boolean e0(f[] paramArrayOff, boolean[] paramArrayOfboolean1, b0[] paramArrayOfb0, boolean[] paramArrayOfboolean2, long paramLong, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial h : ()V
    //   4: aload_0
    //   5: getfield D : I
    //   8: istore #8
    //   10: iconst_0
    //   11: istore #9
    //   13: iconst_0
    //   14: istore #10
    //   16: iconst_0
    //   17: istore #11
    //   19: iload #11
    //   21: aload_1
    //   22: arraylength
    //   23: if_icmpge -> 80
    //   26: aload_3
    //   27: iload #11
    //   29: aaload
    //   30: checkcast com/google/android/exoplayer2/source/hls/m
    //   33: astore #12
    //   35: aload #12
    //   37: ifnull -> 74
    //   40: aload_1
    //   41: iload #11
    //   43: aaload
    //   44: ifnull -> 54
    //   47: aload_2
    //   48: iload #11
    //   50: baload
    //   51: ifne -> 74
    //   54: aload_0
    //   55: aload_0
    //   56: getfield D : I
    //   59: iconst_1
    //   60: isub
    //   61: putfield D : I
    //   64: aload #12
    //   66: invokevirtual f : ()V
    //   69: aload_3
    //   70: iload #11
    //   72: aconst_null
    //   73: aastore
    //   74: iinc #11, 1
    //   77: goto -> 19
    //   80: iload #7
    //   82: ifne -> 119
    //   85: aload_0
    //   86: getfield R : Z
    //   89: ifeq -> 100
    //   92: iload #8
    //   94: ifne -> 113
    //   97: goto -> 119
    //   100: lload #5
    //   102: aload_0
    //   103: getfield O : J
    //   106: lcmp
    //   107: ifeq -> 113
    //   110: goto -> 119
    //   113: iconst_0
    //   114: istore #13
    //   116: goto -> 122
    //   119: iconst_1
    //   120: istore #13
    //   122: aload_0
    //   123: getfield e : Lcom/google/android/exoplayer2/source/hls/g;
    //   126: invokevirtual f : ()Lcom/google/android/exoplayer2/trackselection/f;
    //   129: astore #14
    //   131: aload #14
    //   133: astore_2
    //   134: iconst_0
    //   135: istore #11
    //   137: iload #11
    //   139: aload_1
    //   140: arraylength
    //   141: if_icmpge -> 344
    //   144: aload_1
    //   145: iload #11
    //   147: aaload
    //   148: astore #12
    //   150: aload #12
    //   152: ifnonnull -> 165
    //   155: aload_2
    //   156: astore #12
    //   158: iload #13
    //   160: istore #15
    //   162: goto -> 331
    //   165: aload_0
    //   166: getfield H : Lcom/google/android/exoplayer2/source/TrackGroupArray;
    //   169: aload #12
    //   171: invokeinterface a : ()Lcom/google/android/exoplayer2/source/TrackGroup;
    //   176: invokevirtual b : (Lcom/google/android/exoplayer2/source/TrackGroup;)I
    //   179: istore #8
    //   181: iload #8
    //   183: aload_0
    //   184: getfield K : I
    //   187: if_icmpne -> 202
    //   190: aload_0
    //   191: getfield e : Lcom/google/android/exoplayer2/source/hls/g;
    //   194: aload #12
    //   196: invokevirtual o : (Lcom/google/android/exoplayer2/trackselection/f;)V
    //   199: aload #12
    //   201: astore_2
    //   202: aload_2
    //   203: astore #12
    //   205: iload #13
    //   207: istore #15
    //   209: aload_3
    //   210: iload #11
    //   212: aaload
    //   213: ifnonnull -> 331
    //   216: aload_0
    //   217: aload_0
    //   218: getfield D : I
    //   221: iconst_1
    //   222: iadd
    //   223: putfield D : I
    //   226: aload_3
    //   227: iload #11
    //   229: new com/google/android/exoplayer2/source/hls/m
    //   232: dup
    //   233: aload_0
    //   234: iload #8
    //   236: invokespecial <init> : (Lcom/google/android/exoplayer2/source/hls/n;I)V
    //   239: aastore
    //   240: aload #4
    //   242: iload #11
    //   244: iconst_1
    //   245: bastore
    //   246: aload_2
    //   247: astore #12
    //   249: iload #13
    //   251: istore #15
    //   253: aload_0
    //   254: getfield J : [I
    //   257: ifnull -> 331
    //   260: aload_3
    //   261: iload #11
    //   263: aaload
    //   264: checkcast com/google/android/exoplayer2/source/hls/m
    //   267: invokevirtual d : ()V
    //   270: aload_2
    //   271: astore #12
    //   273: iload #13
    //   275: istore #15
    //   277: iload #13
    //   279: ifne -> 331
    //   282: aload_0
    //   283: getfield u : [Lcom/google/android/exoplayer2/source/hls/n$c;
    //   286: aload_0
    //   287: getfield J : [I
    //   290: iload #8
    //   292: iaload
    //   293: aaload
    //   294: astore #12
    //   296: aload #12
    //   298: lload #5
    //   300: iconst_1
    //   301: invokevirtual M : (JZ)Z
    //   304: ifne -> 321
    //   307: aload #12
    //   309: invokevirtual s : ()I
    //   312: ifeq -> 321
    //   315: iconst_1
    //   316: istore #13
    //   318: goto -> 324
    //   321: iconst_0
    //   322: istore #13
    //   324: iload #13
    //   326: istore #15
    //   328: aload_2
    //   329: astore #12
    //   331: iinc #11, 1
    //   334: aload #12
    //   336: astore_2
    //   337: iload #15
    //   339: istore #13
    //   341: goto -> 137
    //   344: aload_0
    //   345: getfield D : I
    //   348: ifne -> 450
    //   351: aload_0
    //   352: getfield e : Lcom/google/android/exoplayer2/source/hls/g;
    //   355: invokevirtual l : ()V
    //   358: aload_0
    //   359: aconst_null
    //   360: putfield F : Lcom/google/android/exoplayer2/Format;
    //   363: aload_0
    //   364: iconst_1
    //   365: putfield Q : Z
    //   368: aload_0
    //   369: getfield n : Ljava/util/ArrayList;
    //   372: invokevirtual clear : ()V
    //   375: aload_0
    //   376: getfield j : Lcom/google/android/exoplayer2/upstream/Loader;
    //   379: invokevirtual i : ()Z
    //   382: ifeq -> 439
    //   385: aload_0
    //   386: getfield B : Z
    //   389: ifeq -> 425
    //   392: aload_0
    //   393: getfield u : [Lcom/google/android/exoplayer2/source/hls/n$c;
    //   396: astore_1
    //   397: aload_1
    //   398: arraylength
    //   399: istore #9
    //   401: iload #10
    //   403: istore #11
    //   405: iload #11
    //   407: iload #9
    //   409: if_icmpge -> 425
    //   412: aload_1
    //   413: iload #11
    //   415: aaload
    //   416: invokevirtual m : ()V
    //   419: iinc #11, 1
    //   422: goto -> 405
    //   425: aload_0
    //   426: getfield j : Lcom/google/android/exoplayer2/upstream/Loader;
    //   429: invokevirtual e : ()V
    //   432: iload #13
    //   434: istore #15
    //   436: goto -> 637
    //   439: aload_0
    //   440: invokespecial b0 : ()V
    //   443: iload #13
    //   445: istore #15
    //   447: goto -> 637
    //   450: aload_0
    //   451: getfield n : Ljava/util/ArrayList;
    //   454: invokevirtual isEmpty : ()Z
    //   457: ifne -> 585
    //   460: aload_2
    //   461: aload #14
    //   463: invokestatic b : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   466: ifne -> 585
    //   469: aload_0
    //   470: getfield R : Z
    //   473: ifne -> 563
    //   476: lconst_0
    //   477: lstore #16
    //   479: lload #5
    //   481: lconst_0
    //   482: lcmp
    //   483: ifge -> 491
    //   486: lload #5
    //   488: lneg
    //   489: lstore #16
    //   491: aload_0
    //   492: invokespecial F : ()Lcom/google/android/exoplayer2/source/hls/k;
    //   495: astore_1
    //   496: aload_0
    //   497: getfield e : Lcom/google/android/exoplayer2/source/hls/g;
    //   500: aload_1
    //   501: lload #5
    //   503: invokevirtual a : (Lcom/google/android/exoplayer2/source/hls/k;J)[Lcom/google/android/exoplayer2/source/e0/e;
    //   506: astore #12
    //   508: aload_2
    //   509: lload #5
    //   511: lload #16
    //   513: ldc2_w -9223372036854775807
    //   516: aload_0
    //   517: getfield o : Ljava/util/List;
    //   520: aload #12
    //   522: invokeinterface g : (JJJLjava/util/List;[Lcom/google/android/exoplayer2/source/e0/e;)V
    //   527: aload_0
    //   528: getfield e : Lcom/google/android/exoplayer2/source/hls/g;
    //   531: invokevirtual e : ()Lcom/google/android/exoplayer2/source/TrackGroup;
    //   534: aload_1
    //   535: getfield c : Lcom/google/android/exoplayer2/Format;
    //   538: invokevirtual b : (Lcom/google/android/exoplayer2/Format;)I
    //   541: istore #11
    //   543: aload_2
    //   544: invokeinterface h : ()I
    //   549: iload #11
    //   551: if_icmpeq -> 557
    //   554: goto -> 563
    //   557: iconst_0
    //   558: istore #11
    //   560: goto -> 566
    //   563: iconst_1
    //   564: istore #11
    //   566: iload #11
    //   568: ifeq -> 585
    //   571: aload_0
    //   572: iconst_1
    //   573: putfield Q : Z
    //   576: iconst_1
    //   577: istore #7
    //   579: iconst_1
    //   580: istore #13
    //   582: goto -> 585
    //   585: iload #13
    //   587: istore #15
    //   589: iload #13
    //   591: ifeq -> 637
    //   594: aload_0
    //   595: lload #5
    //   597: iload #7
    //   599: invokevirtual d0 : (JZ)Z
    //   602: pop
    //   603: iload #9
    //   605: istore #11
    //   607: iload #13
    //   609: istore #15
    //   611: iload #11
    //   613: aload_3
    //   614: arraylength
    //   615: if_icmpge -> 637
    //   618: aload_3
    //   619: iload #11
    //   621: aaload
    //   622: ifnull -> 631
    //   625: aload #4
    //   627: iload #11
    //   629: iconst_1
    //   630: bastore
    //   631: iinc #11, 1
    //   634: goto -> 607
    //   637: aload_0
    //   638: aload_3
    //   639: invokespecial l0 : ([Lcom/google/android/exoplayer2/source/b0;)V
    //   642: aload_0
    //   643: iconst_1
    //   644: putfield R : Z
    //   647: iload #15
    //   649: ireturn
  }
  
  public void f() {
    this.T = true;
    this.r.post(this.q);
  }
  
  public void f0(DrmInitData paramDrmInitData) {
    if (!h0.b(this.V, paramDrmInitData)) {
      this.V = paramDrmInitData;
      byte b1 = 0;
      while (true) {
        c[] arrayOfC = this.u;
        if (b1 < arrayOfC.length) {
          if (this.N[b1])
            arrayOfC[b1].T(paramDrmInitData); 
          b1++;
          continue;
        } 
        break;
      } 
    } 
  }
  
  public v g(int paramInt1, int paramInt2) {
    c[] arrayOfC1;
    a0 a0;
    if (b.contains(Integer.valueOf(paramInt2))) {
      v v1 = G(paramInt1, paramInt2);
    } else {
      byte b1 = 0;
      while (true) {
        arrayOfC1 = this.u;
        if (b1 < arrayOfC1.length) {
          if (this.v[b1] == paramInt1) {
            c c1 = arrayOfC1[b1];
            break;
          } 
          b1++;
          continue;
        } 
        arrayOfC1 = null;
        break;
      } 
    } 
    c[] arrayOfC2 = arrayOfC1;
    if (arrayOfC1 == null) {
      if (this.T)
        return (v)l(paramInt1, paramInt2); 
      a0 = m(paramInt1, paramInt2);
    } 
    if (paramInt2 == 4) {
      if (this.y == null)
        this.y = new b((v)a0, this.l); 
      return this.y;
    } 
    return (v)a0;
  }
  
  public void h0(boolean paramBoolean) {
    this.e.n(paramBoolean);
  }
  
  public int i(int paramInt) {
    h();
    e.e(this.J);
    int i = this.J[paramInt];
    byte b1 = -2;
    if (i == -1) {
      if (this.I.contains(this.H.a(paramInt)))
        b1 = -3; 
      return b1;
    } 
    boolean[] arrayOfBoolean = this.M;
    if (arrayOfBoolean[i])
      return -2; 
    arrayOfBoolean[i] = true;
    return i;
  }
  
  public void i0(long paramLong) {
    if (this.U != paramLong) {
      this.U = paramLong;
      c[] arrayOfC = this.u;
      int i = arrayOfC.length;
      for (byte b1 = 0; b1 < i; b1++)
        arrayOfC[b1].N(paramLong); 
    } 
  }
  
  public int j0(int paramInt, long paramLong) {
    if (K())
      return 0; 
    c c1 = this.u[paramInt];
    return (this.S && paramLong > c1.q()) ? c1.f() : c1.e(paramLong);
  }
  
  public void k() {
    if (!this.C)
      t(this.O); 
  }
  
  public void k0(int paramInt) {
    h();
    e.e(this.J);
    paramInt = this.J[paramInt];
    e.f(this.M[paramInt]);
    this.M[paramInt] = false;
  }
  
  public boolean r() {
    return this.j.i();
  }
  
  public long s() {
    long l;
    if (K())
      return this.P; 
    if (this.S) {
      l = Long.MIN_VALUE;
    } else {
      l = ((b)F()).g;
    } 
    return l;
  }
  
  public boolean t(long paramLong) {
    List<k> list;
    long l;
    if (this.S || this.j.i() || this.j.h())
      return false; 
    if (K()) {
      list = Collections.emptyList();
      l = this.P;
    } else {
      list = this.o;
      k k1 = F();
      if (k1.m()) {
        l = ((b)k1).g;
      } else {
        l = Math.max(this.O, ((b)k1).f);
      } 
    } 
    g g1 = this.e;
    if (this.C || !list.isEmpty()) {
      bool = true;
    } else {
      bool = false;
    } 
    g1.d(paramLong, l, list, bool, this.m);
    g.b b2 = this.m;
    boolean bool = b2.b;
    b b1 = b2.a;
    Uri uri = b2.c;
    b2.a();
    if (bool) {
      this.P = -9223372036854775807L;
      this.S = true;
      return true;
    } 
    if (b1 == null) {
      if (uri != null)
        this.d.e(uri); 
      return false;
    } 
    if (J(b1)) {
      this.P = -9223372036854775807L;
      k k1 = (k)b1;
      k1.l(this);
      this.n.add(k1);
      this.E = ((b)k1).c;
    } 
    paramLong = this.j.n((Loader.e)b1, this, this.i.c(b1.b));
    this.k.E(b1.a, b1.b, this.c, b1.c, b1.d, b1.e, b1.f, b1.g, paramLong);
    return true;
  }
  
  public long u() {
    if (this.S)
      return Long.MIN_VALUE; 
    if (K())
      return this.P; 
    long l1 = this.O;
    k k1 = F();
    if (!k1.m())
      if (this.n.size() > 1) {
        ArrayList<k> arrayList = this.n;
        k k2 = arrayList.get(arrayList.size() - 2);
      } else {
        k1 = null;
      }  
    long l2 = l1;
    if (k1 != null)
      l2 = Math.max(l1, ((b)k1).g); 
    l1 = l2;
    if (this.B) {
      c[] arrayOfC = this.u;
      int i = arrayOfC.length;
      byte b1 = 0;
      while (true) {
        l1 = l2;
        if (b1 < i) {
          l2 = Math.max(l2, arrayOfC[b1].q());
          b1++;
          continue;
        } 
        break;
      } 
    } 
    return l1;
  }
  
  public void v(long paramLong) {}
  
  public void x() {
    Q();
    if (!this.S || this.C)
      return; 
    throw new ParserException("Loading finished before preparation is complete.");
  }
  
  public static interface a extends c0.a<n> {
    void a();
    
    void e(Uri param1Uri);
  }
  
  private static class b implements v {
    private static final Format a = Format.t(null, "application/id3", Long.MAX_VALUE);
    
    private static final Format b = Format.t(null, "application/x-emsg", Long.MAX_VALUE);
    
    private final com.google.android.exoplayer2.metadata.emsg.a c = new com.google.android.exoplayer2.metadata.emsg.a();
    
    private final v d;
    
    private final Format e;
    
    private Format f;
    
    private byte[] g;
    
    private int h;
    
    public b(v param1v, int param1Int) {
      this.d = param1v;
      if (param1Int != 1) {
        if (param1Int == 3) {
          this.e = b;
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown metadataType: ");
          stringBuilder.append(param1Int);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        this.e = a;
      } 
      this.g = new byte[0];
      this.h = 0;
    }
    
    private boolean e(EventMessage param1EventMessage) {
      boolean bool;
      Format format = param1EventMessage.A();
      if (format != null && h0.b(this.e.j, format.j)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    private void f(int param1Int) {
      byte[] arrayOfByte = this.g;
      if (arrayOfByte.length < param1Int)
        this.g = Arrays.copyOf(arrayOfByte, param1Int + param1Int / 2); 
    }
    
    private v g(int param1Int1, int param1Int2) {
      int i = this.h - param1Int2;
      v v1 = new v(Arrays.copyOfRange(this.g, i - param1Int1, i));
      byte[] arrayOfByte = this.g;
      System.arraycopy(arrayOfByte, i, arrayOfByte, 0, param1Int2);
      this.h = param1Int2;
      return v1;
    }
    
    public int a(i param1i, int param1Int, boolean param1Boolean) {
      f(this.h + param1Int);
      param1Int = param1i.read(this.g, this.h, param1Int);
      if (param1Int == -1) {
        if (param1Boolean)
          return -1; 
        throw new EOFException();
      } 
      this.h += param1Int;
      return param1Int;
    }
    
    public void b(v param1v, int param1Int) {
      f(this.h + param1Int);
      param1v.h(this.g, this.h, param1Int);
      this.h += param1Int;
    }
    
    public void c(long param1Long, int param1Int1, int param1Int2, int param1Int3, v.a param1a) {
      StringBuilder stringBuilder;
      e.e(this.f);
      v v1 = g(param1Int2, param1Int3);
      if (!h0.b(this.f.j, this.e.j))
        if ("application/x-emsg".equals(this.f.j)) {
          EventMessage eventMessage = this.c.b(v1);
          if (!e(eventMessage)) {
            o.f("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", new Object[] { this.e.j, eventMessage.A() }));
            return;
          } 
          v1 = new v((byte[])e.e(eventMessage.l0()));
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Ignoring sample for unsupported format: ");
          stringBuilder.append(this.f.j);
          o.f("EmsgUnwrappingTrackOutput", stringBuilder.toString());
          return;
        }  
      param1Int2 = v1.a();
      this.d.b(v1, param1Int2);
      this.d.c(param1Long, param1Int1, param1Int2, param1Int3, (v.a)stringBuilder);
    }
    
    public void d(Format param1Format) {
      this.f = param1Format;
      this.d.d(this.e);
    }
  }
  
  private static final class c extends a0 {
    private final Map<String, DrmInitData> E;
    
    private DrmInitData F;
    
    public c(e param1e, k<?> param1k, Map<String, DrmInitData> param1Map) {
      super(param1e, param1k);
      this.E = param1Map;
    }
    
    private Metadata S(Metadata param1Metadata) {
      byte b;
      if (param1Metadata == null)
        return null; 
      int i = param1Metadata.d();
      int j = 0;
      int k = 0;
      while (true) {
        if (k < i) {
          Metadata.Entry entry = param1Metadata.c(k);
          if (entry instanceof PrivFrame && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame)entry).c)) {
            int m = k;
            break;
          } 
          k++;
          continue;
        } 
        b = -1;
        break;
      } 
      if (b == -1)
        return param1Metadata; 
      if (i == 1)
        return null; 
      Metadata.Entry[] arrayOfEntry = new Metadata.Entry[i - 1];
      for (k = j; k < i; k++) {
        if (k != b) {
          if (k < b) {
            j = k;
          } else {
            j = k - 1;
          } 
          arrayOfEntry[j] = param1Metadata.c(k);
        } 
      } 
      return new Metadata(arrayOfEntry);
    }
    
    public void T(DrmInitData param1DrmInitData) {
      this.F = param1DrmInitData;
      x();
    }
    
    public Format p(Format param1Format) {
      DrmInitData drmInitData1 = this.F;
      if (drmInitData1 == null)
        drmInitData1 = param1Format.m; 
      DrmInitData drmInitData2 = drmInitData1;
      if (drmInitData1 != null) {
        DrmInitData drmInitData = this.E.get(drmInitData1.d);
        drmInitData2 = drmInitData1;
        if (drmInitData != null)
          drmInitData2 = drmInitData; 
      } 
      return super.p(param1Format.a(drmInitData2, S(param1Format.h)));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */