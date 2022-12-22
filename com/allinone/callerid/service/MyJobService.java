package com.allinone.callerid.service;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

public class MyJobService extends JobService {
  public boolean onStartJob(JobParameters paramJobParameters) {
    Log.d("MyJobService", "Performing long running task in scheduled job");
    return false;
  }
  
  public boolean onStopJob(JobParameters paramJobParameters) {
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/service/MyJobService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */