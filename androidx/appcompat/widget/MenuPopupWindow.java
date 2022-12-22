package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import java.lang.reflect.Method;

public class MenuPopupWindow extends ListPopupWindow implements u {
  private static Method K;
  
  private u L;
  
  static {
    try {
      if (Build.VERSION.SDK_INT <= 28)
        K = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[] { boolean.class }); 
    } catch (NoSuchMethodException noSuchMethodException) {
      Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
    } 
  }
  
  public MenuPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public void P(Object paramObject) {
    if (Build.VERSION.SDK_INT >= 23)
      this.J.setEnterTransition((Transition)paramObject); 
  }
  
  public void Q(Object paramObject) {
    if (Build.VERSION.SDK_INT >= 23)
      this.J.setExitTransition((Transition)paramObject); 
  }
  
  public void R(u paramu) {
    this.L = paramu;
  }
  
  public void S(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT <= 28) {
      Method method = K;
      if (method != null)
        try {
          method.invoke(this.J, new Object[] { Boolean.valueOf(paramBoolean) });
        } catch (Exception exception) {
          Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
        }  
    } else {
      this.J.setTouchModal(paramBoolean);
    } 
  }
  
  public void d(g paramg, MenuItem paramMenuItem) {
    u u1 = this.L;
    if (u1 != null)
      u1.d(paramg, paramMenuItem); 
  }
  
  public void g(g paramg, MenuItem paramMenuItem) {
    u u1 = this.L;
    if (u1 != null)
      u1.g(paramg, paramMenuItem); 
  }
  
  r q(Context paramContext, boolean paramBoolean) {
    MenuDropDownListView menuDropDownListView = new MenuDropDownListView(paramContext, paramBoolean);
    menuDropDownListView.setHoverListener(this);
    return menuDropDownListView;
  }
  
  public static class MenuDropDownListView extends r {
    final int p;
    
    final int q;
    
    private u r;
    
    private MenuItem s;
    
    public MenuDropDownListView(Context param1Context, boolean param1Boolean) {
      super(param1Context, param1Boolean);
      Configuration configuration = param1Context.getResources().getConfiguration();
      if (Build.VERSION.SDK_INT >= 17 && 1 == configuration.getLayoutDirection()) {
        this.p = 21;
        this.q = 22;
      } else {
        this.p = 22;
        this.q = 21;
      } 
    }
    
    public boolean onHoverEvent(MotionEvent param1MotionEvent) {
      if (this.r != null) {
        f f;
        int i;
        ListAdapter listAdapter = getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
          HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter)listAdapter;
          i = headerViewListAdapter.getHeadersCount();
          f = (f)headerViewListAdapter.getWrappedAdapter();
        } else {
          i = 0;
          f = f;
        } 
        i i1 = null;
        i i2 = i1;
        if (param1MotionEvent.getAction() != 10) {
          int j = pointToPosition((int)param1MotionEvent.getX(), (int)param1MotionEvent.getY());
          i2 = i1;
          if (j != -1) {
            i = j - i;
            i2 = i1;
            if (i >= 0) {
              i2 = i1;
              if (i < f.getCount())
                i2 = f.c(i); 
            } 
          } 
        } 
        MenuItem menuItem = this.s;
        if (menuItem != i2) {
          g g = f.b();
          if (menuItem != null)
            this.r.g(g, menuItem); 
          this.s = (MenuItem)i2;
          if (i2 != null)
            this.r.d(g, (MenuItem)i2); 
        } 
      } 
      return super.onHoverEvent(param1MotionEvent);
    }
    
    public boolean onKeyDown(int param1Int, KeyEvent param1KeyEvent) {
      f f;
      ListMenuItemView listMenuItemView = (ListMenuItemView)getSelectedView();
      if (listMenuItemView != null && param1Int == this.p) {
        if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu())
          performItemClick((View)listMenuItemView, getSelectedItemPosition(), getSelectedItemId()); 
        return true;
      } 
      if (listMenuItemView != null && param1Int == this.q) {
        setSelection(-1);
        ListAdapter listAdapter = getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
          f = (f)((HeaderViewListAdapter)listAdapter).getWrappedAdapter();
        } else {
          f = f;
        } 
        f.b().e(false);
        return true;
      } 
      return super.onKeyDown(param1Int, (KeyEvent)f);
    }
    
    public void setHoverListener(u param1u) {
      this.r = param1u;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/MenuPopupWindow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */