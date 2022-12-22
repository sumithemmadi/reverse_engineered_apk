package com.google.android.exoplayer2.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import com.google.android.exoplayer2.text.a;
import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.text.j;
import com.google.android.exoplayer2.util.h0;
import java.util.ArrayList;
import java.util.List;

public final class SubtitleView extends View implements j {
  private final List<l> b = new ArrayList<l>();
  
  private List<b> c;
  
  private int d = 0;
  
  private float e = 0.0533F;
  
  private boolean f = true;
  
  private boolean g = true;
  
  private a h = a.a;
  
  private float i = 0.08F;
  
  public SubtitleView(Context paramContext) {
    this(paramContext, null);
  }
  
  public SubtitleView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  @TargetApi(19)
  private boolean a() {
    return ((CaptioningManager)getContext().getSystemService("captioning")).isEnabled();
  }
  
  private float b(b paramb, int paramInt1, int paramInt2) {
    int i = paramb.o;
    if (i != Integer.MIN_VALUE) {
      float f = paramb.p;
      if (f != -3.4028235E38F)
        return Math.max(c(i, f, paramInt1, paramInt2), 0.0F); 
    } 
    return 0.0F;
  }
  
  private float c(int paramInt1, float paramFloat, int paramInt2, int paramInt3) {
    if (paramInt1 != 0) {
      if (paramInt1 != 1)
        return (paramInt1 != 2) ? -3.4028235E38F : paramFloat; 
      float f1 = paramInt2;
      return paramFloat * f1;
    } 
    float f = paramInt3;
    return paramFloat * f;
  }
  
  private void d(int paramInt, float paramFloat) {
    if (this.d == paramInt && this.e == paramFloat)
      return; 
    this.d = paramInt;
    this.e = paramFloat;
    invalidate();
  }
  
  @TargetApi(19)
  private float getUserCaptionFontScaleV19() {
    return ((CaptioningManager)getContext().getSystemService("captioning")).getFontScale();
  }
  
  @TargetApi(19)
  private a getUserCaptionStyleV19() {
    return a.a(((CaptioningManager)getContext().getSystemService("captioning")).getUserStyle());
  }
  
  public void dispatchDraw(Canvas paramCanvas) {
    List<b> list = this.c;
    if (list != null && !list.isEmpty()) {
      int i = getHeight();
      int k = getPaddingLeft();
      int m = getPaddingTop();
      int n = getWidth() - getPaddingRight();
      int i1 = i - getPaddingBottom();
      if (i1 > m && n > k) {
        int i2 = i1 - m;
        float f = c(this.d, this.e, i, i2);
        if (f <= 0.0F)
          return; 
        int i3 = list.size();
        for (byte b = 0; b < i3; b++) {
          b b1 = list.get(b);
          float f1 = b(b1, i, i2);
          ((l)this.b.get(b)).b(b1, this.f, this.g, this.h, f, f1, this.i, paramCanvas, k, m, n, i1);
        } 
      } 
    } 
  }
  
  public void h(List<b> paramList) {
    setCues(paramList);
  }
  
  public void setApplyEmbeddedFontSizes(boolean paramBoolean) {
    if (this.g == paramBoolean)
      return; 
    this.g = paramBoolean;
    invalidate();
  }
  
  public void setApplyEmbeddedStyles(boolean paramBoolean) {
    if (this.f == paramBoolean && this.g == paramBoolean)
      return; 
    this.f = paramBoolean;
    this.g = paramBoolean;
    invalidate();
  }
  
  public void setBottomPaddingFraction(float paramFloat) {
    if (this.i == paramFloat)
      return; 
    this.i = paramFloat;
    invalidate();
  }
  
  public void setCues(List<b> paramList) {
    int i;
    if (this.c == paramList)
      return; 
    this.c = paramList;
    if (paramList == null) {
      i = 0;
    } else {
      i = paramList.size();
    } 
    while (this.b.size() < i)
      this.b.add(new l(getContext())); 
    invalidate();
  }
  
  public void setFixedTextSize(int paramInt, float paramFloat) {
    Resources resources;
    Context context = getContext();
    if (context == null) {
      resources = Resources.getSystem();
    } else {
      resources = resources.getResources();
    } 
    d(2, TypedValue.applyDimension(paramInt, paramFloat, resources.getDisplayMetrics()));
  }
  
  public void setFractionalTextSize(float paramFloat) {
    setFractionalTextSize(paramFloat, false);
  }
  
  public void setFractionalTextSize(float paramFloat, boolean paramBoolean) {
    d(paramBoolean, paramFloat);
  }
  
  public void setStyle(a parama) {
    if (this.h == parama)
      return; 
    this.h = parama;
    invalidate();
  }
  
  public void setUserDefaultStyle() {
    a a1;
    if (h0.a >= 19 && a() && !isInEditMode()) {
      a1 = getUserCaptionStyleV19();
    } else {
      a1 = a.a;
    } 
    setStyle(a1);
  }
  
  public void setUserDefaultTextSize() {
    float f;
    if (h0.a >= 19 && !isInEditMode()) {
      f = getUserCaptionFontScaleV19();
    } else {
      f = 1.0F;
    } 
    setFractionalTextSize(f * 0.0533F);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/ui/SubtitleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */