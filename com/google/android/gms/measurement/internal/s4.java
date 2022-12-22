package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.k.c;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.android.gms.internal.measurement.g9;
import com.google.android.gms.internal.measurement.x3;
import com.google.android.gms.internal.measurement.zzz;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;

public final class s4 implements o5 {
  private static volatile s4 a;
  
  private Boolean A;
  
  private long B;
  
  private volatile Boolean C;
  
  protected Boolean D;
  
  protected Boolean E;
  
  private volatile boolean F;
  
  private int G;
  
  private final AtomicInteger H;
  
  final long I;
  
  private final Context b;
  
  private final String c;
  
  private final String d;
  
  private final String e;
  
  private final boolean f;
  
  private final ka g;
  
  private final e h;
  
  private final e4 i;
  
  private final o3 j;
  
  private final p4 k;
  
  private final z8 l;
  
  private final u9 m;
  
  private final j3 n;
  
  private final e o;
  
  private final k7 p;
  
  private final v6 q;
  
  private final a2 r;
  
  private final z6 s;
  
  private final String t;
  
  private i3 u;
  
  private k8 v;
  
  private m w;
  
  private g3 x;
  
  private h4 y;
  
  private boolean z;
  
  s4(v5 paramv5) {
    long l;
    boolean bool = false;
    this.z = false;
    this.H = new AtomicInteger(0);
    t.j(paramv5);
    ka ka1 = new ka(paramv5.a);
    this.g = ka1;
    z2.a = ka1;
    Context context = paramv5.a;
    this.b = context;
    this.c = paramv5.b;
    this.d = paramv5.c;
    this.e = paramv5.d;
    this.f = paramv5.h;
    this.C = paramv5.e;
    this.t = paramv5.j;
    this.F = true;
    zzz zzz1 = paramv5.g;
    if (zzz1 != null) {
      Bundle bundle = zzz1.h;
      if (bundle != null) {
        Object object2 = bundle.get("measurementEnabled");
        if (object2 instanceof Boolean)
          this.D = (Boolean)object2; 
        Object object1 = zzz1.h.get("measurementDeactivated");
        if (object1 instanceof Boolean)
          this.E = (Boolean)object1; 
      } 
    } 
    x3.b(context);
    e e1 = h.d();
    this.o = e1;
    Long long_ = paramv5.i;
    if (long_ != null) {
      l = long_.longValue();
    } else {
      l = e1.a();
    } 
    this.I = l;
    this.h = new e(this);
    e4 e41 = new e4(this);
    e41.m();
    this.i = e41;
    o3 o31 = new o3(this);
    o31.m();
    this.j = o31;
    u9 u91 = new u9(this);
    u91.m();
    this.m = u91;
    j3 j31 = new j3(this);
    j31.m();
    this.n = j31;
    this.r = new a2(this);
    k7 k71 = new k7(this);
    k71.k();
    this.p = k71;
    v6 v61 = new v6(this);
    v61.k();
    this.q = v61;
    z8 z81 = new z8(this);
    z81.k();
    this.l = z81;
    z6 z61 = new z6(this);
    z61.m();
    this.s = z61;
    p4 p41 = new p4(this);
    p41.m();
    this.k = p41;
    zzz zzz2 = paramv5.g;
    if (zzz2 == null || zzz2.c == 0L)
      bool = true; 
    if (context.getApplicationContext() instanceof Application) {
      v6 v62 = F();
      if (((m5)v62).a.b.getApplicationContext() instanceof Application) {
        Application application = (Application)((m5)v62).a.b.getApplicationContext();
        if (v62.c == null)
          v62.c = new u6(v62, null); 
        if (bool) {
          application.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)v62.c);
          application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)v62.c);
          ((m5)v62).a.f().w().a("Registered activity lifecycle callback");
        } 
      } 
    } else {
      f().r().a("Application context is not an Application");
    } 
    p41.r((Runnable)new r4(this, paramv5));
  }
  
  public static s4 h(Context paramContext, zzz paramzzz, Long paramLong) {
    // Byte code:
    //   0: aload_1
    //   1: astore_3
    //   2: aload_1
    //   3: ifnull -> 53
    //   6: aload_1
    //   7: getfield f : Ljava/lang/String;
    //   10: ifnull -> 22
    //   13: aload_1
    //   14: astore_3
    //   15: aload_1
    //   16: getfield g : Ljava/lang/String;
    //   19: ifnonnull -> 53
    //   22: new com/google/android/gms/internal/measurement/zzz
    //   25: dup
    //   26: aload_1
    //   27: getfield b : J
    //   30: aload_1
    //   31: getfield c : J
    //   34: aload_1
    //   35: getfield d : Z
    //   38: aload_1
    //   39: getfield e : Ljava/lang/String;
    //   42: aconst_null
    //   43: aconst_null
    //   44: aload_1
    //   45: getfield h : Landroid/os/Bundle;
    //   48: aconst_null
    //   49: invokespecial <init> : (JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V
    //   52: astore_3
    //   53: aload_0
    //   54: invokestatic j : (Ljava/lang/Object;)Ljava/lang/Object;
    //   57: pop
    //   58: aload_0
    //   59: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   62: invokestatic j : (Ljava/lang/Object;)Ljava/lang/Object;
    //   65: pop
    //   66: getstatic com/google/android/gms/measurement/internal/s4.a : Lcom/google/android/gms/measurement/internal/s4;
    //   69: ifnonnull -> 117
    //   72: ldc com/google/android/gms/measurement/internal/s4
    //   74: monitorenter
    //   75: getstatic com/google/android/gms/measurement/internal/s4.a : Lcom/google/android/gms/measurement/internal/s4;
    //   78: ifnonnull -> 105
    //   81: new com/google/android/gms/measurement/internal/v5
    //   84: astore_1
    //   85: aload_1
    //   86: aload_0
    //   87: aload_3
    //   88: aload_2
    //   89: invokespecial <init> : (Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzz;Ljava/lang/Long;)V
    //   92: new com/google/android/gms/measurement/internal/s4
    //   95: astore_0
    //   96: aload_0
    //   97: aload_1
    //   98: invokespecial <init> : (Lcom/google/android/gms/measurement/internal/v5;)V
    //   101: aload_0
    //   102: putstatic com/google/android/gms/measurement/internal/s4.a : Lcom/google/android/gms/measurement/internal/s4;
    //   105: ldc com/google/android/gms/measurement/internal/s4
    //   107: monitorexit
    //   108: goto -> 166
    //   111: astore_0
    //   112: ldc com/google/android/gms/measurement/internal/s4
    //   114: monitorexit
    //   115: aload_0
    //   116: athrow
    //   117: aload_3
    //   118: ifnull -> 166
    //   121: aload_3
    //   122: getfield h : Landroid/os/Bundle;
    //   125: astore_0
    //   126: aload_0
    //   127: ifnull -> 166
    //   130: aload_0
    //   131: ldc_w 'dataCollectionDefaultEnabled'
    //   134: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   137: ifeq -> 166
    //   140: getstatic com/google/android/gms/measurement/internal/s4.a : Lcom/google/android/gms/measurement/internal/s4;
    //   143: invokestatic j : (Ljava/lang/Object;)Ljava/lang/Object;
    //   146: pop
    //   147: getstatic com/google/android/gms/measurement/internal/s4.a : Lcom/google/android/gms/measurement/internal/s4;
    //   150: aload_3
    //   151: getfield h : Landroid/os/Bundle;
    //   154: ldc_w 'dataCollectionDefaultEnabled'
    //   157: invokevirtual getBoolean : (Ljava/lang/String;)Z
    //   160: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   163: putfield C : Ljava/lang/Boolean;
    //   166: getstatic com/google/android/gms/measurement/internal/s4.a : Lcom/google/android/gms/measurement/internal/s4;
    //   169: invokestatic j : (Ljava/lang/Object;)Ljava/lang/Object;
    //   172: pop
    //   173: getstatic com/google/android/gms/measurement/internal/s4.a : Lcom/google/android/gms/measurement/internal/s4;
    //   176: areturn
    // Exception table:
    //   from	to	target	type
    //   75	105	111	finally
    //   105	108	111	finally
    //   112	115	111	finally
  }
  
  static final void u() {
    throw new IllegalStateException("Unexpected call on client side");
  }
  
  private static final void v(m5 paramm5) {
    if (paramm5 != null)
      return; 
    throw new IllegalStateException("Component not created");
  }
  
  private static final void w(c4 paramc4) {
    if (paramc4 != null) {
      if (paramc4.i())
        return; 
      String str = String.valueOf(paramc4.getClass());
      StringBuilder stringBuilder = new StringBuilder(str.length() + 27);
      stringBuilder.append("Component not initialized: ");
      stringBuilder.append(str);
      throw new IllegalStateException(stringBuilder.toString());
    } 
    throw new IllegalStateException("Component not created");
  }
  
  private static final void x(n5 paramn5) {
    if (paramn5 != null) {
      if (paramn5.k())
        return; 
      String str = String.valueOf(paramn5.getClass());
      StringBuilder stringBuilder = new StringBuilder(str.length() + 27);
      stringBuilder.append("Component not initialized: ");
      stringBuilder.append(str);
      throw new IllegalStateException(stringBuilder.toString());
    } 
    throw new IllegalStateException("Component not created");
  }
  
  @Pure
  public final e4 A() {
    v(this.i);
    return this.i;
  }
  
  public final o3 B() {
    o3 o31 = this.j;
    return (o31 != null && o31.k()) ? this.j : null;
  }
  
  @Pure
  public final z8 C() {
    w((c4)this.l);
    return this.l;
  }
  
  @SideEffectFree
  public final h4 D() {
    return this.y;
  }
  
  @SideEffectFree
  final p4 E() {
    return this.k;
  }
  
  @Pure
  public final v6 F() {
    w((c4)this.q);
    return this.q;
  }
  
  @Pure
  public final u9 G() {
    v(this.m);
    return this.m;
  }
  
  @Pure
  public final j3 H() {
    v((m5)this.n);
    return this.n;
  }
  
  @Pure
  public final i3 I() {
    w((c4)this.u);
    return this.u;
  }
  
  @Pure
  public final z6 J() {
    x((n5)this.s);
    return this.s;
  }
  
  @Pure
  public final boolean K() {
    return TextUtils.isEmpty(this.c);
  }
  
  @Pure
  public final String L() {
    return this.c;
  }
  
  @Pure
  public final String M() {
    return this.d;
  }
  
  @Pure
  public final String N() {
    return this.e;
  }
  
  @Pure
  public final boolean O() {
    return this.f;
  }
  
  @Pure
  public final String P() {
    return this.t;
  }
  
  @Pure
  public final k7 Q() {
    w((c4)this.p);
    return this.p;
  }
  
  @Pure
  public final k8 R() {
    w((c4)this.v);
    return this.v;
  }
  
  @Pure
  public final m S() {
    x((n5)this.w);
    return this.w;
  }
  
  @Pure
  public final Context a() {
    return this.b;
  }
  
  @Pure
  public final e b() {
    return this.o;
  }
  
  @Pure
  public final p4 c() {
    x((n5)this.k);
    return this.k;
  }
  
  @Pure
  public final ka d() {
    return this.g;
  }
  
  @Pure
  public final g3 e() {
    w(this.x);
    return this.x;
  }
  
  @Pure
  public final o3 f() {
    x(this.j);
    return this.j;
  }
  
  @Pure
  public final a2 g() {
    a2 a21 = this.r;
    if (a21 != null)
      return a21; 
    throw new IllegalStateException("Component not created");
  }
  
  final void i(boolean paramBoolean) {
    this.C = Boolean.valueOf(paramBoolean);
  }
  
  public final boolean j() {
    return (this.C != null && this.C.booleanValue());
  }
  
  public final boolean k() {
    return (l() == 0);
  }
  
  public final int l() {
    c().h();
    if (this.h.A())
      return 1; 
    Boolean bool = this.E;
    if (bool == null || !bool.booleanValue()) {
      g9.a();
      if (this.h.w(null, c3.w0)) {
        c().h();
        if (!this.F)
          return 8; 
      } 
      bool = A().r();
      if (bool != null)
        return bool.booleanValue() ? 0 : 3; 
      e e1 = this.h;
      ka ka1 = e1.a.g;
      Boolean bool1 = e1.y("firebase_analytics_collection_enabled");
      if (bool1 != null)
        return bool1.booleanValue() ? 0 : 4; 
      bool1 = this.D;
      return (bool1 != null) ? (bool1.booleanValue() ? 0 : 5) : ((this.h.w(null, c3.U) && this.C != null) ? (this.C.booleanValue() ? 0 : 7) : 0);
    } 
    return 2;
  }
  
  public final void m(boolean paramBoolean) {
    c().h();
    this.F = paramBoolean;
  }
  
  public final boolean n() {
    c().h();
    return this.F;
  }
  
  final void o() {
    this.G++;
  }
  
  final void p() {
    this.H.incrementAndGet();
  }
  
  protected final boolean q() {
    if (this.z) {
      c().h();
      Boolean bool = this.A;
      if (bool == null || this.B == 0L || (!bool.booleanValue() && Math.abs(this.o.b() - this.B) > 1000L)) {
        this.B = this.o.b();
        boolean bool1 = G().E("android.permission.INTERNET");
        boolean bool2 = true;
        if (bool1 && G().E("android.permission.ACCESS_NETWORK_STATE") && (c.a(this.b).f() || this.h.H() || (u9.a0(this.b) && u9.D(this.b, false)))) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        bool = Boolean.valueOf(bool1);
        this.A = bool;
        if (bool.booleanValue()) {
          bool1 = bool2;
          if (!G().o(e().q(), e().r(), e().s()))
            if (!TextUtils.isEmpty(e().r())) {
              bool1 = bool2;
            } else {
              bool1 = false;
            }  
          this.A = Boolean.valueOf(bool1);
        } 
      } 
      return this.A.booleanValue();
    } 
    throw new IllegalStateException("AppMeasurement is not initialized");
  }
  
  public final void r() {
    c().h();
    x((n5)J());
    String str = e().p();
    Pair<String, Boolean> pair = A().o(str);
    if (!this.h.B() || ((Boolean)pair.second).booleanValue() || TextUtils.isEmpty((CharSequence)pair.first)) {
      f().v().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
      return;
    } 
    z6 z61 = J();
    z61.l();
    ConnectivityManager connectivityManager = (ConnectivityManager)((m5)z61).a.b.getSystemService("connectivity");
    z6 z62 = null;
    z61 = z62;
    if (connectivityManager != null)
      try {
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
      } catch (SecurityException securityException) {
        z61 = z62;
      }  
    if (z61 != null && z61.isConnected()) {
      u9 u91 = G();
      (e()).a.h.p();
      URL uRL = u91.Z(39065L, str, (String)pair.first, (A()).t.a() - 1L);
      if (uRL != null) {
        z62 = J();
        q4 q4 = new q4(this);
        z62.h();
        z62.l();
        t.j(uRL);
        t.j(q4);
        ((m5)z62).a.c().u((Runnable)new y6(z62, str, uRL, null, null, q4, null));
      } 
      return;
    } 
    f().r().a("Network is not available for Deferred Deep Link request. Skipping");
  }
  
  protected final void y(zzz paramzzz) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual c : ()Lcom/google/android/gms/measurement/internal/p4;
    //   4: invokevirtual h : ()V
    //   7: invokestatic a : ()Z
    //   10: pop
    //   11: aload_0
    //   12: getfield h : Lcom/google/android/gms/measurement/internal/e;
    //   15: astore_2
    //   16: getstatic com/google/android/gms/measurement/internal/c3.w0 : Lcom/google/android/gms/measurement/internal/a3;
    //   19: astore_3
    //   20: aload_2
    //   21: aconst_null
    //   22: aload_3
    //   23: invokevirtual w : (Ljava/lang/String;Lcom/google/android/gms/measurement/internal/a3;)Z
    //   26: ifeq -> 473
    //   29: aload_0
    //   30: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   33: invokevirtual t : ()Lcom/google/android/gms/measurement/internal/f;
    //   36: astore #4
    //   38: aload_0
    //   39: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   42: astore #5
    //   44: aload #5
    //   46: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   49: astore_2
    //   50: aload #5
    //   52: invokevirtual h : ()V
    //   55: aload #5
    //   57: invokevirtual p : ()Landroid/content/SharedPreferences;
    //   60: astore_2
    //   61: bipush #100
    //   63: istore #6
    //   65: aload_2
    //   66: ldc_w 'consent_source'
    //   69: bipush #100
    //   71: invokeinterface getInt : (Ljava/lang/String;I)I
    //   76: istore #7
    //   78: aload_0
    //   79: getfield h : Lcom/google/android/gms/measurement/internal/e;
    //   82: astore_2
    //   83: getstatic com/google/android/gms/measurement/internal/c3.x0 : Lcom/google/android/gms/measurement/internal/a3;
    //   86: astore #5
    //   88: aload_2
    //   89: aconst_null
    //   90: aload #5
    //   92: invokevirtual w : (Ljava/lang/String;Lcom/google/android/gms/measurement/internal/a3;)Z
    //   95: ifeq -> 396
    //   98: aload_0
    //   99: getfield h : Lcom/google/android/gms/measurement/internal/e;
    //   102: astore #8
    //   104: aload #8
    //   106: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   109: astore_2
    //   110: invokestatic a : ()Z
    //   113: pop
    //   114: aload #8
    //   116: aconst_null
    //   117: aload #5
    //   119: invokevirtual w : (Ljava/lang/String;Lcom/google/android/gms/measurement/internal/a3;)Z
    //   122: ifne -> 130
    //   125: aconst_null
    //   126: astore_2
    //   127: goto -> 139
    //   130: aload #8
    //   132: ldc_w 'google_analytics_default_allow_ad_storage'
    //   135: invokevirtual y : (Ljava/lang/String;)Ljava/lang/Boolean;
    //   138: astore_2
    //   139: aload_0
    //   140: getfield h : Lcom/google/android/gms/measurement/internal/e;
    //   143: astore #9
    //   145: aload #9
    //   147: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   150: astore #8
    //   152: invokestatic a : ()Z
    //   155: pop
    //   156: aload #9
    //   158: aconst_null
    //   159: aload #5
    //   161: invokevirtual w : (Ljava/lang/String;Lcom/google/android/gms/measurement/internal/a3;)Z
    //   164: ifne -> 173
    //   167: aconst_null
    //   168: astore #5
    //   170: goto -> 183
    //   173: aload #9
    //   175: ldc_w 'google_analytics_default_allow_analytics_storage'
    //   178: invokevirtual y : (Ljava/lang/String;)Ljava/lang/Boolean;
    //   181: astore #5
    //   183: aload_2
    //   184: ifnonnull -> 192
    //   187: aload #5
    //   189: ifnull -> 222
    //   192: aload_0
    //   193: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   196: bipush #-10
    //   198: invokevirtual s : (I)Z
    //   201: ifeq -> 222
    //   204: new com/google/android/gms/measurement/internal/f
    //   207: dup
    //   208: aload_2
    //   209: aload #5
    //   211: invokespecial <init> : (Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    //   214: astore_1
    //   215: bipush #-10
    //   217: istore #6
    //   219: goto -> 372
    //   222: aload_0
    //   223: invokevirtual e : ()Lcom/google/android/gms/measurement/internal/g3;
    //   226: invokevirtual q : ()Ljava/lang/String;
    //   229: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   232: ifne -> 296
    //   235: iload #7
    //   237: ifeq -> 275
    //   240: iload #7
    //   242: bipush #30
    //   244: if_icmpeq -> 275
    //   247: iload #7
    //   249: bipush #10
    //   251: if_icmpeq -> 275
    //   254: iload #7
    //   256: bipush #30
    //   258: if_icmpeq -> 275
    //   261: iload #7
    //   263: bipush #30
    //   265: if_icmpeq -> 275
    //   268: iload #7
    //   270: bipush #40
    //   272: if_icmpne -> 296
    //   275: aload_0
    //   276: invokevirtual F : ()Lcom/google/android/gms/measurement/internal/v6;
    //   279: getstatic com/google/android/gms/measurement/internal/f.a : Lcom/google/android/gms/measurement/internal/f;
    //   282: bipush #-10
    //   284: aload_0
    //   285: getfield I : J
    //   288: invokevirtual V : (Lcom/google/android/gms/measurement/internal/f;IJ)V
    //   291: aconst_null
    //   292: astore_1
    //   293: goto -> 372
    //   296: invokestatic a : ()Z
    //   299: pop
    //   300: aload_0
    //   301: getfield h : Lcom/google/android/gms/measurement/internal/e;
    //   304: aconst_null
    //   305: getstatic com/google/android/gms/measurement/internal/c3.H0 : Lcom/google/android/gms/measurement/internal/a3;
    //   308: invokevirtual w : (Ljava/lang/String;Lcom/google/android/gms/measurement/internal/a3;)Z
    //   311: ifeq -> 327
    //   314: aload_0
    //   315: invokevirtual e : ()Lcom/google/android/gms/measurement/internal/g3;
    //   318: invokevirtual q : ()Ljava/lang/String;
    //   321: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   324: ifeq -> 291
    //   327: aload_1
    //   328: ifnull -> 291
    //   331: aload_1
    //   332: getfield h : Landroid/os/Bundle;
    //   335: ifnull -> 291
    //   338: aload_0
    //   339: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   342: bipush #30
    //   344: invokevirtual s : (I)Z
    //   347: ifeq -> 291
    //   350: aload_1
    //   351: getfield h : Landroid/os/Bundle;
    //   354: invokestatic b : (Landroid/os/Bundle;)Lcom/google/android/gms/measurement/internal/f;
    //   357: astore_1
    //   358: aload_1
    //   359: getstatic com/google/android/gms/measurement/internal/f.a : Lcom/google/android/gms/measurement/internal/f;
    //   362: invokevirtual equals : (Ljava/lang/Object;)Z
    //   365: ifne -> 291
    //   368: bipush #30
    //   370: istore #6
    //   372: aload #4
    //   374: astore_2
    //   375: aload_1
    //   376: ifnull -> 465
    //   379: aload_0
    //   380: invokevirtual F : ()Lcom/google/android/gms/measurement/internal/v6;
    //   383: aload_1
    //   384: iload #6
    //   386: aload_0
    //   387: getfield I : J
    //   390: invokevirtual V : (Lcom/google/android/gms/measurement/internal/f;IJ)V
    //   393: goto -> 463
    //   396: aload #4
    //   398: astore_2
    //   399: aload_1
    //   400: ifnull -> 465
    //   403: aload #4
    //   405: astore_2
    //   406: aload_1
    //   407: getfield h : Landroid/os/Bundle;
    //   410: ifnull -> 465
    //   413: aload #4
    //   415: astore_2
    //   416: aload_0
    //   417: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   420: bipush #30
    //   422: invokevirtual s : (I)Z
    //   425: ifeq -> 465
    //   428: aload_1
    //   429: getfield h : Landroid/os/Bundle;
    //   432: invokestatic b : (Landroid/os/Bundle;)Lcom/google/android/gms/measurement/internal/f;
    //   435: astore_1
    //   436: aload #4
    //   438: astore_2
    //   439: aload_1
    //   440: getstatic com/google/android/gms/measurement/internal/f.a : Lcom/google/android/gms/measurement/internal/f;
    //   443: invokevirtual equals : (Ljava/lang/Object;)Z
    //   446: ifne -> 465
    //   449: aload_0
    //   450: invokevirtual F : ()Lcom/google/android/gms/measurement/internal/v6;
    //   453: aload_1
    //   454: bipush #30
    //   456: aload_0
    //   457: getfield I : J
    //   460: invokevirtual V : (Lcom/google/android/gms/measurement/internal/f;IJ)V
    //   463: aload_1
    //   464: astore_2
    //   465: aload_0
    //   466: invokevirtual F : ()Lcom/google/android/gms/measurement/internal/v6;
    //   469: aload_2
    //   470: invokevirtual W : (Lcom/google/android/gms/measurement/internal/f;)V
    //   473: aload_0
    //   474: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   477: getfield f : Lcom/google/android/gms/measurement/internal/a4;
    //   480: invokevirtual a : ()J
    //   483: lconst_0
    //   484: lcmp
    //   485: ifne -> 522
    //   488: aload_0
    //   489: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   492: invokevirtual w : ()Lcom/google/android/gms/measurement/internal/m3;
    //   495: ldc_w 'Persisting first open'
    //   498: aload_0
    //   499: getfield I : J
    //   502: invokestatic valueOf : (J)Ljava/lang/Long;
    //   505: invokevirtual b : (Ljava/lang/String;Ljava/lang/Object;)V
    //   508: aload_0
    //   509: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   512: getfield f : Lcom/google/android/gms/measurement/internal/a4;
    //   515: aload_0
    //   516: getfield I : J
    //   519: invokevirtual b : (J)V
    //   522: aload_0
    //   523: invokevirtual F : ()Lcom/google/android/gms/measurement/internal/v6;
    //   526: getfield n : Lcom/google/android/gms/measurement/internal/ca;
    //   529: invokevirtual c : ()V
    //   532: aload_0
    //   533: invokevirtual q : ()Z
    //   536: ifne -> 684
    //   539: aload_0
    //   540: invokevirtual k : ()Z
    //   543: ifeq -> 1251
    //   546: aload_0
    //   547: invokevirtual G : ()Lcom/google/android/gms/measurement/internal/u9;
    //   550: ldc_w 'android.permission.INTERNET'
    //   553: invokevirtual E : (Ljava/lang/String;)Z
    //   556: ifne -> 572
    //   559: aload_0
    //   560: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   563: invokevirtual o : ()Lcom/google/android/gms/measurement/internal/m3;
    //   566: ldc_w 'App is missing INTERNET permission'
    //   569: invokevirtual a : (Ljava/lang/String;)V
    //   572: aload_0
    //   573: invokevirtual G : ()Lcom/google/android/gms/measurement/internal/u9;
    //   576: ldc_w 'android.permission.ACCESS_NETWORK_STATE'
    //   579: invokevirtual E : (Ljava/lang/String;)Z
    //   582: ifne -> 598
    //   585: aload_0
    //   586: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   589: invokevirtual o : ()Lcom/google/android/gms/measurement/internal/m3;
    //   592: ldc_w 'App is missing ACCESS_NETWORK_STATE permission'
    //   595: invokevirtual a : (Ljava/lang/String;)V
    //   598: aload_0
    //   599: getfield b : Landroid/content/Context;
    //   602: invokestatic a : (Landroid/content/Context;)Lcom/google/android/gms/common/k/b;
    //   605: invokevirtual f : ()Z
    //   608: ifne -> 668
    //   611: aload_0
    //   612: getfield h : Lcom/google/android/gms/measurement/internal/e;
    //   615: invokevirtual H : ()Z
    //   618: ifne -> 668
    //   621: aload_0
    //   622: getfield b : Landroid/content/Context;
    //   625: invokestatic a0 : (Landroid/content/Context;)Z
    //   628: ifne -> 644
    //   631: aload_0
    //   632: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   635: invokevirtual o : ()Lcom/google/android/gms/measurement/internal/m3;
    //   638: ldc_w 'AppMeasurementReceiver not registered/enabled'
    //   641: invokevirtual a : (Ljava/lang/String;)V
    //   644: aload_0
    //   645: getfield b : Landroid/content/Context;
    //   648: iconst_0
    //   649: invokestatic D : (Landroid/content/Context;Z)Z
    //   652: ifne -> 668
    //   655: aload_0
    //   656: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   659: invokevirtual o : ()Lcom/google/android/gms/measurement/internal/m3;
    //   662: ldc_w 'AppMeasurementService not registered/enabled'
    //   665: invokevirtual a : (Ljava/lang/String;)V
    //   668: aload_0
    //   669: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   672: invokevirtual o : ()Lcom/google/android/gms/measurement/internal/m3;
    //   675: ldc_w 'Uploading is not possible. App measurement disabled'
    //   678: invokevirtual a : (Ljava/lang/String;)V
    //   681: goto -> 1251
    //   684: aload_0
    //   685: invokevirtual e : ()Lcom/google/android/gms/measurement/internal/g3;
    //   688: invokevirtual q : ()Ljava/lang/String;
    //   691: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   694: ifeq -> 710
    //   697: aload_0
    //   698: invokevirtual e : ()Lcom/google/android/gms/measurement/internal/g3;
    //   701: invokevirtual r : ()Ljava/lang/String;
    //   704: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   707: ifne -> 994
    //   710: aload_0
    //   711: invokevirtual G : ()Lcom/google/android/gms/measurement/internal/u9;
    //   714: astore_2
    //   715: aload_0
    //   716: invokevirtual e : ()Lcom/google/android/gms/measurement/internal/g3;
    //   719: invokevirtual q : ()Ljava/lang/String;
    //   722: astore_1
    //   723: aload_0
    //   724: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   727: astore #5
    //   729: aload #5
    //   731: invokevirtual h : ()V
    //   734: aload #5
    //   736: invokevirtual p : ()Landroid/content/SharedPreferences;
    //   739: ldc_w 'gmp_app_id'
    //   742: aconst_null
    //   743: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   748: astore #8
    //   750: aload_0
    //   751: invokevirtual e : ()Lcom/google/android/gms/measurement/internal/g3;
    //   754: invokevirtual r : ()Ljava/lang/String;
    //   757: astore #4
    //   759: aload_0
    //   760: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   763: astore #5
    //   765: aload #5
    //   767: invokevirtual h : ()V
    //   770: aload_2
    //   771: aload_1
    //   772: aload #8
    //   774: aload #4
    //   776: aload #5
    //   778: invokevirtual p : ()Landroid/content/SharedPreferences;
    //   781: ldc_w 'admob_app_id'
    //   784: aconst_null
    //   785: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   790: invokevirtual p : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    //   793: ifeq -> 906
    //   796: aload_0
    //   797: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   800: invokevirtual u : ()Lcom/google/android/gms/measurement/internal/m3;
    //   803: ldc_w 'Rechecking which service to use due to a GMP App Id change'
    //   806: invokevirtual a : (Ljava/lang/String;)V
    //   809: aload_0
    //   810: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   813: astore #5
    //   815: aload #5
    //   817: invokevirtual h : ()V
    //   820: aload #5
    //   822: invokevirtual r : ()Ljava/lang/Boolean;
    //   825: astore_2
    //   826: aload #5
    //   828: invokevirtual p : ()Landroid/content/SharedPreferences;
    //   831: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   836: astore_1
    //   837: aload_1
    //   838: invokeinterface clear : ()Landroid/content/SharedPreferences$Editor;
    //   843: pop
    //   844: aload_1
    //   845: invokeinterface apply : ()V
    //   850: aload_2
    //   851: ifnull -> 860
    //   854: aload #5
    //   856: aload_2
    //   857: invokevirtual q : (Ljava/lang/Boolean;)V
    //   860: aload_0
    //   861: invokevirtual I : ()Lcom/google/android/gms/measurement/internal/i3;
    //   864: invokevirtual o : ()V
    //   867: aload_0
    //   868: getfield v : Lcom/google/android/gms/measurement/internal/k8;
    //   871: invokevirtual t : ()V
    //   874: aload_0
    //   875: getfield v : Lcom/google/android/gms/measurement/internal/k8;
    //   878: invokevirtual p : ()V
    //   881: aload_0
    //   882: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   885: getfield f : Lcom/google/android/gms/measurement/internal/a4;
    //   888: aload_0
    //   889: getfield I : J
    //   892: invokevirtual b : (J)V
    //   895: aload_0
    //   896: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   899: getfield h : Lcom/google/android/gms/measurement/internal/d4;
    //   902: aconst_null
    //   903: invokevirtual b : (Ljava/lang/String;)V
    //   906: aload_0
    //   907: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   910: astore_2
    //   911: aload_0
    //   912: invokevirtual e : ()Lcom/google/android/gms/measurement/internal/g3;
    //   915: invokevirtual q : ()Ljava/lang/String;
    //   918: astore_1
    //   919: aload_2
    //   920: invokevirtual h : ()V
    //   923: aload_2
    //   924: invokevirtual p : ()Landroid/content/SharedPreferences;
    //   927: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   932: astore_2
    //   933: aload_2
    //   934: ldc_w 'gmp_app_id'
    //   937: aload_1
    //   938: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   943: pop
    //   944: aload_2
    //   945: invokeinterface apply : ()V
    //   950: aload_0
    //   951: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   954: astore_2
    //   955: aload_0
    //   956: invokevirtual e : ()Lcom/google/android/gms/measurement/internal/g3;
    //   959: invokevirtual r : ()Ljava/lang/String;
    //   962: astore_1
    //   963: aload_2
    //   964: invokevirtual h : ()V
    //   967: aload_2
    //   968: invokevirtual p : ()Landroid/content/SharedPreferences;
    //   971: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   976: astore_2
    //   977: aload_2
    //   978: ldc_w 'admob_app_id'
    //   981: aload_1
    //   982: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   987: pop
    //   988: aload_2
    //   989: invokeinterface apply : ()V
    //   994: invokestatic a : ()Z
    //   997: pop
    //   998: aload_0
    //   999: getfield h : Lcom/google/android/gms/measurement/internal/e;
    //   1002: aconst_null
    //   1003: aload_3
    //   1004: invokevirtual w : (Ljava/lang/String;Lcom/google/android/gms/measurement/internal/a3;)Z
    //   1007: ifeq -> 1034
    //   1010: aload_0
    //   1011: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   1014: invokevirtual t : ()Lcom/google/android/gms/measurement/internal/f;
    //   1017: invokevirtual h : ()Z
    //   1020: ifne -> 1034
    //   1023: aload_0
    //   1024: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   1027: getfield h : Lcom/google/android/gms/measurement/internal/d4;
    //   1030: aconst_null
    //   1031: invokevirtual b : (Ljava/lang/String;)V
    //   1034: aload_0
    //   1035: invokevirtual F : ()Lcom/google/android/gms/measurement/internal/v6;
    //   1038: aload_0
    //   1039: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   1042: getfield h : Lcom/google/android/gms/measurement/internal/d4;
    //   1045: invokevirtual a : ()Ljava/lang/String;
    //   1048: invokevirtual r : (Ljava/lang/String;)V
    //   1051: invokestatic a : ()Z
    //   1054: pop
    //   1055: aload_0
    //   1056: getfield h : Lcom/google/android/gms/measurement/internal/e;
    //   1059: aconst_null
    //   1060: getstatic com/google/android/gms/measurement/internal/c3.o0 : Lcom/google/android/gms/measurement/internal/a3;
    //   1063: invokevirtual w : (Ljava/lang/String;Lcom/google/android/gms/measurement/internal/a3;)Z
    //   1066: ifeq -> 1135
    //   1069: aload_0
    //   1070: invokevirtual G : ()Lcom/google/android/gms/measurement/internal/u9;
    //   1073: astore_1
    //   1074: aload_1
    //   1075: getfield a : Lcom/google/android/gms/measurement/internal/s4;
    //   1078: getfield b : Landroid/content/Context;
    //   1081: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1084: ldc_w 'com.google.firebase.remoteconfig.FirebaseRemoteConfig'
    //   1087: invokevirtual loadClass : (Ljava/lang/String;)Ljava/lang/Class;
    //   1090: pop
    //   1091: goto -> 1135
    //   1094: astore_1
    //   1095: aload_0
    //   1096: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   1099: getfield u : Lcom/google/android/gms/measurement/internal/d4;
    //   1102: invokevirtual a : ()Ljava/lang/String;
    //   1105: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1108: ifne -> 1135
    //   1111: aload_0
    //   1112: invokevirtual f : ()Lcom/google/android/gms/measurement/internal/o3;
    //   1115: invokevirtual r : ()Lcom/google/android/gms/measurement/internal/m3;
    //   1118: ldc_w 'Remote config removed with active feature rollouts'
    //   1121: invokevirtual a : (Ljava/lang/String;)V
    //   1124: aload_0
    //   1125: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   1128: getfield u : Lcom/google/android/gms/measurement/internal/d4;
    //   1131: aconst_null
    //   1132: invokevirtual b : (Ljava/lang/String;)V
    //   1135: aload_0
    //   1136: invokevirtual e : ()Lcom/google/android/gms/measurement/internal/g3;
    //   1139: invokevirtual q : ()Ljava/lang/String;
    //   1142: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1145: ifeq -> 1161
    //   1148: aload_0
    //   1149: invokevirtual e : ()Lcom/google/android/gms/measurement/internal/g3;
    //   1152: invokevirtual r : ()Ljava/lang/String;
    //   1155: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1158: ifne -> 1251
    //   1161: aload_0
    //   1162: invokevirtual k : ()Z
    //   1165: istore #10
    //   1167: aload_0
    //   1168: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   1171: invokevirtual v : ()Z
    //   1174: ifne -> 1198
    //   1177: aload_0
    //   1178: getfield h : Lcom/google/android/gms/measurement/internal/e;
    //   1181: invokevirtual A : ()Z
    //   1184: ifne -> 1198
    //   1187: aload_0
    //   1188: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   1191: iload #10
    //   1193: iconst_1
    //   1194: ixor
    //   1195: invokevirtual u : (Z)V
    //   1198: iload #10
    //   1200: ifeq -> 1210
    //   1203: aload_0
    //   1204: invokevirtual F : ()Lcom/google/android/gms/measurement/internal/v6;
    //   1207: invokevirtual u : ()V
    //   1210: aload_0
    //   1211: invokevirtual C : ()Lcom/google/android/gms/measurement/internal/z8;
    //   1214: getfield d : Lcom/google/android/gms/measurement/internal/y8;
    //   1217: invokevirtual a : ()V
    //   1220: aload_0
    //   1221: invokevirtual R : ()Lcom/google/android/gms/measurement/internal/k8;
    //   1224: new java/util/concurrent/atomic/AtomicReference
    //   1227: dup
    //   1228: invokespecial <init> : ()V
    //   1231: invokevirtual T : (Ljava/util/concurrent/atomic/AtomicReference;)V
    //   1234: aload_0
    //   1235: invokevirtual R : ()Lcom/google/android/gms/measurement/internal/k8;
    //   1238: aload_0
    //   1239: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   1242: getfield x : Lcom/google/android/gms/measurement/internal/z3;
    //   1245: invokevirtual a : ()Landroid/os/Bundle;
    //   1248: invokevirtual o : (Landroid/os/Bundle;)V
    //   1251: aload_0
    //   1252: invokevirtual A : ()Lcom/google/android/gms/measurement/internal/e4;
    //   1255: getfield o : Lcom/google/android/gms/measurement/internal/y3;
    //   1258: iconst_1
    //   1259: invokevirtual b : (Z)V
    //   1262: return
    // Exception table:
    //   from	to	target	type
    //   1074	1091	1094	java/lang/ClassNotFoundException
  }
  
  @Pure
  public final e z() {
    return this.h;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/s4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */