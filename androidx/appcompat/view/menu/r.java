package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class r extends g implements SubMenu {
  private g B;
  
  private i C;
  
  public r(Context paramContext, g paramg, i parami) {
    super(paramContext);
    this.B = paramg;
    this.C = parami;
  }
  
  public g F() {
    return this.B.F();
  }
  
  public boolean H() {
    return this.B.H();
  }
  
  public boolean I() {
    return this.B.I();
  }
  
  public boolean J() {
    return this.B.J();
  }
  
  public void V(g.a parama) {
    this.B.V(parama);
  }
  
  public boolean f(i parami) {
    return this.B.f(parami);
  }
  
  public MenuItem getItem() {
    return (MenuItem)this.C;
  }
  
  boolean h(g paramg, MenuItem paramMenuItem) {
    return (super.h(paramg, paramMenuItem) || this.B.h(paramg, paramMenuItem));
  }
  
  public Menu i0() {
    return (Menu)this.B;
  }
  
  public boolean m(i parami) {
    return this.B.m(parami);
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean) {
    this.B.setGroupDividerEnabled(paramBoolean);
  }
  
  public SubMenu setHeaderIcon(int paramInt) {
    return (SubMenu)Y(paramInt);
  }
  
  public SubMenu setHeaderIcon(Drawable paramDrawable) {
    return (SubMenu)Z(paramDrawable);
  }
  
  public SubMenu setHeaderTitle(int paramInt) {
    return (SubMenu)b0(paramInt);
  }
  
  public SubMenu setHeaderTitle(CharSequence paramCharSequence) {
    return (SubMenu)c0(paramCharSequence);
  }
  
  public SubMenu setHeaderView(View paramView) {
    return (SubMenu)d0(paramView);
  }
  
  public SubMenu setIcon(int paramInt) {
    this.C.setIcon(paramInt);
    return this;
  }
  
  public SubMenu setIcon(Drawable paramDrawable) {
    this.C.setIcon(paramDrawable);
    return this;
  }
  
  public void setQwertyMode(boolean paramBoolean) {
    this.B.setQwertyMode(paramBoolean);
  }
  
  public String v() {
    boolean bool;
    i i1 = this.C;
    if (i1 != null) {
      bool = i1.getItemId();
    } else {
      bool = false;
    } 
    if (!bool)
      return null; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(super.v());
    stringBuilder.append(":");
    stringBuilder.append(bool);
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/view/menu/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */