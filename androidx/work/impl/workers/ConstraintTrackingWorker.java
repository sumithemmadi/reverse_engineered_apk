package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.h;
import androidx.work.impl.k.c;
import androidx.work.impl.k.d;
import androidx.work.impl.l.j;
import java.util.Collections;
import java.util.List;

public class ConstraintTrackingWorker extends ListenableWorker implements c {
  private static final String f = f.f("ConstraintTrkngWrkr");
  
  private WorkerParameters g;
  
  final Object h;
  
  volatile boolean i;
  
  androidx.work.impl.utils.futures.a<ListenableWorker.a> j;
  
  private ListenableWorker k;
  
  public ConstraintTrackingWorker(Context paramContext, WorkerParameters paramWorkerParameters) {
    super(paramContext, paramWorkerParameters);
    this.g = paramWorkerParameters;
    this.h = new Object();
    this.i = false;
    this.j = androidx.work.impl.utils.futures.a.t();
  }
  
  public WorkDatabase a() {
    return h.j(getApplicationContext()).n();
  }
  
  public void b(List<String> paramList) {
    f.c().a(f, String.format("Constraints changed for %s", new Object[] { paramList }), new Throwable[0]);
    synchronized (this.h) {
      this.i = true;
      return;
    } 
  }
  
  void c() {
    this.j.p(ListenableWorker.a.a());
  }
  
  void d() {
    this.j.p(ListenableWorker.a.b());
  }
  
  public void e(List<String> paramList) {}
  
  void f() {
    String str = getInputData().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
    if (TextUtils.isEmpty(str)) {
      f.c().b(f, "No worker to delegate to.", new Throwable[0]);
      c();
      return;
    } 
    ListenableWorker listenableWorker = getWorkerFactory().b(getApplicationContext(), str, this.g);
    this.k = listenableWorker;
    if (listenableWorker == null) {
      f.c().a(f, "No worker to delegate to.", new Throwable[0]);
      c();
      return;
    } 
    j j = a().y().m(getId().toString());
    if (j == null) {
      c();
      return;
    } 
    d d = new d(getApplicationContext(), getTaskExecutor(), this);
    d.d(Collections.singletonList(j));
    if (d.c(getId().toString())) {
      f.c().a(f, String.format("Constraints met for delegate %s", new Object[] { str }), new Throwable[0]);
      try {
        com.google.common.util.concurrent.a a1 = this.k.startWork();
        b b = new b();
        this(this, a1);
        a1.a(b, getBackgroundExecutor());
      } finally {
        Exception exception = null;
        f f = f.c();
        null = f;
        f.a(null, String.format("Delegated worker %s threw exception in startWork.", new Object[] { str }), new Throwable[] { exception });
      } 
    } else {
      f.c().a(f, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[] { str }), new Throwable[0]);
      d();
    } 
  }
  
  public androidx.work.impl.utils.j.a getTaskExecutor() {
    return h.j(getApplicationContext()).o();
  }
  
  public void onStopped() {
    super.onStopped();
    ListenableWorker listenableWorker = this.k;
    if (listenableWorker != null)
      listenableWorker.stop(); 
  }
  
  public com.google.common.util.concurrent.a<ListenableWorker.a> startWork() {
    getBackgroundExecutor().execute(new a(this));
    return (com.google.common.util.concurrent.a<ListenableWorker.a>)this.j;
  }
  
  class a implements Runnable {
    a(ConstraintTrackingWorker this$0) {}
    
    public void run() {
      this.b.f();
    }
  }
  
  class b implements Runnable {
    b(ConstraintTrackingWorker this$0, com.google.common.util.concurrent.a param1a) {}
    
    public void run() {
      synchronized (this.c.h) {
        if (this.c.i) {
          this.c.d();
        } else {
          this.c.j.r(this.b);
        } 
        return;
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/workers/ConstraintTrackingWorker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */