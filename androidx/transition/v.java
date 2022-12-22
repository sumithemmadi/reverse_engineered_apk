package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import b.h.k.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class v {
  private static Transition a = new AutoTransition();
  
  private static ThreadLocal<WeakReference<b.e.a<ViewGroup, ArrayList<Transition>>>> b = new ThreadLocal<WeakReference<b.e.a<ViewGroup, ArrayList<Transition>>>>();
  
  static ArrayList<ViewGroup> c = new ArrayList<ViewGroup>();
  
  public static void a(ViewGroup paramViewGroup, Transition paramTransition) {
    if (!c.contains(paramViewGroup) && w.V((View)paramViewGroup)) {
      c.add(paramViewGroup);
      Transition transition = paramTransition;
      if (paramTransition == null)
        transition = a; 
      paramTransition = transition.t();
      d(paramViewGroup, paramTransition);
      r.c(paramViewGroup, null);
      c(paramViewGroup, paramTransition);
    } 
  }
  
  static b.e.a<ViewGroup, ArrayList<Transition>> b() {
    WeakReference<b.e.a> weakReference = (WeakReference)b.get();
    if (weakReference != null) {
      b.e.a<ViewGroup, ArrayList<Transition>> a1 = weakReference.get();
      if (a1 != null)
        return a1; 
    } 
    b.e.a<ViewGroup, ArrayList<Transition>> a = new b.e.a();
    weakReference = new WeakReference<b.e.a>(a);
    b.set(weakReference);
    return a;
  }
  
  private static void c(ViewGroup paramViewGroup, Transition paramTransition) {
    if (paramTransition != null && paramViewGroup != null) {
      a a = new a(paramTransition, paramViewGroup);
      paramViewGroup.addOnAttachStateChangeListener(a);
      paramViewGroup.getViewTreeObserver().addOnPreDrawListener(a);
    } 
  }
  
  private static void d(ViewGroup paramViewGroup, Transition paramTransition) {
    ArrayList arrayList = (ArrayList)b().get(paramViewGroup);
    if (arrayList != null && arrayList.size() > 0) {
      Iterator<Transition> iterator = arrayList.iterator();
      while (iterator.hasNext())
        ((Transition)iterator.next()).Y((View)paramViewGroup); 
    } 
    if (paramTransition != null)
      paramTransition.r(paramViewGroup, true); 
    r r = r.b(paramViewGroup);
    if (r != null)
      r.a(); 
  }
  
  private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    Transition b;
    
    ViewGroup c;
    
    a(Transition param1Transition, ViewGroup param1ViewGroup) {
      this.b = param1Transition;
      this.c = param1ViewGroup;
    }
    
    private void a() {
      this.c.getViewTreeObserver().removeOnPreDrawListener(this);
      this.c.removeOnAttachStateChangeListener(this);
    }
    
    public boolean onPreDraw() {
      ArrayList<?> arrayList2;
      a();
      if (!v.c.remove(this.c))
        return true; 
      b.e.a<ViewGroup, ArrayList<Transition>> a1 = v.b();
      ArrayList<?> arrayList1 = (ArrayList)a1.get(this.c);
      ArrayList arrayList = null;
      if (arrayList1 == null) {
        arrayList2 = new ArrayList();
        a1.put(this.c, arrayList2);
      } else {
        arrayList2 = arrayList1;
        if (arrayList1.size() > 0) {
          arrayList = new ArrayList(arrayList1);
          arrayList2 = arrayList1;
        } 
      } 
      arrayList2.add(this.b);
      this.b.a(new a(this, a1));
      this.b.r(this.c, false);
      if (arrayList != null) {
        Iterator<Transition> iterator = arrayList.iterator();
        while (iterator.hasNext())
          ((Transition)iterator.next()).c0((View)this.c); 
      } 
      this.b.Z(this.c);
      return true;
    }
    
    public void onViewAttachedToWindow(View param1View) {}
    
    public void onViewDetachedFromWindow(View param1View) {
      a();
      v.c.remove(this.c);
      ArrayList arrayList = (ArrayList)v.b().get(this.c);
      if (arrayList != null && arrayList.size() > 0) {
        Iterator<Transition> iterator = arrayList.iterator();
        while (iterator.hasNext())
          ((Transition)iterator.next()).c0((View)this.c); 
      } 
      this.b.s(true);
    }
    
    class a extends u {
      a(v.a this$0, b.e.a param2a) {}
      
      public void c(Transition param2Transition) {
        ((ArrayList)this.a.get(this.b.c)).remove(param2Transition);
        param2Transition.a0(this);
      }
    }
  }
  
  class a extends u {
    a(v this$0, b.e.a param1a) {}
    
    public void c(Transition param1Transition) {
      ((ArrayList)this.a.get(this.b.c)).remove(param1Transition);
      param1Transition.a0(this);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */