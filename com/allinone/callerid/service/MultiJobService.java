package com.allinone.callerid.service;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.allinone.callerid.util.d;
import com.allinone.callerid.util.d0;
import java.lang.ref.WeakReference;

@TargetApi(21)
public class MultiJobService extends JobService {
  private b b = new b(this, null);
  
  public void a() {
    if (d0.a)
      d0.a("wakeapp", "scheduleJob"); 
    JobInfo.Builder builder = new JobInfo.Builder(0, new ComponentName((Context)this, MultiJobService.class));
    builder.setRequiredNetworkType(1);
    builder.setPersisted(true);
    builder.setRequiresCharging(false);
    builder.setRequiresDeviceIdle(true);
    builder.setMinimumLatency(1000L);
    builder.setOverrideDeadline(1800000L);
    JobInfo jobInfo = builder.build();
    ((JobScheduler)getSystemService("jobscheduler")).schedule(jobInfo);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    if (d0.a)
      d0.a("wakeapp", "onStartCommand"); 
    a();
    return 2;
  }
  
  public boolean onStartJob(JobParameters paramJobParameters) {
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onStartJob");
      stringBuilder.append(paramJobParameters.getJobId());
      d0.a("wakeapp", stringBuilder.toString());
    } 
    if (paramJobParameters != null && paramJobParameters.getJobId() == 10059) {
      if (d0.a)
        d0.a("wakeapp", "执行后台上传"); 
      JobScheduler jobScheduler = (JobScheduler)getSystemService("jobscheduler");
      if (jobScheduler != null)
        jobScheduler.cancel(10059); 
      jobFinished(paramJobParameters, true);
    } else {
      Message message = Message.obtain();
      message.obj = paramJobParameters;
      this.b.sendMessage(message);
    } 
    return true;
  }
  
  public boolean onStopJob(JobParameters paramJobParameters) {
    if (d0.a)
      d0.a("wakeapp", "onStopJob"); 
    this.b.removeMessages(0);
    return true;
  }
  
  private static class b extends Handler {
    private WeakReference<MultiJobService> a;
    
    private b(MultiJobService param1MultiJobService) {
      this.a = new WeakReference<MultiJobService>(param1MultiJobService);
    }
    
    public void handleMessage(Message param1Message) {
      MultiJobService multiJobService = this.a.get();
      if (multiJobService != null) {
        ((JobScheduler)multiJobService.getSystemService("jobscheduler")).cancel(0);
        multiJobService.jobFinished((JobParameters)param1Message.obj, true);
        d.a(multiJobService.getApplicationContext());
      } 
      super.handleMessage(param1Message);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/service/MultiJobService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */