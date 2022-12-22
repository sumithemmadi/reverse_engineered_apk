package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.core.widget.i;
import b.a.k.a.a;

public class AppCompatCheckedTextView extends CheckedTextView {
  private static final int[] b = new int[] { 16843016 };
  
  private final m c;
  
  public AppCompatCheckedTextView(Context paramContext) {
    this(paramContext, null);
  }
  
  public AppCompatCheckedTextView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 16843720);
  }
  
  public AppCompatCheckedTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(b0.b(paramContext), paramAttributeSet, paramInt);
    z.a((View)this, getContext());
    m m1 = new m((TextView)this);
    this.c = m1;
    m1.m(paramAttributeSet, paramInt);
    m1.b();
    e0 e0 = e0.v(getContext(), paramAttributeSet, b, paramInt, 0);
    setCheckMarkDrawable(e0.g(0));
    e0.w();
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    m m1 = this.c;
    if (m1 != null)
      m1.b(); 
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
    return g.a(super.onCreateInputConnection(paramEditorInfo), paramEditorInfo, (View)this);
  }
  
  public void setCheckMarkDrawable(int paramInt) {
    setCheckMarkDrawable(a.d(getContext(), paramInt));
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(i.s((TextView)this, paramCallback));
  }
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    m m1 = this.c;
    if (m1 != null)
      m1.q(paramContext, paramInt); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/AppCompatCheckedTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */