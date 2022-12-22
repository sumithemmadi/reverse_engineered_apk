package com.allinone.callerid.b;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.a;
import java.util.List;

public class p extends a {
  private List<View> c;
  
  public p(List<View> paramList) {
    this.c = paramList;
  }
  
  public void b(ViewGroup paramViewGroup, int paramInt, Object paramObject) {}
  
  public int e() {
    boolean bool;
    if (this.c.size() > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public Object j(ViewGroup paramViewGroup, int paramInt) {
    int i = this.c.size();
    View view = this.c.get(paramInt % i);
    ViewParent viewParent = view.getParent();
    if (viewParent != null)
      ((ViewGroup)viewParent).removeView(view); 
    paramViewGroup.addView(view);
    return view;
  }
  
  public boolean k(View paramView, Object paramObject) {
    boolean bool;
    if (paramView == (View)paramObject) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */