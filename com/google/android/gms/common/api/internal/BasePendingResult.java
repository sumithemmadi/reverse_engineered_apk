package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.base.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends i> extends f<R> {
  static final ThreadLocal<Boolean> a = new t0();
  
  private final Object b;
  
  private final a<R> c;
  
  private final WeakReference<d> d;
  
  private final CountDownLatch e;
  
  private final ArrayList<f.a> f;
  
  private j<? super R> g;
  
  private final AtomicReference<k0> h;
  
  private R i;
  
  private Status j;
  
  private volatile boolean k;
  
  private boolean l;
  
  private boolean m;
  
  @KeepName
  private b mResultGuardian;
  
  private m n;
  
  private volatile i0<R> o;
  
  private boolean p;
  
  @Deprecated
  BasePendingResult() {
    this.b = new Object();
    this.e = new CountDownLatch(1);
    this.f = new ArrayList<f.a>();
    this.h = new AtomicReference<k0>();
    this.p = false;
    this.c = new a<R>(Looper.getMainLooper());
    this.d = new WeakReference<d>(null);
  }
  
  protected BasePendingResult(d paramd) {
    Looper looper;
    this.b = new Object();
    this.e = new CountDownLatch(1);
    this.f = new ArrayList<f.a>();
    this.h = new AtomicReference<k0>();
    this.p = false;
    if (paramd != null) {
      looper = paramd.c();
    } else {
      looper = Looper.getMainLooper();
    } 
    this.c = new a<R>(looper);
    this.d = new WeakReference<d>(paramd);
  }
  
  private final R d() {
    synchronized (this.b) {
      boolean bool;
      if (!this.k) {
        bool = true;
      } else {
        bool = false;
      } 
      t.n(bool, "Result has already been consumed.");
      t.n(e(), "Result is not ready.");
      R r = this.i;
      this.i = null;
      this.g = null;
      this.k = true;
      null = this.h.getAndSet(null);
      if (null != null)
        null.a(this); 
      return r;
    } 
  }
  
  private static <R extends i> j<R> h(j<R> paramj) {
    return paramj;
  }
  
  private final void i(R paramR) {
    this.i = paramR;
    this.n = null;
    this.e.countDown();
    this.j = this.i.c();
    if (this.l) {
      this.g = null;
    } else if (this.g == null) {
      if (this.i instanceof h)
        this.mResultGuardian = new b(null); 
    } else {
      this.c.removeMessages(2);
      this.c.a(this.g, d());
    } 
    ArrayList<f.a> arrayList = this.f;
    int k = arrayList.size();
    byte b1 = 0;
    while (b1 < k) {
      paramR = (R)arrayList.get(b1);
      b1++;
      ((f.a)paramR).a(this.j);
    } 
    this.f.clear();
  }
  
  public static void k(i parami) {
    if (parami instanceof h)
      try {
        ((h)parami).a();
        return;
      } catch (RuntimeException runtimeException) {
        String str = String.valueOf(parami);
        StringBuilder stringBuilder = new StringBuilder(str.length() + 18);
        stringBuilder.append("Unable to release ");
        stringBuilder.append(str);
        Log.w("BasePendingResult", stringBuilder.toString(), runtimeException);
      }  
  }
  
  public final void a(f.a parama) {
    boolean bool;
    if (parama != null) {
      bool = true;
    } else {
      bool = false;
    } 
    t.b(bool, "Callback cannot be null.");
    synchronized (this.b) {
      if (e()) {
        parama.a(this.j);
      } else {
        this.f.add(parama);
      } 
      return;
    } 
  }
  
  public final R b(long paramLong, TimeUnit paramTimeUnit) {
    if (paramLong > 0L)
      t.i("await must not be called on the UI thread when time is greater than zero."); 
    boolean bool = this.k;
    boolean bool1 = true;
    t.n(bool ^ true, "Result has already been consumed.");
    if (this.o != null)
      bool1 = false; 
    t.n(bool1, "Cannot await if then() has been called.");
    try {
      if (!this.e.await(paramLong, paramTimeUnit))
        l(Status.e); 
    } catch (InterruptedException interruptedException) {
      l(Status.c);
    } 
    t.n(e(), "Result is not ready.");
    return d();
  }
  
  protected abstract R c(Status paramStatus);
  
  public final boolean e() {
    return (this.e.getCount() == 0L);
  }
  
  public final void f(R paramR) {
    synchronized (this.b) {
      if (!this.m && !this.l) {
        e();
        boolean bool = e();
        boolean bool1 = true;
        if (!bool) {
          bool = true;
        } else {
          bool = false;
        } 
        t.n(bool, "Results have already been set");
        if (!this.k) {
          bool = bool1;
        } else {
          bool = false;
        } 
        t.n(bool, "Result has already been consumed");
        i(paramR);
        return;
      } 
      k((i)paramR);
      return;
    } 
  }
  
  public final void l(Status paramStatus) {
    synchronized (this.b) {
      if (!e()) {
        f(c(paramStatus));
        this.m = true;
      } 
      return;
    } 
  }
  
  public final void m() {
    boolean bool;
    if (this.p || ((Boolean)a.get()).booleanValue()) {
      bool = true;
    } else {
      bool = false;
    } 
    this.p = bool;
  }
  
  public static class a<R extends i> extends e {
    public a(Looper param1Looper) {
      super(param1Looper);
    }
    
    public final void a(j<? super R> param1j, R param1R) {
      sendMessage(obtainMessage(1, new Pair(BasePendingResult.j(param1j), param1R)));
    }
    
    public void handleMessage(Message param1Message) {
      StringBuilder stringBuilder;
      int i = param1Message.what;
      if (i != 1) {
        if (i != 2) {
          stringBuilder = new StringBuilder(45);
          stringBuilder.append("Don't know how to handle message: ");
          stringBuilder.append(i);
          Log.wtf("BasePendingResult", stringBuilder.toString(), new Exception());
          return;
        } 
        ((BasePendingResult)((Message)stringBuilder).obj).l(Status.e);
        return;
      } 
      Pair pair = (Pair)((Message)stringBuilder).obj;
      j j = (j)pair.first;
      i i1 = (i)pair.second;
      try {
        j.a(i1);
        return;
      } catch (RuntimeException runtimeException) {
        BasePendingResult.k(i1);
        throw runtimeException;
      } 
    }
  }
  
  private final class b {
    private b(BasePendingResult this$0) {}
    
    protected final void finalize() {
      BasePendingResult.k(BasePendingResult.g(this.a));
      super.finalize();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/BasePendingResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */