package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.core.graphics.drawable.a;
import c.c.a.a.a.a;
import c.c.a.a.a.b;
import c.c.a.a.a.c;
import com.google.android.gms.common.util.i;

public final class SignInButtonImpl extends Button {
  public SignInButtonImpl(Context paramContext) {
    this(paramContext, null);
  }
  
  public SignInButtonImpl(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 16842824);
  }
  
  private static int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt1 != 0) {
      if (paramInt1 != 1) {
        if (paramInt1 == 2)
          return paramInt4; 
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("Unknown color scheme: ");
        stringBuilder.append(paramInt1);
        throw new IllegalStateException(stringBuilder.toString());
      } 
      return paramInt3;
    } 
    return paramInt2;
  }
  
  public final void a(Resources paramResources, int paramInt1, int paramInt2) {
    StringBuilder stringBuilder;
    setTypeface(Typeface.DEFAULT_BOLD);
    setTextSize(14.0F);
    int i = (int)((paramResources.getDisplayMetrics()).density * 48.0F + 0.5F);
    setMinHeight(i);
    setMinWidth(i);
    i = b.common_google_signin_btn_icon_dark;
    int j = b.common_google_signin_btn_icon_light;
    i = b(paramInt2, i, j, j);
    j = b.common_google_signin_btn_text_dark;
    int k = b.common_google_signin_btn_text_light;
    j = b(paramInt2, j, k, k);
    if (paramInt1 != 0 && paramInt1 != 1) {
      if (paramInt1 != 2) {
        stringBuilder = new StringBuilder(32);
        stringBuilder.append("Unknown button size: ");
        stringBuilder.append(paramInt1);
        throw new IllegalStateException(stringBuilder.toString());
      } 
    } else {
      i = j;
    } 
    Drawable drawable = a.r(stringBuilder.getDrawable(i));
    a.o(drawable, stringBuilder.getColorStateList(a.common_google_signin_btn_tint));
    a.p(drawable, PorterDuff.Mode.SRC_ATOP);
    setBackgroundDrawable(drawable);
    i = a.common_google_signin_btn_text_dark;
    j = a.common_google_signin_btn_text_light;
    setTextColor(t.<ColorStateList>j(stringBuilder.getColorStateList(b(paramInt2, i, j, j))));
    if (paramInt1 != 0) {
      if (paramInt1 != 1) {
        if (paramInt1 == 2) {
          setText(null);
        } else {
          stringBuilder = new StringBuilder(32);
          stringBuilder.append("Unknown button size: ");
          stringBuilder.append(paramInt1);
          throw new IllegalStateException(stringBuilder.toString());
        } 
      } else {
        setText(stringBuilder.getString(c.common_signin_button_text_long));
      } 
    } else {
      setText(stringBuilder.getString(c.common_signin_button_text));
    } 
    setTransformationMethod(null);
    if (i.d(getContext()))
      setGravity(19); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/SignInButtonImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */