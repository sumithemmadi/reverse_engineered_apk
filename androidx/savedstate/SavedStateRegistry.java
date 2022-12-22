package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {
  private b.b.a.b.b<String, b> a = new b.b.a.b.b();
  
  private Bundle b;
  
  private boolean c;
  
  private Recreator.a d;
  
  boolean e = true;
  
  public Bundle a(String paramString) {
    if (this.c) {
      Bundle bundle = this.b;
      if (bundle != null) {
        bundle = bundle.getBundle(paramString);
        this.b.remove(paramString);
        if (this.b.isEmpty())
          this.b = null; 
        return bundle;
      } 
      return null;
    } 
    throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
  }
  
  void b(Lifecycle paramLifecycle, Bundle paramBundle) {
    if (!this.c) {
      if (paramBundle != null)
        this.b = paramBundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key"); 
      paramLifecycle.a((g)new f(this) {
            public void c(h param1h, Lifecycle.Event param1Event) {
              if (param1Event == Lifecycle.Event.ON_START) {
                this.b.e = true;
              } else if (param1Event == Lifecycle.Event.ON_STOP) {
                this.b.e = false;
              } 
            }
          });
      this.c = true;
      return;
    } 
    throw new IllegalStateException("SavedStateRegistry was already restored.");
  }
  
  void c(Bundle paramBundle) {
    Bundle bundle1 = new Bundle();
    Bundle bundle2 = this.b;
    if (bundle2 != null)
      bundle1.putAll(bundle2); 
    b.b.a.b.b.d<Map.Entry> d = this.a.i();
    while (d.hasNext()) {
      Map.Entry entry = d.next();
      bundle1.putBundle((String)entry.getKey(), ((b)entry.getValue()).a());
    } 
    paramBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle1);
  }
  
  public void d(String paramString, b paramb) {
    if ((b)this.a.l(paramString, paramb) == null)
      return; 
    throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
  }
  
  public void e(Class<? extends a> paramClass) {
    if (this.e) {
      if (this.d == null)
        this.d = new Recreator.a(this); 
      try {
        paramClass.getDeclaredConstructor(new Class[0]);
        this.d.b(paramClass.getName());
        return;
      } catch (NoSuchMethodException noSuchMethodException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Class");
        stringBuilder.append(paramClass.getSimpleName());
        stringBuilder.append(" must have default constructor in order to be automatically recreated");
        throw new IllegalArgumentException(stringBuilder.toString(), noSuchMethodException);
      } 
    } 
    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
  }
  
  public static interface a {
    void a(c param1c);
  }
  
  public static interface b {
    Bundle a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/savedstate/SavedStateRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */