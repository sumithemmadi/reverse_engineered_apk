package androidx.lifecycle;

import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.c;
import java.util.Iterator;

final class SavedStateHandleController implements f {
  private boolean b;
  
  static void h(r paramr, SavedStateRegistry paramSavedStateRegistry, Lifecycle paramLifecycle) {
    SavedStateHandleController savedStateHandleController = paramr.<SavedStateHandleController>c("androidx.lifecycle.savedstate.vm.tag");
    if (savedStateHandleController != null && !savedStateHandleController.j()) {
      savedStateHandleController.i(paramSavedStateRegistry, paramLifecycle);
      k(paramSavedStateRegistry, paramLifecycle);
    } 
  }
  
  private static void k(SavedStateRegistry paramSavedStateRegistry, Lifecycle paramLifecycle) {
    Lifecycle.State state = paramLifecycle.b();
    if (state == Lifecycle.State.c || state.isAtLeast(Lifecycle.State.e)) {
      paramSavedStateRegistry.e(a.class);
      return;
    } 
    paramLifecycle.a(new f(paramLifecycle, paramSavedStateRegistry) {
          public void c(h param1h, Lifecycle.Event param1Event) {
            if (param1Event == Lifecycle.Event.ON_START) {
              this.b.c(this);
              this.c.e(SavedStateHandleController.a.class);
            } 
          }
        });
  }
  
  public void c(h paramh, Lifecycle.Event paramEvent) {
    if (paramEvent == Lifecycle.Event.ON_DESTROY) {
      this.b = false;
      paramh.a().c(this);
    } 
  }
  
  void i(SavedStateRegistry paramSavedStateRegistry, Lifecycle paramLifecycle) {
    if (this.b)
      throw new IllegalStateException("Already attached to lifecycleOwner"); 
    this.b = true;
    paramLifecycle.a(this);
    throw null;
  }
  
  boolean j() {
    return this.b;
  }
  
  static final class a implements SavedStateRegistry.a {
    public void a(c param1c) {
      if (param1c instanceof u) {
        t t = ((u)param1c).h();
        SavedStateRegistry savedStateRegistry = param1c.j();
        Iterator<String> iterator = t.c().iterator();
        while (iterator.hasNext())
          SavedStateHandleController.h(t.b(iterator.next()), savedStateRegistry, param1c.a()); 
        if (!t.c().isEmpty())
          savedStateRegistry.e(a.class); 
        return;
      } 
      IllegalStateException illegalStateException = new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
      throw illegalStateException;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/SavedStateHandleController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */