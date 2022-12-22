package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import b.h.k.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

abstract class SpecialEffectsController {
  private final ViewGroup a;
  
  final ArrayList<Operation> b = new ArrayList<Operation>();
  
  final ArrayList<Operation> c = new ArrayList<Operation>();
  
  boolean d = false;
  
  boolean e = false;
  
  SpecialEffectsController(ViewGroup paramViewGroup) {
    this.a = paramViewGroup;
  }
  
  private void a(Operation.State paramState, Operation.LifecycleImpact paramLifecycleImpact, p paramp) {
    synchronized (this.b) {
      androidx.core.os.b b1 = new androidx.core.os.b();
      this();
      Operation operation = h(paramp.k());
      if (operation != null) {
        operation.k(paramState, paramLifecycleImpact);
        return;
      } 
      operation = new d();
      super(paramState, paramLifecycleImpact, paramp, b1);
      this.b.add(operation);
      a a = new a();
      this(this, (d)operation);
      operation.a(a);
      b b = new b();
      this(this, (d)operation);
      operation.a(b);
      return;
    } 
  }
  
  private Operation h(Fragment paramFragment) {
    for (Operation operation : this.b) {
      if (operation.f().equals(paramFragment) && !operation.h())
        return operation; 
    } 
    return null;
  }
  
  private Operation i(Fragment paramFragment) {
    for (Operation operation : this.c) {
      if (operation.f().equals(paramFragment) && !operation.h())
        return operation; 
    } 
    return null;
  }
  
  static SpecialEffectsController n(ViewGroup paramViewGroup, FragmentManager paramFragmentManager) {
    return o(paramViewGroup, paramFragmentManager.z0());
  }
  
  static SpecialEffectsController o(ViewGroup paramViewGroup, y paramy) {
    int i = b.m.b.special_effects_controller_view_tag;
    Object object = paramViewGroup.getTag(i);
    if (object instanceof SpecialEffectsController)
      return (SpecialEffectsController)object; 
    SpecialEffectsController specialEffectsController = paramy.a(paramViewGroup);
    paramViewGroup.setTag(i, specialEffectsController);
    return specialEffectsController;
  }
  
  private void q() {
    for (Operation operation : this.b) {
      if (operation.g() == Operation.LifecycleImpact.c)
        operation.k(Operation.State.from(operation.f().u1().getVisibility()), Operation.LifecycleImpact.b); 
    } 
  }
  
  void b(Operation.State paramState, p paramp) {
    if (FragmentManager.G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("SpecialEffectsController: Enqueuing add operation for fragment ");
      stringBuilder.append(paramp.k());
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    a(paramState, Operation.LifecycleImpact.c, paramp);
  }
  
  void c(p paramp) {
    if (FragmentManager.G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
      stringBuilder.append(paramp.k());
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    a(Operation.State.d, Operation.LifecycleImpact.b, paramp);
  }
  
  void d(p paramp) {
    if (FragmentManager.G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
      stringBuilder.append(paramp.k());
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    a(Operation.State.b, Operation.LifecycleImpact.d, paramp);
  }
  
  void e(p paramp) {
    if (FragmentManager.G0(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("SpecialEffectsController: Enqueuing show operation for fragment ");
      stringBuilder.append(paramp.k());
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    a(Operation.State.c, Operation.LifecycleImpact.b, paramp);
  }
  
  abstract void f(List<Operation> paramList, boolean paramBoolean);
  
  void g() {
    if (this.e)
      return; 
    if (!w.U((View)this.a)) {
      j();
      this.d = false;
      return;
    } 
    synchronized (this.b) {
      if (!this.b.isEmpty()) {
        ArrayList arrayList = new ArrayList();
        this((Collection)this.c);
        this.c.clear();
        for (Operation operation : arrayList) {
          if (FragmentManager.G0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("SpecialEffectsController: Cancelling operation ");
            stringBuilder.append(operation);
            Log.v("FragmentManager", stringBuilder.toString());
          } 
          operation.b();
          if (!operation.i())
            this.c.add(operation); 
        } 
        q();
        ArrayList<? extends Operation> arrayList1 = new ArrayList();
        this((Collection)this.b);
        this.b.clear();
        this.c.addAll(arrayList1);
        Iterator<? extends Operation> iterator = arrayList1.iterator();
        while (iterator.hasNext())
          ((Operation)iterator.next()).l(); 
        f((List)arrayList1, this.d);
        this.d = false;
      } 
      return;
    } 
  }
  
  void j() {
    boolean bool = w.U((View)this.a);
    synchronized (this.b) {
      q();
      Iterator<Operation> iterator = this.b.iterator();
      while (iterator.hasNext())
        ((Operation)iterator.next()).l(); 
      ArrayList arrayList = new ArrayList();
      this((Collection)this.c);
      for (Operation operation : arrayList) {
        if (FragmentManager.G0(2)) {
          String str;
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("SpecialEffectsController: ");
          if (bool) {
            str = "";
          } else {
            StringBuilder stringBuilder1 = new StringBuilder();
            this();
            stringBuilder1.append("Container ");
            stringBuilder1.append(this.a);
            stringBuilder1.append(" is not attached to window. ");
            str = stringBuilder1.toString();
          } 
          stringBuilder.append(str);
          stringBuilder.append("Cancelling running operation ");
          stringBuilder.append(operation);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        operation.b();
      } 
      arrayList = new ArrayList();
      this((Collection)this.b);
      for (Operation operation : arrayList) {
        if (FragmentManager.G0(2)) {
          String str;
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("SpecialEffectsController: ");
          if (bool) {
            str = "";
          } else {
            StringBuilder stringBuilder1 = new StringBuilder();
            this();
            stringBuilder1.append("Container ");
            stringBuilder1.append(this.a);
            stringBuilder1.append(" is not attached to window. ");
            str = stringBuilder1.toString();
          } 
          stringBuilder.append(str);
          stringBuilder.append("Cancelling pending operation ");
          stringBuilder.append(operation);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        operation.b();
      } 
      return;
    } 
  }
  
  void k() {
    if (this.e) {
      this.e = false;
      g();
    } 
  }
  
  Operation.LifecycleImpact l(p paramp) {
    Operation operation2 = h(paramp.k());
    if (operation2 != null)
      return operation2.g(); 
    Operation operation1 = i(paramp.k());
    return (operation1 != null) ? operation1.g() : null;
  }
  
  public ViewGroup m() {
    return this.a;
  }
  
  void p() {
    synchronized (this.b) {
      q();
      this.e = false;
      for (int i = this.b.size() - 1; i >= 0; i--) {
        Operation operation = this.b.get(i);
        Operation.State state1 = Operation.State.from((operation.f()).J);
        Operation.State state2 = operation.e();
        Operation.State state3 = Operation.State.c;
        if (state2 == state3 && state1 != state3) {
          this.e = operation.f().h0();
          break;
        } 
      } 
      return;
    } 
  }
  
  void r(boolean paramBoolean) {
    this.d = paramBoolean;
  }
  
  static class Operation {
    private State a;
    
    private LifecycleImpact b;
    
    private final Fragment c;
    
    private final List<Runnable> d = new ArrayList<Runnable>();
    
    private final HashSet<androidx.core.os.b> e = new HashSet<androidx.core.os.b>();
    
    private boolean f = false;
    
    private boolean g = false;
    
    Operation(State param1State, LifecycleImpact param1LifecycleImpact, Fragment param1Fragment, androidx.core.os.b param1b) {
      this.a = param1State;
      this.b = param1LifecycleImpact;
      this.c = param1Fragment;
      param1b.c(new a(this));
    }
    
    final void a(Runnable param1Runnable) {
      this.d.add(param1Runnable);
    }
    
    final void b() {
      if (h())
        return; 
      this.f = true;
      if (this.e.isEmpty()) {
        c();
      } else {
        Iterator<?> iterator = (new ArrayList(this.e)).iterator();
        while (iterator.hasNext())
          ((androidx.core.os.b)iterator.next()).a(); 
      } 
    }
    
    public void c() {
      if (this.g)
        return; 
      if (FragmentManager.G0(2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SpecialEffectsController: ");
        stringBuilder.append(this);
        stringBuilder.append(" has called complete.");
        Log.v("FragmentManager", stringBuilder.toString());
      } 
      this.g = true;
      Iterator<Runnable> iterator = this.d.iterator();
      while (iterator.hasNext())
        ((Runnable)iterator.next()).run(); 
    }
    
    public final void d(androidx.core.os.b param1b) {
      if (this.e.remove(param1b) && this.e.isEmpty())
        c(); 
    }
    
    public State e() {
      return this.a;
    }
    
    public final Fragment f() {
      return this.c;
    }
    
    LifecycleImpact g() {
      return this.b;
    }
    
    final boolean h() {
      return this.f;
    }
    
    final boolean i() {
      return this.g;
    }
    
    public final void j(androidx.core.os.b param1b) {
      l();
      this.e.add(param1b);
    }
    
    final void k(State param1State, LifecycleImpact param1LifecycleImpact) {
      int i = SpecialEffectsController.c.b[param1LifecycleImpact.ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i == 3 && this.a != State.b) {
            if (FragmentManager.G0(2)) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("SpecialEffectsController: For fragment ");
              stringBuilder.append(this.c);
              stringBuilder.append(" mFinalState = ");
              stringBuilder.append(this.a);
              stringBuilder.append(" -> ");
              stringBuilder.append(param1State);
              stringBuilder.append(". ");
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            this.a = param1State;
          } 
        } else {
          if (FragmentManager.G0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SpecialEffectsController: For fragment ");
            stringBuilder.append(this.c);
            stringBuilder.append(" mFinalState = ");
            stringBuilder.append(this.a);
            stringBuilder.append(" -> REMOVED. mLifecycleImpact  = ");
            stringBuilder.append(this.b);
            stringBuilder.append(" to REMOVING.");
            Log.v("FragmentManager", stringBuilder.toString());
          } 
          this.a = State.b;
          this.b = LifecycleImpact.d;
        } 
      } else if (this.a == State.b) {
        if (FragmentManager.G0(2)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("SpecialEffectsController: For fragment ");
          stringBuilder.append(this.c);
          stringBuilder.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
          stringBuilder.append(this.b);
          stringBuilder.append(" to ADDING.");
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        this.a = State.c;
        this.b = LifecycleImpact.c;
      } 
    }
    
    void l() {}
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Operation ");
      stringBuilder.append("{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append("} ");
      stringBuilder.append("{");
      stringBuilder.append("mFinalState = ");
      stringBuilder.append(this.a);
      stringBuilder.append("} ");
      stringBuilder.append("{");
      stringBuilder.append("mLifecycleImpact = ");
      stringBuilder.append(this.b);
      stringBuilder.append("} ");
      stringBuilder.append("{");
      stringBuilder.append("mFragment = ");
      stringBuilder.append(this.c);
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
    
    enum LifecycleImpact {
      b, c, d;
      
      static {
        LifecycleImpact lifecycleImpact1 = new LifecycleImpact("NONE", 0);
        b = lifecycleImpact1;
        LifecycleImpact lifecycleImpact2 = new LifecycleImpact("ADDING", 1);
        c = lifecycleImpact2;
        LifecycleImpact lifecycleImpact3 = new LifecycleImpact("REMOVING", 2);
        d = lifecycleImpact3;
        e = new LifecycleImpact[] { lifecycleImpact1, lifecycleImpact2, lifecycleImpact3 };
      }
    }
    
    enum State {
      b, c, d, e;
      
      static {
        State state1 = new State("REMOVED", 0);
        b = state1;
        State state2 = new State("VISIBLE", 1);
        c = state2;
        State state3 = new State("GONE", 2);
        d = state3;
        State state4 = new State("INVISIBLE", 3);
        e = state4;
        f = new State[] { state1, state2, state3, state4 };
      }
      
      static State from(int param2Int) {
        if (param2Int != 0) {
          if (param2Int != 4) {
            if (param2Int == 8)
              return d; 
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown visibility ");
            stringBuilder.append(param2Int);
            throw new IllegalArgumentException(stringBuilder.toString());
          } 
          return e;
        } 
        return c;
      }
      
      static State from(View param2View) {
        return (param2View.getAlpha() == 0.0F && param2View.getVisibility() == 0) ? e : from(param2View.getVisibility());
      }
      
      void applyState(View param2View) {
        int i = SpecialEffectsController.c.a[ordinal()];
        if (i != 1) {
          if (i != 2) {
            if (i != 3) {
              if (i == 4) {
                if (FragmentManager.G0(2)) {
                  StringBuilder stringBuilder = new StringBuilder();
                  stringBuilder.append("SpecialEffectsController: Setting view ");
                  stringBuilder.append(param2View);
                  stringBuilder.append(" to INVISIBLE");
                  Log.v("FragmentManager", stringBuilder.toString());
                } 
                param2View.setVisibility(4);
              } 
            } else {
              if (FragmentManager.G0(2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SpecialEffectsController: Setting view ");
                stringBuilder.append(param2View);
                stringBuilder.append(" to GONE");
                Log.v("FragmentManager", stringBuilder.toString());
              } 
              param2View.setVisibility(8);
            } 
          } else {
            if (FragmentManager.G0(2)) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("SpecialEffectsController: Setting view ");
              stringBuilder.append(param2View);
              stringBuilder.append(" to VISIBLE");
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            param2View.setVisibility(0);
          } 
        } else {
          ViewGroup viewGroup = (ViewGroup)param2View.getParent();
          if (viewGroup != null) {
            if (FragmentManager.G0(2)) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("SpecialEffectsController: Removing view ");
              stringBuilder.append(param2View);
              stringBuilder.append(" from container ");
              stringBuilder.append(viewGroup);
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            viewGroup.removeView(param2View);
          } 
        } 
      }
    }
    
    class a implements androidx.core.os.b.a {
      a(SpecialEffectsController.Operation this$0) {}
      
      public void a() {
        this.a.b();
      }
    }
  }
  
  enum LifecycleImpact {
    b, c, d;
    
    static {
      LifecycleImpact lifecycleImpact1 = new LifecycleImpact("NONE", 0);
      b = lifecycleImpact1;
      LifecycleImpact lifecycleImpact2 = new LifecycleImpact("ADDING", 1);
      c = lifecycleImpact2;
      LifecycleImpact lifecycleImpact3 = new LifecycleImpact("REMOVING", 2);
      d = lifecycleImpact3;
      e = new LifecycleImpact[] { lifecycleImpact1, lifecycleImpact2, lifecycleImpact3 };
    }
  }
  
  enum State {
    b, c, d, e;
    
    static {
      State state1 = new State("REMOVED", 0);
      b = state1;
      State state2 = new State("VISIBLE", 1);
      c = state2;
      State state3 = new State("GONE", 2);
      d = state3;
      State state4 = new State("INVISIBLE", 3);
      e = state4;
      f = new State[] { state1, state2, state3, state4 };
    }
    
    static State from(int param1Int) {
      if (param1Int != 0) {
        if (param1Int != 4) {
          if (param1Int == 8)
            return d; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown visibility ");
          stringBuilder.append(param1Int);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        return e;
      } 
      return c;
    }
    
    static State from(View param1View) {
      return (param1View.getAlpha() == 0.0F && param1View.getVisibility() == 0) ? e : from(param1View.getVisibility());
    }
    
    void applyState(View param1View) {
      int i = SpecialEffectsController.c.a[ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i == 4) {
              if (FragmentManager.G0(2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SpecialEffectsController: Setting view ");
                stringBuilder.append(param1View);
                stringBuilder.append(" to INVISIBLE");
                Log.v("FragmentManager", stringBuilder.toString());
              } 
              param1View.setVisibility(4);
            } 
          } else {
            if (FragmentManager.G0(2)) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("SpecialEffectsController: Setting view ");
              stringBuilder.append(param1View);
              stringBuilder.append(" to GONE");
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            param1View.setVisibility(8);
          } 
        } else {
          if (FragmentManager.G0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SpecialEffectsController: Setting view ");
            stringBuilder.append(param1View);
            stringBuilder.append(" to VISIBLE");
            Log.v("FragmentManager", stringBuilder.toString());
          } 
          param1View.setVisibility(0);
        } 
      } else {
        ViewGroup viewGroup = (ViewGroup)param1View.getParent();
        if (viewGroup != null) {
          if (FragmentManager.G0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SpecialEffectsController: Removing view ");
            stringBuilder.append(param1View);
            stringBuilder.append(" from container ");
            stringBuilder.append(viewGroup);
            Log.v("FragmentManager", stringBuilder.toString());
          } 
          viewGroup.removeView(param1View);
        } 
      } 
    }
  }
  
  class a implements androidx.core.os.b.a {
    a(SpecialEffectsController this$0) {}
    
    public void a() {
      this.a.b();
    }
  }
  
  class a implements Runnable {
    a(SpecialEffectsController this$0, SpecialEffectsController.d param1d) {}
    
    public void run() {
      if (this.c.b.contains(this.b))
        this.b.e().applyState((this.b.f()).J); 
    }
  }
  
  class b implements Runnable {
    b(SpecialEffectsController this$0, SpecialEffectsController.d param1d) {}
    
    public void run() {
      this.c.b.remove(this.b);
      this.c.c.remove(this.b);
    }
  }
  
  private static class d extends Operation {
    private final p h;
    
    d(SpecialEffectsController.Operation.State param1State, SpecialEffectsController.Operation.LifecycleImpact param1LifecycleImpact, p param1p, androidx.core.os.b param1b) {
      super(param1State, param1LifecycleImpact, param1p.k(), param1b);
      this.h = param1p;
    }
    
    public void c() {
      super.c();
      this.h.m();
    }
    
    void l() {
      if (g() == SpecialEffectsController.Operation.LifecycleImpact.c) {
        Fragment fragment = this.h.k();
        View view = fragment.J.findFocus();
        if (view != null) {
          fragment.C1(view);
          if (FragmentManager.G0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("requestFocus: Saved focused view ");
            stringBuilder.append(view);
            stringBuilder.append(" for Fragment ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
          } 
        } 
        view = f().u1();
        if (view.getParent() == null) {
          this.h.b();
          view.setAlpha(0.0F);
        } 
        if (view.getAlpha() == 0.0F && view.getVisibility() == 0)
          view.setVisibility(4); 
        view.setAlpha(fragment.M());
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/SpecialEffectsController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */