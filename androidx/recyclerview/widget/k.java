package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import b.h.k.a;
import b.h.k.f0.c;
import b.h.k.f0.d;
import b.h.k.w;
import java.util.Map;
import java.util.WeakHashMap;

public class k extends a {
  final RecyclerView d;
  
  private final a e;
  
  public k(RecyclerView paramRecyclerView) {
    this.d = paramRecyclerView;
    a a1 = n();
    if (a1 != null && a1 instanceof a) {
      this.e = (a)a1;
    } else {
      this.e = new a(this);
    } 
  }
  
  public void f(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    super.f(paramView, paramAccessibilityEvent);
    if (paramView instanceof RecyclerView && !o()) {
      RecyclerView recyclerView = (RecyclerView)paramView;
      if (recyclerView.getLayoutManager() != null)
        recyclerView.getLayoutManager().K0(paramAccessibilityEvent); 
    } 
  }
  
  public void g(View paramView, c paramc) {
    super.g(paramView, paramc);
    if (!o() && this.d.getLayoutManager() != null)
      this.d.getLayoutManager().M0(paramc); 
  }
  
  public boolean j(View paramView, int paramInt, Bundle paramBundle) {
    return super.j(paramView, paramInt, paramBundle) ? true : ((!o() && this.d.getLayoutManager() != null) ? this.d.getLayoutManager().g1(paramInt, paramBundle) : false);
  }
  
  public a n() {
    return this.e;
  }
  
  boolean o() {
    return this.d.m0();
  }
  
  public static class a extends a {
    final k d;
    
    private Map<View, a> e = new WeakHashMap<View, a>();
    
    public a(k param1k) {
      this.d = param1k;
    }
    
    public boolean a(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      a a1 = this.e.get(param1View);
      return (a1 != null) ? a1.a(param1View, param1AccessibilityEvent) : super.a(param1View, param1AccessibilityEvent);
    }
    
    public d b(View param1View) {
      a a1 = this.e.get(param1View);
      return (a1 != null) ? a1.b(param1View) : super.b(param1View);
    }
    
    public void f(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      a a1 = this.e.get(param1View);
      if (a1 != null) {
        a1.f(param1View, param1AccessibilityEvent);
      } else {
        super.f(param1View, param1AccessibilityEvent);
      } 
    }
    
    public void g(View param1View, c param1c) {
      if (!this.d.o() && this.d.d.getLayoutManager() != null) {
        this.d.d.getLayoutManager().O0(param1View, param1c);
        a a1 = this.e.get(param1View);
        if (a1 != null) {
          a1.g(param1View, param1c);
        } else {
          super.g(param1View, param1c);
        } 
      } else {
        super.g(param1View, param1c);
      } 
    }
    
    public void h(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      a a1 = this.e.get(param1View);
      if (a1 != null) {
        a1.h(param1View, param1AccessibilityEvent);
      } else {
        super.h(param1View, param1AccessibilityEvent);
      } 
    }
    
    public boolean i(ViewGroup param1ViewGroup, View param1View, AccessibilityEvent param1AccessibilityEvent) {
      a a1 = this.e.get(param1ViewGroup);
      return (a1 != null) ? a1.i(param1ViewGroup, param1View, param1AccessibilityEvent) : super.i(param1ViewGroup, param1View, param1AccessibilityEvent);
    }
    
    public boolean j(View param1View, int param1Int, Bundle param1Bundle) {
      if (!this.d.o() && this.d.d.getLayoutManager() != null) {
        a a1 = this.e.get(param1View);
        if (a1 != null) {
          if (a1.j(param1View, param1Int, param1Bundle))
            return true; 
        } else if (super.j(param1View, param1Int, param1Bundle)) {
          return true;
        } 
        return this.d.d.getLayoutManager().i1(param1View, param1Int, param1Bundle);
      } 
      return super.j(param1View, param1Int, param1Bundle);
    }
    
    public void l(View param1View, int param1Int) {
      a a1 = this.e.get(param1View);
      if (a1 != null) {
        a1.l(param1View, param1Int);
      } else {
        super.l(param1View, param1Int);
      } 
    }
    
    public void m(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      a a1 = this.e.get(param1View);
      if (a1 != null) {
        a1.m(param1View, param1AccessibilityEvent);
      } else {
        super.m(param1View, param1AccessibilityEvent);
      } 
    }
    
    a n(View param1View) {
      return this.e.remove(param1View);
    }
    
    void o(View param1View) {
      a a1 = w.l(param1View);
      if (a1 != null && a1 != this)
        this.e.put(param1View, a1); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */