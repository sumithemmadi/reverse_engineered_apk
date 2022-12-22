package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.a;
import androidx.work.f;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.f;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.background.systemjob.b;
import androidx.work.impl.l.j;
import androidx.work.impl.l.k;
import androidx.work.impl.utils.d;
import java.util.Iterator;
import java.util.List;

public class e {
  private static final String a = f.f("Schedulers");
  
  static d a(Context paramContext, h paramh) {
    f f;
    if (Build.VERSION.SDK_INT >= 23) {
      b b = new b(paramContext, paramh);
      d.a(paramContext, SystemJobService.class, true);
      f.c().a(a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
    } else {
      d d2 = c(paramContext);
      d d1 = d2;
      if (d2 == null) {
        f = new f(paramContext);
        d.a(paramContext, SystemAlarmService.class, true);
        f.c().a(a, "Created SystemAlarmScheduler", new Throwable[0]);
      } 
    } 
    return (d)f;
  }
  
  public static void b(a parama, WorkDatabase paramWorkDatabase, List<d> paramList) {
    Iterator<d> iterator;
    if (paramList == null || paramList.size() == 0)
      return; 
    k k = paramWorkDatabase.y();
    paramWorkDatabase.c();
    try {
      List list = k.d(parama.d());
      if (list != null && list.size() > 0) {
        long l = System.currentTimeMillis();
        Iterator iterator1 = list.iterator();
        while (iterator1.hasNext())
          k.b(((j)iterator1.next()).c, l); 
      } 
      paramWorkDatabase.q();
      paramWorkDatabase.g();
      return;
    } finally {
      iterator.g();
    } 
  }
  
  private static d c(Context paramContext) {
    try {
      return d;
    } finally {
      paramContext = null;
      f.c().a(a, "Unable to create GCM Scheduler", new Throwable[] { (Throwable)paramContext });
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */