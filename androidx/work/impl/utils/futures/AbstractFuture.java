package androidx.work.impl.utils.futures;

import com.google.common.util.concurrent.a;
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

public abstract class AbstractFuture<V> implements a<V> {
  static final boolean b = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
  
  private static final Logger c = Logger.getLogger(AbstractFuture.class.getName());
  
  static final b d;
  
  private static final Object e = new Object();
  
  volatile Object f;
  
  volatile d g;
  
  volatile h h;
  
  private void b(StringBuilder paramStringBuilder) {
    try {
      Object object = k((Future<Object>)this);
      paramStringBuilder.append("SUCCESS, result=[");
      paramStringBuilder.append(s(object));
      paramStringBuilder.append("]");
    } catch (ExecutionException executionException) {
      paramStringBuilder.append("FAILURE, cause=[");
      paramStringBuilder.append(executionException.getCause());
      paramStringBuilder.append("]");
    } catch (CancellationException cancellationException) {
      paramStringBuilder.append("CANCELLED");
    } catch (RuntimeException runtimeException) {
      paramStringBuilder.append("UNKNOWN, cause=[");
      paramStringBuilder.append(runtimeException.getClass());
      paramStringBuilder.append(" thrown from get()]");
    } 
  }
  
  private static CancellationException d(String paramString, Throwable paramThrowable) {
    CancellationException cancellationException = new CancellationException(paramString);
    cancellationException.initCause(paramThrowable);
    return cancellationException;
  }
  
  static <T> T e(T paramT) {
    paramT.getClass();
    return paramT;
  }
  
  private d f(d paramd) {
    while (true) {
      d d1 = this.g;
      if (d.a(this, d1, d.a)) {
        d d2 = paramd;
        for (paramd = d1; paramd != null; paramd = d1) {
          d1 = paramd.d;
          paramd.d = d2;
          d2 = paramd;
        } 
        return d2;
      } 
    } 
  }
  
  static void g(AbstractFuture<?> paramAbstractFuture) {
    AbstractFuture abstractFuture = null;
    AbstractFuture<?> abstractFuture1 = paramAbstractFuture;
    paramAbstractFuture = abstractFuture;
    label17: while (true) {
      abstractFuture1.n();
      abstractFuture1.c();
      d d1 = abstractFuture1.f((d)paramAbstractFuture);
      while (d1 != null) {
        AbstractFuture<V> abstractFuture2;
        d d2 = d1.d;
        Runnable runnable = d1.b;
        if (runnable instanceof f) {
          runnable = runnable;
          abstractFuture2 = ((f)runnable).b;
          if (abstractFuture2.f == runnable) {
            Object object = j(((f)runnable).c);
            if (d.b(abstractFuture2, runnable, object))
              continue label17; 
          } 
        } else {
          h(runnable, ((d)abstractFuture2).c);
        } 
        d d3 = d2;
      } 
      break;
    } 
  }
  
  private static void h(Runnable paramRunnable, Executor paramExecutor) {
    try {
      paramExecutor.execute(paramRunnable);
    } catch (RuntimeException runtimeException) {
      Logger logger = c;
      Level level = Level.SEVERE;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("RuntimeException while executing runnable ");
      stringBuilder.append(paramRunnable);
      stringBuilder.append(" with executor ");
      stringBuilder.append(paramExecutor);
      logger.log(level, stringBuilder.toString(), runtimeException);
    } 
  }
  
  private V i(Object paramObject) {
    if (!(paramObject instanceof c)) {
      if (!(paramObject instanceof Failure)) {
        Object object = paramObject;
        if (paramObject == e)
          object = null; 
        return (V)object;
      } 
      throw new ExecutionException(((Failure)paramObject).b);
    } 
    throw d("Task was cancelled.", ((c)paramObject).d);
  }
  
  static Object j(a<?> parama) {
    if (parama instanceof AbstractFuture) {
      Object object1 = ((AbstractFuture)parama).f;
      object = object1;
      if (object1 instanceof c) {
        c c = (c)object1;
        object = object1;
        if (c.c)
          if (c.d != null) {
            object = new c(false, c.d);
          } else {
            object = c.b;
          }  
      } 
      return object;
    } 
    boolean bool = object.isCancelled();
    if (((b ^ true) & bool) != 0)
      return c.b; 
    try {
      Object object2 = k((Future<Object>)object);
      Object object1 = object2;
      return object1;
    } catch (ExecutionException object) {
      return new Failure(object.getCause());
    } catch (CancellationException cancellationException) {
      return new c(false, cancellationException);
    } finally {
      object = null;
    } 
  }
  
  private static <V> V k(Future<V> paramFuture) {
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
  
  private void n() {
    h h1;
    do {
      h1 = this.h;
    } while (!d.c(this, h1, h.a));
    while (h1 != null) {
      h1.b();
      h1 = h1.c;
    } 
  }
  
  private void o(h paramh) {
    paramh.b = null;
    label24: while (true) {
      paramh = this.h;
      if (paramh == h.a)
        return; 
      for (Object object = null; paramh != null; object = object1) {
        Object object1;
        h h1 = paramh.c;
        if (paramh.b != null) {
          object1 = paramh;
        } else if (object != null) {
          ((h)object).c = h1;
          object1 = object;
          if (((h)object).b == null)
            continue label24; 
        } else {
          object1 = object;
          if (!d.c(this, paramh, h1))
            continue label24; 
        } 
        paramh = h1;
      } 
      break;
    } 
  }
  
  private String s(Object paramObject) {
    return (paramObject == this) ? "this future" : String.valueOf(paramObject);
  }
  
  public final void a(Runnable paramRunnable, Executor paramExecutor) {
    e(paramRunnable);
    e(paramExecutor);
    d d1 = this.g;
    if (d1 != d.a) {
      d d3;
      d d2 = new d(paramRunnable, paramExecutor);
      do {
        d2.d = d1;
        if (d.a(this, d1, d2))
          return; 
        d3 = this.g;
        d1 = d3;
      } while (d3 != d.a);
    } 
    h(paramRunnable, paramExecutor);
  }
  
  protected void c() {}
  
  public final boolean cancel(boolean paramBoolean) {
    boolean bool;
    boolean bool2;
    Object object = this.f;
    boolean bool1 = true;
    if (object == null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool | object instanceof f) {
      c c;
      Object object1;
      if (b) {
        c = new c(paramBoolean, new CancellationException("Future.cancel() was called."));
      } else if (paramBoolean) {
        c = c.a;
      } else {
        c = c.b;
      } 
      bool2 = false;
      AbstractFuture<?> abstractFuture = this;
      do {
        while (d.b(abstractFuture, object, c)) {
          if (paramBoolean)
            abstractFuture.l(); 
          g(abstractFuture);
          bool2 = bool1;
          if (object instanceof f) {
            object = ((f)object).c;
            if (object instanceof AbstractFuture) {
              abstractFuture = (AbstractFuture)object;
              object = abstractFuture.f;
              if (object == null) {
                bool = true;
              } else {
                bool = false;
              } 
              bool2 = bool1;
              if (bool | object instanceof f) {
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
        object1 = abstractFuture.f;
        object = object1;
      } while (object1 instanceof f);
    } else {
      bool2 = false;
    } 
    return bool2;
  }
  
  public final V get() {
    if (!Thread.interrupted()) {
      boolean bool;
      Object object = this.f;
      if (object != null) {
        bool = true;
      } else {
        bool = false;
      } 
      if ((bool & (object instanceof f ^ true)) != 0)
        return i(object); 
      object = this.h;
      if (object != h.a) {
        h h2;
        h h1 = new h();
        do {
          h1.a((h)object);
          if (d.c(this, (h)object, h1))
            while (true) {
              LockSupport.park(this);
              if (!Thread.interrupted()) {
                object = this.f;
                if (object != null) {
                  bool = true;
                } else {
                  bool = false;
                } 
                if ((bool & (object instanceof f ^ true)) != 0)
                  return i(object); 
                continue;
              } 
              o(h1);
              throw new InterruptedException();
            }  
          h2 = this.h;
          object = h2;
        } while (h2 != h.a);
      } 
      return i(this.f);
    } 
    InterruptedException interruptedException = new InterruptedException();
    throw interruptedException;
  }
  
  public final V get(long paramLong, TimeUnit paramTimeUnit) {
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
      if ((bool & (object instanceof f ^ true)) != 0)
        return i(object); 
      if (l > 0L) {
        l1 = System.nanoTime() + l;
      } else {
        l1 = 0L;
      } 
      long l2 = l;
      if (l >= 1000L) {
        object = this.h;
        if (object != h.a) {
          h h1 = new h();
          label78: while (true) {
            h1.a((h)object);
            if (d.c(this, (h)object, h1))
              while (true) {
                LockSupport.parkNanos(this, l);
                if (!Thread.interrupted()) {
                  object = this.f;
                  if (object != null) {
                    bool = true;
                  } else {
                    bool = false;
                  } 
                  if ((bool & (object instanceof f ^ true)) != 0)
                    return i(object); 
                  l2 = l1 - System.nanoTime();
                  l = l2;
                  if (l2 < 1000L) {
                    o(h1);
                    break;
                  } 
                  continue;
                } 
                o(h1);
                throw new InterruptedException();
              }  
            h h2 = this.h;
            object = h2;
            if (h2 == h.a)
              break label78; 
          } 
        } else {
          return i(this.f);
        } 
      } 
      while (l2 > 0L) {
        object = this.f;
        if (object != null) {
          bool = true;
        } else {
          bool = false;
        } 
        if ((bool & (object instanceof f ^ true)) != 0)
          return i(object); 
        if (!Thread.interrupted()) {
          l2 = l1 - System.nanoTime();
          continue;
        } 
        throw new InterruptedException();
      } 
      String str1 = toString();
      String str3 = paramTimeUnit.toString();
      object = Locale.ROOT;
      String str4 = str3.toLowerCase((Locale)object);
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append("Waited ");
      stringBuilder2.append(paramLong);
      stringBuilder2.append(" ");
      stringBuilder2.append(paramTimeUnit.toString().toLowerCase((Locale)object));
      String str2 = stringBuilder2.toString();
      object = str2;
      if (l2 + 1000L < 0L) {
        object = new StringBuilder();
        object.append(str2);
        object.append(" (plus ");
        object = object.toString();
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
          object1 = new StringBuilder();
          object1.append((String)object);
          object1.append(paramLong);
          object1.append(" ");
          object1.append(str4);
          object = object1.toString();
          object1 = object;
          if (bool) {
            object1 = new StringBuilder();
            object1.append((String)object);
            object1.append(",");
            object1 = object1.toString();
          } 
          object = new StringBuilder();
          object.append((String)object1);
          object.append(" ");
          object1 = object.toString();
        } 
        object = object1;
        if (bool) {
          object = new StringBuilder();
          object.append((String)object1);
          object.append(l2);
          object.append(" nanoseconds ");
          object = object.toString();
        } 
        object1 = new StringBuilder();
        object1.append((String)object);
        object1.append("delay)");
        object = object1.toString();
      } 
      if (isDone()) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(" but future completed as timeout expired");
        throw new TimeoutException(stringBuilder.toString());
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append((String)object);
      stringBuilder1.append(" for ");
      stringBuilder1.append(str1);
      throw new TimeoutException(stringBuilder1.toString());
    } 
    InterruptedException interruptedException = new InterruptedException();
    throw interruptedException;
  }
  
  public final boolean isCancelled() {
    return this.f instanceof c;
  }
  
  public final boolean isDone() {
    boolean bool;
    Object object = this.f;
    if (object != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return (object instanceof f ^ true) & bool;
  }
  
  protected void l() {}
  
  protected String m() {
    Object object = this.f;
    if (object instanceof f) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("setFuture=[");
      stringBuilder.append(s(((f)object).c));
      stringBuilder.append("]");
      return stringBuilder.toString();
    } 
    if (this instanceof ScheduledFuture) {
      object = new StringBuilder();
      object.append("remaining delay=[");
      object.append(((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS));
      object.append(" ms]");
      return object.toString();
    } 
    return null;
  }
  
  protected boolean p(V paramV) {
    V v = paramV;
    if (paramV == null)
      v = (V)e; 
    if (d.b(this, null, v)) {
      g(this);
      return true;
    } 
    return false;
  }
  
  protected boolean q(Throwable paramThrowable) {
    Failure failure = new Failure(e(paramThrowable));
    if (d.b(this, null, failure)) {
      g(this);
      return true;
    } 
    return false;
  }
  
  protected boolean r(a<? extends V> parama) {
    Object object1;
    e(parama);
    Object object2 = this.f;
    Object object3 = object2;
    if (object2 == null) {
      if (parama.isDone()) {
        object1 = j(parama);
        if (d.b(this, null, object1)) {
          g(this);
          return true;
        } 
        return false;
      } 
      object3 = new f(this, (a<?>)object1);
      if (d.b(this, null, object3))
        try {
          object1.a((Runnable)object3, DirectExecutor.b);
        } finally {
          object2 = null;
        }  
      object3 = this.f;
    } 
    if (object3 instanceof c)
      object1.cancel(((c)object3).c); 
    return false;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(super.toString());
    stringBuilder.append("[status=");
    if (isCancelled()) {
      stringBuilder.append("CANCELLED");
    } else if (isDone()) {
      b(stringBuilder);
    } else {
      String str;
      try {
        str = m();
      } catch (RuntimeException runtimeException) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Exception thrown from implementation: ");
        stringBuilder1.append(runtimeException.getClass());
        str = stringBuilder1.toString();
      } 
      if (str != null && !str.isEmpty()) {
        stringBuilder.append("PENDING, info=[");
        stringBuilder.append(str);
        stringBuilder.append("]");
      } else if (isDone()) {
        b(stringBuilder);
      } else {
        stringBuilder.append("PENDING");
      } 
    } 
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
  
  static {
    g g;
    Exception exception;
  }
  
  static {
    try {
      e e = new e();
      this(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, h.class, "h"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, d.class, "g"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "f"));
    } finally {
      exception = null;
    } 
    d = g;
    if (exception != null)
      c.log(Level.SEVERE, "SafeAtomicHelper is broken!", exception); 
  }
  
  private static final class Failure {
    static final Failure a = new Failure(new Throwable("Failure occurred while trying to finish a future.") {
          public Throwable fillInStackTrace() {
            /* monitor enter ThisExpression{InnerObjectType{InnerObjectType{ObjectType{androidx/work/impl/utils/futures/AbstractFuture}.Landroidx/work/impl/utils/futures/AbstractFuture$Failure;}.Landroidx/work/impl/utils/futures/AbstractFuture$Failure$1;}} */
            /* monitor exit ThisExpression{InnerObjectType{InnerObjectType{ObjectType{androidx/work/impl/utils/futures/AbstractFuture}.Landroidx/work/impl/utils/futures/AbstractFuture$Failure;}.Landroidx/work/impl/utils/futures/AbstractFuture$Failure$1;}} */
            return this;
          }
        });
    
    final Throwable b;
    
    Failure(Throwable param1Throwable) {
      this.b = AbstractFuture.<Throwable>e(param1Throwable);
    }
  }
  
  static final class null extends Throwable {
    null(String param1String) {
      super(param1String);
    }
    
    public Throwable fillInStackTrace() {
      /* monitor enter ThisExpression{InnerObjectType{InnerObjectType{ObjectType{androidx/work/impl/utils/futures/AbstractFuture}.Landroidx/work/impl/utils/futures/AbstractFuture$Failure;}.Landroidx/work/impl/utils/futures/AbstractFuture$Failure$1;}} */
      /* monitor exit ThisExpression{InnerObjectType{InnerObjectType{ObjectType{androidx/work/impl/utils/futures/AbstractFuture}.Landroidx/work/impl/utils/futures/AbstractFuture$Failure;}.Landroidx/work/impl/utils/futures/AbstractFuture$Failure$1;}} */
      return this;
    }
  }
  
  private static abstract class b {
    private b() {}
    
    abstract boolean a(AbstractFuture<?> param1AbstractFuture, AbstractFuture.d param1d1, AbstractFuture.d param1d2);
    
    abstract boolean b(AbstractFuture<?> param1AbstractFuture, Object param1Object1, Object param1Object2);
    
    abstract boolean c(AbstractFuture<?> param1AbstractFuture, AbstractFuture.h param1h1, AbstractFuture.h param1h2);
    
    abstract void d(AbstractFuture.h param1h1, AbstractFuture.h param1h2);
    
    abstract void e(AbstractFuture.h param1h, Thread param1Thread);
  }
  
  private static final class c {
    static final c a;
    
    static final c b;
    
    final boolean c;
    
    final Throwable d;
    
    static {
      if (AbstractFuture.b) {
        b = null;
        a = null;
      } else {
        b = new c(false, null);
        a = new c(true, null);
      } 
    }
    
    c(boolean param1Boolean, Throwable param1Throwable) {
      this.c = param1Boolean;
      this.d = param1Throwable;
    }
  }
  
  private static final class d {
    static final d a = new d(null, null);
    
    final Runnable b;
    
    final Executor c;
    
    d d;
    
    d(Runnable param1Runnable, Executor param1Executor) {
      this.b = param1Runnable;
      this.c = param1Executor;
    }
  }
  
  private static final class e extends b {
    final AtomicReferenceFieldUpdater<AbstractFuture.h, Thread> a;
    
    final AtomicReferenceFieldUpdater<AbstractFuture.h, AbstractFuture.h> b;
    
    final AtomicReferenceFieldUpdater<AbstractFuture, AbstractFuture.h> c;
    
    final AtomicReferenceFieldUpdater<AbstractFuture, AbstractFuture.d> d;
    
    final AtomicReferenceFieldUpdater<AbstractFuture, Object> e;
    
    e(AtomicReferenceFieldUpdater<AbstractFuture.h, Thread> param1AtomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<AbstractFuture.h, AbstractFuture.h> param1AtomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater<AbstractFuture, AbstractFuture.h> param1AtomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, AbstractFuture.d> param1AtomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, Object> param1AtomicReferenceFieldUpdater4) {
      super(null);
      this.a = param1AtomicReferenceFieldUpdater;
      this.b = param1AtomicReferenceFieldUpdater1;
      this.c = param1AtomicReferenceFieldUpdater2;
      this.d = param1AtomicReferenceFieldUpdater3;
      this.e = param1AtomicReferenceFieldUpdater4;
    }
    
    boolean a(AbstractFuture<?> param1AbstractFuture, AbstractFuture.d param1d1, AbstractFuture.d param1d2) {
      return this.d.compareAndSet(param1AbstractFuture, param1d1, param1d2);
    }
    
    boolean b(AbstractFuture<?> param1AbstractFuture, Object param1Object1, Object param1Object2) {
      return this.e.compareAndSet(param1AbstractFuture, param1Object1, param1Object2);
    }
    
    boolean c(AbstractFuture<?> param1AbstractFuture, AbstractFuture.h param1h1, AbstractFuture.h param1h2) {
      return this.c.compareAndSet(param1AbstractFuture, param1h1, param1h2);
    }
    
    void d(AbstractFuture.h param1h1, AbstractFuture.h param1h2) {
      this.b.lazySet(param1h1, param1h2);
    }
    
    void e(AbstractFuture.h param1h, Thread param1Thread) {
      this.a.lazySet(param1h, param1Thread);
    }
  }
  
  private static final class f<V> implements Runnable {
    final AbstractFuture<V> b;
    
    final a<? extends V> c;
    
    f(AbstractFuture<V> param1AbstractFuture, a<? extends V> param1a) {
      this.b = param1AbstractFuture;
      this.c = param1a;
    }
    
    public void run() {
      if (this.b.f != this)
        return; 
      Object object = AbstractFuture.j(this.c);
      if (AbstractFuture.d.b(this.b, this, object))
        AbstractFuture.g(this.b); 
    }
  }
  
  private static final class g extends b {
    g() {
      super(null);
    }
    
    boolean a(AbstractFuture<?> param1AbstractFuture, AbstractFuture.d param1d1, AbstractFuture.d param1d2) {
      // Byte code:
      //   0: aload_1
      //   1: monitorenter
      //   2: aload_1
      //   3: getfield g : Landroidx/work/impl/utils/futures/AbstractFuture$d;
      //   6: aload_2
      //   7: if_acmpne -> 19
      //   10: aload_1
      //   11: aload_3
      //   12: putfield g : Landroidx/work/impl/utils/futures/AbstractFuture$d;
      //   15: aload_1
      //   16: monitorexit
      //   17: iconst_1
      //   18: ireturn
      //   19: aload_1
      //   20: monitorexit
      //   21: iconst_0
      //   22: ireturn
      //   23: astore_2
      //   24: aload_1
      //   25: monitorexit
      //   26: aload_2
      //   27: athrow
      // Exception table:
      //   from	to	target	type
      //   2	17	23	finally
      //   19	21	23	finally
      //   24	26	23	finally
    }
    
    boolean b(AbstractFuture<?> param1AbstractFuture, Object param1Object1, Object param1Object2) {
      // Byte code:
      //   0: aload_1
      //   1: monitorenter
      //   2: aload_1
      //   3: getfield f : Ljava/lang/Object;
      //   6: aload_2
      //   7: if_acmpne -> 19
      //   10: aload_1
      //   11: aload_3
      //   12: putfield f : Ljava/lang/Object;
      //   15: aload_1
      //   16: monitorexit
      //   17: iconst_1
      //   18: ireturn
      //   19: aload_1
      //   20: monitorexit
      //   21: iconst_0
      //   22: ireturn
      //   23: astore_2
      //   24: aload_1
      //   25: monitorexit
      //   26: aload_2
      //   27: athrow
      // Exception table:
      //   from	to	target	type
      //   2	17	23	finally
      //   19	21	23	finally
      //   24	26	23	finally
    }
    
    boolean c(AbstractFuture<?> param1AbstractFuture, AbstractFuture.h param1h1, AbstractFuture.h param1h2) {
      // Byte code:
      //   0: aload_1
      //   1: monitorenter
      //   2: aload_1
      //   3: getfield h : Landroidx/work/impl/utils/futures/AbstractFuture$h;
      //   6: aload_2
      //   7: if_acmpne -> 19
      //   10: aload_1
      //   11: aload_3
      //   12: putfield h : Landroidx/work/impl/utils/futures/AbstractFuture$h;
      //   15: aload_1
      //   16: monitorexit
      //   17: iconst_1
      //   18: ireturn
      //   19: aload_1
      //   20: monitorexit
      //   21: iconst_0
      //   22: ireturn
      //   23: astore_2
      //   24: aload_1
      //   25: monitorexit
      //   26: aload_2
      //   27: athrow
      // Exception table:
      //   from	to	target	type
      //   2	17	23	finally
      //   19	21	23	finally
      //   24	26	23	finally
    }
    
    void d(AbstractFuture.h param1h1, AbstractFuture.h param1h2) {
      param1h1.c = param1h2;
    }
    
    void e(AbstractFuture.h param1h, Thread param1Thread) {
      param1h.b = param1Thread;
    }
  }
  
  private static final class h {
    static final h a = new h(false);
    
    volatile Thread b;
    
    volatile h c;
    
    h() {
      AbstractFuture.d.e(this, Thread.currentThread());
    }
    
    h(boolean param1Boolean) {}
    
    void a(h param1h) {
      AbstractFuture.d.d(this, param1h);
    }
    
    void b() {
      Thread thread = this.b;
      if (thread != null) {
        this.b = null;
        LockSupport.unpark(thread);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/utils/futures/AbstractFuture.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */