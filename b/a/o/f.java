package b.a.o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import b.e.g;
import b.h.f.a.b;
import java.util.ArrayList;

public class f extends ActionMode {
  final Context a;
  
  final b b;
  
  public f(Context paramContext, b paramb) {
    this.a = paramContext;
    this.b = paramb;
  }
  
  public void finish() {
    this.b.c();
  }
  
  public View getCustomView() {
    return this.b.d();
  }
  
  public Menu getMenu() {
    return (Menu)new o(this.a, (b.h.f.a.a)this.b.e());
  }
  
  public MenuInflater getMenuInflater() {
    return this.b.f();
  }
  
  public CharSequence getSubtitle() {
    return this.b.g();
  }
  
  public Object getTag() {
    return this.b.h();
  }
  
  public CharSequence getTitle() {
    return this.b.i();
  }
  
  public boolean getTitleOptionalHint() {
    return this.b.j();
  }
  
  public void invalidate() {
    this.b.k();
  }
  
  public boolean isTitleOptional() {
    return this.b.l();
  }
  
  public void setCustomView(View paramView) {
    this.b.m(paramView);
  }
  
  public void setSubtitle(int paramInt) {
    this.b.n(paramInt);
  }
  
  public void setSubtitle(CharSequence paramCharSequence) {
    this.b.o(paramCharSequence);
  }
  
  public void setTag(Object paramObject) {
    this.b.p(paramObject);
  }
  
  public void setTitle(int paramInt) {
    this.b.q(paramInt);
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.b.r(paramCharSequence);
  }
  
  public void setTitleOptionalHint(boolean paramBoolean) {
    this.b.s(paramBoolean);
  }
  
  public static class a implements b.a {
    final ActionMode.Callback a;
    
    final Context b;
    
    final ArrayList<f> c;
    
    final g<Menu, Menu> d;
    
    public a(Context param1Context, ActionMode.Callback param1Callback) {
      this.b = param1Context;
      this.a = param1Callback;
      this.c = new ArrayList<f>();
      this.d = new g();
    }
    
    private Menu f(Menu param1Menu) {
      o o;
      Menu menu1 = (Menu)this.d.get(param1Menu);
      Menu menu2 = menu1;
      if (menu1 == null) {
        o = new o(this.b, (b.h.f.a.a)param1Menu);
        this.d.put(param1Menu, o);
      } 
      return (Menu)o;
    }
    
    public void a(b param1b) {
      this.a.onDestroyActionMode(e(param1b));
    }
    
    public boolean b(b param1b, Menu param1Menu) {
      return this.a.onCreateActionMode(e(param1b), f(param1Menu));
    }
    
    public boolean c(b param1b, Menu param1Menu) {
      return this.a.onPrepareActionMode(e(param1b), f(param1Menu));
    }
    
    public boolean d(b param1b, MenuItem param1MenuItem) {
      return this.a.onActionItemClicked(e(param1b), (MenuItem)new j(this.b, (b)param1MenuItem));
    }
    
    public ActionMode e(b param1b) {
      int i = this.c.size();
      for (byte b1 = 0; b1 < i; b1++) {
        f f1 = this.c.get(b1);
        if (f1 != null && f1.b == param1b)
          return f1; 
      } 
      f f = new f(this.b, param1b);
      this.c.add(f);
      return f;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/a/o/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */