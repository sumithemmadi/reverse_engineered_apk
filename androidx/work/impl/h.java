package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.f;
import androidx.work.i;
import androidx.work.impl.background.systemjob.b;
import androidx.work.impl.j.a.a;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.a;
import androidx.work.impl.utils.e;
import androidx.work.impl.utils.g;
import androidx.work.impl.utils.h;
import androidx.work.impl.utils.j.a;
import androidx.work.impl.utils.j.b;
import androidx.work.k;
import androidx.work.l;
import java.util.Arrays;
import java.util.List;

public class h extends k {
  private static h a;
  
  private static h b;
  
  private static final Object c = new Object();
  
  private Context d;
  
  private a e;
  
  private WorkDatabase f;
  
  private a g;
  
  private List<d> h;
  
  private c i;
  
  private e j;
  
  private boolean k;
  
  private BroadcastReceiver.PendingResult l;
  
  public h(Context paramContext, a parama, a parama1) {
    this(paramContext, parama, parama1, paramContext.getResources().getBoolean(i.workmanager_test_configuration));
  }
  
  public h(Context paramContext, a parama, a parama1, boolean paramBoolean) {
    Context context = paramContext.getApplicationContext();
    WorkDatabase workDatabase = WorkDatabase.r(context, parama.g(), paramBoolean);
    f.e((f)new f.a(parama.f()));
    List<d> list = f(context, parama1);
    p(paramContext, parama, parama1, workDatabase, list, new c(paramContext, parama, parama1, workDatabase, list));
  }
  
  public static void e(Context paramContext, a parama) {
    synchronized (c) {
      h h1 = a;
      if (h1 == null || b == null) {
        if (h1 == null) {
          paramContext = paramContext.getApplicationContext();
          if (b == null) {
            h1 = new h();
            b b = new b();
            this(parama.g());
            this(paramContext, parama, (a)b);
            b = h1;
          } 
          a = b;
        } 
        return;
      } 
      IllegalStateException illegalStateException = new IllegalStateException();
      this("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
      throw illegalStateException;
    } 
  }
  
  @Deprecated
  public static h i() {
    synchronized (c) {
      h h1 = a;
      if (h1 != null)
        return h1; 
      h1 = b;
      return h1;
    } 
  }
  
  public static h j(Context paramContext) {
    synchronized (c) {
      h h1 = i();
      h h2 = h1;
      if (h1 == null) {
        paramContext = paramContext.getApplicationContext();
        if (paramContext instanceof a.b) {
          e(paramContext, ((a.b)paramContext).a());
          h2 = j(paramContext);
        } else {
          IllegalStateException illegalStateException = new IllegalStateException();
          this("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
          throw illegalStateException;
        } 
      } 
      return h2;
    } 
  }
  
  private void p(Context paramContext, a parama, a parama1, WorkDatabase paramWorkDatabase, List<d> paramList, c paramc) {
    paramContext = paramContext.getApplicationContext();
    this.d = paramContext;
    this.e = parama;
    this.g = parama1;
    this.f = paramWorkDatabase;
    this.h = paramList;
    this.i = paramc;
    this.j = new e(paramContext);
    this.k = false;
    this.g.b((Runnable)new ForceStopRunnable(paramContext, this));
  }
  
  public androidx.work.h a(String paramString) {
    a a1 = a.c(paramString, this);
    this.g.b((Runnable)a1);
    return a1.d();
  }
  
  public androidx.work.h c(List<? extends l> paramList) {
    if (!paramList.isEmpty())
      return (new f(this, paramList)).a(); 
    throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
  }
  
  public List<d> f(Context paramContext, a parama) {
    return Arrays.asList(new d[] { e.a(paramContext, this), (d)new a(paramContext, parama, this) });
  }
  
  public Context g() {
    return this.d;
  }
  
  public a h() {
    return this.e;
  }
  
  public e k() {
    return this.j;
  }
  
  public c l() {
    return this.i;
  }
  
  public List<d> m() {
    return this.h;
  }
  
  public WorkDatabase n() {
    return this.f;
  }
  
  public a o() {
    return this.g;
  }
  
  public void q() {
    synchronized (c) {
      this.k = true;
      BroadcastReceiver.PendingResult pendingResult = this.l;
      if (pendingResult != null) {
        pendingResult.finish();
        this.l = null;
      } 
      return;
    } 
  }
  
  public void r() {
    if (Build.VERSION.SDK_INT >= 23)
      b.b(g()); 
    n().y().s();
    e.b(h(), n(), m());
  }
  
  public void s(BroadcastReceiver.PendingResult paramPendingResult) {
    synchronized (c) {
      this.l = paramPendingResult;
      if (this.k) {
        paramPendingResult.finish();
        this.l = null;
      } 
      return;
    } 
  }
  
  public void t(String paramString) {
    u(paramString, null);
  }
  
  public void u(String paramString, WorkerParameters.a parama) {
    this.g.b((Runnable)new g(this, paramString, parama));
  }
  
  public void v(String paramString) {
    this.g.b((Runnable)new h(this, paramString));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */