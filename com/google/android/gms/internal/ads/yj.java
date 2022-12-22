package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.common.util.d;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class yj {
  private final AtomicReference<ExecutorService> a = new AtomicReference<ExecutorService>(null);
  
  private final Object b = new Object();
  
  private String c = null;
  
  private String d = null;
  
  private final AtomicBoolean e = new AtomicBoolean(false);
  
  private final AtomicInteger f = new AtomicInteger(-1);
  
  private final AtomicReference<Object> g = new AtomicReference(null);
  
  private final AtomicReference<Object> h = new AtomicReference(null);
  
  private final ConcurrentMap<String, Method> i = new ConcurrentHashMap<String, Method>(9);
  
  private final AtomicReference<ls> j = new AtomicReference<ls>(null);
  
  private final BlockingQueue<FutureTask<?>> k = new ArrayBlockingQueue<FutureTask<?>>(20);
  
  private final Object l = new Object();
  
  private static Bundle A(String paramString1, String paramString2) {
    Bundle bundle = new Bundle();
    try {
      bundle.putLong("_aeid", Long.parseLong(paramString1));
    } catch (NullPointerException nullPointerException) {
      paramString1 = String.valueOf(paramString1);
      if (paramString1.length() != 0) {
        paramString1 = "Invalid event ID: ".concat(paramString1);
      } else {
        paramString1 = new String("Invalid event ID: ");
      } 
      cm.c(paramString1, nullPointerException);
    } catch (NumberFormatException numberFormatException) {}
    if ("_ac".equals(paramString2))
      bundle.putInt("_r", 1); 
    return bundle;
  }
  
  private final Method B(Context paramContext, String paramString) {
    Method method = this.i.get(paramString);
    if (method != null)
      return method; 
    try {
      Method method1 = paramContext.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(paramString, new Class[] { String.class });
      this.i.put(paramString, method1);
      return method1;
    } catch (Exception exception) {
      x(paramString, false);
      return null;
    } 
  }
  
  private final Method C(Context paramContext, String paramString) {
    Method method = this.i.get(paramString);
    if (method != null)
      return method; 
    try {
      Method method1 = paramContext.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(paramString, new Class[0]);
      this.i.put(paramString, method1);
      return method1;
    } catch (Exception exception) {
      x(paramString, false);
      return null;
    } 
  }
  
  private final Method D(Context paramContext, String paramString) {
    Method method = this.i.get(paramString);
    if (method != null)
      return method; 
    try {
      Method method1 = paramContext.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(paramString, new Class[] { Activity.class, String.class, String.class });
      this.i.put(paramString, method1);
      return method1;
    } catch (Exception exception) {
      x(paramString, false);
      return null;
    } 
  }
  
  private final ExecutorService E() {
    if (this.a.get() == null) {
      ExecutorService executorService;
      if (d.a()) {
        qp1 qp1 = pp1.a();
        x<Integer> x = m0.a0;
        executorService = qp1.a(((Integer)er2.e().<Integer>c(x)).intValue(), F(), yp1.b);
      } else {
        x<Integer> x = m0.a0;
        executorService = new ThreadPoolExecutor(((Integer)er2.e().<Integer>c(x)).intValue(), ((Integer)er2.e().<Integer>c(x)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>(), F());
      } 
      this.a.compareAndSet(null, executorService);
    } 
    return this.a.get();
  }
  
  private final ThreadFactory F() {
    return new pk(this);
  }
  
  private static boolean I(Context paramContext) {
    x<Boolean> x2 = m0.b0;
    if (!((Boolean)er2.e().<Boolean>c(x2)).booleanValue())
      return false; 
    int i = DynamiteModule.a(paramContext, "com.google.android.gms.ads.dynamite");
    x<Integer> x = m0.c0;
    if (i < ((Integer)er2.e().c((x)x)).intValue())
      return false; 
    x<Boolean> x1 = m0.d0;
    if (((Boolean)er2.e().<Boolean>c(x1)).booleanValue())
      try {
        paramContext.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
        return false;
      } catch (ClassNotFoundException classNotFoundException) {} 
    return true;
  }
  
  private final Object b(String paramString, Context paramContext) {
    if (!k(paramContext, "com.google.android.gms.measurement.AppMeasurement", this.g, true))
      return null; 
    Method method = C(paramContext, paramString);
    try {
      return method.invoke(this.g.get(), new Object[0]);
    } catch (Exception exception) {
      x(paramString, true);
      return null;
    } 
  }
  
  private final <T> T c(String paramString, T paramT, ok<T> paramok) {
    synchronized (this.j) {
      ls ls = this.j.get();
      if (ls != null)
        try {
          paramok = (ok<T>)paramok.a(this.j.get());
          return (T)paramok;
        } catch (Exception exception) {
          x(paramString, false);
        }  
      return paramT;
    } 
  }
  
  private final void f(Context paramContext, String paramString1, String paramString2) {
    if (!k(paramContext, "com.google.android.gms.measurement.AppMeasurement", this.g, true))
      return; 
    Method method = B(paramContext, paramString2);
    try {
      method.invoke(this.g.get(), new Object[] { paramString1 });
      int i = String.valueOf(paramString2).length();
      int j = String.valueOf(paramString1).length();
      StringBuilder stringBuilder = new StringBuilder();
      this(i + 37 + j);
      stringBuilder.append("Invoke Firebase method ");
      stringBuilder.append(paramString2);
      stringBuilder.append(", Ad Unit Id: ");
      stringBuilder.append(paramString1);
      b1.m(stringBuilder.toString());
      return;
    } catch (Exception exception) {
      x(paramString2, false);
      return;
    } 
  }
  
  private final void g(Context paramContext, String paramString1, String paramString2, Bundle paramBundle) {
    if (!H(paramContext))
      return; 
    Bundle bundle = A(paramString2, paramString1);
    if (paramBundle != null)
      bundle.putAll(paramBundle); 
    if (I(paramContext)) {
      j("logEventInternal", new ck(paramString1, bundle));
      return;
    } 
    if (!k(paramContext, "com.google.android.gms.measurement.AppMeasurement", this.g, true))
      return; 
    Method method = q(paramContext);
    try {
      method.invoke(this.g.get(), new Object[] { "am", paramString1, bundle });
      return;
    } catch (Exception exception) {
      x("logEventInternal", true);
      return;
    } 
  }
  
  private final void j(String paramString, rk paramrk) {
    synchronized (this.j) {
      FutureTask<?> futureTask = new FutureTask();
      fk fk = new fk();
      this(this, paramrk, paramString);
      this(fk, null);
      if (this.j.get() != null) {
        futureTask.run();
      } else {
        this.k.offer(futureTask);
      } 
      return;
    } 
  }
  
  private final boolean k(Context paramContext, String paramString, AtomicReference<Object> paramAtomicReference, boolean paramBoolean) {
    if (paramAtomicReference.get() == null)
      try {
        paramAtomicReference.compareAndSet(null, paramContext.getClassLoader().loadClass(paramString).getDeclaredMethod("getInstance", new Class[] { Context.class }).invoke(null, new Object[] { paramContext }));
      } catch (Exception exception) {
        x("getInstance", paramBoolean);
        return false;
      }  
    return true;
  }
  
  private final Method q(Context paramContext) {
    Method method = this.i.get("logEventInternal");
    if (method != null)
      return method; 
    try {
      Method method1 = paramContext.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[] { String.class, String.class, Bundle.class });
      this.i.put("logEventInternal", method1);
      return method1;
    } catch (Exception exception) {
      x("logEventInternal", true);
      return null;
    } 
  }
  
  private final void x(String paramString, boolean paramBoolean) {
    if (!this.e.get()) {
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 30);
      stringBuilder.append("Invoke Firebase method ");
      stringBuilder.append(paramString);
      stringBuilder.append(" error.");
      cm.i(stringBuilder.toString());
      if (paramBoolean) {
        cm.i("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
        this.e.set(true);
      } 
    } 
  }
  
  public final boolean H(Context paramContext) {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/m0.U : Lcom/google/android/gms/internal/ads/x;
    //   3: astore_2
    //   4: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   7: aload_2
    //   8: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   11: checkcast java/lang/Boolean
    //   14: invokevirtual booleanValue : ()Z
    //   17: ifeq -> 129
    //   20: aload_0
    //   21: getfield e : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   24: invokevirtual get : ()Z
    //   27: ifeq -> 33
    //   30: goto -> 129
    //   33: getstatic com/google/android/gms/internal/ads/m0.e0 : Lcom/google/android/gms/internal/ads/x;
    //   36: astore_2
    //   37: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   40: aload_2
    //   41: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   44: checkcast java/lang/Boolean
    //   47: invokevirtual booleanValue : ()Z
    //   50: ifeq -> 55
    //   53: iconst_1
    //   54: ireturn
    //   55: aload_0
    //   56: getfield f : Ljava/util/concurrent/atomic/AtomicInteger;
    //   59: invokevirtual get : ()I
    //   62: iconst_m1
    //   63: if_icmpne -> 116
    //   66: invokestatic a : ()Lcom/google/android/gms/internal/ads/sl;
    //   69: pop
    //   70: aload_1
    //   71: ldc_w 12451000
    //   74: invokestatic u : (Landroid/content/Context;I)Z
    //   77: ifne -> 108
    //   80: invokestatic a : ()Lcom/google/android/gms/internal/ads/sl;
    //   83: pop
    //   84: aload_1
    //   85: invokestatic l : (Landroid/content/Context;)Z
    //   88: ifeq -> 108
    //   91: ldc_w 'Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.'
    //   94: invokestatic i : (Ljava/lang/String;)V
    //   97: aload_0
    //   98: getfield f : Ljava/util/concurrent/atomic/AtomicInteger;
    //   101: iconst_0
    //   102: invokevirtual set : (I)V
    //   105: goto -> 116
    //   108: aload_0
    //   109: getfield f : Ljava/util/concurrent/atomic/AtomicInteger;
    //   112: iconst_1
    //   113: invokevirtual set : (I)V
    //   116: aload_0
    //   117: getfield f : Ljava/util/concurrent/atomic/AtomicInteger;
    //   120: invokevirtual get : ()I
    //   123: iconst_1
    //   124: if_icmpne -> 129
    //   127: iconst_1
    //   128: ireturn
    //   129: iconst_0
    //   130: ireturn
  }
  
  public final void a(Bundle paramBundle) {
    j("setConsent", new bk(paramBundle));
  }
  
  public final void d(Context paramContext, zzaao paramzzaao) {
    null = m0.g0;
    if (!((Boolean)er2.e().<Boolean>c(null)).booleanValue() || !H(paramContext) || !I(paramContext))
      return; 
    synchronized (this.l) {
      return;
    } 
  }
  
  public final void e(Context paramContext, zzvl paramzzvl) {
    null = m0.g0;
    if (!((Boolean)er2.e().<Boolean>c(null)).booleanValue() || !H(paramContext) || !I(paramContext))
      return; 
    synchronized (this.l) {
      return;
    } 
  }
  
  public final void h(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt) {
    if (!H(paramContext))
      return; 
    Bundle bundle = new Bundle();
    bundle.putString("_ai", paramString2);
    bundle.putString("reward_type", paramString3);
    bundle.putInt("reward_value", paramInt);
    g(paramContext, "_ar", paramString1, bundle);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString3).length() + 75);
    stringBuilder.append("Log a Firebase reward video event, reward type: ");
    stringBuilder.append(paramString3);
    stringBuilder.append(", reward value: ");
    stringBuilder.append(paramInt);
    b1.m(stringBuilder.toString());
  }
  
  public final String l(Context paramContext) {
    if (!H(paramContext))
      return ""; 
    if (I(paramContext))
      return c("getCurrentScreenNameOrScreenClass", "", jk.a); 
    if (!k(paramContext, "com.google.android.gms.measurement.AppMeasurement", this.g, true))
      return ""; 
    try {
      String str1 = (String)C(paramContext, "getCurrentScreenName").invoke(this.g.get(), new Object[0]);
      String str2 = str1;
      if (str1 == null)
        str2 = (String)C(paramContext, "getCurrentScreenClass").invoke(this.g.get(), new Object[0]); 
      return (str2 != null) ? str2 : "";
    } catch (Exception exception) {
      x("getCurrentScreenName", false);
      return "";
    } 
  }
  
  public final String m(Context paramContext) {
    if (!H(paramContext))
      return null; 
    synchronized (this.b) {
      String str = this.c;
      if (str != null)
        return str; 
      if (I(paramContext)) {
        this.c = c("getGmpAppId", this.c, lk.a);
      } else {
        this.c = (String)b("getGmpAppId", paramContext);
      } 
      return this.c;
    } 
  }
  
  public final String n(Context paramContext) {
    if (!H(paramContext))
      return null; 
    x<Long> x = m0.Z;
    long l = ((Long)er2.e().<Long>c(x)).longValue();
    if (I(paramContext)) {
      if (l < 0L)
        try {
          return c("getAppInstanceId", null, kk.a);
        } catch (TimeoutException timeoutException) {
          return "TIME_OUT";
        } catch (Exception exception) {
          return null;
        }  
      ExecutorService executorService = E();
      nk nk = new nk();
      this(this);
      return executorService.<String>submit(nk).get(l, TimeUnit.MILLISECONDS);
    } 
    if (l < 0L)
      return (String)b("getAppInstanceId", paramContext); 
    Future<?> future = E().submit(new mk(this, paramContext));
    try {
      return (String)future.get(l, TimeUnit.MILLISECONDS);
    } catch (TimeoutException timeoutException) {
      return "TIME_OUT";
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public final String o(Context paramContext) {
    Long long_;
    if (!H(paramContext))
      return null; 
    if (I(paramContext)) {
      long_ = c("getAdEventId", null, ak.a);
      return (long_ != null) ? Long.toString(long_.longValue()) : null;
    } 
    Object object = b("generateEventId", (Context)long_);
    return (object != null) ? object.toString() : null;
  }
  
  public final String p(Context paramContext) {
    if (!H(paramContext))
      return null; 
    synchronized (this.b) {
      String str = this.d;
      if (str != null)
        return str; 
      if (I(paramContext)) {
        this.d = c("getAppIdOrigin", this.d, dk.a);
      } else {
        this.d = "fa";
      } 
      return this.d;
    } 
  }
  
  public final void s(Context paramContext, String paramString) {
    if (!H(paramContext))
      return; 
    if (I(paramContext)) {
      j("beginAdUnitExposure", new hk(paramString));
      return;
    } 
    f(paramContext, paramString, "beginAdUnitExposure");
  }
  
  public final void t(Context paramContext, String paramString) {
    if (!H(paramContext))
      return; 
    if (I(paramContext)) {
      j("endAdUnitExposure", new gk(paramString));
      return;
    } 
    f(paramContext, paramString, "endAdUnitExposure");
  }
  
  @Deprecated
  public final void u(Context paramContext, String paramString) {
    if (!H(paramContext))
      return; 
    if (!(paramContext instanceof Activity))
      return; 
    if (I(paramContext)) {
      j("setScreenName", new ik(paramContext, paramString));
      return;
    } 
    if (!k(paramContext, "com.google.firebase.analytics.FirebaseAnalytics", this.h, false))
      return; 
    Method method = D(paramContext, "setCurrentScreen");
    try {
      Activity activity = (Activity)paramContext;
      method.invoke(this.h.get(), new Object[] { activity, paramString, paramContext.getPackageName() });
      return;
    } catch (Exception exception) {
      x("setCurrentScreen", false);
      return;
    } 
  }
  
  public final void v(Context paramContext, String paramString) {
    g(paramContext, "_ac", paramString, null);
  }
  
  public final void w(Context paramContext, String paramString) {
    g(paramContext, "_ai", paramString, null);
  }
  
  public final void y(Context paramContext, String paramString) {
    g(paramContext, "_aq", paramString, null);
  }
  
  public final void z(Context paramContext, String paramString) {
    g(paramContext, "_aa", paramString, null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */