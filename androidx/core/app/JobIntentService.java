package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class JobIntentService extends Service {
  static final Object b = new Object();
  
  static final HashMap<ComponentName, h> c = new HashMap<ComponentName, h>();
  
  b d;
  
  h e;
  
  a f;
  
  boolean g = false;
  
  boolean h = false;
  
  boolean i = false;
  
  final ArrayList<d> j;
  
  public JobIntentService() {
    if (Build.VERSION.SDK_INT >= 26) {
      this.j = null;
    } else {
      this.j = new ArrayList<d>();
    } 
  }
  
  static h d(Context paramContext, ComponentName paramComponentName, boolean paramBoolean, int paramInt) {
    HashMap<ComponentName, h> hashMap = c;
    h h1 = hashMap.get(paramComponentName);
    h h2 = h1;
    if (h1 == null) {
      g g;
      c c;
      if (Build.VERSION.SDK_INT >= 26) {
        if (paramBoolean) {
          g = new g(paramContext, paramComponentName, paramInt);
        } else {
          throw new IllegalArgumentException("Can't be here without a job id");
        } 
      } else {
        c = new c((Context)g, paramComponentName);
      } 
      hashMap.put(paramComponentName, c);
      h2 = c;
    } 
    return h2;
  }
  
  e a() {
    b b1 = this.d;
    if (b1 != null)
      return b1.b(); 
    synchronized (this.j) {
      if (this.j.size() > 0)
        return this.j.remove(0); 
      return null;
    } 
  }
  
  boolean b() {
    a a1 = this.f;
    if (a1 != null)
      a1.cancel(this.g); 
    this.h = true;
    return f();
  }
  
  void c(boolean paramBoolean) {
    if (this.f == null) {
      this.f = new a(this);
      h h1 = this.e;
      if (h1 != null && paramBoolean)
        h1.c(); 
      this.f.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
    } 
  }
  
  protected abstract void e(Intent paramIntent);
  
  public boolean f() {
    return true;
  }
  
  void g() {
    // Byte code:
    //   0: aload_0
    //   1: getfield j : Ljava/util/ArrayList;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull -> 64
    //   9: aload_1
    //   10: monitorenter
    //   11: aload_0
    //   12: aconst_null
    //   13: putfield f : Landroidx/core/app/JobIntentService$a;
    //   16: aload_0
    //   17: getfield j : Ljava/util/ArrayList;
    //   20: astore_2
    //   21: aload_2
    //   22: ifnull -> 40
    //   25: aload_2
    //   26: invokevirtual size : ()I
    //   29: ifle -> 40
    //   32: aload_0
    //   33: iconst_0
    //   34: invokevirtual c : (Z)V
    //   37: goto -> 54
    //   40: aload_0
    //   41: getfield i : Z
    //   44: ifne -> 54
    //   47: aload_0
    //   48: getfield e : Landroidx/core/app/JobIntentService$h;
    //   51: invokevirtual b : ()V
    //   54: aload_1
    //   55: monitorexit
    //   56: goto -> 64
    //   59: astore_2
    //   60: aload_1
    //   61: monitorexit
    //   62: aload_2
    //   63: athrow
    //   64: return
    // Exception table:
    //   from	to	target	type
    //   11	21	59	finally
    //   25	37	59	finally
    //   40	54	59	finally
    //   54	56	59	finally
    //   60	62	59	finally
  }
  
  public IBinder onBind(Intent paramIntent) {
    b b1 = this.d;
    return (b1 != null) ? b1.a() : null;
  }
  
  public void onCreate() {
    super.onCreate();
    if (Build.VERSION.SDK_INT >= 26) {
      this.d = new f(this);
      this.e = null;
    } else {
      this.d = null;
      this.e = d((Context)this, new ComponentName((Context)this, getClass()), false, 0);
    } 
  }
  
  public void onDestroy() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial onDestroy : ()V
    //   4: aload_0
    //   5: getfield j : Ljava/util/ArrayList;
    //   8: astore_1
    //   9: aload_1
    //   10: ifnull -> 37
    //   13: aload_1
    //   14: monitorenter
    //   15: aload_0
    //   16: iconst_1
    //   17: putfield i : Z
    //   20: aload_0
    //   21: getfield e : Landroidx/core/app/JobIntentService$h;
    //   24: invokevirtual b : ()V
    //   27: aload_1
    //   28: monitorexit
    //   29: goto -> 37
    //   32: astore_2
    //   33: aload_1
    //   34: monitorexit
    //   35: aload_2
    //   36: athrow
    //   37: return
    // Exception table:
    //   from	to	target	type
    //   15	29	32	finally
    //   33	35	32	finally
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    if (this.j != null) {
      this.e.d();
      synchronized (this.j) {
        ArrayList<d> arrayList = this.j;
        d d = new d();
        if (paramIntent == null)
          paramIntent = new Intent(); 
        this(this, paramIntent, paramInt2);
        arrayList.add(d);
        c(true);
        return 3;
      } 
    } 
    return 2;
  }
  
  final class a extends AsyncTask<Void, Void, Void> {
    a(JobIntentService this$0) {}
    
    protected Void a(Void... param1VarArgs) {
      while (true) {
        JobIntentService.e e = this.a.a();
        if (e != null) {
          this.a.e(e.getIntent());
          e.a();
          continue;
        } 
        return null;
      } 
    }
    
    protected void b(Void param1Void) {
      this.a.g();
    }
    
    protected void c(Void param1Void) {
      this.a.g();
    }
  }
  
  static interface b {
    IBinder a();
    
    JobIntentService.e b();
  }
  
  static final class c extends h {
    private final Context d;
    
    private final PowerManager.WakeLock e;
    
    private final PowerManager.WakeLock f;
    
    boolean g;
    
    boolean h;
    
    c(Context param1Context, ComponentName param1ComponentName) {
      super(param1ComponentName);
      this.d = param1Context.getApplicationContext();
      PowerManager powerManager = (PowerManager)param1Context.getSystemService("power");
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append(param1ComponentName.getClassName());
      stringBuilder2.append(":launch");
      PowerManager.WakeLock wakeLock2 = powerManager.newWakeLock(1, stringBuilder2.toString());
      this.e = wakeLock2;
      wakeLock2.setReferenceCounted(false);
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(param1ComponentName.getClassName());
      stringBuilder1.append(":run");
      PowerManager.WakeLock wakeLock1 = powerManager.newWakeLock(1, stringBuilder1.toString());
      this.f = wakeLock1;
      wakeLock1.setReferenceCounted(false);
    }
    
    public void b() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield h : Z
      //   6: ifeq -> 38
      //   9: aload_0
      //   10: getfield g : Z
      //   13: ifeq -> 26
      //   16: aload_0
      //   17: getfield e : Landroid/os/PowerManager$WakeLock;
      //   20: ldc2_w 60000
      //   23: invokevirtual acquire : (J)V
      //   26: aload_0
      //   27: iconst_0
      //   28: putfield h : Z
      //   31: aload_0
      //   32: getfield f : Landroid/os/PowerManager$WakeLock;
      //   35: invokevirtual release : ()V
      //   38: aload_0
      //   39: monitorexit
      //   40: return
      //   41: astore_1
      //   42: aload_0
      //   43: monitorexit
      //   44: aload_1
      //   45: athrow
      // Exception table:
      //   from	to	target	type
      //   2	26	41	finally
      //   26	38	41	finally
      //   38	40	41	finally
      //   42	44	41	finally
    }
    
    public void c() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield h : Z
      //   6: ifne -> 31
      //   9: aload_0
      //   10: iconst_1
      //   11: putfield h : Z
      //   14: aload_0
      //   15: getfield f : Landroid/os/PowerManager$WakeLock;
      //   18: ldc2_w 600000
      //   21: invokevirtual acquire : (J)V
      //   24: aload_0
      //   25: getfield e : Landroid/os/PowerManager$WakeLock;
      //   28: invokevirtual release : ()V
      //   31: aload_0
      //   32: monitorexit
      //   33: return
      //   34: astore_1
      //   35: aload_0
      //   36: monitorexit
      //   37: aload_1
      //   38: athrow
      // Exception table:
      //   from	to	target	type
      //   2	31	34	finally
      //   31	33	34	finally
      //   35	37	34	finally
    }
    
    public void d() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: iconst_0
      //   4: putfield g : Z
      //   7: aload_0
      //   8: monitorexit
      //   9: return
      //   10: astore_1
      //   11: aload_0
      //   12: monitorexit
      //   13: aload_1
      //   14: athrow
      // Exception table:
      //   from	to	target	type
      //   2	9	10	finally
      //   11	13	10	finally
    }
  }
  
  final class d implements e {
    final Intent a;
    
    final int b;
    
    d(JobIntentService this$0, Intent param1Intent, int param1Int) {
      this.a = param1Intent;
      this.b = param1Int;
    }
    
    public void a() {
      this.c.stopSelf(this.b);
    }
    
    public Intent getIntent() {
      return this.a;
    }
  }
  
  static interface e {
    void a();
    
    Intent getIntent();
  }
  
  static final class f extends JobServiceEngine implements b {
    final JobIntentService a;
    
    final Object b = new Object();
    
    JobParameters c;
    
    f(JobIntentService param1JobIntentService) {
      super(param1JobIntentService);
      this.a = param1JobIntentService;
    }
    
    public IBinder a() {
      return getBinder();
    }
    
    public JobIntentService.e b() {
      synchronized (this.b) {
        JobParameters jobParameters = this.c;
        if (jobParameters == null)
          return null; 
        JobWorkItem jobWorkItem = jobParameters.dequeueWork();
        if (jobWorkItem != null) {
          jobWorkItem.getIntent().setExtrasClassLoader(this.a.getClassLoader());
          return new a(this, jobWorkItem);
        } 
        return null;
      } 
    }
    
    public boolean onStartJob(JobParameters param1JobParameters) {
      this.c = param1JobParameters;
      this.a.c(false);
      return true;
    }
    
    public boolean onStopJob(JobParameters param1JobParameters) {
      boolean bool = this.a.b();
      synchronized (this.b) {
        this.c = null;
        return bool;
      } 
    }
    
    final class a implements JobIntentService.e {
      final JobWorkItem a;
      
      a(JobIntentService.f this$0, JobWorkItem param2JobWorkItem) {
        this.a = param2JobWorkItem;
      }
      
      public void a() {
        synchronized (this.b.b) {
          JobParameters jobParameters = this.b.c;
          if (jobParameters != null)
            jobParameters.completeWork(this.a); 
          return;
        } 
      }
      
      public Intent getIntent() {
        return this.a.getIntent();
      }
    }
  }
  
  final class a implements e {
    final JobWorkItem a;
    
    a(JobIntentService this$0, JobWorkItem param1JobWorkItem) {
      this.a = param1JobWorkItem;
    }
    
    public void a() {
      synchronized (this.b.b) {
        JobParameters jobParameters = this.b.c;
        if (jobParameters != null)
          jobParameters.completeWork(this.a); 
        return;
      } 
    }
    
    public Intent getIntent() {
      return this.a.getIntent();
    }
  }
  
  static final class g extends h {
    private final JobInfo d;
    
    private final JobScheduler e;
    
    g(Context param1Context, ComponentName param1ComponentName, int param1Int) {
      super(param1ComponentName);
      a(param1Int);
      this.d = (new JobInfo.Builder(param1Int, this.a)).setOverrideDeadline(0L).build();
      this.e = (JobScheduler)param1Context.getApplicationContext().getSystemService("jobscheduler");
    }
  }
  
  static abstract class h {
    final ComponentName a;
    
    boolean b;
    
    int c;
    
    h(ComponentName param1ComponentName) {
      this.a = param1ComponentName;
    }
    
    void a(int param1Int) {
      if (!this.b) {
        this.b = true;
        this.c = param1Int;
      } else if (this.c != param1Int) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Given job ID ");
        stringBuilder.append(param1Int);
        stringBuilder.append(" is different than previous ");
        stringBuilder.append(this.c);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
    }
    
    public void b() {}
    
    public void c() {}
    
    public void d() {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/app/JobIntentService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */