package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.h.m;
import com.google.android.datatransport.h.v.a;
import com.google.android.datatransport.h.x.j.c;
import com.google.android.datatransport.h.z.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;

public class e implements r {
  private final Context a;
  
  private final c b;
  
  private final SchedulerConfig c;
  
  public e(Context paramContext, c paramc, SchedulerConfig paramSchedulerConfig) {
    this.a = paramContext;
    this.b = paramc;
    this.c = paramSchedulerConfig;
  }
  
  private boolean d(JobScheduler paramJobScheduler, int paramInt1, int paramInt2) {
    boolean bool;
    Iterator<JobInfo> iterator = paramJobScheduler.getAllPendingJobs().iterator();
    while (true) {
      boolean bool1 = iterator.hasNext();
      boolean bool2 = false;
      bool = bool2;
      if (bool1) {
        JobInfo jobInfo = iterator.next();
        int i = jobInfo.getExtras().getInt("attemptNumber");
        if (jobInfo.getId() == paramInt1) {
          bool = bool2;
          if (i >= paramInt2)
            bool = true; 
          break;
        } 
        continue;
      } 
      break;
    } 
    return bool;
  }
  
  public void a(m paramm, int paramInt) {
    b(paramm, paramInt, false);
  }
  
  public void b(m paramm, int paramInt, boolean paramBoolean) {
    ComponentName componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
    JobScheduler jobScheduler = (JobScheduler)this.a.getSystemService("jobscheduler");
    int i = c(paramm);
    if (!paramBoolean && d(jobScheduler, i, paramInt)) {
      a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", paramm);
      return;
    } 
    long l = this.b.g0(paramm);
    JobInfo.Builder builder = this.c.c(new JobInfo.Builder(i, componentName), paramm.d(), l, paramInt);
    PersistableBundle persistableBundle = new PersistableBundle();
    persistableBundle.putInt("attemptNumber", paramInt);
    persistableBundle.putString("backendName", paramm.b());
    persistableBundle.putInt("priority", a.a(paramm.d()));
    if (paramm.c() != null)
      persistableBundle.putString("extras", Base64.encodeToString(paramm.c(), 0)); 
    builder.setExtras(persistableBundle);
    a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", new Object[] { paramm, Integer.valueOf(i), Long.valueOf(this.c.g(paramm.d(), l, paramInt)), Long.valueOf(l), Integer.valueOf(paramInt) });
    jobScheduler.schedule(builder.build());
  }
  
  int c(m paramm) {
    Adler32 adler32 = new Adler32();
    adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
    adler32.update(paramm.b().getBytes(Charset.forName("UTF-8")));
    adler32.update(ByteBuffer.allocate(4).putInt(a.a(paramm.d())).array());
    if (paramm.c() != null)
      adler32.update(paramm.c()); 
    return (int)adler32.getValue();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */