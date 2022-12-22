package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
class g extends FrameLayout {
  private ViewGroup b;
  
  private boolean c;
  
  g(ViewGroup paramViewGroup) {
    super(paramViewGroup.getContext());
    setClipChildren(false);
    this.b = paramViewGroup;
    paramViewGroup.setTag(p.ghost_view_holder, this);
    e0.b(this.b).c((View)this);
    this.c = true;
  }
  
  static g b(ViewGroup paramViewGroup) {
    return (g)paramViewGroup.getTag(p.ghost_view_holder);
  }
  
  private int c(ArrayList<View> paramArrayList) {
    ArrayList<View> arrayList = new ArrayList();
    int i = getChildCount() - 1;
    int j = 0;
    while (j <= i) {
      int k = (j + i) / 2;
      d(((i)getChildAt(k)).d, arrayList);
      if (f(paramArrayList, arrayList)) {
        j = k + 1;
      } else {
        i = k - 1;
      } 
      arrayList.clear();
    } 
    return j;
  }
  
  private static void d(View paramView, ArrayList<View> paramArrayList) {
    ViewParent viewParent = paramView.getParent();
    if (viewParent instanceof ViewGroup)
      d((View)viewParent, paramArrayList); 
    paramArrayList.add(paramView);
  }
  
  private static boolean e(View paramView1, View paramView2) {
    ViewGroup viewGroup = (ViewGroup)paramView1.getParent();
    int i = viewGroup.getChildCount();
    int j = Build.VERSION.SDK_INT;
    boolean bool1 = false;
    boolean bool2 = false;
    if (j >= 21 && paramView1.getZ() != paramView2.getZ()) {
      if (paramView1.getZ() > paramView2.getZ())
        bool2 = true; 
      return bool2;
    } 
    j = 0;
    while (true) {
      if (j < i) {
        View view = viewGroup.getChildAt(e0.a(viewGroup, j));
        if (view == paramView1) {
          bool2 = bool1;
          break;
        } 
        if (view != paramView2) {
          j++;
          continue;
        } 
      } 
      bool2 = true;
      break;
    } 
    return bool2;
  }
  
  private static boolean f(ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2) {
    boolean bool = paramArrayList1.isEmpty();
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (!bool) {
      bool2 = bool1;
      if (!paramArrayList2.isEmpty())
        if (paramArrayList1.get(0) != paramArrayList2.get(0)) {
          bool2 = bool1;
        } else {
          int i = Math.min(paramArrayList1.size(), paramArrayList2.size());
          for (byte b = 1; b < i; b++) {
            View view1 = paramArrayList1.get(b);
            View view2 = paramArrayList2.get(b);
            if (view1 != view2)
              return e(view1, view2); 
          } 
          if (paramArrayList2.size() == i) {
            bool2 = bool1;
          } else {
            bool2 = false;
          } 
        }  
    } 
    return bool2;
  }
  
  void a(i parami) {
    ArrayList<View> arrayList = new ArrayList();
    d(parami.d, arrayList);
    int j = c(arrayList);
    if (j < 0 || j >= getChildCount()) {
      addView((View)parami);
      return;
    } 
    addView((View)parami, j);
  }
  
  void g() {
    if (this.c) {
      e0.b(this.b).d((View)this);
      e0.b(this.b).c((View)this);
      return;
    } 
    throw new IllegalStateException("This GhostViewHolder is detached!");
  }
  
  public void onViewAdded(View paramView) {
    if (this.c) {
      super.onViewAdded(paramView);
      return;
    } 
    throw new IllegalStateException("This GhostViewHolder is detached!");
  }
  
  public void onViewRemoved(View paramView) {
    super.onViewRemoved(paramView);
    if ((getChildCount() == 1 && getChildAt(0) == paramView) || getChildCount() == 0) {
      this.b.setTag(p.ghost_view_holder, null);
      e0.b(this.b).d((View)this);
      this.c = false;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */