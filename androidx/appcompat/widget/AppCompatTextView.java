package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.i;
import androidx.core.widget.l;
import b.a.k.a.a;
import b.h.e.d;
import b.h.i.c;
import b.h.k.v;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView implements v, l, b {
  private final d b;
  
  private final m c;
  
  private final l d;
  
  private boolean e = false;
  
  private Future<c> f;
  
  public AppCompatTextView(Context paramContext) {
    this(paramContext, null);
  }
  
  public AppCompatTextView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 16842884);
  }
  
  public AppCompatTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(b0.b(paramContext), paramAttributeSet, paramInt);
    z.a((View)this, getContext());
    d d1 = new d((View)this);
    this.b = d1;
    d1.e(paramAttributeSet, paramInt);
    m m1 = new m(this);
    this.c = m1;
    m1.m(paramAttributeSet, paramInt);
    m1.b();
    this.d = new l(this);
  }
  
  private void c() {
    Future<c> future = this.f;
    if (future != null)
      try {
        this.f = null;
        i.p(this, future.get());
      } catch (InterruptedException|java.util.concurrent.ExecutionException interruptedException) {} 
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
  
  public int getFirstBaselineToTopHeight() {
    return i.b(this);
  }
  
  public int getLastBaselineToBottomHeight() {
    return i.c(this);
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
  
  public CharSequence getText() {
    c();
    return super.getText();
  }
  
  public TextClassifier getTextClassifier() {
    if (Build.VERSION.SDK_INT < 28) {
      l l1 = this.d;
      if (l1 != null)
        return l1.a(); 
    } 
    return super.getTextClassifier();
  }
  
  public c.a getTextMetricsParamsCompat() {
    return i.g(this);
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
    InputConnection inputConnection = super.onCreateInputConnection(paramEditorInfo);
    this.c.r(this, inputConnection, paramEditorInfo);
    return g.a(inputConnection, paramEditorInfo, (View)this);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    m m1 = this.c;
    if (m1 != null)
      m1.o(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    c();
    super.onMeasure(paramInt1, paramInt2);
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
  
  public void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    m m1 = this.c;
    if (m1 != null)
      m1.p(); 
  }
  
  public void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    m m1 = this.c;
    if (m1 != null)
      m1.p(); 
  }
  
  public void setCompoundDrawablesRelativeWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Drawable drawable2;
    Drawable drawable3;
    Drawable drawable4;
    Context context = getContext();
    Drawable drawable1 = null;
    if (paramInt1 != 0) {
      drawable2 = a.d(context, paramInt1);
    } else {
      drawable2 = null;
    } 
    if (paramInt2 != 0) {
      drawable3 = a.d(context, paramInt2);
    } else {
      drawable3 = null;
    } 
    if (paramInt3 != 0) {
      drawable4 = a.d(context, paramInt3);
    } else {
      drawable4 = null;
    } 
    if (paramInt4 != 0)
      drawable1 = a.d(context, paramInt4); 
    setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable1);
    m m1 = this.c;
    if (m1 != null)
      m1.p(); 
  }
  
  public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    m m1 = this.c;
    if (m1 != null)
      m1.p(); 
  }
  
  public void setCompoundDrawablesWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Drawable drawable2;
    Drawable drawable3;
    Drawable drawable4;
    Context context = getContext();
    Drawable drawable1 = null;
    if (paramInt1 != 0) {
      drawable2 = a.d(context, paramInt1);
    } else {
      drawable2 = null;
    } 
    if (paramInt2 != 0) {
      drawable3 = a.d(context, paramInt2);
    } else {
      drawable3 = null;
    } 
    if (paramInt3 != 0) {
      drawable4 = a.d(context, paramInt3);
    } else {
      drawable4 = null;
    } 
    if (paramInt4 != 0)
      drawable1 = a.d(context, paramInt4); 
    setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable1);
    m m1 = this.c;
    if (m1 != null)
      m1.p(); 
  }
  
  public void setCompoundDrawablesWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawablesWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    m m1 = this.c;
    if (m1 != null)
      m1.p(); 
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(i.s(this, paramCallback));
  }
  
  public void setFirstBaselineToTopHeight(int paramInt) {
    if (Build.VERSION.SDK_INT >= 28) {
      super.setFirstBaselineToTopHeight(paramInt);
    } else {
      i.m(this, paramInt);
    } 
  }
  
  public void setLastBaselineToBottomHeight(int paramInt) {
    if (Build.VERSION.SDK_INT >= 28) {
      super.setLastBaselineToBottomHeight(paramInt);
    } else {
      i.n(this, paramInt);
    } 
  }
  
  public void setLineHeight(int paramInt) {
    i.o(this, paramInt);
  }
  
  public void setPrecomputedText(c paramc) {
    i.p(this, paramc);
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
  
  public void setTextClassifier(TextClassifier paramTextClassifier) {
    if (Build.VERSION.SDK_INT < 28) {
      l l1 = this.d;
      if (l1 != null) {
        l1.b(paramTextClassifier);
        return;
      } 
    } 
    super.setTextClassifier(paramTextClassifier);
  }
  
  public void setTextFuture(Future<c> paramFuture) {
    this.f = paramFuture;
    if (paramFuture != null)
      requestLayout(); 
  }
  
  public void setTextMetricsParamsCompat(c.a parama) {
    i.r(this, parama);
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
  
  public void setTypeface(Typeface paramTypeface, int paramInt) {
    if (this.e)
      return; 
    Typeface typeface1 = null;
    Typeface typeface2 = typeface1;
    if (paramTypeface != null) {
      typeface2 = typeface1;
      if (paramInt > 0)
        typeface2 = d.a(getContext(), paramTypeface, paramInt); 
    } 
    this.e = true;
    if (typeface2 != null)
      paramTypeface = typeface2; 
    try {
      super.setTypeface(paramTypeface, paramInt);
      return;
    } finally {
      this.e = false;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/AppCompatTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */