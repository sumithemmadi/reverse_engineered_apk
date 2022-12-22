package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import c.c.a.a.a.d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.SignInButtonImpl;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.dynamic.RemoteCreator;

public final class SignInButton extends FrameLayout implements View.OnClickListener {
  private int b;
  
  private int c;
  
  private View d;
  
  private View.OnClickListener e = null;
  
  public SignInButton(Context paramContext) {
    this(paramContext, null);
  }
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SignInButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray typedArray = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, d.SignInButton, 0, 0);
    try {
      this.b = typedArray.getInt(d.SignInButton_buttonSize, 0);
      this.c = typedArray.getInt(d.SignInButton_colorScheme, 2);
      typedArray.recycle();
      return;
    } finally {
      typedArray.recycle();
    } 
  }
  
  public final void onClick(View paramView) {
    View.OnClickListener onClickListener = this.e;
    if (onClickListener != null && paramView == this.d)
      onClickListener.onClick((View)this); 
  }
  
  public final void setColorScheme(int paramInt) {
    setStyle(this.b, paramInt);
  }
  
  public final void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.d.setEnabled(paramBoolean);
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener) {
    this.e = paramOnClickListener;
    View view = this.d;
    if (view != null)
      view.setOnClickListener(this); 
  }
  
  @Deprecated
  public final void setScopes(Scope[] paramArrayOfScope) {
    setStyle(this.b, this.c);
  }
  
  public final void setSize(int paramInt) {
    setStyle(paramInt, this.c);
  }
  
  public final void setStyle(int paramInt1, int paramInt2) {
    this.b = paramInt1;
    this.c = paramInt2;
    Context context = getContext();
    View view = this.d;
    if (view != null)
      removeView(view); 
    try {
      this.d = u.c(context, this.b, this.c);
    } catch (com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException remoteCreatorException) {
      Log.w("SignInButton", "Sign in button not found, using placeholder instead");
      paramInt2 = this.b;
      paramInt1 = this.c;
      SignInButtonImpl signInButtonImpl = new SignInButtonImpl(context);
      signInButtonImpl.a(context.getResources(), paramInt2, paramInt1);
      this.d = (View)signInButtonImpl;
    } 
    addView(this.d);
    this.d.setEnabled(isEnabled());
    this.d.setOnClickListener(this);
  }
  
  @Deprecated
  public final void setStyle(int paramInt1, int paramInt2, Scope[] paramArrayOfScope) {
    setStyle(paramInt1, paramInt2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/SignInButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */