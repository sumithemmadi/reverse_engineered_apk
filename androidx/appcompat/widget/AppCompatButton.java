package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.i;
import androidx.core.widget.l;
import b.a.a;
import b.h.k.v;

public class AppCompatButton extends Button implements v, b, l {
  private final d b;
  
  private final m c;
  
  public AppCompatButton(Context paramContext) {
    this(paramContext, null);
  }
  
  public AppCompatButton(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, a.buttonStyle);
  }
  
  public AppCompatButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(b0.b(paramContext), paramAttributeSet, paramInt);
    z.a((View)this, getContext());
    d d1 = new d((View)this);
    this.b = d1;
    d1.e(paramAttributeSet, paramInt);
    m m1 = new m((TextView)this);
    this.c = m1;
    m1.m(paramAttributeSet, paramInt);
    m1.b();
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
  
  public int getAutoSizeMaxTextSize() {
    if (b.a)
      return super.getAutoSizeMaxTextSize(); 
    m m1 = this.c;
    return (m1 != null) ? m1.e() : -1;
  }
  
  public int getAutoSizeMinTextSize() {
    if (b.a)
      return super.getAutoSizeMinTextSize(); 
    m m1 = this.c;
    return (m1 != null) ? m1.f() : -1;
  }
  
  public int getAutoSizeStepGranularity() {
    if (b.a)
      return super.getAutoSizeStepGranularity(); 
    m m1 = this.c;
    return (m1 != null) ? m1.g() : -1;
  }
  
  public int[] getAutoSizeTextAvailableSizes() {
    if (b.a)
      return super.getAutoSizeTextAvailableSizes(); 
    m m1 = this.c;
    return (m1 != null) ? m1.h() : new int[0];
  }
  
  @SuppressLint({"WrongConstant"})
  public int getAutoSizeTextType() {
    boolean bool = b.a;
    boolean bool1 = false;
    if (bool) {
      if (super.getAutoSizeTextType() == 1)
        bool1 = true; 
      return bool1;
    } 
    m m1 = this.c;
    return (m1 != null) ? m1.i() : 0;
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
  
  public ColorStateList getSupportCompoundDrawablesTintList() {
    return this.c.j();
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
    return this.c.k();
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(Button.class.getName());
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(Button.class.getName());
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    m m1 = this.c;
    if (m1 != null)
      m1.o(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    m m1 = this.c;
    if (m1 != null && !b.a && m1.l())
      this.c.c(); 
  }
  
  public void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (b.a) {
      super.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      m m1 = this.c;
      if (m1 != null)
        m1.t(paramInt1, paramInt2, paramInt3, paramInt4); 
    } 
  }
  
  public void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfint, int paramInt) {
    if (b.a) {
      super.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfint, paramInt);
    } else {
      m m1 = this.c;
      if (m1 != null)
        m1.u(paramArrayOfint, paramInt); 
    } 
  }
  
  public void setAutoSizeTextTypeWithDefaults(int paramInt) {
    if (b.a) {
      super.setAutoSizeTextTypeWithDefaults(paramInt);
    } else {
      m m1 = this.c;
      if (m1 != null)
        m1.v(paramInt); 
    } 
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
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(i.s((TextView)this, paramCallback));
  }
  
  public void setSupportAllCaps(boolean paramBoolean) {
    m m1 = this.c;
    if (m1 != null)
      m1.s(paramBoolean); 
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
  
  public void setSupportCompoundDrawablesTintList(ColorStateList paramColorStateList) {
    this.c.w(paramColorStateList);
    this.c.b();
  }
  
  public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode paramMode) {
    this.c.x(paramMode);
    this.c.b();
  }
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    m m1 = this.c;
    if (m1 != null)
      m1.q(paramContext, paramInt); 
  }
  
  public void setTextSize(int paramInt, float paramFloat) {
    if (b.a) {
      super.setTextSize(paramInt, paramFloat);
    } else {
      m m1 = this.c;
      if (m1 != null)
        m1.A(paramInt, paramFloat); 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/AppCompatButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */