package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.d;
import androidx.work.e;
import androidx.work.f;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.l.b;
import androidx.work.impl.l.j;
import androidx.work.impl.l.k;
import androidx.work.impl.l.n;
import androidx.work.impl.utils.d;
import androidx.work.impl.utils.futures.a;
import androidx.work.impl.utils.j.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public class i implements Runnable {
  static final String b = f.f("WorkerWrapper");
  
  private Context c;
  
  private String d;
  
  private List<d> e;
  
  private WorkerParameters.a f;
  
  j g;
  
  ListenableWorker h;
  
  ListenableWorker.a i = ListenableWorker.a.a();
  
  private androidx.work.a j;
  
  private a k;
  
  private WorkDatabase l;
  
  private k m;
  
  private b n;
  
  private n o;
  
  private List<String> p;
  
  private String q;
  
  private a<Boolean> r = a.t();
  
  com.google.common.util.concurrent.a<ListenableWorker.a> s = null;
  
  private volatile boolean t;
  
  i(c paramc) {
    this.c = paramc.a;
    this.k = paramc.c;
    this.d = paramc.f;
    this.e = paramc.g;
    this.f = paramc.h;
    this.h = paramc.b;
    this.j = paramc.d;
    WorkDatabase workDatabase = paramc.e;
    this.l = workDatabase;
    this.m = workDatabase.y();
    this.n = this.l.s();
    this.o = this.l.z();
  }
  
  private String a(List<String> paramList) {
    StringBuilder stringBuilder = new StringBuilder("Work [ id=");
    stringBuilder.append(this.d);
    stringBuilder.append(", tags={ ");
    Iterator<String> iterator = paramList.iterator();
    boolean bool = true;
    while (iterator.hasNext()) {
      String str = iterator.next();
      if (bool) {
        bool = false;
      } else {
        stringBuilder.append(", ");
      } 
      stringBuilder.append(str);
    } 
    stringBuilder.append(" } ]");
    return stringBuilder.toString();
  }
  
  private void c(ListenableWorker.a parama) {
    if (parama instanceof ListenableWorker.a.c) {
      f.c().d(b, String.format("Worker result SUCCESS for %s", new Object[] { this.q }), new Throwable[0]);
      if (this.g.d()) {
        h();
      } else {
        m();
      } 
    } else if (parama instanceof ListenableWorker.a.b) {
      f.c().d(b, String.format("Worker result RETRY for %s", new Object[] { this.q }), new Throwable[0]);
      g();
    } else {
      f.c().d(b, String.format("Worker result FAILURE for %s", new Object[] { this.q }), new Throwable[0]);
      if (this.g.d()) {
        h();
      } else {
        l();
      } 
    } 
  }
  
  private void e(String paramString) {
    LinkedList<String> linkedList = new LinkedList();
    linkedList.add(paramString);
    while (!linkedList.isEmpty()) {
      paramString = linkedList.remove();
      if (this.m.l(paramString) != WorkInfo.State.g)
        this.m.a(WorkInfo.State.e, new String[] { paramString }); 
      linkedList.addAll(this.n.b(paramString));
    } 
  }
  
  private void g() {
    this.l.c();
    try {
      this.m.a(WorkInfo.State.b, new String[] { this.d });
      this.m.r(this.d, System.currentTimeMillis());
      this.m.b(this.d, -1L);
      this.l.q();
      return;
    } finally {
      this.l.g();
      i(true);
    } 
  }
  
  private void h() {
    this.l.c();
    try {
      this.m.r(this.d, System.currentTimeMillis());
      this.m.a(WorkInfo.State.b, new String[] { this.d });
      this.m.n(this.d);
      this.m.b(this.d, -1L);
      this.l.q();
      return;
    } finally {
      this.l.g();
      i(false);
    } 
  }
  
  private void i(boolean paramBoolean) {
    this.l.c();
    try {
      boolean bool;
      List list = this.l.y().j();
      if (list == null || list.isEmpty()) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool)
        d.a(this.c, RescheduleReceiver.class, false); 
      this.l.q();
      this.l.g();
      return;
    } finally {
      this.l.g();
    } 
  }
  
  private void j() {
    WorkInfo.State state = this.m.l(this.d);
    if (state == WorkInfo.State.c) {
      f.c().a(b, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[] { this.d }), new Throwable[0]);
      i(true);
    } else {
      f.c().a(b, String.format("Status for %s is %s; not doing any work", new Object[] { this.d, state }), new Throwable[0]);
      i(false);
    } 
  }
  
  private void k() {
    if (n())
      return; 
    this.l.c();
    try {
      d d;
      j j1 = this.m.m(this.d);
      this.g = j1;
      if (j1 == null) {
        f.c().b(b, String.format("Didn't find WorkSpec for id %s", new Object[] { this.d }), new Throwable[0]);
        i(false);
        return;
      } 
      if (j1.d != WorkInfo.State.b) {
        j();
        this.l.q();
        f.c().a(b, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[] { this.g.e }), new Throwable[0]);
        return;
      } 
      if (j1.d() || this.g.c()) {
        boolean bool;
        long l = System.currentTimeMillis();
        j1 = this.g;
        if (j1.p == 0L) {
          bool = true;
        } else {
          bool = false;
        } 
        if (!bool && l < j1.a()) {
          f.c().a(b, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[] { this.g.e }), new Throwable[0]);
          i(true);
          return;
        } 
      } 
      this.l.q();
      this.l.g();
      if (this.g.d()) {
        d = this.g.g;
      } else {
        e e = e.a(this.g.f);
        if (e == null) {
          f.c().b(b, String.format("Could not create Input Merger %s", new Object[] { this.g.f }), new Throwable[0]);
          return;
        } 
        ArrayList<d> arrayList = new ArrayList();
        arrayList.add(this.g.g);
        arrayList.addAll(this.m.p(this.d));
        d = e.b(arrayList);
      } 
      WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.d), d, this.p, this.f, this.g.m, this.j.b(), this.k, this.j.h());
      if (this.h == null)
        this.h = this.j.h().b(this.c, this.g.e, workerParameters); 
      ListenableWorker listenableWorker = this.h;
      if (listenableWorker == null) {
        f.c().b(b, String.format("Could not create Worker %s", new Object[] { this.g.e }), new Throwable[0]);
        return;
      } 
      if (listenableWorker.isUsed()) {
        f.c().b(b, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[] { this.g.e }), new Throwable[0]);
        return;
      } 
      this.h.setUsed();
      return;
    } finally {
      this.l.g();
    } 
  }
  
  private void m() {
    this.l.c();
    try {
      this.m.a(WorkInfo.State.d, new String[] { this.d });
      d d = ((ListenableWorker.a.c)this.i).e();
      this.m.h(this.d, d);
      long l = System.currentTimeMillis();
      for (String str : this.n.b(this.d)) {
        if (this.m.l(str) == WorkInfo.State.f && this.n.c(str)) {
          f.c().d(b, String.format("Setting status to enqueued for %s", new Object[] { str }), new Throwable[0]);
          this.m.a(WorkInfo.State.b, new String[] { str });
          this.m.r(str, l);
        } 
      } 
      this.l.q();
      return;
    } finally {
      this.l.g();
      i(false);
    } 
  }
  
  private boolean n() {
    if (this.t) {
      f.c().a(b, String.format("Work interrupted for %s", new Object[] { this.q }), new Throwable[0]);
      WorkInfo.State state = this.m.l(this.d);
      if (state == null) {
        i(false);
      } else {
        i(state.isFinished() ^ true);
      } 
      return true;
    } 
    return false;
  }
  
  private boolean o() {
    this.l.c();
    try {
      WorkInfo.State state1 = this.m.l(this.d);
      WorkInfo.State state2 = WorkInfo.State.b;
      boolean bool = true;
      if (state1 == state2) {
        this.m.a(WorkInfo.State.c, new String[] { this.d });
        this.m.q(this.d);
      } else {
        bool = false;
      } 
      this.l.q();
      return bool;
    } finally {
      this.l.g();
    } 
  }
  
  public com.google.common.util.concurrent.a<Boolean> b() {
    return (com.google.common.util.concurrent.a<Boolean>)this.r;
  }
  
  public void d(boolean paramBoolean) {
    this.t = true;
    n();
    com.google.common.util.concurrent.a<ListenableWorker.a> a1 = this.s;
    if (a1 != null)
      a1.cancel(true); 
    ListenableWorker listenableWorker = this.h;
    if (listenableWorker != null)
      listenableWorker.stop(); 
  }
  
  void f() {
    boolean bool1 = n();
    boolean bool2 = false;
    boolean bool = false;
    if (!bool1) {
      this.l.c();
      try {
        WorkInfo.State state = this.m.l(this.d);
        if (state == null) {
          i(false);
          bool2 = true;
        } else if (state == WorkInfo.State.c) {
          c(this.i);
          bool2 = this.m.l(this.d).isFinished();
        } else {
          bool2 = bool;
          if (!state.isFinished()) {
            g();
            bool2 = bool;
          } 
        } 
        this.l.q();
      } finally {
        this.l.g();
      } 
    } 
    List<d> list = this.e;
    if (list != null) {
      if (bool2) {
        Iterator<d> iterator = list.iterator();
        while (iterator.hasNext())
          ((d)iterator.next()).d(this.d); 
      } 
      e.b(this.j, this.l, this.e);
    } 
  }
  
  void l() {
    this.l.c();
    try {
      e(this.d);
      d d = ((ListenableWorker.a.a)this.i).e();
      this.m.h(this.d, d);
      this.l.q();
      return;
    } finally {
      this.l.g();
      i(false);
    } 
  }
  
  public void run() {
    List<String> list = this.o.b(this.d);
    this.p = list;
    this.q = a(list);
    k();
  }
  
  class a implements Runnable {
    a(i this$0, a param1a) {}
    
    public void run() {
      try {
        f.c().a(i.b, String.format("Starting work for %s", new Object[] { this.c.g.e }), new Throwable[0]);
        i i1 = this.c;
        i1.s = i1.h.startWork();
        this.b.r(this.c.s);
      } finally {
        Exception exception = null;
      } 
    }
  }
  
  class b implements Runnable {
    b(i this$0, a param1a, String param1String) {}
    
    @SuppressLint({"SyntheticAccessor"})
    public void run() {
      try {
        ListenableWorker.a a1 = (ListenableWorker.a)this.b.get();
        if (a1 == null) {
          f.c().b(i.b, String.format("%s returned a null result. Treating it as a failure.", new Object[] { this.d.g.e }), new Throwable[0]);
        } else {
          f.c().a(i.b, String.format("%s returned a %s result.", new Object[] { this.d.g.e, a1 }), new Throwable[0]);
          this.d.i = a1;
        } 
      } catch (CancellationException cancellationException) {
        f.c().d(i.b, String.format("%s was cancelled", new Object[] { this.c }), new Throwable[] { cancellationException });
      } catch (InterruptedException interruptedException) {
        f.c().b(i.b, String.format("%s failed because it threw an exception/error", new Object[] { this.c }), new Throwable[] { interruptedException });
      } catch (ExecutionException executionException) {
        f.c().b(i.b, String.format("%s failed because it threw an exception/error", new Object[] { this.c }), new Throwable[] { executionException });
      } finally {
        Exception exception;
      } 
      this.d.f();
    }
  }
  
  public static class c {
    Context a;
    
    ListenableWorker b;
    
    a c;
    
    androidx.work.a d;
    
    WorkDatabase e;
    
    String f;
    
    List<d> g;
    
    WorkerParameters.a h = new WorkerParameters.a();
    
    public c(Context param1Context, androidx.work.a param1a, a param1a1, WorkDatabase param1WorkDatabase, String param1String) {
      this.a = param1Context.getApplicationContext();
      this.c = param1a1;
      this.d = param1a;
      this.e = param1WorkDatabase;
      this.f = param1String;
    }
    
    public i a() {
      return new i(this);
    }
    
    public c b(WorkerParameters.a param1a) {
      if (param1a != null)
        this.h = param1a; 
      return this;
    }
    
    public c c(List<d> param1List) {
      this.g = param1List;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */