package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b.h.k.t;
import b.h.k.w;
import b.h.k.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
public abstract class v {
  protected static void d(List<View> paramList, View paramView) {
    int i = paramList.size();
    if (h(paramList, paramView, i))
      return; 
    if (w.M(paramView) != null)
      paramList.add(paramView); 
    for (int j = i; j < paramList.size(); j++) {
      paramView = paramList.get(j);
      if (paramView instanceof ViewGroup) {
        ViewGroup viewGroup = (ViewGroup)paramView;
        int k = viewGroup.getChildCount();
        for (byte b = 0; b < k; b++) {
          paramView = viewGroup.getChildAt(b);
          if (!h(paramList, paramView, i) && w.M(paramView) != null)
            paramList.add(paramView); 
        } 
      } 
    } 
  }
  
  private static boolean h(List<View> paramList, View paramView, int paramInt) {
    for (byte b = 0; b < paramInt; b++) {
      if (paramList.get(b) == paramView)
        return true; 
    } 
    return false;
  }
  
  static String i(Map<String, String> paramMap, String paramString) {
    for (Map.Entry<String, String> entry : paramMap.entrySet()) {
      if (paramString.equals(entry.getValue()))
        return (String)entry.getKey(); 
    } 
    return null;
  }
  
  protected static boolean l(List paramList) {
    return (paramList == null || paramList.isEmpty());
  }
  
  public abstract void A(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2);
  
  public abstract Object B(Object paramObject);
  
  public abstract void a(Object paramObject, View paramView);
  
  public abstract void b(Object paramObject, ArrayList<View> paramArrayList);
  
  public abstract void c(ViewGroup paramViewGroup, Object paramObject);
  
  public abstract boolean e(Object paramObject);
  
  void f(ArrayList<View> paramArrayList, View paramView) {
    if (paramView.getVisibility() == 0) {
      ViewGroup viewGroup;
      if (paramView instanceof ViewGroup) {
        viewGroup = (ViewGroup)paramView;
        if (y.a(viewGroup)) {
          paramArrayList.add(viewGroup);
        } else {
          int i = viewGroup.getChildCount();
          for (byte b = 0; b < i; b++)
            f(paramArrayList, viewGroup.getChildAt(b)); 
        } 
      } else {
        paramArrayList.add(viewGroup);
      } 
    } 
  }
  
  public abstract Object g(Object paramObject);
  
  void j(Map<String, View> paramMap, View paramView) {
    if (paramView.getVisibility() == 0) {
      String str = w.M(paramView);
      if (str != null)
        paramMap.put(str, paramView); 
      if (paramView instanceof ViewGroup) {
        ViewGroup viewGroup = (ViewGroup)paramView;
        int i = viewGroup.getChildCount();
        for (byte b = 0; b < i; b++)
          j(paramMap, viewGroup.getChildAt(b)); 
      } 
    } 
  }
  
  protected void k(View paramView, Rect paramRect) {
    if (!w.U(paramView))
      return; 
    RectF rectF = new RectF();
    rectF.set(0.0F, 0.0F, paramView.getWidth(), paramView.getHeight());
    paramView.getMatrix().mapRect(rectF);
    rectF.offset(paramView.getLeft(), paramView.getTop());
    ViewParent viewParent = paramView.getParent();
    while (viewParent instanceof View) {
      View view = (View)viewParent;
      rectF.offset(-view.getScrollX(), -view.getScrollY());
      view.getMatrix().mapRect(rectF);
      rectF.offset(view.getLeft(), view.getTop());
      ViewParent viewParent1 = view.getParent();
    } 
    int[] arrayOfInt = new int[2];
    paramView.getRootView().getLocationOnScreen(arrayOfInt);
    rectF.offset(arrayOfInt[0], arrayOfInt[1]);
    paramRect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
  }
  
  public abstract Object m(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public abstract Object n(Object paramObject1, Object paramObject2, Object paramObject3);
  
  ArrayList<String> o(ArrayList<View> paramArrayList) {
    ArrayList<String> arrayList = new ArrayList();
    int i = paramArrayList.size();
    for (byte b = 0; b < i; b++) {
      View view = paramArrayList.get(b);
      arrayList.add(w.M(view));
      w.J0(view, null);
    } 
    return arrayList;
  }
  
  public abstract void p(Object paramObject, View paramView);
  
  public abstract void q(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2);
  
  public abstract void r(Object paramObject, View paramView, ArrayList<View> paramArrayList);
  
  void s(ViewGroup paramViewGroup, ArrayList<View> paramArrayList, Map<String, String> paramMap) {
    t.a((View)paramViewGroup, new c(this, paramArrayList, paramMap));
  }
  
  public abstract void t(Object paramObject1, Object paramObject2, ArrayList<View> paramArrayList1, Object paramObject3, ArrayList<View> paramArrayList2, Object paramObject4, ArrayList<View> paramArrayList3);
  
  public abstract void u(Object paramObject, Rect paramRect);
  
  public abstract void v(Object paramObject, View paramView);
  
  public void w(Fragment paramFragment, Object paramObject, androidx.core.os.b paramb, Runnable paramRunnable) {
    paramRunnable.run();
  }
  
  void x(View paramView, ArrayList<View> paramArrayList, Map<String, String> paramMap) {
    t.a(paramView, new b(this, paramArrayList, paramMap));
  }
  
  void y(View paramView, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2, ArrayList<String> paramArrayList, Map<String, String> paramMap) {
    int i = paramArrayList2.size();
    ArrayList<String> arrayList = new ArrayList();
    for (byte b = 0; b < i; b++) {
      View view = paramArrayList1.get(b);
      String str = w.M(view);
      arrayList.add(str);
      if (str != null) {
        w.J0(view, null);
        String str1 = paramMap.get(str);
        for (byte b1 = 0; b1 < i; b1++) {
          if (str1.equals(paramArrayList.get(b1))) {
            w.J0(paramArrayList2.get(b1), str);
            break;
          } 
        } 
      } 
    } 
    t.a(paramView, new a(this, i, paramArrayList2, paramArrayList, paramArrayList1, arrayList));
  }
  
  public abstract void z(Object paramObject, View paramView, ArrayList<View> paramArrayList);
  
  class a implements Runnable {
    a(v this$0, int param1Int, ArrayList param1ArrayList1, ArrayList param1ArrayList2, ArrayList param1ArrayList3, ArrayList param1ArrayList4) {}
    
    public void run() {
      for (byte b = 0; b < this.b; b++) {
        w.J0(this.c.get(b), this.d.get(b));
        w.J0(this.e.get(b), this.f.get(b));
      } 
    }
  }
  
  class b implements Runnable {
    b(v this$0, ArrayList param1ArrayList, Map param1Map) {}
    
    public void run() {
      int i = this.b.size();
      for (byte b1 = 0; b1 < i; b1++) {
        View view = this.b.get(b1);
        String str = w.M(view);
        if (str != null)
          w.J0(view, v.i(this.c, str)); 
      } 
    }
  }
  
  class c implements Runnable {
    c(v this$0, ArrayList param1ArrayList, Map param1Map) {}
    
    public void run() {
      int i = this.b.size();
      for (byte b = 0; b < i; b++) {
        View view = this.b.get(b);
        String str = w.M(view);
        w.J0(view, (String)this.c.get(str));
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */