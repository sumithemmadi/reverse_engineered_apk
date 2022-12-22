package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

public class a extends d implements DialogInterface {
  final AlertController d = new AlertController(getContext(), this, getWindow());
  
  protected a(Context paramContext, int paramInt) {
    super(paramContext, j(paramContext, paramInt));
  }
  
  static int j(Context paramContext, int paramInt) {
    if ((paramInt >>> 24 & 0xFF) >= 1)
      return paramInt; 
    TypedValue typedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(b.a.a.alertDialogTheme, typedValue, true);
    return typedValue.resourceId;
  }
  
  public Button g(int paramInt) {
    return this.d.c(paramInt);
  }
  
  public ListView h() {
    return this.d.e();
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    this.d.f();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    return this.d.h(paramInt, paramKeyEvent) ? true : super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent) {
    return this.d.i(paramInt, paramKeyEvent) ? true : super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    super.setTitle(paramCharSequence);
    this.d.r(paramCharSequence);
  }
  
  public static class a {
    private final AlertController.f a;
    
    private final int b;
    
    public a(Context param1Context) {
      this(param1Context, a.j(param1Context, 0));
    }
    
    public a(Context param1Context, int param1Int) {
      this.a = new AlertController.f((Context)new ContextThemeWrapper(param1Context, a.j(param1Context, param1Int)));
      this.b = param1Int;
    }
    
    public a a() {
      a a1 = new a(this.a.a, this.b);
      this.a.a(a1.d);
      a1.setCancelable(this.a.r);
      if (this.a.r)
        a1.setCanceledOnTouchOutside(true); 
      a1.setOnCancelListener(this.a.s);
      a1.setOnDismissListener(this.a.t);
      DialogInterface.OnKeyListener onKeyListener = this.a.u;
      if (onKeyListener != null)
        a1.setOnKeyListener(onKeyListener); 
      return a1;
    }
    
    public Context b() {
      return this.a.a;
    }
    
    public a c(ListAdapter param1ListAdapter, DialogInterface.OnClickListener param1OnClickListener) {
      AlertController.f f1 = this.a;
      f1.w = param1ListAdapter;
      f1.x = param1OnClickListener;
      return this;
    }
    
    public a d(boolean param1Boolean) {
      this.a.r = param1Boolean;
      return this;
    }
    
    public a e(View param1View) {
      this.a.g = param1View;
      return this;
    }
    
    public a f(Drawable param1Drawable) {
      this.a.d = param1Drawable;
      return this;
    }
    
    public a g(int param1Int) {
      AlertController.f f1 = this.a;
      f1.h = f1.a.getText(param1Int);
      return this;
    }
    
    public a h(CharSequence param1CharSequence) {
      this.a.h = param1CharSequence;
      return this;
    }
    
    public a i(int param1Int, DialogInterface.OnClickListener param1OnClickListener) {
      AlertController.f f1 = this.a;
      f1.l = f1.a.getText(param1Int);
      this.a.n = param1OnClickListener;
      return this;
    }
    
    public a j(CharSequence param1CharSequence, DialogInterface.OnClickListener param1OnClickListener) {
      AlertController.f f1 = this.a;
      f1.l = param1CharSequence;
      f1.n = param1OnClickListener;
      return this;
    }
    
    public a k(DialogInterface.OnDismissListener param1OnDismissListener) {
      this.a.t = param1OnDismissListener;
      return this;
    }
    
    public a l(DialogInterface.OnKeyListener param1OnKeyListener) {
      this.a.u = param1OnKeyListener;
      return this;
    }
    
    public a m(int param1Int, DialogInterface.OnClickListener param1OnClickListener) {
      AlertController.f f1 = this.a;
      f1.i = f1.a.getText(param1Int);
      this.a.k = param1OnClickListener;
      return this;
    }
    
    public a n(CharSequence param1CharSequence, DialogInterface.OnClickListener param1OnClickListener) {
      AlertController.f f1 = this.a;
      f1.i = param1CharSequence;
      f1.k = param1OnClickListener;
      return this;
    }
    
    public a o(ListAdapter param1ListAdapter, int param1Int, DialogInterface.OnClickListener param1OnClickListener) {
      AlertController.f f1 = this.a;
      f1.w = param1ListAdapter;
      f1.x = param1OnClickListener;
      f1.I = param1Int;
      f1.H = true;
      return this;
    }
    
    public a p(int param1Int) {
      AlertController.f f1 = this.a;
      f1.f = f1.a.getText(param1Int);
      return this;
    }
    
    public a q(CharSequence param1CharSequence) {
      this.a.f = param1CharSequence;
      return this;
    }
    
    public a r(View param1View) {
      AlertController.f f1 = this.a;
      f1.z = param1View;
      f1.y = 0;
      f1.E = false;
      return this;
    }
    
    public a s() {
      a a1 = a();
      a1.show();
      return a1;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/app/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */