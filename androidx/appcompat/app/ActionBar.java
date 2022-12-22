package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import b.a.j;

public abstract class ActionBar {
  public boolean f() {
    return false;
  }
  
  public abstract boolean g();
  
  public abstract void h(boolean paramBoolean);
  
  public abstract int i();
  
  public abstract Context j();
  
  public boolean k() {
    return false;
  }
  
  public abstract void l(Configuration paramConfiguration);
  
  void m() {}
  
  public abstract boolean n(int paramInt, KeyEvent paramKeyEvent);
  
  public boolean o(KeyEvent paramKeyEvent) {
    return false;
  }
  
  public boolean p() {
    return false;
  }
  
  public abstract void q(boolean paramBoolean);
  
  public abstract void r(boolean paramBoolean);
  
  public abstract void s(CharSequence paramCharSequence);
  
  public abstract b.a.o.b t(b.a.o.b.a parama);
  
  public static class LayoutParams extends ViewGroup.MarginLayoutParams {
    public int a = 0;
    
    public LayoutParams(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.a = 8388627;
    }
    
    public LayoutParams(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, j.ActionBarLayout);
      this.a = typedArray.getInt(j.ActionBarLayout_android_layout_gravity, 0);
      typedArray.recycle();
    }
    
    public LayoutParams(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public LayoutParams(LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
      this.a = param1LayoutParams.a;
    }
  }
  
  public static interface a {
    void a(boolean param1Boolean);
  }
  
  @Deprecated
  public static abstract class b {
    public abstract CharSequence a();
    
    public abstract View b();
    
    public abstract Drawable c();
    
    public abstract CharSequence d();
    
    public abstract void e();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/app/ActionBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */