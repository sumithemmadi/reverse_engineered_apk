package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.WorkInfo;
import androidx.work.f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.b;
import androidx.work.impl.e;
import androidx.work.impl.h;
import androidx.work.impl.l.j;
import androidx.work.impl.l.k;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ForceStopRunnable implements Runnable {
  private static final String b = f.f("ForceStopRunnable");
  
  private static final long c = TimeUnit.DAYS.toMillis(3650L);
  
  private final Context d;
  
  private final h e;
  
  public ForceStopRunnable(Context paramContext, h paramh) {
    this.d = paramContext.getApplicationContext();
    this.e = paramh;
  }
  
  static Intent b(Context paramContext) {
    Intent intent = new Intent();
    intent.setComponent(new ComponentName(paramContext, BroadcastReceiver.class));
    intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
    return intent;
  }
  
  private static PendingIntent c(Context paramContext, int paramInt) {
    return PendingIntent.getBroadcast(paramContext, -1, b(paramContext), paramInt);
  }
  
  static void e(Context paramContext) {
    AlarmManager alarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    PendingIntent pendingIntent = c(paramContext, 134217728);
    long l = System.currentTimeMillis() + c;
    if (alarmManager != null)
      if (Build.VERSION.SDK_INT >= 19) {
        alarmManager.setExact(0, l, pendingIntent);
      } else {
        alarmManager.set(0, l, pendingIntent);
      }  
  }
  
  public boolean a() {
    if (Build.VERSION.SDK_INT >= 23)
      b.c(this.d); 
    WorkDatabase workDatabase = this.e.n();
    null = workDatabase.y();
    workDatabase.c();
    try {
      boolean bool;
      List list = null.i();
      if (list != null && !list.isEmpty()) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool)
        for (j j : list) {
          null.a(WorkInfo.State.b, new String[] { j.c });
          null.b(j.c, -1L);
        }  
      workDatabase.q();
      return bool;
    } finally {
      workDatabase.g();
    } 
  }
  
  public boolean d() {
    if (c(this.d, 536870912) == null) {
      e(this.d);
      return true;
    } 
    return false;
  }
  
  boolean f() {
    return this.e.k().b();
  }
  
  public void run() {
    f f = f.c();
    String str = b;
    f.a(str, "Performing cleanup operations.", new Throwable[0]);
    boolean bool = a();
    if (f()) {
      f.c().a(str, "Rescheduling Workers.", new Throwable[0]);
      this.e.r();
      this.e.k().c(false);
    } else if (d()) {
      f.c().a(str, "Application was force-stopped, rescheduling.", new Throwable[0]);
      this.e.r();
    } else if (bool) {
      f.c().a(str, "Found unfinished work, scheduling it.", new Throwable[0]);
      e.b(this.e.h(), this.e.n(), this.e.m());
    } 
    this.e.q();
  }
  
  public static class BroadcastReceiver extends android.content.BroadcastReceiver {
    private static final String a = f.f("ForceStopRunnable$Rcvr");
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      if (param1Intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(param1Intent.getAction())) {
        f.c().g(a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
        ForceStopRunnable.e(param1Context);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/utils/ForceStopRunnable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */