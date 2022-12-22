package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.h.m;
import com.google.android.datatransport.h.r;
import com.google.android.datatransport.h.z.a;

public class JobInfoSchedulerService extends JobService {
  public boolean onStartJob(JobParameters paramJobParameters) {
    String str1 = paramJobParameters.getExtras().getString("backendName");
    String str2 = paramJobParameters.getExtras().getString("extras");
    int i = paramJobParameters.getExtras().getInt("priority");
    int j = paramJobParameters.getExtras().getInt("attemptNumber");
    r.f(getApplicationContext());
    m.a a = m.a().b(str1).d(a.b(i));
    if (str2 != null)
      a.c(Base64.decode(str2, 0)); 
    r.c().e().g(a.a(), j, f.a(this, paramJobParameters));
    return true;
  }
  
  public boolean onStopJob(JobParameters paramJobParameters) {
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */