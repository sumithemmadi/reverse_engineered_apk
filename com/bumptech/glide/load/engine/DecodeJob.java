package com.bumptech.glide.load.engine;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.y.a;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.resource.bitmap.l;
import com.bumptech.glide.p.l.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class DecodeJob<R> implements e.a, Runnable, Comparable<DecodeJob<?>>, a.f {
  private Object A;
  
  private DataSource B;
  
  private com.bumptech.glide.load.data.d<?> C;
  
  private volatile e D;
  
  private volatile boolean E;
  
  private volatile boolean F;
  
  private boolean G;
  
  private final f<R> b = new f<R>();
  
  private final List<Throwable> c = new ArrayList<Throwable>();
  
  private final com.bumptech.glide.p.l.c d = com.bumptech.glide.p.l.c.a();
  
  private final e e;
  
  private final b.h.j.f<DecodeJob<?>> f;
  
  private final d<?> g = new d();
  
  private final f h = new f();
  
  private com.bumptech.glide.e i;
  
  private com.bumptech.glide.load.c j;
  
  private Priority k;
  
  private l l;
  
  private int m;
  
  private int n;
  
  private h o;
  
  private com.bumptech.glide.load.e p;
  
  private b<R> q;
  
  private int r;
  
  private Stage s;
  
  private RunReason t;
  
  private long u;
  
  private boolean v;
  
  private Object w;
  
  private Thread x;
  
  private com.bumptech.glide.load.c y;
  
  private com.bumptech.glide.load.c z;
  
  DecodeJob(e parame, b.h.j.f<DecodeJob<?>> paramf) {
    this.e = parame;
    this.f = paramf;
  }
  
  private void A() {
    J();
    GlideException glideException = new GlideException("Failed to load resource", new ArrayList<Throwable>(this.c));
    this.q.a(glideException);
    C();
  }
  
  private void B() {
    if (this.h.b())
      F(); 
  }
  
  private void C() {
    if (this.h.c())
      F(); 
  }
  
  private void F() {
    this.h.e();
    this.g.a();
    this.b.a();
    this.E = false;
    this.i = null;
    this.j = null;
    this.p = null;
    this.k = null;
    this.l = null;
    this.q = null;
    this.s = null;
    this.D = null;
    this.x = null;
    this.y = null;
    this.A = null;
    this.B = null;
    this.C = null;
    this.u = 0L;
    this.F = false;
    this.w = null;
    this.c.clear();
    this.f.c(this);
  }
  
  private void G() {
    boolean bool2;
    this.x = Thread.currentThread();
    this.u = com.bumptech.glide.p.f.b();
    boolean bool1 = false;
    while (true) {
      bool2 = bool1;
      if (!this.F) {
        bool2 = bool1;
        if (this.D != null) {
          bool1 = this.D.b();
          bool2 = bool1;
          if (!bool1) {
            this.s = s(this.s);
            this.D = r();
            if (this.s == Stage.e) {
              e();
              return;
            } 
            continue;
          } 
        } 
      } 
      break;
    } 
    if ((this.s == Stage.g || this.F) && !bool2)
      A(); 
  }
  
  private <Data, ResourceType> s<R> H(Data paramData, DataSource paramDataSource, q<Data, ResourceType, R> paramq) {
    com.bumptech.glide.load.e e2 = t(paramDataSource);
    com.bumptech.glide.load.data.e<Data> e1 = this.i.i().l(paramData);
    try {
      int i = this.m;
      int j = this.n;
      c<ResourceType> c1 = new c();
      this(this, paramDataSource);
      return paramq.a(e1, e2, i, j, c1);
    } finally {
      e1.b();
    } 
  }
  
  private void I() {
    int i = a.a[this.t.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i == 3) {
          q();
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unrecognized run reason: ");
          stringBuilder.append(this.t);
          throw new IllegalStateException(stringBuilder.toString());
        } 
      } else {
        G();
      } 
    } else {
      this.s = s(Stage.b);
      this.D = r();
      G();
    } 
  }
  
  private void J() {
    this.d.c();
    if (this.E) {
      Throwable throwable;
      if (this.c.isEmpty()) {
        throwable = null;
      } else {
        List<Throwable> list = this.c;
        throwable = list.get(list.size() - 1);
      } 
      throw new IllegalStateException("Already notified", throwable);
    } 
    this.E = true;
  }
  
  private <Data> s<R> m(com.bumptech.glide.load.data.d<?> paramd, Data paramData, DataSource paramDataSource) {
    if (paramData == null) {
      paramd.b();
      return null;
    } 
    try {
      long l1 = com.bumptech.glide.p.f.b();
      s<?> s = n(paramData, paramDataSource);
      if (Log.isLoggable("DecodeJob", 2)) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Decoded result ");
        stringBuilder.append(s);
        w(stringBuilder.toString(), l1);
      } 
      return (s)s;
    } finally {
      paramd.b();
    } 
  }
  
  private <Data> s<R> n(Data paramData, DataSource paramDataSource) {
    return H(paramData, paramDataSource, this.b.h((Class)paramData.getClass()));
  }
  
  private void q() {
    if (Log.isLoggable("DecodeJob", 2)) {
      long l1 = this.u;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("data: ");
      stringBuilder.append(this.A);
      stringBuilder.append(", cache key: ");
      stringBuilder.append(this.y);
      stringBuilder.append(", fetcher: ");
      stringBuilder.append(this.C);
      x("Retrieved data", l1, stringBuilder.toString());
    } 
    s<?> s = null;
    try {
      s<?> s1 = m(this.C, this.A, this.B);
      s = s1;
    } catch (GlideException glideException) {
      glideException.setLoggingDetails(this.z, this.B);
      this.c.add(glideException);
    } 
    if (s != null) {
      z((s)s, this.B, this.G);
    } else {
      G();
    } 
  }
  
  private e r() {
    int i = a.b[this.s.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i == 4)
            return null; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unrecognized stage: ");
          stringBuilder.append(this.s);
          throw new IllegalStateException(stringBuilder.toString());
        } 
        return new w(this.b, this);
      } 
      return new b(this.b, this);
    } 
    return new t(this.b, this);
  }
  
  private Stage s(Stage paramStage) {
    int i = a.b[paramStage.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i != 3 && i != 4) {
          if (i == 5) {
            if (this.o.b()) {
              paramStage = Stage.c;
            } else {
              paramStage = s(Stage.c);
            } 
            return paramStage;
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unrecognized stage: ");
          stringBuilder.append(paramStage);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        return Stage.g;
      } 
      if (this.v) {
        paramStage = Stage.g;
      } else {
        paramStage = Stage.e;
      } 
      return paramStage;
    } 
    if (this.o.a()) {
      paramStage = Stage.d;
    } else {
      paramStage = s(Stage.d);
    } 
    return paramStage;
  }
  
  private com.bumptech.glide.load.e t(DataSource paramDataSource) {
    boolean bool;
    com.bumptech.glide.load.e e1 = this.p;
    if (Build.VERSION.SDK_INT < 26)
      return e1; 
    if (paramDataSource == DataSource.e || this.b.w()) {
      bool = true;
    } else {
      bool = false;
    } 
    com.bumptech.glide.load.d d1 = l.e;
    Boolean bool1 = (Boolean)e1.c(d1);
    if (bool1 != null && (!bool1.booleanValue() || bool))
      return e1; 
    e1 = new com.bumptech.glide.load.e();
    e1.d(this.p);
    e1.e(d1, Boolean.valueOf(bool));
    return e1;
  }
  
  private int u() {
    return this.k.ordinal();
  }
  
  private void w(String paramString, long paramLong) {
    x(paramString, paramLong, null);
  }
  
  private void x(String paramString1, long paramLong, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString1);
    stringBuilder.append(" in ");
    stringBuilder.append(com.bumptech.glide.p.f.a(paramLong));
    stringBuilder.append(", load key: ");
    stringBuilder.append(this.l);
    if (paramString2 != null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(", ");
      stringBuilder1.append(paramString2);
      String str = stringBuilder1.toString();
    } else {
      paramString1 = "";
    } 
    stringBuilder.append(paramString1);
    stringBuilder.append(", thread: ");
    stringBuilder.append(Thread.currentThread().getName());
    Log.v("DecodeJob", stringBuilder.toString());
  }
  
  private void y(s<R> params, DataSource paramDataSource, boolean paramBoolean) {
    J();
    this.q.c(params, paramDataSource, paramBoolean);
  }
  
  private void z(s<R> params, DataSource paramDataSource, boolean paramBoolean) {
    if (params instanceof o)
      ((o)params).D(); 
    s<R> s1 = null;
    s<R> s2 = params;
    if (this.g.c()) {
      s2 = r.e(params);
      s1 = s2;
    } 
    y(s2, paramDataSource, paramBoolean);
    this.s = Stage.f;
    try {
      if (this.g.c())
        this.g.b(this.e, this.p); 
      if (s1 != null)
        s1.g(); 
      return;
    } finally {
      if (s1 != null)
        s1.g(); 
    } 
  }
  
  <Z> s<Z> D(DataSource paramDataSource, s<Z> params) {
    s<Z> s1;
    h h1;
    EncodeStrategy encodeStrategy;
    Class<?> clazz = params.get().getClass();
    DataSource dataSource = DataSource.e;
    s<Z> s2 = null;
    if (paramDataSource != dataSource) {
      h1 = this.b.r(clazz);
      s1 = h1.b((Context)this.i, params, this.m, this.n);
    } else {
      s1 = params;
      h1 = null;
    } 
    if (!params.equals(s1))
      params.a(); 
    if (this.b.v(s1)) {
      g<Z> g = this.b.n(s1);
      encodeStrategy = g.b(this.p);
    } else {
      encodeStrategy = EncodeStrategy.d;
      params = s2;
    } 
    boolean bool = this.b.x(this.y);
    s2 = s1;
    if (this.o.d(bool ^ true, paramDataSource, encodeStrategy))
      if (params != null) {
        c c1;
        int i = a.c[encodeStrategy.ordinal()];
        if (i != 1) {
          if (i == 2) {
            u u = new u(this.b.b(), this.y, this.j, this.m, this.n, h1, clazz, this.p);
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown strategy: ");
            stringBuilder.append(encodeStrategy);
            throw new IllegalArgumentException(stringBuilder.toString());
          } 
        } else {
          c1 = new c(this.y, this.j);
        } 
        s2 = r.e(s1);
        this.g.d(c1, (g<Z>)params, (r<Z>)s2);
      } else {
        throw new Registry.NoResultEncoderAvailableException(s1.get().getClass());
      }  
    return s2;
  }
  
  void E(boolean paramBoolean) {
    if (this.h.d(paramBoolean))
      F(); 
  }
  
  boolean K() {
    Stage stage = s(Stage.b);
    return (stage == Stage.c || stage == Stage.d);
  }
  
  public void a(com.bumptech.glide.load.c paramc, Exception paramException, com.bumptech.glide.load.data.d<?> paramd, DataSource paramDataSource) {
    paramd.b();
    paramException = new GlideException("Fetching data failed", paramException);
    paramException.setLoggingDetails(paramc, paramDataSource, paramd.a());
    this.c.add(paramException);
    if (Thread.currentThread() != this.x) {
      this.t = RunReason.c;
      this.q.d(this);
    } else {
      G();
    } 
  }
  
  public void e() {
    this.t = RunReason.c;
    this.q.d(this);
  }
  
  public void f(com.bumptech.glide.load.c paramc1, Object<com.bumptech.glide.load.c> paramObject, com.bumptech.glide.load.data.d<?> paramd, DataSource paramDataSource, com.bumptech.glide.load.c paramc2) {
    this.y = paramc1;
    this.A = paramObject;
    this.C = paramd;
    this.B = paramDataSource;
    this.z = paramc2;
    paramObject = (Object<com.bumptech.glide.load.c>)this.b.c();
    boolean bool = false;
    if (paramc1 != paramObject.get(0))
      bool = true; 
    this.G = bool;
    if (Thread.currentThread() != this.x) {
      this.t = RunReason.d;
      this.q.d(this);
    } else {
      com.bumptech.glide.p.l.b.a("DecodeJob.decodeFromRetrievedData");
      try {
        q();
        return;
      } finally {
        com.bumptech.glide.p.l.b.d();
      } 
    } 
  }
  
  public com.bumptech.glide.p.l.c i() {
    return this.d;
  }
  
  public void k() {
    this.F = true;
    e e1 = this.D;
    if (e1 != null)
      e1.cancel(); 
  }
  
  public int l(DecodeJob<?> paramDecodeJob) {
    int i = u() - paramDecodeJob.u();
    int j = i;
    if (i == 0)
      j = this.r - paramDecodeJob.r; 
    return j;
  }
  
  public void run() {
    Exception exception;
    com.bumptech.glide.p.l.b.b("DecodeJob#run(model=%s)", this.w);
    com.bumptech.glide.load.data.d<?> d1 = this.C;
    try {
      if (this.F) {
        A();
        if (d1 != null)
          d1.b(); 
        return;
      } 
      I();
      if (d1 != null)
        d1.b(); 
      return;
    } catch (CallbackException null) {
      throw exception;
    } finally {
      exception = null;
    } 
    if (d1 != null)
      d1.b(); 
    com.bumptech.glide.p.l.b.d();
    throw exception;
  }
  
  DecodeJob<R> v(com.bumptech.glide.e parame, Object paramObject, l paraml, com.bumptech.glide.load.c paramc, int paramInt1, int paramInt2, Class<?> paramClass, Class<R> paramClass1, Priority paramPriority, h paramh, Map<Class<?>, h<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, com.bumptech.glide.load.e parame1, b<R> paramb, int paramInt3) {
    this.b.u(parame, paramObject, paramc, paramInt1, paramInt2, paramh, paramClass, paramClass1, paramPriority, parame1, paramMap, paramBoolean1, paramBoolean2, this.e);
    this.i = parame;
    this.j = paramc;
    this.k = paramPriority;
    this.l = paraml;
    this.m = paramInt1;
    this.n = paramInt2;
    this.o = paramh;
    this.v = paramBoolean3;
    this.p = parame1;
    this.q = paramb;
    this.r = paramInt3;
    this.t = RunReason.b;
    this.w = paramObject;
    return this;
  }
  
  private enum RunReason {
    b, c, d;
    
    static {
      RunReason runReason1 = new RunReason("INITIALIZE", 0);
      b = runReason1;
      RunReason runReason2 = new RunReason("SWITCH_TO_SOURCE_SERVICE", 1);
      c = runReason2;
      RunReason runReason3 = new RunReason("DECODE_DATA", 2);
      d = runReason3;
      e = new RunReason[] { runReason1, runReason2, runReason3 };
    }
  }
  
  private enum Stage {
    b, c, d, e, f, g;
    
    static {
      Stage stage1 = new Stage("INITIALIZE", 0);
      b = stage1;
      Stage stage2 = new Stage("RESOURCE_CACHE", 1);
      c = stage2;
      Stage stage3 = new Stage("DATA_CACHE", 2);
      d = stage3;
      Stage stage4 = new Stage("SOURCE", 3);
      e = stage4;
      Stage stage5 = new Stage("ENCODE", 4);
      f = stage5;
      Stage stage6 = new Stage("FINISHED", 5);
      g = stage6;
      h = new Stage[] { stage1, stage2, stage3, stage4, stage5, stage6 };
    }
  }
  
  static interface b<R> {
    void a(GlideException param1GlideException);
    
    void c(s<R> param1s, DataSource param1DataSource, boolean param1Boolean);
    
    void d(DecodeJob<?> param1DecodeJob);
  }
  
  private final class c<Z> implements g.a<Z> {
    private final DataSource a;
    
    c(DecodeJob this$0, DataSource param1DataSource) {
      this.a = param1DataSource;
    }
    
    public s<Z> a(s<Z> param1s) {
      return this.b.D(this.a, param1s);
    }
  }
  
  private static class d<Z> {
    private com.bumptech.glide.load.c a;
    
    private g<Z> b;
    
    private r<Z> c;
    
    void a() {
      this.a = null;
      this.b = null;
      this.c = null;
    }
    
    void b(DecodeJob.e param1e, com.bumptech.glide.load.e param1e1) {
      com.bumptech.glide.p.l.b.a("DecodeJob.encode");
      try {
        a a = param1e.a();
        com.bumptech.glide.load.c c1 = this.a;
        d d1 = new d();
        this((com.bumptech.glide.load.a)this.b, this.c, param1e1);
        a.a(c1, d1);
        return;
      } finally {
        this.c.g();
        com.bumptech.glide.p.l.b.d();
      } 
    }
    
    boolean c() {
      boolean bool;
      if (this.c != null) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    <X> void d(com.bumptech.glide.load.c param1c, g<X> param1g, r<X> param1r) {
      this.a = param1c;
      this.b = param1g;
      this.c = param1r;
    }
  }
  
  static interface e {
    a a();
  }
  
  private static class f {
    private boolean a;
    
    private boolean b;
    
    private boolean c;
    
    private boolean a(boolean param1Boolean) {
      if ((this.c || param1Boolean || this.b) && this.a) {
        param1Boolean = true;
      } else {
        param1Boolean = false;
      } 
      return param1Boolean;
    }
    
    boolean b() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: iconst_1
      //   4: putfield b : Z
      //   7: aload_0
      //   8: iconst_0
      //   9: invokespecial a : (Z)Z
      //   12: istore_1
      //   13: aload_0
      //   14: monitorexit
      //   15: iload_1
      //   16: ireturn
      //   17: astore_2
      //   18: aload_0
      //   19: monitorexit
      //   20: aload_2
      //   21: athrow
      // Exception table:
      //   from	to	target	type
      //   2	13	17	finally
    }
    
    boolean c() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: iconst_1
      //   4: putfield c : Z
      //   7: aload_0
      //   8: iconst_0
      //   9: invokespecial a : (Z)Z
      //   12: istore_1
      //   13: aload_0
      //   14: monitorexit
      //   15: iload_1
      //   16: ireturn
      //   17: astore_2
      //   18: aload_0
      //   19: monitorexit
      //   20: aload_2
      //   21: athrow
      // Exception table:
      //   from	to	target	type
      //   2	13	17	finally
    }
    
    boolean d(boolean param1Boolean) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: iconst_1
      //   4: putfield a : Z
      //   7: aload_0
      //   8: iload_1
      //   9: invokespecial a : (Z)Z
      //   12: istore_1
      //   13: aload_0
      //   14: monitorexit
      //   15: iload_1
      //   16: ireturn
      //   17: astore_2
      //   18: aload_0
      //   19: monitorexit
      //   20: aload_2
      //   21: athrow
      // Exception table:
      //   from	to	target	type
      //   2	13	17	finally
    }
    
    void e() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: iconst_0
      //   4: putfield b : Z
      //   7: aload_0
      //   8: iconst_0
      //   9: putfield a : Z
      //   12: aload_0
      //   13: iconst_0
      //   14: putfield c : Z
      //   17: aload_0
      //   18: monitorexit
      //   19: return
      //   20: astore_1
      //   21: aload_0
      //   22: monitorexit
      //   23: aload_1
      //   24: athrow
      // Exception table:
      //   from	to	target	type
      //   2	17	20	finally
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/DecodeJob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */