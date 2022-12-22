package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.o;
import b.h.k.t;
import b.h.k.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class b extends SpecialEffectsController {
  b(ViewGroup paramViewGroup) {
    super(paramViewGroup);
  }
  
  private void w(List<k> paramList, List<SpecialEffectsController.Operation> paramList1, boolean paramBoolean, Map<SpecialEffectsController.Operation, Boolean> paramMap) {
    ViewGroup viewGroup = m();
    Context context = viewGroup.getContext();
    ArrayList<k> arrayList = new ArrayList();
    Iterator<k> iterator = paramList.iterator();
    boolean bool;
    for (bool = false; iterator.hasNext(); bool = true) {
      StringBuilder stringBuilder;
      boolean bool1;
      k k = iterator.next();
      if (k.d()) {
        k.a();
        continue;
      } 
      d.d d = k.e(context);
      if (d == null) {
        k.a();
        continue;
      } 
      Animator animator = d.b;
      if (animator == null) {
        arrayList.add(k);
        continue;
      } 
      SpecialEffectsController.Operation operation = k.b();
      Fragment fragment = operation.f();
      if (Boolean.TRUE.equals(paramMap.get(operation))) {
        if (FragmentManager.G0(2)) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Ignoring Animator set on ");
          stringBuilder.append(fragment);
          stringBuilder.append(" as this Fragment was involved in a Transition.");
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        k.a();
        continue;
      } 
      if (stringBuilder.e() == SpecialEffectsController.Operation.State.d) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (bool1)
        paramList1.remove(stringBuilder); 
      View view = fragment.J;
      viewGroup.startViewTransition(view);
      animator.addListener((Animator.AnimatorListener)new c(this, viewGroup, view, bool1, (SpecialEffectsController.Operation)stringBuilder, k));
      animator.setTarget(view);
      animator.start();
      k.c().c(new d(this, animator));
    } 
    for (k k : arrayList) {
      StringBuilder stringBuilder;
      SpecialEffectsController.Operation operation = k.b();
      Fragment fragment = operation.f();
      if (paramBoolean) {
        if (FragmentManager.G0(2)) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Ignoring Animation set on ");
          stringBuilder.append(fragment);
          stringBuilder.append(" as Animations cannot run alongside Transitions.");
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        k.a();
        continue;
      } 
      if (bool) {
        if (FragmentManager.G0(2)) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Ignoring Animation set on ");
          stringBuilder.append(fragment);
          stringBuilder.append(" as Animations cannot run alongside Animators.");
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        k.a();
        continue;
      } 
      View view = fragment.J;
      Animation animation = (Animation)b.h.j.i.e(((d.d)b.h.j.i.e(k.e(context))).a);
      if (stringBuilder.e() != SpecialEffectsController.Operation.State.b) {
        view.startAnimation(animation);
        k.a();
      } else {
        viewGroup.startViewTransition(view);
        d.e e = new d.e(animation, viewGroup, view);
        e.setAnimationListener(new e(this, viewGroup, view, k));
        view.startAnimation((Animation)e);
      } 
      k.c().c(new f(this, view, viewGroup, k));
    } 
  }
  
  private Map<SpecialEffectsController.Operation, Boolean> x(List<m> paramList, List<SpecialEffectsController.Operation> paramList1, boolean paramBoolean, SpecialEffectsController.Operation paramOperation1, SpecialEffectsController.Operation paramOperation2) {
    StringBuilder stringBuilder;
    SpecialEffectsController.Operation operation1 = paramOperation1;
    SpecialEffectsController.Operation operation2 = paramOperation2;
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    Iterator<m> iterator1 = paramList.iterator();
    v v1 = null;
    while (iterator1.hasNext()) {
      m m1 = iterator1.next();
      if (m1.d())
        continue; 
      v v = m1.e();
      if (v1 == null) {
        v1 = v;
        continue;
      } 
      if (v == null || v1 == v)
        continue; 
      stringBuilder = new StringBuilder();
      stringBuilder.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
      stringBuilder.append(m1.b().f());
      stringBuilder.append(" returned Transition ");
      stringBuilder.append(m1.h());
      stringBuilder.append(" which uses a different Transition  type than other Fragments.");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    if (v1 == null) {
      for (m m : stringBuilder) {
        hashMap.put(m.b(), Boolean.FALSE);
        m.a();
      } 
      return (Map)hashMap;
    } 
    View view3 = new View(m().getContext());
    Rect rect = new Rect();
    ArrayList<View> arrayList1 = new ArrayList();
    ArrayList<View> arrayList2 = new ArrayList();
    b.e.a<String, String> a = new b.e.a();
    Iterator<m> iterator2 = m.iterator();
    Object object = null;
    View view2 = null;
    boolean bool = false;
    v v2 = v1;
    View view1 = view3;
    while (true) {
      SpecialEffectsController.Operation operation3;
      SpecialEffectsController.Operation operation4;
      ArrayList<View> arrayList3;
      boolean bool1 = paramBoolean;
      if (iterator2.hasNext()) {
        m m1 = iterator2.next();
        if (m1.i() && operation1 != null && operation2 != null) {
          o o1;
          o o2;
          object = v2.B(v2.g(m1.g()));
          ArrayList<String> arrayList12 = paramOperation2.f().S();
          ArrayList<String> arrayList9 = paramOperation1.f().S();
          ArrayList<String> arrayList10 = paramOperation1.f().T();
          byte b1;
          for (b1 = 0; b1 < arrayList10.size(); b1++) {
            int j = arrayList12.indexOf(arrayList10.get(b1));
            if (j != -1)
              arrayList12.set(j, arrayList9.get(b1)); 
          } 
          ArrayList<String> arrayList11 = paramOperation2.f().T();
          if (!bool1) {
            o1 = paramOperation1.f().z();
            o2 = paramOperation2.f().w();
          } else {
            o1 = paramOperation1.f().w();
            o2 = paramOperation2.f().z();
          } 
          int i = arrayList12.size();
          for (b1 = 0; b1 < i; b1++)
            a.put(arrayList12.get(b1), arrayList11.get(b1)); 
          b.e.a<String, View> a1 = new b.e.a();
          u((Map<String, View>)a1, (paramOperation1.f()).J);
          a1.o(arrayList12);
          if (o1 == null) {
            a.o(a1.keySet());
            b.e.a<String, View> a2 = new b.e.a();
            u((Map<String, View>)a2, (paramOperation2.f()).J);
            a2.o(arrayList11);
            a2.o(a.values());
            if (o2 == null) {
              t.x(a, a2);
              v(a1, a.keySet());
              v(a2, a.values());
              if (a.isEmpty()) {
                arrayList1.clear();
                arrayList2.clear();
                operation4 = paramOperation1;
                object = null;
                operation3 = paramOperation2;
              } else {
                t.f(paramOperation2.f(), paramOperation1.f(), bool1, a1, true);
                t.a((View)m(), new g(this, paramOperation2, paramOperation1, paramBoolean, (b.e.a)operation3));
                Iterator<View> iterator3 = a1.values().iterator();
                while (iterator3.hasNext())
                  t(arrayList1, iterator3.next()); 
                if (!arrayList12.isEmpty()) {
                  view2 = (View)a1.get(arrayList12.get(0));
                  v2.v(object, view2);
                } 
                iterator3 = operation3.values().iterator();
                while (iterator3.hasNext())
                  t(arrayList2, iterator3.next()); 
                if (!arrayList11.isEmpty()) {
                  View view4 = (View)operation3.get(arrayList11.get(0));
                  if (view4 != null) {
                    t.a((View)m(), new h(this, v2, view4, rect));
                    bool = true;
                  } 
                } 
                v2.z(object, view1, arrayList1);
                v2.t(object, null, null, null, null, object, arrayList2);
                Boolean bool2 = Boolean.TRUE;
                operation4 = paramOperation1;
                hashMap.put(operation4, bool2);
                operation3 = paramOperation2;
                hashMap.put(operation3, bool2);
              } 
            } else {
              throw null;
            } 
          } else {
            throw null;
          } 
        } else {
          SpecialEffectsController.Operation operation5 = operation3;
          operation3 = operation4;
          operation4 = operation5;
        } 
        ArrayList<View> arrayList8 = arrayList1;
        SpecialEffectsController.Operation operation = operation3;
        operation3 = operation4;
        operation4 = operation;
        arrayList3 = arrayList8;
        continue;
      } 
      Object object2 = view2;
      ArrayList<View> arrayList6 = arrayList2;
      ArrayList<View> arrayList5 = arrayList3;
      ArrayList<View> arrayList7 = new ArrayList();
      Iterator<m> iterator = m.iterator();
      view3 = null;
      paramOperation2 = null;
      View view = (View)object2;
      object2 = view3;
      view3 = view1;
      ArrayList<View> arrayList4 = arrayList6;
      while (iterator.hasNext()) {
        boolean bool2;
        m m1 = iterator.next();
        if (m1.d()) {
          hashMap.put(m1.b(), Boolean.FALSE);
          m1.a();
          continue;
        } 
        Object object4 = v2.g(m1.h());
        SpecialEffectsController.Operation operation = m1.b();
        if (object != null && (operation == operation3 || operation == operation4)) {
          bool2 = true;
        } else {
          bool2 = false;
        } 
        if (object4 == null) {
          if (!bool2) {
            hashMap.put(operation, Boolean.FALSE);
            m1.a();
          } 
          continue;
        } 
        ArrayList<View> arrayList8 = new ArrayList();
        t(arrayList8, (operation.f()).J);
        if (bool2)
          if (operation == operation3) {
            arrayList8.removeAll(arrayList5);
          } else {
            arrayList8.removeAll(arrayList4);
          }  
        if (arrayList8.isEmpty()) {
          v2.a(object4, view3);
        } else {
          v2.b(object4, arrayList8);
          v2.t(object4, object4, arrayList8, null, null, null, null);
          if (operation.e() == SpecialEffectsController.Operation.State.d) {
            SpecialEffectsController.Operation operation5 = operation;
            paramList1.remove(operation5);
            v2.r(object4, (operation5.f()).J, arrayList8);
            t.a((View)m(), new i(this, arrayList8));
          } 
        } 
        if (operation.e() == SpecialEffectsController.Operation.State.c) {
          arrayList7.addAll(arrayList8);
          if (bool)
            v2.u(object4, rect); 
        } else {
          v2.v(object4, view);
        } 
        hashMap.put(operation, Boolean.TRUE);
        if (m1.j()) {
          object3 = v2.n(paramOperation2, object4, null);
          continue;
        } 
        object2 = v2.n(object2, object4, null);
      } 
      Object object1 = v2.m(object3, object2, object);
      for (Object object3 : m) {
        if (object3.d())
          continue; 
        Object object4 = object3.h();
        object2 = object3.b();
        if (object != null && (object2 == operation3 || object2 == operation4)) {
          bool = true;
        } else {
          bool = false;
        } 
        if (object4 != null || bool) {
          if (!w.V((View)m())) {
            if (FragmentManager.G0(2)) {
              object4 = new StringBuilder();
              object4.append("SpecialEffectsController: Container ");
              object4.append(m());
              object4.append(" has not been laid out. Completing operation ");
              object4.append(object2);
              Log.v("FragmentManager", object4.toString());
            } 
            object3.a();
            continue;
          } 
          v2.w(object3.b().f(), object1, object3.c(), new j(this, (m)object3));
        } 
      } 
      if (!w.V((View)m()))
        return (Map)hashMap; 
      t.A(arrayList7, 4);
      ArrayList<String> arrayList = v2.o(arrayList4);
      v2.c(m(), object1);
      v2.y((View)m(), arrayList5, arrayList4, arrayList, (Map<String, String>)a);
      t.A(arrayList7, 0);
      v2.A(object, arrayList5, arrayList4);
      return (Map)hashMap;
    } 
  }
  
  void f(List<SpecialEffectsController.Operation> paramList, boolean paramBoolean) {
    Iterator<SpecialEffectsController.Operation> iterator2 = paramList.iterator();
    SpecialEffectsController.Operation operation1 = null;
    SpecialEffectsController.Operation operation2 = operation1;
    while (iterator2.hasNext()) {
      SpecialEffectsController.Operation operation = iterator2.next();
      SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.from((operation.f()).J);
      int i = a.a[operation.e().ordinal()];
      if (i != 1 && i != 2 && i != 3) {
        if (i == 4 && state != SpecialEffectsController.Operation.State.c)
          operation2 = operation; 
        continue;
      } 
      if (state == SpecialEffectsController.Operation.State.c && operation1 == null)
        operation1 = operation; 
    } 
    ArrayList<k> arrayList = new ArrayList();
    ArrayList<m> arrayList2 = new ArrayList();
    ArrayList<SpecialEffectsController.Operation> arrayList1 = new ArrayList<SpecialEffectsController.Operation>(paramList);
    for (SpecialEffectsController.Operation operation : paramList) {
      androidx.core.os.b b1 = new androidx.core.os.b();
      operation.j(b1);
      arrayList.add(new k(operation, b1, paramBoolean));
      b1 = new androidx.core.os.b();
      operation.j(b1);
      boolean bool = false;
      if (paramBoolean ? (operation == operation1) : (operation == operation2))
        bool = true; 
      arrayList2.add(new m(operation, b1, paramBoolean, bool));
      operation.a(new b(this, arrayList1, operation));
    } 
    Map<SpecialEffectsController.Operation, Boolean> map = x(arrayList2, arrayList1, paramBoolean, operation1, operation2);
    w(arrayList, arrayList1, map.containsValue(Boolean.TRUE), map);
    Iterator<SpecialEffectsController.Operation> iterator1 = arrayList1.iterator();
    while (iterator1.hasNext())
      s(iterator1.next()); 
    arrayList1.clear();
  }
  
  void s(SpecialEffectsController.Operation paramOperation) {
    View view = (paramOperation.f()).J;
    paramOperation.e().applyState(view);
  }
  
  void t(ArrayList<View> paramArrayList, View paramView) {
    if (paramView instanceof ViewGroup) {
      if (!paramArrayList.contains(paramView) && w.M(paramView) != null)
        paramArrayList.add(paramView); 
      ViewGroup viewGroup = (ViewGroup)paramView;
      int i = viewGroup.getChildCount();
      for (byte b1 = 0; b1 < i; b1++) {
        paramView = viewGroup.getChildAt(b1);
        if (paramView.getVisibility() == 0)
          t(paramArrayList, paramView); 
      } 
    } else if (!paramArrayList.contains(paramView)) {
      paramArrayList.add(paramView);
    } 
  }
  
  void u(Map<String, View> paramMap, View paramView) {
    String str = w.M(paramView);
    if (str != null)
      paramMap.put(str, paramView); 
    if (paramView instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)paramView;
      int i = viewGroup.getChildCount();
      for (byte b1 = 0; b1 < i; b1++) {
        paramView = viewGroup.getChildAt(b1);
        if (paramView.getVisibility() == 0)
          u(paramMap, paramView); 
      } 
    } 
  }
  
  void v(b.e.a<String, View> parama, Collection<String> paramCollection) {
    Iterator<Map.Entry> iterator = parama.entrySet().iterator();
    while (iterator.hasNext()) {
      if (!paramCollection.contains(w.M((View)((Map.Entry)iterator.next()).getValue())))
        iterator.remove(); 
    } 
  }
  
  class b implements Runnable {
    b(b this$0, List param1List, SpecialEffectsController.Operation param1Operation) {}
    
    public void run() {
      if (this.b.contains(this.c)) {
        this.b.remove(this.c);
        this.d.s(this.c);
      } 
    }
  }
  
  class c extends AnimatorListenerAdapter {
    c(b this$0, ViewGroup param1ViewGroup, View param1View, boolean param1Boolean, SpecialEffectsController.Operation param1Operation, b.k param1k) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.endViewTransition(this.b);
      if (this.c)
        this.d.e().applyState(this.b); 
      this.e.a();
    }
  }
  
  class d implements androidx.core.os.b.a {
    d(b this$0, Animator param1Animator) {}
    
    public void a() {
      this.a.end();
    }
  }
  
  class e implements Animation.AnimationListener {
    e(b this$0, ViewGroup param1ViewGroup, View param1View, b.k param1k) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      this.a.post(new a(this));
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
    
    class a implements Runnable {
      a(b.e this$0) {}
      
      public void run() {
        b.e e1 = this.b;
        e1.a.endViewTransition(e1.b);
        this.b.c.a();
      }
    }
  }
  
  class a implements Runnable {
    a(b this$0) {}
    
    public void run() {
      b.e e1 = this.b;
      e1.a.endViewTransition(e1.b);
      this.b.c.a();
    }
  }
  
  class f implements androidx.core.os.b.a {
    f(b this$0, View param1View, ViewGroup param1ViewGroup, b.k param1k) {}
    
    public void a() {
      this.a.clearAnimation();
      this.b.endViewTransition(this.a);
      this.c.a();
    }
  }
  
  class g implements Runnable {
    g(b this$0, SpecialEffectsController.Operation param1Operation1, SpecialEffectsController.Operation param1Operation2, boolean param1Boolean, b.e.a param1a) {}
    
    public void run() {
      t.f(this.b.f(), this.c.f(), this.d, this.e, false);
    }
  }
  
  class h implements Runnable {
    h(b this$0, v param1v, View param1View, Rect param1Rect) {}
    
    public void run() {
      this.b.k(this.c, this.d);
    }
  }
  
  class i implements Runnable {
    i(b this$0, ArrayList param1ArrayList) {}
    
    public void run() {
      t.A(this.b, 4);
    }
  }
  
  class j implements Runnable {
    j(b this$0, b.m param1m) {}
    
    public void run() {
      this.b.a();
    }
  }
  
  private static class k extends l {
    private boolean c;
    
    private boolean d = false;
    
    private d.d e;
    
    k(SpecialEffectsController.Operation param1Operation, androidx.core.os.b param1b, boolean param1Boolean) {
      super(param1Operation, param1b);
      this.c = param1Boolean;
    }
    
    d.d e(Context param1Context) {
      boolean bool;
      if (this.d)
        return this.e; 
      Fragment fragment = b().f();
      if (b().e() == SpecialEffectsController.Operation.State.c) {
        bool = true;
      } else {
        bool = false;
      } 
      d.d d1 = d.c(param1Context, fragment, bool, this.c);
      this.e = d1;
      this.d = true;
      return d1;
    }
  }
  
  private static class l {
    private final SpecialEffectsController.Operation a;
    
    private final androidx.core.os.b b;
    
    l(SpecialEffectsController.Operation param1Operation, androidx.core.os.b param1b) {
      this.a = param1Operation;
      this.b = param1b;
    }
    
    void a() {
      this.a.d(this.b);
    }
    
    SpecialEffectsController.Operation b() {
      return this.a;
    }
    
    androidx.core.os.b c() {
      return this.b;
    }
    
    boolean d() {
      SpecialEffectsController.Operation.State state1 = SpecialEffectsController.Operation.State.from((this.a.f()).J);
      SpecialEffectsController.Operation.State state2 = this.a.e();
      if (state1 != state2) {
        SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.c;
        return (state1 != state && state2 != state);
      } 
      return true;
    }
  }
  
  private static class m extends l {
    private final Object c;
    
    private final boolean d;
    
    private final Object e;
    
    m(SpecialEffectsController.Operation param1Operation, androidx.core.os.b param1b, boolean param1Boolean1, boolean param1Boolean2) {
      super(param1Operation, param1b);
      if (param1Operation.e() == SpecialEffectsController.Operation.State.c) {
        Object object;
        boolean bool;
        if (param1Boolean1) {
          object = param1Operation.f().N();
        } else {
          object = param1Operation.f().v();
        } 
        this.c = object;
        if (param1Boolean1) {
          bool = param1Operation.f().o();
        } else {
          bool = param1Operation.f().n();
        } 
        this.d = bool;
      } else {
        Object object;
        if (param1Boolean1) {
          object = param1Operation.f().P();
        } else {
          object = param1Operation.f().y();
        } 
        this.c = object;
        this.d = true;
      } 
      if (param1Boolean2) {
        if (param1Boolean1) {
          this.e = param1Operation.f().R();
        } else {
          this.e = param1Operation.f().Q();
        } 
      } else {
        this.e = null;
      } 
    }
    
    private v f(Object param1Object) {
      if (param1Object == null)
        return null; 
      v v = t.b;
      if (v != null && v.e(param1Object))
        return v; 
      v = t.c;
      if (v != null && v.e(param1Object))
        return v; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Transition ");
      stringBuilder.append(param1Object);
      stringBuilder.append(" for fragment ");
      stringBuilder.append(b().f());
      stringBuilder.append(" is not a valid framework Transition or AndroidX Transition");
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    v e() {
      v v1 = f(this.c);
      v v2 = f(this.e);
      if (v1 == null || v2 == null || v1 == v2) {
        if (v1 == null)
          v1 = v2; 
        return v1;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
      stringBuilder.append(b().f());
      stringBuilder.append(" returned Transition ");
      stringBuilder.append(this.c);
      stringBuilder.append(" which uses a different Transition  type than its shared element transition ");
      stringBuilder.append(this.e);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public Object g() {
      return this.e;
    }
    
    Object h() {
      return this.c;
    }
    
    public boolean i() {
      boolean bool;
      if (this.e != null) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    boolean j() {
      return this.d;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */