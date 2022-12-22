package androidx.work.impl.k.f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.f;
import androidx.work.impl.utils.j.a;

public class b extends c<Boolean> {
  private static final String i = f.f("BatteryNotLowTracker");
  
  public b(Context paramContext, a parama) {
    super(paramContext, parama);
  }
  
  public IntentFilter g() {
    IntentFilter intentFilter = new IntentFilter();
    intentFilter.addAction("android.intent.action.BATTERY_OKAY");
    intentFilter.addAction("android.intent.action.BATTERY_LOW");
    return intentFilter;
  }
  
  public void h(Context paramContext, Intent paramIntent) {
    if (paramIntent.getAction() == null)
      return; 
    f.c().a(i, String.format("Received %s", new Object[] { paramIntent.getAction() }), new Throwable[0]);
    String str = paramIntent.getAction();
    str.hashCode();
    if (!str.equals("android.intent.action.BATTERY_OKAY")) {
      if (str.equals("android.intent.action.BATTERY_LOW"))
        d((T)Boolean.FALSE); 
    } else {
      d((T)Boolean.TRUE);
    } 
  }
  
  public Boolean i() {
    IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    Intent intent = this.c.registerReceiver(null, intentFilter);
    boolean bool = false;
    if (intent == null) {
      f.c().b(i, "getInitialState - null intent received", new Throwable[0]);
      return null;
    } 
    int i = intent.getIntExtra("plugged", 0);
    int j = intent.getIntExtra("status", -1);
    int k = intent.getIntExtra("level", -1);
    int m = intent.getIntExtra("scale", -1);
    float f = k / m;
    if (i != 0 || j == 1 || f > 0.15F)
      bool = true; 
    return Boolean.valueOf(bool);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/k/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */