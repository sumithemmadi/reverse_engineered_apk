package androidx.lifecycle;

import android.annotation.SuppressLint;
import b.b.a.b.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class i extends Lifecycle {
  private b.b.a.b.a<g, a> b = new b.b.a.b.a();
  
  private Lifecycle.State c;
  
  private final WeakReference<h> d;
  
  private int e = 0;
  
  private boolean f = false;
  
  private boolean g = false;
  
  private ArrayList<Lifecycle.State> h = new ArrayList<Lifecycle.State>();
  
  private final boolean i;
  
  public i(h paramh) {
    this(paramh, true);
  }
  
  private i(h paramh, boolean paramBoolean) {
    this.d = new WeakReference<h>(paramh);
    this.c = Lifecycle.State.c;
    this.i = paramBoolean;
  }
  
  private void d(h paramh) {
    Iterator<Map.Entry> iterator = this.b.a();
    while (iterator.hasNext() && !this.g) {
      Map.Entry entry = iterator.next();
      a a1 = (a)entry.getValue();
      while (a1.a.compareTo(this.c) > 0 && !this.g && this.b.contains(entry.getKey())) {
        Lifecycle.Event event = Lifecycle.Event.downFrom(a1.a);
        if (event != null) {
          n(event.getTargetState());
          a1.a(paramh, event);
          m();
          continue;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("no event down from ");
        stringBuilder.append(a1.a);
        throw new IllegalStateException(stringBuilder.toString());
      } 
    } 
  }
  
  private Lifecycle.State e(g paramg) {
    Lifecycle.State state;
    Map.Entry entry = this.b.n(paramg);
    ArrayList<Lifecycle.State> arrayList = null;
    if (entry != null) {
      Lifecycle.State state1 = ((a)entry.getValue()).a;
    } else {
      entry = null;
    } 
    if (!this.h.isEmpty()) {
      arrayList = this.h;
      state = arrayList.get(arrayList.size() - 1);
    } 
    return k(k(this.c, (Lifecycle.State)entry), state);
  }
  
  @SuppressLint({"RestrictedApi"})
  private void f(String paramString) {
    if (!this.i || b.b.a.a.a.e().b())
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Method ");
    stringBuilder.append(paramString);
    stringBuilder.append(" must be called on the main thread");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  private void g(h paramh) {
    b.d<Map.Entry> d = this.b.i();
    while (d.hasNext() && !this.g) {
      Map.Entry entry = d.next();
      a a1 = (a)entry.getValue();
      while (a1.a.compareTo(this.c) < 0 && !this.g && this.b.contains(entry.getKey())) {
        n(a1.a);
        Lifecycle.Event event = Lifecycle.Event.upFrom(a1.a);
        if (event != null) {
          a1.a(paramh, event);
          m();
          continue;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("no event up from ");
        stringBuilder.append(a1.a);
        throw new IllegalStateException(stringBuilder.toString());
      } 
    } 
  }
  
  private boolean i() {
    int j = this.b.size();
    boolean bool = true;
    if (j == 0)
      return true; 
    Lifecycle.State state1 = ((a)this.b.c().getValue()).a;
    Lifecycle.State state2 = ((a)this.b.j().getValue()).a;
    if (state1 != state2 || this.c != state2)
      bool = false; 
    return bool;
  }
  
  static Lifecycle.State k(Lifecycle.State paramState1, Lifecycle.State paramState2) {
    Lifecycle.State state = paramState1;
    if (paramState2 != null) {
      state = paramState1;
      if (paramState2.compareTo(paramState1) < 0)
        state = paramState2; 
    } 
    return state;
  }
  
  private void l(Lifecycle.State paramState) {
    if (this.c == paramState)
      return; 
    this.c = paramState;
    if (this.f || this.e != 0) {
      this.g = true;
      return;
    } 
    this.f = true;
    p();
    this.f = false;
  }
  
  private void m() {
    ArrayList<Lifecycle.State> arrayList = this.h;
    arrayList.remove(arrayList.size() - 1);
  }
  
  private void n(Lifecycle.State paramState) {
    this.h.add(paramState);
  }
  
  private void p() {
    h h = this.d.get();
    if (h != null) {
      while (!i()) {
        this.g = false;
        if (this.c.compareTo(((a)this.b.c().getValue()).a) < 0)
          d(h); 
        Map.Entry entry = this.b.j();
        if (!this.g && entry != null && this.c.compareTo(((a)entry.getValue()).a) > 0)
          g(h); 
      } 
      this.g = false;
      return;
    } 
    IllegalStateException illegalStateException = new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    throw illegalStateException;
  }
  
  public void a(g paramg) {
    boolean bool;
    f("addObserver");
    Lifecycle.State state1 = this.c;
    Lifecycle.State state2 = Lifecycle.State.b;
    if (state1 != state2)
      state2 = Lifecycle.State.c; 
    a a1 = new a(paramg, state2);
    if ((a)this.b.l(paramg, a1) != null)
      return; 
    h h = this.d.get();
    if (h == null)
      return; 
    if (this.e != 0 || this.f) {
      bool = true;
    } else {
      bool = false;
    } 
    state2 = e(paramg);
    this.e++;
    while (a1.a.compareTo(state2) < 0 && this.b.contains(paramg)) {
      n(a1.a);
      Lifecycle.Event event = Lifecycle.Event.upFrom(a1.a);
      if (event != null) {
        a1.a(h, event);
        m();
        Lifecycle.State state = e(paramg);
        continue;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("no event up from ");
      stringBuilder.append(a1.a);
      throw new IllegalStateException(stringBuilder.toString());
    } 
    if (!bool)
      p(); 
    this.e--;
  }
  
  public Lifecycle.State b() {
    return this.c;
  }
  
  public void c(g paramg) {
    f("removeObserver");
    this.b.m(paramg);
  }
  
  public void h(Lifecycle.Event paramEvent) {
    f("handleLifecycleEvent");
    l(paramEvent.getTargetState());
  }
  
  @Deprecated
  public void j(Lifecycle.State paramState) {
    f("markState");
    o(paramState);
  }
  
  public void o(Lifecycle.State paramState) {
    f("setCurrentState");
    l(paramState);
  }
  
  static class a {
    Lifecycle.State a;
    
    f b;
    
    a(g param1g, Lifecycle.State param1State) {
      this.b = k.f(param1g);
      this.a = param1State;
    }
    
    void a(h param1h, Lifecycle.Event param1Event) {
      Lifecycle.State state = param1Event.getTargetState();
      this.a = i.k(this.a, state);
      this.b.c(param1h, param1Event);
      this.a = state;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */