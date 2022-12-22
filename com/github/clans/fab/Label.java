package com.github.clans.fab;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.widget.TextView;

public class Label extends TextView {
  private static final Xfermode b = (Xfermode)new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
  
  private int c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private Drawable g;
  
  private boolean h = true;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private FloatingActionButton o;
  
  private Animation p;
  
  private Animation q;
  
  private boolean r;
  
  private boolean s = true;
  
  GestureDetector t = new GestureDetector(getContext(), (GestureDetector.OnGestureListener)new b(this));
  
  public Label(Context paramContext) {
    super(paramContext);
  }
  
  public Label(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public Label(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private int k() {
    if (this.j == 0)
      this.j = getMeasuredHeight(); 
    return getMeasuredHeight() + m();
  }
  
  private int l() {
    if (this.i == 0)
      this.i = getMeasuredWidth(); 
    return getMeasuredWidth() + n();
  }
  
  @TargetApi(21)
  private Drawable o() {
    RippleDrawable rippleDrawable;
    StateListDrawable stateListDrawable = new StateListDrawable();
    Drawable drawable = p(this.l);
    stateListDrawable.addState(new int[] { 16842919 }, drawable);
    drawable = p(this.k);
    stateListDrawable.addState(new int[0], drawable);
    if (a.c()) {
      int i = this.m;
      rippleDrawable = new RippleDrawable(new ColorStateList(new int[][] { {} }, new int[] { i }), (Drawable)stateListDrawable, null);
      setOutlineProvider(new a(this));
      setClipToOutline(true);
      this.g = (Drawable)rippleDrawable;
      return (Drawable)rippleDrawable;
    } 
    this.g = (Drawable)rippleDrawable;
    return (Drawable)rippleDrawable;
  }
  
  private Drawable p(int paramInt) {
    int i = this.n;
    ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)new RoundRectShape(new float[] { i, i, i, i, i, i, i, i }, null, null));
    shapeDrawable.getPaint().setColor(paramInt);
    return (Drawable)shapeDrawable;
  }
  
  @TargetApi(21)
  private void setBackgroundCompat(Drawable paramDrawable) {
    if (a.b()) {
      setBackground(paramDrawable);
    } else {
      setBackgroundDrawable(paramDrawable);
    } 
  }
  
  private void setShadow(FloatingActionButton paramFloatingActionButton) {
    this.f = paramFloatingActionButton.getShadowColor();
    this.c = paramFloatingActionButton.getShadowRadius();
    this.d = paramFloatingActionButton.getShadowXOffset();
    this.e = paramFloatingActionButton.getShadowYOffset();
    this.h = paramFloatingActionButton.t();
  }
  
  private void u() {
    if (this.q != null) {
      this.p.cancel();
      startAnimation(this.q);
    } 
  }
  
  private void v() {
    if (this.p != null) {
      this.q.cancel();
      startAnimation(this.p);
    } 
  }
  
  int m() {
    boolean bool;
    if (this.h) {
      bool = this.c + Math.abs(this.e);
    } else {
      bool = false;
    } 
    return bool;
  }
  
  int n() {
    boolean bool;
    if (this.h) {
      bool = this.c + Math.abs(this.d);
    } else {
      bool = false;
    } 
    return bool;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    setMeasuredDimension(l(), k());
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    FloatingActionButton floatingActionButton = this.o;
    if (floatingActionButton == null || floatingActionButton.getOnClickListener() == null || !this.o.isEnabled())
      return super.onTouchEvent(paramMotionEvent); 
    int i = paramMotionEvent.getAction();
    if (i != 1) {
      if (i == 3) {
        t();
        this.o.A();
      } 
    } else {
      t();
      this.o.A();
    } 
    this.t.onTouchEvent(paramMotionEvent);
    return super.onTouchEvent(paramMotionEvent);
  }
  
  void q(boolean paramBoolean) {
    if (paramBoolean)
      u(); 
    setVisibility(4);
  }
  
  boolean r() {
    return this.s;
  }
  
  @TargetApi(21)
  void s() {
    if (this.r)
      this.g = getBackground(); 
    Drawable drawable = this.g;
    if (drawable instanceof StateListDrawable) {
      ((StateListDrawable)drawable).setState(new int[] { 16842919 });
    } else if (a.c()) {
      drawable = this.g;
      if (drawable instanceof RippleDrawable) {
        RippleDrawable rippleDrawable = (RippleDrawable)drawable;
        rippleDrawable.setState(new int[] { 16842910, 16842919 });
        rippleDrawable.setHotspot((getMeasuredWidth() / 2), (getMeasuredHeight() / 2));
        rippleDrawable.setVisible(true, true);
      } 
    } 
  }
  
  void setCornerRadius(int paramInt) {
    this.n = paramInt;
  }
  
  void setFab(FloatingActionButton paramFloatingActionButton) {
    this.o = paramFloatingActionButton;
    setShadow(paramFloatingActionButton);
  }
  
  void setHandleVisibilityChanges(boolean paramBoolean) {
    this.s = paramBoolean;
  }
  
  void setHideAnimation(Animation paramAnimation) {
    this.q = paramAnimation;
  }
  
  void setShowAnimation(Animation paramAnimation) {
    this.p = paramAnimation;
  }
  
  void setShowShadow(boolean paramBoolean) {
    this.h = paramBoolean;
  }
  
  void setUsingStyle(boolean paramBoolean) {
    this.r = paramBoolean;
  }
  
  @TargetApi(21)
  void t() {
    if (this.r)
      this.g = getBackground(); 
    Drawable drawable = this.g;
    if (drawable instanceof StateListDrawable) {
      ((StateListDrawable)drawable).setState(new int[0]);
    } else if (a.c()) {
      drawable = this.g;
      if (drawable instanceof RippleDrawable) {
        RippleDrawable rippleDrawable = (RippleDrawable)drawable;
        rippleDrawable.setState(new int[0]);
        rippleDrawable.setHotspot((getMeasuredWidth() / 2), (getMeasuredHeight() / 2));
        rippleDrawable.setVisible(true, true);
      } 
    } 
  }
  
  void w(int paramInt1, int paramInt2, int paramInt3) {
    this.k = paramInt1;
    this.l = paramInt2;
    this.m = paramInt3;
  }
  
  void x(boolean paramBoolean) {
    if (paramBoolean)
      v(); 
    setVisibility(0);
  }
  
  void y() {
    LayerDrawable layerDrawable;
    if (this.h) {
      layerDrawable = new LayerDrawable(new Drawable[] { new c(null), o() });
      layerDrawable.setLayerInset(1, this.c + Math.abs(this.d), this.c + Math.abs(this.e), this.c + Math.abs(this.d), this.c + Math.abs(this.e));
    } else {
      layerDrawable = new LayerDrawable(new Drawable[] { o() });
    } 
    setBackgroundCompat((Drawable)layerDrawable);
  }
  
  class a extends ViewOutlineProvider {
    a(Label this$0) {}
    
    public void getOutline(View param1View, Outline param1Outline) {
      param1Outline.setOval(0, 0, param1View.getWidth(), param1View.getHeight());
    }
  }
  
  class b extends GestureDetector.SimpleOnGestureListener {
    b(Label this$0) {}
    
    public boolean onDown(MotionEvent param1MotionEvent) {
      this.b.s();
      if (Label.a(this.b) != null)
        Label.a(this.b).z(); 
      return super.onDown(param1MotionEvent);
    }
    
    public boolean onSingleTapUp(MotionEvent param1MotionEvent) {
      this.b.t();
      if (Label.a(this.b) != null)
        Label.a(this.b).A(); 
      return super.onSingleTapUp(param1MotionEvent);
    }
  }
  
  private class c extends Drawable {
    private Paint a = new Paint(1);
    
    private Paint b = new Paint(1);
    
    private c(Label this$0) {
      a();
    }
    
    private void a() {
      this.c.setLayerType(1, null);
      this.a.setStyle(Paint.Style.FILL);
      this.a.setColor(Label.c(this.c));
      this.b.setXfermode(Label.d());
      if (!this.c.isInEditMode())
        this.a.setShadowLayer(Label.e(this.c), Label.f(this.c), Label.g(this.c), Label.h(this.c)); 
    }
    
    public void draw(Canvas param1Canvas) {
      RectF rectF = new RectF((Label.e(this.c) + Math.abs(Label.f(this.c))), (Label.e(this.c) + Math.abs(Label.g(this.c))), Label.i(this.c), Label.j(this.c));
      param1Canvas.drawRoundRect(rectF, Label.b(this.c), Label.b(this.c), this.a);
      param1Canvas.drawRoundRect(rectF, Label.b(this.c), Label.b(this.c), this.b);
    }
    
    public int getOpacity() {
      return 0;
    }
    
    public void setAlpha(int param1Int) {}
    
    public void setColorFilter(ColorFilter param1ColorFilter) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/clans/fab/Label.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */