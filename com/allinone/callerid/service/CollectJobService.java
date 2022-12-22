package com.allinone.callerid.service;

import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.Context;
import android.os.Build;
import com.allinone.callerid.i.a.h.c;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.d0;

public class CollectJobService extends JobService {
  public boolean onStartJob(JobParameters paramJobParameters) {
    if (paramJobParameters != null)
      try {
        if (paramJobParameters.getJobId() == 10086) {
          if (d0.a)
            d0.a("collectinfo", "开始调度任务"); 
          EZCallApplication eZCallApplication = EZCallApplication.c();
          a a = new a();
          this(this, paramJobParameters);
          c.b((Context)eZCallApplication, a);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return true;
  }
  
  public boolean onStopJob(JobParameters paramJobParameters) {
    if (d0.a)
      d0.a("collectinfo", "onStopJob"); 
    return true;
  }
  
  class a implements com.allinone.callerid.i.a.h.a {
    a(CollectJobService this$0, JobParameters param1JobParameters) {}
    
    public void a(String param1String) {
      if (d0.a)
        d0.a("collectinfo", "调度任务完成"); 
      try {
        if (Build.VERSION.SDK_INT >= 21) {
          JobScheduler jobScheduler = (JobScheduler)this.b.getSystemService("jobscheduler");
          if (jobScheduler != null)
            jobScheduler.cancel(10086); 
          this.b.jobFinished(this.a, true);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/service/CollectJobService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */