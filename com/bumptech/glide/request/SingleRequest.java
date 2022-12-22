package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.j.e.a;
import com.bumptech.glide.p.f;
import com.bumptech.glide.p.k;
import com.bumptech.glide.p.l.c;
import com.bumptech.glide.request.h.g;
import com.bumptech.glide.request.h.h;
import com.bumptech.glide.request.i.b;
import com.bumptech.glide.request.i.c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public final class SingleRequest<R> implements c, g, f {
  private static final boolean a = Log.isLoggable("Request", 2);
  
  private int A;
  
  private int B;
  
  private boolean C;
  
  private RuntimeException D;
  
  private final String b;
  
  private final c c;
  
  private final Object d;
  
  private final d<R> e;
  
  private final RequestCoordinator f;
  
  private final Context g;
  
  private final e h;
  
  private final Object i;
  
  private final Class<R> j;
  
  private final a<?> k;
  
  private final int l;
  
  private final int m;
  
  private final Priority n;
  
  private final h<R> o;
  
  private final List<d<R>> p;
  
  private final c<? super R> q;
  
  private final Executor r;
  
  private s<R> s;
  
  private i.d t;
  
  private long u;
  
  private volatile i v;
  
  private Status w;
  
  private Drawable x;
  
  private Drawable y;
  
  private Drawable z;
  
  private SingleRequest(Context paramContext, e parame, Object paramObject1, Object paramObject2, Class<R> paramClass, a<?> parama, int paramInt1, int paramInt2, Priority paramPriority, h<R> paramh, d<R> paramd, List<d<R>> paramList, RequestCoordinator paramRequestCoordinator, i parami, c<? super R> paramc, Executor paramExecutor) {
    String str;
    if (a) {
      str = String.valueOf(hashCode());
    } else {
      str = null;
    } 
    this.b = str;
    this.c = c.a();
    this.d = paramObject1;
    this.g = paramContext;
    this.h = parame;
    this.i = paramObject2;
    this.j = paramClass;
    this.k = parama;
    this.l = paramInt1;
    this.m = paramInt2;
    this.n = paramPriority;
    this.o = paramh;
    this.e = paramd;
    this.p = paramList;
    this.f = paramRequestCoordinator;
    this.v = parami;
    this.q = paramc;
    this.r = paramExecutor;
    this.w = Status.b;
    if (this.D == null && parame.g().a(d.c.class))
      this.D = new RuntimeException("Glide request origin trace"); 
  }
  
  private void A() {
    if (!l())
      return; 
    Drawable drawable1 = null;
    if (this.i == null)
      drawable1 = p(); 
    Drawable drawable2 = drawable1;
    if (drawable1 == null)
      drawable2 = o(); 
    drawable1 = drawable2;
    if (drawable2 == null)
      drawable1 = q(); 
    this.o.d(drawable1);
  }
  
  private void i() {
    if (!this.C)
      return; 
    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
  }
  
  private boolean k() {
    RequestCoordinator requestCoordinator = this.f;
    return (requestCoordinator == null || requestCoordinator.k(this));
  }
  
  private boolean l() {
    RequestCoordinator requestCoordinator = this.f;
    return (requestCoordinator == null || requestCoordinator.e(this));
  }
  
  private boolean m() {
    RequestCoordinator requestCoordinator = this.f;
    return (requestCoordinator == null || requestCoordinator.g(this));
  }
  
  private void n() {
    i();
    this.c.c();
    this.o.a(this);
    i.d d1 = this.t;
    if (d1 != null) {
      d1.a();
      this.t = null;
    } 
  }
  
  private Drawable o() {
    if (this.x == null) {
      Drawable drawable = this.k.s();
      this.x = drawable;
      if (drawable == null && this.k.r() > 0)
        this.x = s(this.k.r()); 
    } 
    return this.x;
  }
  
  private Drawable p() {
    if (this.z == null) {
      Drawable drawable = this.k.t();
      this.z = drawable;
      if (drawable == null && this.k.v() > 0)
        this.z = s(this.k.v()); 
    } 
    return this.z;
  }
  
  private Drawable q() {
    if (this.y == null) {
      Drawable drawable = this.k.A();
      this.y = drawable;
      if (drawable == null && this.k.B() > 0)
        this.y = s(this.k.B()); 
    } 
    return this.y;
  }
  
  private boolean r() {
    RequestCoordinator requestCoordinator = this.f;
    return (requestCoordinator == null || !requestCoordinator.c().b());
  }
  
  private Drawable s(int paramInt) {
    Resources.Theme theme;
    if (this.k.G() != null) {
      theme = this.k.G();
    } else {
      theme = this.g.getTheme();
    } 
    return a.a((Context)this.h, paramInt, theme);
  }
  
  private void t(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append(" this: ");
    stringBuilder.append(this.b);
    Log.v("Request", stringBuilder.toString());
  }
  
  private static int u(int paramInt, float paramFloat) {
    if (paramInt != Integer.MIN_VALUE)
      paramInt = Math.round(paramFloat * paramInt); 
    return paramInt;
  }
  
  private void v() {
    RequestCoordinator requestCoordinator = this.f;
    if (requestCoordinator != null)
      requestCoordinator.a(this); 
  }
  
  private void w() {
    RequestCoordinator requestCoordinator = this.f;
    if (requestCoordinator != null)
      requestCoordinator.i(this); 
  }
  
  public static <R> SingleRequest<R> x(Context paramContext, e parame, Object paramObject1, Object paramObject2, Class<R> paramClass, a<?> parama, int paramInt1, int paramInt2, Priority paramPriority, h<R> paramh, d<R> paramd, List<d<R>> paramList, RequestCoordinator paramRequestCoordinator, i parami, c<? super R> paramc, Executor paramExecutor) {
    return new SingleRequest<R>(paramContext, parame, paramObject1, paramObject2, paramClass, parama, paramInt1, paramInt2, paramPriority, paramh, paramd, paramList, paramRequestCoordinator, parami, paramc, paramExecutor);
  }
  
  private void y(GlideException paramGlideException, int paramInt) {
    this.c.c();
    synchronized (this.d) {
      paramGlideException.setOrigin(this.D);
      int j = this.h.h();
      if (j <= paramInt) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Load failed for ");
        stringBuilder.append(this.i);
        stringBuilder.append(" with size [");
        stringBuilder.append(this.A);
        stringBuilder.append("x");
        stringBuilder.append(this.B);
        stringBuilder.append("]");
        Log.w("Glide", stringBuilder.toString(), (Throwable)paramGlideException);
        if (j <= 4)
          paramGlideException.logRootCauses("Glide"); 
      } 
      this.t = null;
      this.w = Status.f;
      boolean bool = true;
      this.C = true;
      try {
        List<d<R>> list = this.p;
        if (list != null) {
          Iterator<d<R>> iterator = list.iterator();
          paramInt = 0;
          while (true) {
            j = paramInt;
            if (iterator.hasNext()) {
              boolean bool1 = paramInt | ((d<R>)iterator.next()).a(paramGlideException, this.i, this.o, r());
              continue;
            } 
            break;
          } 
        } else {
          j = 0;
        } 
        d<R> d1 = this.e;
        if (d1 != null && d1.a(paramGlideException, this.i, this.o, r())) {
          paramInt = bool;
        } else {
          paramInt = 0;
        } 
        if ((j | paramInt) == 0)
          A(); 
        this.C = false;
        return;
      } finally {
        this.C = false;
      } 
    } 
  }
  
  private void z(s<R> params, R paramR, DataSource paramDataSource, boolean paramBoolean) {
    paramBoolean = r();
    this.w = Status.e;
    this.s = params;
    if (this.h.h() <= 3) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Finished loading ");
      stringBuilder.append(paramR.getClass().getSimpleName());
      stringBuilder.append(" from ");
      stringBuilder.append(paramDataSource);
      stringBuilder.append(" for ");
      stringBuilder.append(this.i);
      stringBuilder.append(" with size [");
      stringBuilder.append(this.A);
      stringBuilder.append("x");
      stringBuilder.append(this.B);
      stringBuilder.append("] in ");
      stringBuilder.append(f.a(this.u));
      stringBuilder.append(" ms");
      Log.d("Glide", stringBuilder.toString());
    } 
    boolean bool = true;
    this.C = true;
    try {
      boolean bool1;
      boolean bool2;
      List<d<R>> list = this.p;
      if (list != null) {
        Iterator<d<R>> iterator = list.iterator();
        bool1 = false;
        while (true) {
          bool2 = bool1;
          if (iterator.hasNext()) {
            bool1 |= ((d<R>)iterator.next()).b(paramR, this.i, this.o, paramDataSource, paramBoolean);
            continue;
          } 
          break;
        } 
      } else {
        bool2 = false;
      } 
      d<R> d1 = this.e;
      if (d1 != null && d1.b(paramR, this.i, this.o, paramDataSource, paramBoolean)) {
        bool1 = bool;
      } else {
        bool1 = false;
      } 
      if ((bool1 | bool2) == 0) {
        b b = this.q.a(paramDataSource, paramBoolean);
        this.o.b(paramR, b);
      } 
      this.C = false;
      return;
    } finally {
      this.C = false;
    } 
  }
  
  public void a(GlideException paramGlideException) {
    y(paramGlideException, 5);
  }
  
  public boolean b() {
    synchronized (this.d) {
      boolean bool;
      if (this.w == Status.e) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public void c(s<?> params, DataSource paramDataSource, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Lcom/bumptech/glide/p/l/c;
    //   4: invokevirtual c : ()V
    //   7: aconst_null
    //   8: astore #4
    //   10: aconst_null
    //   11: astore #5
    //   13: aload #4
    //   15: astore #6
    //   17: aload_0
    //   18: getfield d : Ljava/lang/Object;
    //   21: astore #7
    //   23: aload #4
    //   25: astore #6
    //   27: aload #7
    //   29: monitorenter
    //   30: aload #5
    //   32: astore #6
    //   34: aload_0
    //   35: aconst_null
    //   36: putfield t : Lcom/bumptech/glide/load/engine/i$d;
    //   39: aload_1
    //   40: ifnonnull -> 133
    //   43: aload #5
    //   45: astore #6
    //   47: new com/bumptech/glide/load/engine/GlideException
    //   50: astore_2
    //   51: aload #5
    //   53: astore #6
    //   55: new java/lang/StringBuilder
    //   58: astore_1
    //   59: aload #5
    //   61: astore #6
    //   63: aload_1
    //   64: invokespecial <init> : ()V
    //   67: aload #5
    //   69: astore #6
    //   71: aload_1
    //   72: ldc_w 'Expected to receive a Resource<R> with an object of '
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: aload #5
    //   81: astore #6
    //   83: aload_1
    //   84: aload_0
    //   85: getfield j : Ljava/lang/Class;
    //   88: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   91: pop
    //   92: aload #5
    //   94: astore #6
    //   96: aload_1
    //   97: ldc_w ' inside, but instead got null.'
    //   100: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: aload #5
    //   106: astore #6
    //   108: aload_2
    //   109: aload_1
    //   110: invokevirtual toString : ()Ljava/lang/String;
    //   113: invokespecial <init> : (Ljava/lang/String;)V
    //   116: aload #5
    //   118: astore #6
    //   120: aload_0
    //   121: aload_2
    //   122: invokevirtual a : (Lcom/bumptech/glide/load/engine/GlideException;)V
    //   125: aload #5
    //   127: astore #6
    //   129: aload #7
    //   131: monitorexit
    //   132: return
    //   133: aload #5
    //   135: astore #6
    //   137: aload_1
    //   138: invokeinterface get : ()Ljava/lang/Object;
    //   143: astore #4
    //   145: aload #4
    //   147: ifnull -> 232
    //   150: aload #5
    //   152: astore #6
    //   154: aload_0
    //   155: getfield j : Ljava/lang/Class;
    //   158: aload #4
    //   160: invokevirtual getClass : ()Ljava/lang/Class;
    //   163: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   166: ifne -> 172
    //   169: goto -> 232
    //   172: aload #5
    //   174: astore #6
    //   176: aload_0
    //   177: invokespecial m : ()Z
    //   180: istore #8
    //   182: iload #8
    //   184: ifne -> 211
    //   187: aload_0
    //   188: aconst_null
    //   189: putfield s : Lcom/bumptech/glide/load/engine/s;
    //   192: aload_0
    //   193: getstatic com/bumptech/glide/request/SingleRequest$Status.e : Lcom/bumptech/glide/request/SingleRequest$Status;
    //   196: putfield w : Lcom/bumptech/glide/request/SingleRequest$Status;
    //   199: aload #7
    //   201: monitorexit
    //   202: aload_0
    //   203: getfield v : Lcom/bumptech/glide/load/engine/i;
    //   206: aload_1
    //   207: invokevirtual k : (Lcom/bumptech/glide/load/engine/s;)V
    //   210: return
    //   211: aload #5
    //   213: astore #6
    //   215: aload_0
    //   216: aload_1
    //   217: aload #4
    //   219: aload_2
    //   220: iload_3
    //   221: invokespecial z : (Lcom/bumptech/glide/load/engine/s;Ljava/lang/Object;Lcom/bumptech/glide/load/DataSource;Z)V
    //   224: aload #5
    //   226: astore #6
    //   228: aload #7
    //   230: monitorexit
    //   231: return
    //   232: aload_0
    //   233: aconst_null
    //   234: putfield s : Lcom/bumptech/glide/load/engine/s;
    //   237: new com/bumptech/glide/load/engine/GlideException
    //   240: astore #6
    //   242: new java/lang/StringBuilder
    //   245: astore #5
    //   247: aload #5
    //   249: invokespecial <init> : ()V
    //   252: aload #5
    //   254: ldc_w 'Expected to receive an object of '
    //   257: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: pop
    //   261: aload #5
    //   263: aload_0
    //   264: getfield j : Ljava/lang/Class;
    //   267: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   270: pop
    //   271: aload #5
    //   273: ldc_w ' but instead got '
    //   276: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: pop
    //   280: aload #4
    //   282: ifnull -> 294
    //   285: aload #4
    //   287: invokevirtual getClass : ()Ljava/lang/Class;
    //   290: astore_2
    //   291: goto -> 298
    //   294: ldc_w ''
    //   297: astore_2
    //   298: aload #5
    //   300: aload_2
    //   301: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   304: pop
    //   305: aload #5
    //   307: ldc_w '{'
    //   310: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: pop
    //   314: aload #5
    //   316: aload #4
    //   318: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   321: pop
    //   322: aload #5
    //   324: ldc_w '} inside Resource{'
    //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: pop
    //   331: aload #5
    //   333: aload_1
    //   334: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   337: pop
    //   338: aload #5
    //   340: ldc_w '}.'
    //   343: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: pop
    //   347: aload #4
    //   349: ifnull -> 359
    //   352: ldc_w ''
    //   355: astore_2
    //   356: goto -> 363
    //   359: ldc_w ' To indicate failure return a null Resource object, rather than a Resource object containing null data.'
    //   362: astore_2
    //   363: aload #5
    //   365: aload_2
    //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: pop
    //   370: aload #6
    //   372: aload #5
    //   374: invokevirtual toString : ()Ljava/lang/String;
    //   377: invokespecial <init> : (Ljava/lang/String;)V
    //   380: aload_0
    //   381: aload #6
    //   383: invokevirtual a : (Lcom/bumptech/glide/load/engine/GlideException;)V
    //   386: aload #7
    //   388: monitorexit
    //   389: aload_0
    //   390: getfield v : Lcom/bumptech/glide/load/engine/i;
    //   393: aload_1
    //   394: invokevirtual k : (Lcom/bumptech/glide/load/engine/s;)V
    //   397: return
    //   398: astore_2
    //   399: goto -> 406
    //   402: astore_2
    //   403: aload #6
    //   405: astore_1
    //   406: aload_1
    //   407: astore #6
    //   409: aload #7
    //   411: monitorexit
    //   412: aload_1
    //   413: astore #6
    //   415: aload_2
    //   416: athrow
    //   417: astore_1
    //   418: aload #6
    //   420: ifnull -> 432
    //   423: aload_0
    //   424: getfield v : Lcom/bumptech/glide/load/engine/i;
    //   427: aload #6
    //   429: invokevirtual k : (Lcom/bumptech/glide/load/engine/s;)V
    //   432: aload_1
    //   433: athrow
    // Exception table:
    //   from	to	target	type
    //   17	23	417	finally
    //   27	30	417	finally
    //   34	39	402	finally
    //   47	51	402	finally
    //   55	59	402	finally
    //   63	67	402	finally
    //   71	79	402	finally
    //   83	92	402	finally
    //   96	104	402	finally
    //   108	116	402	finally
    //   120	125	402	finally
    //   129	132	402	finally
    //   137	145	402	finally
    //   154	169	402	finally
    //   176	182	402	finally
    //   187	202	398	finally
    //   215	224	402	finally
    //   228	231	402	finally
    //   232	280	398	finally
    //   285	291	398	finally
    //   298	347	398	finally
    //   363	389	398	finally
    //   409	412	402	finally
    //   415	417	417	finally
  }
  
  public void clear() {
    synchronized (this.d) {
      i();
      this.c.c();
      Status status1 = this.w;
      Status status2 = Status.g;
      if (status1 == status2)
        return; 
      n();
      s<R> s1 = this.s;
      if (s1 != null) {
        this.s = null;
      } else {
        s1 = null;
      } 
      if (k())
        this.o.g(q()); 
      this.w = status2;
      if (s1 != null)
        this.v.k(s1); 
      return;
    } 
  }
  
  public boolean d(c paramc) {
    if (!(paramc instanceof SingleRequest))
      return false; 
    synchronized (this.d) {
      boolean bool;
      int j = this.l;
      int k = this.m;
      Object object = this.i;
      null = this.j;
      a<?> a1 = this.k;
      Priority priority = this.n;
      List<d<R>> list = this.p;
      if (list != null) {
        bool = list.size();
      } else {
        bool = false;
      } 
      SingleRequest singleRequest = (SingleRequest)paramc;
      synchronized (singleRequest.d) {
        boolean bool1;
        boolean bool2;
        int m = singleRequest.l;
        int n = singleRequest.m;
        Object object1 = singleRequest.i;
        Class<R> clazz = singleRequest.j;
        a<?> a2 = singleRequest.k;
        null = singleRequest.n;
        List<d<R>> list1 = singleRequest.p;
        if (list1 != null) {
          bool1 = list1.size();
        } else {
          bool1 = false;
        } 
        if (j == m && k == n && k.b(object, object1) && null.equals(clazz) && a1.equals(a2) && priority == null && bool == bool1) {
          bool2 = true;
        } else {
          bool2 = false;
        } 
        return bool2;
      } 
    } 
  }
  
  public void e(int paramInt1, int paramInt2) {
    Exception exception;
    this.c.c();
    Object object1 = this.d;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      boolean bool1 = a;
      if (bool1) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Got onSizeReady in ");
        stringBuilder.append(f.a(this.u));
        t(stringBuilder.toString());
      } 
      if (this.w != Status.d) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return;
      } 
      Status status = Status.c;
      this.w = status;
      float f1 = this.k.F();
      this.A = u(paramInt1, f1);
      this.B = u(paramInt2, f1);
      if (bool1) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("finished setup for calling load in ");
        stringBuilder.append(f.a(this.u));
        t(stringBuilder.toString());
      } 
      i i1 = this.v;
      e e1 = this.h;
      Object object = this.i;
      c c1 = this.k.E();
      paramInt1 = this.A;
      paramInt2 = this.B;
      Class<?> clazz = this.k.D();
      Class<R> clazz1 = this.j;
      Priority priority = this.n;
      h h1 = this.k.q();
      Map<Class<?>, h<?>> map = this.k.H();
      boolean bool2 = this.k.R();
      boolean bool3 = this.k.N();
      e e2 = this.k.x();
      boolean bool4 = this.k.L();
      boolean bool5 = this.k.J();
      boolean bool6 = this.k.I();
      boolean bool7 = this.k.w();
      Executor executor = this.r;
      try {
        i.d d1 = i1.f(e1, object, c1, paramInt1, paramInt2, clazz, clazz1, priority, h1, map, bool2, bool3, e2, bool4, bool5, bool6, bool7, this, executor);
        Object object3 = object1;
        try {
          this.t = d1;
          object3 = object1;
          if (this.w != status) {
            object3 = object1;
            this.t = null;
          } 
          if (bool1) {
            object3 = object1;
            StringBuilder stringBuilder = new StringBuilder();
            object3 = object1;
            this();
            object3 = object1;
            stringBuilder.append("finished onSizeReady in ");
            object3 = object1;
            stringBuilder.append(f.a(this.u));
            object3 = object1;
            t(stringBuilder.toString());
          } 
          object3 = object1;
          return;
        } finally {
          status = null;
        } 
      } finally {}
    } finally {}
    Object object2 = object1;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    throw exception;
  }
  
  public boolean f() {
    synchronized (this.d) {
      boolean bool;
      if (this.w == Status.g) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public Object g() {
    this.c.c();
    return this.d;
  }
  
  public void h() {
    synchronized (this.d) {
      i();
      this.c.c();
      this.u = f.b();
      if (this.i == null) {
        byte b;
        if (k.s(this.l, this.m)) {
          this.A = this.l;
          this.B = this.m;
        } 
        if (p() == null) {
          b = 5;
        } else {
          b = 3;
        } 
        GlideException glideException = new GlideException();
        this("Received null model");
        y(glideException, b);
        return;
      } 
      Status status2 = this.w;
      Status status1 = Status.c;
      if (status2 != status1) {
        if (status2 == Status.e) {
          c(this.s, DataSource.f, false);
          return;
        } 
        Status status = Status.d;
        this.w = status;
        if (k.s(this.l, this.m)) {
          e(this.l, this.m);
        } else {
          this.o.h(this);
        } 
        status2 = this.w;
        if ((status2 == status1 || status2 == status) && l())
          this.o.e(q()); 
        if (a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("finished run method in ");
          stringBuilder.append(f.a(this.u));
          t(stringBuilder.toString());
        } 
        return;
      } 
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
      this("Cannot restart a running request");
      throw illegalArgumentException;
    } 
  }
  
  public boolean isRunning() {
    synchronized (this.d) {
      Status status = this.w;
      if (status == Status.c || status == Status.d)
        return true; 
      return false;
    } 
  }
  
  public boolean j() {
    synchronized (this.d) {
      boolean bool;
      if (this.w == Status.e) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  public void pause() {
    synchronized (this.d) {
      if (isRunning())
        clear(); 
      return;
    } 
  }
  
  private enum Status {
    b, c, d, e, f, g;
    
    static {
      Status status1 = new Status("PENDING", 0);
      b = status1;
      Status status2 = new Status("RUNNING", 1);
      c = status2;
      Status status3 = new Status("WAITING_FOR_SIZE", 2);
      d = status3;
      Status status4 = new Status("COMPLETE", 3);
      e = status4;
      Status status5 = new Status("FAILED", 4);
      f = status5;
      Status status6 = new Status("CLEARED", 5);
      g = status6;
      h = new Status[] { status1, status2, status3, status4, status5, status6 };
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/request/SingleRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */