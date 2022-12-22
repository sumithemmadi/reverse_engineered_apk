package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import b.e.g;
import b.h.k.f;

public class ComponentActivity extends Activity implements h, f.a {
  private g<Class<?>, ?> b = new g();
  
  private i c = new i(this);
  
  public Lifecycle a() {
    return (Lifecycle)this.c;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    View view = getWindow().getDecorView();
    return (view != null && f.d(view, paramKeyEvent)) ? true : f.e(this, view, (Window.Callback)this, paramKeyEvent);
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent) {
    View view = getWindow().getDecorView();
    return (view != null && f.d(view, paramKeyEvent)) ? true : super.dispatchKeyShortcutEvent(paramKeyEvent);
  }
  
  public boolean k(KeyEvent paramKeyEvent) {
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  @SuppressLint({"RestrictedApi"})
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    ReportFragment.g(this);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle) {
    this.c.j(Lifecycle.State.d);
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/app/ComponentActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */