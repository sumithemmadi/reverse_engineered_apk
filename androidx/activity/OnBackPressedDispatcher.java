package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
  private final Runnable a;
  
  final ArrayDeque<b> b = new ArrayDeque<b>();
  
  public OnBackPressedDispatcher(Runnable paramRunnable) {
    this.a = paramRunnable;
  }
  
  @SuppressLint({"LambdaLast"})
  public void a(h paramh, b paramb) {
    Lifecycle lifecycle = paramh.a();
    if (lifecycle.b() == Lifecycle.State.b)
      return; 
    paramb.a(new LifecycleOnBackPressedCancellable(this, lifecycle, paramb));
  }
  
  a b(b paramb) {
    this.b.add(paramb);
    a a = new a(this, paramb);
    paramb.a(a);
    return a;
  }
  
  public void c() {
    Iterator<b> iterator = this.b.descendingIterator();
    while (iterator.hasNext()) {
      b b = iterator.next();
      if (b.c()) {
        b.b();
        return;
      } 
    } 
    Runnable runnable = this.a;
    if (runnable != null)
      runnable.run(); 
  }
  
  private class LifecycleOnBackPressedCancellable implements f, a {
    private final Lifecycle b;
    
    private final b c;
    
    private a d;
    
    LifecycleOnBackPressedCancellable(OnBackPressedDispatcher this$0, Lifecycle param1Lifecycle, b param1b) {
      this.b = param1Lifecycle;
      this.c = param1b;
      param1Lifecycle.a((g)this);
    }
    
    public void c(h param1h, Lifecycle.Event param1Event) {
      if (param1Event == Lifecycle.Event.ON_START) {
        this.d = this.e.b(this.c);
      } else if (param1Event == Lifecycle.Event.ON_STOP) {
        a a1 = this.d;
        if (a1 != null)
          a1.cancel(); 
      } else if (param1Event == Lifecycle.Event.ON_DESTROY) {
        cancel();
      } 
    }
    
    public void cancel() {
      this.b.c((g)this);
      this.c.e(this);
      a a1 = this.d;
      if (a1 != null) {
        a1.cancel();
        this.d = null;
      } 
    }
  }
  
  private class a implements a {
    private final b b;
    
    a(OnBackPressedDispatcher this$0, b param1b) {
      this.b = param1b;
    }
    
    public void cancel() {
      this.c.b.remove(this.b);
      this.b.e(this);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/activity/OnBackPressedDispatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */