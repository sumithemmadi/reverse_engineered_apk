package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.e;
import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.b;
import com.google.android.exoplayer2.source.e0.b;
import com.google.android.exoplayer2.source.e0.d;
import com.google.android.exoplayer2.source.hls.playlist.f;
import com.google.android.exoplayer2.source.hls.playlist.g;
import com.google.android.exoplayer2.upstream.j;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.g0;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.v;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

final class k extends d {
  private static final s j = new s();
  
  private static final AtomicInteger k = new AtomicInteger();
  
  private final boolean A;
  
  private final boolean B;
  
  private h C;
  
  private boolean D;
  
  private n E;
  
  private int F;
  
  private boolean G;
  
  private volatile boolean H;
  
  private boolean I;
  
  public final int l;
  
  public final int m;
  
  public final Uri n;
  
  private final j o;
  
  private final l p;
  
  private final h q;
  
  private final boolean r;
  
  private final boolean s;
  
  private final e0 t;
  
  private final boolean u;
  
  private final i v;
  
  private final List<Format> w;
  
  private final DrmInitData x;
  
  private final b y;
  
  private final v z;
  
  private k(i parami, j paramj1, l paraml1, Format paramFormat, boolean paramBoolean1, j paramj2, l paraml2, boolean paramBoolean2, Uri paramUri, List<Format> paramList, int paramInt1, Object paramObject, long paramLong1, long paramLong2, long paramLong3, int paramInt2, boolean paramBoolean3, boolean paramBoolean4, e0 parame0, DrmInitData paramDrmInitData, h paramh, b paramb, v paramv, boolean paramBoolean5) {
    super(paramj1, paraml1, paramFormat, paramInt1, paramObject, paramLong1, paramLong2, paramLong3);
    this.A = paramBoolean1;
    this.m = paramInt2;
    this.p = paraml2;
    this.o = paramj2;
    if (paraml2 != null) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    } 
    this.G = paramBoolean1;
    this.B = paramBoolean2;
    this.n = paramUri;
    this.r = paramBoolean4;
    this.t = parame0;
    this.s = paramBoolean3;
    this.v = parami;
    this.w = paramList;
    this.x = paramDrmInitData;
    this.q = paramh;
    this.y = paramb;
    this.z = paramv;
    this.u = paramBoolean5;
    this.l = k.getAndIncrement();
  }
  
  private static j h(j paramj, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte1 != null) {
      e.e(paramArrayOfbyte2);
      return new d(paramj, paramArrayOfbyte1, paramArrayOfbyte2);
    } 
    return paramj;
  }
  
  public static k i(i parami, j paramj, Format paramFormat, long paramLong, f paramf, int paramInt1, Uri paramUri, List<Format> paramList, int paramInt2, Object paramObject, boolean paramBoolean, o paramo, k paramk, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    b b1;
    v v1;
    boolean bool1;
    byte[] arrayOfByte;
    b b2;
    boolean bool2;
    boolean bool3;
    f.a a1 = paramf.o.get(paramInt1);
    l l1 = new l(g0.d(((g)paramf).a, a1.b), a1.k, a1.l, null);
    if (paramArrayOfbyte1 != null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool1) {
      arrayOfByte = k((String)e.e(a1.j));
    } else {
      arrayOfByte = null;
    } 
    j j1 = h(paramj, paramArrayOfbyte1, arrayOfByte);
    f.a a2 = a1.c;
    if (a2 != null) {
      if (paramArrayOfbyte2 != null) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      if (bool2) {
        paramArrayOfbyte1 = k((String)e.e(a2.j));
      } else {
        paramArrayOfbyte1 = null;
      } 
      l l4 = new l(g0.d(((g)paramf).a, a2.b), a2.k, a2.l, null);
      j j2 = h(paramj, paramArrayOfbyte2, paramArrayOfbyte1);
      l l3 = l4;
      bool3 = bool2;
    } else {
      paramArrayOfbyte1 = null;
      bool3 = false;
      paramArrayOfbyte2 = null;
    } 
    long l2 = paramLong + a1.g;
    paramLong = a1.d;
    int m = paramf.h + a1.f;
    if (paramk != null) {
      b2 = paramk.y;
      v v2 = paramk.z;
      if (!paramUri.equals(paramk.n) || !paramk.I) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      if (paramk.D && paramk.m == m && !bool2) {
        h h1 = paramk.C;
      } else {
        paramj = null;
      } 
      v1 = v2;
    } else {
      b1 = new b();
      v1 = new v(10);
      b b3 = null;
      bool2 = false;
      b2 = b1;
      b1 = b3;
    } 
    return new k(parami, j1, l1, paramFormat, bool1, (j)paramArrayOfbyte2, (l)paramArrayOfbyte1, bool3, paramUri, paramList, paramInt2, paramObject, l2, l2 + paramLong, paramf.i + paramInt1, m, a1.m, paramBoolean, paramo.a(m), a1.h, (h)b1, b2, v1, bool2);
  }
  
  @RequiresNonNull({"output"})
  private void j(j paramj, l paraml, boolean paramBoolean) {
    l l1;
    boolean bool;
    byte b1 = 0;
    if (paramBoolean) {
      boolean bool1;
      if (this.F != 0) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      l1 = paraml;
      bool = bool1;
    } else {
      l1 = paraml.e(this.F);
      bool = false;
    } 
    try {
      e e = q(paramj, l1);
      int m = b1;
      if (bool) {
        e.i(this.F);
        m = b1;
      } 
      while (!m) {
        try {
          if (!this.H)
            m = this.C.g((i)e, j); 
        } finally {
          this.F = (int)(e.a() - paraml.e);
        } 
      } 
      this.F = (int)(e.a() - paraml.e);
      return;
    } finally {
      h0.j(paramj);
    } 
  }
  
  private static byte[] k(String paramString) {
    byte b1;
    String str = paramString;
    if (h0.u0(paramString).startsWith("0x"))
      str = paramString.substring(2); 
    byte[] arrayOfByte2 = (new BigInteger(str, 16)).toByteArray();
    byte[] arrayOfByte1 = new byte[16];
    if (arrayOfByte2.length > 16) {
      b1 = arrayOfByte2.length - 16;
    } else {
      b1 = 0;
    } 
    System.arraycopy(arrayOfByte2, b1, arrayOfByte1, 16 - arrayOfByte2.length + b1, arrayOfByte2.length - b1);
    return arrayOfByte1;
  }
  
  @RequiresNonNull({"output"})
  private void n() {
    if (!this.r) {
      this.t.j();
    } else if (this.t.c() == Long.MAX_VALUE) {
      this.t.h(((b)this).f);
    } 
    j((j)((b)this).h, ((b)this).a, this.A);
  }
  
  @RequiresNonNull({"output"})
  private void o() {
    if (!this.G)
      return; 
    e.e(this.o);
    e.e(this.p);
    j(this.o, this.p, this.B);
    this.F = 0;
    this.G = false;
  }
  
  private long p(i parami) {
    parami.h();
    try {
      parami.k(this.z.a, 0, 10);
      this.z.I(10);
      if (this.z.C() != 4801587)
        return -9223372036854775807L; 
      this.z.N(3);
      int m = this.z.y();
      int i1 = m + 10;
      if (i1 > this.z.b()) {
        v v1 = this.z;
        byte[] arrayOfByte = v1.a;
        v1.I(i1);
        System.arraycopy(arrayOfByte, 0, this.z.a, 0, 10);
      } 
      parami.k(this.z.a, 10, m);
      Metadata metadata = this.y.c(this.z.a, m);
      if (metadata == null)
        return -9223372036854775807L; 
      i1 = metadata.d();
      for (m = 0; m < i1; m++) {
        Metadata.Entry entry = metadata.c(m);
        if (entry instanceof PrivFrame) {
          PrivFrame privFrame = (PrivFrame)entry;
          if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.c)) {
            System.arraycopy(privFrame.d, 0, this.z.a, 0, 8);
            this.z.I(8);
            return this.z.s() & 0x1FFFFFFFFL;
          } 
        } 
      } 
    } catch (EOFException eOFException) {}
    return -9223372036854775807L;
  }
  
  @EnsuresNonNull({"extractor"})
  @RequiresNonNull({"output"})
  private e q(j paramj, l paraml) {
    long l1 = paramj.g0(paraml);
    e e = new e(paramj, paraml.e, l1);
    if (this.C == null) {
      l1 = p((i)e);
      e.h();
      i.a a = this.v.a(this.q, paraml.a, ((b)this).c, this.w, this.t, paramj.getResponseHeaders(), (i)e);
      this.C = a.a;
      this.D = a.c;
      if (a.b) {
        n n1 = this.E;
        if (l1 != -9223372036854775807L) {
          l1 = this.t.b(l1);
        } else {
          l1 = ((b)this).f;
        } 
        n1.i0(l1);
      } else {
        this.E.i0(0L);
      } 
      this.E.V();
      this.C.h(this.E);
    } 
    this.E.f0(this.x);
    return e;
  }
  
  public void a() {
    this.H = true;
  }
  
  public void b() {
    e.e(this.E);
    if (this.C == null) {
      h h1 = this.q;
      if (h1 != null) {
        this.C = h1;
        this.D = true;
        this.G = false;
      } 
    } 
    o();
    if (!this.H) {
      if (!this.s)
        n(); 
      this.I = true;
    } 
  }
  
  public void l(n paramn) {
    this.E = paramn;
    paramn.I(this.l, this.u);
  }
  
  public boolean m() {
    return this.I;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */