package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.widget.k;
import b.a.a;
import b.a.k.a.a;
import b.h.k.v;

public class AppCompatRadioButton extends RadioButton implements k, v {
  private final e b;
  
  private final d c;
  
  private final m d;
  
  public AppCompatRadioButton(Context paramContext) {
    this(paramContext, null);
  }
  
  public AppCompatRadioButton(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, a.radioButtonStyle);
  }
  
  public AppCompatRadioButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(b0.b(paramContext), paramAttributeSet, paramInt);
    z.a((View)this, getContext());
    e e1 = new e((CompoundButton)this);
    this.b = e1;
    e1.e(paramAttributeSet, paramInt);
    d d1 = new d((View)this);
    this.c = d1;
    d1.e(paramAttributeSet, paramInt);
    m m1 = new m((TextView)this);
    this.d = m1;
    m1.m(paramAttributeSet, paramInt);
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    d d1 = this.c;
    if (d1 != null)
      d1.b(); 
    m m1 = this.d;
    if (m1 != null)
      m1.b(); 
  }
  
  public int getCompoundPaddingLeft() {
    int i = super.getCompoundPaddingLeft();
    e e1 = this.b;
    int j = i;
    if (e1 != null)
      j = e1.b(i); 
    return j;
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    d d1 = this.c;
    if (d1 != null) {
      ColorStateList colorStateList = d1.c();
    } else {
      d1 = null;
    } 
    return (ColorStateList)d1;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    d d1 = this.c;
    if (d1 != null) {
      PorterDuff.Mode mode = d1.d();
    } else {
      d1 = null;
    } 
    return (PorterDuff.Mode)d1;
  }
  
  public ColorStateList getSupportButtonTintList() {
    e e1 = this.b;
    if (e1 != null) {
      ColorStateList colorStateList = e1.c();
    } else {
      e1 = null;
    } 
    return (ColorStateList)e1;
  }
  
  public PorterDuff.Mode getSupportButtonTintMode() {
    e e1 = this.b;
    if (e1 != null) {
      PorterDuff.Mode mode = e1.d();
    } else {
      e1 = null;
    } 
    return (PorterDuff.Mode)e1;
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    d d1 = this.c;
    if (d1 != null)
      d1.f(paramDrawable); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    d d1 = this.c;
    if (d1 != null)
      d1.g(paramInt); 
  }
  
  public void setButtonDrawable(int paramInt) {
    setButtonDrawable(a.d(getContext(), paramInt));
  }
  
  public void setButtonDrawable(Drawable paramDrawable) {
    super.setButtonDrawable(paramDrawable);
    e e1 = this.b;
    if (e1 != null)
      e1.f(); 
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    d d1 = this.c;
    if (d1 != null)
      d1.i(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    d d1 = this.c;
    if (d1 != null)
      d1.j(paramMode); 
  }
  
  public void setSupportButtonTintList(ColorStateList paramColorStateList) {
    e e1 = this.b;
    if (e1 != null)
      e1.g(paramColorStateList); 
  }
  
  public void setSupportButtonTintMode(PorterDuff.Mode paramMode) {
    e e1 = this.b;
    if (e1 != null)
      e1.h(paramMode); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/AppCompatRadioButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */