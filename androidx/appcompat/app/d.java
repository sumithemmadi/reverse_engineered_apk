package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import b.a.o.b;
import b.h.k.f;

public class d extends Dialog implements b {
  private c b;
  
  private final f.a c = new a(this);
  
  public d(Context paramContext, int paramInt) {
    super(paramContext, b(paramContext, paramInt));
    c c1 = a();
    c1.G(b(paramContext, paramInt));
    c1.s(null);
  }
  
  private static int b(Context paramContext, int paramInt) {
    int i = paramInt;
    if (paramInt == 0) {
      TypedValue typedValue = new TypedValue();
      paramContext.getTheme().resolveAttribute(b.a.a.dialogTheme, typedValue, true);
      i = typedValue.resourceId;
    } 
    return i;
  }
  
  public c a() {
    if (this.b == null)
      this.b = c.j(this, this); 
    return this.b;
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    a().d(paramView, paramLayoutParams);
  }
  
  boolean c(KeyEvent paramKeyEvent) {
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public void d(b paramb) {}
  
  public void dismiss() {
    super.dismiss();
    a().t();
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    View view = getWindow().getDecorView();
    return f.e(this.c, view, (Window.Callback)this, paramKeyEvent);
  }
  
  public void e(b paramb) {}
  
  public boolean f(int paramInt) {
    return a().B(paramInt);
  }
  
  public <T extends View> T findViewById(int paramInt) {
    return a().k(paramInt);
  }
  
  public b i(b.a parama) {
    return null;
  }
  
  public void invalidateOptionsMenu() {
    a().q();
  }
  
  protected void onCreate(Bundle paramBundle) {
    a().p();
    super.onCreate(paramBundle);
    a().s(paramBundle);
  }
  
  protected void onStop() {
    super.onStop();
    a().y();
  }
  
  public void setContentView(int paramInt) {
    a().C(paramInt);
  }
  
  public void setContentView(View paramView) {
    a().D(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    a().E(paramView, paramLayoutParams);
  }
  
  public void setTitle(int paramInt) {
    super.setTitle(paramInt);
    a().H(getContext().getString(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    super.setTitle(paramCharSequence);
    a().H(paramCharSequence);
  }
  
  class a implements f.a {
    a(d this$0) {}
    
    public boolean k(KeyEvent param1KeyEvent) {
      return this.b.c(param1KeyEvent);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/app/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */