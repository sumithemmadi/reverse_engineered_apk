package com.allinone.callerid.service;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import com.allinone.callerid.i.a.d0.b;
import com.allinone.callerid.util.d0;

@TargetApi(21)
public class ScheduleService extends JobService {
  public void onCreate() {
    super.onCreate();
    if (d0.a)
      Log.e("wjjj", "ScheduleService：onCreate"); 
  }
  
  public void onDestroy() {
    super.onDestroy();
    if (d0.a)
      d0.a("wjjj", "onDestroy"); 
  }
  
  public boolean onStartJob(JobParameters paramJobParameters) {
    if (d0.a)
      Log.e("wjjj", "ScheduleService：onStartJob():job已开启"); 
    b.a(getApplicationContext(), new a(this));
    return false;
  }
  
  public boolean onStopJob(JobParameters paramJobParameters) {
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onStopJob():job已结束 params = [");
      stringBuilder.append(paramJobParameters);
      stringBuilder.append("]");
      Log.e("wjjj", stringBuilder.toString());
    } 
    return false;
  }
  
  class a implements com.allinone.callerid.i.a.d0.a {
    a(ScheduleService this$0) {}
    
    public void a(boolean param1Boolean) {
      if (!param1Boolean)
        try {
          if (d0.a)
            d0.a("wjjj", "ScheduleService：onStartJob():MyService死掉了"); 
          if (Build.VERSION.SDK_INT > 25) {
            Intent intent = new Intent();
            this(this.a.getApplicationContext(), MyService.class);
            Context context = this.a.getApplicationContext();
            a a1 = new a();
            this(this);
            context.bindService(intent, a1, 1);
          } else {
            ScheduleService scheduleService = this.a;
            Intent intent = new Intent();
            this(this.a.getApplicationContext(), MyService.class);
            scheduleService.startService(intent);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
    
    class a implements ServiceConnection {
      a(ScheduleService.a this$0) {}
      
      public void onServiceConnected(ComponentName param2ComponentName, IBinder param2IBinder) {
        if (param2IBinder instanceof a) {
          MyService myService = ((a)param2IBinder).a();
          if (myService != null)
            myService.a(); 
        } 
        this.a.a.getApplicationContext().unbindService(this);
      }
      
      public void onServiceDisconnected(ComponentName param2ComponentName) {}
    }
  }
  
  class a implements ServiceConnection {
    a(ScheduleService this$0) {}
    
    public void onServiceConnected(ComponentName param1ComponentName, IBinder param1IBinder) {
      if (param1IBinder instanceof a) {
        MyService myService = ((a)param1IBinder).a();
        if (myService != null)
          myService.a(); 
      } 
      this.a.a.getApplicationContext().unbindService(this);
    }
    
    public void onServiceDisconnected(ComponentName param1ComponentName) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/service/ScheduleService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */