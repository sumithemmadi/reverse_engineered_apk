package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

class e {
  private static AtomicBoolean a = new AtomicBoolean(false);
  
  static void a(Context paramContext) {
    if (a.getAndSet(true))
      return; 
    ((Application)paramContext.getApplicationContext()).registerActivityLifecycleCallbacks(new a());
  }
  
  static class a extends b {
    public void onActivityCreated(Activity param1Activity, Bundle param1Bundle) {
      ReportFragment.g(param1Activity);
    }
    
    public void onActivitySaveInstanceState(Activity param1Activity, Bundle param1Bundle) {}
    
    public void onActivityStopped(Activity param1Activity) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */