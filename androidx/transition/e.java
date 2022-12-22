package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.v;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
public class e extends v {
  private static boolean C(Transition paramTransition) {
    return (!v.l(paramTransition.I()) || !v.l(paramTransition.J()) || !v.l(paramTransition.K()));
  }
  
  public void A(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2) {
    paramObject = paramObject;
    if (paramObject != null) {
      paramObject.L().clear();
      paramObject.L().addAll(paramArrayList2);
      q(paramObject, paramArrayList1, paramArrayList2);
    } 
  }
  
  public Object B(Object paramObject) {
    if (paramObject == null)
      return null; 
    TransitionSet transitionSet = new TransitionSet();
    transitionSet.q0((Transition)paramObject);
    return transitionSet;
  }
  
  public void a(Object paramObject, View paramView) {
    if (paramObject != null)
      ((Transition)paramObject).b(paramView); 
  }
  
  public void b(Object paramObject, ArrayList<View> paramArrayList) {
    paramObject = paramObject;
    if (paramObject == null)
      return; 
    boolean bool = paramObject instanceof TransitionSet;
    int i = 0;
    int j = 0;
    if (bool) {
      paramObject = paramObject;
      i = paramObject.t0();
      while (j < i) {
        b(paramObject.s0(j), paramArrayList);
        j++;
      } 
    } else if (!C((Transition)paramObject) && v.l(paramObject.L())) {
      int k = paramArrayList.size();
      for (j = i; j < k; j++)
        paramObject.b(paramArrayList.get(j)); 
    } 
  }
  
  public void c(ViewGroup paramViewGroup, Object paramObject) {
    v.a(paramViewGroup, (Transition)paramObject);
  }
  
  public boolean e(Object paramObject) {
    return paramObject instanceof Transition;
  }
  
  public Object g(Object paramObject) {
    if (paramObject != null) {
      paramObject = ((Transition)paramObject).t();
    } else {
      paramObject = null;
    } 
    return paramObject;
  }
  
  public Object m(Object paramObject1, Object paramObject2, Object paramObject3) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    paramObject3 = paramObject3;
    if (paramObject1 != null && paramObject2 != null) {
      paramObject1 = (new TransitionSet()).q0((Transition)paramObject1).q0((Transition)paramObject2).y0(1);
    } else if (paramObject1 == null) {
      if (paramObject2 != null) {
        paramObject1 = paramObject2;
      } else {
        paramObject1 = null;
      } 
    } 
    if (paramObject3 != null) {
      paramObject2 = new TransitionSet();
      if (paramObject1 != null)
        paramObject2.q0((Transition)paramObject1); 
      paramObject2.q0((Transition)paramObject3);
      return paramObject2;
    } 
    return paramObject1;
  }
  
  public Object n(Object paramObject1, Object paramObject2, Object paramObject3) {
    TransitionSet transitionSet = new TransitionSet();
    if (paramObject1 != null)
      transitionSet.q0((Transition)paramObject1); 
    if (paramObject2 != null)
      transitionSet.q0((Transition)paramObject2); 
    if (paramObject3 != null)
      transitionSet.q0((Transition)paramObject3); 
    return transitionSet;
  }
  
  public void p(Object paramObject, View paramView) {
    if (paramObject != null)
      ((Transition)paramObject).b0(paramView); 
  }
  
  public void q(Object<View> paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2) {
    Transition transition = (Transition)paramObject;
    boolean bool = transition instanceof TransitionSet;
    int i = 0;
    int j = 0;
    if (bool) {
      paramObject = (Object<View>)transition;
      i = paramObject.t0();
      while (j < i) {
        q(paramObject.s0(j), paramArrayList1, paramArrayList2);
        j++;
      } 
    } else if (!C(transition)) {
      paramObject = (Object<View>)transition.L();
      if (paramObject.size() == paramArrayList1.size() && paramObject.containsAll(paramArrayList1)) {
        if (paramArrayList2 == null) {
          j = 0;
        } else {
          j = paramArrayList2.size();
        } 
        while (i < j) {
          transition.b(paramArrayList2.get(i));
          i++;
        } 
        for (j = paramArrayList1.size() - 1; j >= 0; j--)
          transition.b0(paramArrayList1.get(j)); 
      } 
    } 
  }
  
  public void r(Object paramObject, View paramView, ArrayList<View> paramArrayList) {
    ((Transition)paramObject).a(new b(this, paramView, paramArrayList));
  }
  
  public void t(Object paramObject1, Object paramObject2, ArrayList<View> paramArrayList1, Object paramObject3, ArrayList<View> paramArrayList2, Object paramObject4, ArrayList<View> paramArrayList3) {
    ((Transition)paramObject1).a(new c(this, paramObject2, paramArrayList1, paramObject3, paramArrayList2, paramObject4, paramArrayList3));
  }
  
  public void u(Object paramObject, Rect paramRect) {
    if (paramObject != null)
      ((Transition)paramObject).g0(new d(this, paramRect)); 
  }
  
  public void v(Object paramObject, View paramView) {
    if (paramView != null) {
      Transition transition = (Transition)paramObject;
      paramObject = new Rect();
      k(paramView, (Rect)paramObject);
      transition.g0(new a(this, (Rect)paramObject));
    } 
  }
  
  public void z(Object paramObject, View paramView, ArrayList<View> paramArrayList) {
    paramObject = paramObject;
    List<View> list = paramObject.L();
    list.clear();
    int i = paramArrayList.size();
    for (byte b = 0; b < i; b++)
      v.d(list, paramArrayList.get(b)); 
    list.add(paramView);
    paramArrayList.add(paramView);
    b(paramObject, paramArrayList);
  }
  
  class a extends Transition.e {
    a(e this$0, Rect param1Rect) {}
    
    public Rect a(Transition param1Transition) {
      return this.a;
    }
  }
  
  class b implements Transition.f {
    b(e this$0, View param1View, ArrayList param1ArrayList) {}
    
    public void a(Transition param1Transition) {}
    
    public void b(Transition param1Transition) {}
    
    public void c(Transition param1Transition) {
      param1Transition.a0(this);
      this.a.setVisibility(8);
      int i = this.b.size();
      for (byte b1 = 0; b1 < i; b1++)
        ((View)this.b.get(b1)).setVisibility(0); 
    }
    
    public void d(Transition param1Transition) {}
    
    public void e(Transition param1Transition) {}
  }
  
  class c extends u {
    c(e this$0, Object param1Object1, ArrayList param1ArrayList1, Object param1Object2, ArrayList param1ArrayList2, Object param1Object3, ArrayList param1ArrayList3) {}
    
    public void a(Transition param1Transition) {
      Object object = this.a;
      if (object != null)
        this.g.q(object, this.b, null); 
      object = this.c;
      if (object != null)
        this.g.q(object, this.d, null); 
      object = this.e;
      if (object != null)
        this.g.q(object, this.f, null); 
    }
    
    public void c(Transition param1Transition) {
      param1Transition.a0(this);
    }
  }
  
  class d extends Transition.e {
    d(e this$0, Rect param1Rect) {}
    
    public Rect a(Transition param1Transition) {
      Rect rect = this.a;
      return (rect == null || rect.isEmpty()) ? null : this.a;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */