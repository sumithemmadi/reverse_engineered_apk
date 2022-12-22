package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.f;
import androidx.work.impl.h;
import androidx.work.impl.utils.d;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
  static final String a = f.f("ConstrntProxyUpdtRecvr");
  
  public static Intent a(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
    intent.setComponent(new ComponentName(paramContext, ConstraintProxyUpdateReceiver.class));
    intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", paramBoolean1).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", paramBoolean2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", paramBoolean3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", paramBoolean4);
    return intent;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent) {
    BroadcastReceiver.PendingResult pendingResult;
    if (paramIntent != null) {
      pendingResult = (BroadcastReceiver.PendingResult)paramIntent.getAction();
    } else {
      pendingResult = null;
    } 
    if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(pendingResult)) {
      f.c().a(a, String.format("Ignoring unknown action %s", new Object[] { pendingResult }), new Throwable[0]);
    } else {
      pendingResult = goAsync();
      h.j(paramContext).o().b(new a(this, paramIntent, paramContext, pendingResult));
    } 
  }
  
  class a implements Runnable {
    a(ConstraintProxyUpdateReceiver this$0, Intent param1Intent, Context param1Context, BroadcastReceiver.PendingResult param1PendingResult) {}
    
    public void run() {
      try {
        boolean bool1 = this.b.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
        boolean bool2 = this.b.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
        boolean bool3 = this.b.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
        boolean bool4 = this.b.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
        f.c().a(ConstraintProxyUpdateReceiver.a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4) }), new Throwable[0]);
        d.a(this.c, ConstraintProxy.BatteryNotLowProxy.class, bool1);
        d.a(this.c, ConstraintProxy.BatteryChargingProxy.class, bool2);
        d.a(this.c, ConstraintProxy.StorageNotLowProxy.class, bool3);
        d.a(this.c, ConstraintProxy.NetworkStateProxy.class, bool4);
        return;
      } finally {
        this.d.finish();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */