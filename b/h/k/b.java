package b.h.k;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class b {
  private final Context a;
  
  private a b;
  
  private b c;
  
  public b(Context paramContext) {
    this.a = paramContext;
  }
  
  public boolean a() {
    return false;
  }
  
  public boolean b() {
    return true;
  }
  
  public abstract View c();
  
  public View d(MenuItem paramMenuItem) {
    return c();
  }
  
  public boolean e() {
    return false;
  }
  
  public void f(SubMenu paramSubMenu) {}
  
  public boolean g() {
    return false;
  }
  
  public void h() {
    this.c = null;
    this.b = null;
  }
  
  public void i(a parama) {
    this.b = parama;
  }
  
  public void j(b paramb) {
    if (this.c != null && paramb != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
      stringBuilder.append(getClass().getSimpleName());
      stringBuilder.append(" instance while it is still in use somewhere else?");
      Log.w("ActionProvider(support)", stringBuilder.toString());
    } 
    this.c = paramb;
  }
  
  public void k(boolean paramBoolean) {
    a a1 = this.b;
    if (a1 != null)
      a1.a(paramBoolean); 
  }
  
  public static interface a {
    void a(boolean param1Boolean);
  }
  
  public static interface b {
    void onActionProviderVisibilityChanged(boolean param1Boolean);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */