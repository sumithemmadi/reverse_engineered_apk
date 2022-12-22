package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

public class ReportFragment extends Fragment {
  private a b;
  
  static void a(Activity paramActivity, Lifecycle.Event paramEvent) {
    if (paramActivity instanceof j) {
      ((j)paramActivity).a().h(paramEvent);
      return;
    } 
    if (paramActivity instanceof h) {
      Lifecycle lifecycle = ((h)paramActivity).a();
      if (lifecycle instanceof i)
        ((i)lifecycle).h(paramEvent); 
    } 
  }
  
  private void b(Lifecycle.Event paramEvent) {
    if (Build.VERSION.SDK_INT < 29)
      a(getActivity(), paramEvent); 
  }
  
  private void c(a parama) {
    if (parama != null)
      parama.a(); 
  }
  
  private void d(a parama) {
    if (parama != null)
      parama.onResume(); 
  }
  
  private void e(a parama) {
    if (parama != null)
      parama.onStart(); 
  }
  
  static ReportFragment f(Activity paramActivity) {
    return (ReportFragment)paramActivity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
  }
  
  public static void g(Activity paramActivity) {
    if (Build.VERSION.SDK_INT >= 29)
      b.registerIn(paramActivity); 
    FragmentManager fragmentManager = paramActivity.getFragmentManager();
    if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
      fragmentManager.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
      fragmentManager.executePendingTransactions();
    } 
  }
  
  void h(a parama) {
    this.b = parama;
  }
  
  public void onActivityCreated(Bundle paramBundle) {
    super.onActivityCreated(paramBundle);
    c(this.b);
    b(Lifecycle.Event.ON_CREATE);
  }
  
  public void onDestroy() {
    super.onDestroy();
    b(Lifecycle.Event.ON_DESTROY);
    this.b = null;
  }
  
  public void onPause() {
    super.onPause();
    b(Lifecycle.Event.ON_PAUSE);
  }
  
  public void onResume() {
    super.onResume();
    d(this.b);
    b(Lifecycle.Event.ON_RESUME);
  }
  
  public void onStart() {
    super.onStart();
    e(this.b);
    b(Lifecycle.Event.ON_START);
  }
  
  public void onStop() {
    super.onStop();
    b(Lifecycle.Event.ON_STOP);
  }
  
  static interface a {
    void a();
    
    void onResume();
    
    void onStart();
  }
  
  static class b implements Application.ActivityLifecycleCallbacks {
    static void registerIn(Activity param1Activity) {
      param1Activity.registerActivityLifecycleCallbacks(new b());
    }
    
    public void onActivityCreated(Activity param1Activity, Bundle param1Bundle) {}
    
    public void onActivityDestroyed(Activity param1Activity) {}
    
    public void onActivityPaused(Activity param1Activity) {}
    
    public void onActivityPostCreated(Activity param1Activity, Bundle param1Bundle) {
      ReportFragment.a(param1Activity, Lifecycle.Event.ON_CREATE);
    }
    
    public void onActivityPostResumed(Activity param1Activity) {
      ReportFragment.a(param1Activity, Lifecycle.Event.ON_RESUME);
    }
    
    public void onActivityPostStarted(Activity param1Activity) {
      ReportFragment.a(param1Activity, Lifecycle.Event.ON_START);
    }
    
    public void onActivityPreDestroyed(Activity param1Activity) {
      ReportFragment.a(param1Activity, Lifecycle.Event.ON_DESTROY);
    }
    
    public void onActivityPrePaused(Activity param1Activity) {
      ReportFragment.a(param1Activity, Lifecycle.Event.ON_PAUSE);
    }
    
    public void onActivityPreStopped(Activity param1Activity) {
      ReportFragment.a(param1Activity, Lifecycle.Event.ON_STOP);
    }
    
    public void onActivityResumed(Activity param1Activity) {}
    
    public void onActivitySaveInstanceState(Activity param1Activity, Bundle param1Bundle) {}
    
    public void onActivityStarted(Activity param1Activity) {}
    
    public void onActivityStopped(Activity param1Activity) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/ReportFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */