package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.h;
import b.a.j;

class AppCompatPopupWindow extends PopupWindow {
  private static final boolean a;
  
  private boolean b;
  
  static {
    boolean bool;
    if (Build.VERSION.SDK_INT < 21) {
      bool = true;
    } else {
      bool = false;
    } 
    a = bool;
  }
  
  public AppCompatPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public AppCompatPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    e0 e0 = e0.v(paramContext, paramAttributeSet, j.PopupWindow, paramInt1, paramInt2);
    paramInt1 = j.PopupWindow_overlapAnchor;
    if (e0.s(paramInt1))
      b(e0.a(paramInt1, false)); 
    setBackgroundDrawable(e0.g(j.PopupWindow_android_popupBackground));
    e0.w();
  }
  
  private void b(boolean paramBoolean) {
    if (a) {
      this.b = paramBoolean;
    } else {
      h.a(this, paramBoolean);
    } 
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2) {
    int i = paramInt2;
    if (a) {
      i = paramInt2;
      if (this.b)
        i = paramInt2 - paramView.getHeight(); 
    } 
    super.showAsDropDown(paramView, paramInt1, i);
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt2;
    if (a) {
      i = paramInt2;
      if (this.b)
        i = paramInt2 - paramView.getHeight(); 
    } 
    super.showAsDropDown(paramView, paramInt1, i, paramInt3);
  }
  
  public void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt2;
    if (a) {
      i = paramInt2;
      if (this.b)
        i = paramInt2 - paramView.getHeight(); 
    } 
    super.update(paramView, paramInt1, i, paramInt3, paramInt4);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/AppCompatPopupWindow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */