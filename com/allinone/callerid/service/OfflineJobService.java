package com.allinone.callerid.service;

import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.os.Build;
import com.allinone.callerid.l.a.d;
import com.allinone.callerid.l.a.f;
import com.allinone.callerid.util.d0;

public class OfflineJobService extends JobService {
  public boolean onStartJob(JobParameters paramJobParameters) {
    if (Build.VERSION.SDK_INT >= 21 && paramJobParameters != null && paramJobParameters.getJobId() == 718) {
      if (d0.a)
        d0.a("wbb", "开始调度任务"); 
      f.j(new a(this, paramJobParameters));
    } 
    return false;
  }
  
  public boolean onStopJob(JobParameters paramJobParameters) {
    return false;
  }
  
  class a implements d {
    a(OfflineJobService this$0, JobParameters param1JobParameters) {}
    
    public void a() {
      if (d0.a)
        d0.a("wbb", "onSuccess"); 
    }
    
    public void b() {
      if (d0.a)
        d0.a("wbb", "onEnd"); 
      try {
        JobScheduler jobScheduler = (JobScheduler)this.b.getSystemService("jobscheduler");
        if (jobScheduler != null)
          jobScheduler.cancel(718); 
        this.b.jobFinished(this.a, true);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/service/OfflineJobService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */