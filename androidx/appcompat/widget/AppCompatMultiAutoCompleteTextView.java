package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import b.a.a;
import b.a.k.a.a;
import b.h.k.v;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements v {
  private static final int[] b = new int[] { 16843126 };
  
  private final d c;
  
  private final m d;
  
  public AppCompatMultiAutoCompleteTextView(Context paramContext) {
    this(paramContext, null);
  }
  
  public AppCompatMultiAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, a.autoCompleteTextViewStyle);
  }
  
  public AppCompatMultiAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(b0.b(paramContext), paramAttributeSet, paramInt);
    z.a((View)this, getContext());
    e0 e0 = e0.v(getContext(), paramAttributeSet, b, paramInt, 0);
    if (e0.s(0))
      setDropDownBackgroundDrawable(e0.g(0)); 
    e0.w();
    d d1 = new d((View)this);
    this.c = d1;
    d1.e(paramAttributeSet, paramInt);
    m m1 = new m((TextView)this);
    this.d = m1;
    m1.m(paramAttributeSet, paramInt);
    m1.b();
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
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
    return g.a(super.onCreateInputConnection(paramEditorInfo), paramEditorInfo, (View)this);
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
  
  public void setDropDownBackgroundResource(int paramInt) {
    setDropDownBackgroundDrawable(a.d(getContext(), paramInt));
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
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    m m1 = this.d;
    if (m1 != null)
      m1.q(paramContext, paramInt); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/AppCompatMultiAutoCompleteTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */