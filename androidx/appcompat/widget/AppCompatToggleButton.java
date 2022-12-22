package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;
import b.h.k.v;

public class AppCompatToggleButton extends ToggleButton implements v {
  private final d b;
  
  private final m c;
  
  public AppCompatToggleButton(Context paramContext) {
    this(paramContext, null);
  }
  
  public AppCompatToggleButton(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 16842827);
  }
  
  public AppCompatToggleButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    z.a((View)this, getContext());
    d d1 = new d((View)this);
    this.b = d1;
    d1.e(paramAttributeSet, paramInt);
    m m1 = new m((TextView)this);
    this.c = m1;
    m1.m(paramAttributeSet, paramInt);
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    d d1 = this.b;
    if (d1 != null)
      d1.b(); 
    m m1 = this.c;
    if (m1 != null)
      m1.b(); 
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    d d1 = this.b;
    if (d1 != null) {
      ColorStateList colorStateList = d1.c();
    } else {
      d1 = null;
    } 
    return (ColorStateList)d1;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    d d1 = this.b;
    if (d1 != null) {
      PorterDuff.Mode mode = d1.d();
    } else {
      d1 = null;
    } 
    return (PorterDuff.Mode)d1;
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    d d1 = this.b;
    if (d1 != null)
      d1.f(paramDrawable); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    d d1 = this.b;
    if (d1 != null)
      d1.g(paramInt); 
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    d d1 = this.b;
    if (d1 != null)
      d1.i(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    d d1 = this.b;
    if (d1 != null)
      d1.j(paramMode); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/AppCompatToggleButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */