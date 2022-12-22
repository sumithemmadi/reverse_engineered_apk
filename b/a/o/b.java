package b.a.o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class b {
  private Object b;
  
  private boolean c;
  
  public abstract void c();
  
  public abstract View d();
  
  public abstract Menu e();
  
  public abstract MenuInflater f();
  
  public abstract CharSequence g();
  
  public Object h() {
    return this.b;
  }
  
  public abstract CharSequence i();
  
  public boolean j() {
    return this.c;
  }
  
  public abstract void k();
  
  public abstract boolean l();
  
  public abstract void m(View paramView);
  
  public abstract void n(int paramInt);
  
  public abstract void o(CharSequence paramCharSequence);
  
  public void p(Object paramObject) {
    this.b = paramObject;
  }
  
  public abstract void q(int paramInt);
  
  public abstract void r(CharSequence paramCharSequence);
  
  public void s(boolean paramBoolean) {
    this.c = paramBoolean;
  }
  
  public static interface a {
    void a(b param1b);
    
    boolean b(b param1b, Menu param1Menu);
    
    boolean c(b param1b, Menu param1Menu);
    
    boolean d(b param1b, MenuItem param1MenuItem);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/a/o/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */