package com.google.android.exoplayer2.scheduler;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;

@TargetApi(21)
public final class PlatformScheduler implements c {
  private static void c(String paramString) {}
  
  public static final class PlatformSchedulerService extends JobService {
    public boolean onStartJob(JobParameters param1JobParameters) {
      String str;
      PlatformScheduler.b("PlatformSchedulerService started");
      PersistableBundle persistableBundle = param1JobParameters.getExtras();
      if ((new Requirements(persistableBundle.getInt("requirements"))).a((Context)this)) {
        PlatformScheduler.b("Requirements are met");
        str = persistableBundle.getString("service_action");
        String str1 = persistableBundle.getString("service_package");
        Intent intent = (new Intent((String)e.e(str))).setPackage(str1);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Starting service action: ");
        stringBuilder.append(str);
        stringBuilder.append(" package: ");
        stringBuilder.append(str1);
        PlatformScheduler.b(stringBuilder.toString());
        h0.q0((Context)this, intent);
      } else {
        PlatformScheduler.b("Requirements are not met");
        jobFinished((JobParameters)str, true);
      } 
      return false;
    }
    
    public boolean onStopJob(JobParameters param1JobParameters) {
      return false;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/scheduler/PlatformScheduler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */