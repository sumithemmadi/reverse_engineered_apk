package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.f;
import androidx.work.impl.h;

public class RescheduleReceiver extends BroadcastReceiver {
  private static final String a = f.f("RescheduleReceiver");
  
  public void onReceive(Context paramContext, Intent paramIntent) {
    f.c().a(a, String.format("Received intent %s", new Object[] { paramIntent }), new Throwable[0]);
    if (Build.VERSION.SDK_INT >= 23) {
      try {
        h.j(paramContext).s(goAsync());
      } catch (IllegalStateException illegalStateException) {
        f.c().b(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[0]);
      } 
    } else {
      illegalStateException.startService(b.e((Context)illegalStateException));
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/background/systemalarm/RescheduleReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */