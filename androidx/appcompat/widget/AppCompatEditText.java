package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.i;
import androidx.core.widget.j;
import b.a.a;
import b.h.k.c;
import b.h.k.g0.a;
import b.h.k.g0.b;
import b.h.k.s;
import b.h.k.v;
import b.h.k.w;

public class AppCompatEditText extends EditText implements v, s {
  private final d b;
  
  private final m c;
  
  private final l d;
  
  private final j e;
  
  public AppCompatEditText(Context paramContext) {
    this(paramContext, null);
  }
  
  public AppCompatEditText(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, a.editTextStyle);
  }
  
  public AppCompatEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(b0.b(paramContext), paramAttributeSet, paramInt);
    z.a((View)this, getContext());
    d d1 = new d((View)this);
    this.b = d1;
    d1.e(paramAttributeSet, paramInt);
    m m1 = new m((TextView)this);
    this.c = m1;
    m1.m(paramAttributeSet, paramInt);
    m1.b();
    this.d = new l((TextView)this);
    this.e = new j();
  }
  
  public c a(c paramc) {
    return this.e.a((View)this, paramc);
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
  
  public Editable getText() {
    return (Build.VERSION.SDK_INT >= 28) ? super.getText() : getEditableText();
  }
  
  public TextClassifier getTextClassifier() {
    if (Build.VERSION.SDK_INT < 28) {
      l l1 = this.d;
      if (l1 != null)
        return l1.a(); 
    } 
    return super.getTextClassifier();
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
    InputConnection inputConnection1 = super.onCreateInputConnection(paramEditorInfo);
    this.c.r((TextView)this, inputConnection1, paramEditorInfo);
    InputConnection inputConnection2 = g.a(inputConnection1, paramEditorInfo, (View)this);
    String[] arrayOfString = w.F((View)this);
    inputConnection1 = inputConnection2;
    if (inputConnection2 != null) {
      inputConnection1 = inputConnection2;
      if (arrayOfString != null) {
        a.d(paramEditorInfo, arrayOfString);
        inputConnection1 = b.a(inputConnection2, paramEditorInfo, j.a((View)this));
      } 
    } 
    return inputConnection1;
  }
  
  public boolean onDragEvent(DragEvent paramDragEvent) {
    return j.b((View)this, paramDragEvent) ? true : super.onDragEvent(paramDragEvent);
  }
  
  public boolean onTextContextMenuItem(int paramInt) {
    return j.c((TextView)this, paramInt) ? true : super.onTextContextMenuItem(paramInt);
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
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/AppCompatEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */