package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

abstract class k implements p, m, AdapterView.OnItemClickListener {
  private Rect b;
  
  protected static int o(ListAdapter paramListAdapter, ViewGroup paramViewGroup, Context paramContext, int paramInt) {
    byte b = 0;
    int i = View.MeasureSpec.makeMeasureSpec(0, 0);
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int n = paramListAdapter.getCount();
    ViewGroup viewGroup1 = null;
    int i1 = 0;
    int i2 = 0;
    ViewGroup viewGroup2 = paramViewGroup;
    paramViewGroup = viewGroup1;
    while (b < n) {
      FrameLayout frameLayout1;
      int i3 = paramListAdapter.getItemViewType(b);
      int i4 = i2;
      if (i3 != i2) {
        paramViewGroup = null;
        i4 = i3;
      } 
      viewGroup1 = viewGroup2;
      if (viewGroup2 == null)
        frameLayout1 = new FrameLayout(paramContext); 
      View view = paramListAdapter.getView(b, (View)paramViewGroup, (ViewGroup)frameLayout1);
      view.measure(i, j);
      i3 = view.getMeasuredWidth();
      if (i3 >= paramInt)
        return paramInt; 
      i2 = i1;
      if (i3 > i1)
        i2 = i3; 
      b++;
      i1 = i2;
      i2 = i4;
      FrameLayout frameLayout2 = frameLayout1;
    } 
    return i1;
  }
  
  protected static boolean x(g paramg) {
    boolean bool2;
    int i = paramg.size();
    boolean bool1 = false;
    byte b = 0;
    while (true) {
      bool2 = bool1;
      if (b < i) {
        MenuItem menuItem = paramg.getItem(b);
        if (menuItem.isVisible() && menuItem.getIcon() != null) {
          bool2 = true;
          break;
        } 
        b++;
        continue;
      } 
      break;
    } 
    return bool2;
  }
  
  protected static f y(ListAdapter paramListAdapter) {
    return (paramListAdapter instanceof HeaderViewListAdapter) ? (f)((HeaderViewListAdapter)paramListAdapter).getWrappedAdapter() : (f)paramListAdapter;
  }
  
  public boolean e(g paramg, i parami) {
    return false;
  }
  
  public boolean f(g paramg, i parami) {
    return false;
  }
  
  public int getId() {
    return 0;
  }
  
  public void h(Context paramContext, g paramg) {}
  
  public abstract void l(g paramg);
  
  protected boolean m() {
    return true;
  }
  
  public Rect n() {
    return this.b;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {
    ListAdapter listAdapter = (ListAdapter)paramAdapterView.getAdapter();
    g g = (y(listAdapter)).b;
    MenuItem menuItem = (MenuItem)listAdapter.getItem(paramInt);
    if (m()) {
      paramInt = 0;
    } else {
      paramInt = 4;
    } 
    g.O(menuItem, this, paramInt);
  }
  
  public abstract void p(View paramView);
  
  public void q(Rect paramRect) {
    this.b = paramRect;
  }
  
  public abstract void r(boolean paramBoolean);
  
  public abstract void s(int paramInt);
  
  public abstract void t(int paramInt);
  
  public abstract void u(PopupWindow.OnDismissListener paramOnDismissListener);
  
  public abstract void v(boolean paramBoolean);
  
  public abstract void w(int paramInt);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/view/menu/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */