package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import b.e.g;
import b.h.f.a.b;

abstract class c {
  final Context a;
  
  private g<b, MenuItem> b;
  
  private g<b.h.f.a.c, SubMenu> c;
  
  c(Context paramContext) {
    this.a = paramContext;
  }
  
  final MenuItem c(MenuItem paramMenuItem) {
    MenuItem menuItem = paramMenuItem;
    if (paramMenuItem instanceof b) {
      b b = (b)paramMenuItem;
      if (this.b == null)
        this.b = new g(); 
      paramMenuItem = (MenuItem)this.b.get(paramMenuItem);
      menuItem = paramMenuItem;
      if (paramMenuItem == null) {
        menuItem = new j(this.a, b);
        this.b.put(b, menuItem);
      } 
    } 
    return menuItem;
  }
  
  final SubMenu d(SubMenu paramSubMenu) {
    if (paramSubMenu instanceof b.h.f.a.c) {
      b.h.f.a.c c1 = (b.h.f.a.c)paramSubMenu;
      if (this.c == null)
        this.c = new g(); 
      SubMenu subMenu = (SubMenu)this.c.get(c1);
      paramSubMenu = subMenu;
      if (subMenu == null) {
        paramSubMenu = new s(this.a, c1);
        this.c.put(c1, paramSubMenu);
      } 
      return paramSubMenu;
    } 
    return paramSubMenu;
  }
  
  final void e() {
    g<b, MenuItem> g2 = this.b;
    if (g2 != null)
      g2.clear(); 
    g<b.h.f.a.c, SubMenu> g1 = this.c;
    if (g1 != null)
      g1.clear(); 
  }
  
  final void f(int paramInt) {
    if (this.b == null)
      return; 
    for (int i = 0; i < this.b.size(); i = j + 1) {
      int j = i;
      if (((b)this.b.i(i)).getGroupId() == paramInt) {
        this.b.k(i);
        j = i - 1;
      } 
    } 
  }
  
  final void g(int paramInt) {
    if (this.b == null)
      return; 
    for (byte b = 0; b < this.b.size(); b++) {
      if (((b)this.b.i(b)).getItemId() == paramInt) {
        this.b.k(b);
        break;
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/view/menu/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */