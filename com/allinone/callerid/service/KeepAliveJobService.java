package com.allinone.callerid.service;

import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.os.Build;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.q;
import java.util.concurrent.ExecutorService;

public class KeepAliveJobService extends JobService {
  public boolean onStartJob(JobParameters paramJobParameters) {
    try {
      if (Build.VERSION.SDK_INT >= 21 && paramJobParameters != null && paramJobParameters.getJobId() == 6666) {
        if (d0.a)
          d0.a("alive", "开始调度任务"); 
        ExecutorService executorService = (j0.a()).b;
        a a = new a();
        this(this);
        executorService.execute(a);
        try {
          JobScheduler jobScheduler = (JobScheduler)getSystemService("jobscheduler");
          if (jobScheduler != null)
            jobScheduler.cancel(6666); 
          jobFinished(paramJobParameters, true);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return false;
  }
  
  public boolean onStopJob(JobParameters paramJobParameters) {
    return false;
  }
  
  class a implements Runnable {
    a(KeepAliveJobService this$0) {}
    
    public void run() {
      q.b().c("start_job");
      if (b1.f())
        if (i1.s0(this.b.getApplicationContext(), MyService.class.getName())) {
          if (d0.a)
            d0.a("alive", "服务还活着"); 
          q.b().c("is_alived");
          b1.J0(false);
        } else {
          q.b().c("start_job_not_alive");
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/service/KeepAliveJobService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */