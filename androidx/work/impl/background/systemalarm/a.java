package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.f;
import androidx.work.impl.h;
import androidx.work.impl.l.d;
import androidx.work.impl.l.e;
import androidx.work.impl.utils.c;

class a {
  private static final String a = f.f("Alarms");
  
  public static void a(Context paramContext, h paramh, String paramString) {
    e e = paramh.n().w();
    d d = e.b(paramString);
    if (d != null) {
      b(paramContext, paramString, d.b);
      f.c().a(a, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[] { paramString }), new Throwable[0]);
      e.c(paramString);
    } 
  }
  
  private static void b(Context paramContext, String paramString, int paramInt) {
    AlarmManager alarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    PendingIntent pendingIntent = PendingIntent.getService(paramContext, paramInt, b.b(paramContext, paramString), 536870912);
    if (pendingIntent != null && alarmManager != null) {
      f.c().a(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[] { paramString, Integer.valueOf(paramInt) }), new Throwable[0]);
      alarmManager.cancel(pendingIntent);
    } 
  }
  
  public static void c(Context paramContext, h paramh, String paramString, long paramLong) {
    e e = paramh.n().w();
    d d = e.b(paramString);
    if (d != null) {
      b(paramContext, paramString, d.b);
      d(paramContext, paramString, d.b, paramLong);
    } else {
      int i = (new c(paramContext)).b();
      e.a(new d(paramString, i));
      d(paramContext, paramString, i, paramLong);
    } 
  }
  
  private static void d(Context paramContext, String paramString, int paramInt, long paramLong) {
    AlarmManager alarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    PendingIntent pendingIntent = PendingIntent.getService(paramContext, paramInt, b.b(paramContext, paramString), 1073741824);
    if (alarmManager != null)
      if (Build.VERSION.SDK_INT >= 19) {
        alarmManager.setExact(0, paramLong, pendingIntent);
      } else {
        alarmManager.set(0, paramLong, pendingIntent);
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/background/systemalarm/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */