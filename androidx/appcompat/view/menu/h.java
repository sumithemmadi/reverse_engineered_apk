package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.a;
import b.a.g;

class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {
  private g b;
  
  private a c;
  
  e d;
  
  private m.a e;
  
  public h(g paramg) {
    this.b = paramg;
  }
  
  public void a() {
    a a1 = this.c;
    if (a1 != null)
      a1.dismiss(); 
  }
  
  public void b(g paramg, boolean paramBoolean) {
    if (paramBoolean || paramg == this.b)
      a(); 
    m.a a1 = this.e;
    if (a1 != null)
      a1.b(paramg, paramBoolean); 
  }
  
  public boolean c(g paramg) {
    m.a a1 = this.e;
    return (a1 != null) ? a1.c(paramg) : false;
  }
  
  public void d(IBinder paramIBinder) {
    g g1 = this.b;
    a.a a2 = new a.a(g1.w());
    e e1 = new e(a2.b(), g.abc_list_menu_item_layout);
    this.d = e1;
    e1.g(this);
    this.b.b(this.d);
    a2.c(this.d.a(), this);
    View view = g1.A();
    if (view != null) {
      a2.e(view);
    } else {
      a2.f(g1.y()).q(g1.z());
    } 
    a2.l(this);
    a a1 = a2.a();
    this.c = a1;
    a1.setOnDismissListener(this);
    WindowManager.LayoutParams layoutParams = this.c.getWindow().getAttributes();
    layoutParams.type = 1003;
    if (paramIBinder != null)
      layoutParams.token = paramIBinder; 
    layoutParams.flags |= 0x20000;
    this.c.show();
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt) {
    this.b.N((MenuItem)this.d.a().getItem(paramInt), 0);
  }
  
  public void onDismiss(DialogInterface paramDialogInterface) {
    this.d.b(this.b, true);
  }
  
  public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 82 || paramInt == 4) {
      KeyEvent.DispatcherState dispatcherState;
      if (paramKeyEvent.getAction() == 0 && paramKeyEvent.getRepeatCount() == 0) {
        Window window = this.c.getWindow();
        if (window != null) {
          View view = window.getDecorView();
          if (view != null) {
            dispatcherState = view.getKeyDispatcherState();
            if (dispatcherState != null) {
              dispatcherState.startTracking(paramKeyEvent, this);
              return true;
            } 
          } 
        } 
      } else if (paramKeyEvent.getAction() == 1 && !paramKeyEvent.isCanceled()) {
        Window window = this.c.getWindow();
        if (window != null) {
          View view = window.getDecorView();
          if (view != null) {
            KeyEvent.DispatcherState dispatcherState1 = view.getKeyDispatcherState();
            if (dispatcherState1 != null && dispatcherState1.isTracking(paramKeyEvent)) {
              this.b.e(true);
              dispatcherState.dismiss();
              return true;
            } 
          } 
        } 
      } 
    } 
    return this.b.performShortcut(paramInt, paramKeyEvent, 0);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/view/menu/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */