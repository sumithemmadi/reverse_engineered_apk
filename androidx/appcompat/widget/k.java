package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;
import b.a.j;
import b.h.k.w;

class k extends i {
  private final SeekBar d;
  
  private Drawable e;
  
  private ColorStateList f = null;
  
  private PorterDuff.Mode g = null;
  
  private boolean h = false;
  
  private boolean i = false;
  
  k(SeekBar paramSeekBar) {
    super((ProgressBar)paramSeekBar);
    this.d = paramSeekBar;
  }
  
  private void f() {
    Drawable drawable = this.e;
    if (drawable != null && (this.h || this.i)) {
      drawable = a.r(drawable.mutate());
      this.e = drawable;
      if (this.h)
        a.o(drawable, this.f); 
      if (this.i)
        a.p(this.e, this.g); 
      if (this.e.isStateful())
        this.e.setState(this.d.getDrawableState()); 
    } 
  }
  
  void c(AttributeSet paramAttributeSet, int paramInt) {
    super.c(paramAttributeSet, paramInt);
    Context context = this.d.getContext();
    int[] arrayOfInt = j.AppCompatSeekBar;
    e0 e0 = e0.v(context, paramAttributeSet, arrayOfInt, paramInt, 0);
    SeekBar seekBar = this.d;
    w.p0((View)seekBar, seekBar.getContext(), arrayOfInt, paramAttributeSet, e0.r(), paramInt, 0);
    Drawable drawable = e0.h(j.AppCompatSeekBar_android_thumb);
    if (drawable != null)
      this.d.setThumb(drawable); 
    j(e0.g(j.AppCompatSeekBar_tickMark));
    paramInt = j.AppCompatSeekBar_tickMarkTintMode;
    if (e0.s(paramInt)) {
      this.g = q.e(e0.k(paramInt, -1), this.g);
      this.i = true;
    } 
    paramInt = j.AppCompatSeekBar_tickMarkTint;
    if (e0.s(paramInt)) {
      this.f = e0.c(paramInt);
      this.h = true;
    } 
    e0.w();
    f();
  }
  
  void g(Canvas paramCanvas) {
    if (this.e != null) {
      int j = this.d.getMax();
      int m = 1;
      if (j > 1) {
        int n = this.e.getIntrinsicWidth();
        int i1 = this.e.getIntrinsicHeight();
        if (n >= 0) {
          n /= 2;
        } else {
          n = 1;
        } 
        if (i1 >= 0)
          m = i1 / 2; 
        this.e.setBounds(-n, -m, n, m);
        float f = (this.d.getWidth() - this.d.getPaddingLeft() - this.d.getPaddingRight()) / j;
        m = paramCanvas.save();
        paramCanvas.translate(this.d.getPaddingLeft(), (this.d.getHeight() / 2));
        for (n = 0; n <= j; n++) {
          this.e.draw(paramCanvas);
          paramCanvas.translate(f, 0.0F);
        } 
        paramCanvas.restoreToCount(m);
      } 
    } 
  }
  
  void h() {
    Drawable drawable = this.e;
    if (drawable != null && drawable.isStateful() && drawable.setState(this.d.getDrawableState()))
      this.d.invalidateDrawable(drawable); 
  }
  
  void i() {
    Drawable drawable = this.e;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
  }
  
  void j(Drawable paramDrawable) {
    Drawable drawable = this.e;
    if (drawable != null)
      drawable.setCallback(null); 
    this.e = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback((Drawable.Callback)this.d);
      a.m(paramDrawable, w.C((View)this.d));
      if (paramDrawable.isStateful())
        paramDrawable.setState(this.d.getDrawableState()); 
      f();
    } 
    this.d.invalidate();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */