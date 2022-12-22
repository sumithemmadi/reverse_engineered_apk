package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.e;
import b.a.j;
import b.a.k.a.a;
import b.h.k.w;

public class h {
  private final ImageView a;
  
  private c0 b;
  
  private c0 c;
  
  private c0 d;
  
  public h(ImageView paramImageView) {
    this.a = paramImageView;
  }
  
  private boolean a(Drawable paramDrawable) {
    if (this.d == null)
      this.d = new c0(); 
    c0 c01 = this.d;
    c01.a();
    ColorStateList colorStateList = e.a(this.a);
    if (colorStateList != null) {
      c01.d = true;
      c01.a = colorStateList;
    } 
    PorterDuff.Mode mode = e.b(this.a);
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
  
  private boolean j() {
    int i = Build.VERSION.SDK_INT;
    boolean bool = true;
    if (i > 21) {
      if (this.b == null)
        bool = false; 
      return bool;
    } 
    return (i == 21);
  }
  
  void b() {
    Drawable drawable = this.a.getDrawable();
    if (drawable != null)
      q.b(drawable); 
    if (drawable != null) {
      if (j() && a(drawable))
        return; 
      c0 c01 = this.c;
      if (c01 != null) {
        f.i(drawable, c01, this.a.getDrawableState());
      } else {
        c01 = this.b;
        if (c01 != null)
          f.i(drawable, c01, this.a.getDrawableState()); 
      } 
    } 
  }
  
  ColorStateList c() {
    c0 c01 = this.c;
    if (c01 != null) {
      ColorStateList colorStateList = c01.a;
    } else {
      c01 = null;
    } 
    return (ColorStateList)c01;
  }
  
  PorterDuff.Mode d() {
    c0 c01 = this.c;
    if (c01 != null) {
      PorterDuff.Mode mode = c01.b;
    } else {
      c01 = null;
    } 
    return (PorterDuff.Mode)c01;
  }
  
  boolean e() {
    Drawable drawable = this.a.getBackground();
    return !(Build.VERSION.SDK_INT >= 21 && drawable instanceof android.graphics.drawable.RippleDrawable);
  }
  
  public void f(AttributeSet paramAttributeSet, int paramInt) {
    Context context = this.a.getContext();
    int[] arrayOfInt = j.AppCompatImageView;
    e0 e0 = e0.v(context, paramAttributeSet, arrayOfInt, paramInt, 0);
    ImageView imageView = this.a;
    w.p0((View)imageView, imageView.getContext(), arrayOfInt, paramAttributeSet, e0.r(), paramInt, 0);
    try {
      Drawable drawable2 = this.a.getDrawable();
      Drawable drawable1 = drawable2;
      if (drawable2 == null) {
        paramInt = e0.n(j.AppCompatImageView_srcCompat, -1);
        drawable1 = drawable2;
        if (paramInt != -1) {
          drawable2 = a.d(this.a.getContext(), paramInt);
          drawable1 = drawable2;
          if (drawable2 != null) {
            this.a.setImageDrawable(drawable2);
            drawable1 = drawable2;
          } 
        } 
      } 
      if (drawable1 != null)
        q.b(drawable1); 
      paramInt = j.AppCompatImageView_tint;
      if (e0.s(paramInt))
        e.c(this.a, e0.c(paramInt)); 
      paramInt = j.AppCompatImageView_tintMode;
      if (e0.s(paramInt))
        e.d(this.a, q.e(e0.k(paramInt, -1), null)); 
      return;
    } finally {
      e0.w();
    } 
  }
  
  public void g(int paramInt) {
    if (paramInt != 0) {
      Drawable drawable = a.d(this.a.getContext(), paramInt);
      if (drawable != null)
        q.b(drawable); 
      this.a.setImageDrawable(drawable);
    } else {
      this.a.setImageDrawable(null);
    } 
    b();
  }
  
  void h(ColorStateList paramColorStateList) {
    if (this.c == null)
      this.c = new c0(); 
    c0 c01 = this.c;
    c01.a = paramColorStateList;
    c01.d = true;
    b();
  }
  
  void i(PorterDuff.Mode paramMode) {
    if (this.c == null)
      this.c = new c0(); 
    c0 c01 = this.c;
    c01.b = paramMode;
    c01.c = true;
    b();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */