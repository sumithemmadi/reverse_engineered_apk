package com.allinone.callerid.i.a.h;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.allinone.callerid.bean.CollectInfo;
import com.allinone.callerid.i.a.h.k.a;
import com.allinone.callerid.i.a.h.k.b;
import com.allinone.callerid.service.CollectJobService;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i1;
import java.util.List;
import org.json.JSONArray;

public class c {
  public static void a(Context paramContext, CollectInfo paramCollectInfo) {
    try {
      Thread thread = new Thread();
      b b = new b();
      this(paramCollectInfo, paramContext);
      this(b);
      thread.start();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(Context paramContext, a parama) {
    try {
      c c1 = new c();
      this(paramContext, parama);
      g.b(c1);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void c(Context paramContext, CollectInfo paramCollectInfo) {
    try {
      String str;
      if (i1.a(paramContext) && !i1.v0(paramCollectInfo.getNumber())) {
        String str1 = paramCollectInfo.getNumber();
        String str2 = paramCollectInfo.getUser_blocked();
        String str3 = paramCollectInfo.getUser_commented();
        String str4 = paramCollectInfo.getUser_reported();
        str = paramCollectInfo.getUser_upload_recording();
        a a = new a();
        this(paramContext);
        b.a(paramContext, str1, str2, str3, str4, str, a);
      } else {
        a(paramContext, (CollectInfo)str);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  static final class a implements a {
    a(Context param1Context) {}
    
    public void a(JSONArray param1JSONArray) {
      if (param1JSONArray != null && param1JSONArray.length() > 0)
        b.a(this.a, param1JSONArray, new a(this)); 
    }
    
    class a implements a {
      a(c.a this$0) {}
      
      public void a(String param2String) {}
    }
  }
  
  class a implements a {
    a(c this$0) {}
    
    public void a(String param1String) {}
  }
  
  static final class b implements Runnable {
    b(CollectInfo param1CollectInfo, Context param1Context) {}
    
    public void run() {
      if (Build.VERSION.SDK_INT >= 21) {
        com.allinone.callerid.f.c.b().c(this.b);
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("list:");
          stringBuilder.append(com.allinone.callerid.f.c.b().d().toString());
          d0.a("collectinfo", stringBuilder.toString());
        } 
        if (d0.a)
          d0.a("collectinfo", "scheduleJob"); 
        if (b1.u2().booleanValue()) {
          if (d0.a)
            d0.a("collectinfo", "开启调度任务"); 
          JobInfo.Builder builder = new JobInfo.Builder(10086, new ComponentName(this.c, CollectJobService.class));
          builder.setRequiredNetworkType(1);
          builder.setPersisted(true);
          builder.setRequiresCharging(false);
          builder.setRequiresDeviceIdle(false);
          builder.setMinimumLatency(1000L);
          JobInfo jobInfo = builder.build();
          ((JobScheduler)this.c.getSystemService("jobscheduler")).schedule(jobInfo);
          b1.M2(Boolean.FALSE);
        } 
      } 
    }
  }
  
  static final class c implements f {
    c(Context param1Context, a param1a) {}
    
    public void a(List<CollectInfo> param1List) {
      if (param1List != null && param1List.size() > 0) {
        for (byte b = 0; b < param1List.size(); b++) {
          CollectInfo collectInfo = param1List.get(b);
          b.a(this.a, collectInfo.getNumber(), collectInfo.getUser_blocked(), collectInfo.getUser_commented(), collectInfo.getUser_reported(), collectInfo.getUser_upload_recording(), new a(this));
        } 
        g.a();
        this.b.a("ok");
        b1.M2(Boolean.TRUE);
      } 
    }
    
    class a implements a {
      a(c.c this$0) {}
      
      public void a(JSONArray param2JSONArray) {
        if (param2JSONArray != null && param2JSONArray.length() > 0)
          b.a(this.a.a, param2JSONArray, new a(this)); 
      }
      
      class a implements a {
        a(c.c.a this$0) {}
        
        public void a(String param3String) {}
      }
    }
    
    class a implements a {
      a(c.c this$0) {}
      
      public void a(String param2String) {}
    }
  }
  
  class a implements a {
    a(c this$0) {}
    
    public void a(JSONArray param1JSONArray) {
      if (param1JSONArray != null && param1JSONArray.length() > 0)
        b.a(this.a.a, param1JSONArray, new a(this)); 
    }
    
    class a implements a {
      a(c.c.a this$0) {}
      
      public void a(String param3String) {}
    }
  }
  
  class a implements a {
    a(c this$0) {}
    
    public void a(String param1String) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */