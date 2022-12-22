package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

class b implements Application.ActivityLifecycleCallbacks {
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity) {}
  
  public void onActivityResumed(Activity paramActivity) {}
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity) {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */