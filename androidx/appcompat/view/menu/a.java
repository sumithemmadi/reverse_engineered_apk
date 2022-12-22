package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import b.h.f.a.b;
import b.h.k.b;

public class a implements b {
  private final int a;
  
  private final int b;
  
  private final int c;
  
  private CharSequence d;
  
  private CharSequence e;
  
  private Intent f;
  
  private char g;
  
  private int h = 4096;
  
  private char i;
  
  private int j = 4096;
  
  private Drawable k;
  
  private Context l;
  
  private MenuItem.OnMenuItemClickListener m;
  
  private CharSequence n;
  
  private CharSequence o;
  
  private ColorStateList p = null;
  
  private PorterDuff.Mode q = null;
  
  private boolean r = false;
  
  private boolean s = false;
  
  private int t = 16;
  
  public a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence) {
    this.l = paramContext;
    this.a = paramInt2;
    this.b = paramInt1;
    this.c = paramInt4;
    this.d = paramCharSequence;
  }
  
  private void c() {
    Drawable drawable = this.k;
    if (drawable != null && (this.r || this.s)) {
      drawable = androidx.core.graphics.drawable.a.r(drawable);
      this.k = drawable;
      drawable = drawable.mutate();
      this.k = drawable;
      if (this.r)
        androidx.core.graphics.drawable.a.o(drawable, this.p); 
      if (this.s)
        androidx.core.graphics.drawable.a.p(this.k, this.q); 
    } 
  }
  
  public b a(b paramb) {
    throw new UnsupportedOperationException();
  }
  
  public b b() {
    return null;
  }
  
  public boolean collapseActionView() {
    return false;
  }
  
  public b d(int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  public b e(View paramView) {
    throw new UnsupportedOperationException();
  }
  
  public boolean expandActionView() {
    return false;
  }
  
  public b f(int paramInt) {
    setShowAsAction(paramInt);
    return this;
  }
  
  public ActionProvider getActionProvider() {
    throw new UnsupportedOperationException();
  }
  
  public View getActionView() {
    return null;
  }
  
  public int getAlphabeticModifiers() {
    return this.j;
  }
  
  public char getAlphabeticShortcut() {
    return this.i;
  }
  
  public CharSequence getContentDescription() {
    return this.n;
  }
  
  public int getGroupId() {
    return this.b;
  }
  
  public Drawable getIcon() {
    return this.k;
  }
  
  public ColorStateList getIconTintList() {
    return this.p;
  }
  
  public PorterDuff.Mode getIconTintMode() {
    return this.q;
  }
  
  public Intent getIntent() {
    return this.f;
  }
  
  public int getItemId() {
    return this.a;
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo() {
    return null;
  }
  
  public int getNumericModifiers() {
    return this.h;
  }
  
  public char getNumericShortcut() {
    return this.g;
  }
  
  public int getOrder() {
    return this.c;
  }
  
  public SubMenu getSubMenu() {
    return null;
  }
  
  public CharSequence getTitle() {
    return this.d;
  }
  
  public CharSequence getTitleCondensed() {
    CharSequence charSequence = this.e;
    if (charSequence == null)
      charSequence = this.d; 
    return charSequence;
  }
  
  public CharSequence getTooltipText() {
    return this.o;
  }
  
  public boolean hasSubMenu() {
    return false;
  }
  
  public boolean isActionViewExpanded() {
    return false;
  }
  
  public boolean isCheckable() {
    int i = this.t;
    boolean bool = true;
    if ((i & 0x1) == 0)
      bool = false; 
    return bool;
  }
  
  public boolean isChecked() {
    boolean bool;
    if ((this.t & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean isEnabled() {
    boolean bool;
    if ((this.t & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean isVisible() {
    boolean bool;
    if ((this.t & 0x8) == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider) {
    throw new UnsupportedOperationException();
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar) {
    this.i = Character.toLowerCase(paramChar);
    return (MenuItem)this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt) {
    this.i = Character.toLowerCase(paramChar);
    this.j = KeyEvent.normalizeMetaState(paramInt);
    return (MenuItem)this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean) {
    this.t = paramBoolean | this.t & 0xFFFFFFFE;
    return (MenuItem)this;
  }
  
  public MenuItem setChecked(boolean paramBoolean) {
    boolean bool;
    int i = this.t;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    this.t = bool | i & 0xFFFFFFFD;
    return (MenuItem)this;
  }
  
  public b setContentDescription(CharSequence paramCharSequence) {
    this.n = paramCharSequence;
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean) {
    boolean bool;
    int i = this.t;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    this.t = bool | i & 0xFFFFFFEF;
    return (MenuItem)this;
  }
  
  public MenuItem setIcon(int paramInt) {
    this.k = androidx.core.content.a.f(this.l, paramInt);
    c();
    return (MenuItem)this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable) {
    this.k = paramDrawable;
    c();
    return (MenuItem)this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList) {
    this.p = paramColorStateList;
    this.r = true;
    c();
    return (MenuItem)this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode) {
    this.q = paramMode;
    this.s = true;
    c();
    return (MenuItem)this;
  }
  
  public MenuItem setIntent(Intent paramIntent) {
    this.f = paramIntent;
    return (MenuItem)this;
  }
  
  public MenuItem setNumericShortcut(char paramChar) {
    this.g = (char)paramChar;
    return (MenuItem)this;
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt) {
    this.g = (char)paramChar;
    this.h = KeyEvent.normalizeMetaState(paramInt);
    return (MenuItem)this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener) {
    throw new UnsupportedOperationException();
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener) {
    this.m = paramOnMenuItemClickListener;
    return (MenuItem)this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2) {
    this.g = (char)paramChar1;
    this.i = Character.toLowerCase(paramChar2);
    return (MenuItem)this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2) {
    this.g = (char)paramChar1;
    this.h = KeyEvent.normalizeMetaState(paramInt1);
    this.i = Character.toLowerCase(paramChar2);
    this.j = KeyEvent.normalizeMetaState(paramInt2);
    return (MenuItem)this;
  }
  
  public void setShowAsAction(int paramInt) {}
  
  public MenuItem setTitle(int paramInt) {
    this.d = this.l.getResources().getString(paramInt);
    return (MenuItem)this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence) {
    this.d = paramCharSequence;
    return (MenuItem)this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence) {
    this.e = paramCharSequence;
    return (MenuItem)this;
  }
  
  public b setTooltipText(CharSequence paramCharSequence) {
    this.o = paramCharSequence;
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean) {
    int i = this.t;
    byte b1 = 8;
    if (paramBoolean)
      b1 = 0; 
    this.t = i & 0x8 | b1;
    return (MenuItem)this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/view/menu/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */