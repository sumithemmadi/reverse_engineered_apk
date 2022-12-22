package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public class zzdyk<V> extends eu1 implements ot1<V> {
  private static final boolean b;
  
  private static final Logger c = Logger.getLogger(zzdyk.class.getName());
  
  private static final c d;
  
  private static final Object e = new Object();
  
  private volatile Object f;
  
  private volatile e g;
  
  private volatile k h;
  
  private static Object d(ot1<?> paramot1) {
    Object object;
    if (paramot1 instanceof i) {
      Object object1 = ((zzdyk)paramot1).f;
      object = object1;
      if (object1 instanceof b) {
        b b = (b)object1;
        object = object1;
        if (b.c)
          if (b.d != null) {
            object = new b(false, b.d);
          } else {
            object = b.b;
          }  
      } 
      return object;
    } 
    if (object instanceof eu1) {
      Throwable throwable = du1.a((eu1)object);
      if (throwable != null)
        return new zzc(throwable); 
    } 
    boolean bool = object.isCancelled();
    if (((b ^ true) & bool) != 0)
      return b.b; 
    try {
      String str = (String)e((Future<Object>)object);
      return (str == null) ? e : str;
    } catch (ExecutionException executionException) {
      return new zzc(executionException.getCause());
    } catch (CancellationException cancellationException) {
      return new b(false, cancellationException);
    } finally {
      object = null;
    } 
  }
  
  private static <V> V e(Future<V> paramFuture) {
    boolean bool = false;
    while (true) {
      try {
        return paramFuture.get();
      } catch (InterruptedException interruptedException) {
      
      } finally {
        if (bool)
          Thread.currentThread().interrupt(); 
      } 
    } 
  }
  
  private final void p(k paramk) {
    paramk.b = null;
    label22: while (true) {
      paramk = this.h;
      if (paramk == k.a)
        return; 
      k k1 = null;
      while (paramk != null) {
        k k2 = paramk.c;
        if (paramk.b == null)
          if (k1 != null) {
            k1.c = k2;
            paramk = k1;
            if (k1.b == null)
              continue label22; 
          } else if (d.d(this, paramk, k2)) {
            paramk = k1;
          } else {
            continue label22;
          }  
        k1 = paramk;
        paramk = k2;
      } 
      break;
    } 
  }
  
  private static void q(zzdyk<?> paramzzdyk) {
    zzdyk zzdyk1 = null;
    zzdyk<?> zzdyk2 = paramzzdyk;
    paramzzdyk = zzdyk1;
    label35: while (true) {
      k k1 = zzdyk2.h;
      if (d.d(zzdyk2, k1, k.a)) {
        while (k1 != null) {
          Thread thread = k1.b;
          if (thread != null) {
            k1.b = null;
            LockSupport.unpark(thread);
          } 
          k1 = k1.c;
        } 
        zzdyk2.c();
        while (true) {
          e e1 = zzdyk2.g;
          if (d.c(zzdyk2, e1, e.a)) {
            zzdyk<?> zzdyk3;
            e e2 = e1;
            while (true) {
              zzdyk3 = paramzzdyk;
              paramzzdyk = zzdyk3;
              if (e2 != null) {
                e e4 = e2.d;
                e2.d = (e)zzdyk3;
                e e3 = e2;
                e2 = e4;
                continue;
              } 
              break;
            } 
            while (paramzzdyk != null) {
              e e3;
              zzdyk<?> zzdyk4;
              e e4 = ((e)paramzzdyk).d;
              Runnable runnable = ((e)paramzzdyk).b;
              if (runnable instanceof g) {
                g g = (g)runnable;
                zzdyk<?> zzdyk5 = g.b;
                if (zzdyk5.f == g) {
                  Object object = d(g.c);
                  e3 = e4;
                  zzdyk4 = zzdyk5;
                  if (!d.e(zzdyk5, g, object))
                    continue; 
                  continue label35;
                } 
                continue;
              } 
              r((Runnable)zzdyk4, e3.c);
              continue;
              paramzzdyk = zzdyk3;
            } 
            return;
          } 
        } 
        continue;
      } 
    } 
  }
  
  private static void r(Runnable paramRunnable, Executor paramExecutor) {
    try {
      paramExecutor.execute(paramRunnable);
      return;
    } catch (RuntimeException runtimeException) {
      Logger logger = c;
      Level level = Level.SEVERE;
      String str1 = String.valueOf(paramRunnable);
      String str2 = String.valueOf(paramExecutor);
      StringBuilder stringBuilder = new StringBuilder(str1.length() + 57 + str2.length());
      stringBuilder.append("RuntimeException while executing runnable ");
      stringBuilder.append(str1);
      stringBuilder.append(" with executor ");
      stringBuilder.append(str2);
      logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", stringBuilder.toString(), runtimeException);
      return;
    } 
  }
  
  private final void s(StringBuilder paramStringBuilder) {
    try {
      Object object = e(this);
      paramStringBuilder.append("SUCCESS, result=[");
      t(paramStringBuilder, object);
      paramStringBuilder.append("]");
      return;
    } catch (ExecutionException executionException) {
      paramStringBuilder.append("FAILURE, cause=[");
      paramStringBuilder.append(executionException.getCause());
      paramStringBuilder.append("]");
      return;
    } catch (CancellationException cancellationException) {
      paramStringBuilder.append("CANCELLED");
      return;
    } catch (RuntimeException runtimeException) {
      paramStringBuilder.append("UNKNOWN, cause=[");
      paramStringBuilder.append(runtimeException.getClass());
      paramStringBuilder.append(" thrown from get()]");
      return;
    } 
  }
  
  private final void t(StringBuilder paramStringBuilder, Object paramObject) {
    if (paramObject == this) {
      try {
        paramStringBuilder.append("this future");
        return;
      } catch (RuntimeException runtimeException) {
      
      } catch (StackOverflowError stackOverflowError) {}
    } else {
      paramStringBuilder.append(stackOverflowError);
      return;
    } 
    paramStringBuilder.append("Exception thrown from implementation: ");
    paramStringBuilder.append(stackOverflowError.getClass());
  }
  
  private static V u(Object paramObject) {
    if (!(paramObject instanceof b)) {
      if (!(paramObject instanceof zzc)) {
        Object object = paramObject;
        if (paramObject == e)
          object = null; 
        return (V)object;
      } 
      throw new ExecutionException(((zzc)paramObject).b);
    } 
    paramObject = ((b)paramObject).d;
    CancellationException cancellationException = new CancellationException("Task was cancelled.");
    cancellationException.initCause((Throwable)paramObject);
    throw cancellationException;
  }
  
  public void a(Runnable paramRunnable, Executor paramExecutor) {
    xq1.c(paramRunnable, "Runnable was null.");
    xq1.c(paramExecutor, "Executor was null.");
    if (!isDone()) {
      e e1 = this.g;
      if (e1 != e.a) {
        e e3;
        e e2 = new e(paramRunnable, paramExecutor);
        do {
          e2.d = e1;
          if (d.c(this, e1, e2))
            return; 
          e3 = this.g;
          e1 = e3;
        } while (e3 != e.a);
      } 
    } 
    r(paramRunnable, paramExecutor);
  }
  
  protected final Throwable b() {
    if (this instanceof i) {
      Object object = this.f;
      if (object instanceof zzc)
        return ((zzc)object).b; 
    } 
    return null;
  }
  
  protected void c() {}
  
  public boolean cancel(boolean paramBoolean) {
    boolean bool;
    boolean bool2;
    Object object = this.f;
    boolean bool1 = true;
    if (object == null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool | object instanceof g) {
      b b;
      Object object1;
      if (b) {
        b = new b(paramBoolean, new CancellationException("Future.cancel() was called."));
      } else if (paramBoolean) {
        b = b.a;
      } else {
        b = b.b;
      } 
      bool2 = false;
      zzdyk<?> zzdyk1 = this;
      do {
        while (d.e(zzdyk1, object, b)) {
          if (paramBoolean)
            zzdyk1.f(); 
          q(zzdyk1);
          bool2 = bool1;
          if (object instanceof g) {
            object = ((g)object).c;
            if (object instanceof i) {
              zzdyk1 = (zzdyk)object;
              object = zzdyk1.f;
              if (object == null) {
                bool = true;
              } else {
                bool = false;
              } 
              bool2 = bool1;
              if (bool | object instanceof g) {
                bool2 = true;
                continue;
              } 
              // Byte code: goto -> 217
            } 
            object.cancel(paramBoolean);
            bool2 = bool1;
            break;
          } 
          // Byte code: goto -> 217
        } 
        object1 = zzdyk1.f;
        object = object1;
      } while (object1 instanceof g);
    } else {
      bool2 = false;
    } 
    return bool2;
  }
  
  protected void f() {}
  
  final void g(Future<?> paramFuture) {
    boolean bool;
    if (paramFuture != null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool & isCancelled())
      paramFuture.cancel(l()); 
  }
  
  public V get() {
    if (!Thread.interrupted()) {
      boolean bool;
      Object object = this.f;
      if (object != null) {
        bool = true;
      } else {
        bool = false;
      } 
      if ((bool & (object instanceof g ^ true)) != 0)
        return u(object); 
      object = this.h;
      if (object != k.a) {
        k k2;
        k k1 = new k();
        do {
          k1.a((k)object);
          if (d.d(this, (k)object, k1))
            while (true) {
              LockSupport.park(this);
              if (!Thread.interrupted()) {
                object = this.f;
                if (object != null) {
                  bool = true;
                } else {
                  bool = false;
                } 
                if ((bool & (object instanceof g ^ true)) != 0)
                  return u(object); 
                continue;
              } 
              p(k1);
              throw new InterruptedException();
            }  
          k2 = this.h;
          object = k2;
        } while (k2 != k.a);
      } 
      return u(this.f);
    } 
    InterruptedException interruptedException = new InterruptedException();
    throw interruptedException;
  }
  
  public V get(long paramLong, TimeUnit paramTimeUnit) {
    long l = paramTimeUnit.toNanos(paramLong);
    if (!Thread.interrupted()) {
      boolean bool;
      long l1;
      Object object = this.f;
      if (object != null) {
        bool = true;
      } else {
        bool = false;
      } 
      if ((bool & (object instanceof g ^ true)) != 0)
        return u(object); 
      if (l > 0L) {
        l1 = System.nanoTime() + l;
      } else {
        l1 = 0L;
      } 
      long l2 = l;
      if (l >= 1000L) {
        object = this.h;
        if (object != k.a) {
          k k1 = new k();
          label78: while (true) {
            k1.a((k)object);
            if (d.d(this, (k)object, k1))
              while (true) {
                LockSupport.parkNanos(this, Math.min(l, 2147483647999999999L));
                if (!Thread.interrupted()) {
                  object = this.f;
                  if (object != null) {
                    bool = true;
                  } else {
                    bool = false;
                  } 
                  if ((bool & (object instanceof g ^ true)) != 0)
                    return u(object); 
                  l2 = l1 - System.nanoTime();
                  l = l2;
                  if (l2 < 1000L) {
                    p(k1);
                    break;
                  } 
                  continue;
                } 
                p(k1);
                throw new InterruptedException();
              }  
            k k2 = this.h;
            object = k2;
            if (k2 == k.a)
              break label78; 
          } 
        } else {
          return u(this.f);
        } 
      } 
      while (l2 > 0L) {
        object = this.f;
        if (object != null) {
          bool = true;
        } else {
          bool = false;
        } 
        if ((bool & (object instanceof g ^ true)) != 0)
          return u(object); 
        if (!Thread.interrupted()) {
          l2 = l1 - System.nanoTime();
          continue;
        } 
        throw new InterruptedException();
      } 
      String str1 = toString();
      String str2 = paramTimeUnit.toString();
      object = Locale.ROOT;
      String str3 = str2.toLowerCase((Locale)object);
      str2 = paramTimeUnit.toString().toLowerCase((Locale)object);
      object = new StringBuilder(String.valueOf(str2).length() + 28);
      object.append("Waited ");
      object.append(paramLong);
      object.append(" ");
      object.append(str2);
      str2 = object.toString();
      object = str2;
      if (l2 + 1000L < 0L) {
        object = String.valueOf(str2).concat(" (plus ");
        l2 = -l2;
        paramLong = paramTimeUnit.convert(l2, TimeUnit.NANOSECONDS);
        l2 -= paramTimeUnit.toNanos(paramLong);
        if (paramLong == 0L || l2 > 1000L) {
          bool = true;
        } else {
          bool = false;
        } 
        Object object1 = object;
        if (paramLong > 0L) {
          object = String.valueOf(object);
          object1 = new StringBuilder(object.length() + 21 + String.valueOf(str3).length());
          object1.append((String)object);
          object1.append(paramLong);
          object1.append(" ");
          object1.append(str3);
          object = object1.toString();
          object1 = object;
          if (bool)
            object1 = String.valueOf(object).concat(","); 
          object1 = String.valueOf(object1).concat(" ");
        } 
        object = object1;
        if (bool) {
          object = String.valueOf(object1);
          object1 = new StringBuilder(object.length() + 33);
          object1.append((String)object);
          object1.append(l2);
          object1.append(" nanoseconds ");
          object = object1.toString();
        } 
        object = String.valueOf(object).concat("delay)");
      } 
      if (isDone())
        throw new TimeoutException(String.valueOf(object).concat(" but future completed as timeout expired")); 
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(object).length() + 5 + String.valueOf(str1).length());
      stringBuilder.append((String)object);
      stringBuilder.append(" for ");
      stringBuilder.append(str1);
      throw new TimeoutException(stringBuilder.toString());
    } 
    InterruptedException interruptedException = new InterruptedException();
    throw interruptedException;
  }
  
  protected String h() {
    if (this instanceof ScheduledFuture) {
      long l = ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS);
      StringBuilder stringBuilder = new StringBuilder(41);
      stringBuilder.append("remaining delay=[");
      stringBuilder.append(l);
      stringBuilder.append(" ms]");
      return stringBuilder.toString();
    } 
    return null;
  }
  
  protected boolean i(V paramV) {
    V v = paramV;
    if (paramV == null)
      v = (V)e; 
    if (d.e(this, null, v)) {
      q(this);
      return true;
    } 
    return false;
  }
  
  public boolean isCancelled() {
    return this.f instanceof b;
  }
  
  public boolean isDone() {
    boolean bool;
    Object object = this.f;
    if (object != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return (object instanceof g ^ true) & bool;
  }
  
  protected boolean j(Throwable paramThrowable) {
    zzc zzc = new zzc(xq1.<Throwable>b(paramThrowable));
    if (d.e(this, null, zzc)) {
      q(this);
      return true;
    } 
    return false;
  }
  
  protected final boolean k(ot1<? extends V> paramot1) {
    Object object1;
    xq1.b(paramot1);
    Object object2 = this.f;
    Object object3 = object2;
    if (object2 == null) {
      if (paramot1.isDone()) {
        object1 = d(paramot1);
        if (d.e(this, null, object1)) {
          q(this);
          return true;
        } 
        return false;
      } 
      object3 = new g(this, (ot1<?>)object1);
      if (d.e(this, null, object3))
        try {
          object1.a((Runnable)object3, zzdzd.b);
        } finally {
          object2 = null;
        }  
      object3 = this.f;
    } 
    if (object3 instanceof b)
      object1.cancel(((b)object3).c); 
    return false;
  }
  
  protected final boolean l() {
    Object object = this.f;
    return (object instanceof b && ((b)object).c);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
      stringBuilder.append(getClass().getSimpleName());
    } else {
      stringBuilder.append(getClass().getName());
    } 
    stringBuilder.append('@');
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append("[status=");
    if (isCancelled()) {
      stringBuilder.append("CANCELLED");
    } else if (isDone()) {
      s(stringBuilder);
    } else {
      int i = stringBuilder.length();
      stringBuilder.append("PENDING");
      Object object = this.f;
      if (object instanceof g) {
        stringBuilder.append(", setFuture=[");
        t(stringBuilder, ((g)object).c);
        stringBuilder.append("]");
      } else {
        try {
          object = er1.a(h());
        } catch (RuntimeException runtimeException) {
          String str2 = String.valueOf(runtimeException.getClass());
          StringBuilder stringBuilder1 = new StringBuilder(str2.length() + 38);
          stringBuilder1.append("Exception thrown from implementation: ");
          stringBuilder1.append(str2);
          String str1 = stringBuilder1.toString();
        } catch (StackOverflowError stackOverflowError) {}
        if (stackOverflowError != null) {
          stringBuilder.append(", info=[");
          stringBuilder.append((String)stackOverflowError);
          stringBuilder.append("]");
        } 
      } 
      if (isDone()) {
        stringBuilder.delete(i, stringBuilder.length());
        s(stringBuilder);
      } 
    } 
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
  
  static {
    boolean bool;
    Exception exception1;
    f f;
    Exception exception2;
    try {
      bool = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    } catch (SecurityException null) {
      bool = false;
    } 
    b = bool;
  }
  
  static {
    try {
      j j = new j();
      this(null);
      exception1 = null;
    } finally {
      exception1 = null;
    } 
    d = f;
    if (exception2 != null) {
      Logger logger = c;
      Level level = Level.SEVERE;
      logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", exception1);
      logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", exception2);
    } 
  }
  
  private static final class b {
    static final b a = new b(true, null);
    
    static final b b = new b(false, null);
    
    final boolean c;
    
    final Throwable d;
    
    static {
    
    }
    
    b(boolean param1Boolean, Throwable param1Throwable) {
      this.c = param1Boolean;
      this.d = param1Throwable;
    }
    
    static {
      if (zzdyk.w()) {
        b = null;
        a = null;
        return;
      } 
    }
  }
  
  private static abstract class c {
    private c() {}
    
    abstract void a(zzdyk.k param1k1, zzdyk.k param1k2);
    
    abstract void b(zzdyk.k param1k, Thread param1Thread);
    
    abstract boolean c(zzdyk<?> param1zzdyk, zzdyk.e param1e1, zzdyk.e param1e2);
    
    abstract boolean d(zzdyk<?> param1zzdyk, zzdyk.k param1k1, zzdyk.k param1k2);
    
    abstract boolean e(zzdyk<?> param1zzdyk, Object param1Object1, Object param1Object2);
  }
  
  private static final class d extends c {
    final AtomicReferenceFieldUpdater<zzdyk.k, Thread> a;
    
    final AtomicReferenceFieldUpdater<zzdyk.k, zzdyk.k> b;
    
    final AtomicReferenceFieldUpdater<zzdyk, zzdyk.k> c;
    
    final AtomicReferenceFieldUpdater<zzdyk, zzdyk.e> d;
    
    final AtomicReferenceFieldUpdater<zzdyk, Object> e;
    
    d(AtomicReferenceFieldUpdater<zzdyk.k, Thread> param1AtomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<zzdyk.k, zzdyk.k> param1AtomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater<zzdyk, zzdyk.k> param1AtomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<zzdyk, zzdyk.e> param1AtomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<zzdyk, Object> param1AtomicReferenceFieldUpdater4) {
      super(null);
      this.a = param1AtomicReferenceFieldUpdater;
      this.b = param1AtomicReferenceFieldUpdater1;
      this.c = param1AtomicReferenceFieldUpdater2;
      this.d = param1AtomicReferenceFieldUpdater3;
      this.e = param1AtomicReferenceFieldUpdater4;
    }
    
    final void a(zzdyk.k param1k1, zzdyk.k param1k2) {
      this.b.lazySet(param1k1, param1k2);
    }
    
    final void b(zzdyk.k param1k, Thread param1Thread) {
      this.a.lazySet(param1k, param1Thread);
    }
    
    final boolean c(zzdyk<?> param1zzdyk, zzdyk.e param1e1, zzdyk.e param1e2) {
      return this.d.compareAndSet(param1zzdyk, param1e1, param1e2);
    }
    
    final boolean d(zzdyk<?> param1zzdyk, zzdyk.k param1k1, zzdyk.k param1k2) {
      return this.c.compareAndSet(param1zzdyk, param1k1, param1k2);
    }
    
    final boolean e(zzdyk<?> param1zzdyk, Object param1Object1, Object param1Object2) {
      return this.e.compareAndSet(param1zzdyk, param1Object1, param1Object2);
    }
  }
  
  private static final class e {
    static final e a = new e(null, null);
    
    final Runnable b;
    
    final Executor c;
    
    e d;
    
    e(Runnable param1Runnable, Executor param1Executor) {
      this.b = param1Runnable;
      this.c = param1Executor;
    }
  }
  
  private static final class f extends c {
    private f() {
      super(null);
    }
    
    final void a(zzdyk.k param1k1, zzdyk.k param1k2) {
      param1k1.c = param1k2;
    }
    
    final void b(zzdyk.k param1k, Thread param1Thread) {
      param1k.b = param1Thread;
    }
    
    final boolean c(zzdyk<?> param1zzdyk, zzdyk.e param1e1, zzdyk.e param1e2) {
      // Byte code:
      //   0: aload_1
      //   1: monitorenter
      //   2: aload_1
      //   3: invokestatic A : (Lcom/google/android/gms/internal/ads/zzdyk;)Lcom/google/android/gms/internal/ads/zzdyk$e;
      //   6: aload_2
      //   7: if_acmpne -> 20
      //   10: aload_1
      //   11: aload_3
      //   12: invokestatic m : (Lcom/google/android/gms/internal/ads/zzdyk;Lcom/google/android/gms/internal/ads/zzdyk$e;)Lcom/google/android/gms/internal/ads/zzdyk$e;
      //   15: pop
      //   16: aload_1
      //   17: monitorexit
      //   18: iconst_1
      //   19: ireturn
      //   20: aload_1
      //   21: monitorexit
      //   22: iconst_0
      //   23: ireturn
      //   24: astore_2
      //   25: aload_1
      //   26: monitorexit
      //   27: aload_2
      //   28: athrow
      // Exception table:
      //   from	to	target	type
      //   2	18	24	finally
      //   20	22	24	finally
      //   25	27	24	finally
    }
    
    final boolean d(zzdyk<?> param1zzdyk, zzdyk.k param1k1, zzdyk.k param1k2) {
      // Byte code:
      //   0: aload_1
      //   1: monitorenter
      //   2: aload_1
      //   3: invokestatic z : (Lcom/google/android/gms/internal/ads/zzdyk;)Lcom/google/android/gms/internal/ads/zzdyk$k;
      //   6: aload_2
      //   7: if_acmpne -> 20
      //   10: aload_1
      //   11: aload_3
      //   12: invokestatic n : (Lcom/google/android/gms/internal/ads/zzdyk;Lcom/google/android/gms/internal/ads/zzdyk$k;)Lcom/google/android/gms/internal/ads/zzdyk$k;
      //   15: pop
      //   16: aload_1
      //   17: monitorexit
      //   18: iconst_1
      //   19: ireturn
      //   20: aload_1
      //   21: monitorexit
      //   22: iconst_0
      //   23: ireturn
      //   24: astore_2
      //   25: aload_1
      //   26: monitorexit
      //   27: aload_2
      //   28: athrow
      // Exception table:
      //   from	to	target	type
      //   2	18	24	finally
      //   20	22	24	finally
      //   25	27	24	finally
    }
    
    final boolean e(zzdyk<?> param1zzdyk, Object param1Object1, Object param1Object2) {
      // Byte code:
      //   0: aload_1
      //   1: monitorenter
      //   2: aload_1
      //   3: invokestatic x : (Lcom/google/android/gms/internal/ads/zzdyk;)Ljava/lang/Object;
      //   6: aload_2
      //   7: if_acmpne -> 20
      //   10: aload_1
      //   11: aload_3
      //   12: invokestatic o : (Lcom/google/android/gms/internal/ads/zzdyk;Ljava/lang/Object;)Ljava/lang/Object;
      //   15: pop
      //   16: aload_1
      //   17: monitorexit
      //   18: iconst_1
      //   19: ireturn
      //   20: aload_1
      //   21: monitorexit
      //   22: iconst_0
      //   23: ireturn
      //   24: astore_2
      //   25: aload_1
      //   26: monitorexit
      //   27: aload_2
      //   28: athrow
      // Exception table:
      //   from	to	target	type
      //   2	18	24	finally
      //   20	22	24	finally
      //   25	27	24	finally
    }
  }
  
  private static final class g<V> implements Runnable {
    final zzdyk<V> b;
    
    final ot1<? extends V> c;
    
    g(zzdyk<V> param1zzdyk, ot1<? extends V> param1ot1) {
      this.b = param1zzdyk;
      this.c = param1ot1;
    }
    
    public final void run() {
      if (zzdyk.x(this.b) != this)
        return; 
      Object object = zzdyk.B(this.c);
      if (zzdyk.v().e(this.b, this, object))
        zzdyk.y(this.b); 
    }
  }
  
  static class h<V> extends zzdyk<V> implements i<V> {
    public final V get(long param1Long, TimeUnit param1TimeUnit) {
      return super.get(param1Long, param1TimeUnit);
    }
  }
  
  static interface i<V> extends ot1<V> {}
  
  private static final class j extends c {
    static final Unsafe a;
    
    static final long b;
    
    static final long c;
    
    static final long d;
    
    static final long e;
    
    static final long f;
    
    static {
      try {
        Unsafe unsafe = Unsafe.getUnsafe();
      } catch (SecurityException securityException) {
        try {
          a a = new a();
          this();
          Unsafe unsafe = AccessController.<Unsafe>doPrivileged(a);
          try {
            c = unsafe.objectFieldOffset(zzdyk.class.getDeclaredField("h"));
            b = unsafe.objectFieldOffset(zzdyk.class.getDeclaredField("g"));
            d = unsafe.objectFieldOffset(zzdyk.class.getDeclaredField("f"));
            e = unsafe.objectFieldOffset(zzdyk.k.class.getDeclaredField("b"));
            f = unsafe.objectFieldOffset(zzdyk.k.class.getDeclaredField("c"));
            a = unsafe;
            return;
          } catch (Exception null) {
            gr1.e(exception);
            throw new RuntimeException(exception);
          } 
        } catch (PrivilegedActionException exception) {
          throw new RuntimeException("Could not initialize intrinsics", exception.getCause());
        } 
      } 
      try {
        c = exception.objectFieldOffset(zzdyk.class.getDeclaredField("h"));
        b = exception.objectFieldOffset(zzdyk.class.getDeclaredField("g"));
        d = exception.objectFieldOffset(zzdyk.class.getDeclaredField("f"));
        e = exception.objectFieldOffset(zzdyk.k.class.getDeclaredField("b"));
        f = exception.objectFieldOffset(zzdyk.k.class.getDeclaredField("c"));
        a = (Unsafe)exception;
        return;
      } catch (Exception exception1) {
        gr1.e(exception1);
        throw new RuntimeException(exception1);
      } 
    }
    
    private j() {
      super(null);
    }
    
    final void a(zzdyk.k param1k1, zzdyk.k param1k2) {
      a.putObject(param1k1, f, param1k2);
    }
    
    final void b(zzdyk.k param1k, Thread param1Thread) {
      a.putObject(param1k, e, param1Thread);
    }
    
    final boolean c(zzdyk<?> param1zzdyk, zzdyk.e param1e1, zzdyk.e param1e2) {
      return a.compareAndSwapObject(param1zzdyk, b, param1e1, param1e2);
    }
    
    final boolean d(zzdyk<?> param1zzdyk, zzdyk.k param1k1, zzdyk.k param1k2) {
      return a.compareAndSwapObject(param1zzdyk, c, param1k1, param1k2);
    }
    
    final boolean e(zzdyk<?> param1zzdyk, Object param1Object1, Object param1Object2) {
      return a.compareAndSwapObject(param1zzdyk, d, param1Object1, param1Object2);
    }
    
    class a implements PrivilegedExceptionAction<Unsafe> {}
  }
  
  class a implements PrivilegedExceptionAction<Unsafe> {}
  
  private static final class k {
    static final k a = new k(false);
    
    volatile Thread b;
    
    volatile k c;
    
    k() {
      zzdyk.v().b(this, Thread.currentThread());
    }
    
    private k(boolean param1Boolean) {}
    
    final void a(k param1k) {
      zzdyk.v().a(this, param1k);
    }
  }
  
  private static final class zzc {
    static final zzc a = new zzc(new Throwable("Failure occurred while trying to finish a future.") {
          public Throwable fillInStackTrace() {
            /* monitor enter ThisExpression{InnerObjectType{InnerObjectType{ObjectType{com/google/android/gms/internal/ads/zzdyk}.Lcom/google/android/gms/internal/ads/zzdyk$zzc;}.Lcom/google/android/gms/internal/ads/zzdyk$zzc$1;}} */
            /* monitor exit ThisExpression{InnerObjectType{InnerObjectType{ObjectType{com/google/android/gms/internal/ads/zzdyk}.Lcom/google/android/gms/internal/ads/zzdyk$zzc;}.Lcom/google/android/gms/internal/ads/zzdyk$zzc$1;}} */
            return this;
          }
        });
    
    final Throwable b;
    
    zzc(Throwable param1Throwable) {
      this.b = xq1.<Throwable>b(param1Throwable);
    }
  }
  
  class null extends Throwable {
    null(zzdyk this$0) {
      super((String)this$0);
    }
    
    public Throwable fillInStackTrace() {
      /* monitor enter ThisExpression{InnerObjectType{InnerObjectType{ObjectType{com/google/android/gms/internal/ads/zzdyk}.Lcom/google/android/gms/internal/ads/zzdyk$zzc;}.Lcom/google/android/gms/internal/ads/zzdyk$zzc$1;}} */
      /* monitor exit ThisExpression{InnerObjectType{InnerObjectType{ObjectType{com/google/android/gms/internal/ads/zzdyk}.Lcom/google/android/gms/internal/ads/zzdyk$zzc;}.Lcom/google/android/gms/internal/ads/zzdyk$zzc$1;}} */
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdyk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */