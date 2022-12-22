package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.h1;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ap implements ac2, cd2, gh2, hj2<ti2>, mk2 {
  private static int b;
  
  private static int c;
  
  private final Context d;
  
  private final xo e;
  
  private final pc2 f;
  
  private final pc2 g;
  
  private final hi2 h;
  
  private final bo i;
  
  private bc2 j;
  
  private ByteBuffer k;
  
  private boolean l;
  
  private final WeakReference<eo> m;
  
  private kp n;
  
  private int o;
  
  private int p;
  
  private long q;
  
  private final String r;
  
  private final int s;
  
  private final ArrayList<yi2> t;
  
  private volatile wo u;
  
  private Set<WeakReference<uo>> v;
  
  public ap(Context paramContext, bo parambo, eo parameo) {
    String str;
    this.v = new HashSet<WeakReference<uo>>();
    this.d = paramContext;
    this.i = parambo;
    this.m = new WeakReference<eo>(parameo);
    xo xo1 = new xo();
    this.e = xo1;
    kg2 kg2 = kg2.a;
    xp1 xp1 = h1.a;
    gk2 gk2 = new gk2(paramContext, kg2, 0L, xp1, this, -1);
    this.f = gk2;
    qd2 qd2 = new qd2(kg2, xp1, this);
    this.g = qd2;
    gi2 gi2 = new gi2();
    this.h = gi2;
    if (b1.n()) {
      String str1 = String.valueOf(this);
      StringBuilder stringBuilder = new StringBuilder(str1.length() + 28);
      stringBuilder.append("ExoPlayerAdapter initialize ");
      stringBuilder.append(str1);
      b1.m(stringBuilder.toString());
    } 
    b++;
    int i = 0;
    bc2 bc21 = fc2.a(new pc2[] { qd2, gk2 }, gi2, xo1);
    this.j = bc21;
    bc21.c(this);
    this.o = 0;
    this.q = 0L;
    this.p = 0;
    this.t = new ArrayList<yi2>();
    this.u = null;
    if (parameo != null && parameo.g0() != null) {
      str = parameo.g0();
    } else {
      str = "";
    } 
    this.r = str;
    if (parameo != null)
      i = parameo.D0(); 
    this.s = i;
  }
  
  private final boolean I() {
    return (this.u != null && this.u.c());
  }
  
  public static int K() {
    return b;
  }
  
  public static int L() {
    return c;
  }
  
  private final mh2 O(Uri paramUri, String paramString) {
    cp cp;
    gp gp;
    oe2 oe2;
    if (this.l && this.k.limit() > 0) {
      byte[] arrayOfByte = new byte[this.k.limit()];
      this.k.get(arrayOfByte);
      cp = new cp(arrayOfByte);
    } else {
      bp bp;
      ep ep1;
      dp dp2;
      if (this.i.i > 0) {
        bp = new bp(this, (String)cp);
      } else {
        ep1 = new ep(this, (String)bp);
      } 
      ep ep2 = ep1;
      if (this.i.j)
        dp2 = new dp(this, ep1); 
      dp dp1 = dp2;
      if (this.k.limit() > 0) {
        byte[] arrayOfByte = new byte[this.k.limit()];
        this.k.get(arrayOfByte);
        gp = new gp(dp2, arrayOfByte);
      } 
    } 
    x<Boolean> x = m0.n;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      oe2 = fp.a;
    } else {
      oe2 = ip.a;
    } 
    bo bo1 = this.i;
    return new ih2(paramUri, gp, oe2, bo1.k, h1.a, this, null, bo1.g);
  }
  
  private static long U(Map<String, List<String>> paramMap) {
    if (paramMap != null)
      for (Map.Entry<String, List<String>> entry : paramMap.entrySet()) {
        if (entry != null)
          try {
            if (entry.getKey() != null && cq1.b("content-length", (CharSequence)entry.getKey()) && entry.getValue() != null && ((List)entry.getValue()).get(0) != null)
              return Long.parseLong(((List<String>)entry.getValue()).get(0)); 
          } catch (NumberFormatException numberFormatException) {} 
      }  
    return 0L;
  }
  
  public final void A() {
    bc2 bc21 = this.j;
    if (bc21 != null) {
      bc21.b(this);
      this.j.a();
      this.j = null;
      c--;
    } 
  }
  
  final void C(Surface paramSurface, boolean paramBoolean) {
    if (this.j == null)
      return; 
    cc2 cc2 = new cc2(this.f, 1, paramSurface);
    if (paramBoolean) {
      this.j.j(new cc2[] { cc2 });
      return;
    } 
    this.j.f(new cc2[] { cc2 });
  }
  
  public final void D(kp paramkp) {
    this.n = paramkp;
  }
  
  public final void E(Uri[] paramArrayOfUri, String paramString) {
    F(paramArrayOfUri, paramString, ByteBuffer.allocate(0), false);
  }
  
  public final void F(Uri[] paramArrayOfUri, String paramString, ByteBuffer paramByteBuffer, boolean paramBoolean) {
    mh2 mh2;
    if (this.j == null)
      return; 
    this.k = paramByteBuffer;
    this.l = paramBoolean;
    int i = paramArrayOfUri.length;
    byte b = 0;
    if (i == 1) {
      mh2 = O(paramArrayOfUri[0], paramString);
    } else {
      mh2[] arrayOfMh2 = new mh2[mh2.length];
      while (b < mh2.length) {
        arrayOfMh2[b] = O((Uri)mh2[b], paramString);
        b++;
      } 
      mh2 = new nh2(arrayOfMh2);
    } 
    this.j.g(mh2);
    c++;
  }
  
  public final long G() {
    return !I() ? this.o : 0L;
  }
  
  public final int H() {
    return this.p;
  }
  
  public final bc2 J() {
    return this.j;
  }
  
  public final xo M() {
    return this.e;
  }
  
  final void N(boolean paramBoolean) {
    if (this.j == null)
      return; 
    for (byte b = 0; b < this.j.h(); b++)
      this.h.f(b, paramBoolean ^ true); 
  }
  
  final void P(float paramFloat, boolean paramBoolean) {
    if (this.j == null)
      return; 
    cc2 cc2 = new cc2(this.g, 2, Float.valueOf(paramFloat));
    if (paramBoolean) {
      this.j.j(new cc2[] { cc2 });
      return;
    } 
    this.j.f(new cc2[] { cc2 });
  }
  
  public final void R(int paramInt) {
    Iterator<WeakReference<uo>> iterator = this.v.iterator();
    while (iterator.hasNext()) {
      uo uo = ((WeakReference<uo>)iterator.next()).get();
      if (uo != null)
        uo.b(paramInt); 
    } 
  }
  
  public final long V() {
    return !I() ? 0L : (!this.u.j() ? 0L : Math.min(this.o, this.u.i()));
  }
  
  public final void a() {}
  
  public final void b(int paramInt) {}
  
  public final void d(String paramString, long paramLong1, long paramLong2) {}
  
  public final void e(qc2 paramqc2) {}
  
  public final void f(vc2 paramvc2, Object paramObject) {}
  
  public final void finalize() {
    b--;
    if (b1.n()) {
      String str = String.valueOf(this);
      StringBuilder stringBuilder = new StringBuilder(str.length() + 26);
      stringBuilder.append("ExoPlayerAdapter finalize ");
      stringBuilder.append(str);
      b1.m(stringBuilder.toString());
    } 
  }
  
  public final void g(ae2 paramae2) {}
  
  public final void h(IOException paramIOException) {
    kp kp1 = this.n;
    if (kp1 != null)
      kp1.e("onLoadError", paramIOException); 
  }
  
  public final void i(int paramInt, long paramLong1, long paramLong2) {}
  
  public final void j(ae2 paramae2) {}
  
  public final void l(String paramString, long paramLong1, long paramLong2) {}
  
  public final void m(ae2 paramae2) {}
  
  public final void n(boolean paramBoolean, int paramInt) {
    kp kp1 = this.n;
    if (kp1 != null)
      kp1.f(paramInt); 
  }
  
  public final void o(Surface paramSurface) {}
  
  public final void p(zzht paramzzht) {
    eo eo = this.m.get();
    x<Boolean> x = m0.D1;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue() && eo != null && paramzzht != null) {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      hashMap.put("frameRate", String.valueOf(paramzzht.m));
      hashMap.put("bitRate", String.valueOf(paramzzht.c));
      int i = paramzzht.k;
      int j = paramzzht.l;
      StringBuilder stringBuilder = new StringBuilder(23);
      stringBuilder.append(i);
      stringBuilder.append("x");
      stringBuilder.append(j);
      hashMap.put("resolution", stringBuilder.toString());
      hashMap.put("videoMime", paramzzht.f);
      hashMap.put("videoSampleMime", paramzzht.g);
      hashMap.put("videoCodec", paramzzht.d);
      eo.B("onMetadataEvent", (Map)hashMap);
    } 
  }
  
  public final void q(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    kp kp1 = this.n;
    if (kp1 != null)
      kp1.d(paramInt1, paramInt2); 
  }
  
  public final void r(ai2 paramai2, oi2 paramoi2) {}
  
  public final void s(int paramInt, long paramLong) {
    this.p += paramInt;
  }
  
  public final void t(ae2 paramae2) {}
  
  public final void u(boolean paramBoolean) {}
  
  public final void w(zzhe paramzzhe) {
    kp kp1 = this.n;
    if (kp1 != null)
      kp1.e("onPlayerError", paramzzhe); 
  }
  
  public final void x(zzht paramzzht) {
    eo eo = this.m.get();
    x<Boolean> x = m0.D1;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue() && eo != null && paramzzht != null) {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      hashMap.put("audioMime", paramzzht.f);
      hashMap.put("audioSampleMime", paramzzht.g);
      hashMap.put("audioCodec", paramzzht.d);
      eo.B("onMetadataEvent", (Map)hashMap);
    } 
  }
  
  public final long y() {
    return this.o;
  }
  
  public final long z() {
    if (!I()) {
      while (!this.t.isEmpty())
        this.q += U(((yi2)this.t.remove(0)).getResponseHeaders()); 
      return this.q;
    } 
    return this.u.b();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */