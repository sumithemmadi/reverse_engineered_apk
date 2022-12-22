package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import b.h.f.a.a;
import b.h.f.a.c;

class s extends o implements SubMenu {
  private final c e;
  
  s(Context paramContext, c paramc) {
    super(paramContext, (a)paramc);
    this.e = paramc;
  }
  
  public void clearHeader() {
    this.e.clearHeader();
  }
  
  public MenuItem getItem() {
    return c(this.e.getItem());
  }
  
  public SubMenu setHeaderIcon(int paramInt) {
    this.e.setHeaderIcon(paramInt);
    return this;
  }
  
  public SubMenu setHeaderIcon(Drawable paramDrawable) {
    this.e.setHeaderIcon(paramDrawable);
    return this;
  }
  
  public SubMenu setHeaderTitle(int paramInt) {
    this.e.setHeaderTitle(paramInt);
    return this;
  }
  
  public SubMenu setHeaderTitle(CharSequence paramCharSequence) {
    this.e.setHeaderTitle(paramCharSequence);
    return this;
  }
  
  public SubMenu setHeaderView(View paramView) {
    this.e.setHeaderView(paramView);
    return this;
  }
  
  public SubMenu setIcon(int paramInt) {
    this.e.setIcon(paramInt);
    return this;
  }
  
  public SubMenu setIcon(Drawable paramDrawable) {
    this.e.setIcon(paramDrawable);
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/view/menu/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */