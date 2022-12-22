package androidx.work.impl.k.f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.impl.utils.j.a;

public class f extends c<Boolean> {
  private static final String i = androidx.work.f.f("StorageNotLowTracker");
  
  public f(Context paramContext, a parama) {
    super(paramContext, parama);
  }
  
  public IntentFilter g() {
    IntentFilter intentFilter = new IntentFilter();
    intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
    intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
    return intentFilter;
  }
  
  public void h(Context paramContext, Intent paramIntent) {
    if (paramIntent.getAction() == null)
      return; 
    androidx.work.f.c().a(i, String.format("Received %s", new Object[] { paramIntent.getAction() }), new Throwable[0]);
    String str = paramIntent.getAction();
    str.hashCode();
    if (!str.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
      if (str.equals("android.intent.action.DEVICE_STORAGE_OK"))
        d((T)Boolean.TRUE); 
    } else {
      d((T)Boolean.FALSE);
    } 
  }
  
  public Boolean i() {
    Intent intent = this.c.registerReceiver(null, g());
    if (intent == null || intent.getAction() == null)
      return Boolean.TRUE; 
    String str = intent.getAction();
    str.hashCode();
    return !str.equals("android.intent.action.DEVICE_STORAGE_LOW") ? (!str.equals("android.intent.action.DEVICE_STORAGE_OK") ? null : Boolean.TRUE) : Boolean.FALSE;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/k/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */