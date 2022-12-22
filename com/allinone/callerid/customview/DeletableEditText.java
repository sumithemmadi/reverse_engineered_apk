package com.allinone.callerid.customview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

public class DeletableEditText extends EditText {
  private Drawable b;
  
  private boolean c;
  
  public DeletableEditText(Context paramContext) {
    super(paramContext);
    c();
  }
  
  public DeletableEditText(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    c();
  }
  
  public DeletableEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    c();
  }
  
  private void c() {
    this.b = getCompoundDrawables()[2];
    setOnFocusChangeListener(new b(null));
    addTextChangedListener(new c(null));
    setClearDrawableVisible(false);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getAction();
    boolean bool = true;
    if (i == 1) {
      if (paramMotionEvent.getX() <= (getWidth() - getTotalPaddingRight()) || paramMotionEvent.getX() >= (getWidth() - getPaddingRight()))
        bool = false; 
      if (bool)
        setText(""); 
    } 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  protected void setClearDrawableVisible(boolean paramBoolean) {
    Drawable drawable;
    if (paramBoolean) {
      drawable = this.b;
    } else {
      drawable = null;
    } 
    setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], drawable, getCompoundDrawables()[3]);
  }
  
  private class b implements View.OnFocusChangeListener {
    private b(DeletableEditText this$0) {}
    
    public void onFocusChange(View param1View, boolean param1Boolean) {
      DeletableEditText.b(this.b, param1Boolean);
      boolean bool = DeletableEditText.a(this.b);
      param1Boolean = false;
      if (bool) {
        if (this.b.getText().toString().length() >= 1)
          param1Boolean = true; 
        this.b.setClearDrawableVisible(param1Boolean);
      } else {
        this.b.setClearDrawableVisible(false);
      } 
    }
  }
  
  private class c implements TextWatcher {
    private c(DeletableEditText this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {
      int i = this.b.getText().toString().length();
      boolean bool = true;
      if (i < 1)
        bool = false; 
      this.b.setClearDrawableVisible(bool);
    }
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/DeletableEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */