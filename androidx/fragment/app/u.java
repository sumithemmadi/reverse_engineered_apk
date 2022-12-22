package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

class u extends v {
  private static boolean C(Transition paramTransition) {
    return (!v.l(paramTransition.getTargetIds()) || !v.l(paramTransition.getTargetNames()) || !v.l(paramTransition.getTargetTypes()));
  }
  
  public void A(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2) {
    paramObject = paramObject;
    if (paramObject != null) {
      paramObject.getTargets().clear();
      paramObject.getTargets().addAll(paramArrayList2);
      q(paramObject, paramArrayList1, paramArrayList2);
    } 
  }
  
  public Object B(Object paramObject) {
    if (paramObject == null)
      return null; 
    TransitionSet transitionSet = new TransitionSet();
    transitionSet.addTransition((Transition)paramObject);
    return transitionSet;
  }
  
  public void a(Object paramObject, View paramView) {
    if (paramObject != null)
      ((Transition)paramObject).addTarget(paramView); 
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
      i = paramObject.getTransitionCount();
      while (j < i) {
        b(paramObject.getTransitionAt(j), paramArrayList);
        j++;
      } 
    } else if (!C((Transition)paramObject) && v.l(paramObject.getTargets())) {
      int k = paramArrayList.size();
      for (j = i; j < k; j++)
        paramObject.addTarget(paramArrayList.get(j)); 
    } 
  }
  
  public void c(ViewGroup paramViewGroup, Object paramObject) {
    TransitionManager.beginDelayedTransition(paramViewGroup, (Transition)paramObject);
  }
  
  public boolean e(Object paramObject) {
    return paramObject instanceof Transition;
  }
  
  public Object g(Object paramObject) {
    if (paramObject != null) {
      paramObject = ((Transition)paramObject).clone();
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
      paramObject1 = (new TransitionSet()).addTransition((Transition)paramObject1).addTransition((Transition)paramObject2).setOrdering(1);
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
        paramObject2.addTransition((Transition)paramObject1); 
      paramObject2.addTransition((Transition)paramObject3);
      return paramObject2;
    } 
    return paramObject1;
  }
  
  public Object n(Object paramObject1, Object paramObject2, Object paramObject3) {
    TransitionSet transitionSet = new TransitionSet();
    if (paramObject1 != null)
      transitionSet.addTransition((Transition)paramObject1); 
    if (paramObject2 != null)
      transitionSet.addTransition((Transition)paramObject2); 
    if (paramObject3 != null)
      transitionSet.addTransition((Transition)paramObject3); 
    return transitionSet;
  }
  
  public void p(Object paramObject, View paramView) {
    if (paramObject != null)
      ((Transition)paramObject).removeTarget(paramView); 
  }
  
  public void q(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2) {
    paramObject = paramObject;
    boolean bool = paramObject instanceof TransitionSet;
    int i = 0;
    int j = 0;
    if (bool) {
      paramObject = paramObject;
      i = paramObject.getTransitionCount();
      while (j < i) {
        q(paramObject.getTransitionAt(j), paramArrayList1, paramArrayList2);
        j++;
      } 
    } else if (!C((Transition)paramObject)) {
      List list = paramObject.getTargets();
      if (list != null && list.size() == paramArrayList1.size() && list.containsAll(paramArrayList1)) {
        if (paramArrayList2 == null) {
          j = 0;
        } else {
          j = paramArrayList2.size();
        } 
        while (i < j) {
          paramObject.addTarget(paramArrayList2.get(i));
          i++;
        } 
        for (j = paramArrayList1.size() - 1; j >= 0; j--)
          paramObject.removeTarget(paramArrayList1.get(j)); 
      } 
    } 
  }
  
  public void r(Object paramObject, View paramView, ArrayList<View> paramArrayList) {
    ((Transition)paramObject).addListener(new b(this, paramView, paramArrayList));
  }
  
  public void t(Object paramObject1, Object paramObject2, ArrayList<View> paramArrayList1, Object paramObject3, ArrayList<View> paramArrayList2, Object paramObject4, ArrayList<View> paramArrayList3) {
    ((Transition)paramObject1).addListener(new c(this, paramObject2, paramArrayList1, paramObject3, paramArrayList2, paramObject4, paramArrayList3));
  }
  
  public void u(Object paramObject, Rect paramRect) {
    if (paramObject != null)
      ((Transition)paramObject).setEpicenterCallback(new e(this, paramRect)); 
  }
  
  public void v(Object paramObject, View paramView) {
    if (paramView != null) {
      Transition transition = (Transition)paramObject;
      paramObject = new Rect();
      k(paramView, (Rect)paramObject);
      transition.setEpicenterCallback(new a(this, (Rect)paramObject));
    } 
  }
  
  public void w(Fragment paramFragment, Object paramObject, androidx.core.os.b paramb, Runnable paramRunnable) {
    ((Transition)paramObject).addListener(new d(this, paramRunnable));
  }
  
  public void z(Object paramObject, View paramView, ArrayList<View> paramArrayList) {
    TransitionSet transitionSet = (TransitionSet)paramObject;
    paramObject = transitionSet.getTargets();
    paramObject.clear();
    int i = paramArrayList.size();
    for (byte b = 0; b < i; b++)
      v.d((List<View>)paramObject, paramArrayList.get(b)); 
    paramObject.add(paramView);
    paramArrayList.add(paramView);
    b(transitionSet, paramArrayList);
  }
  
  class a extends Transition.EpicenterCallback {
    a(u this$0, Rect param1Rect) {}
    
    public Rect onGetEpicenter(Transition param1Transition) {
      return this.a;
    }
  }
  
  class b implements Transition.TransitionListener {
    b(u this$0, View param1View, ArrayList param1ArrayList) {}
    
    public void onTransitionCancel(Transition param1Transition) {}
    
    public void onTransitionEnd(Transition param1Transition) {
      param1Transition.removeListener(this);
      this.a.setVisibility(8);
      int i = this.b.size();
      for (byte b1 = 0; b1 < i; b1++)
        ((View)this.b.get(b1)).setVisibility(0); 
    }
    
    public void onTransitionPause(Transition param1Transition) {}
    
    public void onTransitionResume(Transition param1Transition) {}
    
    public void onTransitionStart(Transition param1Transition) {
      param1Transition.removeListener(this);
      param1Transition.addListener(this);
    }
  }
  
  class c implements Transition.TransitionListener {
    c(u this$0, Object param1Object1, ArrayList param1ArrayList1, Object param1Object2, ArrayList param1ArrayList2, Object param1Object3, ArrayList param1ArrayList3) {}
    
    public void onTransitionCancel(Transition param1Transition) {}
    
    public void onTransitionEnd(Transition param1Transition) {
      param1Transition.removeListener(this);
    }
    
    public void onTransitionPause(Transition param1Transition) {}
    
    public void onTransitionResume(Transition param1Transition) {}
    
    public void onTransitionStart(Transition param1Transition) {
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
  }
  
  class d implements Transition.TransitionListener {
    d(u this$0, Runnable param1Runnable) {}
    
    public void onTransitionCancel(Transition param1Transition) {}
    
    public void onTransitionEnd(Transition param1Transition) {
      this.a.run();
    }
    
    public void onTransitionPause(Transition param1Transition) {}
    
    public void onTransitionResume(Transition param1Transition) {}
    
    public void onTransitionStart(Transition param1Transition) {}
  }
  
  class e extends Transition.EpicenterCallback {
    e(u this$0, Rect param1Rect) {}
    
    public Rect onGetEpicenter(Transition param1Transition) {
      Rect rect = this.a;
      return (rect == null || rect.isEmpty()) ? null : this.a;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */