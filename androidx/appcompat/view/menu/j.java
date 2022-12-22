package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

public class j extends c implements MenuItem {
  private final b.h.f.a.b d;
  
  private Method e;
  
  public j(Context paramContext, b.h.f.a.b paramb) {
    super(paramContext);
    if (paramb != null) {
      this.d = paramb;
      return;
    } 
    throw new IllegalArgumentException("Wrapped Object can not be null.");
  }
  
  public boolean collapseActionView() {
    return this.d.collapseActionView();
  }
  
  public boolean expandActionView() {
    return this.d.expandActionView();
  }
  
  public ActionProvider getActionProvider() {
    b.h.k.b b1 = this.d.b();
    return (b1 instanceof a) ? ((a)b1).d : null;
  }
  
  public View getActionView() {
    View view1 = this.d.getActionView();
    View view2 = view1;
    if (view1 instanceof c)
      view2 = ((c)view1).a(); 
    return view2;
  }
  
  public int getAlphabeticModifiers() {
    return this.d.getAlphabeticModifiers();
  }
  
  public char getAlphabeticShortcut() {
    return this.d.getAlphabeticShortcut();
  }
  
  public CharSequence getContentDescription() {
    return this.d.getContentDescription();
  }
  
  public int getGroupId() {
    return this.d.getGroupId();
  }
  
  public Drawable getIcon() {
    return this.d.getIcon();
  }
  
  public ColorStateList getIconTintList() {
    return this.d.getIconTintList();
  }
  
  public PorterDuff.Mode getIconTintMode() {
    return this.d.getIconTintMode();
  }
  
  public Intent getIntent() {
    return this.d.getIntent();
  }
  
  public int getItemId() {
    return this.d.getItemId();
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo() {
    return this.d.getMenuInfo();
  }
  
  public int getNumericModifiers() {
    return this.d.getNumericModifiers();
  }
  
  public char getNumericShortcut() {
    return this.d.getNumericShortcut();
  }
  
  public int getOrder() {
    return this.d.getOrder();
  }
  
  public SubMenu getSubMenu() {
    return d(this.d.getSubMenu());
  }
  
  public CharSequence getTitle() {
    return this.d.getTitle();
  }
  
  public CharSequence getTitleCondensed() {
    return this.d.getTitleCondensed();
  }
  
  public CharSequence getTooltipText() {
    return this.d.getTooltipText();
  }
  
  public void h(boolean paramBoolean) {
    try {
      if (this.e == null)
        this.e = this.d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] { boolean.class }); 
      this.e.invoke(this.d, new Object[] { Boolean.valueOf(paramBoolean) });
    } catch (Exception exception) {
      Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", exception);
    } 
  }
  
  public boolean hasSubMenu() {
    return this.d.hasSubMenu();
  }
  
  public boolean isActionViewExpanded() {
    return this.d.isActionViewExpanded();
  }
  
  public boolean isCheckable() {
    return this.d.isCheckable();
  }
  
  public boolean isChecked() {
    return this.d.isChecked();
  }
  
  public boolean isEnabled() {
    return this.d.isEnabled();
  }
  
  public boolean isVisible() {
    return this.d.isVisible();
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider) {
    b.h.k.b b1;
    if (Build.VERSION.SDK_INT >= 16) {
      b1 = new b(this, this.a, paramActionProvider);
    } else {
      b1 = new a(this, this.a, paramActionProvider);
    } 
    b.h.f.a.b b2 = this.d;
    if (paramActionProvider == null)
      b1 = null; 
    b2.a(b1);
    return this;
  }
  
  public MenuItem setActionView(int paramInt) {
    this.d.setActionView(paramInt);
    View view = this.d.getActionView();
    if (view instanceof CollapsibleActionView)
      this.d.setActionView((View)new c(view)); 
    return this;
  }
  
  public MenuItem setActionView(View paramView) {
    c c1;
    View view = paramView;
    if (paramView instanceof CollapsibleActionView)
      c1 = new c(paramView); 
    this.d.setActionView((View)c1);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar) {
    this.d.setAlphabeticShortcut(paramChar);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt) {
    this.d.setAlphabeticShortcut(paramChar, paramInt);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean) {
    this.d.setCheckable(paramBoolean);
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean) {
    this.d.setChecked(paramBoolean);
    return this;
  }
  
  public MenuItem setContentDescription(CharSequence paramCharSequence) {
    this.d.setContentDescription(paramCharSequence);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean) {
    this.d.setEnabled(paramBoolean);
    return this;
  }
  
  public MenuItem setIcon(int paramInt) {
    this.d.setIcon(paramInt);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable) {
    this.d.setIcon(paramDrawable);
    return this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList) {
    this.d.setIconTintList(paramColorStateList);
    return this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode) {
    this.d.setIconTintMode(paramMode);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent) {
    this.d.setIntent(paramIntent);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar) {
    this.d.setNumericShortcut(paramChar);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt) {
    this.d.setNumericShortcut(paramChar, paramInt);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener) {
    b.h.f.a.b b1 = this.d;
    if (paramOnActionExpandListener != null) {
      paramOnActionExpandListener = new d(this, paramOnActionExpandListener);
    } else {
      paramOnActionExpandListener = null;
    } 
    b1.setOnActionExpandListener(paramOnActionExpandListener);
    return this;
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener) {
    b.h.f.a.b b1 = this.d;
    if (paramOnMenuItemClickListener != null) {
      paramOnMenuItemClickListener = new e(this, paramOnMenuItemClickListener);
    } else {
      paramOnMenuItemClickListener = null;
    } 
    b1.setOnMenuItemClickListener(paramOnMenuItemClickListener);
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2) {
    this.d.setShortcut(paramChar1, paramChar2);
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2) {
    this.d.setShortcut(paramChar1, paramChar2, paramInt1, paramInt2);
    return this;
  }
  
  public void setShowAsAction(int paramInt) {
    this.d.setShowAsAction(paramInt);
  }
  
  public MenuItem setShowAsActionFlags(int paramInt) {
    this.d.setShowAsActionFlags(paramInt);
    return this;
  }
  
  public MenuItem setTitle(int paramInt) {
    this.d.setTitle(paramInt);
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence) {
    this.d.setTitle(paramCharSequence);
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence) {
    this.d.setTitleCondensed(paramCharSequence);
    return this;
  }
  
  public MenuItem setTooltipText(CharSequence paramCharSequence) {
    this.d.setTooltipText(paramCharSequence);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean) {
    return this.d.setVisible(paramBoolean);
  }
  
  private class a extends b.h.k.b {
    final ActionProvider d;
    
    a(j this$0, Context param1Context, ActionProvider param1ActionProvider) {
      super(param1Context);
      this.d = param1ActionProvider;
    }
    
    public boolean a() {
      return this.d.hasSubMenu();
    }
    
    public View c() {
      return this.d.onCreateActionView();
    }
    
    public boolean e() {
      return this.d.onPerformDefaultAction();
    }
    
    public void f(SubMenu param1SubMenu) {
      this.d.onPrepareSubMenu(this.e.d(param1SubMenu));
    }
  }
  
  private class b extends a implements ActionProvider.VisibilityListener {
    private b.h.k.b.b f;
    
    b(j this$0, Context param1Context, ActionProvider param1ActionProvider) {
      super(this$0, param1Context, param1ActionProvider);
    }
    
    public boolean b() {
      return this.d.isVisible();
    }
    
    public View d(MenuItem param1MenuItem) {
      return this.d.onCreateActionView(param1MenuItem);
    }
    
    public boolean g() {
      return this.d.overridesItemVisibility();
    }
    
    public void j(b.h.k.b.b param1b) {
      this.f = param1b;
      ActionProvider actionProvider = this.d;
      if (param1b != null) {
        b b1 = this;
      } else {
        param1b = null;
      } 
      actionProvider.setVisibilityListener((ActionProvider.VisibilityListener)param1b);
    }
    
    public void onActionProviderVisibilityChanged(boolean param1Boolean) {
      b.h.k.b.b b1 = this.f;
      if (b1 != null)
        b1.onActionProviderVisibilityChanged(param1Boolean); 
    }
  }
  
  static class c extends FrameLayout implements b.a.o.c {
    final CollapsibleActionView b;
    
    c(View param1View) {
      super(param1View.getContext());
      this.b = (CollapsibleActionView)param1View;
      addView(param1View);
    }
    
    View a() {
      return (View)this.b;
    }
    
    public void c() {
      this.b.onActionViewExpanded();
    }
    
    public void f() {
      this.b.onActionViewCollapsed();
    }
  }
  
  private class d implements MenuItem.OnActionExpandListener {
    private final MenuItem.OnActionExpandListener a;
    
    d(j this$0, MenuItem.OnActionExpandListener param1OnActionExpandListener) {
      this.a = param1OnActionExpandListener;
    }
    
    public boolean onMenuItemActionCollapse(MenuItem param1MenuItem) {
      return this.a.onMenuItemActionCollapse(this.b.c(param1MenuItem));
    }
    
    public boolean onMenuItemActionExpand(MenuItem param1MenuItem) {
      return this.a.onMenuItemActionExpand(this.b.c(param1MenuItem));
    }
  }
  
  private class e implements MenuItem.OnMenuItemClickListener {
    private final MenuItem.OnMenuItemClickListener a;
    
    e(j this$0, MenuItem.OnMenuItemClickListener param1OnMenuItemClickListener) {
      this.a = param1OnMenuItemClickListener;
    }
    
    public boolean onMenuItemClick(MenuItem param1MenuItem) {
      return this.a.onMenuItemClick(this.b.c(param1MenuItem));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/view/menu/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */