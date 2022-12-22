package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.b;
import androidx.work.c;
import androidx.work.f;
import androidx.work.impl.l.j;
import java.util.Iterator;

class a {
  private static final String a = f.f("SystemJobInfoConverter");
  
  private final ComponentName b;
  
  a(Context paramContext) {
    this.b = new ComponentName(paramContext.getApplicationContext(), SystemJobService.class);
  }
  
  private static JobInfo.TriggerContentUri b(c.a parama) {
    boolean bool = parama.b();
    return new JobInfo.TriggerContentUri(parama.a(), bool);
  }
  
  static int c(NetworkType paramNetworkType) {
    int i = a.a[paramNetworkType.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i != 4) {
            if (i == 5 && Build.VERSION.SDK_INT >= 26)
              return 4; 
          } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
          } 
          f.c().a(a, String.format("API version too low. Cannot convert network type value %s", new Object[] { paramNetworkType }), new Throwable[0]);
          return 1;
        } 
        return 2;
      } 
      return 1;
    } 
    return 0;
  }
  
  JobInfo a(j paramj, int paramInt) {
    b b = paramj.l;
    int i = c(b.b());
    PersistableBundle persistableBundle = new PersistableBundle();
    persistableBundle.putString("EXTRA_WORK_SPEC_ID", paramj.c);
    persistableBundle.putBoolean("EXTRA_IS_PERIODIC", paramj.d());
    JobInfo.Builder builder = (new JobInfo.Builder(paramInt, this.b)).setRequiredNetworkType(i).setRequiresCharging(b.g()).setRequiresDeviceIdle(b.h()).setExtras(persistableBundle);
    if (!b.h()) {
      if (paramj.n == BackoffPolicy.c) {
        paramInt = 0;
      } else {
        paramInt = 1;
      } 
      builder.setBackoffCriteria(paramj.o, paramInt);
    } 
    builder.setMinimumLatency(Math.max(paramj.a() - System.currentTimeMillis(), 0L));
    if (Build.VERSION.SDK_INT >= 24 && b.e()) {
      Iterator<c.a> iterator = b.a().b().iterator();
      while (iterator.hasNext())
        builder.addTriggerContentUri(b(iterator.next())); 
      builder.setTriggerContentUpdateDelay(b.c());
      builder.setTriggerContentMaxDelay(b.d());
    } 
    builder.setPersisted(false);
    if (Build.VERSION.SDK_INT >= 26) {
      builder.setRequiresBatteryNotLow(b.f());
      builder.setRequiresStorageNotLow(b.i());
    } 
    return builder.build();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/background/systemjob/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */