package com.github.jdsjlzx.progressindicator;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import c.b.a.e;
import c.b.a.f;
import com.github.jdsjlzx.progressindicator.indicators.BallPulseIndicator;

public class AVLoadingIndicatorView extends View {
  private static final BallPulseIndicator b = new BallPulseIndicator();
  
  private long c = -1L;
  
  private boolean d = false;
  
  private boolean e = false;
  
  private boolean f = false;
  
  private final Runnable g = new a(this);
  
  private final Runnable h = new b(this);
  
  int i;
  
  int j;
  
  int k;
  
  int l;
  
  private a m;
  
  private int n;
  
  private boolean o;
  
  public AVLoadingIndicatorView(Context paramContext) {
    super(paramContext);
    f(paramContext, null, 0, 0);
  }
  
  public AVLoadingIndicatorView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    f(paramContext, paramAttributeSet, 0, e.AVLoadingIndicatorView1);
  }
  
  public AVLoadingIndicatorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    f(paramContext, paramAttributeSet, paramInt, e.AVLoadingIndicatorView1);
  }
  
  private void f(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    this.i = 24;
    this.j = 48;
    this.k = 24;
    this.l = 48;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, f.AVLoadingIndicatorView1, paramInt1, paramInt2);
    this.i = typedArray.getDimensionPixelSize(f.AVLoadingIndicatorView1_minWidth, this.i);
    this.j = typedArray.getDimensionPixelSize(f.AVLoadingIndicatorView1_maxWidth, this.j);
    this.k = typedArray.getDimensionPixelSize(f.AVLoadingIndicatorView1_minHeight, this.k);
    this.l = typedArray.getDimensionPixelSize(f.AVLoadingIndicatorView1_maxHeight, this.l);
    String str = typedArray.getString(f.AVLoadingIndicatorView1_indicatorName1);
    this.n = typedArray.getColor(f.AVLoadingIndicatorView1_indicatorColor1, getResources().getColor(c.b.a.a.colorAccent));
    setIndicator(str);
    if (this.m == null)
      setIndicator((a)b); 
    typedArray.recycle();
  }
  
  private void g() {
    removeCallbacks(this.g);
    removeCallbacks(this.h);
  }
  
  private void j(int paramInt1, int paramInt2) {
    int i = paramInt1 - getPaddingRight() + getPaddingLeft();
    int j = paramInt2 - getPaddingTop() + getPaddingBottom();
    a a1 = this.m;
    if (a1 != null) {
      paramInt2 = a1.getIntrinsicWidth();
      paramInt1 = this.m.getIntrinsicHeight();
      float f1 = paramInt2 / paramInt1;
      float f2 = i;
      float f3 = j;
      float f4 = f2 / f3;
      int k = 0;
      paramInt1 = 0;
      paramInt2 = i;
      if (f1 != f4)
        if (f4 > f1) {
          k = (int)(f3 * f1);
          paramInt2 = (i - k) / 2;
          paramInt1 = paramInt2;
          paramInt2 = k + paramInt2;
        } else {
          int m = (int)(f2 * 1.0F / f1);
          paramInt2 = (j - m) / 2;
          paramInt1 = paramInt2;
          m += paramInt2;
          j = k;
          paramInt2 = i;
          i = m;
          this.m.setBounds(j, paramInt1, paramInt2, i);
        }  
      k = 0;
      i = j;
      j = paramInt1;
      paramInt1 = k;
    } else {
      return;
    } 
    this.m.setBounds(j, paramInt1, paramInt2, i);
  }
  
  private void k() {
    int[] arrayOfInt = getDrawableState();
    a a1 = this.m;
    if (a1 != null && a1.isStateful())
      this.m.setState(arrayOfInt); 
  }
  
  @TargetApi(21)
  public void drawableHotspotChanged(float paramFloat1, float paramFloat2) {
    super.drawableHotspotChanged(paramFloat1, paramFloat2);
    a a1 = this.m;
    if (a1 != null)
      a1.setHotspot(paramFloat1, paramFloat2); 
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    k();
  }
  
  void e(Canvas paramCanvas) {
    a a1 = this.m;
    if (a1 != null) {
      int i = paramCanvas.save();
      paramCanvas.translate(getPaddingLeft(), getPaddingTop());
      a1.draw(paramCanvas);
      paramCanvas.restoreToCount(i);
      if (this.o) {
        a1.start();
        this.o = false;
      } 
    } 
  }
  
  public a getIndicator() {
    return this.m;
  }
  
  void h() {
    if (getVisibility() != 0)
      return; 
    if (this.m instanceof android.graphics.drawable.Animatable)
      this.o = true; 
    postInvalidate();
  }
  
  void i() {
    a a1 = this.m;
    if (a1 instanceof android.graphics.drawable.Animatable) {
      a1.stop();
      this.o = false;
    } 
    postInvalidate();
  }
  
  public void invalidateDrawable(Drawable paramDrawable) {
    Rect rect;
    if (verifyDrawable(paramDrawable)) {
      rect = paramDrawable.getBounds();
      int i = getScrollX() + getPaddingLeft();
      int j = getScrollY() + getPaddingTop();
      invalidate(rect.left + i, rect.top + j, rect.right + i, rect.bottom + j);
    } else {
      super.invalidateDrawable((Drawable)rect);
    } 
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    h();
    g();
  }
  
  protected void onDetachedFromWindow() {
    i();
    super.onDetachedFromWindow();
    g();
  }
  
  protected void onDraw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial onDraw : (Landroid/graphics/Canvas;)V
    //   7: aload_0
    //   8: aload_1
    //   9: invokevirtual e : (Landroid/graphics/Canvas;)V
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield m : Lcom/github/jdsjlzx/progressindicator/a;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnull -> 54
    //   11: aload_0
    //   12: getfield i : I
    //   15: aload_0
    //   16: getfield j : I
    //   19: aload_3
    //   20: invokevirtual getIntrinsicWidth : ()I
    //   23: invokestatic min : (II)I
    //   26: invokestatic max : (II)I
    //   29: istore #4
    //   31: aload_0
    //   32: getfield k : I
    //   35: aload_0
    //   36: getfield l : I
    //   39: aload_3
    //   40: invokevirtual getIntrinsicHeight : ()I
    //   43: invokestatic min : (II)I
    //   46: invokestatic max : (II)I
    //   49: istore #5
    //   51: goto -> 60
    //   54: iconst_0
    //   55: istore #5
    //   57: iconst_0
    //   58: istore #4
    //   60: aload_0
    //   61: invokespecial k : ()V
    //   64: aload_0
    //   65: invokevirtual getPaddingLeft : ()I
    //   68: istore #6
    //   70: aload_0
    //   71: invokevirtual getPaddingRight : ()I
    //   74: istore #7
    //   76: aload_0
    //   77: invokevirtual getPaddingTop : ()I
    //   80: istore #8
    //   82: aload_0
    //   83: invokevirtual getPaddingBottom : ()I
    //   86: istore #9
    //   88: aload_0
    //   89: iload #4
    //   91: iload #6
    //   93: iload #7
    //   95: iadd
    //   96: iadd
    //   97: iload_1
    //   98: iconst_0
    //   99: invokestatic resolveSizeAndState : (III)I
    //   102: iload #5
    //   104: iload #8
    //   106: iload #9
    //   108: iadd
    //   109: iadd
    //   110: iload_2
    //   111: iconst_0
    //   112: invokestatic resolveSizeAndState : (III)I
    //   115: invokevirtual setMeasuredDimension : (II)V
    //   118: aload_0
    //   119: monitorexit
    //   120: return
    //   121: astore_3
    //   122: aload_0
    //   123: monitorexit
    //   124: aload_3
    //   125: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	121	finally
    //   11	51	121	finally
    //   60	118	121	finally
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    j(paramInt1, paramInt2);
  }
  
  protected void onVisibilityChanged(View paramView, int paramInt) {
    super.onVisibilityChanged(paramView, paramInt);
    if (paramInt == 8 || paramInt == 4) {
      i();
      return;
    } 
    h();
  }
  
  public void setIndicator(a parama) {
    a a1 = this.m;
    if (a1 != parama) {
      if (a1 != null) {
        a1.setCallback(null);
        unscheduleDrawable(this.m);
      } 
      this.m = parama;
      setIndicatorColor(this.n);
      if (parama != null)
        parama.setCallback((Drawable.Callback)this); 
      postInvalidate();
    } 
  }
  
  public void setIndicator(String paramString) {
    if (TextUtils.isEmpty(paramString))
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    if (!paramString.contains(".")) {
      stringBuilder.append(getClass().getPackage().getName());
      stringBuilder.append(".indicators");
      stringBuilder.append(".");
    } 
    stringBuilder.append(paramString);
    try {
      setIndicator((a)Class.forName(stringBuilder.toString()).newInstance());
    } catch (ClassNotFoundException classNotFoundException) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Didn't find your class , check the name again !");
      stringBuilder1.append(paramString);
      Log.e("AVLoadingIndicatorView", stringBuilder1.toString());
    } catch (InstantiationException instantiationException) {
      instantiationException.printStackTrace();
    } catch (IllegalAccessException illegalAccessException) {
      illegalAccessException.printStackTrace();
    } 
  }
  
  public void setIndicatorColor(int paramInt) {
    this.n = paramInt;
    this.m.setColor(paramInt);
  }
  
  public void setIndicatorId(int paramInt) {
    String str1 = "BallPulseIndicator";
    String str2 = str1;
    switch (paramInt) {
      default:
        str2 = str1;
        break;
      case 27:
        str2 = "SemiCircleSpinIndicator";
        break;
      case 26:
        str2 = "BallGridBeatIndicator";
        break;
      case 25:
        str2 = "PacmanIndicator";
        break;
      case 24:
        str2 = "TriangleSkewSpinIndicator";
        break;
      case 23:
        str2 = "LineSpinFadeLoaderIndicator";
        break;
      case 22:
        str2 = "BallSpinFadeLoaderIndicator";
        break;
      case 21:
        str2 = "BallScaleRippleMultipleIndicator";
        break;
      case 20:
        str2 = "BallScaleRippleIndicator";
        break;
      case 19:
        str2 = "LineScalePulseOutRapidIndicator";
        break;
      case 18:
        str2 = "LineScalePulseOutIndicator";
        break;
      case 17:
        str2 = "BallBeatIndicator";
        break;
      case 16:
        str2 = "BallPulseSyncIndicator";
        break;
      case 15:
        str2 = "BallScaleMultipleIndicator";
        break;
      case 14:
        str2 = "LineScalePartyIndicator";
        break;
      case 13:
        str2 = "LineScaleIndicator";
        break;
      case 12:
        str2 = "BallScaleIndicator";
        break;
      case 11:
        str2 = "BallTrianglePathIndicator";
        break;
      case 10:
        str2 = "BallZigZagDeflectIndicator";
        break;
      case 9:
        str2 = "BallZigZagIndicator";
        break;
      case 8:
        str2 = "CubeTransitionIndicator";
        break;
      case 7:
        str2 = "BallRotateIndicator";
        break;
      case 6:
        str2 = "BallPulseRiseIndicator";
        break;
      case 5:
        str2 = "BallClipRotateMultipleIndicator";
        break;
      case 4:
        str2 = "SquareSpinIndicator";
        break;
      case 3:
        str2 = "BallClipRotatePulseIndicator";
        break;
      case 2:
        str2 = "BallClipRotateIndicator";
        break;
      case 1:
        str2 = "BallGridPulseIndicator";
        break;
      case 0:
        break;
    } 
    setIndicator(str2);
  }
  
  public void setVisibility(int paramInt) {
    if (getVisibility() != paramInt) {
      super.setVisibility(paramInt);
      if (paramInt == 8 || paramInt == 4) {
        i();
        return;
      } 
      h();
    } 
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable) {
    return (paramDrawable == this.m || super.verifyDrawable(paramDrawable));
  }
  
  class a implements Runnable {
    a(AVLoadingIndicatorView this$0) {}
    
    public void run() {
      AVLoadingIndicatorView.a(this.b, false);
      AVLoadingIndicatorView.b(this.b, -1L);
      this.b.setVisibility(8);
    }
  }
  
  class b implements Runnable {
    b(AVLoadingIndicatorView this$0) {}
    
    public void run() {
      AVLoadingIndicatorView.c(this.b, false);
      if (!AVLoadingIndicatorView.d(this.b)) {
        AVLoadingIndicatorView.b(this.b, System.currentTimeMillis());
        this.b.setVisibility(0);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/progressindicator/AVLoadingIndicatorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */