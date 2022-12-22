package androidx.work.impl.k.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.f;

public abstract class c<T> extends d<T> {
  private static final String g = f.f("BrdcstRcvrCnstrntTrckr");
  
  private final BroadcastReceiver h = new a(this);
  
  public c(Context paramContext, androidx.work.impl.utils.j.a parama) {
    super(paramContext, parama);
  }
  
  public void e() {
    f.c().a(g, String.format("%s: registering receiver", new Object[] { getClass().getSimpleName() }), new Throwable[0]);
    this.c.registerReceiver(this.h, g());
  }
  
  public void f() {
    f.c().a(g, String.format("%s: unregistering receiver", new Object[] { getClass().getSimpleName() }), new Throwable[0]);
    this.c.unregisterReceiver(this.h);
  }
  
  public abstract IntentFilter g();
  
  public abstract void h(Context paramContext, Intent paramIntent);
  
  class a extends BroadcastReceiver {
    a(c this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      if (param1Intent != null)
        this.a.h(param1Context, param1Intent); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/k/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */