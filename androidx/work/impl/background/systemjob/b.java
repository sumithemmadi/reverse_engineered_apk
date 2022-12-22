package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkInfo;
import androidx.work.f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.d;
import androidx.work.impl.h;
import androidx.work.impl.l.d;
import androidx.work.impl.l.j;
import androidx.work.impl.utils.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b implements d {
  private static final String b = f.f("SystemJobScheduler");
  
  private final Context c;
  
  private final JobScheduler d;
  
  private final h e;
  
  private final c f;
  
  private final a g;
  
  public b(Context paramContext, h paramh) {
    this(paramContext, paramh, (JobScheduler)paramContext.getSystemService("jobscheduler"), new a(paramContext));
  }
  
  public b(Context paramContext, h paramh, JobScheduler paramJobScheduler, a parama) {
    this.c = paramContext;
    this.e = paramh;
    this.d = paramJobScheduler;
    this.f = new c(paramContext);
    this.g = parama;
  }
  
  public static void b(Context paramContext) {
    JobScheduler jobScheduler = (JobScheduler)paramContext.getSystemService("jobscheduler");
    if (jobScheduler != null) {
      List<JobInfo> list = g(paramContext, jobScheduler);
      if (list != null && !list.isEmpty()) {
        Iterator<JobInfo> iterator = list.iterator();
        while (iterator.hasNext())
          e(jobScheduler, ((JobInfo)iterator.next()).getId()); 
      } 
    } 
  }
  
  public static void c(Context paramContext) {
    JobScheduler jobScheduler = (JobScheduler)paramContext.getSystemService("jobscheduler");
    if (jobScheduler != null) {
      List<JobInfo> list = g(paramContext, jobScheduler);
      if (list != null && !list.isEmpty())
        for (JobInfo jobInfo : list) {
          PersistableBundle persistableBundle = jobInfo.getExtras();
          if (persistableBundle == null || !persistableBundle.containsKey("EXTRA_WORK_SPEC_ID"))
            e(jobScheduler, jobInfo.getId()); 
        }  
    } 
  }
  
  private static void e(JobScheduler paramJobScheduler, int paramInt) {
    try {
      paramJobScheduler.cancel(paramInt);
    } finally {
      paramJobScheduler = null;
    } 
  }
  
  private static List<Integer> f(Context paramContext, JobScheduler paramJobScheduler, String paramString) {
    List<JobInfo> list = g(paramContext, paramJobScheduler);
    if (list == null)
      return null; 
    ArrayList<Integer> arrayList = new ArrayList(2);
    for (JobInfo jobInfo : list) {
      PersistableBundle persistableBundle = jobInfo.getExtras();
      if (persistableBundle != null && persistableBundle.containsKey("EXTRA_WORK_SPEC_ID") && paramString.equals(persistableBundle.getString("EXTRA_WORK_SPEC_ID")))
        arrayList.add(Integer.valueOf(jobInfo.getId())); 
    } 
    return arrayList;
  }
  
  private static List<JobInfo> g(Context paramContext, JobScheduler paramJobScheduler) {
    ArrayList<JobInfo> arrayList;
    try {
      List list = paramJobScheduler.getAllPendingJobs();
    } finally {
      paramJobScheduler = null;
      f.c().b(b, "getAllPendingJobs() is not reliable on this device.", new Throwable[] { (Throwable)paramJobScheduler });
    } 
    ComponentName componentName = new ComponentName(paramContext, SystemJobService.class);
    for (JobInfo jobInfo : paramJobScheduler) {
      if (componentName.equals(jobInfo.getService()))
        arrayList.add(jobInfo); 
    } 
    return arrayList;
  }
  
  public void a(j... paramVarArgs) {
    WorkDatabase workDatabase = this.e.n();
    int i = paramVarArgs.length;
    byte b1 = 0;
    while (b1 < i) {
      j j1 = paramVarArgs[b1];
      workDatabase.c();
      try {
        String str;
        j j2 = workDatabase.y().m(j1.c);
        if (j2 == null) {
          f f = f.c();
          str = b;
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Skipping scheduling ");
          stringBuilder.append(j1.c);
          stringBuilder.append(" because it's no longer in the DB");
          f.h(str, stringBuilder.toString(), new Throwable[0]);
          workDatabase.q();
        } else if (((j)str).d != WorkInfo.State.b) {
          f f = f.c();
          String str1 = b;
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Skipping scheduling ");
          stringBuilder.append(j1.c);
          stringBuilder.append(" because it is no longer enqueued");
          f.h(str1, stringBuilder.toString(), new Throwable[0]);
          workDatabase.q();
        } else {
          int k;
          d d1 = workDatabase.w().b(j1.c);
          if (d1 != null) {
            k = d1.b;
          } else {
            k = this.f.d(this.e.h().e(), this.e.h().c());
          } 
          if (d1 == null) {
            d1 = new d();
            this(j1.c, k);
            this.e.n().w().a(d1);
          } 
          h(j1, k);
          if (Build.VERSION.SDK_INT == 23) {
            List<Integer> list = f(this.c, this.d, j1.c);
            if (list != null) {
              k = list.indexOf(Integer.valueOf(k));
              if (k >= 0)
                list.remove(k); 
              if (!list.isEmpty()) {
                k = ((Integer)list.get(0)).intValue();
              } else {
                k = this.f.d(this.e.h().e(), this.e.h().c());
              } 
              h(j1, k);
            } 
          } 
          workDatabase.q();
        } 
        workDatabase.g();
      } finally {
        workDatabase.g();
      } 
    } 
  }
  
  public void d(String paramString) {
    List<Integer> list = f(this.c, this.d, paramString);
    if (list != null && !list.isEmpty()) {
      Iterator<Integer> iterator = list.iterator();
      while (iterator.hasNext()) {
        int i = ((Integer)iterator.next()).intValue();
        e(this.d, i);
      } 
      this.e.n().w().c(paramString);
    } 
  }
  
  public void h(j paramj, int paramInt) {
    JobInfo jobInfo = this.g.a(paramj, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/background/systemjob/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */