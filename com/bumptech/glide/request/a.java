package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.j.g.c;
import com.bumptech.glide.load.j.g.f;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.i;
import com.bumptech.glide.load.resource.bitmap.j;
import com.bumptech.glide.load.resource.bitmap.k;
import com.bumptech.glide.load.resource.bitmap.n;
import com.bumptech.glide.load.resource.bitmap.p;
import com.bumptech.glide.o.c;
import com.bumptech.glide.p.b;
import com.bumptech.glide.p.j;
import com.bumptech.glide.p.k;
import java.util.Map;

public abstract class a<T extends a<T>> implements Cloneable {
  private boolean A;
  
  private int b;
  
  private float c = 1.0F;
  
  private h d = h.e;
  
  private Priority e = Priority.d;
  
  private Drawable f;
  
  private int g;
  
  private Drawable h;
  
  private int i;
  
  private boolean j = true;
  
  private int k = -1;
  
  private int l = -1;
  
  private c m = (c)c.c();
  
  private boolean n;
  
  private boolean o = true;
  
  private Drawable p;
  
  private int q;
  
  private e r = new e();
  
  private Map<Class<?>, h<?>> s = (Map<Class<?>, h<?>>)new b();
  
  private Class<?> t = Object.class;
  
  private boolean u;
  
  private Resources.Theme v;
  
  private boolean w;
  
  private boolean x;
  
  private boolean y;
  
  private boolean z = true;
  
  private boolean O(int paramInt) {
    return P(this.b, paramInt);
  }
  
  private static boolean P(int paramInt1, int paramInt2) {
    boolean bool;
    if ((paramInt1 & paramInt2) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private T Y(DownsampleStrategy paramDownsampleStrategy, h<Bitmap> paramh) {
    return e0(paramDownsampleStrategy, paramh, false);
  }
  
  private T e0(DownsampleStrategy paramDownsampleStrategy, h<Bitmap> paramh, boolean paramBoolean) {
    if (paramBoolean) {
      paramDownsampleStrategy = (DownsampleStrategy)n0(paramDownsampleStrategy, paramh);
    } else {
      paramDownsampleStrategy = (DownsampleStrategy)Z(paramDownsampleStrategy, paramh);
    } 
    ((a)paramDownsampleStrategy).z = true;
    return (T)paramDownsampleStrategy;
  }
  
  private T f0() {
    return (T)this;
  }
  
  public final Drawable A() {
    return this.h;
  }
  
  public final int B() {
    return this.i;
  }
  
  public final Priority C() {
    return this.e;
  }
  
  public final Class<?> D() {
    return this.t;
  }
  
  public final c E() {
    return this.m;
  }
  
  public final float F() {
    return this.c;
  }
  
  public final Resources.Theme G() {
    return this.v;
  }
  
  public final Map<Class<?>, h<?>> H() {
    return this.s;
  }
  
  public final boolean I() {
    return this.A;
  }
  
  public final boolean J() {
    return this.x;
  }
  
  protected final boolean K() {
    return this.w;
  }
  
  public final boolean L() {
    return this.j;
  }
  
  public final boolean M() {
    return O(8);
  }
  
  boolean N() {
    return this.z;
  }
  
  public final boolean Q() {
    return this.o;
  }
  
  public final boolean R() {
    return this.n;
  }
  
  public final boolean S() {
    return O(2048);
  }
  
  public final boolean T() {
    return k.s(this.l, this.k);
  }
  
  public T U() {
    this.u = true;
    return f0();
  }
  
  public T V() {
    return Z(DownsampleStrategy.e, (h<Bitmap>)new i());
  }
  
  public T W() {
    return Y(DownsampleStrategy.d, (h<Bitmap>)new j());
  }
  
  public T X() {
    return Y(DownsampleStrategy.c, (h<Bitmap>)new p());
  }
  
  final T Z(DownsampleStrategy paramDownsampleStrategy, h<Bitmap> paramh) {
    if (this.w)
      return i().Z(paramDownsampleStrategy, paramh); 
    m(paramDownsampleStrategy);
    return m0(paramh, false);
  }
  
  public T a(a<?> parama) {
    if (this.w)
      return i().a(parama); 
    if (P(parama.b, 2))
      this.c = parama.c; 
    if (P(parama.b, 262144))
      this.x = parama.x; 
    if (P(parama.b, 1048576))
      this.A = parama.A; 
    if (P(parama.b, 4))
      this.d = parama.d; 
    if (P(parama.b, 8))
      this.e = parama.e; 
    if (P(parama.b, 16)) {
      this.f = parama.f;
      this.g = 0;
      this.b &= 0xFFFFFFDF;
    } 
    if (P(parama.b, 32)) {
      this.g = parama.g;
      this.f = null;
      this.b &= 0xFFFFFFEF;
    } 
    if (P(parama.b, 64)) {
      this.h = parama.h;
      this.i = 0;
      this.b &= 0xFFFFFF7F;
    } 
    if (P(parama.b, 128)) {
      this.i = parama.i;
      this.h = null;
      this.b &= 0xFFFFFFBF;
    } 
    if (P(parama.b, 256))
      this.j = parama.j; 
    if (P(parama.b, 512)) {
      this.l = parama.l;
      this.k = parama.k;
    } 
    if (P(parama.b, 1024))
      this.m = parama.m; 
    if (P(parama.b, 4096))
      this.t = parama.t; 
    if (P(parama.b, 8192)) {
      this.p = parama.p;
      this.q = 0;
      this.b &= 0xFFFFBFFF;
    } 
    if (P(parama.b, 16384)) {
      this.q = parama.q;
      this.p = null;
      this.b &= 0xFFFFDFFF;
    } 
    if (P(parama.b, 32768))
      this.v = parama.v; 
    if (P(parama.b, 65536))
      this.o = parama.o; 
    if (P(parama.b, 131072))
      this.n = parama.n; 
    if (P(parama.b, 2048)) {
      this.s.putAll(parama.s);
      this.z = parama.z;
    } 
    if (P(parama.b, 524288))
      this.y = parama.y; 
    if (!this.o) {
      this.s.clear();
      int i = this.b & 0xFFFFF7FF;
      this.b = i;
      this.n = false;
      this.b = i & 0xFFFDFFFF;
      this.z = true;
    } 
    this.b |= parama.b;
    this.r.d(parama.r);
    return g0();
  }
  
  public T a0(int paramInt1, int paramInt2) {
    if (this.w)
      return i().a0(paramInt1, paramInt2); 
    this.l = paramInt1;
    this.k = paramInt2;
    this.b |= 0x200;
    return g0();
  }
  
  public T b() {
    if (!this.u || this.w) {
      this.w = true;
      return U();
    } 
    throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
  }
  
  public T b0(int paramInt) {
    if (this.w)
      return i().b0(paramInt); 
    this.i = paramInt;
    paramInt = this.b | 0x80;
    this.b = paramInt;
    this.h = null;
    this.b = paramInt & 0xFFFFFFBF;
    return g0();
  }
  
  public T c0(Drawable paramDrawable) {
    if (this.w)
      return i().c0(paramDrawable); 
    this.h = paramDrawable;
    int i = this.b | 0x40;
    this.b = i;
    this.i = 0;
    this.b = i & 0xFFFFFF7F;
    return g0();
  }
  
  public T d0(Priority paramPriority) {
    if (this.w)
      return i().d0(paramPriority); 
    this.e = (Priority)j.d(paramPriority);
    this.b |= 0x8;
    return g0();
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof a;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (bool) {
      paramObject = paramObject;
      bool2 = bool1;
      if (Float.compare(((a)paramObject).c, this.c) == 0) {
        bool2 = bool1;
        if (this.g == ((a)paramObject).g) {
          bool2 = bool1;
          if (k.c(this.f, ((a)paramObject).f)) {
            bool2 = bool1;
            if (this.i == ((a)paramObject).i) {
              bool2 = bool1;
              if (k.c(this.h, ((a)paramObject).h)) {
                bool2 = bool1;
                if (this.q == ((a)paramObject).q) {
                  bool2 = bool1;
                  if (k.c(this.p, ((a)paramObject).p)) {
                    bool2 = bool1;
                    if (this.j == ((a)paramObject).j) {
                      bool2 = bool1;
                      if (this.k == ((a)paramObject).k) {
                        bool2 = bool1;
                        if (this.l == ((a)paramObject).l) {
                          bool2 = bool1;
                          if (this.n == ((a)paramObject).n) {
                            bool2 = bool1;
                            if (this.o == ((a)paramObject).o) {
                              bool2 = bool1;
                              if (this.x == ((a)paramObject).x) {
                                bool2 = bool1;
                                if (this.y == ((a)paramObject).y) {
                                  bool2 = bool1;
                                  if (this.d.equals(((a)paramObject).d)) {
                                    bool2 = bool1;
                                    if (this.e == ((a)paramObject).e) {
                                      bool2 = bool1;
                                      if (this.r.equals(((a)paramObject).r)) {
                                        bool2 = bool1;
                                        if (this.s.equals(((a)paramObject).s)) {
                                          bool2 = bool1;
                                          if (this.t.equals(((a)paramObject).t)) {
                                            bool2 = bool1;
                                            if (k.c(this.m, ((a)paramObject).m)) {
                                              bool2 = bool1;
                                              if (k.c(this.v, ((a)paramObject).v))
                                                bool2 = true; 
                                            } 
                                          } 
                                        } 
                                      } 
                                    } 
                                  } 
                                } 
                              } 
                            } 
                          } 
                        } 
                      } 
                    } 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
    } 
    return bool2;
  }
  
  public T f() {
    return n0(DownsampleStrategy.e, (h<Bitmap>)new i());
  }
  
  public T g() {
    return n0(DownsampleStrategy.d, (h<Bitmap>)new k());
  }
  
  protected final T g0() {
    if (!this.u)
      return f0(); 
    throw new IllegalStateException("You cannot modify locked T, consider clone()");
  }
  
  public <Y> T h0(d<Y> paramd, Y paramY) {
    if (this.w)
      return i().h0(paramd, paramY); 
    j.d(paramd);
    j.d(paramY);
    this.r.e(paramd, paramY);
    return g0();
  }
  
  public int hashCode() {
    int i = k.k(this.c);
    i = k.m(this.g, i);
    i = k.n(this.f, i);
    i = k.m(this.i, i);
    i = k.n(this.h, i);
    i = k.m(this.q, i);
    i = k.n(this.p, i);
    i = k.o(this.j, i);
    i = k.m(this.k, i);
    i = k.m(this.l, i);
    i = k.o(this.n, i);
    i = k.o(this.o, i);
    i = k.o(this.x, i);
    i = k.o(this.y, i);
    i = k.n(this.d, i);
    i = k.n(this.e, i);
    i = k.n(this.r, i);
    i = k.n(this.s, i);
    i = k.n(this.t, i);
    i = k.n(this.m, i);
    return k.n(this.v, i);
  }
  
  public T i() {
    try {
      a a1 = (a)super.clone();
      e e1 = new e();
      this();
      a1.r = e1;
      e1.d(this.r);
      b<Class<?>, h<?>> b = new b();
      this();
      a1.s = (Map<Class<?>, h<?>>)b;
      b.putAll(this.s);
      a1.u = false;
      a1.w = false;
      return (T)a1;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      throw new RuntimeException(cloneNotSupportedException);
    } 
  }
  
  public T i0(c paramc) {
    if (this.w)
      return i().i0(paramc); 
    this.m = (c)j.d(paramc);
    this.b |= 0x400;
    return g0();
  }
  
  public T j0(float paramFloat) {
    if (this.w)
      return i().j0(paramFloat); 
    if (paramFloat >= 0.0F && paramFloat <= 1.0F) {
      this.c = paramFloat;
      this.b |= 0x2;
      return g0();
    } 
    throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
  }
  
  public T k(Class<?> paramClass) {
    if (this.w)
      return i().k(paramClass); 
    this.t = (Class)j.d(paramClass);
    this.b |= 0x1000;
    return g0();
  }
  
  public T k0(boolean paramBoolean) {
    if (this.w)
      return i().k0(true); 
    this.j = paramBoolean ^ true;
    this.b |= 0x100;
    return g0();
  }
  
  public T l(h paramh) {
    if (this.w)
      return i().l(paramh); 
    this.d = (h)j.d(paramh);
    this.b |= 0x4;
    return g0();
  }
  
  public T l0(h<Bitmap> paramh) {
    return m0(paramh, true);
  }
  
  public T m(DownsampleStrategy paramDownsampleStrategy) {
    return h0(DownsampleStrategy.h, j.d(paramDownsampleStrategy));
  }
  
  T m0(h<Bitmap> paramh, boolean paramBoolean) {
    if (this.w)
      return i().m0(paramh, paramBoolean); 
    n n = new n(paramh, paramBoolean);
    o0(Bitmap.class, paramh, paramBoolean);
    o0(Drawable.class, (h<Drawable>)n, paramBoolean);
    o0(BitmapDrawable.class, n.c(), paramBoolean);
    o0(c.class, (h<c>)new f(paramh), paramBoolean);
    return g0();
  }
  
  public T n(int paramInt) {
    if (this.w)
      return i().n(paramInt); 
    this.g = paramInt;
    paramInt = this.b | 0x20;
    this.b = paramInt;
    this.f = null;
    this.b = paramInt & 0xFFFFFFEF;
    return g0();
  }
  
  final T n0(DownsampleStrategy paramDownsampleStrategy, h<Bitmap> paramh) {
    if (this.w)
      return i().n0(paramDownsampleStrategy, paramh); 
    m(paramDownsampleStrategy);
    return l0(paramh);
  }
  
  <Y> T o0(Class<Y> paramClass, h<Y> paramh, boolean paramBoolean) {
    if (this.w)
      return i().o0(paramClass, paramh, paramBoolean); 
    j.d(paramClass);
    j.d(paramh);
    this.s.put(paramClass, paramh);
    int i = this.b | 0x800;
    this.b = i;
    this.o = true;
    i |= 0x10000;
    this.b = i;
    this.z = false;
    if (paramBoolean) {
      this.b = i | 0x20000;
      this.n = true;
    } 
    return g0();
  }
  
  public T p0(boolean paramBoolean) {
    if (this.w)
      return i().p0(paramBoolean); 
    this.A = paramBoolean;
    this.b |= 0x100000;
    return g0();
  }
  
  public final h q() {
    return this.d;
  }
  
  public final int r() {
    return this.g;
  }
  
  public final Drawable s() {
    return this.f;
  }
  
  public final Drawable t() {
    return this.p;
  }
  
  public final int v() {
    return this.q;
  }
  
  public final boolean w() {
    return this.y;
  }
  
  public final e x() {
    return this.r;
  }
  
  public final int y() {
    return this.k;
  }
  
  public final int z() {
    return this.l;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/request/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */