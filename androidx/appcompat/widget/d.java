package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import b.a.j;
import b.h.k.w;

class d {
  private final View a;
  
  private final f b;
  
  private int c = -1;
  
  private c0 d;
  
  private c0 e;
  
  private c0 f;
  
  d(View paramView) {
    this.a = paramView;
    this.b = f.b();
  }
  
  private boolean a(Drawable paramDrawable) {
    if (this.f == null)
      this.f = new c0(); 
    c0 c01 = this.f;
    c01.a();
    ColorStateList colorStateList = w.s(this.a);
    if (colorStateList != null) {
      c01.d = true;
      c01.a = colorStateList;
    } 
    PorterDuff.Mode mode = w.t(this.a);
    if (mode != null) {
      c01.c = true;
      c01.b = mode;
    } 
    if (c01.d || c01.c) {
      f.i(paramDrawable, c01, this.a.getDrawableState());
      return true;
    } 
    return false;
  }
  
  private boolean k() {
    int i = Build.VERSION.SDK_INT;
    boolean bool = true;
    if (i > 21) {
      if (this.d == null)
        bool = false; 
      return bool;
    } 
    return (i == 21);
  }
  
  void b() {
    Drawable drawable = this.a.getBackground();
    if (drawable != null) {
      if (k() && a(drawable))
        return; 
      c0 c01 = this.e;
      if (c01 != null) {
        f.i(drawable, c01, this.a.getDrawableState());
      } else {
        c01 = this.d;
        if (c01 != null)
          f.i(drawable, c01, this.a.getDrawableState()); 
      } 
    } 
  }
  
  ColorStateList c() {
    c0 c01 = this.e;
    if (c01 != null) {
      ColorStateList colorStateList = c01.a;
    } else {
      c01 = null;
    } 
    return (ColorStateList)c01;
  }
  
  PorterDuff.Mode d() {
    c0 c01 = this.e;
    if (c01 != null) {
      PorterDuff.Mode mode = c01.b;
    } else {
      c01 = null;
    } 
    return (PorterDuff.Mode)c01;
  }
  
  void e(AttributeSet paramAttributeSet, int paramInt) {
    Context context = this.a.getContext();
    int[] arrayOfInt = j.ViewBackgroundHelper;
    e0 e0 = e0.v(context, paramAttributeSet, arrayOfInt, paramInt, 0);
    View view = this.a;
    w.p0(view, view.getContext(), arrayOfInt, paramAttributeSet, e0.r(), paramInt, 0);
    try {
      paramInt = j.ViewBackgroundHelper_android_background;
      if (e0.s(paramInt)) {
        this.c = e0.n(paramInt, -1);
        ColorStateList colorStateList = this.b.f(this.a.getContext(), this.c);
        if (colorStateList != null)
          h(colorStateList); 
      } 
      paramInt = j.ViewBackgroundHelper_backgroundTint;
      if (e0.s(paramInt))
        w.v0(this.a, e0.c(paramInt)); 
      paramInt = j.ViewBackgroundHelper_backgroundTintMode;
      if (e0.s(paramInt))
        w.w0(this.a, q.e(e0.k(paramInt, -1), null)); 
      return;
    } finally {
      e0.w();
    } 
  }
  
  void f(Drawable paramDrawable) {
    this.c = -1;
    h(null);
    b();
  }
  
  void g(int paramInt) {
    this.c = paramInt;
    f f1 = this.b;
    if (f1 != null) {
      ColorStateList colorStateList = f1.f(this.a.getContext(), paramInt);
    } else {
      f1 = null;
    } 
    h((ColorStateList)f1);
    b();
  }
  
  void h(ColorStateList paramColorStateList) {
    if (paramColorStateList != null) {
      if (this.d == null)
        this.d = new c0(); 
      c0 c01 = this.d;
      c01.a = paramColorStateList;
      c01.d = true;
    } else {
      this.d = null;
    } 
    b();
  }
  
  void i(ColorStateList paramColorStateList) {
    if (this.e == null)
      this.e = new c0(); 
    c0 c01 = this.e;
    c01.a = paramColorStateList;
    c01.d = true;
    b();
  }
  
  void j(PorterDuff.Mode paramMode) {
    if (this.e == null)
      this.e = new c0(); 
    c0 c01 = this.e;
    c01.b = paramMode;
    c01.c = true;
    b();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */